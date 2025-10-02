package cn.iocoder.yudao.module.crm.controller.admin.listed;

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

import cn.iocoder.yudao.module.crm.controller.admin.listed.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.listed.ListedDO;
import cn.iocoder.yudao.module.crm.service.listed.ListedService;

@Tag(name = "管理后台 - 上市公司")
@RestController
@RequestMapping("/crm/listed")
@Validated
public class ListedController {

    @Resource
    private ListedService listedService;

//    @PostMapping("/create")
//    @Operation(summary = "创建上市公司")
//    @PreAuthorize("@ss.hasPermission('crm:listed:create')")
//    public CommonResult<String> createListed(@Valid @RequestBody ListedSaveReqVO createReqVO) {
//        return success(listedService.createListed(createReqVO));
//    }

    @PutMapping("/update")
    @Operation(summary = "更新上市公司")
    @PreAuthorize("@ss.hasPermission('crm:listed:update')")
    public CommonResult<Boolean> updateListed(@Valid @RequestBody ListedSaveReqVO updateReqVO) {
        listedService.updateListed(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除上市公司")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('crm:listed:delete')")
    public CommonResult<Boolean> deleteListed(@RequestParam("id") String id) {
        listedService.deleteListed(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除上市公司")
                @PreAuthorize("@ss.hasPermission('crm:listed:delete')")
    public CommonResult<Boolean> deleteListedList(@RequestParam("ids") List<String> ids) {
        listedService.deleteListedListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得上市公司")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('crm:listed:query')")
    public CommonResult<ListedRespVO> getListed(@RequestParam("id") String id) {
        ListedDO listed = listedService.getListed(id);
        return success(BeanUtils.toBean(listed, ListedRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得上市公司分页")
    @PreAuthorize("@ss.hasPermission('crm:listed:query')")
    public CommonResult<PageResult<ListedRespVO>> getListedPage(@Valid ListedPageReqVO pageReqVO) {
        PageResult<ListedDO> pageResult = listedService.getListedPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ListedRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出上市公司 Excel")
    @PreAuthorize("@ss.hasPermission('crm:listed:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportListedExcel(@Valid ListedPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ListedDO> list = listedService.getListedPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "上市公司.xls", "数据", ListedRespVO.class,
                        BeanUtils.toBean(list, ListedRespVO.class));
    }

}