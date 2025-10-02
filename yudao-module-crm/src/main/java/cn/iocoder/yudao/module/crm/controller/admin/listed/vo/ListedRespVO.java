package cn.iocoder.yudao.module.crm.controller.admin.listed.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 上市公司 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ListedRespVO {

    @Schema(description = "编号")
    @ExcelProperty("编号")
    private long id;

    @Schema(description = "统一社会信用代码", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("统一社会信用代码")
    private String uscc;

    @Schema(description = "企业名称", example = "王五")
    @ExcelProperty("企业名称")
    private String companyName;

    @Schema(description = "企业简称", example = "赵六")
    @ExcelProperty("企业简称")
    private String companyShortName;

    @Schema(description = "上市地点")
    @ExcelProperty("上市地点")
    private String listingLocation;

    @Schema(description = "板块")
    @ExcelProperty("板块")
    private String listingBlock;

    @Schema(description = "股票代码", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("股票代码")
    private String listingCode;

    @Schema(description = "上市日期")
    @ExcelProperty("上市日期")
    private LocalDateTime listingTime;

    @Schema(description = "注册资本(万元)")
    @ExcelProperty("注册资本(万元)")
    private String registeredCapitalCny;

    @Schema(description = "成立日期")
    @ExcelProperty("成立日期")
    private String establishedDate;

    @Schema(description = "所属省份")
    @ExcelProperty("所属省份")
    private String province;

    @Schema(description = "所属城市")
    @ExcelProperty("所属城市")
    private String city;

    @Schema(description = "所属区县")
    @ExcelProperty("所属区县")
    private String district;

    @Schema(description = "参保人数")
    @ExcelProperty("参保人数")
    private String insuredEmployees;

    @Schema(description = "行业大类")
    @ExcelProperty("行业大类")
    private String industryMajor;

    @Schema(description = "所属行业")
    @ExcelProperty("所属行业")
    private String industry;

    @Schema(description = "细分行业")
    @ExcelProperty("细分行业")
    private String industrySub;

    @Schema(description = "注册地址")
    @ExcelProperty("注册地址")
    private String registeredAddress;

    @Schema(description = "文件名称")
    @ExcelProperty("文件名称")
    private String fileUrl;
}
