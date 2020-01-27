import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class LineSegment {
    private Point point1;
    private Point point2;

    public LineSegment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public double length(){
        return sqrt(pow(point1.getX() - point2.getX(),2) + pow(point1.getY() - point2.getY(),2));
    }

}
