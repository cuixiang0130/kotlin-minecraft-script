@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Represents the flying speed of an entity.
 * @since 1.2.0
 */
public open external class EntityFlyingSpeedComponent protected constructor() : EntityComponent {
    /**
     * This property can't be edited in read-only mode.
     * @since 1.2.0
     */
    public open var value: Float

    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:flying_speed.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:flying_speed" */
    }
}
