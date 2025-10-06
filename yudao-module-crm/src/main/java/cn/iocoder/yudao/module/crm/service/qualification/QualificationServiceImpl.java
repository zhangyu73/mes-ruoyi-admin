package cn.iocoder.yudao.module.crm.service.qualification;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.util.*;
import cn.iocoder.yudao.module.crm.controller.admin.qualification.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.qualification.QualificationDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.crm.dal.mysql.qualification.QualificationMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.module.crm.enums.ErrorCodeConstants.*;

/**
 * 企业资质	 Service 实现类
 *
 * @author 张三
 */
@Service
@Validated
public class QualificationServiceImpl implements QualificationService {

    @Resource
    private QualificationMapper qualificationMapper;

    @Override
    public Long createQualification(QualificationSaveReqVO createReqVO) {
        // 插入
        QualificationDO qualification = BeanUtils.toBean(createReqVO, QualificationDO.class);
        qualificationMapper.insert(qualification);

        // 返回
        return qualification.getId();
    }

    @Override
    public void updateQualification(QualificationSaveReqVO updateReqVO) {
        // 校验存在
        validateQualificationExists(updateReqVO.getId());
        // 更新
        QualificationDO updateObj = BeanUtils.toBean(updateReqVO, QualificationDO.class);
        qualificationMapper.updateById(updateObj);
    }

    @Override
    public void deleteQualification(Long id) {
        // 校验存在
        validateQualificationExists(id);
        // 删除
        qualificationMapper.deleteById(id);
    }

    @Override
        public void deleteQualificationListByIds(List<Long> ids) {
        // 删除
        qualificationMapper.deleteByIds(ids);
        }


    private void validateQualificationExists(Long id) {
        if (qualificationMapper.selectById(id) == null) {
            throw exception(QUALIFICATION_NOT_EXISTS);
        }
    }

    @Override
    public QualificationDO getQualification(Long id) {
        return qualificationMapper.selectById(id);
    }

    @Override
    public PageResult<QualificationDO> getQualificationPage(QualificationPageReqVO pageReqVO) {
        return qualificationMapper.selectPage(pageReqVO);
    }

    @Override
    public PageResult<QualificationDO> getQualificationPageByCompanyId(Long companyId, PageParam pageParam) {
        Page<QualificationDO> page = new Page<>(pageParam.getPageNo(), pageParam.getPageSize());
        Page<QualificationDO> mpPage = qualificationMapper.selectPageByCompanyId(page, companyId);
        return new PageResult<>(mpPage.getRecords(), mpPage.getTotal());
    }
}