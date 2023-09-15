@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * When added, this component signifies that this entity can
 * float in liquid blocks.
 * @since 1.2.0
 */
public open external class EntityFloatsInLiquidComponent protected constructor() : EntityComponent {
    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:floats_in_liquid.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:floats_in_liquid" */
    }
}
