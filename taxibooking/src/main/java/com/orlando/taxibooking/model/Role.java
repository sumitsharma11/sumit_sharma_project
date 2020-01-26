package com.orlando.taxibooking.model;

import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity                         
public class Role {
    @Id
    private Integer roleId;
	private String role;
	
	@OneToOne(mappedBy = "role")
	private User user;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role(Integer roleId, String role, User user) {
		super();
		this.roleId = roleId;
		this.role = role;
		this.user = user;
	}

	public Role() {
		super();
	}
	
	
}
