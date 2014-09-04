package com.flyingh.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PermissionInterceptor implements Interceptor {

	private static final long serialVersionUID = 1169157551525189345L;

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		if (ActionContext.getContext().getSession().get("user") != null) {
			return invocation.invoke();
		}
		ActionContext.getContext().put("message", "need login");
		return "msg";
	}

}
