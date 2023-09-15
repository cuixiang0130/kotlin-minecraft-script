@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Represents a container that can hold sets of items. Used
 * with entities such as Players, Chest Minecarts, Llamas, and
 * more.
 * @since 1.2.0
 */
public open external class Container protected constructor() {
    /**
     * Count of the slots in the container that are empty.
     *
     * @throws Error
     * Throws if the container is invalid.
     * @since 1.2.0
     */
    public open val emptySlotsCount: Int

    /**
     * The number of slots in this container. For example, a
     * standard single-block chest has a size of 27. Note, a
     * player's inventory container contains a total of 36 slots, 9
     * hotbar slots plus 27 inventory slots.
     *
     * @throws Error
     * Throws if the container is invalid.
     * @since 1.2.0
     */
    public open val size: Int

    /**
     * Adds an item to the container. The item is placed in the
     * first available slot(s) and can be stacked with existing
     * items of the same type. Note, use [Container.setItem]
     * if you wish to set the item in a particular slot.
     * This function can't be called in read-only mode.
     * @param itemStack
     * The stack of items to add.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun addItem(itemStack: ItemStack): ItemStack

    /**
     * Clears all inventory items in the container.
     * This function can't be called in read-only mode.
     * @throws Error
     * Throws if the container is invalid.
     * @since 1.2.0
     */
    public open fun clearAll()

    /**
     * Gets an [ItemStack] of the item at the specified slot.
     * If the slot is empty, returns `undefined`. This method does
     * not change or clear the contents of the specified slot. To
     * get a reference to a particular slot, see [Container.getSlot].
     * @param slot
     * Zero-based index of the slot to retrieve items from.
     * @throws Error
     * Throws if the container is invalid or if the `slot` index is
     * out of bounds.
     * @since 1.2.0
     */
    public open fun getItem(slot: Int): ItemStack?

    /**
     * Moves an item from one slot to another, potentially across
     * containers.
     * This function can't be called in read-only mode.
     * @param fromSlot
     * Zero-based index of the slot to transfer an item from, on
     * this container.
     * @param toSlot
     * Zero-based index of the slot to transfer an item to, on
     * `toContainer`.
     * @param toContainer
     * Target container to transfer to. Note this can be the same
     * container as the source.
     * @throws Error
     * Throws if either this container or `toContainer` are invalid
     * or if the `fromSlot` or `toSlot` indices out of bounds.
     * @since 1.2.0
     */
    public open fun moveItem(fromSlot: Int, toSlot: Int, toContainer: Container)

    /**
     * Sets an item stack within a particular slot.
     * This function can't be called in read-only mode.
     * @param slot
     * Zero-based index of the slot to set an item at.
     * @param itemStack
     * Stack of items to place within the specified slot. Setting
     * `itemStack` to undefined will clear the slot.
     * @throws Error
     * Throws if the container is invalid or if the `slot` index is
     * out of bounds.
     * @since 1.2.0
     */
    public open fun setItem(slot: Int, itemStack: ItemStack? = definedExternally)

    /**
     * Swaps items between two different slots within containers.
     * This function can't be called in read-only mode.
     * @param slot
     * Zero-based index of the slot to swap from this container.
     * @param otherSlot
     * Zero-based index of the slot to swap with.
     * @param otherContainer
     * Target container to swap with. Note this can be the same
     * container as this source.
     * @throws Error
     * Throws if either this container or `otherContainer` are
     * invalid or if the `slot` or `otherSlot` are out of bounds.
     * @since 1.2.0
     */
    public open fun swapItems(slot: Int, otherSlot: Int, otherContainer: Container)

    /**
     * Moves an item from one slot to another container, or to the
     * first available slot in the same container.
     * This function can't be called in read-only mode.
     * @param fromSlot
     * Zero-based index of the slot to transfer an item from, on
     * this container.
     * @param toContainer
     * Target container to transfer to. Note this can be the same
     * container as the source.
     * @throws Error
     * Throws if either this container or `toContainer` are invalid
     * or if the `fromSlot` or `toSlot` indices out of bounds.
     * @since 1.2.0
     */
    public open fun transferItem(fromSlot: Int, toContainer: Container): ItemStack
}
