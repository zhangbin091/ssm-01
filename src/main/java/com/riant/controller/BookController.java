package com.riant.controller;

import com.riant.pojo.Books;
import com.riant.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Classname BookController
 * @Description TODO
 * @Date 2021/2/21 21:42
 * @Created by 张斌
 */
@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> bookList = bookService.quereAllBooks();
        model.addAttribute("list",bookList);
        return "allBook";
    }


}
