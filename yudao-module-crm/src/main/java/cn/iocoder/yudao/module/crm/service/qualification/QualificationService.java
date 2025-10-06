package cn.iocoder.yudao.module.crm.service.qualification;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.crm.controller.admin.qualification.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.product.CrmProductDO;
import cn.iocoder.yudao.module.crm.dal.dataobject.qualification.QualificationDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 企业资质	 Service 接口
 *
 * @author 张三
 */
public interface QualificationService {

    /**
     * 创建企业资质	
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createQualification(@Valid QualificationSaveReqVO createReqVO);

    /**
     * 更新企业资质	
     *
     * @param updateReqVO 更新信息
     */
    void updateQualification(@Valid QualificationSaveReqVO updateReqVO);

    /**
     * 删除企业资质	
     *
     * @param id 编号
     */
    void deleteQualification(Long id);

    /**
    * 批量删除企业资质	
    *
    * @param ids 编号
    */
    void deleteQualificationListByIds(List<Long> ids);

    /**
     * 获得企业资质	
     *
     * @param id 编号
     * @return 企业资质	
     */
    QualificationDO getQualification(Long id);

    /**
     * 获得企业资质	分页
     *
     * @param pageReqVO 分页查询
     * @return 企业资质	分页
     */
    PageResult<QualificationDO> getQualificationPage(QualificationPageReqVO pageReqVO);



    PageResult<QualificationDO> getQualificationPageByCompanyId(Long companyId, PageParam pageParam);
}