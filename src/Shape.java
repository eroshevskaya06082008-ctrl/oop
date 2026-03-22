public abstract class Shape {
    public abstract BoundingBox boundingBox();
    protected Style style;
    public Shape(Style style) {
        this.style = style;
    }
    public abstract String toSvg();
}
