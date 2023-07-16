package org.ironman.dao.impl;

import org.ironman.core.ConnectionCore;
import org.ironman.dao.CategoryDao;
import org.ironman.entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    @Override
    public List<Category> findAll() throws Exception {
        // Variables
        List<Category> categories = new ArrayList<>();
        Category category;
        String sqlQuery;


        // Process
        sqlQuery = "select * from categories;";

        try (
                Connection connection = new ConnectionCore().open();
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {

            // Result
            while (resultSet.next()) {
                category = new Category();

                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));

                categories.add(category);
            }


        }

        // Result

        return categories;
    }

    @Override
    public Category findById(Long id) throws Exception {
        return null;
    }

    @Override
    public Category create(Category category) throws Exception {
        return null;
    }

    @Override
    public Category edit(Category category, Long id) throws Exception {
        return null;
    }

    @Override
    public void remove(Long id) throws Exception {

    }
}
