public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    boolean isFirstQuarter(){
        return (x>0 && y>0);
    }

    boolean isSecondQuarter(){
        return (x<0 && y>0);
    }

    boolean isThirdQuarter(){
        return (x<0 && y<0);
    }

    boolean isFourthQuarter(){
        return (x<0 && y<0);
    }

    boolean isOnXaxis(){
        return (y==0);
    }

    boolean isOnYaxis(){
        return (x==0);
    }

    boolean isInTheMiddle(){
        return (x==0 && y==0);
    }
}
