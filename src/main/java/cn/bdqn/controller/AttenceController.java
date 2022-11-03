package cn.bdqn.controller;

import cn.bdqn.service.AttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: AttenceController
 * @Description:
 * @Date: 2022-10-31 14:18:59
 * @Author: YanYongKang
 */
@Controller
@RequestMapping("/attence")
public class AttenceController {
    @Autowired
    private AttenceService attenceService;

    @GetMapping("/query")
    public String query(Model model) {
        model.addAttribute("list", attenceService.queryAll());
        return "attence";
    }
}
