package net.javaserver.techniphilia.base.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.Logger;

public class ModRegistry {
    public static final String MOD_ID = "techniphilia-base";
    public static final String MOD_NAME = "Techniphilia Base";
    public static final String MOD_VERSION = "0.0.1.2";
    public static final String MOD_DEPENDENCIES = "required-after:techniphilia-core@[0.5.10.6,)";
    public static Logger logger;
    private static ModItemGroup itemGroup = null;
    private ModRegistry() {}
    public static CreativeTabs getItemGroup() {
        if (itemGroup == null) {
            itemGroup = new ModItemGroup();
        }
        return itemGroup;
    }
    private static class ModItemGroup extends CreativeTabs {
        private ModItemGroup() {
            super("techniphiliaBaseBase");
        }
        @Override
        public ItemStack getTabIconItem() {
            return ItemStack.EMPTY;
        }
    }
}
