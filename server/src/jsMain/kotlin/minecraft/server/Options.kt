package minecraft.server

import js.core.jso

/**
 * Additional options for when damage has been applied via a
 * projectile.
 * @since 1.2.0
 */
public inline fun EntityApplyDamageByProjectileOptions(
    damagingProjectile: Entity,
    action: EntityApplyDamageByProjectileOptions.() -> Unit
): EntityApplyDamageByProjectileOptions =
    jso {
        this.damagingProjectile = damagingProjectile
        action()
    }

/**
 * Additional descriptions and metadata for a damage event.
 * @since 1.2.0
 */
public inline fun EntityApplyDamageOptions(
    cause: EntityDamageCause,
    action: EntityApplyDamageOptions.() -> Unit
): EntityApplyDamageOptions =
    jso {
        this.cause = cause
        action()
    }

/**
 * Contains options for selecting entities within an area.
 * @since 1.1.0
 */
public inline fun EntityQueryOptions(action: EntityQueryOptions.() -> Unit): EntityQueryOptions = jso(action)

/**
 * Contains additional options for filtering players based on
 * their score for an objective.
 * @since 1.1.0
 */
public inline fun EntityQueryScoreOptions(action: EntityQueryScoreOptions.() -> Unit): EntityQueryScoreOptions =
    jso(action)

/**
 * Additional configuration options for
 * [World.playMusic]/[World.queueMusic] methods.
 * @since 1.2.0
 */
public inline fun MusicOptions(action: MusicOptions.() -> Unit): MusicOptions = jso(action)

/**
 * Additional options for how a sound plays for a player.
 * @since 1.2.0
 */
public inline fun PlayerSoundOptions(action: PlayerSoundOptions.() -> Unit): PlayerSoundOptions = jso(action)

/**
 * Contains additional options for a world-level playSound
 * occurrence.
 * @since 1.2.0
 */
public inline fun WorldSoundOptions(action: WorldSoundOptions.() -> Unit): WorldSoundOptions = jso(action)