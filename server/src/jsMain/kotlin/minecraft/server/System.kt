@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * A class that provides system-level events and functions.
 * @since 1.0.0
 */
public open external class System protected constructor() {
    /**
     * Represents the current world tick of the server.
     * @since 1.1.0
     */
    public open val currentTick: Int

    /**
     * Cancels the execution of a function run that was previously
     * scheduled via the [run] function.
     *
     * This function can't be called in read-only mode.
     *
     * @since 1.1.0
     */
    public open fun clearRun(runId: Int)

    /**
     * Runs a specified function at a future time. This is
     * frequently used to implement delayed behaviors and game
     * loops.
     *
     * This function can't be called in read-only mode.
     *
     * @param callback
     * Function callback to run when the tickDelay time criteria is
     * met.
     * @return
     * An opaque identifier that can be used with the [clearRun]
     * function to cancel the execution of this run.
     * @since 1.0.0
     */
    public open fun run(callback: () -> Unit): Int

    /**
     * Runs a set of code on an interval.
     *
     * This function can't be called in read-only mode.
     *
     * @param callback
     * Functional code that will run when this interval occurs.
     * @param tickInterval
     * An interval of every N ticks that the callback will be
     * called upon.
     * @return
     * An opaque handle that can be used with the [clearRun] method
     * to stop the run of this function on an interval.
     * @since 1.1.0
     */
    public open fun runInterval(callback: () -> Unit, tickInterval: Int? = definedExternally): Int

    /**
     * Runs a set of code at a future time specified by tickDelay.
     *
     * This function can't be called in read-only mode.
     *
     * @param callback
     * Functional code that will run when this timeout occurs.
     * @param tickDelay
     * Amount of time, in ticks, before the interval will be
     * called.
     * @return
     * An opaque handle that can be used with the [clearRun] method
     * to stop the run of this function on an interval.
     * @since 1.1.0
     */
    public open fun runTimeout(callback: () -> Unit, tickDelay: Int? = definedExternally): Int

}