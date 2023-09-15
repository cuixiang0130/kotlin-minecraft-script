@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Sets the offset from the ground that the entity is actually
 * at.
 * @since 1.2.0
 */
public open external class EntityGroundOffsetComponent protected constructor() : EntityComponent {
    /**
     * This property can't be edited in read-only mode.
     * @since 1.2.0
     */
    public open var value: Float

    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:ground_offset.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:ground_offset" */
    }
}
