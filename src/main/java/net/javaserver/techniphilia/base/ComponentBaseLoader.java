package net.javaserver.techniphilia.base;

import net.javaserver.techniphilia.base.common.ItemWheelWood;
import net.javaserver.techniphilia.base.common.ModRegistry;
import net.javaserver.techniphilia.core.ComponentCoreLoader;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = ModRegistry.MOD_ID,
        name = ModRegistry.MOD_NAME,
        version = ModRegistry.MOD_VERSION,
        dependencies = ModRegistry.MOD_DEPENDENCIES)
@Mod.EventBusSubscriber
public class ComponentBaseLoader {
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModRegistry.logger = event.getModLog();
        ModRegistry.logger.info("TechniphiliaBase: preInit");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModRegistry.logger.info("Hello blocky world!");
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(ItemWheelWood.instance());
        OreDictionary.registerOre("wheelWood", ItemWheelWood.instance());
    }
    
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        ComponentCoreLoader.registerRender(ItemWheelWood.instance());
    }
}
