package cn.iocoder.yudao.module.crm.controller.admin.incomestatement.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 利润 Response VO")
@Data
@ExcelIgnoreUnannotated
public class IncomeStatementRespVO {

    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "3786")
    @ExcelProperty("主键")
    private Long id;

    @Schema(description = "证券代码")
    @ExcelProperty("证券代码")
    private String stockCode;

    @Schema(description = "证券简称", example = "赵六")
    @ExcelProperty("证券简称")
    private String shortName;

    @Schema(description = "统计截止日期")
    @ExcelProperty("统计截止日期")
    private String endDate;

    @Schema(description = "报表类型", example = "2")
    @ExcelProperty("报表类型")
    private String reportType;

    @Schema(description = "单位")
    @ExcelProperty("单位")
    private String currencyUnit;

    @Schema(description = "营业总收入")
    @ExcelProperty("营业总收入")
    private String totalRevenue;

    @Schema(description = "营业收入")
    @ExcelProperty("营业收入")
    private String operatingRevenue;

    @Schema(description = "利息净收入")
    @ExcelProperty("利息净收入")
    private String netInterestIncome;

    @Schema(description = "利息收入")
    @ExcelProperty("利息收入")
    private String interestIncome;

    @Schema(description = "利息支出")
    @ExcelProperty("利息支出")
    private String interestExpense;

    @Schema(description = "已赚保费")
    @ExcelProperty("已赚保费")
    private String earnedPremium;

    @Schema(description = "保险业务收入")
    @ExcelProperty("保险业务收入")
    private String insuranceRevenue;

    @Schema(description = "分保费收入")
    @ExcelProperty("分保费收入")
    private String cededPremiumIncome;

    @Schema(description = "分出保费")
    @ExcelProperty("分出保费")
    private String cededPremiumOut;

    @Schema(description = "提取未到期责任准备金")
    @ExcelProperty("提取未到期责任准备金")
    private String unearnedPremiumReserve;

    @Schema(description = "手续费及佣金净收入")
    @ExcelProperty("手续费及佣金净收入")
    private String netFeeCommissionIncome;

    @Schema(description = "代理买卖证券业务净收入")
    @ExcelProperty("代理买卖证券业务净收入")
    private String netBrokerageIncome;

    @Schema(description = "证券承销业务净收入")
    @ExcelProperty("证券承销业务净收入")
    private String netUnderwritingIncome;

    @Schema(description = "受托客户资产管理业务净收入")
    @ExcelProperty("受托客户资产管理业务净收入")
    private String netAssetMgmtIncome;

    @Schema(description = "手续费及佣金支出")
    @ExcelProperty("手续费及佣金支出")
    private String feeCommissionIncome;

    @Schema(description = "手续费及佣金支出")
    @ExcelProperty("手续费及佣金支出")
    private String feeCommissionExpense;

    @Schema(description = "其他业务收入")
    @ExcelProperty("其他业务收入")
    private String otherOperatingIncome;

    @Schema(description = "营业总成本")
    @ExcelProperty("营业总成本")
    private String totalOperatingCost;

    @Schema(description = "营业成本")
    @ExcelProperty("营业成本")
    private String operatingCost;

    @Schema(description = "税金及附加")
    @ExcelProperty("税金及附加")
    private String taxesSurcharges;

    @Schema(description = "业务及管理费")
    @ExcelProperty("业务及管理费")
    private String adminBusinessExpense;

    @Schema(description = "销售费用")
    @ExcelProperty("销售费用")
    private String sellingExpense;

    @Schema(description = "管理费用")
    @ExcelProperty("管理费用")
    private String adminExpense;

    @Schema(description = "研发费用")
    @ExcelProperty("研发费用")
    private String rdExpense;

    @Schema(description = "财务费用")
    @ExcelProperty("财务费用")
    private String financialExpense;

    @Schema(description = "利息费用(财务费用)")
    @ExcelProperty("利息费用(财务费用)")
    private String interestFinExpense;

    @Schema(description = "利息收入(财务费用)")
    @ExcelProperty("利息收入(财务费用)")
    private String interestFinIncome;

    @Schema(description = "其他收益")
    @ExcelProperty("其他收益")
    private String otherIncome;

    @Schema(description = "投资收益")
    @ExcelProperty("投资收益")
    private String investmentIncome;

    @Schema(description = "对联营企业和合营企业的投资收益")
    @ExcelProperty("对联营企业和合营企业的投资收益")
    private String incomeFromAssociates;

    @Schema(description = "以摊余成本计量的金融资产终止确认收益")
    @ExcelProperty("以摊余成本计量的金融资产终止确认收益")
    private String gainFvociDerecognition;

    @Schema(description = "汇兑收益")
    @ExcelProperty("汇兑收益")
    private String exchangeGain;

    @Schema(description = "净敞口套期收益")
    @ExcelProperty("净敞口套期收益")
    private String netHedgingGain;

    @Schema(description = "公允价值变动收益")
    @ExcelProperty("公允价值变动收益")
    private String gainFvChange;

    @Schema(description = "资产减值损失")
    @ExcelProperty("资产减值损失")
    private String impairmentLossAssets;

    @Schema(description = "信用减值损失")
    @ExcelProperty("信用减值损失")
    private String impairmentLossCredit;

    @Schema(description = "资产处置收益")
    @ExcelProperty("资产处置收益")
    private String gainDisposalAssets;

    @Schema(description = "其他业务成本")
    @ExcelProperty("其他业务成本")
    private String otherOperatingCost;

    @Schema(description = "其他业务利润")
    @ExcelProperty("其他业务利润")
    private String otherOperatingProfit;

    @Schema(description = "营业利润")
    @ExcelProperty("营业利润")
    private String operatingProfit;

    @Schema(description = "营业外收入")
    @ExcelProperty("营业外收入")
    private String nonOperatingIncome;

    @Schema(description = "非流动资产处置利得")
    @ExcelProperty("非流动资产处置利得")
    private String gainDisposalNclAssets;

    @Schema(description = "营业外支出")
    @ExcelProperty("营业外支出")
    private String nonOperatingExpense;

    @Schema(description = "非流动资产处置净损益")
    @ExcelProperty("非流动资产处置净损益")
    private String netDisposalNclAssets;

    @Schema(description = "非流动资产处置损失")
    @ExcelProperty("非流动资产处置损失")
    private String lossDisposalNclAssets;

    @Schema(description = "利润总额")
    @ExcelProperty("利润总额")
    private String totalProfit;

    @Schema(description = "公司编号", example = "21486")
    @ExcelProperty("公司编号")
    private Long companyId;

}