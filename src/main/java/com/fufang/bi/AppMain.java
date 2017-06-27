package com.fufang.bi;


import java.util.List;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@SpringBootApplication
//开启通用注解扫描
@ComponentScan
public class AppMain  extends SpringBootServletInitializer  { //WebMvcConfigurerAdapter  //implements WebMvcConfigurerAdapter

//	 @Bean
//	    public HttpMessageConverters fastJsonHttpMessageConverters() {
//	       FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//	       FastJsonConfig fastJsonConfig = new FastJsonConfig();
//	       fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//	       fastConverter.setFastJsonConfig(fastJsonConfig);
//	       HttpMessageConverter<?> converter = fastConverter;
//	       return new HttpMessageConverters(converter);
//	    }
	    
	  public static void main(String[] args) {  
		  SpringApplication application = new SpringApplication(AppMain.class);
		  /*
	         * Banner.Mode.OFF:关闭;
	         * Banner.Mode.CONSOLE:控制台输出，默认方式;
	         * Banner.Mode.LOG:日志输出方式;
	         */
	         application.setBannerMode(Banner.Mode.OFF);
	         application.run( args);  
	  } 
	  	/**
	     * 配置拦截器
	     */
//	    public void addInterceptors(InterceptorRegistry registry) {
//	    	registry.addInterceptor(new BiInterceptor()).addPathPatterns("/*/**").excludePathPatterns("/login/*");
//	    	 super.addInterceptors(registry);
//		}
//	    

	

}
