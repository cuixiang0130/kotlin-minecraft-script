@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Move control that causes the mob to jump as it moves with a
 * specified delay between jumps.
 * @since 1.2.0
 */
public open external class EntityMovementJumpComponent protected constructor() : EntityBaseMovementComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:movement.jump.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:movement.jump" */
    }
}
