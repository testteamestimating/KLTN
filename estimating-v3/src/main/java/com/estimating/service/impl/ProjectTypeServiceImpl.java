package com.estimating.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.estimating.bean.ProjectTypeBean;
import com.estimating.entity.ProjectType;
import com.estimating.service.core.AbstractBaseService;
import com.estimating.service.core.IProjectTypeService;

@Service
public class ProjectTypeServiceImpl extends AbstractBaseService implements IProjectTypeService {
	@Override
	public List<ProjectTypeBean> findAll() {
		List<ProjectType> projectTypes = projectTypeDao.findAll();
		List<ProjectTypeBean> result = new ArrayList<ProjectTypeBean>();
		for (ProjectType projectType : projectTypes) {
			ProjectTypeBean bean = new ProjectTypeBean();
			BeanUtils.copyProperties(projectType, bean);
			result.add(bean);
		}
		return result;
	}
}
