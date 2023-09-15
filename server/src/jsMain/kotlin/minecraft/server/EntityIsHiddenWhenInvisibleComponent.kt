@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this component signifies that this entity can
 * hide from hostile mobs while invisible.
 * @since 1.2.0
 */
public open external class EntityIsHiddenWhenInvisibleComponent protected constructor() : EntityComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:is_hidden_when_invisible.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:is_hidden_when_invisible" */
    }
}
