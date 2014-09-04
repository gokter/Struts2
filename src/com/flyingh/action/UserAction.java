package com.flyingh.action;

import java.util.Date;

public class UserAction {
	private Date date;
	private String abc;

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String execute() {
		return "success";
	}

}
