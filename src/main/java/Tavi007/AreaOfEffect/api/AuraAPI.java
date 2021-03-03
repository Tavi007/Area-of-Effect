package Tavi007.AreaOfEffect.api;

import Tavi007.AreaOfEffect.capabilities.aura.AuraCapability;
import Tavi007.AreaOfEffect.capabilities.aura.AuraList;
import net.minecraft.world.World;

public class AuraAPI {
	
	public static AuraList getAuraList(World world) {
		return (AuraList) world.getCapability(AuraCapability.AuraList_Capability, null).orElse(new AuraList());
	}
	
	
}
