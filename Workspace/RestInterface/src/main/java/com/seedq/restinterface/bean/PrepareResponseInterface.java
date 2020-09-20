package com.seedq.restinterface.bean;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

public interface PrepareResponseInterface {
	public ResponseBeanInterface<CommonInterface, ErrorBeanInterface> excute(HttpServletResponse servletResponse, List<CommonInterface> commonInterface);
}
