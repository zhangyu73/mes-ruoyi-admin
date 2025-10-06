package cn.iocoder.yudao.module.crm.controller.admin.balancesheet;

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

import cn.iocoder.yudao.module.crm.controller.admin.balancesheet.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.balancesheet.BalanceSheetDO;
import cn.iocoder.yudao.module.crm.service.balancesheet.BalanceSheetService;

@Tag(name = "管理后台 - 资产负债")
@RestController
@RequestMapping("/crm/balance-sheet")
@Validated
public class BalanceSheetController {

    @Resource
    private BalanceSheetService balanceSheetService;

    @PostMapping("/create")
    @Operation(summary = "创建资产负债")
    @PreAuthorize("@ss.hasPermission('crm:balance-sheet:create')")
    public CommonResult<Long> createBalanceSheet(@Valid @RequestBody BalanceSheetSaveReqVO createReqVO) {
        return success(balanceSheetService.createBalanceSheet(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新资产负债")
    @PreAuthorize("@ss.hasPermission('crm:balance-sheet:update')")
    public CommonResult<Boolean> updateBalanceSheet(@Valid @RequestBody BalanceSheetSaveReqVO updateReqVO) {
        balanceSheetService.updateBalanceSheet(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除资产负债")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('crm:balance-sheet:delete')")
    public CommonResult<Boolean> deleteBalanceSheet(@RequestParam("id") Long id) {
        balanceSheetService.deleteBalanceSheet(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除资产负债")
                @PreAuthorize("@ss.hasPermission('crm:balance-sheet:delete')")
    public CommonResult<Boolean> deleteBalanceSheetList(@RequestParam("ids") List<Long> ids) {
        balanceSheetService.deleteBalanceSheetListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得资产负债")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('crm:balance-sheet:query')")
    public CommonResult<BalanceSheetRespVO> getBalanceSheet(@RequestParam("id") Long id) {
        BalanceSheetDO balanceSheet = balanceSheetService.getBalanceSheet(id);
        return success(BeanUtils.toBean(balanceSheet, BalanceSheetRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得资产负债分页")
    @PreAuthorize("@ss.hasPermission('crm:balance-sheet:query')")
    public CommonResult<PageResult<BalanceSheetRespVO>> getBalanceSheetPage(@Valid BalanceSheetPageReqVO pageReqVO) {
        PageResult<BalanceSheetDO> pageResult = balanceSheetService.getBalanceSheetPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, BalanceSheetRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出资产负债 Excel")
    @PreAuthorize("@ss.hasPermission('crm:balance-sheet:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportBalanceSheetExcel(@Valid BalanceSheetPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<BalanceSheetDO> list = balanceSheetService.getBalanceSheetPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "资产负债.xls", "数据", BalanceSheetRespVO.class,
                        BeanUtils.toBean(list, BalanceSheetRespVO.class));
    }
    @GetMapping("/page-by-balancesheet")
    public CommonResult<PageResult<BalanceSheetDO>> getBalanceSheetPageByCompanyId(
            @RequestParam("companyId") Long companyId,
            @Valid PageParam pageParam) {
        return success(balanceSheetService.getBalanceSheetPageByCompanyId(companyId, pageParam));
    }
}