@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * A class that provides system-level events and functions.
 * @since 1.0.0
 */
public external val system: System

/**
 * A class that wraps the state of a world - a set of
 * dimensions and the environment of Minecraft.
 * @since 1.0.0
 */
public external val world: World