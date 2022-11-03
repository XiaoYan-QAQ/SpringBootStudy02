package cn.bdqn.config;

import cn.bdqn.filter.TestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: FilterConfig
 * @Description:
 * @Date: 2022-11-02 19:20:49
 * @Author: YanYongKang
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new TestFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
