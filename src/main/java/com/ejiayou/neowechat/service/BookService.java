package com.ejiayou.neowechat.service;

import com.ejiayou.neowechat.dao.IBookDao;
import com.ejiayou.neowechat.entity.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author huangzhe
 * @datetime 2017/9/25.
 * @describe
 */
@Service
public class BookService {

    @Resource
    private IBookDao dao;

    public Book getBook(int id){
        return dao.getBook(id);
    }
}
