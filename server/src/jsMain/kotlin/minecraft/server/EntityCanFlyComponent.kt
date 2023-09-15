@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this component signifies that the entity can
 * fly, and the pathfinder won't be restricted to paths where a
 * solid block is required underneath it.
 * @since 1.2.0
 */
public open external class EntityCanFlyComponent protected constructor() : EntityComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:can_fly.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:can_fly" */
    }
}
