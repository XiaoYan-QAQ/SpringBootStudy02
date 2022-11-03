package cn.bdqn.controller;

import cn.bdqn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: PsersonController
 * @Description:
 * @Date: 2022-10-31 15:22:14
 * @Author: YanYongKang
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/toHtml")
    public String toHtml() {
        return "person";
    }


    @GetMapping("/query")
    @ResponseBody
    public List<Map<String, Object>> query() {
        return personService.queryAll();
    }


    @GetMapping("/queryOneById")
    @ResponseBody
    public Map<String, Object> queryOneById(String id) {
        return personService.queryOneById(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public boolean update(@RequestBody Map<String, Object> map) {
        return personService.update(map);
    }
}
