@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * A class that wraps the state of a world - a set of
 * dimensions and the environment of Minecraft.
 * @since 1.0.0
 */
public open external class World protected constructor() {
    /**
     * Returns an array of all active players within the world.
     *
     * This function can't be called in read-only mode.
     *
     * @since 1.0.0
     */
    public open fun getAllPlayers(): Array<Player>

    /**
     * Returns a dimension object.
     *
     * This function can't be called in read-only mode.
     *
     * @param dimensionId
     * @return
     * The requested dimension
     * @throws Error Throws if the given dimension name is invalid
     * @since 1.0.0
     */
    public open fun getDimension(dimensionId: String): Dimension

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
     * Sends a message to all players.
     *
     * This function can't be called in read-only mode.
     *
     * @param message
     * The message to be displayed.
     * @throws Error
     * This method can throw if the provided [RawMessage] is
     * in an invalid format. For example, if an empty [RawMessageScore.name] string
     * is provided to [RawMessage.score].
     * @since 1.1.0
     */
    public open fun sendMessage(message: Array<Any /* RawMessage | String */>)

    /**
     * Sends a message to all players.
     *
     * This function can't be called in read-only mode.
     *
     * @param message
     * The message to be displayed.
     * @throws Error
     * This method can throw if the provided [RawMessage] is
     * in an invalid format. For example, if an empty [RawMessageScore.name] string
     * is provided to [RawMessage.score].
     * @since 1.1.0
     */
    public open fun sendMessage(message: RawMessage)

    /**
     * Sends a message to all players.
     *
     * This function can't be called in read-only mode.
     *
     * @param message
     * The message to be displayed.
     * @since 1.1.0
     */
    public open fun sendMessage(message: String)
}