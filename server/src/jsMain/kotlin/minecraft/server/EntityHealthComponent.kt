@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Defines the health properties of an entity.
 * @since 1.3.0
 */
public open external class EntityHealthComponent protected constructor() : EntityAttributeComponent {
    public companion object {
        /**
         * @since 1.3.0
         */
        public val componentId: String = definedExternally /* "minecraft:health" */
    }
}
