@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this move control allows a mob to fly, swim,
 * climb, etc.
 * @since 1.2.0
 */
public open external class EntityMovementGenericComponent protected constructor() : EntityBaseMovementComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:movement.generic.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:movement.generic" */
    }
}
