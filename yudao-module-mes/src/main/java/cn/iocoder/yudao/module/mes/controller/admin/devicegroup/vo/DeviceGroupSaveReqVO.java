package cn.iocoder.yudao.module.mes.controller.admin.devicegroup.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 设备组表新增/修改 Request VO")
@Data
public class DeviceGroupSaveReqVO {

    @Schema(description = "设备组id", requiredMode = Schema.RequiredMode.REQUIRED, example = "5199")
    private Long deviceGroupId;

    @Schema(description = "设备组编码")
    private String deviceGroupNo;

    @Schema(description = "设备组名称", example = "王五")
    private String deviceGroupName;

    @Schema(description = "父设备组id", example = "7469")
    private Long parentId;

    @Schema(description = "祖级id列表")
    private String ancestors;

}