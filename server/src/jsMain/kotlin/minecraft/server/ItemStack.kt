@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Defines a collection of items.
 * @since 1.2.0
 */
public open external class ItemStack {
    /**
     * Number of the items in the stack. Valid values range between
     * 1-255. The provided value will be clamped to the item's
     * maximum stack size.
     *
     * @throws Error
     * Throws if the value is outside the range of 1-255.
     * @since 1.2.0
     */
    public open val amount: Int

    /**
     * Returns whether the item is stackable. An item is considered
     * stackable if the item's maximum stack size is greater than 1
     * and the item does not contain any custom data or properties.
     * @since 1.2.0
     */
    public open val isStackable: Boolean

    /**
     * Gets or sets whether the item is kept on death.
     * @since 1.2.0
     */
    public open val keepOnDeath: Boolean

    /**
     * Gets or sets the item's lock mode. The default value is
     * `ItemLockMode.none`.
     * @since 1.2.0
     */
    public open val lockMode: ItemLockMode

    /**
     * The maximum stack size. This value varies depending on the
     * type of item. For example, torches have a maximum stack size
     * of 64, while eggs have a maximum stack size of 16.
     * @since 1.2.0
     */
    public open val maxAmount: Int

    /**
     * Given name of this stack of items. The name tag is displayed
     * when hovering over the item. Setting the name tag to an
     * empty string or `undefined` will remove the name tag.
     *
     * @throws Error
     * Throws if the length exceeds 255 characters.
     * @since 1.2.0
     */
    public open val nameTag: String?

    /**
     * The type of the item.
     * @since 1.2.0
     */
    public open val type: ItemType

    /**
     * Identifier of the type of items for the stack. If a
     * namespace is not specified, 'minecraft:' is assumed.
     * Examples include 'wheat' or 'apple'.
     * @since 1.2.0
     */
    public open val typeId: String

    /**
     * Creates a new instance of a stack of items for use in the
     * world.
     *
     * @param itemType
     * Type of item to create. See the [MinecraftItemTypes]
     * enumeration for a list of standard item types in Minecraft
     * experiences.
     * @param amount
     * Number of items to place in the stack, between 1-255. The
     * provided value will be clamped to the item's maximum stack
     * size. Note that certain items can only have one item in the
     * stack.
     * @throws Error
     * Throws if `itemType` is invalid, or if `amount` is outside
     * the range of 1-255.
     * @since 1.2.0
     */
    public constructor(itemType: ItemType, amount: Int? = definedExternally)


    /**
     * Creates a new instance of a stack of items for use in the
     * world.
     *
     * @param itemType
     * Type of item to create. See the [MinecraftItemTypes]
     * enumeration for a list of standard item types in Minecraft
     * experiences.
     * @param amount
     * Number of items to place in the stack, between 1-255. The
     * provided value will be clamped to the item's maximum stack
     * size. Note that certain items can only have one item in the
     * stack.
     * @throws Error
     * Throws if `itemType` is invalid, or if `amount` is outside
     * the range of 1-255.
     * @since 1.2.0
     */
    public constructor(itemType: String, amount: Int? = definedExternally)


    /**
     * Gets a component (that represents additional capabilities)
     * for an item stack.
     * @param componentId
     * The identifier of the component (e.g., 'minecraft:food') to
     * retrieve. If no namespace prefix is specified, 'minecraft:'
     * is assumed. If the component is not present on the item
     * stack, undefined is returned.
     * @since 1.2.0
     */
    public open fun getComponent(componentId: String): ItemComponent?

    /**
     * Returns all components that are both present on this item
     * stack and supported by the API.
     * @since 1.2.0
     */
    public open fun getComponents(): Array<ItemComponent>

    /**
     * Returns true if the specified component is present on this
     * item stack.
     * @param componentId
     * The identifier of the component (e.g., 'minecraft:food') to
     * retrieve. If no namespace prefix is specified, 'minecraft:'
     * is assumed.
     * @since 1.2.0
     */
    public open fun hasComponent(componentId: String): Boolean

    /**
     * Returns whether this item stack can be stacked with the
     * given `itemStack`. This is determined by comparing the item
     * type and any custom data and properties associated with the
     * item stacks. The amount of each item stack is not taken into
     * consideration.
     * @since 1.2.0
     */
    public open fun isStackableWith(itemStack: ItemStack): Boolean
}
