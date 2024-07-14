package behavioral_patterns.visitor;

class Circle implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
