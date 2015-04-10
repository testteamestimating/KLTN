package com.estimating.enums;

public enum TcfWeightEnum {
	
	T1_DISTIBUTED_SYSTEM(1,2.0),
	T2_PERFORMEN_OBJECTIVES(2,2.0),
	T3_END_USER_EFFICIENCY(3,1.0),
	T4_INTERNAL_PROCESSING_COMPLEXITY(4,1.0),
	T5_CODE_REUSABILITY1(5,1.0),
	T6_EASY_TO_INSTALL(6,0.5),
	T7_EASY_TO_USE(7,0.5),
	T8_PORTABILITY_TO_OTHER_PLATFORMS(8,2.0),
	T9_SYSTEM_MAINTENANCE(9,1.0),
	T10_CONCURRENT(10,1.0),
	T11_SECURITY_FEATURES(11,1.0),
	T12_ACCESS_TO_THIRD_PARTIES(12,1.0),
	T13_END_USER_TRAINING(13,1.0),
	TCF_VALUE_1(14,0.6),
	TCF_VALUE_2(15,0.01);

	private int key;
	private double value;
	/**
	 * @param key
	 * @param value
	 */
	private TcfWeightEnum(int key, double value) {
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
	
	public static TcfWeightEnum getTcfWeightEnum(Integer key) {
		if (key == null) {
			return null;
		}
		for (TcfWeightEnum value : TcfWeightEnum.values()) {
			if (key.equals(value.getKey())) {
				return value;
			}
		}
		throw new IllegalArgumentException("No matching type for id " + key);
	}
}
