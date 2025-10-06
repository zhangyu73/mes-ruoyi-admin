package cn.iocoder.yudao.module.crm.service.softcopyright;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.crm.controller.admin.softcopyright.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.product.CrmProductDO;
import cn.iocoder.yudao.module.crm.dal.dataobject.softcopyright.SoftcopyrightDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 企业软件著作权 Service 接口
 *
 * @author 张三
 */
public interface SoftcopyrightService {

    /**
     * 创建企业软件著作权
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createSoftcopyright(@Valid SoftcopyrightSaveReqVO createReqVO);

    /**
     * 更新企业软件著作权
     *
     * @param updateReqVO 更新信息
     */
    void updateSoftcopyright(@Valid SoftcopyrightSaveReqVO updateReqVO);

    /**
     * 删除企业软件著作权
     *
     * @param id 编号
     */
    void deleteSoftcopyright(Long id);

    /**
    * 批量删除企业软件著作权
    *
    * @param ids 编号
    */
    void deleteSoftcopyrightListByIds(List<Long> ids);

    /**
     * 获得企业软件著作权
     *
     * @param id 编号
     * @return 企业软件著作权
     */
    SoftcopyrightDO getSoftcopyright(Long id);

    /**
     * 获得企业软件著作权分页
     *
     * @param pageReqVO 分页查询
     * @return 企业软件著作权分页
     */
    PageResult<SoftcopyrightDO> getSoftcopyrightPage(SoftcopyrightPageReqVO pageReqVO);



    PageResult<SoftcopyrightDO> getSoftcopyrightPageByCompanyId(Long companyId, PageParam pageParam);
}