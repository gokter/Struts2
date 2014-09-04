package com.flyingh.action;

import java.util.Arrays;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class I18nAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() {
		ActionContext.getContext().put("message",
				getText("welcome", Arrays.asList("Flycoding", "SH")));
		return "msg";
	}

}
