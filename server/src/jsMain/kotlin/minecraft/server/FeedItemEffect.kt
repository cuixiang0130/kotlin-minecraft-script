@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Represents an effect that is applied as a result of a food
 * item being fed to an entity.
 * @since 1.3.0
 */
public open external class FeedItemEffect protected constructor() {
    /**
     * Gets an amplifier that may have been applied to this effect.
     * Valid values are integers starting at 0 and up - but usually
     * ranging between 0 and 4.
     * @since 1.3.0
     */
    public open val amplifier: Int

    /**
     * Chance that this effect is applied as a result of the entity
     * being fed this item. Valid values range between 0 and 1.
     * @since 1.3.0
     */
    public open val chance: Float

    /**
     * Gets the duration, in ticks, of this effect.
     * @since 1.3.0
     */
    public open val duration: Int

    /**
     * Gets the identifier of the effect to apply. Example values
     * include 'fire_resistance' or 'regeneration'.
     * @since 1.3.0
     */
    public open val name: String
}
