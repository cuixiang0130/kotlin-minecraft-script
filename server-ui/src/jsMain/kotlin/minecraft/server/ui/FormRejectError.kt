package minecraft.server.ui

import js.errors.JsError

/**
 * @since 1.0.0
 */
public open external class FormRejectError protected constructor() : JsError {
    /**
     * @since 1.0.0
     */
    public val reason: FormRejectReason
}