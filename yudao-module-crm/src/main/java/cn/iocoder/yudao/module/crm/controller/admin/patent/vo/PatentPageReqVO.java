package cn.iocoder.yudao.module.crm.controller.admin.patent.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 企业专利分页 Request VO")
@Data
public class PatentPageReqVO extends PageParam {

    @Schema(description = "企业名称", example = "赵六")
    private String conpanyName;

    @Schema(description = "发明名称", example = "芋艿")
    private String inventionName;

    @Schema(description = "专利类型", example = "2")
    private String patentType;

    @Schema(description = "申请日")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private Date[] applicationDate;

    @Schema(description = "公开日期")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private Date[] publicationDate;

}