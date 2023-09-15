@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Additional options for when damage has been applied via a
 * projectile.
 * @since 1.2.0
 */
public external interface EntityApplyDamageByProjectileOptions {
    /**
     * Optional entity that fired the projectile.
     * @since 1.2.0
     */
    public var damagingEntity: Entity?

    /**
     * Projectile that caused damage.
     * @since 1.2.0
     */
    public var damagingProjectile: Entity
}
