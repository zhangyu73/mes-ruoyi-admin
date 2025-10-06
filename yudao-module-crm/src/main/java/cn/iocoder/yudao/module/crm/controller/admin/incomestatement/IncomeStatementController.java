package cn.iocoder.yudao.module.crm.controller.admin.incomestatement;

import cn.iocoder.yudao.module.crm.dal.dataobject.patent.PatentDO;
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

import cn.iocoder.yudao.module.crm.controller.admin.incomestatement.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.incomestatement.IncomeStatementDO;
import cn.iocoder.yudao.module.crm.service.incomestatement.IncomeStatementService;

@Tag(name = "管理后台 - 利润")
@RestController
@RequestMapping("/crm/income-statement")
@Validated
public class IncomeStatementController {

    @Resource
    private IncomeStatementService incomeStatementService;

    @PostMapping("/create")
    @Operation(summary = "创建利润")
    @PreAuthorize("@ss.hasPermission('crm:income-statement:create')")
    public CommonResult<Long> createIncomeStatement(@Valid @RequestBody IncomeStatementSaveReqVO createReqVO) {
        return success(incomeStatementService.createIncomeStatement(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新利润")
    @PreAuthorize("@ss.hasPermission('crm:income-statement:update')")
    public CommonResult<Boolean> updateIncomeStatement(@Valid @RequestBody IncomeStatementSaveReqVO updateReqVO) {
        incomeStatementService.updateIncomeStatement(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除利润")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('crm:income-statement:delete')")
    public CommonResult<Boolean> deleteIncomeStatement(@RequestParam("id") Long id) {
        incomeStatementService.deleteIncomeStatement(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除利润")
                @PreAuthorize("@ss.hasPermission('crm:income-statement:delete')")
    public CommonResult<Boolean> deleteIncomeStatementList(@RequestParam("ids") List<Long> ids) {
        incomeStatementService.deleteIncomeStatementListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得利润")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('crm:income-statement:query')")
    public CommonResult<IncomeStatementRespVO> getIncomeStatement(@RequestParam("id") Long id) {
        IncomeStatementDO incomeStatement = incomeStatementService.getIncomeStatement(id);
        return success(BeanUtils.toBean(incomeStatement, IncomeStatementRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得利润分页")
    @PreAuthorize("@ss.hasPermission('crm:income-statement:query')")
    public CommonResult<PageResult<IncomeStatementRespVO>> getIncomeStatementPage(@Valid IncomeStatementPageReqVO pageReqVO) {
        PageResult<IncomeStatementDO> pageResult = incomeStatementService.getIncomeStatementPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, IncomeStatementRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出利润 Excel")
    @PreAuthorize("@ss.hasPermission('crm:income-statement:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportIncomeStatementExcel(@Valid IncomeStatementPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<IncomeStatementDO> list = incomeStatementService.getIncomeStatementPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "利润.xls", "数据", IncomeStatementRespVO.class,
                        BeanUtils.toBean(list, IncomeStatementRespVO.class));
    }
    @GetMapping("/page-by-incomestatement")
    public CommonResult<PageResult<IncomeStatementDO>> getIncomeStatementPageByCompanyId(
            @RequestParam("companyId") Long companyId,
            @Valid PageParam pageParam) {
        return success(incomeStatementService.getIncomeStatementPageByCompanyId(companyId, pageParam));
    }
}