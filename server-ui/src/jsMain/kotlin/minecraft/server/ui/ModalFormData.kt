@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

import minecraft.server.Player
import minecraft.server.RawMessage
import kotlin.js.Promise

/**
 * Used to create a fully customizable pop-up form for a
 * player.
 * @since 1.0.0
 */
public open external class ModalFormData {
    /**
     * Adds a dropdown with choices to the form.
     *
     * This function can't be called in read-only mode.
     *
     * @param label
     * @param options
     * @param defaultValueIndex
     * @since 1.0.0
     */
    public open fun dropdown(
        label: String,
        options: Array<Any>, /* Array<String|RawMessage> */
        defaultValueIndex: Int? = definedExternally
    ): ModalFormData

    /**
     * Adds a dropdown with choices to the form.
     *
     * This function can't be called in read-only mode.
     *
     * @param label
     * @param options
     * @param defaultValueIndex
     * @since 1.0.0
     */
    public open fun dropdown(
        label: RawMessage,
        options: Array<Any>, /* Array<String|RawMessage> */
        defaultValueIndex: Int? = definedExternally
    ): ModalFormData

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
    public open fun show(player: Player): Promise<ModalFormResponse>

    /**
     * Adds a numeric slider to the form.
     *
     * This function can't be called in read-only mode.
     *
     * @param label
     * @param minimumValue
     * @param maximumValue
     * @param valueStep
     * @param defaultValue
     * @since 1.0.0
     */
    public open fun slider(
        label: String,
        minimumValue: Int,
        maximumValue: Int,
        valueStep: Int,
        defaultValue: Int? = definedExternally
    ): ModalFormData

    /**
     * Adds a numeric slider to the form.
     *
     * This function can't be called in read-only mode.
     *
     * @param label
     * @param minimumValue
     * @param maximumValue
     * @param valueStep
     * @param defaultValue
     * @since 1.0.0
     */
    public open fun slider(
        label: RawMessage,
        minimumValue: Int,
        maximumValue: Int,
        valueStep: Int,
        defaultValue: Int? = definedExternally
    ): ModalFormData

    /**
     * Adds a textbox to the form.
     *
     * This function can't be called in read-only mode.
     *
     * @param label
     * @param placeholderText
     * @param defaultValue
     * @since 1.0.0
     */
    public open fun textField(
        label: String,
        placeholderText: String,
        defaultValue: String? = definedExternally
    ): ModalFormData

    /**
     * Adds a textbox to the form.
     *
     * This function can't be called in read-only mode.
     *
     * @param label
     * @param placeholderText
     * @param defaultValue
     * @since 1.0.0
     */
    public open fun textField(
        label: RawMessage,
        placeholderText: String,
        defaultValue: String? = definedExternally
    ): ModalFormData

    /**
     * Adds a textbox to the form.
     *
     * This function can't be called in read-only mode.
     *
     * @param label
     * @param placeholderText
     * @param defaultValue
     * @since 1.0.0
     */
    public open fun textField(
        label: String,
        placeholderText: RawMessage,
        defaultValue: String? = definedExternally
    ): ModalFormData

    /**
     * Adds a textbox to the form.
     *
     * This function can't be called in read-only mode.
     *
     * @param label
     * @param placeholderText
     * @param defaultValue
     * @since 1.0.0
     */
    public open fun textField(
        label: RawMessage,
        placeholderText: RawMessage,
        defaultValue: String? = definedExternally
    ): ModalFormData

    /**
     * This builder method sets the title for the modal dialog.
     *
     * This function can't be called in read-only mode.
     *
     * @param titleText
     * @since 1.0.0
     */
    public open fun title(titleText: String): ModalFormData

    /**
     * This builder method sets the title for the modal dialog.
     *
     * This function can't be called in read-only mode.
     *
     * @param titleText
     * @since 1.0.0
     */
    public open fun title(titleText: RawMessage): ModalFormData

    /**
     * Adds a toggle checkbox button to the form.
     *
     * This function can't be called in read-only mode.
     *
     * @param label
     * @param defaultValue
     * @since 1.0.0
     */
    public open fun toggle(label: String, defaultValue: Boolean? = definedExternally): ModalFormData

    /**
     * Adds a toggle checkbox button to the form.
     *
     * This function can't be called in read-only mode.
     *
     * @param label
     * @param defaultValue
     * @since 1.0.0
     */
    public open fun toggle(label: RawMessage, defaultValue: Boolean? = definedExternally): ModalFormData
}