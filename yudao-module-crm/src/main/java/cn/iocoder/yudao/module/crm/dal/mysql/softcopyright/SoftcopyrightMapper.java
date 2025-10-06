package cn.iocoder.yudao.module.crm.dal.mysql.softcopyright;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.crm.dal.dataobject.qualification.QualificationDO;
import cn.iocoder.yudao.module.crm.dal.dataobject.softcopyright.SoftcopyrightDO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.crm.controller.admin.softcopyright.vo.*;
import org.apache.ibatis.annotations.Param;

/**
 * 企业软件著作权 Mapper
 *
 * @author 张三
 */
@Mapper
public interface SoftcopyrightMapper extends BaseMapperX<SoftcopyrightDO> {

    default PageResult<SoftcopyrightDO> selectPage(SoftcopyrightPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<SoftcopyrightDO>()
                .betweenIfPresent(SoftcopyrightDO::getCreateTime, reqVO.getCreateTime())
                .likeIfPresent(SoftcopyrightDO::getCompanyName, reqVO.getCompanyName())
                .likeIfPresent(SoftcopyrightDO::getSoftwareFullName, reqVO.getSoftwareFullName())
                .eqIfPresent(SoftcopyrightDO::getCompanyId, reqVO.getCompanyId())
                .orderByDesc(SoftcopyrightDO::getId));
    }
    Page<SoftcopyrightDO> selectPageByCompanyId(Page<SoftcopyrightDO> page,
                                                @Param("companyId") Long companyId);

}