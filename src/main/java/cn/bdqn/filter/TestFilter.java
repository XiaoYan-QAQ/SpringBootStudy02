package cn.bdqn.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName: TestFilter
 * @Description:
 * @Date: 2022-11-02 19:19:08
 * @Author: YanYongKang
 */
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    }

    @Override
    public void destroy() {

    }
}
