package Tavi007.AreaOfEffect.capabilities.aura;

import java.util.HashSet;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FixedPosAura implements IAura {
	private final BlockPos pos;
	
	public FixedPosAura(BlockPos pos) {
		this.pos = pos;
	}
	
	@Override
	public BlockPos getCenter() {
		return pos;
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
	}

	@Override
	public void readNBT(CompoundNBT nbt) {}
	
}
