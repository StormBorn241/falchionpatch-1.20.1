package com.nameless.falchion.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;

import com.nameless.falchion.gameasset.FalchionAnimations;

@Mod(FalchionMoveset.MODID)
public class FalchionMoveset {
    public static final String MODID = "falchionpatch";

    public FalchionMoveset() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(FalchionAnimations::registerAnimations);
    }
}
