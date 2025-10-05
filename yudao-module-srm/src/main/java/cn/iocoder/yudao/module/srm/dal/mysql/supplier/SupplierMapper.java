package cn.iocoder.yudao.module.srm.dal.mysql.supplier;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.srm.dal.dataobject.supplier.SupplierDO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.srm.controller.admin.supplier.vo.*;
import org.apache.ibatis.annotations.Param;

/**
 * SRM 供应商 Mapper
 *
 * @author 张三
 */
@Mapper
public interface SupplierMapper extends BaseMapperX<SupplierDO> {

    default PageResult<SupplierDO> selectPage(SupplierPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<SupplierDO>()
                .likeIfPresent(SupplierDO::getName, reqVO.getName())
                .eqIfPresent(SupplierDO::getAreaId, reqVO.getAreaId())
                .eqIfPresent(SupplierDO::getIndustryId, reqVO.getIndustryId())
                .eqIfPresent(SupplierDO::getLevel, reqVO.getLevel())
                .eqIfPresent(SupplierDO::getCompanyId, reqVO.getCompanyId())
                .orderByDesc(SupplierDO::getId));
    }
    /**
     * 根据企业ID分页查询客户
     *
     * @param page      分页参数
     * @param companyId 企业ID
     * @return 分页结果
     */
    Page<SupplierDO> selectPageByCompanyId(Page<SupplierDO> page,
                                              @Param("companyId") Long companyId);


}