package cn.iocoder.yudao.module.crm.controller.admin.incomestatement.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 利润分页 Request VO")
@Data
public class IncomeStatementPageReqVO extends PageParam {

    @Schema(description = "证券代码")
    private String stockCode;

    @Schema(description = "证券简称", example = "赵六")
    private String shortName;

    @Schema(description = "统计截止日期")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private String[] endDate;

    @Schema(description = "报表类型", example = "2")
    private String reportType;

    @Schema(description = "公司编号", example = "21486")
    private Long companyId;

}