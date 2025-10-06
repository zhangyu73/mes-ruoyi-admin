package cn.iocoder.yudao.module.crm.dal.dataobject.cashflowstatement;

import lombok.*;
import java.util.*;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 现金流量 DO
 *
 * @author 张三
 */
@TableName("crm_cash_flow_statement")
@KeySequence("crm_cash_flow_statement_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CashFlowStatementDO extends BaseDO {

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
    private
    Date endDate;
    /**
     * 报表类型（A=年报，Q1=一季报，H=半年报，Q3=三季报）
     */
    private String reportType;
    /**
     * 是否发生差错更正（1=是，0=否）
     */
    private Boolean isCorrected;
    /**
     * 差错更正披露日期
     */
    private Date correctDeclareDate;
    /**
     * 销售商品、提供劳务收到的现金
     */
    private BigDecimal cashFromSales;
    /**
     * 客户存款和同业存放款项净增加额
     */
    private BigDecimal netIncrCustomerDeposits;
    /**
     * 存放央行和同业款项净减少额
     */
    private BigDecimal netDecrDepositsCentralBank;
    /**
     * 向中央银行借款净增加额
     */
    private BigDecimal netIncrBorrowCentralBank;
    /**
     * 向其他金融机构拆入资金净增加额
     */
    private BigDecimal netIncrFiBorrowings;
    /**
     * 收到原保险合同保费取得的现金
     */
    private BigDecimal cashPremiumsOriginal;
    /**
     * 收到再保险业务现金净额
     */
    private BigDecimal netCashReinsurance;
    /**
     * 保户储金及投资款净增加额
     */
    private BigDecimal netIncrPolicyholderFunds;
    /**
     * 处置交易性金融资产净增加额
     */
    private BigDecimal netIncrTradingAssets;
    /**
     * 收取利息、手续费及佣金的现金
     */
    private BigDecimal cashInterestFees;
    /**
     * 拆入资金净增加额
     */
    private BigDecimal netIncrFundsBorrowed;
    /**
     * 回购业务资金净增加额
     */
    private BigDecimal netIncrRepoBusiness;
    /**
     * 拆出资金净减少额
     */
    private BigDecimal netDecrLendingFi;
    /**
     * 买入返售款项净减少额
     */
    private BigDecimal netDecrReverseRepo;
    /**
     * 收到的税费返还
     */
    private BigDecimal taxRefundsReceived;
    /**
     * 收到的其他与经营活动有关的现金
     */
    private BigDecimal otherOperatingInflows;
    /**
     * 经营活动现金流入小计
     */
    private BigDecimal totalOperatingInflows;
    /**
     * 购买商品、接受劳务支付的现金
     */
    private BigDecimal cashPaidGoodsServices;
    /**
     * 客户贷款及垫款净增加额
     */
    private BigDecimal netIncrLoansCustomers;
    /**
     * 向中央银行借款净减少额
     */
    private BigDecimal netDecrBorrowCentralBank;
    /**
     * 存放中央银行和同业款项净增加额
     */
    private BigDecimal netIncrDepositsCentralFi;
    /**
     * 支付原保险合同赔付款项的现金
     */
    private BigDecimal cashInsuranceClaims;
    /**
     * 支付利息、手续费及佣金的现金
     */
    private BigDecimal cashInterestFeesPaid;
    /**
     * 支付再保业务现金净额
     */
    private BigDecimal netCashReinsuranceOut;
    /**
     * 保户储金及投资款净减少额
     */
    private BigDecimal netDecrPolicyholderFunds;
    /**
     * 拆出资金净增加额
     */
    private BigDecimal netIncrLendingFi;
    /**
     * 买入返售款项净增加额
     */
    private BigDecimal netIncrReverseRepo;
    /**
     * 拆入资金净减少额
     */
    private BigDecimal netDecrBorrowedFunds;
    /**
     * 卖出回购款项净减少额
     */
    private BigDecimal netDecrRepoPayables;
    /**
     * 支付保单红利的现金
     */
    private BigDecimal dividendsPolicyholdersPaid;
    /**
     * 支付给职工以及为职工支付的现金
     */
    private BigDecimal cashPaidEmployees;
    /**
     * 支付的各项税费
     */
    private BigDecimal taxesPaid;
    /**
     * 支付其他与经营活动有关的现金
     */
    private BigDecimal otherOperatingOutflows;
    /**
     * 经营活动现金流出小计
     */
    private BigDecimal totalOperatingOutflows;
    /**
     * 经营活动产生的现金流量净额
     */
    private BigDecimal netCashOperating;
    /**
     * 收回投资收到的现金
     */
    private BigDecimal cashDisposalInvestments;
    /**
     * 取得投资收益收到的现金
     */
    private BigDecimal cashInvestmentIncome;
    /**
     * 处置固定资产、无形资产和其他长期资产收回的现金净额
     */
    private BigDecimal netCashDisposalPpeInt;
    /**
     * 处置子公司及其他营业单位收到的现金净额
     */
    private BigDecimal netCashDisposalSubsidiaries;
    /**
     * 收到的其他与投资活动有关的现金
     */
    private BigDecimal otherInvestingInflows;
    /**
     * 投资活动现金流入小计
     */
    private BigDecimal totalInvestingInflows;
    /**
     * 购建固定资产、无形资产和其他长期资产支付的现金
     */
    private BigDecimal cashAcquisitionPpeInt;
    /**
     * 投资支付的现金
     */
    private BigDecimal cashPaidInvestments;
    /**
     * 质押贷款净增加额
     */
    private BigDecimal netIncrPledgedLoans;
    /**
     * 取得子公司及其他营业单位支付的现金净额
     */
    private BigDecimal netCashAcquisitionSubs;
    /**
     * 支付其他与投资活动有关的现金
     */
    private BigDecimal otherInvestingOutflows;
    /**
     * 投资活动现金流出小计
     */
    private BigDecimal totalInvestingOutflows;
    /**
     * 投资活动产生的现金流量净额
     */
    private BigDecimal netCashInvesting;
    /**
     * 吸收投资收到的现金
     */
    private BigDecimal cashFromInvestors;
    /**
     * 吸收权益性投资收到的现金
     */
    private BigDecimal cashFromEquityInvestors;
    /**
     * 其中：子公司吸收少数股东投资收到的现金
     */
    private BigDecimal cashFromMinorityInvestors;
    /**
     * 发行债券收到的现金
     */
    private BigDecimal cashFromBondIssue;
    /**
     * 取得借款收到的现金
     */
    private BigDecimal cashFromBorrowings;
    /**
     * 收到其他与筹资活动有关的现金
     */
    private BigDecimal otherFinancingInflows;
    /**
     * 筹资活动现金流入小计
     */
    private BigDecimal totalFinancingInflows;
    /**
     * 偿还债务支付的现金
     */
    private BigDecimal cashRepaymentBorrowings;
    /**
     * 分配股利、利润或偿付利息支付的现金
     */
    private BigDecimal cashDividendsInterest;
    /**
     * 其中：子公司支付给少数股东的股利、利润
     */
    private BigDecimal dividendsToMinority;
    /**
     * 支付其他与筹资活动有关的现金
     */
    private BigDecimal otherFinancingOutflows;
    /**
     * 筹资活动现金流出小计
     */
    private BigDecimal totalFinancingOutflows;
    /**
     * 筹资活动产生的现金流量净额
     */
    private BigDecimal netCashFinancing;
    /**
     * 汇率变动对现金及现金等价物的影响
     */
    private BigDecimal effectExchangeRate;
    /**
     * 其他对现金的影响
     */
    private BigDecimal otherEffectCash;
    /**
     * 现金及现金等价物净增加额
     */
    private BigDecimal netIncrCashEquiv;
    /**
     * 期初现金及现金等价物余额
     */
    private BigDecimal cashEquivBegin;
    /**
     * 期末现金及现金等价物余额
     */
    private BigDecimal cashEquivEnd;
    /**
     * 记录创建时间
     */
    private LocalDateTime createdAt;
    /**
     * 记录更新时间
     */
    private LocalDateTime updatedAt;
    /**
     * 公司编号
     */
    private Long companyId;


}
