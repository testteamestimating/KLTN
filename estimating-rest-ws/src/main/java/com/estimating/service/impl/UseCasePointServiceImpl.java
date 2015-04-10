package com.estimating.service.impl;

import org.springframework.stereotype.Service;

import com.estimating.bean.EfcWeightBean;
import com.estimating.bean.TcfWeightBean;
import com.estimating.bean.UsecasePointBean;
import com.estimating.bean.WasWeightBean;
import com.estimating.bean.WusWeightBean;
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
		return wasWeightBean.getAsimple()   + wasWeightBean.getAaverage() + wasWeightBean.getAcomplex();
	}

	@Override
	public double calTcfWeight(TcfWeightBean tcfWeightBean) {
		return 0;
	}

	@Override
	public double calEfcWeight(EfcWeightBean efcWeightBean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calUsecasePoint(UsecasePointBean usecasePointBean) {
		// TODO Auto-generated method stub
		return 0;
	}

}
