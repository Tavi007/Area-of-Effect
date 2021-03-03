package Tavi007.AreaOfEffect.events;

import Tavi007.AreaOfEffect.AreaOfEffect;
import Tavi007.AreaOfEffect.api.AuraAPI;
import net.minecraftforge.event.TickEvent.WorldTickEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = AreaOfEffect.MOD_ID, bus = Bus.FORGE)
public class ServerEvents {
	
	public static void onWorldTick(WorldTickEvent event) {
		AuraAPI.getAuraList(event.world).tick(event.world);
	}
}
