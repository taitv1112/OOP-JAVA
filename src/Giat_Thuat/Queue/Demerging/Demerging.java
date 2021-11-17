package Giat_Thuat.Queue.Demerging;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Demerging<E> {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("tai", NhanVien.NAM, 27);
        NhanVien nv2 = new NhanVien("thao", NhanVien.NU, 29);
        NhanVien nv3 = new NhanVien("dat", NhanVien.NAM, 28);
        NhanVien nv4 = new NhanVien("lam", NhanVien.NU, 30);
        Queue<NhanVien> nhanViens = new LinkedList<>();
        nhanViens.offer(nv1);
        nhanViens.offer(nv2);
        nhanViens.offer(nv3);
        nhanViens.offer(nv4);
        for (NhanVien nv:nhanViens) {
            System.out.println(nv.toString());
        }
        Queue<NhanVien> nu = new LinkedList<>();
        Queue<NhanVien> nam = new LinkedList<>();
        if (!nhanViens.isEmpty()) {
            for (NhanVien nv : nhanViens) {
                if (nv.getGender().equals(NhanVien.NU)) {
                    nu.offer(nv);
                } else if (nv.getGender().equals(NhanVien.NAM)) {
                    nam.offer(nv);
                }
            }
            nhanViens.clear();
            for (NhanVien nv:nu) {
                nhanViens.offer(nv);
            }
            for (NhanVien nv:nam) {
                nhanViens.offer(nv);
            }
        }
        System.out.println("-----------------------------------");
        for (NhanVien nv:nhanViens) {
            System.out.println(nv.toString());
        }
    }
}
