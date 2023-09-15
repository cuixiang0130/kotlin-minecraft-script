@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Provides an adaptable interface for callers to subscribe to
 * an event that fires when a button is pushed.
 * @since 1.3.0
 */
public open external class IButtonPushAfterEventSignal protected constructor() {
    /**
     * This function can't be called in read-only mode.
     * @since 1.3.0
     */
    public open fun subscribe(callback: (arg: ButtonPushAfterEvent) -> Unit): (arg: ButtonPushAfterEvent) -> Unit

    /**
     * This function can't be called in read-only mode.
     * @throws Error This function can throw errors.
     * @since 1.3.0
     */
    public open fun unsubscribe(callback: (arg: ButtonPushAfterEvent) -> Unit)
}
