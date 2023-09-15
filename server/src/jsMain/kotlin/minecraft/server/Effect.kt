@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Represents an effect - like poison - that has been added to
 * an Entity.
 * @since 1.3.0
 */
public open external class Effect {
    /**
     * Gets an amplifier that may have been applied to this effect.
     * Sample values range typically from 0 to 4. Example: The
     * effect 'Jump Boost II' will have an amplifier value of 1.
     *
     * @throws Error This property can throw when used.
     * @since 1.3.0
     */
    public open val amplifier: Int

    /**
     * Gets the player-friendly name of this effect.
     *
     * @throws Error This property can throw when used.
     * @since 1.3.0
     */
    public open val displayName: String

    /**
     * Gets the entire specified duration, in ticks, of this
     * effect. There are 20 ticks per second. Use {@link
     * TicksPerSecond} constant to convert between ticks and
     * seconds.
     *
     * @throws Error This property can throw when used.
     * @since 1.3.0
     */
    public open val duration: Int

    /**
     * Gets the type id of this effect.
     *
     * @throws Error This property can throw when used.
     * @since 1.3.0
     */
    public open val typeId: String

    /**
     * Returns whether an effect instance is available for use in
     * this context.
     * @since 1.3.0
     */
    public open fun isValid(): Boolean
}
