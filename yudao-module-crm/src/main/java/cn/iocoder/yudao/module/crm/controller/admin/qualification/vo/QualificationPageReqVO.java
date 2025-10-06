package cn.iocoder.yudao.module.crm.controller.admin.qualification.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 企业资质	分页 Request VO")
@Data
public class QualificationPageReqVO extends PageParam {

    @Schema(description = "产品名称", example = "李四")
    private String name;

    @Schema(description = "公司编号", example = "6682")
    private Long companyId;

    @Schema(description = "证书名称", example = "芋艿")
    private String certificateName;

    @Schema(description = "证书编号")
    private String certificateNumber;

    @Schema(description = "证书状态", example = "1")
    private Integer certificateStatus;


}