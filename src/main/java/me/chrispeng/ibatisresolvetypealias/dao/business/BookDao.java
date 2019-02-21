package me.chrispeng.ibatisresolvetypealias.dao.business;

import me.chrispeng.ibatisresolvetypealias.pojo.business.BookDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookDao {
    List<BookDO> listBooks();
}
