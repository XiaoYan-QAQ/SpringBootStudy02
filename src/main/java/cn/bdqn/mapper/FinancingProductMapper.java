package cn.bdqn.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: FinancingProductMapper
 * @Description:
 * @Date: 2022-10-31 14:47:56
 * @Author: YanYongKang
 */
public interface FinancingProductMapper {


    List<Map<String, Object>> query(@Param("id") String id, @Param("risk") String risk);

}
