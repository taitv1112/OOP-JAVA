package Giat_Thuat.ThuatToanSapXep;

import java.util.Arrays;

public class InsertionSort {
    static int[] list = {1,22,4,3,7,9};
    public static void insertionSort(int[] list){
            for (int i = 1; i < list.length; i++){
                int currentElement = list[i];
                int k;
                for(k = i - 1; k >=0 && list[k] > currentElement; k--){
                    System.out.println("Nếu "+list[k] + "> " + currentElement);
                    list[k+1] = list[k];
                    System.out.println("Gán"+list[k+1] + "= " + list[k]);
                }
                System.out.println("Gán giá trị tại vị trí "+ k+1 +" =" +currentElement);
                list[k+1] = currentElement;
            }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
