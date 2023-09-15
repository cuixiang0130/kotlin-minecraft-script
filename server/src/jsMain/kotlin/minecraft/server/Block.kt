@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * Represents a block in a dimension. A block represents a
 * unique X, Y, and Z within a dimension and get/sets the state
 * of the block at that location.
 * @since 1.1.0
 */
public open external class Block protected constructor() {
    /**
     * Returns the dimension that the block is within.
     * @since 1.1.0
     */
    public open val dimension: Dimension

    /**
     * Coordinates of the specified block.
     * @throws Error
     * This property can throw when used.
     * @since 1.1.0
     */
    public open val location: Vector3

    /**
     * Additional block configuration data that describes the
     * block.
     * @throws Error
     * This property can throw when used.
     * @since 1.1.0
     */
    public open val permutation: BlockPermutation

    /**
     * X coordinate of the block.
     * @since 1.1.0
     */
    public open val x: Int

    /**
     * Y coordinate of the block.
     * @since 1.1.0
     */
    public open val y: Int

    /**
     * Z coordinate of the block.
     * @since 1.1.0
     */
    public open val z: Int

    /**
     * Gets additional configuration properties (a component) for
     * specific capabilities of particular blocks - for example, an
     * inventory component of a chest block.
     *
     * @param componentName
     * Identifier of the component. If a namespace is not
     * specified, minecraft: is assumed.
     * @return
     * Returns the component object if it is present on the
     * particular block.
     * @throws Error This function can throw errors.
     * @since 1.3.0
     */
    public open fun getComponent(componentName: String): BlockComponent?

    /**
     * Sets the block in the dimension to the state of the
     * permutation.
     *
     * This function can't be called in read-only mode.
     *
     * @param permutation
     * Permutation that contains a set of property states for the
     * Block.
     * @throws Error
     * This function can throw errors.
     * @since 1.1.0
     */
    public open fun setPermutation(permutation: BlockPermutation)
}