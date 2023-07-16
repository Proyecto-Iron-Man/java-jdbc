package org.ironman.dao;

import org.ironman.core.ConnectionCore;
import org.ironman.entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public interface CategoryDao {

    List<Category> findAll() throws Exception;

    Category findById(Long id) throws Exception;

    Category create(Category category) throws Exception;

    Category edit (Category category, Long id) throws Exception;

    void remove(Long id) throws Exception;
}
