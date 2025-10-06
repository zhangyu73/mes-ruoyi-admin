package cn.iocoder.yudao.module.crm.controller.admin.qualification;

import cn.iocoder.yudao.module.crm.dal.dataobject.customer.CrmCustomerDO;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

import javax.validation.constraints.*;
import javax.validation.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.IOException;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.*;

import cn.iocoder.yudao.module.crm.controller.admin.qualification.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.qualification.QualificationDO;
import cn.iocoder.yudao.module.crm.service.qualification.QualificationService;

@Tag(name = "管理后台 - 企业资质	")
@RestController
@RequestMapping("/crm/qualification")
@Validated
public class QualificationController {

    @Resource
    private QualificationService qualificationService;

    @PostMapping("/create")
    @Operation(summary = "创建企业资质	")
    @PreAuthorize("@ss.hasPermission('crm:qualification:create')")
    public CommonResult<Long> createQualification(@Valid @RequestBody QualificationSaveReqVO createReqVO) {
        return success(qualificationService.createQualification(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新企业资质	")
    @PreAuthorize("@ss.hasPermission('crm:qualification:update')")
    public CommonResult<Boolean> updateQualification(@Valid @RequestBody QualificationSaveReqVO updateReqVO) {
        qualificationService.updateQualification(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除企业资质	")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('crm:qualification:delete')")
    public CommonResult<Boolean> deleteQualification(@RequestParam("id") Long id) {
        qualificationService.deleteQualification(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除企业资质	")
                @PreAuthorize("@ss.hasPermission('crm:qualification:delete')")
    public CommonResult<Boolean> deleteQualificationList(@RequestParam("ids") List<Long> ids) {
        qualificationService.deleteQualificationListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得企业资质	")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('crm:qualification:query')")
    public CommonResult<QualificationRespVO> getQualification(@RequestParam("id") Long id) {
        QualificationDO qualification = qualificationService.getQualification(id);
        return success(BeanUtils.toBean(qualification, QualificationRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得企业资质	分页")
    @PreAuthorize("@ss.hasPermission('crm:qualification:query')")
    public CommonResult<PageResult<QualificationRespVO>> getQualificationPage(@Valid QualificationPageReqVO pageReqVO) {
        PageResult<QualificationDO> pageResult = qualificationService.getQualificationPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, QualificationRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出企业资质	 Excel")
    @PreAuthorize("@ss.hasPermission('crm:qualification:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportQualificationExcel(@Valid QualificationPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<QualificationDO> list = qualificationService.getQualificationPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "企业资质	.xls", "数据", QualificationRespVO.class,
                        BeanUtils.toBean(list, QualificationRespVO.class));
    }



    @GetMapping("/page-by-qualification")
    public CommonResult<PageResult<QualificationDO>> getQualificationPageByCompanyId(
            @RequestParam("companyId") Long companyId,
            @Valid PageParam pageParam) {
        return success(qualificationService.getQualificationPageByCompanyId(companyId, pageParam));
    }
}