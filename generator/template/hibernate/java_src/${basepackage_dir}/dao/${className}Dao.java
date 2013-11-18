<#include "/java_copyright.include">  
<#assign className = table.className>     
<#assign classNameLower = className?uncap_first>     
package ${basepackage}.dao.${table.classNameFirstLower};  
 
import java.math.BigDecimal;  
import java.util.List;  
import java.util.Map;  
 
import com.linkage.agri.dao.base.AbstractHibernateDAO;  
import com.linkage.agri.exception.DAOException;  
import ${basepackage}.pojo.${classNameLower}.${className};  
 
<#include "/java_imports.include">  
 
public Class ${className}DAOImpl extends AbstractHibernateDAO implements ${className}DAO  
{  
    /**  
     * <query all>  
     * @param paramMap  
     * @param orderMap  
     * @param pageNum  
     * @param pageSize  
     * @return  
     * @throws DAOException  
     */ 
    @SuppressWarnings 
    public List<${className}> queryList${className}ByAttr(Map<String, Object> paramMap, Map<String, String> orderMap, int pageNum,  
        int pageSize)  
        throws DAOException  
    {  
        return super.listInstances(${className}.class, paramMap, orderMap, pageNum, pageSize);  
    }  
      
    /**  
     *   
     * <find one by id>  
     * @param serial  
     * @throws DAOException  
     */ 
    public ${className} find${className}By${table.pkColumn.columnName}(${table.pkColumn.simpleJavaType} ${table.pkColumn.columnNameFirstLower})  
        throws DAOException  
    {  
        return (${className})super.findById(${className}.class, ${table.pkColumn.columnNameFirstLower});  
    }  
      
    /**  
     *   
     * <save one>  
     * @param ${table.classNameFirstLower}  
     * @throws DAOException  
     */ 
    public ${table.pkColumn.simpleJavaType} save${className}(${className} ${table.classNameFirstLower})  
        throws DAOException  
    {  
        return (${table.pkColumn.simpleJavaType})super.saveInstance(${table.classNameFirstLower});  
    }  
      
    /**  
     *   
     * <update one>  
     * @param ${table.classNameFirstLower}  
     * @throws DAOException  
     */ 
    public void update${className}(${className} ${table.classNameFirstLower})  
        throws DAOException  
    {  
        super.updateInstance(${className});  
    }  
      
    /**  
     * <check one is have?>  
     * @param paramMap  
     * @return  
     * @throws DAOException  
     */ 
    public boolean check${className}IsHaveByAttr(Map<String, Object> paramMap)  
        throws DAOException  
    {  
        StringBuffer sqlBuffer = new StringBuffer();  
        sqlBuffer.append("SELECT COUNT(*) FROM ${table.sqlName} T ");  
        sqlBuffer.append("WHERE T.${table.pkColumn.sqlName} = ? ");  
          
        BigDecimal big = (BigDecimal)super.findUniqueResultBySQLWithParams(sqlBuffer.toString(), paramMap.get("${table.pkColumn.columnNameFirstLower}"));  
        return big.intValue() > 0 ? false : true;  
    }  
      
    /**  
     * <update some>  
     * @param ${table.classNameFirstLower}List  
     * @return  
     * @throws DAOException  
     */ 
    public void update${className}Batch(List<${className}> ${table.classNameFirstLower}List)  
        throws DAOException  
    {  
        super.updateBatchInstance(${table.classNameFirstLower}List);  
    }  
      
    /**  
     *   
     * <delete one>  
     * @param ${table.classNameFirstLower}  
     * @throws DAOException  
     */ 
    public void delete${className}(${className} ${table.classNameFirstLower})  
        throws DAOException  
    {  
        super.deleteInstance(${table.classNameFirstLower});  
    }  
 
} 