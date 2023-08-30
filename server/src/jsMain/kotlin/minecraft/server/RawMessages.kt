package minecraft.server

import js.core.jso

/**
 * @since 1.1.0
 */
public inline fun RawMessage(action: RawMessage.() -> Unit): RawMessage = jso(action)

/**
 * @since 1.1.0
 */
public inline fun RawMessageScore(action: RawMessageScore.() -> Unit): RawMessageScore = jso(action)

/**
 * @since 1.1.0
 */
public inline fun RawMessage.with(args: Array<String>) {
    with = args
}

/**
 * @since 1.1.0
 */
public inline fun RawMessage.with(args: RawMessage) {
    with = args
}

/**
 * @since 1.1.0
 */
public inline fun RawMessage.score(action: RawMessageScore.() -> Unit) {
    score = jso(action)
}

/**
 * Sends a message to all players.
 *
 * This function can't be called in read-only mode.
 *
 * @param action
 * The message to be displayed.
 * @throws Error
 * This method can throw if the provided [RawMessage] is
 * in an invalid format. For example, if an empty [RawMessageScore.name] string
 * is provided to [RawMessage.score].
 * @since 1.1.0
 */
public inline fun World.sendMessage(action: RawMessage.() -> Unit) {
    val rawMessage = jso(action)
    this.sendMessage(rawMessage)
}

/**
 * Sends a message to the player.
 *
 * This function can't be called in read-only mode.
 *
 * @param action
 * The message to be displayed.
 * @throws Error
 * This method can throw if the provided [RawMessage] is
 * in an invalid format. For example, if an empty [RawMessageScore.name] string
 * is provided to [RawMessage.score].
 * @since 1.1.0
 */
public inline fun Player.sendMessage(action: RawMessage.() -> Unit) {
    val rawMessage = jso(action)
    this.sendMessage(rawMessage)
}
