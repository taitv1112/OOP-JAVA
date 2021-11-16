package Giat_Thuat.HowToMap;

import java.util.Map;
import java.util.TreeMap;

public class DemTuTrongChuoi {


    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = "Thứ lỗi vì anh thực sự đang say\n" +
                "Nghĩ đến 1 người lòng anh nhớ lắm!\n" +
                "Phút yếu đuối ùa về vì cô đơn\n" +
                "Đã nuốt lấy niềm vui lúc ta bên nhau \n" +
                "\n" +
                "Anh biết rằng như vậy là ko nên\n" +
                "Cũng  biết rằng sẽ tổn thương nơi em\n" +
                "Chẳng muốn giữ tay em ghì chặt quá,  để mất khoảng trời riêng em!\n" +
                "Pre- Chorus \n" +
                "Anh vẫn biết tình yêu em dành  sẽ mãi mãi luôn tồn tại!\n" +
                "Nhưng do anh,  đã ko biết cách để yêu em\n" +
                "Rồi chính anh tự mình đánh mất";
        System.out.println("---------------------------------");
        System.out.println(str);
        System.out.println("---------------------------------");
        // liệt kê sô lần xuất hiện của các từ trong chuỗi trên
        System.out.println("Liệt kê số lần xuất hiện của các từ: ");
        Map<String, Integer> wordMap = countWords(str);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
        }
    }

    /**
     * Đếm số từ của một chuỗi,
     * giả sử các từ được ngăn cách nhau bởi một hoặc nhiều
     * dấu 'space', tab '\t' và xuống dòng '\n'
     *
     * @param strInput - chuỗi ký tự
     * @return số từ của chuỗi ký tự strInput
     */
    public static Map<String, Integer> countWords(String strInput) {
        // khởi tạo wordMap
        Map<String, Integer> wordMap = new TreeMap<String, Integer>();
        if (strInput == null) {
            return wordMap;
        }
        int size = strInput.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (strInput.charAt(i) != SPACE && strInput.charAt(i) != TAB
                    && strInput.charAt(i) != BREAK_LINE) {
                // build một từ
                sb.append(strInput.charAt(i));
            } else {
                // thêm từ vào wordMap
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }
        // thêm từ cuối cùng tìm được vào wordMap
        addWord(wordMap, sb);
        return wordMap;
    }

    /**
     * Thêm từ vào wordMap
     *
     * @param wordMap: map chứa các từ và số lần xuất hiện
     * @param sb:      từ cần thêm vào wordMap
     */
    public static void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
}
