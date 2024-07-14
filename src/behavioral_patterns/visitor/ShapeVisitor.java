package behavioral_patterns.visitor;

interface ShapeVisitor {
    void visit(Circle circle);

    void visit(Square square);

    void visit(Triangle triangle);
}
