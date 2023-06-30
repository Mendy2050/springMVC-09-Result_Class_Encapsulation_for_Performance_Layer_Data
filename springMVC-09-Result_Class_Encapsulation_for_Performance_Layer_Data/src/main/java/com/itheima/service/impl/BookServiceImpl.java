package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mendy
 * @create 2023-06-29 14:03
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getById(Integer id) {
        bookDao.getById(id);
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        bookDao.getAll();
        return bookDao.getAll();
    }

}
