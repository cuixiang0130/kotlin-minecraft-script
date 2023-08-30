@file:JsModule("@minecraft/server")

package minecraft.server

import kotlin.js.Promise

/**
 * A class that represents a particular dimension (e.g., The
 * End) within a world.
 * @since 1.0.0
 */
public open external class Dimension protected constructor() {
    /**
     * Identifier of the dimension.
     * @throws Error This property can throw when used.
     * @since 1.0.0
     */
    public open val id: String

    /**
     * Runs a particular command asynchronously from the context of
     * the broader dimension.  Note that there is a maximum queue
     * of 128 asynchronous commands that can be run in a given
     * tick.
     * @param commandString
     * Command to run. Note that command strings should not start
     * with slash.
     * @return
     * For commands that return data, returns a CommandResult with
     * an indicator of command results.
     * @throws Error This function can throw errors.
     * @since 1.0.0
     */
    public open fun runCommandAsync(commandString: String): Promise<CommandResult>
}