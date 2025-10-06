package cn.iocoder.yudao.module.crm.controller.admin.softcopyright.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 企业软件著作权分页 Request VO")
@Data
public class SoftcopyrightPageReqVO extends PageParam {

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

    @Schema(description = "企业名称", example = "李四")
    private String companyName;

    @Schema(description = "软件全称", example = "赵六")
    private String softwareFullName;

    @Schema(description = "企业编号", example = "12293")
    private Long companyId;

}