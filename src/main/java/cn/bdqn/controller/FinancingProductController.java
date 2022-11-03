package cn.bdqn.controller;

import cn.bdqn.service.FinancingProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: FinancingProductController
 * @Description:
 * @Date: 2022-10-31 14:53:19
 * @Author: YanYongKang
 */
@Controller
@RequestMapping("/financing")
public class FinancingProductController {

    @Autowired
    private FinancingProductService financingProductService;

    @GetMapping("/toHtml")
    public String toHtml() {
        return "financingProduc";
    }

    @GetMapping("/query")
    @ResponseBody
    public List<Map<String, Object>> query(String id, String risk) {
        return financingProductService.query(id, risk);
    }
}
