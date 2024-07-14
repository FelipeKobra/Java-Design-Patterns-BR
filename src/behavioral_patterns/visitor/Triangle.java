package behavioral_patterns.visitor;

class Triangle implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
