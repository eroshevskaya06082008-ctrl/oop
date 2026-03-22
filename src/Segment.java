public class Segment {

    private Point point1 = new Point();
    private Point point2 = new Point();
    public Segment(Point point1, Point point2) {
        this.point1 = new Point(point1.getX(), point1.getY());
        this.point2 = new Point(point2.getX(), point2.getY());
    }
    public String toString() {
        return "Segment from: " + point1.toString() + " to " + point2.toString();
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Segment perpendicular() {
        double midX = (point1.getX() + point2.getX())/2;
        double midY = (point1.getY()+ point1.getY())/2;
        double dx = point2.getX() - point1.getX();
        double dy = point2.getY() - point1.getY();
        double newdx = -dy;
        double newdy = dx;
        Point newp1 = new Point((midX - newdx) /2, (midY - newdy)/2);
        Point newp2 = new Point((midX + newdx)/2, (midY + newdy)/2);
        return new Segment(newp1, newp2);
    }
}



