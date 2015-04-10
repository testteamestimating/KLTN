package com.estimating.service.impl;

import org.springframework.stereotype.Service;

import com.estimating.bean.EfcWeightBean;
import com.estimating.bean.TcfWeightBean;
import com.estimating.bean.UsecasePointBean;
import com.estimating.bean.WasWeightBean;
import com.estimating.bean.WusWeightBean;
import com.estimating.enums.EfcWeightEnum;
import com.estimating.enums.TcfWeightEnum;
import com.estimating.enums.WasWeightEnum;
import com.estimating.enums.WusWeightEnum;
import com.estimating.service.IUseCasePointService;

@Service
public class UseCasePointServiceImpl implements IUseCasePointService {
	
	
	@Override
	public double calWusWeight(WusWeightBean wusWeightBean) {
		return wusWeightBean.getUsimple() * WusWeightEnum.USE_CASE_SIMPLE.getValue()
				+ wusWeightBean.getUcomplex() * WusWeightEnum.USE_CASE_AVERAGE.getValue()
				+ wusWeightBean.getUaverage() * WasWeightEnum.ACTOR_COMPLEX.getValue();
	}

	@Override
	public double calWasWeight(WasWeightBean wasWeightBean) {
		return wasWeightBean.getAsimple() * WasWeightEnum.ACTOR_SIMPLE.getValue()
				+ wasWeightBean.getAaverage() * WasWeightEnum.ACTOR_AVERAGE.getValue()
				+ wasWeightBean.getAcomplex() * WasWeightEnum.ACTOR_COMPLEX.getValue();
	}

	@Override
	public double calTcfWeight(TcfWeightBean tcfWeightBean) {
		double tfc = tcfWeightBean.getAccessFor3Parties() * TcfWeightEnum.T12_ACCESS_TO_THIRD_PARTIES.getValue() 
				+ tcfWeightBean.getComplexProcessing() * TcfWeightEnum.T4_INTERNAL_PROCESSING_COMPLEXITY.getValue() 
				+ tcfWeightBean.getConcurrentUse() * TcfWeightEnum.T10_CONCURRENT.getValue()
				+ tcfWeightBean.getDistributedSystem() * TcfWeightEnum.T1_DISTIBUTED_SYSTEM.getValue()
				+ tcfWeightBean.getEasyToChange() * TcfWeightEnum.T9_SYSTEM_MAINTENANCE.getValue()
				+ tcfWeightBean.getEasyToInstallation() * TcfWeightEnum.T6_EASY_TO_INSTALL.getValue()
				+ tcfWeightBean.getEasyToUse() * TcfWeightEnum.T7_EASY_TO_USE.getValue()
				+ tcfWeightBean.getEndUsesEfficiency() * TcfWeightEnum.T3_END_USER_EFFICIENCY.getValue()
				+ tcfWeightBean.getPerformanceObjectives() * TcfWeightEnum.T2_PERFORMEN_OBJECTIVES.getValue()
				+ tcfWeightBean.getPortable() * TcfWeightEnum.T8_PORTABILITY_TO_OTHER_PLATFORMS.getValue()
				+ tcfWeightBean.getReusableCode() * TcfWeightEnum.T5_CODE_REUSABILITY1.getValue()
				+ tcfWeightBean.getSpecialSecurity() * TcfWeightEnum.T11_SECURITY_FEATURES.getValue()
				+ tcfWeightBean.getTrainingNeeds() * TcfWeightEnum.T13_END_USER_TRAINING.getValue();
		return tfc * TcfWeightEnum.TCF_VALUE_2.getValue() + TcfWeightEnum.TCF_VALUE_1.getValue();
				
	}

	@Override
	public double calEfcWeight(EfcWeightBean efcWeightBean) {
		double efc = efcWeightBean.getApplicationExperience() * EfcWeightEnum.E2_APPLICATION_EXPERIENCE.getValue()
				+ efcWeightBean.getDifficulProgrammingLanguage() * EfcWeightEnum.E8_DIFFICULT_PROGRAMING_LANGUAGE.getValue()
				+ efcWeightBean.getFamiliarwithDevelopmentProcess() * EfcWeightEnum.E1_FARMILIARITY_WITH_DEVELOPMENT_PROCESS_USES.getValue()
				+ efcWeightBean.getLeadAnalystCapability() * EfcWeightEnum.E4_LEAD_ANALYST_CAPABILITY.getValue()
				+ efcWeightBean.getMotivation() * EfcWeightEnum.E5_MOTIVATION_OF_TEAM.getValue()
				+ efcWeightBean.getObjectOrientedExperience() * EfcWeightEnum.E3_OBJECT_EXPERIENCE_OF_TEAM.getValue()
				+ efcWeightBean.getParttimeStaff() * EfcWeightEnum.E7_PART_TIME_STAFF.getValue()
				+ efcWeightBean.getStableRequirements() * EfcWeightEnum.E6_STABILITY_OF_REQUIREMENTS.getValue();
		return efc * EfcWeightEnum.ECF_VALUE_2.getValue() + EfcWeightEnum.ECF_VALUE_1.getValue();
	}

	@Override
	public double calTotalPoint(UsecasePointBean usecasePointBean) {
		return (usecasePointBean.getWasPoint() + usecasePointBean.getWusPoint()) * usecasePointBean.getTcfPoint() * usecasePointBean.getEfcPoint() ;
	}

	@Override
	public double calTotalHour(UsecasePointBean usecasePointBean) {
		return usecasePointBean.getTotalPoint() * 20.0;
	}

	@Override
	public double calTotalCost(UsecasePointBean usecasePointBean) {
		return usecasePointBean.getTotalHour() * usecasePointBean.getPayment();
	}

}
