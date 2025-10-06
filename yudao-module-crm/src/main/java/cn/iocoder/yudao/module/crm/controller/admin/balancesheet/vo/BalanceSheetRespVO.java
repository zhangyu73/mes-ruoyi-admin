package cn.iocoder.yudao.module.crm.controller.admin.balancesheet.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 资产负债 Response VO")
@Data
@ExcelIgnoreUnannotated
public class BalanceSheetRespVO {

    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "29140")
    @ExcelProperty("主键")
    private Long id;

    @Schema(description = "证券代码")
    @ExcelProperty("证券代码")
    private String stkcd;

    @Schema(description = "证券简称", example = "王五")
    @ExcelProperty("证券简称")
    private String shortName;

    @Schema(description = "统计截止日期")
    @ExcelProperty("统计截止日期")
    private Date accper;

    @Schema(description = "报表类型  A=合并 B=母公司")
    @ExcelProperty("报表类型  A=合并 B=母公司")
    private String typrep;

    @Schema(description = "是否发生差错更正 0=否 1=是")
    @ExcelProperty("是否发生差错更正 0=否 1=是")
    private String ifCorrect;

    @Schema(description = "差错更正披露日期，多日用逗号分隔")
    @ExcelProperty("差错更正披露日期，多日用逗号分隔")
    private String declareDate;

    @Schema(description = "货币资金")
    @ExcelProperty("货币资金")
    private Long monetaryFunds;

    @Schema(description = "其中:客户资金存款")
    @ExcelProperty("其中:客户资金存款")
    private Long customerFundDeposits;

    @Schema(description = "结算备付金")
    @ExcelProperty("结算备付金")
    private Long settlementProvision;

    @Schema(description = "其中：客户备付金")
    @ExcelProperty("其中：客户备付金")
    private Long customerProvision;

    @Schema(description = "现金及存放中央银行款项")
    @ExcelProperty("现金及存放中央银行款项")
    private Long cashAndCentralBankDeposits;

    @Schema(description = "存放同业款项")
    @ExcelProperty("存放同业款项")
    private Long dueFromBanks;

    @Schema(description = "贵金属")
    @ExcelProperty("贵金属")
    private Long preciousMetals;

    @Schema(description = "拆出资金净额")
    @ExcelProperty("拆出资金净额")
    private Long netLendingToBanks;

    @Schema(description = "交易性金融资产")
    @ExcelProperty("交易性金融资产")
    private Long tradingFinancialAssets;

    @Schema(description = "衍生金融资产")
    @ExcelProperty("衍生金融资产")
    private Long derivativeFinancialAssets;

    @Schema(description = "短期投资净额")
    @ExcelProperty("短期投资净额")
    private Long netShortTermInvestments;

    @Schema(description = "应收票据净额")
    @ExcelProperty("应收票据净额")
    private Long netNotesReceivable;

    @Schema(description = "应收账款净额")
    @ExcelProperty("应收账款净额")
    private Long netAccountsReceivable;

    @Schema(description = "应收款项融资")
    @ExcelProperty("应收款项融资")
    private Long receivablesFinancing;

    @Schema(description = "预付款项净额")
    @ExcelProperty("预付款项净额")
    private Long netPrepayments;

    @Schema(description = "应收保费净额")
    @ExcelProperty("应收保费净额")
    private Long netPremiumReceivable;

    @Schema(description = "应收分保账款净额")
    @ExcelProperty("应收分保账款净额")
    private Long netReinsuranceReceivable;

    @Schema(description = "应收代位追偿款净额")
    @ExcelProperty("应收代位追偿款净额")
    private Long netSubrogationReceivable;

    @Schema(description = "应收分保合同准备金净额")
    @ExcelProperty("应收分保合同准备金净额")
    private Long netReinsuranceReserves;

    @Schema(description = "其中:应收分保未到期责任准备金净额")
    @ExcelProperty("其中:应收分保未到期责任准备金净额")
    private Long netUnearnedPremiumReserveCeded;

    @Schema(description = "其中:应收分保未决赔款准备金净额")
    @ExcelProperty("其中:应收分保未决赔款准备金净额")
    private Long netOutstandingClaimsReserveCeded;

    @Schema(description = "其中:应收分保寿险责任准备金净额")
    @ExcelProperty("其中:应收分保寿险责任准备金净额")
    private Long netLifeReserveCeded;

    @Schema(description = "其中:应收分保长期健康险责任准备金净额")
    @ExcelProperty("其中:应收分保长期健康险责任准备金净额")
    private Long netLhReserveCeded;

    @Schema(description = "应收利息净额")
    @ExcelProperty("应收利息净额")
    private Long netInterestReceivable;

    @Schema(description = "应收股利净额")
    @ExcelProperty("应收股利净额")
    private Long netDividendReceivable;

    @Schema(description = "其他应收款净额")
    @ExcelProperty("其他应收款净额")
    private Long netOtherReceivables;

    @Schema(description = "买入返售金融资产净额")
    @ExcelProperty("买入返售金融资产净额")
    private Long netReverseRepo;

    @Schema(description = "存货净额")
    @ExcelProperty("存货净额")
    private Long netInventories;

    @Schema(description = "合同资产")
    @ExcelProperty("合同资产")
    private Long contractAssets;

    @Schema(description = "一年内到期的非流动资产")
    @ExcelProperty("一年内到期的非流动资产")
    private Long nonCurrentAssetsDueWithinOneYear;

    @Schema(description = "存出保证金", example = "15398")
    @ExcelProperty("存出保证金")
    private Long guaranteeDepositPaid;

    @Schema(description = "其他流动资产")
    @ExcelProperty("其他流动资产")
    private Long otherCurrentAssets;

    @Schema(description = "流动资产合计")
    @ExcelProperty("流动资产合计")
    private Long totalCurrentAssets;

    @Schema(description = "保户质押贷款净额")
    @ExcelProperty("保户质押贷款净额")
    private Long netPolicyLoans;

    @Schema(description = "定期存款")
    @ExcelProperty("定期存款")
    private Long timeDeposits;

    @Schema(description = "发放贷款及垫款净额")
    @ExcelProperty("发放贷款及垫款净额")
    private Long netLoansAndAdvances;

    @Schema(description = "债权投资")
    @ExcelProperty("债权投资")
    private Long debtInvestments;

    @Schema(description = "可供出售金融资产净额")
    @ExcelProperty("可供出售金融资产净额")
    private Long netAvailableForSaleFvoci;

    @Schema(description = "其他债权投资")
    @ExcelProperty("其他债权投资")
    private Long otherDebtInvestments;

    @Schema(description = "持有至到期投资净额")
    @ExcelProperty("持有至到期投资净额")
    private Long netHeldToMaturity;

    @Schema(description = "长期应收款净额")
    @ExcelProperty("长期应收款净额")
    private Long netLongTermReceivables;

    @Schema(description = "长期股权投资净额")
    @ExcelProperty("长期股权投资净额")
    private Long netLongTermEquityInvestment;

    @Schema(description = "其他权益工具投资")
    @ExcelProperty("其他权益工具投资")
    private Long otherEquityInstrumentsInvest;

    @Schema(description = "其他非流动金融资产")
    @ExcelProperty("其他非流动金融资产")
    private Long otherNonCurrentFinAssets;

    @Schema(description = "长期债权投资净额")
    @ExcelProperty("长期债权投资净额")
    private Long netLongTermDebtInvestment;

    @Schema(description = "长期投资净额")
    @ExcelProperty("长期投资净额")
    private Long netLongTermInvestment;

    @Schema(description = "存出资本保证金", example = "1243")
    @ExcelProperty("存出资本保证金")
    private Long capitalDepositPaid;

    @Schema(description = "独立账户资产")
    @ExcelProperty("独立账户资产")
    private Long separateAccountAssets;

    @Schema(description = "投资性房地产净额")
    @ExcelProperty("投资性房地产净额")
    private Long netInvestmentProperty;

    @Schema(description = "固定资产净额")
    @ExcelProperty("固定资产净额")
    private Long netFixedAssets;

    @Schema(description = "在建工程净额")
    @ExcelProperty("在建工程净额")
    private Long netConstructionInProgress;

    @Schema(description = "工程物资")
    @ExcelProperty("工程物资")
    private Long constructionMaterials;

    @Schema(description = "固定资产清理")
    @ExcelProperty("固定资产清理")
    private Long fixedAssetsPendingDisposal;

    @Schema(description = "生产性生物资产净额")
    @ExcelProperty("生产性生物资产净额")
    private Long netProductiveBiologicalAssets;

    @Schema(description = "油气资产净额")
    @ExcelProperty("油气资产净额")
    private Long netOilAndGasAssets;

    @Schema(description = "使用权资产")
    @ExcelProperty("使用权资产")
    private Long rightOfUseAssets;

    @Schema(description = "无形资产净额")
    @ExcelProperty("无形资产净额")
    private Long netIntangibleAssets;

    @Schema(description = "其中:交易席位费")
    @ExcelProperty("其中:交易席位费")
    private Long tradingSeatFees;

    @Schema(description = "开发支出")
    @ExcelProperty("开发支出")
    private Long developmentExpenditure;

    @Schema(description = "商誉净额")
    @ExcelProperty("商誉净额")
    private Long netGoodwill;

    @Schema(description = "长期待摊费用")
    @ExcelProperty("长期待摊费用")
    private Long longTermDeferredExpenses;

    @Schema(description = "递延所得税资产")
    @ExcelProperty("递延所得税资产")
    private Long deferredTaxAssets;

    @Schema(description = "代理业务资产")
    @ExcelProperty("代理业务资产")
    private Long agencyBusinessAssets;

    @Schema(description = "其他非流动资产")
    @ExcelProperty("其他非流动资产")
    private Long otherNonCurrentAssets;

    @Schema(description = "非流动资产合计")
    @ExcelProperty("非流动资产合计")
    private Long totalNonCurrentAssets;

    @Schema(description = "其他资产")
    @ExcelProperty("其他资产")
    private Long otherAssets;

    @Schema(description = "资产总计")
    @ExcelProperty("资产总计")
    private Long totalAssets;

    @Schema(description = "短期借款")
    @ExcelProperty("短期借款")
    private Long shortTermBorrowings;

    @Schema(description = "其中:质押借款")
    @ExcelProperty("其中:质押借款")
    private Long pledgedBorrowings;

    @Schema(description = "向中央银行借款")
    @ExcelProperty("向中央银行借款")
    private Long borrowingFromCentralBank;

    @Schema(description = "吸收存款及同业存放")
    @ExcelProperty("吸收存款及同业存放")
    private Long depositsFromBanksAndFinancialInstitutions;

    @Schema(description = "其中：同业及其他金融机构存放款项")
    @ExcelProperty("其中：同业及其他金融机构存放款项")
    private Long dueToOtherFinancialInstitutions;

    @Schema(description = "其中：吸收存款")
    @ExcelProperty("其中：吸收存款")
    private Long customerDeposits;

    @Schema(description = "拆入资金")
    @ExcelProperty("拆入资金")
    private Long borrowingFromBanks;

    @Schema(description = "交易性金融负债")
    @ExcelProperty("交易性金融负债")
    private Long tradingFinancialLiabilities;

    @Schema(description = "衍生金融负债")
    @ExcelProperty("衍生金融负债")
    private Long derivativeFinancialLiabilities;

    @Schema(description = "应付票据")
    @ExcelProperty("应付票据")
    private Long notesPayable;

    @Schema(description = "应付账款")
    @ExcelProperty("应付账款")
    private Long accountsPayable;

    @Schema(description = "预收款项")
    @ExcelProperty("预收款项")
    private Long advancesFromCustomers;

    @Schema(description = "合同负债")
    @ExcelProperty("合同负债")
    private Long contractLiabilities;

    @Schema(description = "卖出回购金融资产款")
    @ExcelProperty("卖出回购金融资产款")
    private Long repurchaseAgreementsPayable;

    @Schema(description = "应付手续费及佣金")
    @ExcelProperty("应付手续费及佣金")
    private Long feesAndCommissionsPayable;

    @Schema(description = "应付职工薪酬")
    @ExcelProperty("应付职工薪酬")
    private Long employeeBenefitsPayable;

    @Schema(description = "应交税费")
    @ExcelProperty("应交税费")
    private Long taxesPayable;

    @Schema(description = "应付利息")
    @ExcelProperty("应付利息")
    private Long interestPayable;

    @Schema(description = "应付股利")
    @ExcelProperty("应付股利")
    private Long dividendsPayable;

    @Schema(description = "应付赔付款")
    @ExcelProperty("应付赔付款")
    private Long claimsPayable;

    @Schema(description = "应付保单红利")
    @ExcelProperty("应付保单红利")
    private Long policyholderDividendsPayable;

    @Schema(description = "保户储金及投资款")
    @ExcelProperty("保户储金及投资款")
    private Long policyholderDepositsAndInvestmentFunds;

    @Schema(description = "保险合同准备金")
    @ExcelProperty("保险合同准备金")
    private Long insuranceContractReserves;

    @Schema(description = "其中:未到期责任准备金")
    @ExcelProperty("其中:未到期责任准备金")
    private Long unearnedPremiumReserve;

    @Schema(description = "其中:未决赔款准备金")
    @ExcelProperty("其中:未决赔款准备金")
    private Long outstandingClaimsReserve;

    @Schema(description = "其中:寿险责任准备金")
    @ExcelProperty("其中:寿险责任准备金")
    private Long lifeInsuranceReserve;

    @Schema(description = "其中:长期健康险责任准备金")
    @ExcelProperty("其中:长期健康险责任准备金")
    private Long longTermHealthInsuranceReserve;

    @Schema(description = "其他应付款")
    @ExcelProperty("其他应付款")
    private Long otherPayables;

    @Schema(description = "应付分保账款")
    @ExcelProperty("应付分保账款")
    private Long reinsurancePayables;

    @Schema(description = "代理买卖证券款")
    @ExcelProperty("代理买卖证券款")
    private Long agencySecuritiesTradingPayables;

    @Schema(description = "代理承销证券款")
    @ExcelProperty("代理承销证券款")
    private Long agencySecuritiesUnderwritingPayables;

    @Schema(description = "预收保费")
    @ExcelProperty("预收保费")
    private Long premiumReceivedInAdvance;

    @Schema(description = "一年内到期的非流动负债")
    @ExcelProperty("一年内到期的非流动负债")
    private Long nonCurrentLiabilitiesDueWithinOneYear;

    @Schema(description = "其他流动负债")
    @ExcelProperty("其他流动负债")
    private Long otherCurrentLiabilities;

    @Schema(description = "递延收益-流动负债")
    @ExcelProperty("递延收益-流动负债")
    private Long deferredRevenueCurrent;

    @Schema(description = "流动负债合计")
    @ExcelProperty("流动负债合计")
    private Long totalCurrentLiabilities;

    @Schema(description = "长期借款")
    @ExcelProperty("长期借款")
    private Long longTermBorrowings;

    @Schema(description = "独立账户负债")
    @ExcelProperty("独立账户负债")
    private Long separateAccountLiabilities;

    @Schema(description = "应付债券")
    @ExcelProperty("应付债券")
    private Long bondsPayable;

    @Schema(description = "租赁负债")
    @ExcelProperty("租赁负债")
    private Long leaseLiabilities;

    @Schema(description = "长期应付款")
    @ExcelProperty("长期应付款")
    private Long longTermPayables;

    @Schema(description = "专项应付款")
    @ExcelProperty("专项应付款")
    private Long specialPayables;

    @Schema(description = "长期负债合计")
    @ExcelProperty("长期负债合计")
    private Long totalLongTermLiabilities;

    @Schema(description = "预计负债")
    @ExcelProperty("预计负债")
    private Long provisions;

    @Schema(description = "代理业务负债")
    @ExcelProperty("代理业务负债")
    private Long agencyBusinessLiabilities;

    @Schema(description = "递延所得税负债")
    @ExcelProperty("递延所得税负债")
    private Long deferredTaxLiabilities;

    @Schema(description = "其他非流动负债")
    @ExcelProperty("其他非流动负债")
    private Long otherNonCurrentLiabilities;

    @Schema(description = "递延收益-非流动负债")
    @ExcelProperty("递延收益-非流动负债")
    private Long deferredRevenueNonCurrent;

    @Schema(description = "非流动负债合计")
    @ExcelProperty("非流动负债合计")
    private Long totalNonCurrentLiabilities;

    @Schema(description = "其他负债")
    @ExcelProperty("其他负债")
    private Long otherLiabilities;

    @Schema(description = "负债合计")
    @ExcelProperty("负债合计")
    private Long totalLiabilities;

    @Schema(description = "实收资本(或股本)")
    @ExcelProperty("实收资本(或股本)")
    private Long paidInCapital;

    @Schema(description = "其他权益工具")
    @ExcelProperty("其他权益工具")
    private Long otherEquityInstruments;

    @Schema(description = "其中：优先股")
    @ExcelProperty("其中：优先股")
    private Long preferredShares;

    @Schema(description = "其中：永续债")
    @ExcelProperty("其中：永续债")
    private Long perpetualBonds;

    @Schema(description = "其中：其他")
    @ExcelProperty("其中：其他")
    private Long otherEquityInstrumentsOthers;

    @Schema(description = "资本公积")
    @ExcelProperty("资本公积")
    private Long capitalReserve;

    @Schema(description = "其中：库存股")
    @ExcelProperty("其中：库存股")
    private Long treasuryShares;

    @Schema(description = "盈余公积")
    @ExcelProperty("盈余公积")
    private Long surplusReserve;

    @Schema(description = "一般风险准备")
    @ExcelProperty("一般风险准备")
    private String a0f3104000;

    @Schema(description = "一般风险准备")
    @ExcelProperty("一般风险准备")
    private Long generalRiskReserve;

    @Schema(description = "未分配利润")
    @ExcelProperty("未分配利润")
    private Long retainedEarnings;

    @Schema(description = "外币报表折算差额")
    @ExcelProperty("外币报表折算差额")
    private Long foreignCurrencyTranslationReserve;

    @Schema(description = "加：未确认的投资损失")
    @ExcelProperty("加：未确认的投资损失")
    private Long unrecognizedInvestmentLoss;

    @Schema(description = "交易风险准备")
    @ExcelProperty("交易风险准备")
    private Long tradingRiskReserve;

    @Schema(description = "专项储备")
    @ExcelProperty("专项储备")
    private Long specialReserve;

    @Schema(description = "其他综合收益")
    @ExcelProperty("其他综合收益")
    private Long otherComprehensiveIncome;

    @Schema(description = "归属于母公司所有者权益合计")
    @ExcelProperty("归属于母公司所有者权益合计")
    private Long totalEquityAttributableToParent;

    @Schema(description = "少数股东权益")
    @ExcelProperty("少数股东权益")
    private Long minorityInterests;

    @Schema(description = "所有者权益合计")
    @ExcelProperty("所有者权益合计")
    private Long totalEquity;

    @Schema(description = "公司编号", example = "20872")
    @ExcelProperty("公司编号")
    private Long companyId;

}
