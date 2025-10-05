package cn.iocoder.yudao.module.srm.service.supplier;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.srm.controller.admin.supplier.vo.*;
import cn.iocoder.yudao.module.srm.dal.dataobject.supplier.SupplierDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * SRM 供应商 Service 接口
 *
 * @author 张三
 */
public interface SupplierService {

    /**
     * 创建SRM 供应商
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createSupplier(@Valid SupplierSaveReqVO createReqVO);

    /**
     * 更新SRM 供应商
     *
     * @param updateReqVO 更新信息
     */
    void updateSupplier(@Valid SupplierSaveReqVO updateReqVO);

    /**
     * 删除SRM 供应商
     *
     * @param id 编号
     */
    void deleteSupplier(Long id);

    /**
    * 批量删除SRM 供应商
    *
    * @param ids 编号
    */
    void deleteSupplierListByIds(List<Long> ids);

    /**
     * 获得SRM 供应商
     *
     * @param id 编号
     * @return SRM 供应商
     */
    SupplierDO getSupplier(Long id);

    /**
     * 获得SRM 供应商分页
     *
     * @param pageReqVO 分页查询
     * @return SRM 供应商分页
     */
    PageResult<SupplierDO> getSupplierPage(SupplierPageReqVO pageReqVO);

}