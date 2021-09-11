package net.javaserver.techniphilia.base;

import net.javaserver.techniphilia.base.common.ModRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModRegistry.MOD_ID,
        name = ModRegistry.MOD_NAME,
        version = ModRegistry.MOD_VERSION,
        dependencies = ModRegistry.MOD_DEPENDENCIES)
public class ComponentBaseLoader {
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        
    }
}
