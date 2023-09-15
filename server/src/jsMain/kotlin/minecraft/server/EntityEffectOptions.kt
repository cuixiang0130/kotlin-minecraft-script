@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains additional options for entity effects.
 * @since 1.3.0
 */
public external interface EntityEffectOptions {
    /**
     * The strength of the effect.
     * @since 1.3.0
     */
    public var amplifier: Int?

    /**
     * If true, will show particles when effect is on the entity.
     * @since 1.3.0
     */
    public var showParticles: Boolean?
}
