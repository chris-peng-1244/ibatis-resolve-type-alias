package me.chrispeng.ibatisresolvetypealias.controller;

import me.chrispeng.ibatisresolvetypealias.dao.business.BookDao;
import me.chrispeng.ibatisresolvetypealias.pojo.business.BookDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    private BookDao bookDao;

    @Autowired
    public BookController(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @GetMapping("/")
    public List<BookDO> listBooks() {
        return bookDao.listBooks();
    }
}
