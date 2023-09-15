@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains information related to changes to a button push.
 * @since 1.3.0
 */
public open external class ButtonPushAfterEvent protected constructor() : BlockEvent {
    /**
     * Optional source that triggered the button push.
     * @since 1.3.0
     */
    public open val source: Entity
}
