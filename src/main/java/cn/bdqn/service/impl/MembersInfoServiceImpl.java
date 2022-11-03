package cn.bdqn.service.impl;

import cn.bdqn.mapper.MembersInfoMapper;
import cn.bdqn.service.MembersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: MembersInfoServiceImpl
 * @Description:
 * @Date: 2022-10-31 14:40:55
 * @Author: YanYongKang
 */
@Service
public class MembersInfoServiceImpl implements MembersInfoService {

    @Autowired
    private MembersInfoMapper membersInfoMapper;

    @Override
    public List<Map<String, Object>> queryAll() {
        return membersInfoMapper.queryAll();
    }

    @Override
    public Map<String, Object> queryOneById(String id) {
        return membersInfoMapper.queryOneById(id);
    }
}
