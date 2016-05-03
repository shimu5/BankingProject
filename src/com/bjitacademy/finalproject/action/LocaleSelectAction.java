package com.bjitacademy.finalproject.action;

import com.opensymphony.xwork2.ActionSupport;

public class LocaleSelectAction extends ActionSupport{

	public String execute() {
		System.out.println("localeSelect");
		return "SUCCESS";
	}
}
