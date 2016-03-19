package mcjty.rftools;

import mcjty.lib.preferences.PlayerPreferencesProperties;
import mcjty.lib.preferences.PreferencesDispatcher;
import mcjty.lib.preferences.PreferencesProperties;
import mcjty.rftools.network.RFToolsMessages;
import mcjty.rftools.playerprops.PlayerExtendedProperties;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ForgeEventHandlers {

    @SubscribeEvent
    public void onPlayerTickEvent(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.START && !event.player.worldObj.isRemote) {
            //@todo
//            IExtendedEntityProperties properties = event.player.getExtendedProperties(PlayerExtendedProperties.ID);
//            if (properties instanceof PlayerExtendedProperties) {
//                PlayerExtendedProperties playerExtendedProperties = (PlayerExtendedProperties) properties;
//                playerExtendedProperties.tick();
//            }
            PreferencesProperties preferencesProperties = PlayerPreferencesProperties.getProperties(event.player);
            preferencesProperties.tick(RFToolsMessages.INSTANCE);
        }
    }

    @SubscribeEvent
    public void onEntityConstructing(AttachCapabilitiesEvent.Entity event){
        // @todo move to a mcjtylib helper
        if (event.getEntity() instanceof EntityPlayer) {
            if (!event.getEntity().hasCapability(PlayerPreferencesProperties.PREFERENCES_CAPABILITY, null)) {
                event.addCapability(new ResourceLocation("McJtyLib", "Preferences"), new PreferencesDispatcher());
            }
        }
    }


    @SubscribeEvent
    public void onEntityConstructingEvent(EntityEvent.EntityConstructing event) {
        if (event.entity instanceof EntityPlayer) {
            //@todo
//            PlayerExtendedProperties properties = new PlayerExtendedProperties();
//            event.entity.registerExtendedProperties(PlayerExtendedProperties.ID, properties);
//
//            PlayerPreferencesProperties preferencesProperties = (PlayerPreferencesProperties) event.entity.getExtendedProperties(PlayerPreferencesProperties.ID);
//            if (preferencesProperties == null) {
//                preferencesProperties = new PlayerPreferencesProperties();
//                event.entity.registerExtendedProperties(PlayerPreferencesProperties.ID, preferencesProperties);
//            }
        }
    }


}
