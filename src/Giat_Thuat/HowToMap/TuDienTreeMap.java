package Giat_Thuat.HowToMap;

import java.util.*;

public class TuDienTreeMap {
    private Map<String ,String> data = new TreeMap<>();
    public String addWord(String keyWord, String value){
        return this.data.put(keyWord,value);
    }
    public String deleteWord(String keyWord){
        return this.data.remove(keyWord);
    }
    public String traTu(String keyWord){
        String value = this.data.get(keyWord);
        return value;
    }
    public  void  printKeyWord(){
        Set<String> tapHopTuKhoa = this.data.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }
    public int laySoluong(){
        return this.data.size();
    }
    public void xoaTatCa(){
        this.data.clear();
    }

    public static void main(String[] args) {
        TuDienTreeMap tuDien = new TuDienTreeMap();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("----------");
            System.out.println("Menu");
            System.out.println("Tra từ điển Anh - Việt:\n"
                    + "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
                    + "2. Xóa từ\n"
                    + "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
                    + "4. In ra danh sách từ khóa\n"
                    + "5. Lấy số lượng từ\n"
                    + "6. Xóa tất cả các từ khóa\n"
                    + "0. Thoát khỏi chương trình\n"
                    + "");
            choice= sc.nextInt();sc.nextLine();
            if(choice==1){
                System.out.println("Nhập vào từ khóa: ");
                String keyWord = sc.nextLine();
                System.out.println("Nhập vào ý nghĩa: ");
                String value = sc.nextLine();
                tuDien.addWord(keyWord,value);
            }else if(choice==2||choice==3){
                System.out.println("Nhập vào từ khóa: ");
                String keyWord = sc.nextLine();
                if(choice==2){
                    tuDien.deleteWord(keyWord);
                }else {
                    System.out.println("Ý nghĩa là:"+tuDien.traTu(keyWord) );
                }
            }else if(choice ==4){
                tuDien.printKeyWord();
            }else if(choice ==5){
                System.out.println("Số lượng từ khóa là: "+tuDien.laySoluong());
            }else if(choice ==6){
                tuDien.xoaTatCa();
            }



        }while (choice!=0);


    }
}
