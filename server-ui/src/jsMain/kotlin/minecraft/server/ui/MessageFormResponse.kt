@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

/**
 * Returns data about the player results from a modal message
 * form.
 * @since 1.0.0
 */
public open external class MessageFormResponse protected constructor() : FormResponse {
    /**
     * Returns the index of the button that was pushed.
     * @since 1.0.0
     */
    public open val selection: Int?
}