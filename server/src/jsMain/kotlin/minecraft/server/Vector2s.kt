@file:Suppress("NOTHING_TO_INLINE")

package minecraft.server

import js.core.jso

/**
 * Represents a two-directional vector.
 * @since 1.3.0
 */
public inline fun Vector2(x: Number, y: Number): Vector2 = jso {
    this.x = x
    this.y = y
}
