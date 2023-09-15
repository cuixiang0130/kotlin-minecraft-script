@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this movement control allows the mob to swim in
 * water and walk on land.
 * @since 1.2.0
 */
public open external class EntityMovementAmphibiousComponent protected constructor() : EntityBaseMovementComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:movement.amphibious.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:movement.amphibious" */
    }
}
