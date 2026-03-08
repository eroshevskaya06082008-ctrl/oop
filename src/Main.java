
public class Main{
//    public static void main(String[] args) {
//        System.out.println("Hello world");
//
//        Point point = new Point(5, 7);
//        System.out.println(point.getX() + " " + point.getY());
//        point.setX(7);
//        System.out.println(point.getX() + " " + point.getY());
//        Point point2 = new Point();
//        System.out.println(point2.toString());
//
//    }

    public static void main(String[] args) {
        Segment[] segments = {
                new Segment(new Point(0,0), new Point(3,4)),
                new Segment(new Point(1,1), new Point(5,5)),
                new Segment(new Point(2,2), new Point(10,2))
        };

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Segment segment = new Segment(p1, p2);
        System.out.println(segment);
        Point[] pts = {
                new Point(10,10),
                new Point(100,10),
                new Point(100,100),
                new Point(10,100)
        };
        Polygon polygon = new Polygon(pts);
        System.out.println(polygon.toString());
        System.out.println(polygon.toSvg());
    }
}