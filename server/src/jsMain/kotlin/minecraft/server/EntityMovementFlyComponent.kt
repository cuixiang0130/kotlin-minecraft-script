@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this move control causes the mob to fly.
 * @since 1.2.0
 */
public open external class EntityMovementFlyComponent protected constructor() : EntityBaseMovementComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:movement.fly.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:movement.fly" */
    }
}
