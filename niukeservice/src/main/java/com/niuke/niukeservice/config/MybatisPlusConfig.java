package com.niuke.niukeservice.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: lixiaobiao
 * @Date: 2019/1/18 15:37
 * @Description:
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.niuke.niukeservice.mapper.*.mapper*")
public class MybatisPlusConfig {

    /**
     * 分页配置
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
