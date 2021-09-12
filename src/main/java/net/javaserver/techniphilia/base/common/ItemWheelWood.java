package net.javaserver.techniphilia.base.common;

import net.minecraft.item.Item;

public class ItemWheelWood extends Item {
    private static ItemWheelWood instance = null;
    private ItemWheelWood() {
        setRegistryName("techniphilia", "wheel_wood");
        setUnlocalizedName("wheel_wood");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemWheelWood instance() {
        if (instance == null) {
            instance = new ItemWheelWood();
        }
        return instance;
    }
}
