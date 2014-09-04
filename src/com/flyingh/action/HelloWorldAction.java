package com.flyingh.action;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class HelloWorldAction {
	private static final String SUCCESS = "success";
	private String msg;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMessage() {
		return msg;
	}

	public String execute() throws UnsupportedEncodingException {
		msg = URLEncoder.encode("Hello world!中国", "UTF-8");
		return SUCCESS;
	}

	public String mng() {
		msg = "this is a test,哈哈!";
		return "msg";
	}
}
