package com.infotech.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{

	private Integer employeeId;
	private String employeeName;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean is going through init process...");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean is going to destroy...");
	}
}
