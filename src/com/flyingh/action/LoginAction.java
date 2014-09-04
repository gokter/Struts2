package com.flyingh.action;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	public String login() {
		ActionContext.getContext().getSession().put("user", "haha");
		ActionContext.getContext().put("message", "login");
		return "msg";
	}

	public String logout() {
		ActionContext.getContext().getSession().remove("user");
		ActionContext.getContext().put("message", "logout");
		return "msg";
	}
}
