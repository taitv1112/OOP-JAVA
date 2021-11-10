package LuyenTap;

import java.util.Comparator;

public class NhanVienComparator implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
