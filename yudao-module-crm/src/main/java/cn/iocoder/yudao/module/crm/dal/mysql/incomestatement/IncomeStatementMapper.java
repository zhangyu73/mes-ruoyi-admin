package cn.iocoder.yudao.module.crm.dal.mysql.incomestatement;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.crm.dal.dataobject.incomestatement.IncomeStatementDO;
import cn.iocoder.yudao.module.crm.dal.dataobject.qualification.QualificationDO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.crm.controller.admin.incomestatement.vo.*;
import org.apache.ibatis.annotations.Param;

/**
 * 利润 Mapper
 *
 * @author 张三
 */
@Mapper
public interface IncomeStatementMapper extends BaseMapperX<IncomeStatementDO> {

    default PageResult<IncomeStatementDO> selectPage(IncomeStatementPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<IncomeStatementDO>()
                .eqIfPresent(IncomeStatementDO::getStockCode, reqVO.getStockCode())
                .likeIfPresent(IncomeStatementDO::getShortName, reqVO.getShortName())
                .betweenIfPresent(IncomeStatementDO::getEndDate, reqVO.getEndDate())
                .eqIfPresent(IncomeStatementDO::getReportType, reqVO.getReportType())
                .eqIfPresent(IncomeStatementDO::getCompanyId, reqVO.getCompanyId())
                .orderByDesc(IncomeStatementDO::getId));
    }
    Page<IncomeStatementDO> selectPageByCompanyId(Page<IncomeStatementDO> page,
                                                @Param("companyId") Long companyId);

}