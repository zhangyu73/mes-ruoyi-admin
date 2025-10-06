package cn.iocoder.yudao.module.crm.service.balancesheet;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.crm.controller.admin.balancesheet.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.balancesheet.BalanceSheetDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 资产负债 Service 接口
 *
 * @author 张三
 */
public interface BalanceSheetService {

    /**
     * 创建资产负债
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createBalanceSheet(@Valid BalanceSheetSaveReqVO createReqVO);

    /**
     * 更新资产负债
     *
     * @param updateReqVO 更新信息
     */
    void updateBalanceSheet(@Valid BalanceSheetSaveReqVO updateReqVO);

    /**
     * 删除资产负债
     *
     * @param id 编号
     */
    void deleteBalanceSheet(Long id);

    /**
    * 批量删除资产负债
    *
    * @param ids 编号
    */
    void deleteBalanceSheetListByIds(List<Long> ids);

    /**
     * 获得资产负债
     *
     * @param id 编号
     * @return 资产负债
     */
    BalanceSheetDO getBalanceSheet(Long id);

    /**
     * 获得资产负债分页
     *
     * @param pageReqVO 分页查询
     * @return 资产负债分页
     */
    PageResult<BalanceSheetDO> getBalanceSheetPage(BalanceSheetPageReqVO pageReqVO);


    PageResult<BalanceSheetDO> getBalanceSheetPageByCompanyId(Long companyId, PageParam pageParam);
}