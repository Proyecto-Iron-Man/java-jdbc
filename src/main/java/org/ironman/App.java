package org.ironman;

import org.ironman.core.ConnectionCore;
import org.ironman.dao.CategoryDao;
import org.ironman.entity.Category;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        try {
            CategoryDao categoryDao = new CategoryDao();
            List<Category> categories = categoryDao.findAll();

            for (Category category: categories) {
                System.out.println("Id: " + category.getId());
                System.out.println("Name: " + category.getName());

            }


        } catch (Exception e) {
            System.out.println("Error DB:" + e.getMessage());
        }
    }
}
