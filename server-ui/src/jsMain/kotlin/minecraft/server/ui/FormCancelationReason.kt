@file: JsModule("@minecraft/server-ui")
@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package minecraft.server.ui

/**
 * @since 1.1.0
 */
public sealed external interface FormCancelationReason {
    public companion object {
        /**
         * @since 1.1.0
         */
        public val UserBusy: FormRejectReason /* = 'UserBusy' */

        /**
         * @since 1.1.0
         */
        public val UserClosed: FormRejectReason /* = 'UserClosed' */
    }
}
