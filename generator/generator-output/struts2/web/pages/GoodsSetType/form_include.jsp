<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<s:hidden id="goodsTypeId" name="goodsTypeId" />

<!-- ONGL access static field: @package.class@field or @vs@field -->
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_FATHER_GOODS_TYPE_ID}" key="fatherGoodsTypeId" value="%{model.fatherGoodsTypeId}" cssClass="validate-integer " required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_LEVEL}" key="level" value="%{model.level}" cssClass="validate-integer max-value-2147483647" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_GOODS_TYPE_NAME}" key="goodsTypeName" value="%{model.goodsTypeName}" cssClass="" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_GOODS_TYPE_URL}" key="goodsTypeUrl" value="%{model.goodsTypeUrl}" cssClass="" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_GOODS_TYPE_REMARK}" key="goodsTypeRemark" value="%{model.goodsTypeRemark}" cssClass="" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_SORT_SEQUENCE}" key="sortSequence" value="%{model.sortSequence}" cssClass="validate-integer max-value-2147483647" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_END_TYPE_FLAG}" key="endTypeFlag" value="%{model.endTypeFlag}" cssClass="validate-integer max-value-2147483647" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_FRONT_DELETE_FLAG}" key="frontDeleteFlag" value="%{model.frontDeleteFlag}" cssClass="validate-integer max-value-2147483647" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_BEHIND_DISABLE_FLAG}" key="behindDisableFlag" value="%{model.behindDisableFlag}" cssClass="validate-integer max-value-2147483647" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_HOME_FLAG}" key="homeFlag" value="%{model.homeFlag}" cssClass="validate-integer max-value-2147483647" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_SERVER_FLOW}" key="serverFlow" value="%{model.serverFlow}" cssClass="validate-integer max-value-2147483647" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_MIN_EXTRA_FLOW}" key="minExtraFlow" value="%{model.minExtraFlow}" cssClass="validate-integer " required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_MAX_EXTRA_FLOW}" key="maxExtraFlow" value="%{model.maxExtraFlow}" cssClass="validate-integer " required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.GoodsSetType@ALIAS_ENSURE}" key="ensure" value="%{model.ensure}" cssClass="validate-integer " required="false" />
	
