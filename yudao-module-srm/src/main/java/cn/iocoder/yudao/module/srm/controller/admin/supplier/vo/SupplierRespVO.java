package cn.iocoder.yudao.module.srm.controller.admin.supplier.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - SRM 供应商 Response VO")
@Data
@ExcelIgnoreUnannotated
public class SupplierRespVO {

    @Schema(description = "编号，主键自增", requiredMode = Schema.RequiredMode.REQUIRED, example = "11506")
    @ExcelProperty("编号，主键自增")
    private Long id;

    @Schema(description = "供应商名称", example = "芋艿")
    @ExcelProperty("供应商名称")
    private String name;

    @Schema(description = "手机")
    @ExcelProperty("手机")
    private String mobile;

    @Schema(description = "电话")
    @ExcelProperty("电话")
    private String telephone;

    @Schema(description = "QQ")
    @ExcelProperty("QQ")
    private String qq;

    @Schema(description = "微信")
    @ExcelProperty("微信")
    private String wechat;

    @Schema(description = "邮箱")
    @ExcelProperty("邮箱")
    private String email;

    @Schema(description = "地区编号", example = "23334")
    @ExcelProperty("地区编号")
    private Long areaId;

    @Schema(description = "详细地址")
    @ExcelProperty("详细地址")
    private String detailAddress;

    @Schema(description = "所属行业", example = "3270")
    @ExcelProperty("所属行业")
    private Integer industryId;

    @Schema(description = "供应商等级")
    @ExcelProperty("供应商等级")
    private Integer level;

    @Schema(description = "供应商来源")
    @ExcelProperty("供应商来源")
    private Integer source;

    @Schema(description = "备注", example = "你说的对")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "企业编号", example = "30778")
    @ExcelProperty("企业编号")
    private Long companyId;

}