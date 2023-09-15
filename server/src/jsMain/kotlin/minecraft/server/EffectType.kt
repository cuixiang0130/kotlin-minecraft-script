@file: JsModule("@minecraft/server")

package minecraft.server

/**
 * Represents a type of effect - like poison - that can be
 * applied to an entity.
 * @since 1.3.0
 */
public open external class EffectType {
    /**
     * Identifier name of this effect type.
     * @return
     * Identifier of the effect type.
     * @since 1.3.0
     */
    public open fun getName(): String
}
