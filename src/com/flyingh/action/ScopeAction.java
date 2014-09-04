package com.flyingh.action;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class ScopeAction {
	public String execute() {
		final ActionContext context = ActionContext.getContext();
		context.getApplication().put("application", "application scope value");
		context.getSession().put("session", "sessioon scope value");
		context.put("request", "request scope value");
		return "success";
	}

	public String haha() {
		final HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("request", "hello world!");
		request.setAttribute("names",
				Arrays.asList("aA", "BB", "cc", "DD", "Ee"));
		return "success";
	}
}
