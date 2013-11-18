<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.model;
<#include "/java_imports.include">
public class ${className} implements java.io.Serializable{


	private static final long serialVersionUID = 5454155825314635342L;
	<@generateFields/>
	<@generatePkProperties/>
	<@generateNotPkProperties/>

}
<#macro generateFields>
<#list table.columns as column>
private ${column.javaType} ${column.sqlName};//${column.remarks}
</#list>
</#macro>
<#macro generatePkProperties>
<#if table.compositeId>

public ${className}Id getId() {
	return this.id;
}

public void setId(${className}Id id) {
	this.id = id;
}
<#else>
<#list table.columns as column>
<#if column.pk>
public void set${column.sqlName?cap_first}(${column.javaType} ${column.sqlName}) {
	this.${column.sqlName} = ${column.sqlName};
}

public ${column.javaType} get${column.sqlName}() {
	return this.${column.sqlName};
}
</#if>
</#list>
</#if>

</#macro>
<#macro generateNotPkProperties>
<#list table.columns as column>
<#if !column.pk>
<#if column.isDateTimeColumn>

public String get${column.sqlName?cap_first}() {
	return this.${column.sqlName};
}
public void set${column.sqlName?cap_first} (String ${column.sqlName}) {
	set${column.sqlName}(DateConvertUtils.parse(${column.sqlName}, FORMAT_${column.constantName},${column.javaType}.class));
}

</#if>

public ${column.javaType} get${column.sqlName?cap_first}() {
	return this.${column.sqlName};
}

public void set${column.sqlName?cap_first}(${column.javaType} ${column.sqlName}) {
	this.${column.sqlName} = ${column.sqlName};
}

</#if>
</#list>
</#macro>
<#macro generateJavaOneToMany>
<#list table.exportedKeys.associatedTables?values as foreignKey>
<#assign fkSqlTable = foreignKey.sqlTable>
<#assign fkTable = fkSqlTable.className>
<#assign fkPojoClass = fkSqlTable.className>
<#assign fkPojoClassVar = fkPojoClass?uncap_first>

private Set ${fkPojoClassVar}s = new HashSet(0);
public void set${fkPojoClass}s(Set<${fkPojoClass}> ${fkPojoClassVar}){
	this.${fkPojoClassVar}s = ${fkPojoClassVar};
}

@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "${classNameLower}")
public Set<${fkPojoClass}> get${fkPojoClass}s() {
	return ${fkPojoClassVar}s;
}
</#list>
</#macro>
<#macro generateJavaManyToOne>
<#list table.importedKeys.associatedTables?values as foreignKey>
<#assign fkSqlTable = foreignKey.sqlTable>
<#assign fkTable = fkSqlTable.className>
<#assign fkPojoClass = fkSqlTable.className>
<#assign fkPojoClassVar = fkPojoClass?uncap_first>

private ${fkPojoClass} ${fkPojoClassVar};
public void set${fkPojoClass}(${fkPojoClass} ${fkPojoClassVar}){
	this.${fkPojoClassVar} = ${fkPojoClassVar};
}

@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
@JoinColumns({
	<#list foreignKey.parentColumns?values as fkColumn>
	@JoinColumn(name = "${fkColumn}",nullable = false, insertable = false, updatable = false) <#if fkColumn_has_next>,</#if>
	</#list>
})
public ${fkPojoClass} get${fkPojoClass}() {
	return ${fkPojoClassVar};
}
</#list>
</#macro>
