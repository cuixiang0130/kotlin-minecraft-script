@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Sets the distance through which the entity can push through.
 * @since 1.2.0
 */
public open external class EntityScaleComponent protected constructor() : EntityComponent {
    /**
     * This property can't be edited in read-only mode.
     * @since 1.2.0
     */
    public open var value: Float

    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:scale.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:scale" */
    }
}
