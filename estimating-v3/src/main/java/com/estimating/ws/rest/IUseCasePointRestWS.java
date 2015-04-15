package com.estimating.ws.rest;

import com.estimating.bean.EfcWeightBean;
import com.estimating.bean.TcfWeightBean;
import com.estimating.bean.UsecasePointBean;
import com.estimating.bean.WasWeightBean;
import com.estimating.bean.WusWeightBean;
import com.estimating.entity.UsecasePoint;

public interface IUseCasePointRestWS {
	public double calWusWeight(WusWeightBean wusWeightBean);
	public double calWasWeight(WasWeightBean wasWeightBean);
	public double calEfcWeight(EfcWeightBean efcWeightBean);
	public double calTcfWeight(TcfWeightBean tcfWeightBean);
	public double calTotalPoint(UsecasePointBean usecasePointBean);
	public double calTotalHour(UsecasePointBean usecasePointBean);
	public double calTotalCost(UsecasePointBean usecasePointBean);
}
