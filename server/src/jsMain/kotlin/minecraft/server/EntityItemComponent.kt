@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * If added onto the entity, this indicates that the entity
 * represents a free-floating item in the world. Lets you
 * retrieve the actual item stack contents via the itemStack
 * property.
 * @since 1.2.0
 */
public open external class EntityItemComponent protected constructor() : EntityComponent {
    /**
     * Item stack represented by this entity in the world.
     *
     * @throws Error This property can throw when used.
     * @since 1.2.0
     */
    public open val itemStack: ItemStack

    public companion object {
        /**
         * Identifier of this component.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:item" */
    }
}
