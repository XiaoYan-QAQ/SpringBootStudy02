package cn.bdqn.controller;

import cn.bdqn.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: meetingRoomController
 * @Description:
 * @Date: 2022-10-31 14:13:23
 * @Author: YanYongKang
 */
@Controller
@RequestMapping("/meetingroom")
public class meetingRoomController {

    @Autowired
    private MeetingRoomService meetingRoomService;

    @GetMapping("/query")
    public String query(Model model) {
        model.addAttribute("list", meetingRoomService.queryAll());
        return "meetingroom";
    }

}
