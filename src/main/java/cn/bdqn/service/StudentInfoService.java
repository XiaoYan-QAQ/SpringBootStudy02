package cn.bdqn.service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: StudentInfoService
 * @Description:
 * @Date: 2022-10-31 14:28:06
 * @Author: YanYongKang
 */
public interface StudentInfoService {

    List<Map<String, Object>> queryAll();

    Map<String, Object> queryOneById(String id);
}
