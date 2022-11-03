package cn.bdqn.controller;

import cn.bdqn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: BookController
 * @Description:
 * @Date: 2022-10-31 15:29:57
 * @Author: YanYongKang
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/toHtml")
    public String toHtml() {
        return "book";
    }

    @GetMapping("/query")
    @ResponseBody
    public List<Map<String, Object>> query() {
        return bookService.queryAll();
    }
}
