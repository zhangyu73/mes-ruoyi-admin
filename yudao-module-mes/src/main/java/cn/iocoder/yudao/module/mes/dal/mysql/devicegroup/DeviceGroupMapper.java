package cn.iocoder.yudao.module.mes.dal.mysql.devicegroup;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.mes.controller.admin.devicegroup.vo.DeviceGroupPageReqVO;
import cn.iocoder.yudao.module.mes.dal.dataobject.devicegroup.DeviceGroupDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 设备组表 Mapper
 *
 * @author 张三
 */
@Mapper
public interface DeviceGroupMapper extends BaseMapperX<DeviceGroupDO> {

    /**
     * 自定义分页（字段缺失时可用，需写 XML）
     */
    IPage<DeviceGroupDO> selectPageSimple(Page<DeviceGroupDO> page);

    /**
     * 条件分页（走 MyBatis-Plus 自动生成 SQL）
     */
    default PageResult<DeviceGroupDO> selectPageByReq(DeviceGroupPageReqVO reqVO) {
        LambdaQueryWrapperX<DeviceGroupDO> wrapper = new LambdaQueryWrapperX<>();
        wrapper.eqIfPresent(DeviceGroupDO::getDeviceGroupNo, reqVO.getDeviceGroupNo())
                .likeIfPresent(DeviceGroupDO::getDeviceGroupName, reqVO.getDeviceGroupName())
                .eqIfPresent(DeviceGroupDO::getParentId, reqVO.getParentId())
                .eqIfPresent(DeviceGroupDO::getAncestors, reqVO.getAncestors())
                .orderByDesc(DeviceGroupDO::getDeviceGroupId);
        return selectPage(reqVO, wrapper);
    }
}