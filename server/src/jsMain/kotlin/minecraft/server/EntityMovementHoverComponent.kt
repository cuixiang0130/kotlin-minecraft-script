@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this move control causes the mob to hover.
 * @since 1.2.0
 */
public open external class EntityMovementHoverComponent protected constructor() : EntityBaseMovementComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:movement.hover.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:movement.hover" */
    }
}
