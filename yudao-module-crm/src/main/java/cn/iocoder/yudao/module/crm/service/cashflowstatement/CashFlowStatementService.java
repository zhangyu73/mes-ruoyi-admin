package cn.iocoder.yudao.module.crm.service.cashflowstatement;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.crm.controller.admin.cashflowstatement.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.cashflowstatement.CashFlowStatementDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 现金流量 Service 接口
 *
 * @author 张三
 */
public interface CashFlowStatementService {

    /**
     * 创建现金流量
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createCashFlowStatement(@Valid CashFlowStatementSaveReqVO createReqVO);

    /**
     * 更新现金流量
     *
     * @param updateReqVO 更新信息
     */
    void updateCashFlowStatement(@Valid CashFlowStatementSaveReqVO updateReqVO);

    /**
     * 删除现金流量
     *
     * @param id 编号
     */
    void deleteCashFlowStatement(Long id);

    /**
    * 批量删除现金流量
    *
    * @param ids 编号
    */
    void deleteCashFlowStatementListByIds(List<Long> ids);

    /**
     * 获得现金流量
     *
     * @param id 编号
     * @return 现金流量
     */
    CashFlowStatementDO getCashFlowStatement(Long id);

    /**
     * 获得现金流量分页
     *
     * @param pageReqVO 分页查询
     * @return 现金流量分页
     */
    PageResult<CashFlowStatementDO> getCashFlowStatementPage(CashFlowStatementPageReqVO pageReqVO);

    PageResult<CashFlowStatementDO> getCashFlowStatementPageByCompanyId(Long companyId, PageParam pageParam);
}