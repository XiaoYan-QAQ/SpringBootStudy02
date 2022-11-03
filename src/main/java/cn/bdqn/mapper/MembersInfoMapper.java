package cn.bdqn.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: MembersInfo
 * @Description:
 * @Date: 2022-10-31 14:37:17
 * @Author: YanYongKang
 */
public interface MembersInfoMapper {

    List<Map<String, Object>> queryAll();

    Map<String, Object> queryOneById(@Param("id") String id);
}
