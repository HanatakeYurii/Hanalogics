package yurii.hanatake.hanalogics.handler;

import java.io.File;

import yurii.hanatake.hanalogics.constants.ModInfos;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static Configuration configuration;
	protected static boolean testValue;
	
	public static void Init(File configFile)
	{
		//Create the configuration object from the given configuration file
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
		}
	}

	@SubscribeEvent
	public void configChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(ModInfos.MOD_ID))
		{
			loadConfig();
		}
	}
	
	public void loadConfig()
	{
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");
		
		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}
}
