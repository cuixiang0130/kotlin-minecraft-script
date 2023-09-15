@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

import minecraft.server.Player
import minecraft.server.RawMessage
import kotlin.js.Promise

/**
 * Builds a simple player form with buttons that let the player
 * take action.
 * @since 1.0.0
 */
public open external class ActionFormData {
    /**
     * Method that sets the body text for the modal form.
     *
     * This function can't be called in read-only mode.
     *
     * @param bodyText
     * @since 1.0.0
     */
    public open fun body(bodyText: String): ActionFormData

    /**
     * Method that sets the body text for the modal form.
     *
     * This function can't be called in read-only mode.
     *
     * @param bodyText
     * @since 1.0.0
     */
    public open fun body(bodyText: RawMessage): ActionFormData

    /**
     * Adds a button to this form with an icon from a resource
     * pack.
     *
     * This function can't be called in read-only mode.
     *
     * @param text
     * @param iconPath
     * @since 1.0.0
     */
    public open fun button(text: String, iconPath: String? = definedExternally): ActionFormData

    /**
     * Adds a button to this form with an icon from a resource
     * pack.
     *
     * This function can't be called in read-only mode.
     *
     * @param text
     * @param iconPath
     * @since 1.0.0
     */
    public open fun button(text: RawMessage, iconPath: String? = definedExternally): ActionFormData

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
    public open fun show(player: Player): Promise<ActionFormResponse>

    /**
     * This builder method sets the title for the modal dialog.
     *
     * This function can't be called in read-only mode.
     *
     * @param titleText
     * @since 1.0.0
     */
    public open fun title(titleText: String): ActionFormData

    /**
     * This builder method sets the title for the modal dialog.
     *
     * This function can't be called in read-only mode.
     *
     * @param titleText
     * @since 1.0.0
     */
    public open fun title(titleText: RawMessage): ActionFormData
}