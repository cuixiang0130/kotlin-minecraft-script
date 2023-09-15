@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Skin Id value. Can be used to differentiate skins, such as
 * base skins for villagers.
 * @since 1.2.0
 */
public open external class EntitySkinIdComponent protected constructor() : EntityComponent {
    /**
     * This property can't be edited in read-only mode.
     * @since 1.2.0
     */
    public open var value: Int

    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:skin_id.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:skin_id" */
    }
}
