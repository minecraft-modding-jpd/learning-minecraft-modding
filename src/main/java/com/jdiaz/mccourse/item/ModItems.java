package com.jdiaz.mccourse.item;

import com.jdiaz.mccourse.MCCourseMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // to register items to the game, we must use deferred registers
    // It is just a list of items that will be registered when the mod is loaded/ready by forge
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);


    // registering an ore item
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS
            .register("alexandrite", () -> new Item(new Item.Properties()));


    // can create multiple items and then register them

    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS
            .register("raw_alexandrite", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
