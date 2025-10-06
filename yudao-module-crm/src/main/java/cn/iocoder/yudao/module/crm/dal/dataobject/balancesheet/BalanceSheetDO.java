package cn.iocoder.yudao.module.crm.dal.dataobject.balancesheet;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 资产负债 DO
 *
 * @author 张三
 */
@TableName("crm_balance_sheet")
@KeySequence("crm_balance_sheet_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BalanceSheetDO extends BaseDO {

    /**
     * 主键
     */
    @TableId
    private Long id;
    /**
     * 证券代码
     */
    private String stkcd;
    /**
     * 证券简称
     */
    private String shortName;
    /**
     * 统计截止日期
     */
    private Date accper;
    /**
     * 报表类型  A=合并 B=母公司
     */
    private String typrep;
    /**
     * 是否发生差错更正 0=否 1=是
     */
    private String ifCorrect;
    /**
     * 差错更正披露日期，多日用逗号分隔
     */
    private String declareDate;
    /**
     * 货币资金
     */
    private Long monetaryFunds;
    /**
     * 其中:客户资金存款
     */
    private Long customerFundDeposits;
    /**
     * 结算备付金
     */
    private Long settlementProvision;
    /**
     * 其中：客户备付金
     */
    private Long customerProvision;
    /**
     * 现金及存放中央银行款项
     */
    private Long cashAndCentralBankDeposits;
    /**
     * 存放同业款项
     */
    private Long dueFromBanks;
    /**
     * 贵金属
     */
    private Long preciousMetals;
    /**
     * 拆出资金净额
     */
    private Long netLendingToBanks;
    /**
     * 交易性金融资产
     */
    private Long tradingFinancialAssets;
    /**
     * 衍生金融资产
     */
    private Long derivativeFinancialAssets;
    /**
     * 短期投资净额
     */
    private Long netShortTermInvestments;
    /**
     * 应收票据净额
     */
    private Long netNotesReceivable;
    /**
     * 应收账款净额
     */
    private Long netAccountsReceivable;
    /**
     * 应收款项融资
     */
    private Long receivablesFinancing;
    /**
     * 预付款项净额
     */
    private Long netPrepayments;
    /**
     * 应收保费净额
     */
    private Long netPremiumReceivable;
    /**
     * 应收分保账款净额
     */
    private Long netReinsuranceReceivable;
    /**
     * 应收代位追偿款净额
     */
    private Long netSubrogationReceivable;
    /**
     * 应收分保合同准备金净额
     */
    private Long netReinsuranceReserves;
    /**
     * 其中:应收分保未到期责任准备金净额
     */
    private Long netUnearnedPremiumReserveCeded;
    /**
     * 其中:应收分保未决赔款准备金净额
     */
    private Long netOutstandingClaimsReserveCeded;
    /**
     * 其中:应收分保寿险责任准备金净额
     */
    private Long netLifeReserveCeded;
    /**
     * 其中:应收分保长期健康险责任准备金净额
     */
    private Long netLhReserveCeded;
    /**
     * 应收利息净额
     */
    private Long netInterestReceivable;
    /**
     * 应收股利净额
     */
    private Long netDividendReceivable;
    /**
     * 其他应收款净额
     */
    private Long netOtherReceivables;
    /**
     * 买入返售金融资产净额
     */
    private Long netReverseRepo;
    /**
     * 存货净额
     */
    private Long netInventories;
    /**
     * 合同资产
     */
    private Long contractAssets;
    /**
     * 一年内到期的非流动资产
     */
    private Long nonCurrentAssetsDueWithinOneYear;
    /**
     * 存出保证金
     */
    private Long guaranteeDepositPaid;
    /**
     * 其他流动资产
     */
    private Long otherCurrentAssets;
    /**
     * 流动资产合计
     */
    private Long totalCurrentAssets;
    /**
     * 保户质押贷款净额
     */
    private Long netPolicyLoans;
    /**
     * 定期存款
     */
    private Long timeDeposits;
    /**
     * 发放贷款及垫款净额
     */
    private Long netLoansAndAdvances;
    /**
     * 债权投资
     */
    private Long debtInvestments;
    /**
     * 可供出售金融资产净额
     */
    private Long netAvailableForSaleFvoci;
    /**
     * 其他债权投资
     */
    private Long otherDebtInvestments;
    /**
     * 持有至到期投资净额
     */
    private Long netHeldToMaturity;
    /**
     * 长期应收款净额
     */
    private Long netLongTermReceivables;
    /**
     * 长期股权投资净额
     */
    private Long netLongTermEquityInvestment;
    /**
     * 其他权益工具投资
     */
    private Long otherEquityInstrumentsInvest;
    /**
     * 其他非流动金融资产
     */
    private Long otherNonCurrentFinAssets;
    /**
     * 长期债权投资净额
     */
    private Long netLongTermDebtInvestment;
    /**
     * 长期投资净额
     */
    private Long netLongTermInvestment;
    /**
     * 存出资本保证金
     */
    private Long capitalDepositPaid;
    /**
     * 独立账户资产
     */
    private Long separateAccountAssets;
    /**
     * 投资性房地产净额
     */
    private Long netInvestmentProperty;
    /**
     * 固定资产净额
     */
    private Long netFixedAssets;
    /**
     * 在建工程净额
     */
    private Long netConstructionInProgress;
    /**
     * 工程物资
     */
    private Long constructionMaterials;
    /**
     * 固定资产清理
     */
    private Long fixedAssetsPendingDisposal;
    /**
     * 生产性生物资产净额
     */
    private Long netProductiveBiologicalAssets;
    /**
     * 油气资产净额
     */
    private Long netOilAndGasAssets;
    /**
     * 使用权资产
     */
    private Long rightOfUseAssets;
    /**
     * 无形资产净额
     */
    private Long netIntangibleAssets;
    /**
     * 其中:交易席位费
     */
    private Long tradingSeatFees;
    /**
     * 开发支出
     */
    private Long developmentExpenditure;
    /**
     * 商誉净额
     */
    private Long netGoodwill;
    /**
     * 长期待摊费用
     */
    private Long longTermDeferredExpenses;
    /**
     * 递延所得税资产
     */
    private Long deferredTaxAssets;
    /**
     * 代理业务资产
     */
    private Long agencyBusinessAssets;
    /**
     * 其他非流动资产
     */
    private Long otherNonCurrentAssets;
    /**
     * 非流动资产合计
     */
    private Long totalNonCurrentAssets;
    /**
     * 其他资产
     */
    private Long otherAssets;
    /**
     * 资产总计
     */
    private Long totalAssets;
    /**
     * 短期借款
     */
    private Long shortTermBorrowings;
    /**
     * 其中:质押借款
     */
    private Long pledgedBorrowings;
    /**
     * 向中央银行借款
     */
    private Long borrowingFromCentralBank;
    /**
     * 吸收存款及同业存放
     */
    private Long depositsFromBanksAndFinancialInstitutions;
    /**
     * 其中：同业及其他金融机构存放款项
     */
    private Long dueToOtherFinancialInstitutions;
    /**
     * 其中：吸收存款
     */
    private Long customerDeposits;
    /**
     * 拆入资金
     */
    private Long borrowingFromBanks;
    /**
     * 交易性金融负债
     */
    private Long tradingFinancialLiabilities;
    /**
     * 衍生金融负债
     */
    private Long derivativeFinancialLiabilities;
    /**
     * 应付票据
     */
    private Long notesPayable;
    /**
     * 应付账款
     */
    private Long accountsPayable;
    /**
     * 预收款项
     */
    private Long advancesFromCustomers;
    /**
     * 合同负债
     */
    private Long contractLiabilities;
    /**
     * 卖出回购金融资产款
     */
    private Long repurchaseAgreementsPayable;
    /**
     * 应付手续费及佣金
     */
    private Long feesAndCommissionsPayable;
    /**
     * 应付职工薪酬
     */
    private Long employeeBenefitsPayable;
    /**
     * 应交税费
     */
    private Long taxesPayable;
    /**
     * 应付利息
     */
    private Long interestPayable;
    /**
     * 应付股利
     */
    private Long dividendsPayable;
    /**
     * 应付赔付款
     */
    private Long claimsPayable;
    /**
     * 应付保单红利
     */
    private Long policyholderDividendsPayable;
    /**
     * 保户储金及投资款
     */
    private Long policyholderDepositsAndInvestmentFunds;
    /**
     * 保险合同准备金
     */
    private Long insuranceContractReserves;
    /**
     * 其中:未到期责任准备金
     */
    private Long unearnedPremiumReserve;
    /**
     * 其中:未决赔款准备金
     */
    private Long outstandingClaimsReserve;
    /**
     * 其中:寿险责任准备金
     */
    private Long lifeInsuranceReserve;
    /**
     * 其中:长期健康险责任准备金
     */
    private Long longTermHealthInsuranceReserve;
    /**
     * 其他应付款
     */
    private Long otherPayables;
    /**
     * 应付分保账款
     */
    private Long reinsurancePayables;
    /**
     * 代理买卖证券款
     */
    private Long agencySecuritiesTradingPayables;
    /**
     * 代理承销证券款
     */
    private Long agencySecuritiesUnderwritingPayables;
    /**
     * 预收保费
     */
    private Long premiumReceivedInAdvance;
    /**
     * 一年内到期的非流动负债
     */
    private Long nonCurrentLiabilitiesDueWithinOneYear;
    /**
     * 其他流动负债
     */
    private Long otherCurrentLiabilities;
    /**
     * 递延收益-流动负债
     */
    private Long deferredRevenueCurrent;
    /**
     * 流动负债合计
     */
    private Long totalCurrentLiabilities;
    /**
     * 长期借款
     */
    private Long longTermBorrowings;
    /**
     * 独立账户负债
     */
    private Long separateAccountLiabilities;
    /**
     * 应付债券
     */
    private Long bondsPayable;
    /**
     * 租赁负债
     */
    private Long leaseLiabilities;
    /**
     * 长期应付款
     */
    private Long longTermPayables;
    /**
     * 专项应付款
     */
    private Long specialPayables;
    /**
     * 长期负债合计
     */
    private Long totalLongTermLiabilities;
    /**
     * 预计负债
     */
    private Long provisions;
    /**
     * 代理业务负债
     */
    private Long agencyBusinessLiabilities;
    /**
     * 递延所得税负债
     */
    private Long deferredTaxLiabilities;
    /**
     * 其他非流动负债
     */
    private Long otherNonCurrentLiabilities;
    /**
     * 递延收益-非流动负债
     */
    private Long deferredRevenueNonCurrent;
    /**
     * 非流动负债合计
     */
    private Long totalNonCurrentLiabilities;
    /**
     * 其他负债
     */
    private Long otherLiabilities;
    /**
     * 负债合计
     */
    private Long totalLiabilities;
    /**
     * 实收资本(或股本)
     */
    private Long paidInCapital;
    /**
     * 其他权益工具
     */
    private Long otherEquityInstruments;
    /**
     * 其中：优先股
     */
    private Long preferredShares;
    /**
     * 其中：永续债
     */
    private Long perpetualBonds;
    /**
     * 其中：其他
     */
    private Long otherEquityInstrumentsOthers;
    /**
     * 资本公积
     */
    private Long capitalReserve;
    /**
     * 其中：库存股
     */
    private Long treasuryShares;
    /**
     * 盈余公积
     */
    private Long surplusReserve;
    /**
     * 一般风险准备
     */
    private String a0f3104000;
    /**
     * 一般风险准备
     */
    private Long generalRiskReserve;
    /**
     * 未分配利润
     */
    private Long retainedEarnings;
    /**
     * 外币报表折算差额
     */
    private Long foreignCurrencyTranslationReserve;
    /**
     * 加：未确认的投资损失
     */
    private Long unrecognizedInvestmentLoss;
    /**
     * 交易风险准备
     */
    private Long tradingRiskReserve;
    /**
     * 专项储备
     */
    private Long specialReserve;
    /**
     * 其他综合收益
     */
    private Long otherComprehensiveIncome;
    /**
     * 归属于母公司所有者权益合计
     */
    private Long totalEquityAttributableToParent;
    /**
     * 少数股东权益
     */
    private Long minorityInterests;
    /**
     * 所有者权益合计
     */
    private Long totalEquity;
    /**
     * 公司编号
     */
    private Long companyId;


}
