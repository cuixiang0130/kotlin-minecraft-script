@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * As part of the Healable component, represents a specific
 * item that can be fed to an entity to cause health effects.
 * @since 1.3.0
 */
public open external class FeedItem protected constructor() {
    /**
     * The amount of health this entity gains when fed this item.
     * This number is an integer starting at 0. Sample values can
     * go as high as 40.
     * @since 1.3.0
     */
    public open val healAmount: Int

    /**
     * Identifier of type of item that can be fed. If a namespace
     * is not specified, 'minecraft:' is assumed. Example values
     * include 'wheat' or 'golden_apple'.
     * @since 1.3.0
     */
    public open val item: String

    /**
     * As part of the Healable component, an optional collection of
     * side effects that can occur from being fed an item.
     * @since 1.3.0
     */
    public open fun getEffects(): Array<FeedItemEffect>
}
