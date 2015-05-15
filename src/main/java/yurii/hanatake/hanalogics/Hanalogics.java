package yurii.hanatake.hanalogics;

import yurii.hanatake.hanalogics.constants.ModInfos;
import yurii.hanatake.hanalogics.handler.ConfigHandler;
import yurii.hanatake.hanalogics.proxy.IProxy;
import yurii.hanatake.hanalogics.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod (modid=ModInfos.MOD_ID, name = ModInfos.MOD_NAME, version = ModInfos.MOD_VERSION, acceptedMinecraftVersions = ModInfos.MC_VERSIONS, dependencies = ModInfos.DEPENDENCIES, guiFactory = ModInfos.GUI_FACTORY_CLASS)
public class Hanalogics {

	@Mod.Instance(ModInfos.MOD_ID)
	public static Hanalogics instance;
	
	@SidedProxy (clientSide = ModInfos.PROXY_CLIENT_CLASS,serverSide = ModInfos.PROXY_SERVER_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Configs, blocks & items registering
		ConfigHandler.Init(event.getSuggestedConfigurationFile());
		LogHelper.info("Pre-init complete!");
	}
	
	@Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//GUI, crafting recipes, tile entities
		LogHelper.info("Init complete!");
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	//huh...
    	LogHelper.info("Post-init complete!");
    }

}
