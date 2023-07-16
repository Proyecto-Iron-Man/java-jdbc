package org.ironman.core;

import org.ironman.entity.Category;

import java.util.List;

public interface CrudCore<T, ID> {

    List<T> findAll() throws Exception;

    T findById(ID id) throws Exception;

    T create(T entity) throws Exception;

    T edit (T entity, ID id) throws Exception;

    void remove(ID id) throws Exception;
}
