package com.estimating.enums;

public enum EfcWeightEnum {
	
	E1_FARMILIARITY_WITH_DEVELOPMENT_PROCESS_USES(1,1.5),
	E2_APPLICATION_EXPERIENCE(2,0.5),
	E3_OBJECT_EXPERIENCE_OF_TEAM(3,1.0),
	E4_LEAD_ANALYST_CAPABILITY(4,0.5),
	E5_MOTIVATION_OF_TEAM(5,1.0),
	E6_STABILITY_OF_REQUIREMENTS(6,2.0),
	E7_PART_TIME_STAFF(7,-1.0),
	E8_DIFFICULT_PROGRAMING_LANGUAGE(8,-1.0),
	ECF_VALUE_1(9,-0.03),
	ECF_VALUE_2(10,1.4);

	private int key;
	private double value;
	/**
	 * @param key
	 * @param value
	 */
	private EfcWeightEnum(int key, double value) {
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
	
	public static EfcWeightEnum getEfcWeightEnum(Integer key) {
		if (key == null) {
			return null;
		}
		for (EfcWeightEnum value : EfcWeightEnum.values()) {
			if (key.equals(value.getKey())) {
				return value;
			}
		}
		throw new IllegalArgumentException("No matching type for id " + key);
	}
}
