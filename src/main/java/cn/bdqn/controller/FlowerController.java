package cn.bdqn.controller;

import cn.bdqn.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: FlowerController
 * @Description:
 * @Date: 2022-10-31 11:36:06
 * @Author: YanYongKang
 */
@Controller
@RequestMapping("/flower")
public class FlowerController {
    @Autowired
    private FlowerService flowerService;

    @GetMapping("/query")
    public String queryAll(Model model) {
        model.addAttribute("list", flowerService.queryAll());
        return "flower";
    }
}
