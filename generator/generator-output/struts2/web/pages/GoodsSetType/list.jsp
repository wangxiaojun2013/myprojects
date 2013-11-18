<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=GoodsSetType.TABLE_ALIAS%> 维护</title>
	
	<link href="<c:url value="/widgets/simpletable/simpletable.css"/>" type="text/css" rel="stylesheet">
	<script type="text/javascript" src="<c:url value="/widgets/simpletable/simpletable.js"/>"></script>
	
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm',${page.thisPageNumber},${page.pageSize},'${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="/pages/GoodsSetType/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel"><%=GoodsSetType.ALIAS_FATHER_GOODS_TYPE_ID%></td>		
					<td>
						<input value="${query.fatherGoodsTypeId}" id="fatherGoodsTypeId" name="fatherGoodsTypeId" maxlength="19"  class="validate-integer "/>
					</td>
					<td class="tdLabel"><%=GoodsSetType.ALIAS_LEVEL%></td>		
					<td>
						<input value="${query.level}" id="level" name="level" maxlength="5"  class="validate-integer max-value-2147483647"/>
					</td>
					<td class="tdLabel"><%=GoodsSetType.ALIAS_GOODS_TYPE_NAME%></td>		
					<td>
						<input value="${query.goodsTypeName}" id="goodsTypeName" name="goodsTypeName" maxlength="100"  class=""/>
					</td>
					<td class="tdLabel"><%=GoodsSetType.ALIAS_GOODS_TYPE_URL%></td>		
					<td>
						<input value="${query.goodsTypeUrl}" id="goodsTypeUrl" name="goodsTypeUrl" maxlength="500"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel"><%=GoodsSetType.ALIAS_GOODS_TYPE_REMARK%></td>		
					<td>
						<input value="${query.goodsTypeRemark}" id="goodsTypeRemark" name="goodsTypeRemark" maxlength="2147483647"  class=""/>
					</td>
					<td class="tdLabel"><%=GoodsSetType.ALIAS_SORT_SEQUENCE%></td>		
					<td>
						<input value="${query.sortSequence}" id="sortSequence" name="sortSequence" maxlength="5"  class="validate-integer max-value-2147483647"/>
					</td>
					<td class="tdLabel"><%=GoodsSetType.ALIAS_END_TYPE_FLAG%></td>		
					<td>
						<input value="${query.endTypeFlag}" id="endTypeFlag" name="endTypeFlag" maxlength="5"  class="validate-integer max-value-2147483647"/>
					</td>
					<td class="tdLabel"><%=GoodsSetType.ALIAS_FRONT_DELETE_FLAG%></td>		
					<td>
						<input value="${query.frontDeleteFlag}" id="frontDeleteFlag" name="frontDeleteFlag" maxlength="5"  class="validate-integer max-value-2147483647"/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel"><%=GoodsSetType.ALIAS_BEHIND_DISABLE_FLAG%></td>		
					<td>
						<input value="${query.behindDisableFlag}" id="behindDisableFlag" name="behindDisableFlag" maxlength="5"  class="validate-integer max-value-2147483647"/>
					</td>
					<td class="tdLabel"><%=GoodsSetType.ALIAS_HOME_FLAG%></td>		
					<td>
						<input value="${query.homeFlag}" id="homeFlag" name="homeFlag" maxlength="5"  class="validate-integer max-value-2147483647"/>
					</td>
					<td class="tdLabel"><%=GoodsSetType.ALIAS_SERVER_FLOW%></td>		
					<td>
						<input value="${query.serverFlow}" id="serverFlow" name="serverFlow" maxlength="5"  class="validate-integer max-value-2147483647"/>
					</td>
					<td class="tdLabel"><%=GoodsSetType.ALIAS_MIN_EXTRA_FLOW%></td>		
					<td>
						<input value="${query.minExtraFlow}" id="minExtraFlow" name="minExtraFlow" maxlength="19"  class="validate-integer "/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel"><%=GoodsSetType.ALIAS_MAX_EXTRA_FLOW%></td>		
					<td>
						<input value="${query.maxExtraFlow}" id="maxExtraFlow" name="maxExtraFlow" maxlength="19"  class="validate-integer "/>
					</td>
					<td class="tdLabel"><%=GoodsSetType.ALIAS_ENSURE%></td>		
					<td>
						<input value="${query.ensure}" id="ensure" name="ensure" maxlength="19"  class="validate-integer "/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}/pages/GoodsSetType/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}/pages/GoodsSetType/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}/pages/GoodsSetType/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<simpletable:pageToolbar page="${page}">
		显示在这里是为了提示你如何自定义表头,可修改模板删除此行
		</simpletable:pageToolbar>
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="father_goods_type_id" ><%=GoodsSetType.ALIAS_FATHER_GOODS_TYPE_ID%></th>
				<th sortColumn="level" ><%=GoodsSetType.ALIAS_LEVEL%></th>
				<th sortColumn="goods_type_name" ><%=GoodsSetType.ALIAS_GOODS_TYPE_NAME%></th>
				<th sortColumn="goods_type_url" ><%=GoodsSetType.ALIAS_GOODS_TYPE_URL%></th>
				<th sortColumn="goods_type_remark" ><%=GoodsSetType.ALIAS_GOODS_TYPE_REMARK%></th>
				<th sortColumn="sort_sequence" ><%=GoodsSetType.ALIAS_SORT_SEQUENCE%></th>
				<th sortColumn="end_type_flag" ><%=GoodsSetType.ALIAS_END_TYPE_FLAG%></th>
				<th sortColumn="front_delete_flag" ><%=GoodsSetType.ALIAS_FRONT_DELETE_FLAG%></th>
				<th sortColumn="behind_disable_flag" ><%=GoodsSetType.ALIAS_BEHIND_DISABLE_FLAG%></th>
				<th sortColumn="home_flag" ><%=GoodsSetType.ALIAS_HOME_FLAG%></th>
				<th sortColumn="server_flow" ><%=GoodsSetType.ALIAS_SERVER_FLOW%></th>
				<th sortColumn="min_extra_flow" ><%=GoodsSetType.ALIAS_MIN_EXTRA_FLOW%></th>
				<th sortColumn="max_extra_flow" ><%=GoodsSetType.ALIAS_MAX_EXTRA_FLOW%></th>
				<th sortColumn="ensure" ><%=GoodsSetType.ALIAS_ENSURE%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="goodsTypeId=${item.goodsTypeId}&"></td>
				
				<td><c:out value='${item.fatherGoodsTypeId}'/>&nbsp;</td>
				<td><c:out value='${item.level}'/>&nbsp;</td>
				<td><c:out value='${item.goodsTypeName}'/>&nbsp;</td>
				<td><c:out value='${item.goodsTypeUrl}'/>&nbsp;</td>
				<td><c:out value='${item.goodsTypeRemark}'/>&nbsp;</td>
				<td><c:out value='${item.sortSequence}'/>&nbsp;</td>
				<td><c:out value='${item.endTypeFlag}'/>&nbsp;</td>
				<td><c:out value='${item.frontDeleteFlag}'/>&nbsp;</td>
				<td><c:out value='${item.behindDisableFlag}'/>&nbsp;</td>
				<td><c:out value='${item.homeFlag}'/>&nbsp;</td>
				<td><c:out value='${item.serverFlow}'/>&nbsp;</td>
				<td><c:out value='${item.minExtraFlow}'/>&nbsp;</td>
				<td><c:out value='${item.maxExtraFlow}'/>&nbsp;</td>
				<td><c:out value='${item.ensure}'/>&nbsp;</td>
				<td>
					<a href="${ctx}/pages/GoodsSetType/show.do?goodsTypeId=${item.goodsTypeId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}/pages/GoodsSetType/edit.do?goodsTypeId=${item.goodsTypeId}&">修改</a>
				</td>
			  </tr>
			  
		  	  </c:forEach>
		  </tbody>
		</table>
	
		<simpletable:pageToolbar page="${page}">
		显示在这里是为了提示你如何自定义表头,可修改模板删除此行
		</simpletable:pageToolbar>
	</div>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>

