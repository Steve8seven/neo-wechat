package com.ejiayou.neowechat.controller;

import com.ejiayou.neowechat.entity.Book;
import com.ejiayou.neowechat.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @datetime 2017/9/20.
 * @describe
 */
@RestController
public class HelloWorldController {

    @Resource
    private BookService service;

    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") int id){
        return service.getBook(id);
    }
}
