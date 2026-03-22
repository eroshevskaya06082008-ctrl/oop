
public class Main {


    public static void main(String[] args) {
        Segment[] segments = {
                new Segment(new Point(0, 0), new Point(3, 4)),
                new Segment(new Point(1, 1), new Point(5, 5)),
                new Segment(new Point(2, 2), new Point(10, 2))
        };
        //System.out.println("The longest: " + longest.length());

//
//        Segment segment = new Segment(p1, p2);
//        System.out.println(segment);
//        Point[] pts = {
//                new Point(10,10),
//                new Point(100,10),
//                new Point(100,100),
//                new Point(10,100)
//        };
//        Polygon polygon = new Polygon(pts);
//        System.out.println(polygon.toString());
//        System.out.println(polygon.toSvg());
//    }
        Point p1 = new Point(10, 10);
        Point p2 = new Point(100, 10);
        Point p3 = new Point(50, 80);
        Polygon triangle = new Polygon(new Point[]{p1, p2, p3});
        Polygon square = new Polygon(new Point[]{
                new Point(20, 40),
                new Point(120, 20),
                new Point(120, 120),
                new Point(20, 120)
        });
        SvgScene scene = new SvgScene();
        scene.addShapes(triangle);
//        scene.addPolygon(square);
        scene.save("output.svg");

    }
}