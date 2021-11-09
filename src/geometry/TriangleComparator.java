package geometry;

import java.util.Comparator;

public class TriangleComparator implements Comparator<Triangle> {
    @Override
    public int compare(Triangle o1, Triangle o2) {
        if (o1.getArea() > o2.getArea()) return 1;
        else if (o1.getArea() < o2.getArea()) return -1;
        else return 0;
    }
}
