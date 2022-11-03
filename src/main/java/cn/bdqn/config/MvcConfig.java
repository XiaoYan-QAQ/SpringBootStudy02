package cn.bdqn.config;

import cn.bdqn.interceptor.TestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: MvcConfig
 * @Description:
 * @Date: 2022-11-02 17:39:16
 * @Author: YanYongKang
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Autowired
    TestInterceptor testInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(testInterceptor).addPathPatterns("/**").excludePathPatterns("/attence/query");
    }
}
