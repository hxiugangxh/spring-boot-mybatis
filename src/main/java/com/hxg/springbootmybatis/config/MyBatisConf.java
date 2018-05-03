/*
package com.hxg.springbootmybatis.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Properties;

@Configuration
public class MyBatisConf extends WebMvcConfigurerAdapter {


	*/
/*@Bean
	public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		
		Interceptor[] plugins =  new Interceptor[]{pageHelper()};
		sqlSessionFactoryBean.setPlugins(plugins);

		// 指定mybatisxml文件路径
	   sqlSessionFactoryBean.setMapperLocations(resolver
				.getResources("classpath:/mybatis/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}*//*



    */
/**
     * 注册MyBatis分页插件PageHelper
     *
     * @return
     *//*

    @Bean
    public PageHelper pageHelper() {
        System.out.println("MyBatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }

    public void configurePathMatch(PathMatchConfigurer configurer) {
        super.configurePathMatch(configurer);
        */
/**
         * 设置是否后缀模式匹配
         * 若设置为false的时候，前台是setUseTrailingSlashMatch为true
         *//*

        configurer.setUseSuffixPatternMatch(false).setUseTrailingSlashMatch(true);
    }


}
*/
