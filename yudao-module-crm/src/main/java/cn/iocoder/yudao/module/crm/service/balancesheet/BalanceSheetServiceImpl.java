package cn.iocoder.yudao.module.crm.service.balancesheet;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.util.*;
import cn.iocoder.yudao.module.crm.controller.admin.balancesheet.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.balancesheet.BalanceSheetDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.crm.dal.mysql.balancesheet.BalanceSheetMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.module.crm.enums.ErrorCodeConstants.*;

/**
 * 资产负债 Service 实现类
 *
 * @author 张三
 */
@Service
@Validated
public class BalanceSheetServiceImpl implements BalanceSheetService {

    @Resource
    private BalanceSheetMapper balanceSheetMapper;

    @Override
    public Long createBalanceSheet(BalanceSheetSaveReqVO createReqVO) {
        // 插入
        BalanceSheetDO balanceSheet = BeanUtils.toBean(createReqVO, BalanceSheetDO.class);
        balanceSheetMapper.insert(balanceSheet);

        // 返回
        return balanceSheet.getId();
    }

    @Override
    public void updateBalanceSheet(BalanceSheetSaveReqVO updateReqVO) {
        // 校验存在
        validateBalanceSheetExists(updateReqVO.getId());
        // 更新
        BalanceSheetDO updateObj = BeanUtils.toBean(updateReqVO, BalanceSheetDO.class);
        balanceSheetMapper.updateById(updateObj);
    }

    @Override
    public void deleteBalanceSheet(Long id) {
        // 校验存在
        validateBalanceSheetExists(id);
        // 删除
        balanceSheetMapper.deleteById(id);
    }

    @Override
        public void deleteBalanceSheetListByIds(List<Long> ids) {
        // 删除
        balanceSheetMapper.deleteByIds(ids);
        }


    private void validateBalanceSheetExists(Long id) {
        if (balanceSheetMapper.selectById(id) == null) {
            throw exception(BALANCE_SHEET_NOT_EXISTS);
        }
    }

    @Override
    public BalanceSheetDO getBalanceSheet(Long id) {
        return balanceSheetMapper.selectById(id);
    }

    @Override
    public PageResult<BalanceSheetDO> getBalanceSheetPage(BalanceSheetPageReqVO pageReqVO) {
        return balanceSheetMapper.selectPage(pageReqVO);
    }
    @Override
    public PageResult<BalanceSheetDO> getBalanceSheetPageByCompanyId(Long companyId, PageParam pageParam) {
        Page<BalanceSheetDO> page = new Page<>(pageParam.getPageNo(), pageParam.getPageSize());
        Page<BalanceSheetDO> mpPage = balanceSheetMapper.selectPageByCompanyId(page, companyId);
        return new PageResult<>(mpPage.getRecords(), mpPage.getTotal());
    }
}