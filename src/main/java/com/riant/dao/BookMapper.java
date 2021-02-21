package com.riant.dao;

import com.riant.pojo.Books;

import java.util.List;

/**
 * @Classname BookMapper
 * @Description TODO
 * @Date 2021/2/21 20:16
 * @Created by 张斌
 */
public interface BookMapper {
    int addBook(Books book);

    int deleteBookById(int id);

    int updateBook(Books books);
    Books queryBookById(int id);

    List<Books> queryAllBooks();
}
