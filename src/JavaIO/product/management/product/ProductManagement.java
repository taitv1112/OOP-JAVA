package JavaIO.product.management.product;


import JavaIO.product.model.Product;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement implements IProductManagement {
    public static final String FILE_PATH = "JavaIO\\product.data";
    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void create(Product product) {
        products.add(product);
        writeToFile();
    }

    @Override
    public void update(int index, Product product) {
        products.set(index, product);
    }

    @Override
    public void remove(int index) {
        products.remove(index);
    }

    @Override
    public void readFile() {
        try {
            InputStream is = new FileInputStream("product.data");
            ObjectInputStream ois =new ObjectInputStream(is);
            Product product = null;
            while(true) {
                Object oj = ois.readObject();
                if(oj==null) {
                    break;
                }
                product = (Product) oj;
                this.products.add(product);
            }
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeToFile() {
        try {
            File file = new File("product.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos =new ObjectOutputStream(os);
            for (Product product: products) {
                oos.writeObject(product);
            }
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
