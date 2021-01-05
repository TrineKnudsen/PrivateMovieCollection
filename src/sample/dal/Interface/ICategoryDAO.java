package sample.dal.Interface;

import sample.be.Category;

import java.util.List;

public interface ICategoryDAO {

    /**
     * Adds a category to the database.
     * @param name The name of the category.
     * @return The new category.
     */
    Category addCategory(String name);

    /**
     * Deletes a category from the database,
     * @param category The category to delete.
     */
    void deleteCategory(String category);

    /**
     * Gets a list of all categories from the database.
     * @return The list of all Movies.
     */
    List<Category> getCategories();

    /**
     * Gets a category from the database.
     * @param id The id on the chosen category.
     * @return The chosen category with the given id.
     */
    Category getCategory(int id);
}
