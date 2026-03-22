public class Ellipse extends Shape {
    private Point center;
    private double rx;
    private double ry;
    public Ellipse(Style style, Point center, double rx, double ry) {
        super(style);
        this.center = new Point(center);
        this.rx = rx;
        this.ry = ry;
    }
    @Override
    public String toSvg() {
        return "<ellipse cx=\"" + center.getX() +
                "\" cy=\"" + center.getY() +
                "\" rx=\"" + rx +
                "\" ry=\"" + ry +
                "\" " + style.toSvg() + " />";
    }
    @Override
    public BoundingBox boundingBox() {
        double x = center.getX() - rx;
        double y = center.getY() - ry;
        double width = 2 * rx;
        double height = 2 * ry;

        return new BoundingBox(x, y, width, height);
    }
}
