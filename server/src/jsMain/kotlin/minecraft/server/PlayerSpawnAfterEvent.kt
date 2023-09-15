@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * An event that contains more information about a player
 * spawning.
 * @since 1.3.0
 */
public open external class PlayerSpawnAfterEvent protected constructor() {
    /**
     * If true, this is the initial spawn of a player after joining
     * the game.
     * This property can't be edited in read-only mode.
     * @since 1.3.0
     */
    public open var initialSpawn: Boolean

    /**
     * Object that represents the player that joined the game.
     * This property can't be edited in read-only mode.
     * @since 1.3.0
     */
    public open var player: Player
}
