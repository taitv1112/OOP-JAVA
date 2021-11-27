package JavaIO.product.management.product;

import JavaIO.product.management.IGeneralManagement;
import JavaIO.product.model.Product;

import java.util.List;

public interface IProductManagement extends IGeneralManagement<Product> {

    void readFile();

    void writeToFile();
}
