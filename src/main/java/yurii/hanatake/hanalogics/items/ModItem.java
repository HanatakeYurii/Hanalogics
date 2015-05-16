package yurii.hanatake.hanalogics.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import yurii.hanatake.hanalogics.constants.ModInfos;
import yurii.hanatake.hanalogics.creativetabs.CreativeTabsHanalogics;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItem extends Item
{
	public ModItem()
	{
		super();
		this.setCreativeTab(CreativeTabsHanalogics.TAB_HANALOGICS);
	}
	
	@Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", ModInfos.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", ModInfos.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
	
	protected String getUnwrappedUnlocalizedName (String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
