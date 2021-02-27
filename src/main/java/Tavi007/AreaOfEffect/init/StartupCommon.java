package Tavi007.AreaOfEffect.init;

import Tavi007.AreaOfEffect.AreaOfEffect;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class StartupCommon {
	
	@SubscribeEvent
	public static void onCommonSetup(FMLCommonSetupEvent event){
		AreaOfEffect.LOGGER.info("setup method registered.");
	}

}
