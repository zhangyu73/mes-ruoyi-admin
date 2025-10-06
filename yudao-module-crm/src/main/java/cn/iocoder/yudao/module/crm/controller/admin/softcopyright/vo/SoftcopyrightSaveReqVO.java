package cn.iocoder.yudao.module.crm.controller.admin.softcopyright.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 企业软件著作权新增/修改 Request VO")
@Data
public class SoftcopyrightSaveReqVO {

    @Schema(description = "专利编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "10225")
    private Long id;

    @Schema(description = "企业名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "李四")
    @NotEmpty(message = "企业名称不能为空")
    private String companyName;

    @Schema(description = "软件全称", requiredMode = Schema.RequiredMode.REQUIRED, example = "赵六")
    @NotEmpty(message = "软件全称不能为空")
    private String softwareFullName;

    @Schema(description = "登记号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "登记号不能为空")
    private String registrationNo;

    @Schema(description = "首次发布日期")
    private String firstPublishDate;

    @Schema(description = "登记日期")
    private String registrationDate;

    @Schema(description = "软件名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "王五")
    @NotEmpty(message = "软件名称不能为空")
    private String softwareName;

    @Schema(description = "企业编号", example = "12293")
    private Long companyId;

}