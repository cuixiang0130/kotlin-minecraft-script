@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * A class that provides system-level events and functions.
 * @since 1.0.0
 */
public open external class System {
    /**
     * Runs a specified function at a future time. This is
     * frequently used to implement delayed behaviors and game
     * loops.
     * @param callback
     * Function callback to run when the tickDelay time criteria is
     * met.
     * @return
     * An opaque identifier that can be used with the `clearRun`
     * function to cancel the execution of this run.
     * @since 1.0.0
     */
    public open fun run(callback: () -> Unit): Int
}