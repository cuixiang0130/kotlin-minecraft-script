@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this move control causes the mob to hop as it
 * moves.
 * @since 1.2.0
 */
public open external class EntityMovementSkipComponent protected constructor() : EntityBaseMovementComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:movement.skip.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:movement.skip" */
    }
}
