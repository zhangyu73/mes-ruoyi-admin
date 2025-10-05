
package cn.iocoder.yudao.module.srm.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * CRM 错误码枚举类
 * <p>
 * crm 系统，使用 1-020-000-000 段
 */
public interface ErrorCodeConstants {
    // ========== SRM 供应商 1-030-000-000 ==========
    ErrorCode SUPPLIER_NOT_EXISTS = new ErrorCode(1_030_000_000, "SRM 供应商不存在");
}
