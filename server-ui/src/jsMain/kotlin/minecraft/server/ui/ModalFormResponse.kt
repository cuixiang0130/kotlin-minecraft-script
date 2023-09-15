@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

/**
 * Returns data about player responses to a modal form.
 * @since 1.0.0
 */
public open external class ModalFormResponse protected constructor() : FormResponse {
    /**
     * An ordered set of values based on the order of controls
     * specified by ModalFormData.
     * @since 1.0.0
     */
    public open var formValues: Array<Any>?
}