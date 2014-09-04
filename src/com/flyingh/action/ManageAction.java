package com.flyingh.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ManageAction extends ActionSupport {
	private static final long serialVersionUID = -1919267354679032543L;
	private String name;
	private Date birthday;
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String save() {
		ActionContext.getContext().put("message", "save success");
		return "success";
	}

	public String update() {
		ActionContext.getContext().put("message", "update success");
		return "success";
	}

	// @Override
	// public void validate() {
	// super.validate();
	// System.out.println("validate");
	// }
	//
	// public void validateUpdate() {
	// System.out.println("validateUpdate");
	// if (StringUtils.isBlank(name)) {
	// addFieldError("name", "name should not be empty");
	// }
	// if (StringUtils.isBlank(phone)) {
	// addFieldError("phone", "phone should not be empty");
	// } else if (!phone.matches("1[358]\\d{9}")) {
	// addFieldError("phone", "the format of phone is wrong");
	// }
	// }

}
