package cn.bdqn.service.impl;

import cn.bdqn.mapper.AttenceMapper;
import cn.bdqn.service.AttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: AttenceServiceImpl
 * @Description:
 * @Date: 2022-10-31 14:19:57
 * @Author: YanYongKang
 */
@Service
public class AttenceServiceImpl implements AttenceService {

    @Autowired
    private AttenceMapper attenceMapper;

    @Override
    public List<Map<String, Object>> queryAll() {
        return attenceMapper.queryAll();
    }
}
