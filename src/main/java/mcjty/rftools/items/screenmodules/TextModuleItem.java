package mcjty.rftools.items.screenmodules;

import mcjty.rftools.RFTools;
import mcjty.rftools.blocks.screens.ModuleProvider;
import mcjty.rftools.blocks.screens.ScreenConfiguration;
import mcjty.rftools.blocks.screens.modules.ScreenModule;
import mcjty.rftools.blocks.screens.modules.TextScreenModule;
import mcjty.rftools.blocks.screens.modulesclient.ClientScreenModule;
import mcjty.rftools.blocks.screens.modulesclient.TextClientScreenModule;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class TextModuleItem extends Item implements ModuleProvider {

    public TextModuleItem() {
        setMaxStackSize(16);
        setUnlocalizedName("text_module");
        setCreativeTab(RFTools.tabRfTools);
        GameRegistry.registerItem(this, "text_module");
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean whatIsThis) {
        super.addInformation(itemStack, player, list, whatIsThis);
        list.add(EnumChatFormatting.GREEN + "Uses " + ScreenConfiguration.TEXT_RFPERTICK + " RF/tick");
        NBTTagCompound tagCompound = itemStack.getTagCompound();
        if (tagCompound != null) {
            list.add(EnumChatFormatting.YELLOW + "Text: " + tagCompound.getString("text"));
        }
    }

    @Override
    public Class<? extends ScreenModule> getServerScreenModule() {
        return TextScreenModule.class;
    }

    @Override
    public Class<? extends ClientScreenModule> getClientScreenModule() {
        return TextClientScreenModule.class;
    }

    @Override
    public String getName() {
        return "Text";
    }
}