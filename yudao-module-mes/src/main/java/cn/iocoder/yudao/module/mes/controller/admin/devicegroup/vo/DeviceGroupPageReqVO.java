package cn.iocoder.yudao.module.mes.controller.admin.devicegroup.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 设备组表分页 Request VO")
@Data
public class DeviceGroupPageReqVO extends PageParam {

    @Schema(description = "设备组编码")
    private String deviceGroupNo;

    @Schema(description = "设备组名称", example = "王五")
    private String deviceGroupName;

    @Schema(description = "父设备组id", example = "7469")
    private Long parentId;

    @Schema(description = "祖级id列表")
    private String ancestors;

}