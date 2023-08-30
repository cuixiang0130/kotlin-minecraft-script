@file:JsModule("@minecraft/server")

package minecraft.server

import js.core.Record

/**
 * Contains the combination of type BlockType and
 * properties (also sometimes called block state) which
 * describe a block (but does not belong to a specific [Block]).
 * @since 1.1.0
 */
public open external class BlockPermutation protected constructor() {
    /**
     * Returns a boolean whether a specified permutation matches
     * this permutation. If states is not specified, matches checks
     * against the set of types more broadly.
     *
     * This function can't be called in read-only mode.
     *
     * @param blockName
     * An optional set of states to compare against.
     * @since 1.1.0
     */
    public open fun matches(
        blockName: String,
        properties: Record<String, Any>? = definedExternally
    ): Boolean

    public companion object {
        /**
         * Given a type identifier and an optional set of properties,
         * will return a BlockPermutation object that is usable in
         * other block APIs (e.g., block.setPermutation)
         *
         * This function can't be called in read-only mode.
         *
         * @param blockName
         * Identifier of the block to check.
         * @param properties
         * Optional additional set of properties to check against.
         * @throws Error This function can throw errors.
         * @since 1.1.0
         */
        public fun resolve(
            blockName: String,
            properties: Record<String, Any>? = definedExternally
        ): BlockPermutation
    }
}