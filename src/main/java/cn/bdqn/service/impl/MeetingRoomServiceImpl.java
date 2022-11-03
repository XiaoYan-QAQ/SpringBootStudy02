package cn.bdqn.service.impl;

import cn.bdqn.mapper.MeetingRoomMapper;
import cn.bdqn.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: MeetingRoomServiceImpl
 * @Description:
 * @Date: 2022-10-31 14:12:43
 * @Author: YanYongKang
 */
@Service
public class MeetingRoomServiceImpl implements MeetingRoomService {

    @Autowired
    private MeetingRoomMapper meetingRoomMapper;

    @Override
    public List<Map<String, Object>> queryAll() {
        return meetingRoomMapper.queryAll();
    }
}
