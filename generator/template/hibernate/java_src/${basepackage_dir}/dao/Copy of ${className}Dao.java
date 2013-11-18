//<#include "/java_copyright.include">
//<#assign className = table.className>   
//<#assign classNameLower = className?uncap_first>   
//package ${basepackage}.dao;
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
//<#include "/java_imports.include">
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
public class ${className}DAO extends BaseDAO{
	public ${className}DAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}
//	public Class getEntityClass() {
//		return ${className}.class;
//	}
	public List<${className}> query${className}(${className} ${className}Obj) throws DBException {
		Object[] params = {account};
		StringBuffer sql = new StringBuffer ();
		sql.append ("SELECT IMAGE_TYPE_ID, IMAGE_FATHER_TYPE_ID, IMAGE_TYPE_NAME, IS_SYS_TYPE  FROM IMAGE_TYPE where ACCOUNT_ID=? ");
		return QueryHelper.query (conn, ${className}.class, sql.toString (), params);

	}
	public Page query${className}(${className} ${className}Obj,int nowpage,int pageSize) throws Exception {
		Object[] params = {};
		StringBuffer sql = new StringBuffer ();
		sql.append ("SELECT * FROM (");
		sql.append ("SELECT ");
		<#list table.columns as column>
		<#if column_index+1==table.columns?size>
		sql.append ("${column.columnNameLower?upper_case} ");
		<#else>
		sql.append ("${column.columnNameLower?upper_case}, ");
		</#if>
		</#list>
		sql.append (" FROM ${className} ")
		sql.append (") AS TB WHERE 1=1");
		StringBuffer sqlCount = new StringBuffer ();
		sqlCount.append ("SELECT COUNT(*) ");
		sqlCount.append (sql.substring (sql.indexOf (" FROM")));
		PageHelper pageHelper = new PageHelper (conn,sql.toString (),sqlCount.toString (),nowpage,pageSize,params);
		return pageHelper.get_page_slice (${className}.class);

	}
//	public Page findPage(${className}Query query) {
//        //XsqlBuilder syntax,please see http://code.google.com/p/rapid-xsqlbuilder
//        // [column]为字符串拼接, {column}为使用占位符. [column]为使用字符串拼接,如username='[username]',偷懒时可以使用字符串拼接 
//        // [column] 为PageRequest的属性
//		String sql = "select t from ${className} t where 1=1 "
//			<#list table.columns as column>
//			  	<#if column.isNotIdOrVersionField>
//			  	<#if column.isDateTimeColumn>
//				+ "/~ and t.${column.columnNameLower} >= {${column.columnNameLower}Begin} ~/"
//				+ "/~ and t.${column.columnNameLower} <= {${column.columnNameLower}End} ~/"
//				<#else>
//			  	+ "/~ and t.${column.columnNameLower} = {${column.columnNameLower}} ~/"
//			  	</#if>
//				</#if>
//			</#list>
//				+ "/~ order by [sortColumns] ~/";
//
//        //生成sql2的原因是为了不喜欢使用xsqlbuilder的同学，请修改生成器模板，删除本段的生成
//        StringBuilder sql2 = new StringBuilder("select t from ${className} t where 1=1 ");
//        <#list table.columns as column>
//        <#if column.isDateTimeColumn>
//        if(isNotEmpty(query.get${column.columnName}Begin())) {
//            sql2.append(" and  t.${column.columnNameLower} >= :${column.columnNameLower}Begin ");
//        }
//        if(isNotEmpty(query.get${column.columnName}End())) {
//            sql2.append(" and  t.${column.columnNameLower} <= :${column.columnNameLower}End ");
//        }
//        <#else>
//        if(isNotEmpty(query.get${column.columnName}())) {
//            sql2.append(" and  t.${column.columnNameLower} = :${column.columnNameLower} ");
//        }
//        </#if>
//        </#list>
//        if(isNotEmpty(query.getSortColumns())) {
//            sql2.append(" order by :sortColumns ");
//        }	
//        
//		return pageQuery(sql,query);
//	}
//	
//	<#list table.columns as column>
//	<#if column.unique && !column.pk>
//	public ${className} getBy${column.columnName}(${column.javaType} v) {
//		return (${className}) findByProperty("${column.columnNameLower}",v);
//	}	
//	</#if>
//	</#list>

}
