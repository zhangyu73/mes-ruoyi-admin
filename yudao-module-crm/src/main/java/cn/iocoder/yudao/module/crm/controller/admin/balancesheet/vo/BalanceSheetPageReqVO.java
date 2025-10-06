package cn.iocoder.yudao.module.crm.controller.admin.balancesheet.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 资产负债分页 Request VO")
@Data
public class BalanceSheetPageReqVO extends PageParam {

    @Schema(description = "证券代码")
    private String stkcd;

    @Schema(description = "证券简称", example = "王五")
    private String shortName;

    @Schema(description = "统计截止日期")
    private Date accper;

    @Schema(description = "报表类型  A=合并 B=母公司")
    private String typrep;

    @Schema(description = "应付账款")
    private Long accountsPayable;

    @Schema(description = "合同负债")
    private Long contractLiabilities;

    @Schema(description = "卖出回购金融资产款")
    private Long repurchaseAgreementsPayable;

    @Schema(description = "应付手续费及佣金")
    private Long feesAndCommissionsPayable;

    @Schema(description = "应付职工薪酬")
    private Long employeeBenefitsPayable;

    @Schema(description = "应交税费")
    private Long taxesPayable;

    @Schema(description = "应付利息")
    private Long interestPayable;

    @Schema(description = "应付股利")
    private Long dividendsPayable;

    @Schema(description = "应付赔付款")
    private Long claimsPayable;

    @Schema(description = "应付保单红利")
    private Long policyholderDividendsPayable;

    @Schema(description = "保户储金及投资款")
    private Long policyholderDepositsAndInvestmentFunds;

    @Schema(description = "保险合同准备金")
    private Long insuranceContractReserves;

    @Schema(description = "其中:未到期责任准备金")
    private Long unearnedPremiumReserve;

    @Schema(description = "其中:未决赔款准备金")
    private Long outstandingClaimsReserve;

    @Schema(description = "其中:寿险责任准备金")
    private Long lifeInsuranceReserve;

    @Schema(description = "其中:长期健康险责任准备金")
    private Long longTermHealthInsuranceReserve;

    @Schema(description = "其他应付款")
    private Long otherPayables;

    @Schema(description = "应付分保账款")
    private Long reinsurancePayables;

    @Schema(description = "代理买卖证券款")
    private Long agencySecuritiesTradingPayables;

    @Schema(description = "代理承销证券款")
    private Long agencySecuritiesUnderwritingPayables;

    @Schema(description = "预收保费")
    private Long premiumReceivedInAdvance;

    @Schema(description = "一年内到期的非流动负债")
    private Long nonCurrentLiabilitiesDueWithinOneYear;

    @Schema(description = "其他流动负债")
    private Long otherCurrentLiabilities;

    @Schema(description = "递延收益-流动负债")
    private Long deferredRevenueCurrent;

    @Schema(description = "流动负债合计")
    private Long totalCurrentLiabilities;

    @Schema(description = "长期借款")
    private Long longTermBorrowings;

    @Schema(description = "独立账户负债")
    private Long separateAccountLiabilities;

    @Schema(description = "应付债券")
    private Long bondsPayable;

    @Schema(description = "租赁负债")
    private Long leaseLiabilities;

    @Schema(description = "长期应付款")
    private Long longTermPayables;

    @Schema(description = "专项应付款")
    private Long specialPayables;

    @Schema(description = "长期负债合计")
    private Long totalLongTermLiabilities;

    @Schema(description = "预计负债")
    private Long provisions;

    @Schema(description = "代理业务负债")
    private Long agencyBusinessLiabilities;

    @Schema(description = "递延所得税负债")
    private Long deferredTaxLiabilities;

    @Schema(description = "其他非流动负债")
    private Long otherNonCurrentLiabilities;

    @Schema(description = "递延收益-非流动负债")
    private Long deferredRevenueNonCurrent;

    @Schema(description = "非流动负债合计")
    private Long totalNonCurrentLiabilities;

    @Schema(description = "其他负债")
    private Long otherLiabilities;

    @Schema(description = "负债合计")
    private Long totalLiabilities;

    @Schema(description = "实收资本(或股本)")
    private Long paidInCapital;

    @Schema(description = "其他权益工具")
    private Long otherEquityInstruments;

    @Schema(description = "其中：优先股")
    private Long preferredShares;

    @Schema(description = "其中：永续债")
    private Long perpetualBonds;

    @Schema(description = "其中：其他")
    private Long otherEquityInstrumentsOthers;

    @Schema(description = "资本公积")
    private Long capitalReserve;

    @Schema(description = "其中：库存股")
    private Long treasuryShares;

    @Schema(description = "盈余公积")
    private Long surplusReserve;

    @Schema(description = "一般风险准备")
    private String a0f3104000;

    @Schema(description = "一般风险准备")
    private Long generalRiskReserve;

    @Schema(description = "未分配利润")
    private Long retainedEarnings;

    @Schema(description = "外币报表折算差额")
    private Long foreignCurrencyTranslationReserve;

    @Schema(description = "加：未确认的投资损失")
    private Long unrecognizedInvestmentLoss;

    @Schema(description = "交易风险准备")
    private Long tradingRiskReserve;

    @Schema(description = "专项储备")
    private Long specialReserve;

    @Schema(description = "其他综合收益")
    private Long otherComprehensiveIncome;

    @Schema(description = "归属于母公司所有者权益合计")
    private Long totalEquityAttributableToParent;

    @Schema(description = "少数股东权益")
    private Long minorityInterests;

    @Schema(description = "所有者权益合计")
    private Long totalEquity;

    @Schema(description = "公司编号", example = "20872")
    private Long companyId;

}