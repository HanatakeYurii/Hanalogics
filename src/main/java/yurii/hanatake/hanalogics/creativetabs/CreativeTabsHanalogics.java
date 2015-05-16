package yurii.hanatake.hanalogics.creativetabs;

import yurii.hanatake.hanalogics.constants.ModInfos;
import yurii.hanatake.hanalogics.items.InitItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsHanalogics 
{
	public static final CreativeTabs TAB_HANALOGICS = new CreativeTabs(ModInfos.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return InitItems.mapleleaf;
		}
	};

}
