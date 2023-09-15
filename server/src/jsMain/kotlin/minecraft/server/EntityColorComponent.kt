@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Defines the entity's color. Only works on certain entities
 * that have predefined color values (sheep, llama, shulker).
 * @since 1.2.0
 */
public open external class EntityColorComponent protected constructor() : EntityComponent {
    /**
     * This property can't be edited in read-only mode.
     * @since 1.2.0
     */
    public open var value: Int

    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:color.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:color" */
    }
}
