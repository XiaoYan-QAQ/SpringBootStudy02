package cn.bdqn.controller;

import cn.bdqn.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @ClassName: StudentInfoController
 * @Description:
 * @Date: 2022-10-31 14:30:08
 * @Author: YanYongKang
 */
@Controller
@RequestMapping("/student")
public class StudentInfoController {

    @Autowired
    private StudentInfoService studentInfoService;

    @GetMapping("/query")
    public String query(Model model) {
        model.addAttribute("list", studentInfoService.queryAll());
        return "studentInfo";
    }

    @GetMapping("/queryone/{id}")
    public Map<String, Object> queryOneById(@PathVariable("id") String id) {
        return studentInfoService.queryOneById(id);
    }

}
