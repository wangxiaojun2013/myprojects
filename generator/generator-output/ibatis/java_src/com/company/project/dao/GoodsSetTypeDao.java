/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.company.project.dao;

import java.util.*;

import javacommon.base.*;
import javacommon.util.*;

import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

import com.company.project.model.*;
import com.company.project.dao.*;
import com.company.project.service.*;
import com.company.project.vo.query.*;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


import org.springframework.stereotype.Repository;


@Repository
public class GoodsSetTypeDao extends BaseIbatisDao<GoodsSetType,java.lang.Long>{
	
	@Override
	public String getIbatisSqlMapNamespace() {
		return "GoodsSetType";
	}
	
	public void saveOrUpdate(GoodsSetType entity) {
		if(entity.getGoodsTypeId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public Page findPage(GoodsSetTypeQuery query) {
		return pageQuery("GoodsSetType.findPage",query);
	}
	

}
