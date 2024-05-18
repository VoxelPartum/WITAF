package net.voxelpartum.witaf.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.voxelpartum.witaf.WITAF;

public class WITAFCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WITAF.MODID);

    public static final RegistryObject<CreativeModeTab> WITAF_TAB = CREATIVE_TAB.register("witaf",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(WITAFItems.DEVILS_IVY.get()))
                    .title(Component.translatable("itemGroup.witaf.creative_label"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Items.TORCHFLOWER);
                        pOutput.accept(WITAFItems.DEVILS_IVY.get());
                        pOutput.accept(WITAFItems.ANCIENT_DRAGONFRUIT.get());
                        pOutput.accept(WITAFItems.DRIED_DRAGONFRUIT.get());
                        pOutput.accept(WITAFItems.RAW_FROG_LEG.get());
                        pOutput.accept(WITAFItems.COOKED_FROG_LEG.get());
                    })
                    .build());

}
