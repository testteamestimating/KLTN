package com.estimating.service;

import com.estimating.bean.EiWeightBean;
import com.estimating.bean.EifWeightBean;
import com.estimating.bean.EoWeightBean;
import com.estimating.bean.EqWeightBean;
import com.estimating.bean.FunctionPointBean;
import com.estimating.bean.IlfWeightBean;
import com.estimating.bean.VafWeightBean;

public interface IFunctionPointService {
	public double calEiWeight(EiWeightBean eiWeightBean);
	public double calEoWeight(EoWeightBean eoWeightBean);
	public double calEqWeight(EqWeightBean eqWeightBean);
	public double calEifWeight(EifWeightBean eifWeightBean);
	public double calIlfWeight(IlfWeightBean ilfWeightBean);
	public double calVafWeight(VafWeightBean vafWeightBean);
	
	public double calTotalPoint(FunctionPointBean functionPointBean);
	public double calTotalHour(FunctionPointBean functionPointBean);
	public double calTotalCost(FunctionPointBean functionPointBean);
	
	
}
