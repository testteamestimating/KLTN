package com.estimating.enums;

public enum FunctionPointEnum {
	
	TFC_1(1,0.65),
	TFC_2(2,0.01);
	
	private int key;
	private double value;
	/**
	 * @param key
	 * @param value
	 */
	private FunctionPointEnum(int key, double value) {
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
	public double getValue() {
		return value;
	}
	
	public static FunctionPointEnum getFunctionPointEnum(Integer key) {
		if (key == null) {
			return null;
		}
		for (FunctionPointEnum value : FunctionPointEnum.values()) {
			if (key.equals(value.getKey())) {
				return value;
			}
		}
		throw new IllegalArgumentException("No matching type for id " + key);
	}
}
