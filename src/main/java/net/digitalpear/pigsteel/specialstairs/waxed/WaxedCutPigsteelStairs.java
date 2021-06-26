package net.digitalpear.pigsteel.specialstairs.waxed;

import net.digitalpear.pigsteel.PigsteelMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class WaxedCutPigsteelStairs extends StairsBlock{

    public WaxedCutPigsteelStairs(BlockState baseBlockState, Settings settings)
    {
        super(baseBlockState, settings);
    }

    //Unwaxing
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit){
        if (player.getStackInHand(hand).getItem() == Items.HONEYCOMB) {
            Direction direction = state.get(Properties.HORIZONTAL_FACING);
            Boolean watered = state.get(Properties.WATERLOGGED);
            StairShape shape = state.get(Properties.STAIR_SHAPE);
            BlockHalf half = state.get(Properties.BLOCK_HALF);

            world.setBlockState(pos, PigsteelMod.CUT_PIGSTEEL_STAIRS.getDefaultState().with(Properties.HORIZONTAL_FACING, direction).with(Properties.WATERLOGGED, watered).with(Properties.STAIR_SHAPE, shape).with(Properties.BLOCK_HALF, half));
            world.playSound((PlayerEntity)null, pos, SoundEvents.ITEM_AXE_WAX_OFF, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
        }
        return ActionResult.PASS;
    }
}
