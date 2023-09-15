@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

/**
 * Base type for a form response.
 * @since 1.0.0
 */
public open external class FormResponse protected constructor() {
    /**
     * Contains additional details as to why a form was canceled.
     * @since 1.1.0
     */
    public open val cancelationReason: FormCancelationReason

    /**
     * If true, the form was canceled by the player (e.g., they
     * selected the pop-up X close button).
     * @since 1.1.0
     */
    public open val canceled: Boolean
}