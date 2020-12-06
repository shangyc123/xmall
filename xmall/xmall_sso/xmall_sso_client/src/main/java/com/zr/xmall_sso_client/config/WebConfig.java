package com.zr.xmall_sso_client.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 视图解析器
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 重定向到指定页面，url路径会发生变化
        registry.addRedirectViewController("/","index");
        // 指定视图路径，url路径不会发生变化
        //registry.addViewController("/").setViewName("index");
        registry.addRedirectViewController("/welcome","index");
    }

//    /**
//     * 配置静态访问资源，等同于yml中的相关配置
//     * @param registry
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**").addResourceLocations("file:D:/codes/projectone/xmall/frontcode/");
//    }



    /**
     * 解决跨域问题
     * @param registry
     */
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .allowCredentials(true)
//                .allowedMethods("GET", "POST", "DELETE", "PUT")
//                .maxAge(3600 * 24);
//    }
}
