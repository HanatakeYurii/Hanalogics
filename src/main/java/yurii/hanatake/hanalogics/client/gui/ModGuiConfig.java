package yurii.hanatake.hanalogics.client.gui;

import java.util.List;

import yurii.hanatake.hanalogics.constants.ModInfos;
import yurii.hanatake.hanalogics.handler.ConfigHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.ConfigElement;
import cpw.mods.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig
{
	public ModGuiConfig (GuiScreen guiscreen)
	{
		super(guiscreen,
				new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				ModInfos.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
	}
}
