package cn.bdqn.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: TestIntercepor
 * @Description:
 * @Date: 2022-11-02 17:37:57
 * @Author: YanYongKang
 */
@Component
public class TestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return false;
    }
}
