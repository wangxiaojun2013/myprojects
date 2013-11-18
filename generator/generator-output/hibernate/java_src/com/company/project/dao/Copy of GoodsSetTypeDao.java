///*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */


//   
//   
//package com.company.project.dao;
/**
 *@Project: 588生活服务平台 
 *@Title: ImageDAO.java 
 *@Package com.werun.diy588.provider.image.dao 
 *@Description: TODO(用一句话描述该文件做什么) 
 *@author wangxiaojun  wangxj_wangyi@163.com 
 *@date Oct 28, 2013 11:24:45 AM 
 *@Copyright:Copyright (c) 
 *@Company:wrs
 *@version V1.0 
 */
package com.werun.diy588.provider.image.dao;
//import java.util.*;

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


import java.sql.Connection;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.lovver.jrails.common.pool.exception.DBException;
import com.werun.diy588.common.dao.BaseDAO;
import com.werun.diy588.common.helper.LikeHelper;
import com.werun.diy588.common.helper.PageHelper;
import com.werun.diy588.common.helper.QueryHelper;
import com.werun.diy588.common.models.ImageInfo;
import com.werun.diy588.common.models.ImageType;
import com.werun.diy588.common.models.Page;
//import static cn.org.rapid_framework.util.ObjectUtils.*;
//import org.springframework.stereotype.Repository;

//@Repository
public class GoodsSetTypeDAO extends BaseDAO{
	public GoodsSetTypeDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}
//	public Class getEntityClass() {
//		return GoodsSetType.class;
//	}
	public List<GoodsSetType> queryGoodsSetType(GoodsSetType GoodsSetTypeObj) throws DBException {
		Object[] params = {account};
		StringBuffer sql = new StringBuffer ();
		sql.append ("SELECT IMAGE_TYPE_ID, IMAGE_FATHER_TYPE_ID, IMAGE_TYPE_NAME, IS_SYS_TYPE  FROM IMAGE_TYPE where ACCOUNT_ID=? ");
		return QueryHelper.query (conn, GoodsSetType.class, sql.toString (), params);

	}
	public Page queryGoodsSetType(GoodsSetType GoodsSetTypeObj,int nowpage,int pageSize) throws Exception {
		Object[] params = {};
		StringBuffer sql = new StringBuffer ();
		sql.append ("SELECT * FROM (");
		sql.append ("SELECT ");
		sql.append ("GOODSTYPEID, ");
		sql.append ("FATHERGOODSTYPEID, ");
		sql.append ("LEVEL, ");
		sql.append ("GOODSTYPENAME, ");
		sql.append ("GOODSTYPEURL, ");
		sql.append ("GOODSTYPEREMARK, ");
		sql.append ("SORTSEQUENCE, ");
		sql.append ("ENDTYPEFLAG, ");
		sql.append ("FRONTDELETEFLAG, ");
		sql.append ("BEHINDDISABLEFLAG, ");
		sql.append ("HOMEFLAG, ");
		sql.append ("SERVERFLOW, ");
		sql.append ("MINEXTRAFLOW, ");
		sql.append ("MAXEXTRAFLOW, ");
		sql.append ("ENSURE ");
		sql.append (" FROM GoodsSetType ")
		sql.append (") AS TB WHERE 1=1");
		StringBuffer sqlCount = new StringBuffer ();
		sqlCount.append ("SELECT COUNT(*) ");
		sqlCount.append (sql.substring (sql.indexOf (" FROM")));
		PageHelper pageHelper = new PageHelper (conn,sql.toString (),sqlCount.toString (),nowpage,pageSize,params);
		return pageHelper.get_page_slice (GoodsSetType.class);

	}
//	public Page findPage(GoodsSetTypeQuery query) {
//        //XsqlBuilder syntax,please see http://code.google.com/p/rapid-xsqlbuilder
//        // [column]为字符串拼接, {column}为使用占位符. [column]为使用字符串拼接,如username='[username]',偷懒时可以使用字符串拼接 
//        // [column] 为PageRequest的属性
//		String sql = "select t from GoodsSetType t where 1=1 "
//			
//			  	
//			
//			  	
//			  	
//			  	+ "/~ and t.fatherGoodsTypeId = {fatherGoodsTypeId} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.level = {level} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.goodsTypeName = {goodsTypeName} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.goodsTypeUrl = {goodsTypeUrl} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.goodsTypeRemark = {goodsTypeRemark} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.sortSequence = {sortSequence} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.endTypeFlag = {endTypeFlag} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.frontDeleteFlag = {frontDeleteFlag} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.behindDisableFlag = {behindDisableFlag} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.homeFlag = {homeFlag} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.serverFlow = {serverFlow} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.minExtraFlow = {minExtraFlow} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.maxExtraFlow = {maxExtraFlow} ~/"
//			  	
//				
//			
//			  	
//			  	
//			  	+ "/~ and t.ensure = {ensure} ~/"
//			  	
//				
//			
//				+ "/~ order by [sortColumns] ~/";
//
//        //生成sql2的原因是为了不喜欢使用xsqlbuilder的同学，请修改生成器模板，删除本段的生成
//        StringBuilder sql2 = new StringBuilder("select t from GoodsSetType t where 1=1 ");
//        
//        
//        if(isNotEmpty(query.getGoodsTypeId())) {
//            sql2.append(" and  t.goodsTypeId = :goodsTypeId ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getFatherGoodsTypeId())) {
//            sql2.append(" and  t.fatherGoodsTypeId = :fatherGoodsTypeId ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getLevel())) {
//            sql2.append(" and  t.level = :level ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getGoodsTypeName())) {
//            sql2.append(" and  t.goodsTypeName = :goodsTypeName ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getGoodsTypeUrl())) {
//            sql2.append(" and  t.goodsTypeUrl = :goodsTypeUrl ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getGoodsTypeRemark())) {
//            sql2.append(" and  t.goodsTypeRemark = :goodsTypeRemark ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getSortSequence())) {
//            sql2.append(" and  t.sortSequence = :sortSequence ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getEndTypeFlag())) {
//            sql2.append(" and  t.endTypeFlag = :endTypeFlag ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getFrontDeleteFlag())) {
//            sql2.append(" and  t.frontDeleteFlag = :frontDeleteFlag ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getBehindDisableFlag())) {
//            sql2.append(" and  t.behindDisableFlag = :behindDisableFlag ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getHomeFlag())) {
//            sql2.append(" and  t.homeFlag = :homeFlag ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getServerFlow())) {
//            sql2.append(" and  t.serverFlow = :serverFlow ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getMinExtraFlow())) {
//            sql2.append(" and  t.minExtraFlow = :minExtraFlow ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getMaxExtraFlow())) {
//            sql2.append(" and  t.maxExtraFlow = :maxExtraFlow ");
//        }
//        
//        
//        
//        if(isNotEmpty(query.getEnsure())) {
//            sql2.append(" and  t.ensure = :ensure ");
//        }
//        
//        
//        if(isNotEmpty(query.getSortColumns())) {
//            sql2.append(" order by :sortColumns ");
//        }	
//        
//		return pageQuery(sql,query);
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	

}
