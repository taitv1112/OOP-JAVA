package JavaIO.product.management.category;



import JavaIO.product.model.Category;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CategoryManagement implements ICategoryManagement {
    private static final String FILE_PATH = "category.txt";
    private List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public void create(Category category) {
        categories.add(category);
        writeToFile();
    }

    @Override
    public void update(int index, Category category) {
        categories.set(index, category);
    }

    @Override
    public void remove(int index) {
        categories.remove(index);
    }

    @Override
    public void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            for (Category category: categories) {
                fileWriter.write(category.toString());
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
