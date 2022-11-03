package cn.bdqn.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: StudentInfoMapper
 * @Description:
 * @Date: 2022-10-31 14:23:24
 * @Author: YanYongKang
 */
public interface StudentInfoMapper {

    List<Map<String, Object>> queryAll();

    Map<String, Object> queryOneById(@Param("id") String id);

}
