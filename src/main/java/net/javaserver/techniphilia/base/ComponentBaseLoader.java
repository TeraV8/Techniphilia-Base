package net.javaserver.techniphilia.base;

import net.javaserver.techniphilia.base.common.ModRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModRegistry.MOD_ID,
        name = ModRegistry.MOD_NAME,
        version = ModRegistry.MOD_VERSION,
        dependencies = ModRegistry.MOD_DEPENDENCIES)
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
}
