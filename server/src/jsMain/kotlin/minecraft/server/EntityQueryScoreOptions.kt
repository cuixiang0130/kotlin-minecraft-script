@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains additional options for filtering players based on
 * their score for an objective.
 * @since 1.1.0
 */
public external interface EntityQueryScoreOptions {
    /**
     * If set to true, entities and players within this score range
     * are excluded from query results.
     * @since 1.1.0
     */
    public var exclude: Boolean?

    /**
     * If defined, only players that have a score equal to or under
     * maxScore are included.
     * @since 1.1.0
     */

    public var maxScore: Int?

    /**
     * If defined, only players that have a score equal to or over
     * minScore are included.
     * @since 1.1.0
     */
    public var minScore: Int?

    /**
     * Identifier of the scoreboard objective to filter on.
     * @since 1.1.0
     */
    public var objective: String?

}