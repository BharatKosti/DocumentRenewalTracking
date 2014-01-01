/**
 * Permissions for the users
 */
package com.drt.model;

/**
 * @author bharatkosti
 *
 */
public enum Permissions {
	/**
	 * Who Can add new records
	 */
	WRITE("W"),
	/**
	 * Who Can only read existing records
	 */
	READ("R"),
	/**
	 * Who Can Read,Write,Update,Delete Records and Users
	 */
	ADMIN("A"),
	/**
	 * Who Can read and update existing records
	 */
	UPDATE("U"),
	/**
	 * Who Can Read and Delete records
	 */
	DELETE("D");
	
	private String permission;

	private Permissions(String permission) {
		this.permission = permission;
	}

	public String getPermission() {
		return permission;
	}
	
	

}
