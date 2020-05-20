package com.fyj.fyjmall.fyjmallgateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    // Spring 为我们提供了一个CorsFiler 我们只需要把他放到容器来即可
    @Bean
    public CorsWebFilter corsWebFilter() {
        // 跨域的配置信息   springframework.web.cors.reactive 包下的
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 支持的请求头
        corsConfiguration.addAllowedHeader("*");
        // 支持哪些请求方式
        corsConfiguration.addAllowedMethod("*");
        // 支持哪些来源的请求
        corsConfiguration.addAllowedOrigin("*");
        // 是否允许携带 cookie
        corsConfiguration.setAllowCredentials(true);

        // 注册跨域的配置信息，任意路径下
        source.registerCorsConfiguration("/**", corsConfiguration);

        return new CorsWebFilter(source);
    }

//    @Bean
//    public CorsWebFilter corsWebFilter(){
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//
//        //1、配置跨域
//        corsConfiguration.addAllowedHeader("*");
//        corsConfiguration.addAllowedMethod("*");
//        corsConfiguration.addAllowedOrigin("*");
//        corsConfiguration.setAllowCredentials(true);
//
//        source.registerCorsConfiguration("/**",corsConfiguration);
//        return new CorsWebFilter(source);
//    }
}
