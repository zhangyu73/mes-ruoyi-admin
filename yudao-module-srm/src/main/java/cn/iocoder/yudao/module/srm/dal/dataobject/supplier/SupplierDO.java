package cn.iocoder.yudao.module.srm.dal.dataobject.supplier;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * SRM 供应商 DO
 *
 * @author 张三
 */
@TableName("srm_supplier")
@KeySequence("srm_supplier_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierDO extends BaseDO {

    /**
     * 编号，主键自增
     */
    @TableId
    private Long id;
    /**
     * 供应商名称
     */
    private String name;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 电话
     */
    private String telephone;
    /**
     * QQ
     */
    private String qq;
    /**
     * 微信
     */
    private String wechat;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 地区编号
     */
    private Long areaId;
    /**
     * 详细地址
     */
    private String detailAddress;
    /**
     * 所属行业
     */
    private Integer industryId;
    /**
     * 供应商等级
     */
    private Integer level;
    /**
     * 供应商来源
     */
    private Integer source;
    /**
     * 备注
     */
    private String remark;
    /**
     * 企业编号
     */
    private Long companyId;


}