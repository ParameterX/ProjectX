package com.github.parameterx.itemTier;

import com.github.parameterx.items.ItemRegister;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum PXItemTier implements Tier {

    STEEL(640,3F,5F,2,1, Ingredient.of(ItemRegister.steelIngot.get()));

    private int uses;
    private float speed;
    private float attackDamageBonus;
    private int level;
    private int enchantmentValue;
    private Ingredient repairIngredient;

    PXItemTier(int uses, float speed, float attackDamageBonus, int level, int enchantmentValue, Ingredient repairIngredient){
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }



    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
