package com.up.jingshan.client.platform.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * druid监控拦截器
 *
 * @Author Yuan Jingshan
 * @Date 2018-05-09
 */
@WebFilter(filterName = "druidWebStatFilter",
        urlPatterns = "/*",
        initParams = {
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*"), // 忽略资源
        })
public class DruidStatFilter extends WebStatFilter {

}