package cn.iocoder.yudao.module.srm.controller.admin.supplier.vo;

import cn.idev.excel.annotation.ExcelProperty;
import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - SRM 供应商分页 Request VO")
@Data
public class SupplierPageReqVO extends PageParam {

    @Schema(description = "编号")
    private Long id;

    @Schema(description = "供应商名称", example = "芋艿")
    private String name;

    @Schema(description = "地区编号", example = "23334")
    private Long areaId;

    @Schema(description = "所属行业", example = "3270")
    private Integer industryId;

    @Schema(description = "供应商等级")
    private Integer level;

    @Schema(description = "企业编号", example = "30778")
    private Long companyId;

}