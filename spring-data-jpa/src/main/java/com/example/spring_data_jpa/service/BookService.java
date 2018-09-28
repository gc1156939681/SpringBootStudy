package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.entity.Book;

import java.util.List;

/**
 * Created by guocui on 2018/9/28.
 */
public interface BookService {
    Book save(Book book);
    List<Book> getAll();
    Book get(int id);
    void delete(int id);
}
