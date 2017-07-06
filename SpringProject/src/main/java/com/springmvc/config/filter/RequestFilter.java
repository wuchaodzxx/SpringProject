package com.springmvc.config.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * 使用注解标注过滤器
 * @WebFilter将一个实现了javax.servlet.Filte接口的类定义为过滤器
 * 属性filterName声明过滤器的名称,可选
 * 属性urlPatterns指定要过滤 的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 */
@WebFilter(filterName="RequestFilter",urlPatterns="/*")
public class RequestFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("过滤器"+this.getClass().getName()+"销毁");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("===请求到达过滤器"+this.getClass().getName()+"===");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("过滤器"+this.getClass().getName()+"初始化");
	}

}
