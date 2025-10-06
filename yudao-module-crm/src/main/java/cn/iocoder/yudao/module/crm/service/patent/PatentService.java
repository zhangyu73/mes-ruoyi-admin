package cn.iocoder.yudao.module.crm.service.patent;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.crm.controller.admin.patent.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.patent.PatentDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.module.crm.dal.dataobject.product.CrmProductDO;

/**
 * 企业专利 Service 接口
 *
 * @author 张三
 */
public interface PatentService {

    /**
     * 创建企业专利
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createPatent(@Valid PatentSaveReqVO createReqVO);

    /**
     * 更新企业专利
     *
     * @param updateReqVO 更新信息
     */
    void updatePatent(@Valid PatentSaveReqVO updateReqVO);

    /**
     * 删除企业专利
     *
     * @param id 编号
     */
    void deletePatent(Long id);

    /**
    * 批量删除企业专利
    *
    * @param ids 编号
    */
    void deletePatentListByIds(List<Long> ids);

    /**
     * 获得企业专利
     *
     * @param id 编号
     * @return 企业专利
     */
    PatentDO getPatent(Long id);

    /**
     * 获得企业专利分页
     *
     * @param pageReqVO 分页查询
     * @return 企业专利分页
     */
    PageResult<PatentDO> getPatentPage(PatentPageReqVO pageReqVO);


    PageResult<PatentDO> getPatentPageByCompanyId(Long companyId, PageParam pageParam);
}