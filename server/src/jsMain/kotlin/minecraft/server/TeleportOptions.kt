@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains additional options for teleporting an entity.
 * @since 1.3.0
 */
public external interface TeleportOptions {
    /**
     * Whether to check whether blocks will block the entity after
     * teleport.
     * @since 1.3.0
     */
    public var checkForBlocks: Boolean?

    /**
     * Dimension to potentially move the entity to.  If not
     * specified, the entity is teleported within the dimension
     * that they reside.
     * @since 1.3.0
     */
    public var dimension: Dimension?

    /**
     * Location that the entity should be facing after teleport.
     * @since 1.3.0
     */
    public var facingLocation: Vector3?

    /**
     * Whether to retain the entities velocity after teleport.
     * @since 1.3.0
     */
    public var keepVelocity: Boolean?

    /**
     * Rotation of the entity after teleport.
     * @since 1.3.0
     */
    public var rotation: Vector2?
}
