package com.github.parameterx;

import com.github.parameterx.Utils;
import com.github.parameterx.blocks.AluminumBlock;
import com.github.parameterx.blocks.AluminumOre;
import com.github.parameterx.blocks.DeepslateAluminumOre;
import com.github.parameterx.blocks.SteelBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MODID);
    public static final DeferredRegister<Item> BLOCKITEM = DeferredRegister.create(ForgeRegistries.ITEMS,Utils.MODID);

    /**
     * Blocks and corresponding BlockItems
     */

    // Normal Blocks not ores
    public static final RegistryObject<Block> steelBlock = BLOCK.register("steel_block", SteelBlock::new);
    public static final RegistryObject<Item> steelBlockItem = BLOCKITEM.register("steel_block",
            () -> new BlockItem(steelBlock.get(), new Item.Properties().tab(PXTabs.BLOCKS)));

    public static final RegistryObject<Block> aluminumBlock = BLOCK.register("aluminum_block", AluminumBlock::new);
    public static final RegistryObject<Item> aluminumBlockItem = BLOCKITEM.register("aluminum_block",
            () -> new BlockItem(aluminumBlock.get(), new Item.Properties().tab(PXTabs.BLOCKS)));

    // Ores
    public static final RegistryObject<Block> aluminumOre = BLOCK.register("aluminum_ore", AluminumOre::new);
    public static final RegistryObject<Item> aluminumOreItem = BLOCKITEM.register("aluminum_ore",
            () -> new BlockItem(aluminumOre.get(), new Item.Properties().tab(PXTabs.BLOCKS)));

    public static final RegistryObject<Block> deepslateAluminumOre = BLOCK.register("deepslate_aluminum_ore", DeepslateAluminumOre::new);
    public static final RegistryObject<Item> deepslateAluminumOreItem = BLOCKITEM.register("deepslate_aluminum_ore",
            () -> new BlockItem(deepslateAluminumOre.get(), new Item.Properties().tab(PXTabs.BLOCKS)));
}
