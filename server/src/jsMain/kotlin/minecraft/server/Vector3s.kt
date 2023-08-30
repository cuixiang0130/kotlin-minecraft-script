@file:Suppress("NOTHING_TO_INLINE")

package minecraft.server

import js.core.jso

/**
 * Contains a description of a vector.
 * @since 1.1.0
 */
public inline fun Vector3(x: Number, y: Number, z: Number): Vector3 = jso {
    this.x = x
    this.y = y
    this.z = z
}

