package behavioral_patterns.visitor;

interface Shape {
    void accept(ShapeVisitor visitor);
}
