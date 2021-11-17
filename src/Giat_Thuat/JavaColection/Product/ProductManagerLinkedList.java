package Giat_Thuat.JavaColection.Product;


import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagerLinkedList {
    static LinkedList<Product> products = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    public static Product createProduct() {
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập số lượng sản phẩm");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá sản phẩm");
        Double price = Double.parseDouble(sc.nextLine());

        Product product = new Product(name, quantity, price);
        return product;
    }

    public static void addProduct() {
        products.add(createProduct());
    }

    public static void edditProduct() {
        if(!products.isEmpty()){
            int index =findIndexProduct();
            if (index >= 0) {
                System.out.println("Nhập tên sản phẩm");
                String name = sc.nextLine();
                System.out.println("Nhập số lượng sản phẩm");
                int quantity = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập giá sản phẩm");
                double price = Double.parseDouble(sc.nextLine());
                products.get(index).setAll(name, quantity, price);
            } else {
                System.out.println("Id không có trong danh sách");
            }
        }else {
            System.out.println("Danh sách đang rỗng");
        }


    }
    public static void deleteProduct(){
        if(!products.isEmpty()){
            int index = findIndexProduct();
            if (index >= 0) {
                products.remove(index);
            } else {
                System.out.println("Id không có trong danh sách");
            }
        }else {
            System.out.println("Danh sách đang rỗng");
        }
    }
    public static void showProduct(){
        if(!products.isEmpty()){
            for (Product pd: products) {
                System.out.println(pd.toString());
            }
        }else {
            System.out.println("Products is Empty");
        }

    }
    public static void findProductByName(){
        if(!products.isEmpty()){
            System.out.println("Nhập tên sản phẩm cần tìm kiếm: ");
            String name = sc.nextLine();
            int count =0;
            for (Product product : products) {
                if (name.contains(product.getName())) {
                    System.out.println(product.toString());
                    count++;
                }
            }
            if(count==0){
                System.out.println("Tên: "+name+" không có trong danh sách " );
            }
        }else {
            System.out.println("Products is Empty");
        }

    }
    public static void sortPrice(boolean isUp){
        if(!products.isEmpty()){
            ProductComparatorUp productComparatorUp = new ProductComparatorUp();
            ProductComparatorDown productComparatorDown = new ProductComparatorDown();
            if(isUp) products.sort(productComparatorUp);
            else products.sort(productComparatorDown);
        }else {
            System.out.println("Products is Empty");
        }

    }
    public static int findIndexProduct() {
        System.out.println("Nhập id sản phẩm : ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }
    public static void menu(){
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    edditProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showProduct();
                    break;
                case 5:
                    findProductByName();
                    break;
                case 6:subMenu();break;
                case 7:System.exit(1);
            }
        }

    }
    public static void subMenu(){
        while (true){
            System.out.println("1. Sắp xếp tăng theo giá sản phẩm");
            System.out.println("2. Sắp xếp giảm theo giá sản phẩm");
            System.out.println("3. Menu");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:sortPrice(true);showProduct();break;
                case 2:sortPrice(false);showProduct();break;
                case 3:menu();break;
            }
        }
    }
}
