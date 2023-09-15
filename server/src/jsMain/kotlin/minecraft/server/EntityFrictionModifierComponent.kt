@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Defines how much friction affects this entity.
 * @since 1.2.0
 */
public open external class EntityFrictionModifierComponent protected constructor() : EntityComponent {
    /**
     * This property can't be edited in read-only mode.
     * @since 1.2.0
     */
    public open var value: Float

    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:friction_modifier.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:friction_modifier" */
    }
}
