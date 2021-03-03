package Tavi007.AreaOfEffect.capabilities.aura;

import java.util.HashSet;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FixedAura implements IAura {
	
	private final HashSet<Entity> affectedEntities = new HashSet<Entity>();
	private final BlockPos pos;
	
	public FixedAura(BlockPos pos) {
		this.pos = pos;
	}
	
	@Override
	public BlockPos getCenter() {
		return pos;
	}

	@Override
	public HashSet<Entity> findEntitiesInRange(World world) {
		return affectedEntities;
	}

	@Override
	public void applyEffect(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEffect(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayEdge(World world) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeNBT(CompoundNBT nbt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readNBT(CompoundNBT nbt) {
		// TODO Auto-generated method stub
		
	}

}
