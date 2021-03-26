
package net.mcreator.test.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.test.itemgroup.WaterItemGroup;
import net.mcreator.test.TestModElements;

@TestModElements.ModElement.Tag
public class WaterSwordItem extends TestModElements.ModElement {
	@ObjectHolder("test:water_sword")
	public static final Item block = null;
	public WaterSwordItem(TestModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 200;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 6f;
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
		}, 3, -3.4f, new Item.Properties().group(WaterItemGroup.tab)) {
		}.setRegistryName("water_sword"));
	}
}
