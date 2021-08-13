package com.codegym;

import java.util.List;

public interface GeneralCRUD<T> {
    List<T> findAll();

    void creat(T t);

    T findByName(String name);

    void update(Long id);

    void delete(Long id);
}
