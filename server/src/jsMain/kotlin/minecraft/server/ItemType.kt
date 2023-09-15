@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Represents the type of an item - for example, Wool.
 * @since 1.2.0
 */
public open external class ItemType protected constructor() {
    /**
     * Returns the identifier of the item type - for example,
     * 'minecraft:apple'.
     * @since 1.2.0
     */
    public open val id: String
}
