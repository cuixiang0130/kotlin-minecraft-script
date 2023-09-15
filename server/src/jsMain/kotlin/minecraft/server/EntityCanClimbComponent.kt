@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this component signifies that the entity can
 * climb up ladders.
 * @since 1.2.0
 */
public open external class EntityCanClimbComponent protected constructor() : EntityComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:can_climb.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:can_climb" */
    }
}
