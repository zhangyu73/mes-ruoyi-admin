package cn.iocoder.yudao.module.crm.controller.admin.patent.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 企业专利 Response VO")
@Data
@ExcelIgnoreUnannotated
public class PatentRespVO {

    @Schema(description = "专利编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "14320")
    @ExcelProperty("专利编号")
    private Long id;

    @Schema(description = "创建时间")
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "企业名称", example = "赵六")
    @ExcelProperty("企业名称")
    private String conpanyName;

    @Schema(description = "发明名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "芋艿")
    @ExcelProperty("发明名称")
    private String inventionName;

    @Schema(description = "专利类型", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("专利类型")
    private String patentType;

    @Schema(description = "法律状态", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("法律状态")
    private String legalStatus;

    @Schema(description = "申请号", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("申请号")
    private String applicationNo;

    @Schema(description = "申请日")
    @ExcelProperty("申请日")
    private Date applicationDate;

    @Schema(description = "公开号")
    @ExcelProperty("公开号")
    private String publicationNo;

    @Schema(description = "公开日期")
    @ExcelProperty("公开日期")
    private Date publicationDate;

    @Schema(description = "发明人")
    @ExcelProperty("发明人")
    private String inventor;

    @Schema(description = "申请人")
    @ExcelProperty("申请人")
    private String applicant;

    @Schema(description = "企业编号", example = "4572")
    @ExcelProperty("企业编号")
    private Long companyId;

}
