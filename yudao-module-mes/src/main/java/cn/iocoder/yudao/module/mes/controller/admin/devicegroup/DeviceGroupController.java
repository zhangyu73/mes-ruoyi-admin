package cn.iocoder.yudao.module.mes.controller.admin.devicegroup;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

import javax.validation.constraints.*;
import javax.validation.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.IOException;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.*;

import cn.iocoder.yudao.module.mes.controller.admin.devicegroup.vo.*;
import cn.iocoder.yudao.module.mes.dal.dataobject.devicegroup.DeviceGroupDO;
import cn.iocoder.yudao.module.mes.service.devicegroup.DeviceGroupService;

@Tag(name = "管理后台 - 设备组表")
@RestController
@RequestMapping("/mes/device-group")
@Validated
public class DeviceGroupController {

    @Resource
    private DeviceGroupService deviceGroupService;

    @PostMapping("/create")
    @Operation(summary = "创建设备组表")
    @PreAuthorize("@ss.hasPermission('mes:device-group:create')")
    public CommonResult<Long> createDeviceGroup(@Valid @RequestBody DeviceGroupSaveReqVO createReqVO) {
        return success(deviceGroupService.createDeviceGroup(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新设备组表")
    @PreAuthorize("@ss.hasPermission('mes:device-group:update')")
    public CommonResult<Boolean> updateDeviceGroup(@Valid @RequestBody DeviceGroupSaveReqVO updateReqVO) {
        deviceGroupService.updateDeviceGroup(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除设备组表")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('mes:device-group:delete')")
    public CommonResult<Boolean> deleteDeviceGroup(@RequestParam("id") Long id) {
        deviceGroupService.deleteDeviceGroup(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除设备组表")
                @PreAuthorize("@ss.hasPermission('mes:device-group:delete')")
    public CommonResult<Boolean> deleteDeviceGroupList(@RequestParam("ids") List<Long> ids) {
        deviceGroupService.deleteDeviceGroupListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得设备组表")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('mes:device-group:query')")
    public CommonResult<DeviceGroupRespVO> getDeviceGroup(@RequestParam("id") Long id) {
        DeviceGroupDO deviceGroup = deviceGroupService.getDeviceGroup(id);
        return success(BeanUtils.toBean(deviceGroup, DeviceGroupRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得设备组表分页")
    @PreAuthorize("@ss.hasPermission('mes:device-group:query')")
    public CommonResult<PageResult<DeviceGroupRespVO>> getDeviceGroupPage(@Valid DeviceGroupPageReqVO pageReqVO) {
        PageResult<DeviceGroupDO> pageResult = deviceGroupService.getDeviceGroupPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, DeviceGroupRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出设备组表 Excel")
    @PreAuthorize("@ss.hasPermission('mes:device-group:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportDeviceGroupExcel(@Valid DeviceGroupPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<DeviceGroupDO> list = deviceGroupService.getDeviceGroupPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "设备组表.xls", "数据", DeviceGroupRespVO.class,
                        BeanUtils.toBean(list, DeviceGroupRespVO.class));
    }

}