package cn.bdqn.service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: PsersonService
 * @Description:
 * @Date: 2022-10-31 15:21:15
 * @Author: YanYongKang
 */
public interface PersonService {

    List<Map<String, Object>> queryAll();

    Map<String, Object> queryOneById(String id);

    boolean update(Map<String, Object> map);
}
