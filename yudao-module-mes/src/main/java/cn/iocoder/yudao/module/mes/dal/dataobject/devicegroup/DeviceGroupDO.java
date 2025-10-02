package cn.iocoder.yudao.module.mes.dal.dataobject.devicegroup;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 设备组表 DO
 *
 * @author 张三
 */
@TableName("mes_device_group")
@KeySequence("mes_device_group_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeviceGroupDO extends BaseDO {

    /**
     * 设备组id
     */
    @TableId
    private Long deviceGroupId;
    /**
     * 设备组编码
     */
    private String deviceGroupNo;
    /**
     * 设备组名称
     */
    private String deviceGroupName;
    /**
     * 父设备组id
     */
    private Long parentId;
    /**
     * 祖级id列表
     */
    private String ancestors;
    /**
     * 显示顺序
     */
    private Integer orderNum;
    /**
     * 是否删除
     */
    private Integer delFlag;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 更新者
     */
    private String updateBy;


}