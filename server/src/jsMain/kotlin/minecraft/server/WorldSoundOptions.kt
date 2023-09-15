@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains additional options for a world-level playSound
 * occurrence.
 * @since 1.2.0
 */
public external interface WorldSoundOptions {
    /**
     * Pitch of the sound played at the world level.
     * @since 1.2.0
     */
    public var pitch: Float?

    /**
     * Relative volume and space by which this sound is heard.
     * @since 1.2.0
     */
    public var volume: Float?
}
