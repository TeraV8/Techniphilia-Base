package net.javaserver.techniphilia.base.common;

import net.minecraft.item.Item;

public class ItemWheelStone extends Item {
    private static ItemWheelStone instance = null;
    private ItemWheelStone() {
        setRegistryName("techniphilia", "wheel_stone");
        setUnlocalizedName("wheel_stone");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemWheelStone instance() {
        if (instance == null) {
            instance = new ItemWheelStone();
        }
        return instance;
    }
}
