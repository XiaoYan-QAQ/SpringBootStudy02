package cn.bdqn.service.impl;

import cn.bdqn.mapper.FinancingProductMapper;
import cn.bdqn.service.FinancingProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: FinancingProductServiceImpl
 * @Description:
 * @Date: 2022-10-31 14:52:35
 * @Author: YanYongKang
 */
@Service
public class FinancingProductServiceImpl implements FinancingProductService {
    @Autowired
    private FinancingProductMapper financingProductMapper;

    @Override
    public List<Map<String, Object>> query(String id, String risk) {
        return financingProductMapper.query(id, risk);
    }
}
