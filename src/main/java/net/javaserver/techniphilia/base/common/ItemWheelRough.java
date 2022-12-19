package net.javaserver.techniphilia.base.common;

import net.minecraft.item.Item;

public class ItemWheelRough extends Item {
    private static ItemWheelRough instance = null;
    private ItemWheelRough() {
        setRegistryName("techniphilia", "wheel_rough");
        setUnlocalizedName("wheel_rough");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemWheelRough instance() {
        if (instance == null) {
            instance = new ItemWheelRough();
        }
        return instance;
    }
}
