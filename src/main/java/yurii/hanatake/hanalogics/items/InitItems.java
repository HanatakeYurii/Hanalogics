package yurii.hanatake.hanalogics.items;

import yurii.hanatake.hanalogics.constants.ModInfos;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ModInfos.MOD_ID)
public class InitItems 
{
	public static final ModItem mapleleaf = new ItemMapleLeaf();
	
	public static void init()
	{
		GameRegistry.registerItem(mapleleaf, "mapleLeaf");
	}
}
