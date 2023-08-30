@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * A collection of default Minecraft dimension types.
 * @since 1.0.0
 */
@Deprecated("Use vanilla-data instead")
public open external class MinecraftDimensionTypes protected constructor() {
    public companion object {
        /**
         * The Nether is a collection of biomes separate from the
         * Overworld, including Soul Sand Valleys and Crimson forests.
         * Nether fortresses contain exclusive resources. Mobs such as
         * Blaze, Hoglins, Piglins, and Ghasts congregate here.
         * @since 1.0.0
         */
        public val nether: String = definedExternally //"minecraft:nether"

        /**
         * The overworld is a collection of biomes, including forests,
         * plains, jungles, mountains, deserts, taiga, and more. This
         * is the default starter dimension for Minecraft. Mobs such as
         * Axolotl, Cows, Creepers, and Zombies congregate here.
         * @since 1.0.0
         */
        public val overworld: String = definedExternally //"minecraft:overworld"

        /**
         * The End is separate from the Overworld and the Nether and is
         * generated whenever you create an End portal. Here, a giant
         * center island is surrounded by several smaller areas and
         * islands. You can find Endermen here. End midlands are larger
         * areas that transition you from the center to the outer edges
         * of the End. They contain Shulkers, Endermen, End gateway
         * portals, and End cities. End gateway portals are commonly
         * found at the outermost edge of the void. You usually find
         * End barrens toward the edges of the main areas or land in
         * the End.
         * @since 1.0.0
         */
        public val theEnd: String = definedExternally //"minecraft:the_end"
    }
}