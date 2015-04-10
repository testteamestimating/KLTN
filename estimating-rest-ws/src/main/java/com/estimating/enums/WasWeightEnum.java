package com.estimating.enums;

public enum WasWeightEnum {
	
	ACTOR_SIMPLE(1,1),
	ACTOR_AVERAGE(2,2),
	ACTOR_COMPLEX(3,2);
	private int key;
	private int value;
	/**
	 * @param key
	 * @param value
	 */
	private WasWeightEnum(int key, int value) {
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
	
	public static WasWeightEnum getWasWeightEnum(Integer key) {
		if (key == null) {
			return null;
		}
		for (WasWeightEnum value : WasWeightEnum.values()) {
			if (key.equals(value.getKey())) {
				return value;
			}
		}
		throw new IllegalArgumentException("No matching type for id " + key);
	}
}
