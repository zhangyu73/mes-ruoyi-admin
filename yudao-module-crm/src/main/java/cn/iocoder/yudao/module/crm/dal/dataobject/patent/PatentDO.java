package cn.iocoder.yudao.module.crm.dal.dataobject.patent;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 企业专利 DO
 *
 * @author 张三
 */
@TableName("crm_patent")
@KeySequence("crm_patent_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatentDO extends BaseDO {

    /**
     * 专利编号
     */
    @TableId
    private Long id;
    /**
     * 企业名称
     */
    private String conpanyName;
    /**
     * 发明名称
     */
    private String inventionName;
    /**
     * 专利类型
     */
    private String patentType;
    /**
     * 法律状态
     */
    private String legalStatus;
    /**
     * 申请号
     */
    private String applicationNo;
    /**
     * 申请日
     */
    private Date applicationDate;
    /**
     * 公开号
     */
    private String publicationNo;
    /**
     * 公开日期
     */
    private Date publicationDate;
    /**
     * 发明人
     */
    private String inventor;
    /**
     * 申请人
     */
    private String applicant;
    /**
     * 企业编号
     */
    private Long companyId;


}
