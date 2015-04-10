package com.estimating.enums;

public enum IlfWeightEnum {
	
	LOGICAL_FILES_SIMPLE(1,7),
	LOGICAL_FILES_AVERAGE(2,10),
	LOGICAL_FILES_COMPLEX(3,15);
	private int key;
	private int value;
	/**
	 * @param key
	 * @param value
	 */
	private IlfWeightEnum(int key, int value) {
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
	
	public static IlfWeightEnum getIlfWeightEnum(Integer key) {
		if (key == null) {
			return null;
		}
		for (IlfWeightEnum value : IlfWeightEnum.values()) {
			if (key.equals(value.getKey())) {
				return value;
			}
		}
		throw new IllegalArgumentException("No matching type for id " + key);
	}
}
