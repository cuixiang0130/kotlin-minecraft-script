@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Base class for downstream Component implementations.
 * @since 1.2.0
 */
public open external class Component protected constructor() {
    /**
     * Identifier of the component.
     * @since 1.2.0
     */
    public open val typeId: String
}
