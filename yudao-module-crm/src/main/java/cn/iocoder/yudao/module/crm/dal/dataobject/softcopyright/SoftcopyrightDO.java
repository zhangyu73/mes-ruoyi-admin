package cn.iocoder.yudao.module.crm.dal.dataobject.softcopyright;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 企业软件著作权 DO
 *
 * @author 张三
 */
@TableName("crm_softcopyright")
@KeySequence("crm_softcopyright_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SoftcopyrightDO extends BaseDO {

    /**
     * 专利编号
     */
    @TableId
    private Long id;
    /**
     * 企业名称
     */
    private String companyName;
    /**
     * 软件全称
     */
    private String softwareFullName;
    /**
     * 登记号
     */
    private String registrationNo;
    /**
     * 首次发布日期
     */
    private String firstPublishDate;
    /**
     * 登记日期
     */
    private String registrationDate;
    /**
     * 软件名称
     */
    private String softwareName;
    /**
     * 企业编号
     */
    private Long companyId;


}