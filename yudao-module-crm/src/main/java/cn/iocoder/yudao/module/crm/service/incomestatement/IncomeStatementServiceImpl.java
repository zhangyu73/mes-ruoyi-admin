package cn.iocoder.yudao.module.crm.service.incomestatement;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.util.*;
import cn.iocoder.yudao.module.crm.controller.admin.incomestatement.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.incomestatement.IncomeStatementDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.crm.dal.mysql.incomestatement.IncomeStatementMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.module.crm.enums.ErrorCodeConstants.*;

/**
 * 利润 Service 实现类
 *
 * @author 张三
 */
@Service
@Validated
public class IncomeStatementServiceImpl implements IncomeStatementService {

    @Resource
    private IncomeStatementMapper incomeStatementMapper;

    @Override
    public Long createIncomeStatement(IncomeStatementSaveReqVO createReqVO) {
        // 插入
        IncomeStatementDO incomeStatement = BeanUtils.toBean(createReqVO, IncomeStatementDO.class);
        incomeStatementMapper.insert(incomeStatement);

        // 返回
        return incomeStatement.getId();
    }

    @Override
    public void updateIncomeStatement(IncomeStatementSaveReqVO updateReqVO) {
        // 校验存在
        validateIncomeStatementExists(updateReqVO.getId());
        // 更新
        IncomeStatementDO updateObj = BeanUtils.toBean(updateReqVO, IncomeStatementDO.class);
        incomeStatementMapper.updateById(updateObj);
    }

    @Override
    public void deleteIncomeStatement(Long id) {
        // 校验存在
        validateIncomeStatementExists(id);
        // 删除
        incomeStatementMapper.deleteById(id);
    }

    @Override
        public void deleteIncomeStatementListByIds(List<Long> ids) {
        // 删除
        incomeStatementMapper.deleteByIds(ids);
        }


    private void validateIncomeStatementExists(Long id) {
        if (incomeStatementMapper.selectById(id) == null) {
            throw exception(INCOME_STATEMENT_NOT_EXISTS);
        }
    }

    @Override
    public IncomeStatementDO getIncomeStatement(Long id) {
        return incomeStatementMapper.selectById(id);
    }

    @Override
    public PageResult<IncomeStatementDO> getIncomeStatementPage(IncomeStatementPageReqVO pageReqVO) {
        return incomeStatementMapper.selectPage(pageReqVO);
    }
    @Override
    public PageResult<IncomeStatementDO> getIncomeStatementPageByCompanyId(Long companyId, PageParam pageParam) {
        Page<IncomeStatementDO> page = new Page<>(pageParam.getPageNo(), pageParam.getPageSize());
        Page<IncomeStatementDO> mpPage = incomeStatementMapper.selectPageByCompanyId(page, companyId);
        return new PageResult<>(mpPage.getRecords(), mpPage.getTotal());
    }
}