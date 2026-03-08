public class Polygon {
    private Point[] points;
    public Polygon(Point[] points) {
        this.points = points;
    }
    public String toString() {
        String res = "Punkty wielokata: ";
        for(Point p: points) {
            res += "(" + p.getX() + " , " + p.getY() + ")";
        }
        return res;
    }
    public String toSvg() {
        String svg = "<polygon points=\"";
        for(Point p : points) {
            svg += p.getX() + "," + p.getY()+ " ";
        }
        svg += "\" />";
        return svg;
    }
}
