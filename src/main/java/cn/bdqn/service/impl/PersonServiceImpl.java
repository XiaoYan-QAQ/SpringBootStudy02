package cn.bdqn.service.impl;

import cn.bdqn.mapper.PsersonMapper;
import cn.bdqn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: PersonServiceImpl
 * @Description:
 * @Date: 2022-10-31 15:21:42
 * @Author: YanYongKang
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PsersonMapper psersonMapper;

    @Override
    public List<Map<String, Object>> queryAll() {
        return psersonMapper.queryAll();
    }

    @Override
    public Map<String, Object> queryOneById(String id) {
        return psersonMapper.queryOneById(id);
    }

    @Override
    public boolean update(Map<String, Object> map) {
        return psersonMapper.update(map) > 0;
    }
}
