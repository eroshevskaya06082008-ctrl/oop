
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world");

        Point point = new Point(5, 7);
        System.out.println(point.getX() + " " + point.getY());
        point.setX(7);
        System.out.println(point.getX() + " " + point.getY());
        Point point2 = new Point();
        System.out.println(point2.toString());

    }
}