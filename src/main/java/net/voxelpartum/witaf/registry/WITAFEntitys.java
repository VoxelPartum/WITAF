package net.voxelpartum.witaf.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.voxelpartum.witaf.entity.FireFly;
import net.voxelpartum.witaf.WITAF;

public class WITAFEntitys {

public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WITAF.MODID);

public static final RegistryObject<EntityType<FireFly>> FIREFLY = ENTITIES.register("firefly",
        () -> EntityType.Builder.<FireFly>of(FireFly::new, MobCategory.CREATURE)
                .sized(0.1f,0.1f).build(new ResourceLocation(WITAF.MODID, "firefly").toString()));
}
