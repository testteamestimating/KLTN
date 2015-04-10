package com.estimating.enums;

public enum EoWeightEnum {
	
	USER_OUTPUTS_SIMPLE(1,4),
	USER_OUTPUTS_AVERAGE(2,5),
	USER_OUTPUTS_COMPLEX(3,7);
	private int key;
	private int value;
	/**
	 * @param key
	 * @param value
	 */
	private EoWeightEnum(int key, int value) {
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
	
	public static EoWeightEnum getEoWeightEnum(Integer key) {
		if (key == null) {
			return null;
		}
		for (EoWeightEnum value : EoWeightEnum.values()) {
			if (key.equals(value.getKey())) {
				return value;
			}
		}
		throw new IllegalArgumentException("No matching type for id " + key);
	}
}
