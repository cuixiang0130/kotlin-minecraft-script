@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains information related to changes to a lever
 * activating or deactivating.
 * @since 1.3.0
 */
public open external class LeverActionAfterEvent protected constructor() : BlockEvent {
    /**
     * True if the lever is activated (that is, transmitting
     * power).
     * @since 1.3.0
     */
    public open val isPowered: Boolean

    /**
     * Optional player that triggered the lever activation.
     * @since 1.3.0
     */
    public open val player: Player
}
