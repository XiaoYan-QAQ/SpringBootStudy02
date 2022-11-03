package cn.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: SpringBootStudy01Application
 * @Description:
 * @Date: 2022-10-31 11:44:48
 * @Author: YanYongKang
 */
@SpringBootApplication(scanBasePackages = "cn.bdqn")
@MapperScan("cn.bdqn.mapper")
public class SpringBootStudy01Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudy01Application.class, args);
    }
}
