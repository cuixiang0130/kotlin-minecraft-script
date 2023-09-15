@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Additional options for how a sound plays for a player.
 * @since 1.2.0
 */
public external interface PlayerSoundOptions {
    /**
     * Location of the sound; if not specified, the sound is played
     * near a player.
     * @since 1.2.0
     */
    public var location: Vector3?

    /**
     * Optional pitch of the sound.
     * @since 1.2.0
     */
    public var pitch: Float

    /**
     * Optional volume of the sound.
     * @since 1.2.0
     */
    public var volume: Float?
}
