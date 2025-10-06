package cn.iocoder.yudao.module.crm.controller.admin.qualification.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 企业资质	 Response VO")
@Data
@ExcelIgnoreUnannotated
public class QualificationRespVO {

    @Schema(description = "产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "7312")
    @ExcelProperty("产品编号")
    private Long id;

    @Schema(description = "产品名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "李四")
    @ExcelProperty("产品名称")
    private String name;

    @Schema(description = "创建时间")
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "公司编号", example = "6682")
    @ExcelProperty("公司编号")
    private Long companyId;

    @Schema(description = "证书名称", example = "芋艿")
    @ExcelProperty("证书名称")
    private String certificateName;

    @Schema(description = "资质类别", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("资质类别")
    private String qualificationType;

    @Schema(description = "证书编号", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("证书编号")
    private String certificateNumber;

    @Schema(description = "发证机构", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("发证机构")
    private String issuingAuthority;

    @Schema(description = "发证日期")
    @ExcelProperty("发证日期")
    private Date issueDate;

    @Schema(description = "有效期至")
    @ExcelProperty("有效期至")
    private Date expiryDate;

    @Schema(description = "证书状态", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("证书状态")
    private Integer certificateStatus;

}
