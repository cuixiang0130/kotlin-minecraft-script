@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this component signifies that this entity
 * doesn't take damage from fire.
 * @since 1.2.0
 */
public open external class EntityFireImmuneComponent protected constructor() : EntityComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:fire_immune.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:fire_immune" */
    }
}
