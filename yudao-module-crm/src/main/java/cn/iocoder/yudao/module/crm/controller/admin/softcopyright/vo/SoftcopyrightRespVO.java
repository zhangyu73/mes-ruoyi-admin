package cn.iocoder.yudao.module.crm.controller.admin.softcopyright.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 企业软件著作权 Response VO")
@Data
@ExcelIgnoreUnannotated
public class SoftcopyrightRespVO {

    @Schema(description = "专利编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "10225")
    @ExcelProperty("专利编号")
    private Long id;

    @Schema(description = "创建时间")
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "企业名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "李四")
    @ExcelProperty("企业名称")
    private String companyName;

    @Schema(description = "软件全称", requiredMode = Schema.RequiredMode.REQUIRED, example = "赵六")
    @ExcelProperty("软件全称")
    private String softwareFullName;

    @Schema(description = "登记号", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("登记号")
    private String registrationNo;

    @Schema(description = "首次发布日期")
    @ExcelProperty("首次发布日期")
    private String firstPublishDate;

    @Schema(description = "登记日期")
    @ExcelProperty("登记日期")
    private String registrationDate;

    @Schema(description = "软件名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "王五")
    @ExcelProperty("软件名称")
    private String softwareName;

    @Schema(description = "企业编号", example = "12293")
    @ExcelProperty("企业编号")
    private Long companyId;

}