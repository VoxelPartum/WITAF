package net.voxelpartum.witaf.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.voxelpartum.witaf.WITAF;

import java.util.function.Supplier;

public class WITAFBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WITAF.MODID);

    public static final RegistryObject<Block> CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject <T> block){
        return WITAFItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
