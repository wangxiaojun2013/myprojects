/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.company.project.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

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


@Entity
@Table(name = "goods_set_type")
public class GoodsSetType extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "产品配置-产品类型表（修改分类时候，不能修改所属父分类）";
	public static final String ALIAS_GOODS_TYPE_ID = "产品类型id";
	public static final String ALIAS_FATHER_GOODS_TYPE_ID = "上级产品类型id";
	public static final String ALIAS_LEVEL = "当前层级   0 表示 1级   1表示2级   依次类推";
	public static final String ALIAS_GOODS_TYPE_NAME = "产品类型名称";
	public static final String ALIAS_GOODS_TYPE_URL = "产品类型url(URL中要将此提现出来)";
	public static final String ALIAS_GOODS_TYPE_REMARK = "产品类型备注";
	public static final String ALIAS_SORT_SEQUENCE = "排序序号";
	public static final String ALIAS_END_TYPE_FLAG = "是否终点类型（0：否  1：是）（所有的产品在录入时候，必须选择到终点类型）";
	public static final String ALIAS_FRONT_DELETE_FLAG = "前台是否删除（0：否  1：是）";
	public static final String ALIAS_BEHIND_DISABLE_FLAG = "后台是否删除（0：否  1：是）（删除前先将后台禁用，等待该分类下的产品都下架后，再将产品类型删除；每次上架前要检查产品类型是否有效或者后台被禁用。）";
	public static final String ALIAS_HOME_FLAG = "是否有上门费（0：否  1：是）（终点类型时候，此字段有效）";
	public static final String ALIAS_SERVER_FLOW = "服务流量费率（例如输入50，代表千分之50）";
	public static final String ALIAS_MIN_EXTRA_FLOW = "最小额外流量费";
	public static final String ALIAS_MAX_EXTRA_FLOW = "最大额外流量费";
	public static final String ALIAS_ENSURE = "保证金";
	
	//date formats
	

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	
	private java.lang.Long goodsTypeId;//产品类型id
	
	private java.lang.Long fatherGoodsTypeId;//上级产品类型id
	@Max(32767)
	private Integer level;//当前层级   0 表示 1级   1表示2级   依次类推
	@Length(max=100)
	private java.lang.String goodsTypeName;//产品类型名称
	@Length(max=500)
	private java.lang.String goodsTypeUrl;//产品类型url(URL中要将此提现出来)
	@Length(max=2147483647)
	private java.lang.String goodsTypeRemark;//产品类型备注
	@Max(32767)
	private Integer sortSequence;//排序序号
	@Max(32767)
	private Integer endTypeFlag;//是否终点类型（0：否  1：是）（所有的产品在录入时候，必须选择到终点类型）
	@Max(32767)
	private Integer frontDeleteFlag;//前台是否删除（0：否  1：是）
	@Max(32767)
	private Integer behindDisableFlag;//后台是否删除（0：否  1：是）（删除前先将后台禁用，等待该分类下的产品都下架后，再将产品类型删除；每次上架前要检查产品类型是否有效或者后台被禁用。）
	@Max(32767)
	private Integer homeFlag;//是否有上门费（0：否  1：是）（终点类型时候，此字段有效）
	@Max(32767)
	private Integer serverFlow;//服务流量费率（例如输入50，代表千分之50）
	
	private java.lang.Long minExtraFlow;//最小额外流量费
	
	private java.lang.Long maxExtraFlow;//最大额外流量费
	
	private java.lang.Long ensure;//保证金
	//columns END


	public GoodsSetType(){
	}

	public GoodsSetType(
		java.lang.Long goodsTypeId
	){
		this.goodsTypeId = goodsTypeId;
	}

	

	public void setGoodsTypeId(java.lang.Long value) {
		this.goodsTypeId = value;
	}
	
	@Id @GeneratedValue(generator="custom-id")
	@GenericGenerator(name="custom-id", strategy = "increment")
	@Column(name = "goods_type_id", unique = true, nullable = false, insertable = true, updatable = true, length = 19)
	public java.lang.Long getGoodsTypeId() {
		return this.goodsTypeId;
	}
	
	@Column(name = "father_goods_type_id", unique = false, nullable = true, insertable = true, updatable = true, length = 19)
	public java.lang.Long getFatherGoodsTypeId() {
		return this.fatherGoodsTypeId;
	}
	
	public void setFatherGoodsTypeId(java.lang.Long value) {
		this.fatherGoodsTypeId = value;
	}
	
	@Column(name = "level", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
	public Integer getLevel() {
		return this.level;
	}
	
	public void setLevel(Integer value) {
		this.level = value;
	}
	
	@Column(name = "goods_type_name", unique = false, nullable = true, insertable = true, updatable = true, length = 100)
	public java.lang.String getGoodsTypeName() {
		return this.goodsTypeName;
	}
	
	public void setGoodsTypeName(java.lang.String value) {
		this.goodsTypeName = value;
	}
	
	@Column(name = "goods_type_url", unique = false, nullable = true, insertable = true, updatable = true, length = 500)
	public java.lang.String getGoodsTypeUrl() {
		return this.goodsTypeUrl;
	}
	
	public void setGoodsTypeUrl(java.lang.String value) {
		this.goodsTypeUrl = value;
	}
	
	@Column(name = "goods_type_remark", unique = false, nullable = true, insertable = true, updatable = true, length = 2147483647)
	public java.lang.String getGoodsTypeRemark() {
		return this.goodsTypeRemark;
	}
	
	public void setGoodsTypeRemark(java.lang.String value) {
		this.goodsTypeRemark = value;
	}
	
	@Column(name = "sort_sequence", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
	public Integer getSortSequence() {
		return this.sortSequence;
	}
	
	public void setSortSequence(Integer value) {
		this.sortSequence = value;
	}
	
	@Column(name = "end_type_flag", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
	public Integer getEndTypeFlag() {
		return this.endTypeFlag;
	}
	
	public void setEndTypeFlag(Integer value) {
		this.endTypeFlag = value;
	}
	
	@Column(name = "front_delete_flag", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
	public Integer getFrontDeleteFlag() {
		return this.frontDeleteFlag;
	}
	
	public void setFrontDeleteFlag(Integer value) {
		this.frontDeleteFlag = value;
	}
	
	@Column(name = "behind_disable_flag", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
	public Integer getBehindDisableFlag() {
		return this.behindDisableFlag;
	}
	
	public void setBehindDisableFlag(Integer value) {
		this.behindDisableFlag = value;
	}
	
	@Column(name = "home_flag", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
	public Integer getHomeFlag() {
		return this.homeFlag;
	}
	
	public void setHomeFlag(Integer value) {
		this.homeFlag = value;
	}
	
	@Column(name = "server_flow", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
	public Integer getServerFlow() {
		return this.serverFlow;
	}
	
	public void setServerFlow(Integer value) {
		this.serverFlow = value;
	}
	
	@Column(name = "min_extra_flow", unique = false, nullable = true, insertable = true, updatable = true, length = 19)
	public java.lang.Long getMinExtraFlow() {
		return this.minExtraFlow;
	}
	
	public void setMinExtraFlow(java.lang.Long value) {
		this.minExtraFlow = value;
	}
	
	@Column(name = "max_extra_flow", unique = false, nullable = true, insertable = true, updatable = true, length = 19)
	public java.lang.Long getMaxExtraFlow() {
		return this.maxExtraFlow;
	}
	
	public void setMaxExtraFlow(java.lang.Long value) {
		this.maxExtraFlow = value;
	}
	
	@Column(name = "ensure", unique = false, nullable = true, insertable = true, updatable = true, length = 19)
	public java.lang.Long getEnsure() {
		return this.ensure;
	}
	
	public void setEnsure(java.lang.Long value) {
		this.ensure = value;
	}
	

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("GoodsTypeId",getGoodsTypeId())
			.append("FatherGoodsTypeId",getFatherGoodsTypeId())
			.append("Level",getLevel())
			.append("GoodsTypeName",getGoodsTypeName())
			.append("GoodsTypeUrl",getGoodsTypeUrl())
			.append("GoodsTypeRemark",getGoodsTypeRemark())
			.append("SortSequence",getSortSequence())
			.append("EndTypeFlag",getEndTypeFlag())
			.append("FrontDeleteFlag",getFrontDeleteFlag())
			.append("BehindDisableFlag",getBehindDisableFlag())
			.append("HomeFlag",getHomeFlag())
			.append("ServerFlow",getServerFlow())
			.append("MinExtraFlow",getMinExtraFlow())
			.append("MaxExtraFlow",getMaxExtraFlow())
			.append("Ensure",getEnsure())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getGoodsTypeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GoodsSetType == false) return false;
		if(this == obj) return true;
		GoodsSetType other = (GoodsSetType)obj;
		return new EqualsBuilder()
			.append(getGoodsTypeId(),other.getGoodsTypeId())
			.isEquals();
	}
}

