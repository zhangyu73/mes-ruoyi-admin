package cn.iocoder.yudao.module.crm.service.patent;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.util.*;
import cn.iocoder.yudao.module.crm.controller.admin.patent.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.patent.PatentDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.crm.dal.mysql.patent.PatentMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.module.crm.enums.ErrorCodeConstants.*;

/**
 * 企业专利 Service 实现类
 *
 * @author 张三
 */
@Service
@Validated
public class PatentServiceImpl implements PatentService {

    @Resource
    private PatentMapper patentMapper;

    @Override
    public Long createPatent(PatentSaveReqVO createReqVO) {
        // 插入
        PatentDO patent = BeanUtils.toBean(createReqVO, PatentDO.class);
        patentMapper.insert(patent);

        // 返回
        return patent.getId();
    }

    @Override
    public void updatePatent(PatentSaveReqVO updateReqVO) {
        // 校验存在
        validatePatentExists(updateReqVO.getId());
        // 更新
        PatentDO updateObj = BeanUtils.toBean(updateReqVO, PatentDO.class);
        patentMapper.updateById(updateObj);
    }

    @Override
    public void deletePatent(Long id) {
        // 校验存在
        validatePatentExists(id);
        // 删除
        patentMapper.deleteById(id);
    }

    @Override
        public void deletePatentListByIds(List<Long> ids) {
        // 删除
        patentMapper.deleteByIds(ids);
        }


    private void validatePatentExists(Long id) {
        if (patentMapper.selectById(id) == null) {
            throw exception(PATENT_NOT_EXISTS);
        }
    }

    @Override
    public PatentDO getPatent(Long id) {
        return patentMapper.selectById(id);
    }

    @Override
    public PageResult<PatentDO> getPatentPage(PatentPageReqVO pageReqVO) {
        return patentMapper.selectPage(pageReqVO);
    }

    @Override
    public PageResult<PatentDO> getPatentPageByCompanyId(Long companyId, PageParam pageParam) {
        Page<PatentDO> page = new Page<>(pageParam.getPageNo(), pageParam.getPageSize());
        Page<PatentDO> mpPage = patentMapper.selectPageByCompanyId(page, companyId);
        return new PageResult<>(mpPage.getRecords(), mpPage.getTotal());
    }
}