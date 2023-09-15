@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this component signifies that this entity wants
 * to become a jockey.
 * @since 1.2.0
 */
public open external class EntityWantsJockeyComponent protected constructor() : EntityComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:wants_jockey.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:wants_jockey" */
    }
}
