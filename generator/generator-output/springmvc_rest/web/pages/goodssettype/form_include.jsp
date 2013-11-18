<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="goodsTypeId" name="goodsTypeId" value="${goodsSetType.goodsTypeId}"/>

	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_FATHER_GOODS_TYPE_ID%>:
		</td>		
		<td>
		<form:input path="fatherGoodsTypeId" id="fatherGoodsTypeId" cssClass="validate-integer " maxlength="19" />
		<font color='red'><form:errors path="fatherGoodsTypeId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_LEVEL%>:
		</td>		
		<td>
		<form:input path="level" id="level" cssClass="validate-integer max-value-2147483647" maxlength="5" />
		<font color='red'><form:errors path="level"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_GOODS_TYPE_NAME%>:
		</td>		
		<td>
		<form:input path="goodsTypeName" id="goodsTypeName" cssClass="" maxlength="100" />
		<font color='red'><form:errors path="goodsTypeName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_GOODS_TYPE_URL%>:
		</td>		
		<td>
		<form:input path="goodsTypeUrl" id="goodsTypeUrl" cssClass="" maxlength="500" />
		<font color='red'><form:errors path="goodsTypeUrl"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_GOODS_TYPE_REMARK%>:
		</td>		
		<td>
		<form:input path="goodsTypeRemark" id="goodsTypeRemark" cssClass="" maxlength="2147483647" />
		<font color='red'><form:errors path="goodsTypeRemark"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_SORT_SEQUENCE%>:
		</td>		
		<td>
		<form:input path="sortSequence" id="sortSequence" cssClass="validate-integer max-value-2147483647" maxlength="5" />
		<font color='red'><form:errors path="sortSequence"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_END_TYPE_FLAG%>:
		</td>		
		<td>
		<form:input path="endTypeFlag" id="endTypeFlag" cssClass="validate-integer max-value-2147483647" maxlength="5" />
		<font color='red'><form:errors path="endTypeFlag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_FRONT_DELETE_FLAG%>:
		</td>		
		<td>
		<form:input path="frontDeleteFlag" id="frontDeleteFlag" cssClass="validate-integer max-value-2147483647" maxlength="5" />
		<font color='red'><form:errors path="frontDeleteFlag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_BEHIND_DISABLE_FLAG%>:
		</td>		
		<td>
		<form:input path="behindDisableFlag" id="behindDisableFlag" cssClass="validate-integer max-value-2147483647" maxlength="5" />
		<font color='red'><form:errors path="behindDisableFlag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_HOME_FLAG%>:
		</td>		
		<td>
		<form:input path="homeFlag" id="homeFlag" cssClass="validate-integer max-value-2147483647" maxlength="5" />
		<font color='red'><form:errors path="homeFlag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_SERVER_FLOW%>:
		</td>		
		<td>
		<form:input path="serverFlow" id="serverFlow" cssClass="validate-integer max-value-2147483647" maxlength="5" />
		<font color='red'><form:errors path="serverFlow"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_MIN_EXTRA_FLOW%>:
		</td>		
		<td>
		<form:input path="minExtraFlow" id="minExtraFlow" cssClass="validate-integer " maxlength="19" />
		<font color='red'><form:errors path="minExtraFlow"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_MAX_EXTRA_FLOW%>:
		</td>		
		<td>
		<form:input path="maxExtraFlow" id="maxExtraFlow" cssClass="validate-integer " maxlength="19" />
		<font color='red'><form:errors path="maxExtraFlow"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=GoodsSetType.ALIAS_ENSURE%>:
		</td>		
		<td>
		<form:input path="ensure" id="ensure" cssClass="validate-integer " maxlength="19" />
		<font color='red'><form:errors path="ensure"/></font>
		</td>
	</tr>	
	
		