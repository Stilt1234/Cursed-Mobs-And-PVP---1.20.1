package net.stilt.cursedmobsandpvp.event;

import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.World.ExplosionSourceType;
import net.stilt.cursedmobsandpvp.block.ModBlocks;

public class CursedWoolAttackEventHandler implements AttackBlockCallback{

    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockPos pos, Direction direction) {
        BlockState state = world.getBlockState(pos);
            /* Manual spectator check is necessary because AttackBlockCallbacks
               fire before the spectator check */
            if (!player.isSpectator() && state.getBlock() == ModBlocks.Cursed_Wool) {
                world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 100.0f, ExplosionSourceType.NONE);
                world.createExplosion(null, pos.getX(), pos.getY() + 1, pos.getZ(), 100.0f, ExplosionSourceType.NONE);
                world.createExplosion(null, pos.getX(), pos.getY() - 1, pos.getZ(), 100.0f, ExplosionSourceType.NONE);

                if (player.getHealth() != 0f){
                    player.kill();
                }


                world.removeBlock(pos, false);
                return ActionResult.SUCCESS;
            } 
            return ActionResult.PASS;
        }
}
