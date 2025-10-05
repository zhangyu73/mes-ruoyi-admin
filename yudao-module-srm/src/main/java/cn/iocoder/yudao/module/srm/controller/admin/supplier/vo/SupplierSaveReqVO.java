package cn.iocoder.yudao.module.srm.controller.admin.supplier.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - SRM 供应商新增/修改 Request VO")
@Data
public class SupplierSaveReqVO {

    @Schema(description = "编号，主键自增", requiredMode = Schema.RequiredMode.REQUIRED, example = "11506")
    private Long id;

    @Schema(description = "供应商名称", example = "芋艿")
    private String name;

    @Schema(description = "手机")
    private String mobile;

    @Schema(description = "电话")
    private String telephone;

    @Schema(description = "QQ")
    private String qq;

    @Schema(description = "微信")
    private String wechat;

    @Schema(description = "邮箱")
    private String email;

    @Schema(description = "地区编号", example = "23334")
    private Long areaId;

    @Schema(description = "详细地址")
    private String detailAddress;

    @Schema(description = "所属行业", example = "3270")
    private Integer industryId;

    @Schema(description = "供应商等级")
    private Integer level;

    @Schema(description = "供应商来源")
    private Integer source;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

    @Schema(description = "企业编号", example = "30778")
    private Long companyId;

}