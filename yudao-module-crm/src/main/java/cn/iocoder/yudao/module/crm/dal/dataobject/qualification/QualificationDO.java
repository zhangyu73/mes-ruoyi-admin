package cn.iocoder.yudao.module.crm.dal.dataobject.qualification;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 企业资质	 DO
 *
 * @author 张三
 */
@TableName("crm_qualification")
@KeySequence("crm_qualification_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QualificationDO extends BaseDO {

    /**
     * 产品编号
     */
    @TableId
    private Long id;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 公司编号
     */
    private Long companyId;
    /**
     * 证书名称
     */
    private String certificateName;
    /**
     * 资质类别
     */
    private String qualificationType;
    /**
     * 证书编号
     */
    private String certificateNumber;
    /**
     * 发证机构
     */
    private String issuingAuthority;
    /**
     * 发证日期
     */
    private Date issueDate;
    /**
     * 有效期至
     */
    private Date expiryDate;
    /**
     * 证书状态
     */
    private Integer certificateStatus;

    /**
     * 企业编号
     */
    private Long CompanyId;
}
