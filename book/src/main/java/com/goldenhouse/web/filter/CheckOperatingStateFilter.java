package com.goldenhouse.web.filter;

import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * 检查营业状态过滤器
 */
public class CheckOperatingStateFilter implements Filter {

    /**
     * 排除被拦截的路径
     */
    private List<String> excludeMappings;
    /**
     * WEB应用根路径
     */
    private String contextPath;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ServletContext servletContext=filterConfig.getServletContext();
        XmlWebApplicationContext cxt=(XmlWebApplicationContext) WebApplicationContextUtils.getWebApplicationContext( servletContext );
        if (cxt.containsBean( "excludeMappings" )) {
            excludeMappings=(List<String>) cxt.getBean( "excludeMappings" );
        }
        contextPath=servletContext.getContextPath();
    }

    @Override
    public void doFilter(ServletRequest servletRequest , ServletResponse servletResponse , FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        String requestPath=request.getRequestURI();//请求路径
        System.out.println( "**************拦截请求的路径**************" );
        System.out.println(requestPath);
        System.out.println( "******************************************" );
        if (!"/".equals( contextPath )) {
            requestPath=requestPath.replace( contextPath,"" );
        }
        //是否打烊
        Object sign=  request.getServletContext().getAttribute( "OperatingState" );
        if(sign==null){
            //未打样
            filterChain.doFilter( servletRequest, servletResponse);
            return;
        }
        if(excludeMappings!=null && excludeMappings.contains( requestPath )){
            //被排除的请求URL
            filterChain.doFilter( servletRequest, servletResponse);
            return;
        }

        //跳转到打烊页面
        servletRequest.getRequestDispatcher( "/closegdh.jsp").forward( servletRequest,servletResponse );

        //打烊
       // servletRequest.getServletContext().setAttribute( "OperatingState",1 );

        //取消打烊
        //servletRequest.getServletContext().removeAttribute( "OperatingState" );
    }

    @Override
    public void destroy() {

    }
}
