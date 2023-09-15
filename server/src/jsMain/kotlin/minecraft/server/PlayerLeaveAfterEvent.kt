@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains information regarding a player that has left the
 * world.
 * @since 1.3.0
 */
public open external class PlayerLeaveAfterEvent protected constructor() {
    /**
     * Opaque string identifier of the player that has left the
     * event.
     * @since 1.3.0
     */
    public open val playerId: String

    /**
     * Player that has left the world.
     * @since 1.3.0
     */
    public open val playerName: String
}
