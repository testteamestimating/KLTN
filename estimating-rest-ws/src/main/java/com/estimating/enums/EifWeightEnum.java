package com.estimating.enums;

public enum EifWeightEnum {
	
	EXTERNAL_INTERFACES_SIMPLE(1,5),
	EXTERNAL_INTERFACES_AVERAGE(2,7),
	EXTERNAL_INTERFACES_COMPLEX(3,10);
	private int key;
	private int value;
	/**
	 * @param key
	 * @param value
	 */
	private EifWeightEnum(int key, int value) {
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
	
	public static EifWeightEnum getEifWeightEnum(Integer key) {
		if (key == null) {
			return null;
		}
		for (EifWeightEnum value : EifWeightEnum.values()) {
			if (key.equals(value.getKey())) {
				return value;
			}
		}
		throw new IllegalArgumentException("No matching type for id " + key);
	}
}
