Stream.of(
Block.makeCuboidShape(0, 0, 8, 16, 1, 16),
Block.makeCuboidShape(3, 1, 15, 13, 9, 16),
Block.makeCuboidShape(0, 9, 8, 16, 10, 16),
Block.makeCuboidShape(2, 10, 8, 14, 11, 16),
Block.makeCuboidShape(4, 11, 10, 12, 12, 16),
Block.makeCuboidShape(5, 12, 15, 11, 18, 16),
Block.makeCuboidShape(5, 12, 12, 11, 18, 13),
Block.makeCuboidShape(10, 12, 13, 11, 18, 15),
Block.makeCuboidShape(5, 12, 13, 6, 18, 15),
Block.makeCuboidShape(4, 9, 6, 12, 10, 8),
Block.makeCuboidShape(11, 8, 6, 13, 9, 7),
Block.makeCuboidShape(3, 8, 6, 5, 9, 7),
Block.makeCuboidShape(0, 1, 8, 3, 9, 16),
Block.makeCuboidShape(12, 1, 7, 15, 10, 8),
Block.makeCuboidShape(1, 1, 7, 4, 10, 8),
Block.makeCuboidShape(13, 1, 8, 16, 9, 16),
Block.makeCuboidShape(1, 0, 7, 15, 1, 8),
Block.makeCuboidShape(5, 0, 5, 11, 1, 6),
Block.makeCuboidShape(3, 0, 6, 13, 1, 7),
Block.makeCuboidShape(4, 3, 7, 12, 4, 8),
Block.makeCuboidShape(6, 1, 7, 7, 3, 8),
Block.makeCuboidShape(9, 1, 7, 10, 3, 8)
).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);});