package cn.iocoder.yudao.module.crm.dal.dataobject.listed;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 上市公司 DO
 *
 * @author 张三
 */
@TableName("crm_listed")
@KeySequence("crm_listed_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListedDO extends BaseDO {

    /**
     * 统一社会信用代码
     */
    private String uscc;
    /**
     * 企业名称
     */
    private String companyName;
    /**
     * 企业简称
     */
    private String companyShortName;
    /**
     * 上市地点
     */
    private String listingLocation;
    /**
     * 板块
     */
    private String listingBlock;
    /**
     * 股票代码
     */

    private String listingCode;
    /**
     * 上市日期
     */
    private LocalDateTime listingTime;
    /**
     * 政府控股
     */
    private String govtControlled;
    /**
     * 园区名称
     */
    private String parkName;
    /**
     * 集团名称
     */
    private String groupName;
    /**
     * 法定代表人
     */
    private String legalRepresentative;
    /**
     * 经营状态
     */
    private String operatingStatus;
    /**
     * 注册资本(万元)
     */
    private String registeredCapitalCny;
    /**
     * 实缴资本(万元)
     */
    private String paidInCapitalCny;
    /**
     * 成立日期
     */
    private String establishedDate;
    /**
     * 所属省份
     */
    private String province;
    /**
     * 所属城市
     */
    private String city;
    /**
     * 所属区县
     */
    private String district;
    /**
     * 参保人数
     */
    private String insuredEmployees;
    /**
     * 企业类型
     */
    private String companyType;
    /**
     * 行业大类
     */
    private String industryMajor;
    /**
     * 所属行业
     */
    private String industry;
    /**
     * 细分行业
     */
    private String industrySub;
    /**
     * 注册地址
     */
    private String registeredAddress;
    /**
     * 网址
     */
    private String website;
    /**
     * 经营范围
     */
    private String businessScope;
    /**
     * 经度
     */
    private String longitude;
    /**
     * 纬度
     */
    private String latitude;
    /**
     * 经营处理状态
     */
    private String operatingProcessStatus;
    /**
     * 生产能力
     */
    private String annualCapacityMt;
    /**
     * 产品类型
     */
    private String productType;
    /**
     * 经营方式
     */
    private String businessModel;
    /**
     * 主要控制企业
     */
    private String majorControlledEntities;
    /**
     * 上云评级
     */
    private String cloudRating;
    /**
     * 专精特新中小企业
     */
    private String specializedGiant;
    /**
     * 电话
     */
    private String phone;
    /**
     * 坐标正常
     */
    private String coordsValid;
    /**
     * 国际行业中类
     */
    private String isicMid;
    /**
     * 行业小类
     */
    private String isicMinor;
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private long id;

    /**
     * 文件名称
     */
    private String fileUrl;
}
