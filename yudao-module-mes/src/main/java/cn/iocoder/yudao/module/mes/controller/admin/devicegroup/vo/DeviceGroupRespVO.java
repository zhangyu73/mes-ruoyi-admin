package cn.iocoder.yudao.module.mes.controller.admin.devicegroup.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 设备组表 Response VO")
@Data
@ExcelIgnoreUnannotated
public class DeviceGroupRespVO {

    @Schema(description = "设备组id", requiredMode = Schema.RequiredMode.REQUIRED, example = "5199")
    @ExcelProperty("设备组id")
    private Long deviceGroupId;

    @Schema(description = "设备组编码")
    @ExcelProperty("设备组编码")
    private String deviceGroupNo;

    @Schema(description = "设备组名称", example = "王五")
    @ExcelProperty("设备组名称")
    private String deviceGroupName;

    @Schema(description = "父设备组id", example = "7469")
    @ExcelProperty("父设备组id")
    private Long parentId;

    @Schema(description = "祖级id列表")
    @ExcelProperty("祖级id列表")
    private String ancestors;

}