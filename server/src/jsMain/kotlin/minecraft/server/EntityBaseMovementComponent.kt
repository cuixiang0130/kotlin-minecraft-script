@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Base class for a family of entity movement events.
 * @since 1.2.0
 */
public open external class EntityBaseMovementComponent protected constructor() : EntityComponent {
    /**
     * @since 1.2.0
     */
    public open val maxTurn: Float
}
