package Tavi007.AreaOfEffect.capabilities.aura;

import java.util.HashSet;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IAura {

	// defines Volume. 
	public BlockPos getCenter();
	public HashSet<Entity> findEntitiesInRange(World world);
	public void displayEdge(World world);
	
	public void applyEffect(Entity entity);
	public void removeEffect(Entity entity);
	
	public void writeNBT(CompoundNBT nbt);
	public void readNBT(CompoundNBT nbt);
}
