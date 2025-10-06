package cn.iocoder.yudao.module.crm.dal.mysql.qualification;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.crm.dal.dataobject.product.CrmProductDO;
import cn.iocoder.yudao.module.crm.dal.dataobject.qualification.QualificationDO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.crm.controller.admin.qualification.vo.*;
import org.apache.ibatis.annotations.Param;

/**
 * 企业资质	 Mapper
 *
 * @author 张三
 */
@Mapper
public interface QualificationMapper extends BaseMapperX<QualificationDO> {

    default PageResult<QualificationDO> selectPage(QualificationPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<QualificationDO>()
                .likeIfPresent(QualificationDO::getName, reqVO.getName())
                .eqIfPresent(QualificationDO::getCompanyId, reqVO.getCompanyId())
                .likeIfPresent(QualificationDO::getCertificateName, reqVO.getCertificateName())
                .eqIfPresent(QualificationDO::getCertificateNumber, reqVO.getCertificateNumber())
                .eqIfPresent(QualificationDO::getCertificateStatus, reqVO.getCertificateStatus())
                .orderByDesc(QualificationDO::getId));
    }
    Page<QualificationDO> selectPageByCompanyId(Page<QualificationDO> page,
                                             @Param("companyId") Long companyId);

}