package com.estimating.service;

import com.estimating.bean.EfcWeightBean;
import com.estimating.bean.TcfWeightBean;
import com.estimating.bean.UsecasePointBean;
import com.estimating.bean.WasWeightBean;
import com.estimating.bean.WusWeightBean;


public interface IUseCasePointService {
	public double calWusWeight(WusWeightBean wusWeightBean);
	public double calWasWeight(WasWeightBean wasWeightBean);
	public double calTcfWeight(TcfWeightBean tcfWeightBean);
	public double calEfcWeight(EfcWeightBean efcWeightBean);
	public double calUsecasePoint(UsecasePointBean usecasePointBean);
}
