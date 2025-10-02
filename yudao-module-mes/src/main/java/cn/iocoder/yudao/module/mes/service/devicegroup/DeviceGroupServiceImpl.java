package cn.iocoder.yudao.module.mes.service.devicegroup;

import cn.hutool.core.collection.CollUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.mes.controller.admin.devicegroup.vo.*;
import cn.iocoder.yudao.module.mes.dal.dataobject.devicegroup.DeviceGroupDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.mes.dal.mysql.devicegroup.DeviceGroupMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.diffList;
import static cn.iocoder.yudao.module.mes.enums.ErrorCodeConstants.*;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;


/**
 * 设备组表 Service 实现类
 *
 * @author 张三
 */
@Service
@Validated
public class DeviceGroupServiceImpl implements DeviceGroupService {

    @Resource
    private DeviceGroupMapper deviceGroupMapper;

    @Override
    public Long createDeviceGroup(DeviceGroupSaveReqVO createReqVO) {
        // 插入
        DeviceGroupDO deviceGroup = BeanUtils.toBean(createReqVO, DeviceGroupDO.class);
        deviceGroupMapper.insert(deviceGroup);

        // 返回
        return deviceGroup.getDeviceGroupId();
    }

    @Override
    public void updateDeviceGroup(DeviceGroupSaveReqVO updateReqVO) {
        // 校验存在
        validateDeviceGroupExists(updateReqVO.getDeviceGroupId());
        // 更新
        DeviceGroupDO updateObj = BeanUtils.toBean(updateReqVO, DeviceGroupDO.class);
        deviceGroupMapper.updateById(updateObj);
    }

    @Override
    public void deleteDeviceGroup(Long id) {
        // 校验存在
        validateDeviceGroupExists(id);
        // 删除
        deviceGroupMapper.deleteById(id);
    }

    @Override
        public void deleteDeviceGroupListByIds(List<Long> ids) {
        // 删除
        deviceGroupMapper.deleteByIds(ids);
        }


    private void validateDeviceGroupExists(Long id) {
        if (deviceGroupMapper.selectById(id) == null) {
            throw exception(DEVICE_GROUP_NOT_EXISTS);
        }
    }

    @Override
    public DeviceGroupDO getDeviceGroup(Long id) {
        return deviceGroupMapper.selectById(id);
    }

    @Override
    public PageResult<DeviceGroupDO> getDeviceGroupPage(DeviceGroupPageReqVO pageReqVO) {
        // 1. 只查存在的字段，避开 creator/deleted 等缺失列
        Page<DeviceGroupDO> page = new Page<>(pageReqVO.getPageNo(), pageReqVO.getPageSize());

        // 2. 调用 XML 里定义的 selectPageSimple
        Page<DeviceGroupDO> mpPage = (Page<DeviceGroupDO>) deviceGroupMapper.selectPageSimple(page);

        // 3. 把 MyBatis-Plus 分页结果转成 Yudao 的 PageResult
        return new PageResult<>(mpPage.getRecords(), mpPage.getTotal());
    }

}