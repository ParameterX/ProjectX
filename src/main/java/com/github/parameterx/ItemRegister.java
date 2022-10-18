package com.github.parameterx;

import com.github.parameterx.Utils;
import com.github.parameterx.itemTier.PXArmorTier;
import com.github.parameterx.itemTier.PXItemTier;
import com.github.parameterx.items.foods.ButterscotchCinnamonPie;
import com.github.parameterx.items.materials.AluminumIngot;
import com.github.parameterx.items.materials.MagnesiumIngot;
import com.github.parameterx.items.materials.SteelIngot;
import com.github.parameterx.items.tools.Crowbar;
import com.github.parameterx.items.tools.WatermelonKnife;
import com.github.parameterx.PXTabs;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegister {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MODID);

    /**
     * Raw materials
     */
    public static final RegistryObject<Item> raw_aluminum = ITEM.register("raw_aluminum",
            () -> new Item(new Item.Properties().tab(PXTabs.ITEMS)));
    public static final RegistryObject<Item> raw_magnesium = ITEM.register("raw_magnesium",
            () -> new Item(new Item.Properties().tab(PXTabs.ITEMS)));

    /**
     * Materials
     */
    public static final RegistryObject<Item> steelIngot = ITEM.register("steel_ingot", SteelIngot::new);
    public static final RegistryObject<Item> aluminumIngot = ITEM.register("aluminum_ingot", AluminumIngot::new);
    public static final RegistryObject<Item> magnesiumIngot = ITEM.register("magnesium_ingot", MagnesiumIngot::new);


    /**
     * Foods
     */
    public static final RegistryObject<Item> butterscotchCinnamonPie = ITEM.register("butterscotch_cinnamon_pie", ButterscotchCinnamonPie::new);


    /**
     * Tools
     */
    public static final RegistryObject<Item> crowbar = ITEM.register("crowbar", Crowbar::new);
    // Steel tools
    public static final RegistryObject<Item> steelAxe = ITEM.register("steel_axe",
            () -> new AxeItem(PXItemTier.STEEL,6,-3.1f, new Item.Properties().tab(PXTabs.TOOLS)));
    public static final RegistryObject<Item> steelPickaxe = ITEM.register("steel_pickaxe",
            () -> new PickaxeItem(PXItemTier.STEEL,0,-2.8f, new Item.Properties().tab(PXTabs.TOOLS)));
    public static final RegistryObject<Item> steelHoe = ITEM.register("steel_hoe",
            () -> new HoeItem(PXItemTier.STEEL,-2,-1f, new Item.Properties().tab(PXTabs.TOOLS)));
    public static final RegistryObject<Item> steelShove = ITEM.register("steel_shove",
            () -> new ShovelItem(PXItemTier.STEEL,1.5f,-3f, new Item.Properties().tab(PXTabs.TOOLS)));

    /**
     * Combat
     */
    public static final RegistryObject<Item> watermelonKnife = ITEM.register("watermelon_knife", WatermelonKnife::new);
    public static final RegistryObject<Item> steelSword = ITEM.register("steel_sword",
            () -> new SwordItem(PXItemTier.STEEL,4,-2.4f, new Item.Properties().tab(PXTabs.COMBAT)));

    /**
     * Armors
     */
    public static final RegistryObject<Item> steelHelmet = ITEM.register("steel_helmet",
            () -> new ArmorItem(PXArmorTier.STEEL,EquipmentSlot.HEAD,(new Item.Properties().tab(PXTabs.COMBAT))));

    public static final RegistryObject<Item> steelChestPlate = ITEM.register("steel_chestplate",
            () -> new ArmorItem(PXArmorTier.STEEL,EquipmentSlot.CHEST,(new Item.Properties().tab(PXTabs.COMBAT))));

    public static final RegistryObject<Item> steelLeggings = ITEM.register("steel_leggings",
            () -> new ArmorItem(PXArmorTier.STEEL,EquipmentSlot.LEGS,(new Item.Properties().tab(PXTabs.COMBAT))));

    public static final RegistryObject<Item> steelBoots = ITEM.register("steel_boots",
            () -> new ArmorItem(PXArmorTier.STEEL,EquipmentSlot.FEET,(new Item.Properties().tab(PXTabs.COMBAT))));

}
