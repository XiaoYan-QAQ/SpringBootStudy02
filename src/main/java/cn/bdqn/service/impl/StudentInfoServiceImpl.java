package cn.bdqn.service.impl;

import cn.bdqn.mapper.StudentInfoMapper;
import cn.bdqn.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: StudentInfoServiceImpl
 * @Description:
 * @Date: 2022-10-31 14:28:20
 * @Author: YanYongKang
 */
@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public List<Map<String, Object>> queryAll() {
        return studentInfoMapper.queryAll();
    }

    @Override
    public Map<String, Object> queryOneById(String id) {
        return studentInfoMapper.queryOneById(id);
    }
}
