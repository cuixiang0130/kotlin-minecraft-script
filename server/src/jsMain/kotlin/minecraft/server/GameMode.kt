@file:JsModule("@minecraft/server")
@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package minecraft.server

/**
 * Represents a game mode for the current world experience.
 * @since 1.1.0
 */
public sealed external interface GameMode {
    public companion object {
        /**
         * World is in a more locked-down experience, where blocks may
         * not be manipulated.
         * @since 1.1.0
         */
        public val adventure: GameMode /* = 'adventure' */

        /**
         * World is in a full creative mode. In creative mode, the
         * player has all the resources available in the item selection
         * tabs and the survival selection tab. They can also destroy
         * blocks instantly including those which would normally be
         * indestructible. Command and structure blocks can also be
         * used in creative mode. Items also do not lose durability or
         * disappear.
         * @since 1.1.0
         */
        public val creative: GameMode /* = 'creative' */

        /**
         * @since 1.1.0
         */
        public val spectator: GameMode /* = 'spectator' */

        /**
         * World is in a survival mode, where players can take damage
         * and entities may not be peaceful. Survival mode is where the
         * player must collect resources, build structures while
         * surviving in their generated world. Activities can, over
         * time, chip away at player health and hunger bar.
         * @since 1.1.0
         */
        public val survival: GameMode /* = 'survival' */
    }
}