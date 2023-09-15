@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Additional configuration options for
 * [World.playMusic]/[World.queueMusic] methods.
 * @since 1.2.0
 */
public external interface MusicOptions {
    /**
     * Specifies a fade overlap for music at the end of play.
     * @since 1.2.0
     */
    public var fade: Float?

    /**
     * If set to true, this music track will play repeatedly.
     * @since 1.2.0
     */
    public var loop: Boolean?

    /**
     * Relative volume level of the music.
     * @since 1.2.0
     */
    public var volume: Float?
}
