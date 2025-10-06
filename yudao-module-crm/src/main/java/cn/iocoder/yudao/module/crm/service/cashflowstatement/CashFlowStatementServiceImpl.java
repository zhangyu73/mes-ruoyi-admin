package cn.iocoder.yudao.module.crm.service.cashflowstatement;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.util.*;
import cn.iocoder.yudao.module.crm.controller.admin.cashflowstatement.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.cashflowstatement.CashFlowStatementDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.crm.dal.mysql.cashflowstatement.CashFlowStatementMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.module.crm.enums.ErrorCodeConstants.*;

/**
 * 现金流量 Service 实现类
 *
 * @author 张三
 */
@Service
@Validated
public class CashFlowStatementServiceImpl implements CashFlowStatementService {

    @Resource
    private CashFlowStatementMapper cashFlowStatementMapper;

    @Override
    public Long createCashFlowStatement(CashFlowStatementSaveReqVO createReqVO) {
        // 插入
        CashFlowStatementDO cashFlowStatement = BeanUtils.toBean(createReqVO, CashFlowStatementDO.class);
        cashFlowStatementMapper.insert(cashFlowStatement);

        // 返回
        return cashFlowStatement.getId();
    }

    @Override
    public void updateCashFlowStatement(CashFlowStatementSaveReqVO updateReqVO) {
        // 校验存在
        validateCashFlowStatementExists(updateReqVO.getId());
        // 更新
        CashFlowStatementDO updateObj = BeanUtils.toBean(updateReqVO, CashFlowStatementDO.class);
        cashFlowStatementMapper.updateById(updateObj);
    }

    @Override
    public void deleteCashFlowStatement(Long id) {
        // 校验存在
        validateCashFlowStatementExists(id);
        // 删除
        cashFlowStatementMapper.deleteById(id);
    }

    @Override
        public void deleteCashFlowStatementListByIds(List<Long> ids) {
        // 删除
        cashFlowStatementMapper.deleteByIds(ids);
        }


    private void validateCashFlowStatementExists(Long id) {
        if (cashFlowStatementMapper.selectById(id) == null) {
            throw exception(CASH_FLOW_STATEMENT_NOT_EXISTS);
        }
    }

    @Override
    public CashFlowStatementDO getCashFlowStatement(Long id) {
        return cashFlowStatementMapper.selectById(id);
    }

    @Override
    public PageResult<CashFlowStatementDO> getCashFlowStatementPage(CashFlowStatementPageReqVO pageReqVO) {
        return cashFlowStatementMapper.selectPage(pageReqVO);
    }
    @Override
    public PageResult<CashFlowStatementDO> getCashFlowStatementPageByCompanyId(Long companyId, PageParam pageParam) {
        Page<CashFlowStatementDO> page = new Page<>(pageParam.getPageNo(), pageParam.getPageSize());
        Page<CashFlowStatementDO> mpPage = cashFlowStatementMapper.selectPageByCompanyId(page, companyId);
        return new PageResult<>(mpPage.getRecords(), mpPage.getTotal());
    }
}