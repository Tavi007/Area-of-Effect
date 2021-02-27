package Tavi007.AreaOfEffect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("materia")
public class AreaOfEffect 
{
	public static AreaOfEffect instance;
	public static final String MOD_ID = "areaofeffect";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	
	
	public AreaOfEffect() {
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
		
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
	}
	
}
