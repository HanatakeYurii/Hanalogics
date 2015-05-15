package yurii.hanatake.hanalogics.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static void Init(File configFile)
	{
		//Create the configuration object from the given configuration file
		Configuration configuration = new Configuration(configFile);
		boolean configValue = false;
		try
		{
			// Load the configuration file
			configuration.load();
			
			//read in properties from configuration file
			configValue = configuration.get(Configuration.CATEGORY_GENERAL, "ConfigValue", true, "This is an example config value").getBoolean(true);
		}
		catch (Exception e)
		{
			//Log the exception
		}
		finally
		{
			//Save the configuration file
			configuration.save();
		}
		
		System.out.println(configValue);
	}
}
