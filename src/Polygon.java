public class Polygon {

    private Point[] points;
    public Polygon(Point[] points){
       this.points = new Point[points.length];
       for(int i = 0; i< points.length;i++) {
           this.points[i] = new Point(points[i].getX(), points[i].getY());
       }
    }
    public String toString() {
        String res = "Punkty wielokata: ";
        for(Point p : points) {
            res += "( " + p.getX() + " , " + p.getY() + ")";
        }
        return res;
    }
    public String toSvg() {
        String result = "<polygon points=\"";

        for (Point p : points) {
            result += (int)p.getX() + "," + (int)p.getY() + " ";
        }

        result += "\" />";
        return result;
    }
    public Polygon(Polygon other) {
        this.points = new Point[other.points.length];
        for(int i = 0; i< other.points.length; i++) {
            this.points[i] = new Point(other.points[i].getX(), other.points[i].getY());
        }
    }
    public BoundingBox boundingBox() {
        double minX = points[0].getX();
        double minY = points[0].getY();
        double maxX = points[0].getX();
        double maxY = points[0].getY();
        for (Point p : points) {
            if(minX > p.getX()) {minX = p.getX();}
            if(minY > p.getY()) {minY = p.getY();}
            if(maxX < p.getX()) {maxX = p.getX();}
            if(maxY < p.getY()) {maxY = p.getY();}
        }
        double width = maxX - minX;
        double height = maxY - minY;
        return new BoundingBox(minX, minY, width, height);
    }
    private Style style;
    public Polygon(Point[] points, Style style) {
        this.points = new Point[points.length];
        for(int i = 0; i< points.length; i++) {
            this.points[i] = new Point(points[i]);
        }
        if(style != null) {
            this.style = new Style("none", "black", 1);
        } else {
            this.style= style;
        }
    }
    public String toSvgStyle() {
        String result = "<polygon points=\"";

        for (Point p : points) {
            result += (int)p.getX() + "," + (int)p.getY() + " ";
        }

        result += "\" " + style.toSvg() + " />";
        return result;
    }

}
