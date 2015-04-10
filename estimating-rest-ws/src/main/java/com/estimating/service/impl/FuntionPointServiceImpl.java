package com.estimating.service.impl;

import com.estimating.bean.EiWeightBean;
import com.estimating.bean.EifWeightBean;
import com.estimating.bean.EoWeightBean;
import com.estimating.bean.EqWeightBean;
import com.estimating.bean.FunctionPointBean;
import com.estimating.bean.IlfWeightBean;
import com.estimating.bean.VafWeightBean;
import com.estimating.enums.EiWeightEnum;
import com.estimating.enums.EifWeightEnum;
import com.estimating.enums.EoWeightEnum;
import com.estimating.enums.EqWeightEnum;
import com.estimating.enums.FunctionPointEnum;
import com.estimating.enums.IlfWeightEnum;
import com.estimating.service.IFunctionPointService;

public class FuntionPointServiceImpl implements IFunctionPointService {

	@Override
	public double calEiWeight(EiWeightBean eiWeightBean) {
		return eiWeightBean.getEiSimple() * EiWeightEnum.USER_INPUTS_SIMPLE.getValue()
				+ eiWeightBean.getEiAverage() + EiWeightEnum.USER_INPUTS_AVERAGE.getValue()
				+ eiWeightBean.getEiComplex() + EiWeightEnum.USER_INPUTS_COMPLEX.getValue();
	}

	@Override
	public double calEoWeight(EoWeightBean eoWeightBean) {
		return eoWeightBean.getEoSimple() + EoWeightEnum.USER_OUTPUTS_SIMPLE.getValue()
				+ eoWeightBean.getEoAverage() + EoWeightEnum.USER_OUTPUTS_AVERAGE.getValue()
				+ eoWeightBean.getEoComplex() + EoWeightEnum.USER_OUTPUTS_COMPLEX.getValue();
	}

	@Override
	public double calEqWeight(EqWeightBean eqWeightBean) {
		return eqWeightBean.getEqSimple() + EqWeightEnum.USER_ONLINE_REQUIRES_SIMPLE.getValue()
				+ eqWeightBean.getEqAverage() + EqWeightEnum.USER_ONLINE_REQUIRES_AVERAGE.getValue()
				+ eqWeightBean.getEqComplex() + EqWeightEnum.USER_ONLINE_REQUIRES_COMPLEX.getValue();
	}

	@Override
	public double calEifWeight(EifWeightBean eifWeightBean) {
		return eifWeightBean.getEifSimple() * EifWeightEnum.EXTERNAL_INTERFACES_SIMPLE.getValue()
				+ eifWeightBean.getEifAverage() * EifWeightEnum.EXTERNAL_INTERFACES_AVERAGE.getValue()
				+ eifWeightBean.getEifComplex() * EifWeightEnum.EXTERNAL_INTERFACES_COMPLEX.getValue();
	}

	@Override
	public double calIlfWeight(IlfWeightBean ilfWeightBean) {
		return ilfWeightBean.getIlfComplex() * IlfWeightEnum.LOGICAL_FILES_SIMPLE.getValue()
		+ ilfWeightBean.getIlfAverage() * IlfWeightEnum.LOGICAL_FILES_AVERAGE.getValue()
		+ ilfWeightBean.getIlfComplex() * IlfWeightEnum.LOGICAL_FILES_COMPLEX.getValue();
	}

	@Override
	public double calVafWeight(VafWeightBean vafWeightBean) {
		return vafWeightBean.getComplexProcessing() + vafWeightBean.getDataCommunications() + vafWeightBean.getDistributedDataProcessing()
				+ vafWeightBean.getEndUserEfficiency() + vafWeightBean.getFacilitateChange() + vafWeightBean.getHeavilyUsedConfiguration()
				+ vafWeightBean.getInstallationEase() + vafWeightBean.getMultipleSites() + vafWeightBean.getOnLineDataEntry()
				+ vafWeightBean.getOnLineUpdate() + vafWeightBean.getOperationalEase() + vafWeightBean.getPerformance()
				+ vafWeightBean.getReusability() + vafWeightBean.getTransactionRate();
	}

	@Override
	public double calTotalPoint(FunctionPointBean functionPointBean) {
		double temp = functionPointBean.getEifPoint() + functionPointBean.getEiPoint() + functionPointBean.getEoPoint()
				+ functionPointBean.getEqPoint() + functionPointBean.getLifPoint();
		return (functionPointBean.getVafPoint() * FunctionPointEnum.TFC_2.getValue() + FunctionPointEnum.TFC_1.getValue()) * temp;
	}

	@Override
	public double calTotalHour(FunctionPointBean functionPointBean) {
		return functionPointBean.getTotalPoint() * 20.0;
	}

	@Override
	public double calTotalCost(FunctionPointBean functionPointBean) {
		return functionPointBean.getTotalHour() * functionPointBean.getPayment();
	}

}
