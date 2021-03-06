package Tavi007.AreaOfEffect.capabilities.aura;

import java.util.HashSet;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityAura implements IAura {
	
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
		return new HashSet<Entity>();
	}

	@Override
	public void tick(World world) {}

	@Override
	public void displayEdge(World world) {}

	@Override
	public void writeNBT(CompoundNBT nbt) {
		nbt.putInt("entity_id", entity.getEntityId());
	}

	@Override
	public void readNBT(CompoundNBT nbt) {
		int entityId = nbt.getInt("entity_id");
	}
	
}
