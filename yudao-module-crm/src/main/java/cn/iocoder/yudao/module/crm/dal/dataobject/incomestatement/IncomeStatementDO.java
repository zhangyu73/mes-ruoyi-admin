package cn.iocoder.yudao.module.crm.dal.dataobject.incomestatement;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 利润 DO
 *
 * @author 张三
 */
@TableName("crm_income_statement")
@KeySequence("crm_income_statement_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IncomeStatementDO extends BaseDO {

    /**
     * 主键
     */
    @TableId
    private Long id;
    /**
     * 证券代码
     */
    private String stockCode;
    /**
     * 证券简称
     */
    private String shortName;
    /**
     * 统计截止日期
     */
    private String endDate;
    /**
     * 报表类型
     */
    private String reportType;
    /**
     * 单位
     */
    private String currencyUnit;
    /**
     * 营业总收入
     */
    private String totalRevenue;
    /**
     * 营业收入
     */
    private String operatingRevenue;
    /**
     * 利息净收入
     */
    private String netInterestIncome;
    /**
     * 利息收入
     */
    private String interestIncome;
    /**
     * 利息支出
     */
    private String interestExpense;
    /**
     * 已赚保费
     */
    private String earnedPremium;
    /**
     * 保险业务收入
     */
    private String insuranceRevenue;
    /**
     * 分保费收入
     */
    private String cededPremiumIncome;
    /**
     * 分出保费
     */
    private String cededPremiumOut;
    /**
     * 提取未到期责任准备金
     */
    private String unearnedPremiumReserve;
    /**
     * 手续费及佣金净收入
     */
    private String netFeeCommissionIncome;
    /**
     * 代理买卖证券业务净收入
     */
    private String netBrokerageIncome;
    /**
     * 证券承销业务净收入
     */
    private String netUnderwritingIncome;
    /**
     * 受托客户资产管理业务净收入
     */
    private String netAssetMgmtIncome;
    /**
     * 手续费及佣金支出
     */
    private String feeCommissionIncome;
    /**
     * 手续费及佣金支出
     */
    private String feeCommissionExpense;
    /**
     * 其他业务收入
     */
    private String otherOperatingIncome;
    /**
     * 营业总成本
     */
    private String totalOperatingCost;
    /**
     * 营业成本
     */
    private String operatingCost;
    /**
     * 税金及附加
     */
    private String taxesSurcharges;
    /**
     * 业务及管理费
     */
    private String adminBusinessExpense;
    /**
     * 销售费用
     */
    private String sellingExpense;
    /**
     * 管理费用
     */
    private String adminExpense;
    /**
     * 研发费用
     */
    private String rdExpense;
    /**
     * 财务费用
     */
    private String financialExpense;
    /**
     * 利息费用(财务费用)
     */
    private String interestFinExpense;
    /**
     * 利息收入(财务费用)
     */
    private String interestFinIncome;
    /**
     * 其他收益
     */
    private String otherIncome;
    /**
     * 投资收益
     */
    private String investmentIncome;
    /**
     * 对联营企业和合营企业的投资收益
     */
    private String incomeFromAssociates;
    /**
     * 以摊余成本计量的金融资产终止确认收益
     */
    private String gainFvociDerecognition;
    /**
     * 汇兑收益
     */
    private String exchangeGain;
    /**
     * 净敞口套期收益
     */
    private String netHedgingGain;
    /**
     * 公允价值变动收益
     */
    private String gainFvChange;
    /**
     * 资产减值损失
     */
    private String impairmentLossAssets;
    /**
     * 信用减值损失
     */
    private String impairmentLossCredit;
    /**
     * 资产处置收益
     */
    private String gainDisposalAssets;
    /**
     * 其他业务成本
     */
    private String otherOperatingCost;
    /**
     * 其他业务利润
     */
    private String otherOperatingProfit;
    /**
     * 营业利润
     */
    private String operatingProfit;
    /**
     * 营业外收入
     */
    private String nonOperatingIncome;
    /**
     * 非流动资产处置利得
     */
    private String gainDisposalNclAssets;
    /**
     * 营业外支出
     */
    private String nonOperatingExpense;
    /**
     * 非流动资产处置净损益
     */
    private String netDisposalNclAssets;
    /**
     * 非流动资产处置损失
     */
    private String lossDisposalNclAssets;
    /**
     * 利润总额
     */
    private String totalProfit;
    /**
     * 所得税费用
     */
    private String incomeTaxExpense;
    /**
     * 未确认的投资损失
     */
    private String unrecognizedInvestmentLoss;
    /**
     * 影响净利润的其他项目
     */
    private String otherItemsAffectNetProfit;
    /**
     * 净利润
     */
    private String netProfit;
    /**
     * 归属于母公司所有者的净利润
     */
    private String netProfitParent;
    /**
     * 归属于母公司其他权益工具持有者的净利润
     */
    private String netProfitParentOthers;
    /**
     * 少数股东损益
     */
    private String minorityInterest;
    /**
     * 基本每股收益
     */
    private String basicEps;
    /**
     * 稀释每股收益
     */
    private String dilutedEps;
    /**
     * 其他综合收益(损失)
     */
    private String otherComprehensiveIncome;
    /**
     * 综合收益总额
     */
    private String totalComprehensiveIncome;
    /**
     * 归属于母公司所有者的综合收益
     */
    private String ociParent;
    /**
     * 归属于母公司其他权益工具持有者的综合收益总额
     */
    private String ociParentOthers;
    /**
     * 归属少数股东的综合收益
     */
    private String ociMinority;
    /**
     * 公司编号
     */
    private Long companyId;


}