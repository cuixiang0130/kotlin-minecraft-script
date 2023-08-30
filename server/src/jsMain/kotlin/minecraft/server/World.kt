@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * A class that wraps the state of a world - a set of
 * dimensions and the environment of Minecraft.
 * @since 1.0.0
 */
public open external class World protected constructor() {
    /**
     * @since 1.0.0
     */
    public open fun getAllPlayers(): Array<Player>

    /**
     * @param dimensionId
     * @return
     * The requested dimension
     * @throws Error Throws if the given dimension name is invalid
     * @since 1.0.0
     */
    public open fun getDimension(dimensionId: String): Dimension
}