@file:JsModule("@minecraft/server")

package minecraft.server

import kotlin.js.Promise

/**
 * Represents the state of an entity (a mob, the player, or
 * other moving objects like minecarts) in the world.
 * @since 1.0.0
 */
public open external class Entity protected constructor() {
    /**
     * Dimension that the entity is currently within.
     * @throws Error This property can throw when used.
     * @since 1.1.0
     */
    public open val dimension: Dimension

    /**
     * Unique identifier of the entity. This identifier is intended
     * to be consistent across loads of a world instance. No
     * meaning should be inferred from the value and structure of
     * this unique identifier - do not parse or interpret it.
     * @throws Error This property can throw when used.
     * @since 1.0.0
     */
    public open val id: String

    /**
     * Current location of the entity.
     * @throws Error This property can throw when used.
     * @since 1.1.0
     */
    public open val location: Vector3

    /**
     * Given name of the entity.
     * This property can't be edited in read-only mode.
     * @since 1.1.0
     */
    public open var nameTag: String

    /**
     * Unique identifier of the type of the entity - for example,
     * 'minecraft:skeleton'.
     * @throws Error This property can throw when used.
     * @since 1.0.0
     */
    public open val typeId: String

    /**
     * Adds a specified tag to an entity.
     * This function can't be called in read-only mode.
     * @param tag
     * Content of the tag to add.
     * @return
     * Returns true if the tag was added successfully. This can
     * fail if the tag already exists on the entity.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun addTag(tag: String): Boolean

    /**
     * Applies a set of damage to an entity.
     * This function can't be called in read-only mode.
     * @param amount
     * Amount of damage to apply.
     * @param options
     * Additional options about the source of damage, which may add
     * additional effects or spur additional behaviors on this
     * entity.
     * @return
     * Whether the entity takes any damage. This can return false
     * if the entity is invulnerable or if the damage applied is
     * less than or equal to 0.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun applyDamage(amount: Float, options: EntityApplyDamageOptions? = definedExternally): Boolean

    /**
     * Applies a set of damage to an entity.
     * This function can't be called in read-only mode.
     * @param amount
     * Amount of damage to apply.
     * @param options
     * Additional options about the source of damage, which may add
     * additional effects or spur additional behaviors on this
     * entity.
     * @return
     * Whether the entity takes any damage. This can return false
     * if the entity is invulnerable or if the damage applied is
     * less than or equal to 0.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun applyDamage(
        amount: Float,
        options: EntityApplyDamageByProjectileOptions? = definedExternally
    ): Boolean

    /**
     * Applies a set of damage to an entity.
     * This function can't be called in read-only mode.
     * @param amount
     * Amount of damage to apply.
     * @return
     * Whether the entity takes any damage. This can return false
     * if the entity is invulnerable or if the damage applied is
     * less than or equal to 0.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun applyDamage(amount: Float): Boolean

    /**
     * Applies impulse vector to the current velocity of the
     * entity.
     * This function can't be called in read-only mode.
     * @param vector
     * Impulse vector.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun applyImpulse(vector: Vector3)

    /**
     * Applies impulse vector to the current velocity of the
     * entity.
     * This function can't be called in read-only mode.
     * @param directionX
     * X direction in horizontal plane.
     * @param directionZ
     * Z direction in horizontal plane.
     * @param horizontalStrength
     * Knockback strength for the horizontal vector.
     * @param verticalStrength
     * Knockback strength for the vertical vector.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun applyKnockback(
        directionX: Float,
        directionZ: Float,
        horizontalStrength: Float,
        verticalStrength: Float
    )

    /**
     * Sets the current velocity of the Entity to zero. Note that
     * this method may not have an impact on Players.
     * This function can't be called in read-only mode.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun clearVelocity()

    /**
     * Gets a component (that represents additional capabilities)
     * for an entity.
     * @param componentId
     * The identifier of the component (e.g., 'minecraft:rideable')
     * to retrieve. If no namespace prefix is specified,
     * 'minecraft:' is assumed. If the component is not present on
     * the entity, undefined is returned.
     * @return
     * Returns the component if it exists on the entity, otherwise
     * undefined.
     * @since 1.2.0
     */
    public open fun getComponent(componentId: String): EntityComponent?

    /**
     * Returns all components that are both present on this entity
     * and supported by the API.
     * @return
     * Returns all components that are both present on this entity
     * and supported by the API.
     * @since 1.2.0
     */
    public open fun getComponents(): Array<EntityComponent>

    /**
     * Returns the current location of the head component of this
     * entity.
     * @throws Error This function can throw errors.
     * @since 1.1.0
     */
    public open fun getHeadLocation(): Vector3

    /**
     * Returns all tags associated with an entity.
     * @return
     * Returns the current rotation component of this entity.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun getTags(): Array<String>

    /**
     * Returns the current velocity vector of the entity.
     *
     * This function can't be called in read-only mode.
     *
     * @throws Error This function can throw errors.
     * @since 1.1.0
     */
    public open fun getVelocity(): Vector3

    /**
     * Returns the current view direction of the entity.
     *
     * This function can't be called in read-only mode.
     *
     * @throws Error This function can throw errors.
     * @since 1.1.0
     */
    public open fun getViewDirection(): Vector3

    /**
     * Returns true if the specified component is present on this
     * entity.
     * @param componentId
     * The identifier of the component (e.g., 'minecraft:rideable')
     * to retrieve. If no namespace prefix is specified,
     * 'minecraft:' is assumed.
     * @return
     * Returns true if the specified component is present on this
     * entity.
     * @since 1.2.0
     */
    public open fun hasComponent(componentId: String): Boolean

    /**
     * Returns whether an entity has a particular tag.
     * @param tag
     * Identifier of the tag to test for.
     * @return
     * Returns whether an entity has a particular tag.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun hasTag(tag: String): Boolean

    /**
     * Kills this entity. The entity will drop loot as normal.
     * This function can't be called in read-only mode.
     * @return
     * Returns true if entity can be killed (even if it is already
     * dead), otherwise it returns false.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun kill(): Boolean

    /**
     * Removes a specified tag from an entity.
     * This function can't be called in read-only mode.
     * @param tag
     * Content of the tag to remove.
     * @return
     * Returns whether the tag existed on the entity.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun removeTag(tag: String): Boolean

    /**
     * Runs a synchronous command on the entity.
     * This function can't be called in read-only mode.
     * @param commandString
     * The command string. Note: This should not include a leading
     * forward slash.
     * @return
     * A command result containing whether the command was
     * successful.
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun runCommand(commandString: String): CommandResult

    /**
     * Runs a particular command asynchronously from the context of
     * this entity. Note that there is a maximum queue of 128
     * asynchronous commands that can be run in a given tick.
     *
     * This function can't be called in read-only mode.
     *
     * @param commandString
     * Command to run. Note that command strings should not start
     * with slash.
     * @return
     * For commands that return data, returns a JSON structure with
     * command response values.
     * @throws Error This function can throw errors.
     * @since 1.0.0
     */
    public open fun runCommandAsync(commandString: String): Promise<CommandResult>
}