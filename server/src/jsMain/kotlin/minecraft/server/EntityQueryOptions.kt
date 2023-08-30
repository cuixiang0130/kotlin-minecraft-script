@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains options for selecting entities within an area.
 * @since 1.1.0
 */
public external interface EntityQueryOptions {
    /**
     * Limits the number of entities to return, opting for the
     * closest N entities as specified by this property. The
     * location value must also be specified on the query options
     * object.
     * @since 1.1.0
     */
    public var closest: Int?

    /**
     * Excludes entities that match one or more of the specified
     * families.
     * @since 1.1.0
     */
    public var excludeFamilies: Array<String>?

    /**
     * Excludes entities if have a specific gamemode that matches
     * the specified gamemode.
     * @since 1.1.0
     */
    public var excludeGameModes: Array<GameMode>?

    /**
     * Excludes entities that have a name that match one of the
     * specified values.
     * @since 1.1.0
     */
    public var excludeNames: Array<String>?

    /**
     * Excludes entities with a tag that matches one of the
     * specified values.
     * @since 1.1.0
     */
    public var excludeTags: Array<String>?

    /**
     * Excludes entities if they are one of the specified types.
     * @since 1.1.0
     */
    public var excludeTypes: Array<String>?

    /**
     * If specified, includes entities that match all of the
     * specified families.
     * @since 1.1.0
     */
    public var families: Array<String>?

    /**
     * Limits the number of entities to return, opting for the
     * farthest N entities as specified by this property. The
     * location value must also be specified on the query options
     * object.
     * @since 1.1.0
     */
    public var farthest: Int?

    /**
     * If specified, includes entities with a gamemode that matches
     * the specified gamemode.
     * @since 1.1.0
     */
    public var gameMode: GameMode?

    /**
     * Adds a seed location to the query that is used in
     * conjunction with closest, farthest, limit, volume, and
     * distance properties.
     * @since 1.1.0
     */
    public var location: Vector3?

    /**
     * If specified, includes entities that are less than this
     * distance away from the location specified in the location
     * property.
     * @since 1.1.0
     */
    public var maxDistance: Float?

    /**
     * If specified, will only include entities that have at most
     * this horizontal rotation.
     * @since 1.1.0
     */
    public var maxHorizontalRotation: Float?

    /**
     * If defined, only players that have at most this level are
     * returned.
     * @since 1.1.0
     */
    public var maxLevel: Int?

    /**
     * If specified, only entities that have at most this vertical
     * rotation are returned.
     * @since 1.1.0
     */
    public var maxVerticalRotation: Float?

    /**
     * If specified, includes entities that are least this distance
     * away from the location specified in the location property.
     * @since 1.1.0
     */
    public var minDistance: Float?

    /**
     * If specified, will only include entities that have at a
     * minimum this horizontal rotation.
     * @since 1.1.0
     */
    public var minHorizontalRotation: Float?

    /**
     * If defined, only players that have at least this level are
     * returned.
     * @since 1.1.0
     */
    public var minLevel: Int?

    /**
     * If specified, will only include entities that have at least
     * this vertical rotation.
     * @since 1.1.0
     */
    public var minVerticalRotation: Float?

    /**
     * Includes entities with the specified name.
     * @since 1.1.0
     */
    public var name: String?

    /**
     * Gets/sets a collection of EntityQueryScoreOptions objects
     * with filters for specific scoreboard objectives.
     * @since 1.1.0
     */
    public var scoreOptions: Array<EntityQueryScoreOptions>?

    /**
     * Includes entities that match all of the specified tags.
     * @since 1.1.0
     */
    public var tags: Array<String>?

    /**
     * If defined, entities that match this type are included.
     * @since 1.1.0
     */
    public var type: String?

}