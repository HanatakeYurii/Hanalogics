package yurii.hanatake.hanalogics;

import yurii.hanatake.hanalogics.config.ConfigHandler;
import yurii.hanatake.hanalogics.properties.Properties;
import yurii.hanatake.hanalogics.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod (modid=Properties.MOD_ID, name = Properties.MOD_NAME, version = Properties.MOD_VERSION, acceptedMinecraftVersions = Properties.MC_VERSIONS, dependencies = Properties.DEPENDENCIES)
public class Hanalogics {

	@Mod.Instance(Properties.MOD_ID)
	public static Hanalogics instance;
	
	@SidedProxy (clientSide = Properties.PROXY_CLIENT_CLASS,serverSide = Properties.PROXY_SERVER_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Configs, blocks & items registering
		ConfigHandler.Init(event.getSuggestedConfigurationFile());
	}
	
	@Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//GUI, crafting recipes, tile entities
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	//huh...
    }

}
