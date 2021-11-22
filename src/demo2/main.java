package demo2;

public class Main {
    public static void main(String[] args) {
        Hinh h1 = new Tron();
        Hinh h2 = new TamGiac();
        Hinh h3 = new ChuNhat();

        Hinh h5 = h1;
//        DaGiac h4 = h2;
        Tron h6 = (Tron) h1;
        h2 =h3;
    }
}
