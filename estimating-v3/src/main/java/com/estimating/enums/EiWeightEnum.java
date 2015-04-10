package com.estimating.enums;

public enum EiWeightEnum {
	
	USER_INPUTS_SIMPLE(1,2),
	USER_INPUTS_AVERAGE(2,4),
	USER_INPUTS_COMPLEX(3,6);
	private int key;
	private int value;
	/**
	 * @param key
	 * @param value
	 */
	private EiWeightEnum(int key, int value) {
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
	
	public static EiWeightEnum getEiWeightEnum(Integer key) {
		if (key == null) {
			return null;
		}
		for (EiWeightEnum value : EiWeightEnum.values()) {
			if (key.equals(value.getKey())) {
				return value;
			}
		}
		throw new IllegalArgumentException("No matching type for id " + key);
	}
}
