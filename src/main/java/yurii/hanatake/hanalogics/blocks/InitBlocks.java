package yurii.hanatake.hanalogics.blocks;

import yurii.hanatake.hanalogics.constants.ModInfos;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ModInfos.MOD_ID)
public class InitBlocks 
{
	public static final ModBlock flag = new BlockFlag();
	
	public static void init()
	{
		GameRegistry.registerBlock(flag, "flag");
	}
	
}
