package cn.iocoder.yudao.module.crm.controller.admin.patent.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 企业专利新增/修改 Request VO")
@Data
public class PatentSaveReqVO {

    @Schema(description = "专利编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "14320")
    private Long id;

    @Schema(description = "企业名称", example = "赵六")
    private String conpanyName;

    @Schema(description = "发明名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "芋艿")
    @NotEmpty(message = "发明名称不能为空")
    private String inventionName;

    @Schema(description = "专利类型", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotEmpty(message = "专利类型不能为空")
    private String patentType;

    @Schema(description = "法律状态", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotEmpty(message = "法律状态不能为空")
    private String legalStatus;

    @Schema(description = "申请号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "申请号不能为空")
    private String applicationNo;

    @Schema(description = "申请日")
    private Date applicationDate;

    @Schema(description = "公开号")
    private String publicationNo;

    @Schema(description = "公开日期")
    private Date publicationDate;

    @Schema(description = "发明人")
    private String inventor;

    @Schema(description = "申请人")
    private String applicant;

    @Schema(description = "企业编号", example = "4572")
    private Long companyId;

}