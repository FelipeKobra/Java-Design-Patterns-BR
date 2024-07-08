package structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BlockTypeFactory {
    static Map<String, BlockType> blocks = new HashMap<>();

    public static BlockType getBlockType(String name, float size, String color) {
        BlockType blockType = blocks.get(name);

        if (blockType == null) {
            blockType = new BlockType(name, size, color);
            blocks.put(name, blockType);

        }

        return blockType;
    }
}
