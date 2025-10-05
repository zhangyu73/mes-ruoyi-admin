package cn.iocoder.yudao.module.srm.dal.mysql.supplier;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.srm.dal.dataobject.supplier.SupplierDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.srm.controller.admin.supplier.vo.*;

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

}