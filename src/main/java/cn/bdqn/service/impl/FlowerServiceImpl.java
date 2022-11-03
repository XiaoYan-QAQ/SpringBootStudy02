package cn.bdqn.service.impl;

import cn.bdqn.mapper.FlowerMapper;
import cn.bdqn.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: FlowerServiceImpl
 * @Description:
 * @Date: 2022-10-31 11:35:05
 * @Author: YanYongKang
 */
@Service
public class FlowerServiceImpl implements FlowerService {

    @Autowired
    private FlowerMapper flowerMapper;

    @Override
    public List<Map<String, Object>> queryAll() {
        return flowerMapper.queryAll();
    }
}
