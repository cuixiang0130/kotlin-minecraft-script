package minecraft.server

import js.core.jso

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
