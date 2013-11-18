/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.company.project.dao.goodsSetType;  
 
import java.math.BigDecimal;  
import java.util.List;  
import java.util.Map;  
 
import com.linkage.agri.dao.base.AbstractHibernateDAO;  
import com.linkage.agri.exception.DAOException;  
import com.company.project.pojo.goodsSetType.GoodsSetType;  
 
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

 
public Class GoodsSetTypeDAOImpl extends AbstractHibernateDAO implements GoodsSetTypeDAO  
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
    public List<GoodsSetType> queryListGoodsSetTypeByAttr(Map<String, Object> paramMap, Map<String, String> orderMap, int pageNum,  
        int pageSize)  
        throws DAOException  
    {  
        return super.listInstances(GoodsSetType.class, paramMap, orderMap, pageNum, pageSize);  
    }  
      
    /**  
     *   
     * <find one by id>  
     * @param serial  
     * @throws DAOException  
     */ 
    public GoodsSetType findGoodsSetTypeByGoodsTypeId(Long goodsTypeId)  
        throws DAOException  
    {  
        return (GoodsSetType)super.findById(GoodsSetType.class, goodsTypeId);  
    }  
      
    /**  
     *   
     * <save one>  
     * @param goodsSetType  
     * @throws DAOException  
     */ 
    public Long saveGoodsSetType(GoodsSetType goodsSetType)  
        throws DAOException  
    {  
        return (Long)super.saveInstance(goodsSetType);  
    }  
      
    /**  
     *   
     * <update one>  
     * @param goodsSetType  
     * @throws DAOException  
     */ 
    public void updateGoodsSetType(GoodsSetType goodsSetType)  
        throws DAOException  
    {  
        super.updateInstance(GoodsSetType);  
    }  
      
    /**  
     * <check one is have?>  
     * @param paramMap  
     * @return  
     * @throws DAOException  
     */ 
    public boolean checkGoodsSetTypeIsHaveByAttr(Map<String, Object> paramMap)  
        throws DAOException  
    {  
        StringBuffer sqlBuffer = new StringBuffer();  
        sqlBuffer.append("SELECT COUNT(*) FROM goods_set_type T ");  
        sqlBuffer.append("WHERE T.goods_type_id = ? ");  
          
        BigDecimal big = (BigDecimal)super.findUniqueResultBySQLWithParams(sqlBuffer.toString(), paramMap.get("goodsTypeId"));  
        return big.intValue() > 0 ? false : true;  
    }  
      
    /**  
     * <update some>  
     * @param goodsSetTypeList  
     * @return  
     * @throws DAOException  
     */ 
    public void updateGoodsSetTypeBatch(List<GoodsSetType> goodsSetTypeList)  
        throws DAOException  
    {  
        super.updateBatchInstance(goodsSetTypeList);  
    }  
      
    /**  
     *   
     * <delete one>  
     * @param goodsSetType  
     * @throws DAOException  
     */ 
    public void deleteGoodsSetType(GoodsSetType goodsSetType)  
        throws DAOException  
    {  
        super.deleteInstance(goodsSetType);  
    }  
 
} 