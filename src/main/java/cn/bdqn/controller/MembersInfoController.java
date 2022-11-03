package cn.bdqn.controller;

import cn.bdqn.service.MembersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: MembersInfoController
 * @Description:
 * @Date: 2022-10-31 14:42:13
 * @Author: YanYongKang
 */
@Controller
@RequestMapping("/membersinfo")
public class MembersInfoController {

    @Autowired
    private MembersInfoService membersInfoService;

    @GetMapping("/toHtml")
    public String toHtml() {
        return "membersInfo";
    }


    @GetMapping("/query")
    @ResponseBody
    public List<Map<String, Object>> query() {
        return membersInfoService.queryAll();
    }

    @GetMapping("/queryone/{id}")
    public Map<String, Object> queryOne(@PathVariable("id") String id) {
        return membersInfoService.queryOneById(id);
    }

}
