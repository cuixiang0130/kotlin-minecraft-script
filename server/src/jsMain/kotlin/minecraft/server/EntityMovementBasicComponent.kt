@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * This component accents the movement of an entity.
 * @since 1.2.0
 */
public open external class EntityMovementBasicComponent protected constructor() : EntityBaseMovementComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:movement.basic.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:movement.basic" */
    }
}
