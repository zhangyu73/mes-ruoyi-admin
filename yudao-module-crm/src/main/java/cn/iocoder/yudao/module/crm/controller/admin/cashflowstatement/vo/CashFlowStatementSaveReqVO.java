package cn.iocoder.yudao.module.crm.controller.admin.cashflowstatement.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 现金流量新增/修改 Request VO")
@Data
public class CashFlowStatementSaveReqVO {

    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "10018")
    private Long id;

    @Schema(description = "证券代码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "证券代码不能为空")
    private String stockCode;

    @Schema(description = "证券简称", example = "王五")
    private String shortName;

    @Schema(description = "统计截止日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "统计截止日期不能为空")
    private Date endDate;

    @Schema(description = "报表类型（A=年报，Q1=一季报，H=半年报，Q3=三季报）", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotEmpty(message = "报表类型（A=年报，Q1=一季报，H=半年报，Q3=三季报）不能为空")
    private String reportType;

    @Schema(description = "是否发生差错更正（1=是，0=否）")
    private Boolean isCorrected;

    @Schema(description = "差错更正披露日期")
    private Date correctDeclareDate;

    @Schema(description = "销售商品、提供劳务收到的现金")
    private BigDecimal cashFromSales;

    @Schema(description = "客户存款和同业存放款项净增加额")
    private BigDecimal netIncrCustomerDeposits;

    @Schema(description = "存放央行和同业款项净减少额")
    private BigDecimal netDecrDepositsCentralBank;

    @Schema(description = "向中央银行借款净增加额")
    private BigDecimal netIncrBorrowCentralBank;

    @Schema(description = "向其他金融机构拆入资金净增加额")
    private BigDecimal netIncrFiBorrowings;

    @Schema(description = "收到原保险合同保费取得的现金")
    private BigDecimal cashPremiumsOriginal;

    @Schema(description = "收到再保险业务现金净额")
    private BigDecimal netCashReinsurance;

    @Schema(description = "保户储金及投资款净增加额")
    private BigDecimal netIncrPolicyholderFunds;

    @Schema(description = "处置交易性金融资产净增加额")
    private BigDecimal netIncrTradingAssets;

    @Schema(description = "收取利息、手续费及佣金的现金")
    private BigDecimal cashInterestFees;

    @Schema(description = "拆入资金净增加额")
    private BigDecimal netIncrFundsBorrowed;

    @Schema(description = "回购业务资金净增加额")
    private BigDecimal netIncrRepoBusiness;

    @Schema(description = "拆出资金净减少额")
    private BigDecimal netDecrLendingFi;

    @Schema(description = "买入返售款项净减少额")
    private BigDecimal netDecrReverseRepo;

    @Schema(description = "收到的税费返还")
    private BigDecimal taxRefundsReceived;

    @Schema(description = "收到的其他与经营活动有关的现金")
    private BigDecimal otherOperatingInflows;

    @Schema(description = "经营活动现金流入小计")
    private BigDecimal totalOperatingInflows;

    @Schema(description = "购买商品、接受劳务支付的现金")
    private BigDecimal cashPaidGoodsServices;

    @Schema(description = "客户贷款及垫款净增加额")
    private BigDecimal netIncrLoansCustomers;

    @Schema(description = "向中央银行借款净减少额")
    private BigDecimal netDecrBorrowCentralBank;

    @Schema(description = "存放中央银行和同业款项净增加额")
    private BigDecimal netIncrDepositsCentralFi;

    @Schema(description = "支付原保险合同赔付款项的现金")
    private BigDecimal cashInsuranceClaims;

    @Schema(description = "支付利息、手续费及佣金的现金", example = "18635")
    private BigDecimal cashInterestFeesPaid;

    @Schema(description = "支付再保业务现金净额")
    private BigDecimal netCashReinsuranceOut;

    @Schema(description = "保户储金及投资款净减少额")
    private BigDecimal netDecrPolicyholderFunds;

    @Schema(description = "拆出资金净增加额")
    private BigDecimal netIncrLendingFi;

    @Schema(description = "买入返售款项净增加额")
    private BigDecimal netIncrReverseRepo;

    @Schema(description = "拆入资金净减少额")
    private BigDecimal netDecrBorrowedFunds;

    @Schema(description = "卖出回购款项净减少额")
    private BigDecimal netDecrRepoPayables;

    @Schema(description = "支付保单红利的现金", example = "23963")
    private BigDecimal dividendsPolicyholdersPaid;

    @Schema(description = "支付给职工以及为职工支付的现金")
    private BigDecimal cashPaidEmployees;

    @Schema(description = "支付的各项税费", example = "27574")
    private BigDecimal taxesPaid;

    @Schema(description = "支付其他与经营活动有关的现金")
    private BigDecimal otherOperatingOutflows;

    @Schema(description = "经营活动现金流出小计")
    private BigDecimal totalOperatingOutflows;

    @Schema(description = "经营活动产生的现金流量净额")
    private BigDecimal netCashOperating;

    @Schema(description = "收回投资收到的现金")
    private BigDecimal cashDisposalInvestments;

    @Schema(description = "取得投资收益收到的现金")
    private BigDecimal cashInvestmentIncome;

    @Schema(description = "处置固定资产、无形资产和其他长期资产收回的现金净额")
    private BigDecimal netCashDisposalPpeInt;

    @Schema(description = "处置子公司及其他营业单位收到的现金净额")
    private BigDecimal netCashDisposalSubsidiaries;

    @Schema(description = "收到的其他与投资活动有关的现金")
    private BigDecimal otherInvestingInflows;

    @Schema(description = "投资活动现金流入小计")
    private BigDecimal totalInvestingInflows;

    @Schema(description = "购建固定资产、无形资产和其他长期资产支付的现金")
    private BigDecimal cashAcquisitionPpeInt;

    @Schema(description = "投资支付的现金")
    private BigDecimal cashPaidInvestments;

    @Schema(description = "质押贷款净增加额")
    private BigDecimal netIncrPledgedLoans;

    @Schema(description = "取得子公司及其他营业单位支付的现金净额")
    private BigDecimal netCashAcquisitionSubs;

    @Schema(description = "支付其他与投资活动有关的现金")
    private BigDecimal otherInvestingOutflows;

    @Schema(description = "投资活动现金流出小计")
    private BigDecimal totalInvestingOutflows;

    @Schema(description = "投资活动产生的现金流量净额")
    private BigDecimal netCashInvesting;

    @Schema(description = "吸收投资收到的现金")
    private BigDecimal cashFromInvestors;

    @Schema(description = "吸收权益性投资收到的现金")
    private BigDecimal cashFromEquityInvestors;

    @Schema(description = "其中：子公司吸收少数股东投资收到的现金")
    private BigDecimal cashFromMinorityInvestors;

    @Schema(description = "发行债券收到的现金")
    private BigDecimal cashFromBondIssue;

    @Schema(description = "取得借款收到的现金")
    private BigDecimal cashFromBorrowings;

    @Schema(description = "收到其他与筹资活动有关的现金")
    private BigDecimal otherFinancingInflows;

    @Schema(description = "筹资活动现金流入小计")
    private BigDecimal totalFinancingInflows;

    @Schema(description = "偿还债务支付的现金")
    private BigDecimal cashRepaymentBorrowings;

    @Schema(description = "分配股利、利润或偿付利息支付的现金")
    private BigDecimal cashDividendsInterest;

    @Schema(description = "其中：子公司支付给少数股东的股利、利润")
    private BigDecimal dividendsToMinority;

    @Schema(description = "支付其他与筹资活动有关的现金")
    private BigDecimal otherFinancingOutflows;

    @Schema(description = "筹资活动现金流出小计")
    private BigDecimal totalFinancingOutflows;

    @Schema(description = "筹资活动产生的现金流量净额")
    private BigDecimal netCashFinancing;

    @Schema(description = "汇率变动对现金及现金等价物的影响")
    private BigDecimal effectExchangeRate;

    @Schema(description = "其他对现金的影响")
    private BigDecimal otherEffectCash;

    @Schema(description = "现金及现金等价物净增加额")
    private BigDecimal netIncrCashEquiv;

    @Schema(description = "期初现金及现金等价物余额")
    private BigDecimal cashEquivBegin;

    @Schema(description = "期末现金及现金等价物余额")
    private BigDecimal cashEquivEnd;

    @Schema(description = "记录创建时间")
    private LocalDateTime createdAt;

    @Schema(description = "记录更新时间")
    private LocalDateTime updatedAt;

    @Schema(description = "公司编号", example = "32652")
    private Long companyId;

}