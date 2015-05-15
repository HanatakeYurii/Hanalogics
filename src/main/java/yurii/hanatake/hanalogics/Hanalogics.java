package yurii.hanatake.hanalogics;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod (modid=Properties.MODID, name = Properties.MODNAME, version = Properties.MODVERSION, acceptedMinecraftVersions = Properties.MCVERSIONS, dependencies = Properties.DEPENDENCIES)
public class Hanalogics {

	@Mod.Instance(Properties.MODID)
	public static Hanalogics instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Configs, blocks & items registering
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
