@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

import minecraft.server.Player
import minecraft.server.RawMessage
import kotlin.js.Promise

/**
 * Builds a simple two-button modal dialog.
 * @since 1.0.0
 */
public open external class MessageFormData {
    /**
     * Method that sets the body text for the modal form.
     *
     * This function can't be called in read-only mode.
     *
     * @param bodyText
     * @since 1.0.0
     */
    public open fun body(bodyText: String): MessageFormData

    /**
     * Method that sets the body text for the modal form.
     *
     * This function can't be called in read-only mode.
     *
     * @param bodyText
     * @since 1.0.0
     */
    public open fun body(bodyText: RawMessage): MessageFormData

    /**
     * Method that sets the text for the first button of the
     * dialog.
     *
     * This function can't be called in read-only mode.
     *
     * @param text
     * @since 1.0.0
     */
    public open fun button1(text: String): MessageFormData

    /**
     * Method that sets the text for the first button of the
     * dialog.
     *
     * This function can't be called in read-only mode.
     *
     * @param text
     * @since 1.0.0
     */
    public open fun button1(text: RawMessage): MessageFormData

    /**
     * This method sets the text for the second button on the
     * dialog.
     *
     * This function can't be called in read-only mode.
     *
     * @param text
     * @since 1.0.0
     */
    public open fun button2(text: String): MessageFormData

    /**
     * This method sets the text for the second button on the
     * dialog.
     *
     * This function can't be called in read-only mode.
     *
     * @param text
     * @since 1.0.0
     */
    public open fun button2(text: RawMessage): MessageFormData

    /**
     * Creates and shows this modal popup form. Returns
     * asynchronously when the player confirms or cancels the
     * dialog.
     *
     * This function can't be called in read-only mode.
     *
     * @param player
     * Player to show this dialog to.
     * @throws Error This function can throw errors.
     * @since 1.0.0
     */
    public open fun show(player: Player): Promise<MessageFormResponse>

    /**
     * This builder method sets the title for the modal dialog.
     *
     * This function can't be called in read-only mode.
     *
     * @param titleText
     * @since 1.0.0
     */
    public open fun title(titleText: String): MessageFormData

    /**
     * This builder method sets the title for the modal dialog.
     *
     * This function can't be called in read-only mode.
     *
     * @param titleText
     * @since 1.0.0
     */
    public open fun title(titleText: RawMessage): MessageFormData
}