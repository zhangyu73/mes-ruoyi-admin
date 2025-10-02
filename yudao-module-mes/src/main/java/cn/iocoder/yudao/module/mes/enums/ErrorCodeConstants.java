package cn.iocoder.yudao.module.mes.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * MES 错误码枚举类
 * <p>
 * mes 系统，使用 1-030-000-000 段
 */
public interface ErrorCodeConstants {

    // TODO 待办：请将下面的错误码复制到 yudao-module-mes 模块的 ErrorCodeConstants 类中。注意，请给“TODO 补充编号”设置一个错误码编号！！！
// ========== 设备组表 TODO 补充编号 ==========
    ErrorCode DEVICE_GROUP_NOT_EXISTS = new ErrorCode(2_030_602_000, "设备组表不存在");

}
