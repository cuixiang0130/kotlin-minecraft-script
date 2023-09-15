@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * This is a base abstract class for any entity component that
 * centers around a number and can have a minimum, maximum, and
 * default defined value.
 * @since 1.3.0
 */
public open external class EntityAttributeComponent protected constructor() : EntityComponent {
    /**
     * Current value of this attribute for this instance.
     *
     * @throws Error This property can throw when used.
     * @since 1.3.0
     */
    public open var currentValue: Number

    /**
     * Returns the default defined value for this attribute.
     *
     * @throws Error This property can throw when used.
     * @since 1.3.0
     */
    public open var defaultValue: Number

    /**
     * Returns the effective max of this attribute given any other
     * ambient components or factors.
     *
     * @throws Error This property can throw when used.
     * @since 1.3.0
     */
    public open var effectiveMax: Number

    /**
     * Returns the effective min of this attribute given any other
     * ambient components or factors.
     *
     * @throws Error This property can throw when used.
     * @since 1.3.0
     */
    public open var effectiveMin: Number

    /**
     * Resets the current value of this attribute to the defined
     * default value.
     *
     * This function can't be called in read-only mode.
     *
     * @throws Error This function can throw errors.
     * @since 1.3.0
     */
    public open fun resetToDefaultValue()

    /**
     * Resets the current value of this attribute to the maximum
     * defined value.
     *
     * This function can't be called in read-only mode.
     *
     * @throws Error This function can throw errors.
     * @since 1.3.0
     */
    public open fun resetToMaxValue()

    /**
     * Resets the current value of this attribute to the minimum
     * defined value.
     *
     * This function can't be called in read-only mode.
     *
     * @throws Error This function can throw errors.
     * @since 1.3.0
     */
    public open fun resetToMinValue()

    /**
     * Sets the current value of this attribute.
     *
     * This function can't be called in read-only mode.
     *
     * @throws Error This function can throw errors.
     * @since 1.3.0
     */
    public open fun setCurrentValue(value: Number): Boolean
}
