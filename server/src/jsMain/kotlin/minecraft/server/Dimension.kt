@file:JsModule("@minecraft/server")

package minecraft.server

import kotlin.js.Promise

/**
 * A class that represents a particular dimension (e.g., The
 * End) within a world.
 * @since 1.0.0
 */
public open external class Dimension protected constructor() {
    /**
     * Identifier of the dimension.
     * @throws Error This property can throw when used.
     * @since 1.0.0
     */
    public open val id: String

    /**
     * Returns a block instance at the given location.
     *
     * This function can't be called in read-only mode.
     *
     * @param location
     * The location at which to return a block.
     * @return
     * Block at the specified location.
     * @throws Error This function can throw errors.
     * @since 1.1.0
     */
    public open fun getBlock(location: Vector3): Block?

    /**
     * Returns a set of entities based on a set of conditions
     * defined via the [EntityQueryOptions] set of filter criteria.
     *
     * This function can't be called in read-only mode.
     *
     * @param options
     * Additional options that can be used to filter the set of
     * entities returned.
     * @return
     * An entity array.
     * @throws Error This function can throw errors.
     * @since 1.1.0
     */
    public open fun getEntities(options: EntityQueryOptions? = definedExternally): Array<Entity>

    /**
     * Returns a set of entities at a particular location.
     *
     * This function can't be called in read-only mode.
     *
     * @param location
     * The location at which to return entities.
     * @return
     * Zero or more entities at the specified location.
     * @since 1.1.0
     */
    public open fun getEntitiesAtBlockLocation(location: Vector3): Array<Entity>

    /**
     * Returns a set of players based on a set of conditions
     * defined via the [EntityQueryOptions] set of filter criteria.
     *
     * This function can't be called in read-only mode.
     *
     * @param options
     * Additional options that can be used to filter the set of
     * players returned.
     * @return
     * A player array.
     * @throws Error This function can throw errors.
     * @since 1.1.0
     */
    public open fun getPlayers(options: EntityQueryOptions? = definedExternally): Array<Player>

    /**
     * This function can't be called in read-only mode.
     *
     * @throws Error This function can throw errors.
     * @since 1.2.0
     */
    public open fun runCommand(commandString: String): CommandResult

    /**
     * Runs a particular command asynchronously from the context of
     * the broader dimension.  Note that there is a maximum queue
     * of 128 asynchronous commands that can be run in a given
     * tick.
     *
     * This function can't be called in read-only mode.
     *
     * @param commandString
     * Command to run. Note that command strings should not start
     * with slash.
     * @return
     * For commands that return data, returns a CommandResult with
     * an indicator of command results.
     * @throws Error This function can throw errors.
     * @since 1.0.0
     */
    public open fun runCommandAsync(commandString: String): Promise<CommandResult>
}