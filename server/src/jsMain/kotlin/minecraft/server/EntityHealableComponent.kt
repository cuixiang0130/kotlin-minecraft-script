@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Defines the interactions with this entity for healing it.
 * @since 1.3.0
 */
public open external class EntityHealableComponent protected constructor() : EntityComponent {
    /**
     * Determines if an item can be used regardless of the entity
     * being at full health.
     *
     * @throws Error This property can throw when used.
     * @since 1.3.0
     */
    public open val forceUse: Boolean

    /**
     * A set of items that can specifically heal this entity.
     *
     * @returns
     * Entity that this component is associated with.
     * @throws Error This function can throw errors.
     * @since 1.3.0
     */
    public open fun getFeedItems(): Array<FeedItem>

    public companion object {
        /**
         * @since 1.3.0
         */
        public val componentId: String = definedExternally /* "minecraft:healable" */
    }
}
