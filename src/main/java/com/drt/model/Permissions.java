/**
 * 
 */
package com.drt.model;

/**
 * @author bharatkosti
 *
 */
public enum Permissions {
	WRITE("W"),READ("R"),ADMIN("A"),READDELETE("RD"),WRITEREAD("WR");
	private String permission;

	private Permissions(String permission) {
		this.permission = permission;
	}

	public String getPermission() {
		return permission;
	}
	
	

}
