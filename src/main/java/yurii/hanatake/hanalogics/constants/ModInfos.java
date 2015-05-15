package yurii.hanatake.hanalogics.constants;

public class ModInfos {
	//Mod infos
	public static final String MOD_ID = "hanalogics";
    public static final String MOD_NAME = "Hanalogics";
    static final String mod_ver = "0.1";
    static final String for_mc = "1.7.10";
    static final String forge = "10.13.2.1291";
    
    public static final String MOD_VERSION = for_mc + "-" + mod_ver;
    public static final String MC_VERSIONS = "[" + for_mc + ",)";
    public static final String DEPENDENCIES = "required-after:Forge@[" + forge + ",)";
    
    //Classes
    public static final String PROXY_CLIENT_CLASS = "yurii.hanatake.hanalogics.proxy.ClientProxy";
    public static final String PROXY_SERVER_CLASS = "yurii.hanatake.hanalogics.proxy.ServerProxy";
    public static final String GUI_FACTORY_CLASS = "yurii.hanatake.hanalogics.client.gui.GuiFactory";

}
