@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Used to differentiate the component group of a variant of an
 * entity from others. (e.g. ocelot, villager).
 * @since 1.2.0
 */
public open external class EntityVariantComponent protected constructor() : EntityComponent {
    /**
     * @since 1.2.0
     */
    public open val value: Int

    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:variant.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:variant" */
    }
}
