package com.flyingh.action;

public class InfoAction {
	private String info;

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public String execute() {
		if (info == null) {
			info = "execute";
		}
		return "success";
	}

	public String a() {
		info = "a";
		return "success";
	}

	public String b() {
		info = "b";
		return "success";
	}

}
