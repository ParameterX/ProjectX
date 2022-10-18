package com.github.parameterx;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class PXTags {
    public static class Blocks {
        public static final TagKey<Block> NEED_STEEL_TOOL
                = tag("needs_steel_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Utils.MODID,name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge",name));
        }
    }
}
