/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.company.project.model;
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

public class GoodsSetType implements java.io.Serializable{


	private static final long serialVersionUID = 5454155825314635342L;
	private java.lang.Long goods_type_id;//产品类型id
	private java.lang.Long father_goods_type_id;//上级产品类型id
	private Integer level;//当前层级   0 表示 1级   1表示2级   依次类推
	private java.lang.String goods_type_name;//产品类型名称
	private java.lang.String goods_type_url;//产品类型url(URL中要将此提现出来)
	private java.lang.String goods_type_remark;//产品类型备注
	private Integer sort_sequence;//排序序号
	private Integer end_type_flag;//是否终点类型（0：否  1：是）（所有的产品在录入时候，必须选择到终点类型）
	private Integer front_delete_flag;//前台是否删除（0：否  1：是）
	private Integer behind_disable_flag;//后台是否删除（0：否  1：是）（删除前先将后台禁用，等待该分类下的产品都下架后，再将产品类型删除；每次上架前要检查产品类型是否有效或者后台被禁用。）
	private Integer home_flag;//是否有上门费（0：否  1：是）（终点类型时候，此字段有效）
	private Integer server_flow;//服务流量费率（例如输入50，代表千分之50）
	private java.lang.Long min_extra_flow;//最小额外流量费
	private java.lang.Long max_extra_flow;//最大额外流量费
	private java.lang.Long ensure;//保证金
	public void setGoods_type_id(java.lang.Long goods_type_id) {
		this.goods_type_id = goods_type_id;
	}

	public java.lang.Long getgoods_type_id() {
		return this.goods_type_id;
	}


	public java.lang.Long getFather_goods_type_id() {
		return this.father_goods_type_id;
	}

	public void setFather_goods_type_id(java.lang.Long father_goods_type_id) {
		this.father_goods_type_id = father_goods_type_id;
	}


	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}


	public java.lang.String getGoods_type_name() {
		return this.goods_type_name;
	}

	public void setGoods_type_name(java.lang.String goods_type_name) {
		this.goods_type_name = goods_type_name;
	}


	public java.lang.String getGoods_type_url() {
		return this.goods_type_url;
	}

	public void setGoods_type_url(java.lang.String goods_type_url) {
		this.goods_type_url = goods_type_url;
	}


	public java.lang.String getGoods_type_remark() {
		return this.goods_type_remark;
	}

	public void setGoods_type_remark(java.lang.String goods_type_remark) {
		this.goods_type_remark = goods_type_remark;
	}


	public Integer getSort_sequence() {
		return this.sort_sequence;
	}

	public void setSort_sequence(Integer sort_sequence) {
		this.sort_sequence = sort_sequence;
	}


	public Integer getEnd_type_flag() {
		return this.end_type_flag;
	}

	public void setEnd_type_flag(Integer end_type_flag) {
		this.end_type_flag = end_type_flag;
	}


	public Integer getFront_delete_flag() {
		return this.front_delete_flag;
	}

	public void setFront_delete_flag(Integer front_delete_flag) {
		this.front_delete_flag = front_delete_flag;
	}


	public Integer getBehind_disable_flag() {
		return this.behind_disable_flag;
	}

	public void setBehind_disable_flag(Integer behind_disable_flag) {
		this.behind_disable_flag = behind_disable_flag;
	}


	public Integer getHome_flag() {
		return this.home_flag;
	}

	public void setHome_flag(Integer home_flag) {
		this.home_flag = home_flag;
	}


	public Integer getServer_flow() {
		return this.server_flow;
	}

	public void setServer_flow(Integer server_flow) {
		this.server_flow = server_flow;
	}


	public java.lang.Long getMin_extra_flow() {
		return this.min_extra_flow;
	}

	public void setMin_extra_flow(java.lang.Long min_extra_flow) {
		this.min_extra_flow = min_extra_flow;
	}


	public java.lang.Long getMax_extra_flow() {
		return this.max_extra_flow;
	}

	public void setMax_extra_flow(java.lang.Long max_extra_flow) {
		this.max_extra_flow = max_extra_flow;
	}


	public java.lang.Long getEnsure() {
		return this.ensure;
	}

	public void setEnsure(java.lang.Long ensure) {
		this.ensure = ensure;
	}


}
