package cn.iocoder.yudao.module.crm.service.incomestatement;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.crm.controller.admin.incomestatement.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.incomestatement.IncomeStatementDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 利润 Service 接口
 *
 * @author 张三
 */
public interface IncomeStatementService {

    /**
     * 创建利润
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createIncomeStatement(@Valid IncomeStatementSaveReqVO createReqVO);

    /**
     * 更新利润
     *
     * @param updateReqVO 更新信息
     */
    void updateIncomeStatement(@Valid IncomeStatementSaveReqVO updateReqVO);

    /**
     * 删除利润
     *
     * @param id 编号
     */
    void deleteIncomeStatement(Long id);

    /**
    * 批量删除利润
    *
    * @param ids 编号
    */
    void deleteIncomeStatementListByIds(List<Long> ids);

    /**
     * 获得利润
     *
     * @param id 编号
     * @return 利润
     */
    IncomeStatementDO getIncomeStatement(Long id);

    /**
     * 获得利润分页
     *
     * @param pageReqVO 分页查询
     * @return 利润分页
     */
    PageResult<IncomeStatementDO> getIncomeStatementPage(IncomeStatementPageReqVO pageReqVO);

    PageResult<IncomeStatementDO> getIncomeStatementPageByCompanyId(Long companyId, PageParam pageParam);
}