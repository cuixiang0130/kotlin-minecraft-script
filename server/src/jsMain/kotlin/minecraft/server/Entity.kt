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
     * Returns the current location of the head component of this
     * entity.
     * @throws Error This function can throw errors.
     * @since 1.1.0
     */
    public open fun getHeadLocation(): Vector3

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