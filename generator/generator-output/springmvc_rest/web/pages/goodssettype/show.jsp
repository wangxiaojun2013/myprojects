<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=GoodsSetType.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form:form modelAttribute="goodssettype"  >
		<input type="button" value="返回列表" onclick="window.location='${ctx}/goodssettype'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="goodsTypeId" name="goodsTypeId" value="${goodsSetType.goodsTypeId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_FATHER_GOODS_TYPE_ID%></td>	
				<td><c:out value='${goodsSetType.fatherGoodsTypeId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_LEVEL%></td>	
				<td><c:out value='${goodsSetType.level}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_GOODS_TYPE_NAME%></td>	
				<td><c:out value='${goodsSetType.goodsTypeName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_GOODS_TYPE_URL%></td>	
				<td><c:out value='${goodsSetType.goodsTypeUrl}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_GOODS_TYPE_REMARK%></td>	
				<td><c:out value='${goodsSetType.goodsTypeRemark}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_SORT_SEQUENCE%></td>	
				<td><c:out value='${goodsSetType.sortSequence}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_END_TYPE_FLAG%></td>	
				<td><c:out value='${goodsSetType.endTypeFlag}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_FRONT_DELETE_FLAG%></td>	
				<td><c:out value='${goodsSetType.frontDeleteFlag}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_BEHIND_DISABLE_FLAG%></td>	
				<td><c:out value='${goodsSetType.behindDisableFlag}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_HOME_FLAG%></td>	
				<td><c:out value='${goodsSetType.homeFlag}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_SERVER_FLOW%></td>	
				<td><c:out value='${goodsSetType.serverFlow}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_MIN_EXTRA_FLOW%></td>	
				<td><c:out value='${goodsSetType.minExtraFlow}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_MAX_EXTRA_FLOW%></td>	
				<td><c:out value='${goodsSetType.maxExtraFlow}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=GoodsSetType.ALIAS_ENSURE%></td>	
				<td><c:out value='${goodsSetType.ensure}'/></td>
			</tr>
		</table>
	</form:form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>