package cn.iocoder.yudao.module.crm.service.listed;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.util.*;
import cn.iocoder.yudao.module.crm.controller.admin.listed.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.listed.ListedDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.crm.dal.mysql.listed.ListedMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.module.crm.enums.ErrorCodeConstants.*;

/**
 * 上市公司 Service 实现类
 *
 * @author 张三
 */
@Service
@Validated
public class ListedServiceImpl implements ListedService {

    @Resource
    private ListedMapper listedMapper;

    @Override
    public long createListed(ListedSaveReqVO createReqVO) {
        // 插入
        ListedDO listed = BeanUtils.toBean(createReqVO, ListedDO.class);
        listedMapper.insert(listed);

        // 返回
        return listed.getId();
    }

    @Override
    public void updateListed(ListedSaveReqVO updateReqVO) {
        // 校验存在
        validateListedExists(updateReqVO.getId());
        // 更新
        ListedDO updateObj = BeanUtils.toBean(updateReqVO, ListedDO.class);
        listedMapper.updateById(updateObj);
    }

    @Override
    public void deleteListed(String id) {
        // 校验存在
        validateListedExists(id);
        // 删除
        listedMapper.deleteById(id);
    }

    @Override
        public void deleteListedListByIds(List<String> ids) {
        // 删除
        listedMapper.deleteByIds(ids);
        }


    private void validateListedExists(String id) {
        if (listedMapper.selectById(id) == null) {
            throw exception(LISTED_NOT_EXISTS);
        }
    }

    @Override
    public ListedDO getListed(String id) {
        return listedMapper.selectById(id);
    }

    @Override
    public PageResult<ListedDO> getListedPage(ListedPageReqVO pageReqVO) {
        return listedMapper.selectPage(pageReqVO);
    }

}