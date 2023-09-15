@file: JsModule("@minecraft/server-ui")
@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package minecraft.server.ui

/**
 * @since 1.0.0
 */
public sealed external interface FormRejectReason {
    public companion object {
        /**
         * @since 1.0.0
         */
        public val MalformedResponse: FormRejectReason /* = 'MalformedResponse' */

        /**
         * @since 1.0.0
         */
        public val PlayerQuit: FormRejectReason /* = 'PlayerQuit' */

        /**
         * @since 1.0.0
         */
        public val ServerShutdown: FormRejectReason /* = 'ServerShutdown' */
    }
}
