package Tavi007.AreaOfEffect.init;

import Tavi007.AreaOfEffect.AreaOfEffect;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AreaOfEffect.MOD_ID);

	// only used as Icon for Item group
	private static Properties singleStack = new Item.Properties().group(ItemGroup.TOOLS).maxStackSize(1);
}
