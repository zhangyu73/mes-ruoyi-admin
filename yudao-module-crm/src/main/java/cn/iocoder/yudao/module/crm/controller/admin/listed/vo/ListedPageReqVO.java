package cn.iocoder.yudao.module.crm.controller.admin.listed.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 上市公司分页 Request VO")
@Data
public class ListedPageReqVO extends PageParam {

    @Schema(description = "编号")
    private long id;

    @Schema(description = "统一社会信用代码")
    private String uscc;

    @Schema(description = "企业名称", example = "王五")
    private String companyName;

    @Schema(description = "企业简称", example = "赵六")
    private String companyShortName;

    @Schema(description = "上市地点")
    private String listingLocation;

    @Schema(description = "板块")
    private String listingBlock;

    @Schema(description = "股票代码")
    private String listingCode;

    @Schema(description = "上市日期")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] listingTime;

    @Schema(description = "文件名称")
    private String fileUrl;

}