package com.ejiayou.neowechat.entity

import javax.xml.bind.annotation.XmlRootElement

/**
 * @author huangzhe
 * @datetime 2017/9/25.
 * @describe
 */
@XmlRootElement(name = 'book')
class Book {
    int id
    String title
    String description
    String pub_time
    String author

    Book() {
    }

    Book(int id, String title, String description, String pub_time, String author) {
        this.id = id
        this.title = title
        this.description = description
        this.pub_time = pub_time
        this.author = author
    }
}