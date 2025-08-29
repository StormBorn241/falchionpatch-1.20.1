package com.nameless.falchion.gameasset;

import java.util.Map;

import yesman.epicfight.api.animation.AnimationManager;
import yesman.epicfight.api.animation.property.AnimationProperty;
import yesman.epicfight.api.animation.types.AttackAnimation;
import yesman.epicfight.api.animation.types.BasicAttackAnimation;
import yesman.epicfight.api.animation.types.StaticAnimation;
import yesman.epicfight.gameasset.Armatures;
import yesman.epicfight.model.armature.HumanoidArmature;
import yesman.epicfight.world.damagesource.StunType;
import yesman.epicfight.api.utils.math.ValueModifier;

public class FalchionAnimations {
    public static StaticAnimation FALCHION_IDLE;
    public static AttackAnimation FALCHION_AUTO1;
    public static AttackAnimation FALCHION_AUTO2;
    public static AttackAnimation FALCHION_AUTO3;
    public static AttackAnimation FALCHION_FORWARD;
    public static AttackAnimation FALCHION_BACKWARD;
    public static AttackAnimation FALCHION_SIDE;

    public static void registerAnimations(AnimationManager.AnimationRegistryEvent event) {
        Map<String, StaticAnimation> reg = event.getRegistryMap();
        HumanoidArmature arm = Armatures.BIPED;

        // Idle
        FALCHION_IDLE = new StaticAnimation(true, "biped/falchion/falchion_idle", arm);
        reg.put("falchion_idle", FALCHION_IDLE);

        // Auto 1
        FALCHION_AUTO1 = new BasicAttackAnimation("biped/falchion/falchion_auto1", arm)
                .addProperty(AnimationProperty.AttackAnimationProperty.BASIS_ATTACK_SPEED, Float.valueOf(1.0F));
        reg.put("falchion_auto1", FALCHION_AUTO1);

        // Auto 2
        FALCHION_AUTO2 = new BasicAttackAnimation("biped/falchion/falchion_auto2", arm)
                .addProperty(AnimationProperty.AttackAnimationProperty.ATTACK_SPEED_FACTOR, Float.valueOf(1.0F));
        reg.put("falchion_auto2", FALCHION_AUTO2);

        // Auto 3
        FALCHION_AUTO3 = new BasicAttackAnimation("biped/falchion/falchion_auto3", arm);
        reg.put("falchion_auto3", FALCHION_AUTO3);

        // Forward
        FALCHION_FORWARD = new BasicAttackAnimation("biped/falchion/falchion_forward", arm);
        reg.put("falchion_forward", FALCHION_FORWARD);

        // Backward (stun + impact/damage modifiers approximated)
        FALCHION_BACKWARD = new BasicAttackAnimation("biped/falchion/falchion_backward", arm)
                .addPhaseProperty(AttackAnimation.Phase.STUN_TYPE, StunType.LONG)
                .addPhaseProperty(AttackAnimation.Phase.IMPACT_MODIFIER, ValueModifier.setter(1.20F))
                .addPhaseProperty(AttackAnimation.Phase.DAMAGE_MODIFIER, ValueModifier.multiplier(1.10F));
        reg.put("falchion_backward", FALCHION_BACKWARD);

        // Side
        FALCHION_SIDE = new BasicAttackAnimation("biped/falchion/falchion_side", arm);
        reg.put("falchion_side", FALCHION_SIDE);
    }
}
