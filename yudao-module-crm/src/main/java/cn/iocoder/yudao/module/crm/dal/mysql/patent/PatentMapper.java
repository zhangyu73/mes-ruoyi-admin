package cn.iocoder.yudao.module.crm.dal.mysql.patent;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.crm.dal.dataobject.patent.PatentDO;
import cn.iocoder.yudao.module.crm.dal.dataobject.qualification.QualificationDO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.crm.controller.admin.patent.vo.*;
import org.apache.ibatis.annotations.Param;

/**
 * 企业专利 Mapper
 *
 * @author 张三
 */
@Mapper
public interface PatentMapper extends BaseMapperX<PatentDO> {

    default PageResult<PatentDO> selectPage(PatentPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<PatentDO>()
                .likeIfPresent(PatentDO::getConpanyName, reqVO.getConpanyName())
                .likeIfPresent(PatentDO::getInventionName, reqVO.getInventionName())
                .eqIfPresent(PatentDO::getPatentType, reqVO.getPatentType())
                .betweenIfPresent(PatentDO::getApplicationDate, reqVO.getApplicationDate())
                .betweenIfPresent(PatentDO::getPublicationDate, reqVO.getPublicationDate())
                .orderByDesc(PatentDO::getId));
    }
    Page<PatentDO> selectPageByCompanyId(Page<PatentDO> page,
                                                @Param("companyId") Long companyId);

}