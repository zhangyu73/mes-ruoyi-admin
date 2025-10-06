package cn.iocoder.yudao.module.crm.dal.mysql.cashflowstatement;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.crm.dal.dataobject.cashflowstatement.CashFlowStatementDO;
import cn.iocoder.yudao.module.crm.dal.dataobject.qualification.QualificationDO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.crm.controller.admin.cashflowstatement.vo.*;
import org.apache.ibatis.annotations.Param;

/**
 * 现金流量 Mapper
 *
 * @author 张三
 */
@Mapper
public interface CashFlowStatementMapper extends BaseMapperX<CashFlowStatementDO> {

    default PageResult<CashFlowStatementDO> selectPage(CashFlowStatementPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<CashFlowStatementDO>()
                .eqIfPresent(CashFlowStatementDO::getStockCode, reqVO.getStockCode())
                .likeIfPresent(CashFlowStatementDO::getShortName, reqVO.getShortName())
                .betweenIfPresent(CashFlowStatementDO::getEndDate, reqVO.getEndDate())
                .eqIfPresent(CashFlowStatementDO::getReportType, reqVO.getReportType())
                .eqIfPresent(CashFlowStatementDO::getCompanyId, reqVO.getCompanyId())
                .orderByDesc(CashFlowStatementDO::getId));
    }
    Page<CashFlowStatementDO> selectPageByCompanyId(Page<CashFlowStatementDO> page,
                                                @Param("companyId") Long companyId);

}