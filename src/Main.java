public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,0);
        Point p3 = new Point(3,5);

        LineSegment ls1 = new LineSegment(p1,p2);

        Tester tester = new Tester();

        System.out.println("Punkt 3, czy w pierwszej ćwiartce? " + p3.isFirstQuarter());
        System.out.println("Punkt 3, czy na osi X? " + p3.isOnXaxis());

        System.out.println("Długość odcinka, pierwsza metoda: " + ls1.length());
        System.out.println("Długość odcinka, druga metoda: " + tester.length(ls1));

        System.out.println("Czy z podanych punktów można stworzyć trójkąt? " + tester.isTriangle(p1,p2,p3));

    }
}
