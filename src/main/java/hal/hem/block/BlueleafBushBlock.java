package hal.hem.block;

import hal.hem.registry.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class BlueleafBushBlock extends BushBlock {
    protected static final VoxelShape SHAPE = VoxelShapes.join(Block.box(0, 4, 0, 16, 14, 16), Block.box(5, 0, 5, 11, 4, 11), IBooleanFunction.OR);

    public BlueleafBushBlock() {
        super(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(2.0F).sound(SoundType.WOOD));
    }

    @Override
    protected boolean mayPlaceOn(BlockState p_200014_1_, IBlockReader p_200014_2_, BlockPos p_200014_3_) {
        return p_200014_1_.is(Blocks.GRASS_BLOCK) || p_200014_1_.is(Blocks.DIRT) || p_200014_1_.is(Blocks.COARSE_DIRT) || p_200014_1_.is(Blocks.PODZOL) || p_200014_1_.is(Blocks.FARMLAND) || p_200014_1_.is((ModBlocks.BLUELEAF_GRASS_BLOCK.get())) || p_200014_1_.is((ModBlocks.BLUELEAF_DIRT.get()));
    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }
}
