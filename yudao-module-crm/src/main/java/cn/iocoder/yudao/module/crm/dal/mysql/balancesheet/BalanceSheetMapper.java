package cn.iocoder.yudao.module.crm.dal.mysql.balancesheet;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.crm.dal.dataobject.balancesheet.BalanceSheetDO;
import cn.iocoder.yudao.module.crm.dal.dataobject.qualification.QualificationDO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.crm.controller.admin.balancesheet.vo.*;
import org.apache.ibatis.annotations.Param;

/**
 * 资产负债 Mapper
 *
 * @author 张三
 */
@Mapper
public interface BalanceSheetMapper extends BaseMapperX<BalanceSheetDO> {

    default PageResult<BalanceSheetDO> selectPage(BalanceSheetPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<BalanceSheetDO>()
                .eqIfPresent(BalanceSheetDO::getStkcd, reqVO.getStkcd())
//                .likeIfPresent(BalanceSheetDO::getShortName, reqVO.getShortName())
                .eqIfPresent(BalanceSheetDO::getAccper, reqVO.getAccper())
                .eqIfPresent(BalanceSheetDO::getTyprep, reqVO.getTyprep())
                .eqIfPresent(BalanceSheetDO::getAccountsPayable, reqVO.getAccountsPayable())
                .eqIfPresent(BalanceSheetDO::getContractLiabilities, reqVO.getContractLiabilities())
                .eqIfPresent(BalanceSheetDO::getRepurchaseAgreementsPayable, reqVO.getRepurchaseAgreementsPayable())
                .eqIfPresent(BalanceSheetDO::getFeesAndCommissionsPayable, reqVO.getFeesAndCommissionsPayable())
                .eqIfPresent(BalanceSheetDO::getEmployeeBenefitsPayable, reqVO.getEmployeeBenefitsPayable())
                .eqIfPresent(BalanceSheetDO::getTaxesPayable, reqVO.getTaxesPayable())
                .eqIfPresent(BalanceSheetDO::getInterestPayable, reqVO.getInterestPayable())
                .eqIfPresent(BalanceSheetDO::getDividendsPayable, reqVO.getDividendsPayable())
                .eqIfPresent(BalanceSheetDO::getClaimsPayable, reqVO.getClaimsPayable())
                .eqIfPresent(BalanceSheetDO::getPolicyholderDividendsPayable, reqVO.getPolicyholderDividendsPayable())
                .eqIfPresent(BalanceSheetDO::getPolicyholderDepositsAndInvestmentFunds, reqVO.getPolicyholderDepositsAndInvestmentFunds())
                .eqIfPresent(BalanceSheetDO::getInsuranceContractReserves, reqVO.getInsuranceContractReserves())
                .eqIfPresent(BalanceSheetDO::getUnearnedPremiumReserve, reqVO.getUnearnedPremiumReserve())
                .eqIfPresent(BalanceSheetDO::getOutstandingClaimsReserve, reqVO.getOutstandingClaimsReserve())
                .eqIfPresent(BalanceSheetDO::getLifeInsuranceReserve, reqVO.getLifeInsuranceReserve())
                .eqIfPresent(BalanceSheetDO::getLongTermHealthInsuranceReserve, reqVO.getLongTermHealthInsuranceReserve())
                .eqIfPresent(BalanceSheetDO::getOtherPayables, reqVO.getOtherPayables())
                .eqIfPresent(BalanceSheetDO::getReinsurancePayables, reqVO.getReinsurancePayables())
                .eqIfPresent(BalanceSheetDO::getAgencySecuritiesTradingPayables, reqVO.getAgencySecuritiesTradingPayables())
                .eqIfPresent(BalanceSheetDO::getAgencySecuritiesUnderwritingPayables, reqVO.getAgencySecuritiesUnderwritingPayables())
                .eqIfPresent(BalanceSheetDO::getPremiumReceivedInAdvance, reqVO.getPremiumReceivedInAdvance())
                .eqIfPresent(BalanceSheetDO::getNonCurrentLiabilitiesDueWithinOneYear, reqVO.getNonCurrentLiabilitiesDueWithinOneYear())
                .eqIfPresent(BalanceSheetDO::getOtherCurrentLiabilities, reqVO.getOtherCurrentLiabilities())
                .eqIfPresent(BalanceSheetDO::getDeferredRevenueCurrent, reqVO.getDeferredRevenueCurrent())
                .eqIfPresent(BalanceSheetDO::getTotalCurrentLiabilities, reqVO.getTotalCurrentLiabilities())
                .eqIfPresent(BalanceSheetDO::getLongTermBorrowings, reqVO.getLongTermBorrowings())
                .eqIfPresent(BalanceSheetDO::getSeparateAccountLiabilities, reqVO.getSeparateAccountLiabilities())
                .eqIfPresent(BalanceSheetDO::getBondsPayable, reqVO.getBondsPayable())
                .eqIfPresent(BalanceSheetDO::getLeaseLiabilities, reqVO.getLeaseLiabilities())
                .eqIfPresent(BalanceSheetDO::getLongTermPayables, reqVO.getLongTermPayables())
                .eqIfPresent(BalanceSheetDO::getSpecialPayables, reqVO.getSpecialPayables())
                .eqIfPresent(BalanceSheetDO::getTotalLongTermLiabilities, reqVO.getTotalLongTermLiabilities())
                .eqIfPresent(BalanceSheetDO::getProvisions, reqVO.getProvisions())
                .eqIfPresent(BalanceSheetDO::getAgencyBusinessLiabilities, reqVO.getAgencyBusinessLiabilities())
                .eqIfPresent(BalanceSheetDO::getDeferredTaxLiabilities, reqVO.getDeferredTaxLiabilities())
                .eqIfPresent(BalanceSheetDO::getOtherNonCurrentLiabilities, reqVO.getOtherNonCurrentLiabilities())
                .eqIfPresent(BalanceSheetDO::getDeferredRevenueNonCurrent, reqVO.getDeferredRevenueNonCurrent())
                .eqIfPresent(BalanceSheetDO::getTotalNonCurrentLiabilities, reqVO.getTotalNonCurrentLiabilities())
                .eqIfPresent(BalanceSheetDO::getOtherLiabilities, reqVO.getOtherLiabilities())
                .eqIfPresent(BalanceSheetDO::getTotalLiabilities, reqVO.getTotalLiabilities())
                .eqIfPresent(BalanceSheetDO::getPaidInCapital, reqVO.getPaidInCapital())
                .eqIfPresent(BalanceSheetDO::getOtherEquityInstruments, reqVO.getOtherEquityInstruments())
                .eqIfPresent(BalanceSheetDO::getPreferredShares, reqVO.getPreferredShares())
                .eqIfPresent(BalanceSheetDO::getPerpetualBonds, reqVO.getPerpetualBonds())
                .eqIfPresent(BalanceSheetDO::getOtherEquityInstrumentsOthers, reqVO.getOtherEquityInstrumentsOthers())
                .eqIfPresent(BalanceSheetDO::getCapitalReserve, reqVO.getCapitalReserve())
                .eqIfPresent(BalanceSheetDO::getTreasuryShares, reqVO.getTreasuryShares())
                .eqIfPresent(BalanceSheetDO::getSurplusReserve, reqVO.getSurplusReserve())
                .eqIfPresent(BalanceSheetDO::getA0f3104000, reqVO.getA0f3104000())
                .eqIfPresent(BalanceSheetDO::getGeneralRiskReserve, reqVO.getGeneralRiskReserve())
                .eqIfPresent(BalanceSheetDO::getRetainedEarnings, reqVO.getRetainedEarnings())
                .eqIfPresent(BalanceSheetDO::getForeignCurrencyTranslationReserve, reqVO.getForeignCurrencyTranslationReserve())
                .eqIfPresent(BalanceSheetDO::getUnrecognizedInvestmentLoss, reqVO.getUnrecognizedInvestmentLoss())
                .eqIfPresent(BalanceSheetDO::getTradingRiskReserve, reqVO.getTradingRiskReserve())
                .eqIfPresent(BalanceSheetDO::getSpecialReserve, reqVO.getSpecialReserve())
                .eqIfPresent(BalanceSheetDO::getOtherComprehensiveIncome, reqVO.getOtherComprehensiveIncome())
                .eqIfPresent(BalanceSheetDO::getTotalEquityAttributableToParent, reqVO.getTotalEquityAttributableToParent())
                .eqIfPresent(BalanceSheetDO::getMinorityInterests, reqVO.getMinorityInterests())
                .eqIfPresent(BalanceSheetDO::getTotalEquity, reqVO.getTotalEquity())
                .eqIfPresent(BalanceSheetDO::getCompanyId, reqVO.getCompanyId())
                .orderByDesc(BalanceSheetDO::getId));
    }
    Page<BalanceSheetDO> selectPageByCompanyId(Page<BalanceSheetDO> page,
                                                @Param("companyId") Long companyId);

}