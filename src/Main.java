
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
    public static Segment longest(Segment[] segments) {
        Segment longest = segments[0];
        for(Segment s : segments) {
            if(s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Segment[] segments = {
                new Segment(new Point(0,0), new Point(3,4)),
                new Segment(new Point(1,1), new Point(5,5)),
                new Segment(new Point(2,2), new Point(10,2))
        };
        Segment longest = longest(segments);
        System.out.println("The longest: " + longest.length());
    }
}