<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=GoodsSetType.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<s:form action="/pages/GoodsSetType/list.do" method="get" theme="simple">
		<input type="button" value="返回列表" onclick="window.location='${ctx}/pages/GoodsSetType/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<s:hidden name="goodsTypeId" id="goodsTypeId" value="%{model.goodsTypeId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_FATHER_GOODS_TYPE_ID%></td>	
				<td><s:property value="%{model.fatherGoodsTypeId}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_LEVEL%></td>	
				<td><s:property value="%{model.level}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_GOODS_TYPE_NAME%></td>	
				<td><s:property value="%{model.goodsTypeName}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_GOODS_TYPE_URL%></td>	
				<td><s:property value="%{model.goodsTypeUrl}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_GOODS_TYPE_REMARK%></td>	
				<td><s:property value="%{model.goodsTypeRemark}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_SORT_SEQUENCE%></td>	
				<td><s:property value="%{model.sortSequence}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_END_TYPE_FLAG%></td>	
				<td><s:property value="%{model.endTypeFlag}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_FRONT_DELETE_FLAG%></td>	
				<td><s:property value="%{model.frontDeleteFlag}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_BEHIND_DISABLE_FLAG%></td>	
				<td><s:property value="%{model.behindDisableFlag}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_HOME_FLAG%></td>	
				<td><s:property value="%{model.homeFlag}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_SERVER_FLOW%></td>	
				<td><s:property value="%{model.serverFlow}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_MIN_EXTRA_FLOW%></td>	
				<td><s:property value="%{model.minExtraFlow}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_MAX_EXTRA_FLOW%></td>	
				<td><s:property value="%{model.maxExtraFlow}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_ENSURE%></td>	
				<td><s:property value="%{model.ensure}" /></td>
			</tr>
		</table>
	</s:form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>