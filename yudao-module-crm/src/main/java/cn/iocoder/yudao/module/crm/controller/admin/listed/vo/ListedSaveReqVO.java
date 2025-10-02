package cn.iocoder.yudao.module.crm.controller.admin.listed.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 上市公司新增/修改 Request VO")
@Data
public class ListedSaveReqVO {

    @Schema(description = "统一社会信用代码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "统一社会信用代码不能为空")
    private String uscc;

    @Schema(description = "企业名称", example = "王五")
    private String companyName;

    @Schema(description = "企业简称", example = "赵六")
    private String companyShortName;

    @Schema(description = "上市地点")
    private String listingLocation;

    @Schema(description = "板块")
    private String listingBlock;

    @Schema(description = "股票代码", requiredMode = Schema.RequiredMode.REQUIRED)
    private String listingCode;

    @Schema(description = "上市日期")
    private LocalDateTime listingTime;

    @Schema(description = "成立日期")
    private String establishedDate;

    @Schema(description = "所属省份")
    private String province;

    @Schema(description = "所属城市")
    private String city;

    @Schema(description = "所属区县")
    private String district;

    @Schema(description = "参保人数")
    private String insuredEmployees;

    @Schema(description = "行业大类")
    private String industryMajor;

    @Schema(description = "所属行业")
    private String industry;

    @Schema(description = "细分行业")
    private String industrySub;

    @Schema(description = "注册地址")
    private String registeredAddress;

    @Schema(description = "经营范围")
    private String businessScope;

    @Schema(description = "经度")
    private String longitude;

    @Schema(description = "纬度")
    private String latitude;

    @Schema(description = "编号")
    private String id;
}