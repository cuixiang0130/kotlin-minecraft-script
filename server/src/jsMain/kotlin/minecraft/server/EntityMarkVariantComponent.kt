@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Additional variant value. Can be used to further
 * differentiate variants.
 * @since 1.2.0
 */
public open external class EntityMarkVariantComponent protected constructor() : EntityComponent {
    /**
     * This property can't be edited in read-only mode.
     * @since 1.2.0
     */
    public open var value: Int

    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:mark_variant.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:mark_variant" */
    }
}
