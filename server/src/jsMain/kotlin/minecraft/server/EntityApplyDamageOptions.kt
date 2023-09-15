@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Additional descriptions and metadata for a damage event.
 * @since 1.2.0
 */
public external interface EntityApplyDamageOptions {
    /**
     * Underlying cause of the damage.
     * @since 1.2.0
     */
    public var cause: EntityDamageCause

    /**
     * Optional entity that caused the damage.
     * @since 1.2.0
     */
    public var damagingEntity: Entity?
}
