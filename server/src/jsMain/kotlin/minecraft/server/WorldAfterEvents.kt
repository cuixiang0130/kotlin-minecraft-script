@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains a set of events that are available across the scope
 * of the World.
 * @since 1.3.0
 */
public open external class WorldAfterEvents protected constructor() {
    /**
     * This event fires when a button is pushed.
     * @since 1.3.0
     */
    public open val buttonPush: ButtonPushAfterEventSignal

    /**
     * @since 1.3.0
     */
    public open val leverAction: LeverActionAfterEventSignal

    /**
     * This event fires when a player joins a world.  See also
     * playerSpawn for another related event you can trap for when
     * a player is spawned the first time within a world.
     * @since 1.3.0
     */
    public open val playerJoin: PlayerJoinAfterEventSignal

    /**
     * This event fires when a player leaves a world.
     * @since 1.3.0
     */
    public open val playerLeave: PlayerLeaveAfterEventSignal

    /**
     * This event fires when a player spawns or respawns. Note that
     * an additional flag within this event will tell you whether
     * the player is spawning right after join vs. a respawn.
     * @since 1.3.0
     */
    public open val playerSpawn: PlayerSpawnAfterEventSignal
}
