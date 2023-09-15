@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this component signifies that this entity is an
 * illager captain.
 * @since 1.2.0
 */
public open external class EntityIsIllagerCaptainComponent protected constructor() : EntityComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:is_illager_captain.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:is_illager_captain" */
    }
}
