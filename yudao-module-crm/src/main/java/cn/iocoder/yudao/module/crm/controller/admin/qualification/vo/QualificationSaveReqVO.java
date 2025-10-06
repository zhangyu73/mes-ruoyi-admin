package cn.iocoder.yudao.module.crm.controller.admin.qualification.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 企业资质	新增/修改 Request VO")
@Data
public class QualificationSaveReqVO {

    @Schema(description = "产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "7312")
    private Long id;

    @Schema(description = "产品名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "李四")
    @NotEmpty(message = "产品名称不能为空")
    private String name;

    @Schema(description = "公司编号", example = "6682")
    private Long companyId;

    @Schema(description = "证书名称", example = "芋艿")
    private String certificateName;

    @Schema(description = "资质类别", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotEmpty(message = "资质类别不能为空")
    private String qualificationType;

    @Schema(description = "证书编号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "证书编号不能为空")
    private String certificateNumber;

    @Schema(description = "发证机构", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "发证机构不能为空")
    private String issuingAuthority;

    @Schema(description = "发证日期")
    private Date issueDate;

    @Schema(description = "有效期至")
    private Date expiryDate;

    @Schema(description = "证书状态", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "证书状态不能为空")
    private Integer certificateStatus;

}