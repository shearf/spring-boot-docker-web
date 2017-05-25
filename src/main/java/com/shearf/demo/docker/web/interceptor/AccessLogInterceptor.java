package com.shearf.demo.docker.web.interceptor;

import com.shearf.demo.docker.domain.entity.AccessLog;
import com.shearf.demo.docker.service.AccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.InetAddress;
import java.util.Date;

/**
 * Created by xiahaihu on 17/5/25.
 */
@Component
public class AccessLogInterceptor implements HandlerInterceptor {

    @Autowired
    private AccessLogService accessLogService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        AccessLog accessLog = new AccessLog();
        accessLog.setRemoteAddr(InetAddress.getLocalHost().getHostAddress());
        accessLog.setCreateTime(new Date());
        accessLogService.createLog(accessLog);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
