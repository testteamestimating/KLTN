package com.estimating.enums;

public enum WusWeightEnum {
	
	USE_CASE_SIMPLE(1,5),
	USE_CASE_AVERAGE(2,10),
	USE_CASE_COMPLEX(3,15);
	private int key;
	private int value;
	/**
	 * @param key
	 * @param value
	 */
	private WusWeightEnum(int key, int value) {
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
	
	public static WusWeightEnum getWusWeightEnum(Integer key) {
		if (key == null) {
			return null;
		}
		for (WusWeightEnum value : WusWeightEnum.values()) {
			if (key.equals(value.getKey())) {
				return value;
			}
		}
		throw new IllegalArgumentException("No matching type for id " + key);
	}
}
