package cn.bdqn.service.impl;

import cn.bdqn.mapper.BookMapper;
import cn.bdqn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: BookServiceImpl
 * @Description:
 * @Date: 2022-10-31 15:29:22
 * @Author: YanYongKang
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Map<String, Object>> queryAll() {
        return bookMapper.queryAll();
    }
}
