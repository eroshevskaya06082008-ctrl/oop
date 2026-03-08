public class Segment {

    private Point point1;
    private Point point2;
    public Segment(Point point1, Point point2) {
        this.point1 = new Point(point1.getX(), point1.getY());
        this.point2 = new Point(point2.getX(), point2.getY());
        }
        public String toString() {
        return "Segment from " + point1.toString() + " to " + point2.toString();
        }
}



