@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains information regarding an event that impacts a
 * specific block.
 * @since 1.3.0
 */
public open external class BlockEvent protected constructor() {
    /**
     * Block impacted by this event.
     * @since 1.3.0
     */
    public open val block: Block

    /**
     * Dimension that contains the block that is the subject of
     * this event.
     * @since 1.3.0
     */
    public open val dimension: Dimension
}
