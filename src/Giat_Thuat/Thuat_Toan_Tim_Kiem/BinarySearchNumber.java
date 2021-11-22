package Giat_Thuat.Thuat_Toan_Tim_Kiem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];


        System.out.println("Nhập số phần tử mảng: ");
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" so phan tu trong mang la: ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }
    public static int binarySearch(int[] array, int left, int right ,int value) {
        left = 0;
        right = array.length - 1;
        if (right >= left) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            } else {
                return  binarySearch(array, left, middle - 1, value);
            }
        }
        System.out.println("Không tìm thấy value trong mảng");
        return -1;
    }
}
