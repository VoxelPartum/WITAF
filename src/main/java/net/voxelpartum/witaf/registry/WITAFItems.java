package net.voxelpartum.witaf.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.voxelpartum.witaf.WITAF;

public class WITAFItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WITAF.MODID);

    public static final RegistryObject<Item> DEVILS_IVY = ITEMS.register("devils_ivy", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ANCIENT_DRAGONFRUIT = ITEMS.register("ancient_dragonfruit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEat().nutrition(3).saturationMod(4).build())));
    public static final RegistryObject<Item> DRIED_DRAGONFRUIT = ITEMS.register("dried_ancient_dragonfruit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .alwaysEat().nutrition(7).saturationMod(5).build())));

    public static final RegistryObject<Item> RAW_FROG_LEG = ITEMS.register("raw_frog_leg",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3).saturationMod(6).build())));
    public static final RegistryObject<Item> COOKED_FROG_LEG = ITEMS.register("cooked_frog_leg",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(7).saturationMod(9).build())));

    private static Item register(String id, Item item){
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WITAF.MODID, id), item);
    }

}
