package structural_patterns.flyweight;

public class Block {
    BlockType blockType;
    int x;
    int y;

    public Block(BlockType blockType, int x, int y) {
        this.blockType = blockType;
        this.x = x;
        this.y = y;
    }

}
