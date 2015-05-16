package yurii.hanatake.hanalogics.blocks;

import yurii.hanatake.hanalogics.constants.ModInfos;
import yurii.hanatake.hanalogics.creativetabs.CreativeTabsHanalogics;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class ModBlock extends Block
{

	public ModBlock(Material material) 
	{
		super(material);
		this.setCreativeTab(CreativeTabsHanalogics.TAB_HANALOGICS);
	}
	
	public ModBlock()
	{
		this(Material.rock);
		this.setCreativeTab(CreativeTabsHanalogics.TAB_HANALOGICS);
	}
	
	@Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", ModInfos.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
	
	protected String getUnwrappedUnlocalizedName (String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
