
package net.mcreator.test.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.test.itemgroup.WaterItemGroup;
import net.mcreator.test.TestModElements;

@TestModElements.ModElement.Tag
public class WaterHoeItem extends TestModElements.ModElement {
	@ObjectHolder("test:water_hoe")
	public static final Item block = null;
	public WaterHoeItem(TestModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 200;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 24;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3.2f, new Item.Properties().group(WaterItemGroup.tab)) {
		}.setRegistryName("water_hoe"));
	}
}
