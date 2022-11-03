package cn.bdqn.service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: FinancingProductService
 * @Description:
 * @Date: 2022-10-31 14:51:37
 * @Author: YanYongKang
 */
public interface FinancingProductService {


    List<Map<String, Object>> query(String id, String risk);
}
