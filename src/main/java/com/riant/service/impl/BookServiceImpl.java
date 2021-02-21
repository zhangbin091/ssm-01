package com.riant.service.impl;

import com.riant.dao.BookMapper;
import com.riant.pojo.Books;
import com.riant.service.BookService;

import java.util.List;

/**
 * @Classname BookServiceImpl
 * @Description TODO
 * @Date 2021/2/21 21:37
 * @Created by 张斌
 */
public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBookById(Books book) {
        return bookMapper.updateBook(book);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> quereAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
