public class Polygon {
    private Point[] points;
    public Polygon(Point[] points) {
        this.points = new Point[points.length];

        for(int i=0; i< points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }
    public String toString() {
        String res = "Punkty wielokata: ";
        for(Point p: points) {
            res = res + "(" + p.getX() + " , " + p.getY() + ")";
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
    public Polygon(Polygon other) {
        this.points = new Point[other.points.length];
        for(int i = 0; i < other.points.length; i++) {
            this.points[i] = new Point(other.points[i].getX(),other.points[i].getY());
        }
    }


}
