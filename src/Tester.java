import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Tester {

    double length(LineSegment ls){
        return sqrt(pow(ls.getPoint1().getX() - ls.getPoint2().getX(),2) + pow(ls.getPoint1().getY() - ls.getPoint2().getY(),2));
    }

    boolean isTriangle(Point p1, Point p2, Point p3){
        double determinant = p1.getX()*p2.getY()+p2.getX()*p3.getY()+p3.getX()*p1.getY()-p2.getY()*p3.getX()-p3.getY()*p1.getX()-p1.getY()*p2.getX();
        return determinant!=0;
    }

}
