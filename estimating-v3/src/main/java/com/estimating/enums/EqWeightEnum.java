package com.estimating.enums;

public enum EqWeightEnum {
	
	USER_ONLINE_REQUIRES_SIMPLE(1,3),
	USER_ONLINE_REQUIRES_AVERAGE(2,4),
	USER_ONLINE_REQUIRES_COMPLEX(3,6);
	private int key;
	private int value;
	/**
	 * @param key
	 * @param value
	 */
	private EqWeightEnum(int key, int value) {
		this.key = key;
		this.value = value;
	}
	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	
	public static EqWeightEnum getEqWeightEnum(Integer key) {
		if (key == null) {
			return null;
		}
		for (EqWeightEnum value : EqWeightEnum.values()) {
			if (key.equals(value.getKey())) {
				return value;
			}
		}
		throw new IllegalArgumentException("No matching type for id " + key);
	}
}
