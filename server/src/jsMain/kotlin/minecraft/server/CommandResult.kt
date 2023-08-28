@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * Contains return data on the result of a command execution.
 * @since 1.0.0
 */
public open external class CommandResult {
    /**
     * If the command operates against a number of entities,
     * blocks, or items, this returns the number of successful
     * applications of this command.
     * @since 1.0.0
     */
    public open val successCount: Number
}