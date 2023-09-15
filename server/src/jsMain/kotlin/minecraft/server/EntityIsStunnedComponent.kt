@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this component signifies that this entity is
 * currently stunned.
 * @since 1.2.0
 */
public open external class EntityIsStunnedComponent protected constructor() : EntityComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:is_stunned.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:is_stunned" */
    }
}
