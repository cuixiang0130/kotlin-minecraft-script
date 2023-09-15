@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains information regarding a player that has joined.
 * See the playerSpawn event for more detailed information that
 * could be returned after the first time a player has spawned
 * within the game.
 * @since 1.3.0
 */
public open external class PlayerJoinAfterEvent protected constructor() {
    /**
     * Opaque string identifier of the player that joined the game.
     * @since 1.3.0
     */
    public open val playerId: String

    /**
     * Name of the player that has joined.
     * @since 1.3.0
     */
    public open val playerName: String
}
