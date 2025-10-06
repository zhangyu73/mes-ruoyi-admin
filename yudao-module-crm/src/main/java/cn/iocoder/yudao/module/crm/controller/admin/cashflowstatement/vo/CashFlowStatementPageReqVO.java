package cn.iocoder.yudao.module.crm.controller.admin.cashflowstatement.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 现金流量分页 Request VO")
@Data
public class CashFlowStatementPageReqVO extends PageParam {

    @Schema(description = "证券代码")
    private String stockCode;

    @Schema(description = "证券简称", example = "王五")
    private String shortName;

    @Schema(description = "统计截止日期")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private Date[] endDate;

    @Schema(description = "报表类型（A=年报，Q1=一季报，H=半年报，Q3=三季报）", example = "1")
    private String reportType;

    @Schema(description = "公司编号", example = "32652")
    private Long companyId;

}