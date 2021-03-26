
package net.mcreator.test.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.test.itemgroup.WaterItemGroup;
import net.mcreator.test.TestModElements;

@TestModElements.ModElement.Tag
public class WaterStackItem extends TestModElements.ModElement {
	@ObjectHolder("test:water_stack")
	public static final Item block = null;
	public WaterStackItem(TestModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(WaterItemGroup.tab).maxStackSize(64));
			setRegistryName("water_stack");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
