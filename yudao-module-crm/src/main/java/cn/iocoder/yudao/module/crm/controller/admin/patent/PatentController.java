package cn.iocoder.yudao.module.crm.controller.admin.patent;

import cn.iocoder.yudao.module.crm.dal.dataobject.qualification.QualificationDO;
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

import cn.iocoder.yudao.module.crm.controller.admin.patent.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.patent.PatentDO;
import cn.iocoder.yudao.module.crm.service.patent.PatentService;

@Tag(name = "管理后台 - 企业专利")
@RestController
@RequestMapping("/crm/patent")
@Validated
public class PatentController {

    @Resource
    private PatentService patentService;

    @PostMapping("/create")
    @Operation(summary = "创建企业专利")
    @PreAuthorize("@ss.hasPermission('crm:patent:create')")
    public CommonResult<Long> createPatent(@Valid @RequestBody PatentSaveReqVO createReqVO) {
        return success(patentService.createPatent(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新企业专利")
    @PreAuthorize("@ss.hasPermission('crm:patent:update')")
    public CommonResult<Boolean> updatePatent(@Valid @RequestBody PatentSaveReqVO updateReqVO) {
        patentService.updatePatent(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除企业专利")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('crm:patent:delete')")
    public CommonResult<Boolean> deletePatent(@RequestParam("id") Long id) {
        patentService.deletePatent(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除企业专利")
                @PreAuthorize("@ss.hasPermission('crm:patent:delete')")
    public CommonResult<Boolean> deletePatentList(@RequestParam("ids") List<Long> ids) {
        patentService.deletePatentListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得企业专利")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('crm:patent:query')")
    public CommonResult<PatentRespVO> getPatent(@RequestParam("id") Long id) {
        PatentDO patent = patentService.getPatent(id);
        return success(BeanUtils.toBean(patent, PatentRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得企业专利分页")
    @PreAuthorize("@ss.hasPermission('crm:patent:query')")
    public CommonResult<PageResult<PatentRespVO>> getPatentPage(@Valid PatentPageReqVO pageReqVO) {
        PageResult<PatentDO> pageResult = patentService.getPatentPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, PatentRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出企业专利 Excel")
    @PreAuthorize("@ss.hasPermission('crm:patent:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportPatentExcel(@Valid PatentPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<PatentDO> list = patentService.getPatentPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "企业专利.xls", "数据", PatentRespVO.class,
                        BeanUtils.toBean(list, PatentRespVO.class));
    }

    @GetMapping("/page-by-patent")
    public CommonResult<PageResult<PatentDO>> getPatentPageByCompanyId(
            @RequestParam("companyId") Long companyId,
            @Valid PageParam pageParam) {
        return success(patentService.getPatentPageByCompanyId(companyId, pageParam));
    }
}