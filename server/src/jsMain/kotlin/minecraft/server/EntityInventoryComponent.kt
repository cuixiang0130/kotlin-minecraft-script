@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Defines this entity's inventory properties.
 * @since 1.2.0
 */
public open external class EntityInventoryComponent protected constructor() : EntityComponent {

    /**
     * Number of slots that this entity can gain per extra
     * strength.
     *
     * @throws Error This property can throw when used.
     * @since 1.2.0
     */
    public open val additionalSlotsPerStrength: Int

    /**
     * If true, the contents of this inventory can be removed by a
     * hopper.
     *
     * @throws Error This property can throw when used.
     * @since 1.2.0
     */
    public open val canBeSiphonedFrom: Boolean

    /**
     * Defines the container for this entity.
     *
     * @throws Error This property can throw when used.
     * @since 1.2.0
     */
    public open val container: Container

    /**
     * Type of container this entity has.
     *
     * @throws Error This property can throw when used.
     * @since 1.2.0
     */
    public open val containerType: String

    /**
     * Number of slots the container has.
     *
     * @throws Error This property can throw when used.
     * @since 1.2.0
     */
    public open val inventorySize: Int

    /**
     * If true, the entity will not drop it's inventory on death.
     *
     * @throws Error This property can throw when used.
     * @since 1.2.0
     */
    public open val private: Boolean

    /**
     * If true, the entity's inventory can only be accessed by its
     * owner or itself.
     *
     * @throws Error This property can throw when used.
     * @since 1.2.0
     */
    public open val restrictToOwner: Boolean

    public companion object {
        /**
         * Identifier of this component. Should always be
         * minecraft:inventory.
         * @since 1.2.0
         */
        public val componentId: String = definedExternally /* "minecraft:inventory" */
    }
}
