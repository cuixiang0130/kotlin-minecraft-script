@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * Represents a player within the world.
 * @since 1.0.0
 */
public open external class Player protected constructor() : Entity {

    /**
     * Name of the player.
     * @throws Error This property can throw when used.
     * @since 1.0.0
     */
    public open val name: String

    /**
     * Sends a message to the player.
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
     * Sends a message to the player.
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
     * Sends a message to the player.
     *
     * This function can't be called in read-only mode.
     *
     * @param message
     * The message to be displayed.
     * @since 1.1.0
     */
    public open fun sendMessage(message: String)

}