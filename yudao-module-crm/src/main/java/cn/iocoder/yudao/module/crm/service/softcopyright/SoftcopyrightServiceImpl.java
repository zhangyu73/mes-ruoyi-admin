package cn.iocoder.yudao.module.crm.service.softcopyright;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.util.*;
import cn.iocoder.yudao.module.crm.controller.admin.softcopyright.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.softcopyright.SoftcopyrightDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.crm.dal.mysql.softcopyright.SoftcopyrightMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.module.crm.enums.ErrorCodeConstants.*;

/**
 * 企业软件著作权 Service 实现类
 *
 * @author 张三
 */
@Service
@Validated
public class SoftcopyrightServiceImpl implements SoftcopyrightService {

    @Resource
    private SoftcopyrightMapper softcopyrightMapper;

    @Override
    public Long createSoftcopyright(SoftcopyrightSaveReqVO createReqVO) {
        // 插入
        SoftcopyrightDO softcopyright = BeanUtils.toBean(createReqVO, SoftcopyrightDO.class);
        softcopyrightMapper.insert(softcopyright);

        // 返回
        return softcopyright.getId();
    }

    @Override
    public void updateSoftcopyright(SoftcopyrightSaveReqVO updateReqVO) {
        // 校验存在
        validateSoftcopyrightExists(updateReqVO.getId());
        // 更新
        SoftcopyrightDO updateObj = BeanUtils.toBean(updateReqVO, SoftcopyrightDO.class);
        softcopyrightMapper.updateById(updateObj);
    }

    @Override
    public void deleteSoftcopyright(Long id) {
        // 校验存在
        validateSoftcopyrightExists(id);
        // 删除
        softcopyrightMapper.deleteById(id);
    }

    @Override
        public void deleteSoftcopyrightListByIds(List<Long> ids) {
        // 删除
        softcopyrightMapper.deleteByIds(ids);
        }


    private void validateSoftcopyrightExists(Long id) {
        if (softcopyrightMapper.selectById(id) == null) {
            throw exception(SOFTCOPYRIGHT_NOT_EXISTS);
        }
    }

    @Override
    public SoftcopyrightDO getSoftcopyright(Long id) {
        return softcopyrightMapper.selectById(id);
    }

    @Override
    public PageResult<SoftcopyrightDO> getSoftcopyrightPage(SoftcopyrightPageReqVO pageReqVO) {
        return softcopyrightMapper.selectPage(pageReqVO);
    }
    @Override
    public PageResult<SoftcopyrightDO> getSoftcopyrightPageByCompanyId(Long companyId, PageParam pageParam) {
        Page<SoftcopyrightDO> page = new Page<>(pageParam.getPageNo(), pageParam.getPageSize());
        Page<SoftcopyrightDO> mpPage = softcopyrightMapper.selectPageByCompanyId(page, companyId);
        return new PageResult<>(mpPage.getRecords(), mpPage.getTotal());
    }
}