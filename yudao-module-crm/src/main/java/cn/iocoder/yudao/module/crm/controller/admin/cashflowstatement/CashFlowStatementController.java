package cn.iocoder.yudao.module.crm.controller.admin.cashflowstatement;

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

import cn.iocoder.yudao.module.crm.controller.admin.cashflowstatement.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.cashflowstatement.CashFlowStatementDO;
import cn.iocoder.yudao.module.crm.service.cashflowstatement.CashFlowStatementService;

@Tag(name = "管理后台 - 现金流量")
@RestController
@RequestMapping("/crm/cash-flow-statement")
@Validated
public class CashFlowStatementController {

    @Resource
    private CashFlowStatementService cashFlowStatementService;

    @PostMapping("/create")
    @Operation(summary = "创建现金流量")
    @PreAuthorize("@ss.hasPermission('crm:cash-flow-statement:create')")
    public CommonResult<Long> createCashFlowStatement(@Valid @RequestBody CashFlowStatementSaveReqVO createReqVO) {
        return success(cashFlowStatementService.createCashFlowStatement(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新现金流量")
    @PreAuthorize("@ss.hasPermission('crm:cash-flow-statement:update')")
    public CommonResult<Boolean> updateCashFlowStatement(@Valid @RequestBody CashFlowStatementSaveReqVO updateReqVO) {
        cashFlowStatementService.updateCashFlowStatement(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除现金流量")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('crm:cash-flow-statement:delete')")
    public CommonResult<Boolean> deleteCashFlowStatement(@RequestParam("id") Long id) {
        cashFlowStatementService.deleteCashFlowStatement(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除现金流量")
                @PreAuthorize("@ss.hasPermission('crm:cash-flow-statement:delete')")
    public CommonResult<Boolean> deleteCashFlowStatementList(@RequestParam("ids") List<Long> ids) {
        cashFlowStatementService.deleteCashFlowStatementListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得现金流量")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('crm:cash-flow-statement:query')")
    public CommonResult<CashFlowStatementRespVO> getCashFlowStatement(@RequestParam("id") Long id) {
        CashFlowStatementDO cashFlowStatement = cashFlowStatementService.getCashFlowStatement(id);
        return success(BeanUtils.toBean(cashFlowStatement, CashFlowStatementRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得现金流量分页")
    @PreAuthorize("@ss.hasPermission('crm:cash-flow-statement:query')")
    public CommonResult<PageResult<CashFlowStatementRespVO>> getCashFlowStatementPage(@Valid CashFlowStatementPageReqVO pageReqVO) {
        PageResult<CashFlowStatementDO> pageResult = cashFlowStatementService.getCashFlowStatementPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, CashFlowStatementRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出现金流量 Excel")
    @PreAuthorize("@ss.hasPermission('crm:cash-flow-statement:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportCashFlowStatementExcel(@Valid CashFlowStatementPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<CashFlowStatementDO> list = cashFlowStatementService.getCashFlowStatementPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "现金流量.xls", "数据", CashFlowStatementRespVO.class,
                        BeanUtils.toBean(list, CashFlowStatementRespVO.class));
    }
    @GetMapping("/page-by-cashflowstatement")
    public CommonResult<PageResult<CashFlowStatementDO>> getCashFlowStatementPageByCompanyId(
            @RequestParam("companyId") Long companyId,
            @Valid PageParam pageParam) {
        return success(cashFlowStatementService.getCashFlowStatementPageByCompanyId(companyId, pageParam));
    }
}