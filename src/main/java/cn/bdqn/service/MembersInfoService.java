package cn.bdqn.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: MembersInfoService
 * @Description:
 * @Date: 2022-10-31 14:40:43
 * @Author: YanYongKang
 */
public interface MembersInfoService {

    List<Map<String, Object>> queryAll();

    Map<String, Object> queryOneById(@Param("id") String id);
}
