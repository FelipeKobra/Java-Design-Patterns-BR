package structural_patterns.flyweight;

public class BlockType {
    String color;
    float size;
    String name;

    public BlockType(String name, float size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

}
