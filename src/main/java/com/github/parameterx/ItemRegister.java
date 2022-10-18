package com.github.parameterx;

import com.github.parameterx.Utils;
import com.github.parameterx.itemTier.PXArmorTier;
import com.github.parameterx.items.foods.ButterscotchCinnamonPie;
import com.github.parameterx.items.materials.AluminumIngot;
import com.github.parameterx.items.materials.MagnesiumIngot;
import com.github.parameterx.items.materials.SteelIngot;
import com.github.parameterx.items.tools.Crowbar;
import com.github.parameterx.items.tools.WatermelonKnife;
import com.github.parameterx.PXTabs;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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

    /**
     * Combat
     */
    public static final RegistryObject<Item> watermelonKnife = ITEM.register("watermelon_knife", WatermelonKnife::new);

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
