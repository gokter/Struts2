package com.flyingh.action;

import com.opensymphony.xwork2.ActionContext;

public class PermissionAction {
	public String execute() {
		ActionContext.getContext().put("message", "executed");
		return "msg";
	}
}
