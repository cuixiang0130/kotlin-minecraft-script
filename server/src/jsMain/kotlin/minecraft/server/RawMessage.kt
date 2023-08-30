@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * @since 1.1.0
 */
public external interface RawMessage {
    /**
     * @since 1.1.0
     */
    public var rawtext: Array<RawMessage>?

    /**
     * @since 1.1.0
     */
    public var score: RawMessageScore?

    /**
     * @since 1.1.0
     */
    public var text: String?

    /**
     * @since 1.1.0
     */
    public var translate: String?

    /**
     * @since 1.1.0
     */
    public var with: dynamic /* Array<String>? | RawMessage? */

}