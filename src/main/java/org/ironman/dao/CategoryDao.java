package org.ironman.dao;

import org.ironman.core.ConnectionCore;
import org.ironman.entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {

    public List<Category> findAll() throws Exception {
        // Variables
        List<Category> categories = new ArrayList<>();
        Category category;
        String sqlQuery;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        // Process
        try {
            sqlQuery = "select * from categories;";
            connection = new ConnectionCore().open();
            preparedStatement = connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();

            // Result
            while (resultSet.next()) {
                category = new Category();

                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));

                categories.add(category);
            }


        } finally {

            if(resultSet !=null && !resultSet.isClosed()) {
                resultSet.close();
            }

            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }

            if(connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

        // Result

        return categories;
    }
}
