package cn.iocoder.yudao.module.mes.service.devicegroup;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.mes.controller.admin.devicegroup.vo.*;
import cn.iocoder.yudao.module.mes.dal.dataobject.devicegroup.DeviceGroupDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 设备组表 Service 接口
 *
 * @author 张三
 */
public interface DeviceGroupService {

    /**
     * 创建设备组表
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createDeviceGroup(@Valid DeviceGroupSaveReqVO createReqVO);

    /**
     * 更新设备组表
     *
     * @param updateReqVO 更新信息
     */
    void updateDeviceGroup(@Valid DeviceGroupSaveReqVO updateReqVO);

    /**
     * 删除设备组表
     *
     * @param id 编号
     */
    void deleteDeviceGroup(Long id);

    /**
    * 批量删除设备组表
    *
    * @param ids 编号
    */
    void deleteDeviceGroupListByIds(List<Long> ids);

    /**
     * 获得设备组表
     *
     * @param id 编号
     * @return 设备组表
     */
    DeviceGroupDO getDeviceGroup(Long id);

    /**
     * 获得设备组表分页
     *
     * @param pageReqVO 分页查询
     * @return 设备组表分页
     */
    PageResult<DeviceGroupDO> getDeviceGroupPage(DeviceGroupPageReqVO pageReqVO);

}