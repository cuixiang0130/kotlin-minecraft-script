@file: JsModule("@minecraft/server")
@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package minecraft.server

/**
 * @since 1.2.0
 */
public sealed external interface ItemLockMode {
    public companion object {
        /**
         * @since 1.2.0
         */
        public val inventory: ItemLockMode /* = 'inventory' */

        /**
         * @since 1.2.0
         */
        public val none: ItemLockMode /* = 'none' */

        /**
         * @since 1.2.0
         */
        public val slot: ItemLockMode /* = 'slot' */
    }
}
