package Tavi007.AreaOfEffect.capabilities.aura;

import java.util.HashSet;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityAura implements IAura {
	
	HashSet<Entity> affectedEntities = new HashSet<Entity>();
	Entity entity;
	
	public EntityAura(Entity entity) {
		this.entity = entity;
	}

	@Override
	public BlockPos getCenter() {
		return entity.getPosition();
	}

	@Override
	public HashSet<Entity> findEntitiesInRange(World world) {
		return null;
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
