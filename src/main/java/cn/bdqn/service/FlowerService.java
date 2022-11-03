package cn.bdqn.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: FlowerService
 * @Description:
 * @Date: 2022-10-31 11:34:25
 * @Author: YanYongKang
 */
@Service
public interface FlowerService {

    List<Map<String, Object>> queryAll();
}
