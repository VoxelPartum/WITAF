package net.voxelpartum.witaf.registry;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class VanillaBlockOverrides {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");

    public static final RegistryObject<Block> TORCHFLOWER = BLOCKS.register("torchflower",
            () -> new FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).
                    noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)
                    .pushReaction(PushReaction.DESTROY).lightLevel((pLight) -> {return 15;})));

    private static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
