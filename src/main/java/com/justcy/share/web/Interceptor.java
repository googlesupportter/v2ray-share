package com.justcy.share.web;

import com.justcy.share.service.CountSerivce;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Spring MVC 拦截器
 */
@Slf4j
@RequiredArgsConstructor
public class Interceptor extends HandlerInterceptorAdapter {
	@NonNull
	private CountSerivce countSerivce;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		// 计数
		countSerivce.incrementAndGet();
		return true;
	}
}
