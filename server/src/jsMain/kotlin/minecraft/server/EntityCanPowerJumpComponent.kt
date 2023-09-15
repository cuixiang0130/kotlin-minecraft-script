@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this component signifies that the entity can
 * power jump like the horse does within Minecraft.
 * @since 1.2.0
 */
public open external class EntityCanPowerJumpComponent protected constructor() : EntityComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:can_power_jump.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:can_power_jump" */
    }
}
