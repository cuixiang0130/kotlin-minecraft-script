@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Base type for components associated with blocks.
 * @since 1.3.0
 */
public open external class BlockComponent protected constructor() : Component {
    /**
     * Block instance that this component pertains to.
     * @since 1.3.0
     */
    public open val block: Block
}
