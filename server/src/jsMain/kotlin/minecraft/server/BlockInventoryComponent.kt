@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Represents the inventory of a block in the world. Used with
 * blocks like chests.
 * @since 1.2.0
 */
public open external class BlockInventoryComponent protected constructor() {
    /**
     * The container which holds an [ItemStack].
     *
     * @throws Error This property can throw when used.
     * @since 1.2.0
     */
    public open val container: Container

    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:inventory.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:inventory" */
    }
}
