

public class Point {
    private double x;
    private double y;
    public Point() {
        x = 0;
        y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point oldPoint) {
        this.x = oldPoint.getX();
        this.y = oldPoint.getY();
    }
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }




    public String toString() {

        return x + " " + y;
    }
    public String toSvg() {
        return "<circle r=\"45\" cx=\"" + x
                + "\" cy=\"" + y + "\" fill=\"red\" />";
    }
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    public Point translated(double dx, double dy) {
        return new Point(this.x + dx, this.y + dy);
    }
}
