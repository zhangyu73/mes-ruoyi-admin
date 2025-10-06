package cn.iocoder.yudao.module.crm.controller.admin.softcopyright;

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

import cn.iocoder.yudao.module.crm.controller.admin.softcopyright.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.softcopyright.SoftcopyrightDO;
import cn.iocoder.yudao.module.crm.service.softcopyright.SoftcopyrightService;

@Tag(name = "管理后台 - 企业软件著作权")
@RestController
@RequestMapping("/crm/softcopyright")
@Validated
public class SoftcopyrightController {

    @Resource
    private SoftcopyrightService softcopyrightService;

    @PostMapping("/create")
    @Operation(summary = "创建企业软件著作权")
    @PreAuthorize("@ss.hasPermission('crm:softcopyright:create')")
    public CommonResult<Long> createSoftcopyright(@Valid @RequestBody SoftcopyrightSaveReqVO createReqVO) {
        return success(softcopyrightService.createSoftcopyright(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新企业软件著作权")
    @PreAuthorize("@ss.hasPermission('crm:softcopyright:update')")
    public CommonResult<Boolean> updateSoftcopyright(@Valid @RequestBody SoftcopyrightSaveReqVO updateReqVO) {
        softcopyrightService.updateSoftcopyright(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除企业软件著作权")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('crm:softcopyright:delete')")
    public CommonResult<Boolean> deleteSoftcopyright(@RequestParam("id") Long id) {
        softcopyrightService.deleteSoftcopyright(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除企业软件著作权")
                @PreAuthorize("@ss.hasPermission('crm:softcopyright:delete')")
    public CommonResult<Boolean> deleteSoftcopyrightList(@RequestParam("ids") List<Long> ids) {
        softcopyrightService.deleteSoftcopyrightListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得企业软件著作权")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('crm:softcopyright:query')")
    public CommonResult<SoftcopyrightRespVO> getSoftcopyright(@RequestParam("id") Long id) {
        SoftcopyrightDO softcopyright = softcopyrightService.getSoftcopyright(id);
        return success(BeanUtils.toBean(softcopyright, SoftcopyrightRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得企业软件著作权分页")
    @PreAuthorize("@ss.hasPermission('crm:softcopyright:query')")
    public CommonResult<PageResult<SoftcopyrightRespVO>> getSoftcopyrightPage(@Valid SoftcopyrightPageReqVO pageReqVO) {
        PageResult<SoftcopyrightDO> pageResult = softcopyrightService.getSoftcopyrightPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, SoftcopyrightRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出企业软件著作权 Excel")
    @PreAuthorize("@ss.hasPermission('crm:softcopyright:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportSoftcopyrightExcel(@Valid SoftcopyrightPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<SoftcopyrightDO> list = softcopyrightService.getSoftcopyrightPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "企业软件著作权.xls", "数据", SoftcopyrightRespVO.class,
                        BeanUtils.toBean(list, SoftcopyrightRespVO.class));
    }

    @GetMapping("/page-by-softcopyright")
    public CommonResult<PageResult<SoftcopyrightDO>> getSoftcopyrightPageByCompanyId(
            @RequestParam("companyId") Long companyId,
            @Valid PageParam pageParam) {
        return success(softcopyrightService.getSoftcopyrightPageByCompanyId(companyId, pageParam));
    }
}