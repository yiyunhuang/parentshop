package com.dhc.ddshop.lucene.dao;

import com.dhc.ddshop.lucene.po.Book;

import java.util.List;

/**
 * @Author: yiyun
 * @Company:
 * @Package: com.dhc.ddshop.lucene.dao
 * @Date: 2017-11-21
 * @Time: 21:15
 * @Version: 1.0
 * @Description:
 * @Modified By:
 */
public interface IBookDao {

    /**
     * 采集数据：查询所有图书
     * @return
     */
    List<Book> listBooks();
}
