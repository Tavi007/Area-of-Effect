package Tavi007.AreaOfEffect.capabilities.aura;

import Tavi007.AreaOfEffect.AreaOfEffect;
import Tavi007.AreaOfEffect.capabilities.SerializableCapabilityProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class AuraCapability {

	@CapabilityInject(AuraList.class)
	public static final Capability<AuraList> AuraList_Capability = null;

	/**
	 * The default {@link Direction} to use for this capability.
	 */
	public static final Direction defaultFacing = null;

	/**
	 * The ID of this capability.
	 */
	public static final ResourceLocation ID = new ResourceLocation(AreaOfEffect.MOD_ID, "auralist");

	public static void register() {
		CapabilityManager.INSTANCE.register(AuraList.class, new Capability.IStorage<AuraList>() {

			@Override
			public INBT writeNBT(final Capability<AuraList> capability, final AuraList instance, final Direction side) {

				//fill nbt with data
				CompoundNBT nbt = new CompoundNBT();
				instance.writeNBT(nbt);
				return nbt;
			}

			@Override
			public void readNBT(final Capability<AuraList> capability, final AuraList instance, final Direction side, final INBT nbt) {
				if (nbt instanceof CompoundNBT) {
					instance.readNBT(nbt);
				}
			}
		}, () -> new AuraList());
	}

	public static ICapabilityProvider createProvider(final AuraList auraList) {
		return new SerializableCapabilityProvider<>(AuraList_Capability, defaultFacing, auraList);
	}


	/**
	 * Event handler for the {@link IElementalAttack} capability.
	 */
	@Mod.EventBusSubscriber(modid = AreaOfEffect.MOD_ID)
	private static class EventHandler {

		@SubscribeEvent
		public static void attachCapabilitiesItem(final AttachCapabilitiesEvent<World> event) {
			AuraList list = new AuraList();
			event.addCapability(ID, createProvider(list));
		}
	}
}