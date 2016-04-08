/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.economize.app.Model;

/**
 *
 * @author Okubo
 */
public class department {
	private String departmentId = "";
	private String idLevel1 = "";
	private String idLevel2 = "";
	private String name = "";
	private String statusId = "";

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getIdLevel1() {
		return idLevel1;
	}

	public void setIdLevel1(String idLevel1) {
		this.idLevel1 = idLevel1;
	}

	public String getIdLevel2() {
		return idLevel2;
	}

	public void setIdLevel2(String idLevel2) {
		this.idLevel2 = idLevel2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
