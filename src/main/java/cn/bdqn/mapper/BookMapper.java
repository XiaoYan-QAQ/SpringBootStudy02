package cn.bdqn.mapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: BookMapper
 * @Description:
 * @Date: 2022-10-31 15:27:37
 * @Author: YanYongKang
 */
public interface BookMapper {

    List<Map<String, Object>> queryAll();

}
