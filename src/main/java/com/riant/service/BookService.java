package com.riant.service;

import com.riant.pojo.Books;

import java.util.List;

public interface BookService {
    int addBook(Books book);

    int deleteBookById(int id);

    int updateBookById(Books book);

    Books queryBookById(int id);

    List<Books> quereAllBooks();


}
