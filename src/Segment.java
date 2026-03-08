public class Segment {

    public Point point1;
    public Point point2;
    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
        }
        public double length() {
            return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) +
                    Math.pow(point2.getY() - point2.getY(), 2));
    }
}



