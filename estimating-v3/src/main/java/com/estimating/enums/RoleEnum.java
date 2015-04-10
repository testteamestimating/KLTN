package com.estimating.enums;

public enum RoleEnum {
	ROLE_USER(1, "ROLE_USER"), ROLE_ADMIN(2, "ROLE_ADMIN");
	private int key;
	private String value;

	private RoleEnum(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public static RoleEnum getRoleValue(Integer key) {
		if (key == null) {
			return null;
		}
		for (RoleEnum role : RoleEnum.values()) {
			if (key.equals(role.getKey())) {
				return role;
			}
		}
		throw new IllegalArgumentException("No matching type for id " + key);
	}
}
