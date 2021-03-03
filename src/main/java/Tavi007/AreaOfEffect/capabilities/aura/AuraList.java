package Tavi007.AreaOfEffect.capabilities.aura;

import java.util.ArrayList;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;

public class AuraList {
	private final ArrayList<IAura> auraList = new ArrayList<IAura>();

	
	
	public void writeNBT(CompoundNBT nbt) {
		auraList.forEach(aura -> {
			//add reflection here, so I know later, which constructor needs to be called
			String className = aura.getClass().getName();
			
			aura.writeNBT(nbt);
		});
	}

	public void readNBT(INBT nbt) {
		
	}
}
