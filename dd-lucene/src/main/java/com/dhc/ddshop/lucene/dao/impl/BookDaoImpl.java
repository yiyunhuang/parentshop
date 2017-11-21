package com.dhc.ddshop.lucene.dao.impl;

import com.dhc.ddshop.lucene.dao.IBookDao;
import com.dhc.ddshop.lucene.po.Book;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yiyun
 * @Company:
 * @Package: com.dhc.ddshop.lucene.dao.impl
 * @Date: 2017-11-21
 * @Time: 21:17
 * @Version: 1.0
 * @Modified By:
 * @Description:
 * //@Repository放在DAO实现类上的
 * //@Service放在SERVICE实现类上的
 * //@Controller放在WEB类上的
 * //@Component都可以使用（分层不太分的地方都可以是这个）
 */


public class BookDaoImpl implements IBookDao {
    @Override
    public List<Book> listBooks() {
        //数据库连接
        Connection connection = null;
        //预编译语句对象
        PreparedStatement preparedStatement = null;
        //结果集对象
        ResultSet resultSet = null;
        //图书列表
        List<Book> list = new ArrayList<Book>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lucene", "root", "");
            preparedStatement = connection.prepareStatement("select * from book");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setName(resultSet.getString("name"));
                book.setPrice(resultSet.getFloat("price"));
                book.setPic(resultSet.getString("pic"));
                book.setDescription(resultSet.getString("description"));
                list.add(book);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

}
