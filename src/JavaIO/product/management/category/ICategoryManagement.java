package JavaIO.product.management.category;

import JavaIO.product.management.IGeneralManagement;
import JavaIO.product.model.Category;

public interface ICategoryManagement extends IGeneralManagement<Category> {
    void writeToFile();
}
