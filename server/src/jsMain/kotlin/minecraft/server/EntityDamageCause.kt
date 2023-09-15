@file: JsModule("@minecraft/server")
@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package minecraft.server

/**
 * @since 1.2.0
 */
public sealed external interface EntityDamageCause {
    public companion object {
        /**
         * @since 1.2.0
         */
        public val anvil: EntityDamageCause /* = 'anvil' */

        /**
         * @since 1.2.0
         */
        public val blockExplosion: EntityDamageCause /* = 'blockExplosion' */

        /**
         * @since 1.2.0
         */
        public val charging: EntityDamageCause /* = 'charging' */

        /**
         * @since 1.2.0
         */
        public val contact: EntityDamageCause /* = 'contact' */

        /**
         * @since 1.2.0
         */
        public val drowning: EntityDamageCause /* = 'drowning' */

        /**
         * @since 1.2.0
         */
        public val entityAttack: EntityDamageCause /* = 'entityAttack' */

        /**
         * @since 1.2.0
         */
        public val entityExplosion: EntityDamageCause /* = 'entityExplosion' */

        /**
         * @since 1.2.0
         */
        public val fall: EntityDamageCause /* = 'fall' */

        /**
         * @since 1.2.0
         */
        public val fallingBlock: EntityDamageCause /* = 'fallingBlock' */

        /**
         * @since 1.2.0
         */
        public val fire: EntityDamageCause /* = 'fire' */

        /**
         * @since 1.2.0
         */
        public val fireTick: EntityDamageCause /* = 'fireTick' */

        /**
         * @since 1.2.0
         */
        public val fireworks: EntityDamageCause /* = 'fireworks' */

        /**
         * @since 1.2.0
         */
        public val flyIntoWall: EntityDamageCause /* = 'flyIntoWall' */

        /**
         * @since 1.2.0
         */
        public val freezing: EntityDamageCause /* = 'freezing' */

        /**
         * @since 1.2.0
         */
        public val lava: EntityDamageCause /* = 'lava' */

        /**
         * @since 1.2.0
         */
        public val lightning: EntityDamageCause /* = 'lightning' */

        /**
         * @since 1.2.0
         */
        public val magic: EntityDamageCause /* = 'magic' */

        /**
         * @since 1.2.0
         */
        public val magma: EntityDamageCause /* = 'magma' */

        /**
         * @since 1.2.0
         */
        public val none: EntityDamageCause /* = 'none' */

        /**
         * @since 1.2.0
         */
        public val override: EntityDamageCause /* = 'override' */

        /**
         * @since 1.2.0
         */
        public val piston: EntityDamageCause /* = 'piston' */

        /**
         * @since 1.2.0
         */
        public val projectile: EntityDamageCause /* = 'projectile' */

        /**
         * @since 1.2.0
         */
        public val stalactite: EntityDamageCause /* = 'stalactite' */

        /**
         * @since 1.2.0
         */
        public val stalagmite: EntityDamageCause /* = 'stalagmite' */

        /**
         * @since 1.2.0
         */
        public val starve: EntityDamageCause /* = 'starve' */

        /**
         * @since 1.2.0
         */
        public val suffocation: EntityDamageCause /* = 'suffocation' */

        /**
         * @since 1.2.0
         */
        public val suicide: EntityDamageCause /* = 'suicide' */

        /**
         * @since 1.2.0
         */
        public val temperature: EntityDamageCause /* = 'temperature' */

        /**
         * @since 1.2.0
         */
        public val thorns: EntityDamageCause /* = 'thorns' */

        /**
         * @since 1.2.0
         */
        public val void: EntityDamageCause /* = 'void' */

        /**
         * @since 1.2.0
         */
        public val wither: EntityDamageCause /* = 'wither' */
    }

}
