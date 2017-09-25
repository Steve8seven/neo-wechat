package com.ejiayou.neowechat.dao;

import com.ejiayou.neowechat.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author huangzhe
 * @datetime 2017/9/25.
 * @describe
 */
@Repository
public interface IBookDao {
    Book getBook(@Param("id") int id);
}
