/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcInvestorProductGroupMarginField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestorProductGroupMarginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorProductGroupMarginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcInvestorProductGroupMarginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_reserve1_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_InvestorID_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_SettlementID_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenMargin_get(swigCPtr, this);
  }

  public void setLongFrozenMargin(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_LongFrozenMargin_set(swigCPtr, this, value);
  }

  public double getLongFrozenMargin() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_LongFrozenMargin_get(swigCPtr, this);
  }

  public void setShortFrozenMargin(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ShortFrozenMargin_set(swigCPtr, this, value);
  }

  public double getShortFrozenMargin() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ShortFrozenMargin_get(swigCPtr, this);
  }

  public void setUseMargin(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_UseMargin_set(swigCPtr, this, value);
  }

  public double getUseMargin() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_UseMargin_get(swigCPtr, this);
  }

  public void setLongUseMargin(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_LongUseMargin_set(swigCPtr, this, value);
  }

  public double getLongUseMargin() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_LongUseMargin_get(swigCPtr, this);
  }

  public void setShortUseMargin(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ShortUseMargin_set(swigCPtr, this, value);
  }

  public double getShortUseMargin() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ShortUseMargin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ExchMargin_get(swigCPtr, this);
  }

  public void setLongExchMargin(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchMargin_set(swigCPtr, this, value);
  }

  public double getLongExchMargin() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchMargin_get(swigCPtr, this);
  }

  public void setShortExchMargin(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchMargin_set(swigCPtr, this, value);
  }

  public double getShortExchMargin() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchMargin_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_CloseProfit_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_Commission_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCash_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_CashIn_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_PositionProfit_get(swigCPtr, this);
  }

  public void setOffsetAmount(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_OffsetAmount_set(swigCPtr, this, value);
  }

  public double getOffsetAmount() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_OffsetAmount_get(swigCPtr, this);
  }

  public void setLongOffsetAmount(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_LongOffsetAmount_set(swigCPtr, this, value);
  }

  public double getLongOffsetAmount() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_LongOffsetAmount_get(swigCPtr, this);
  }

  public void setShortOffsetAmount(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ShortOffsetAmount_set(swigCPtr, this, value);
  }

  public double getShortOffsetAmount() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ShortOffsetAmount_get(swigCPtr, this);
  }

  public void setExchOffsetAmount(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ExchOffsetAmount_set(swigCPtr, this, value);
  }

  public double getExchOffsetAmount() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ExchOffsetAmount_get(swigCPtr, this);
  }

  public void setLongExchOffsetAmount(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchOffsetAmount_set(swigCPtr, this, value);
  }

  public double getLongExchOffsetAmount() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchOffsetAmount_get(swigCPtr, this);
  }

  public void setShortExchOffsetAmount(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchOffsetAmount_set(swigCPtr, this, value);
  }

  public double getShortExchOffsetAmount() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchOffsetAmount_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_HedgeFlag_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_InvestUnitID_get(swigCPtr, this);
  }

  public void setProductGroupID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ProductGroupID_set(swigCPtr, this, value);
  }

  public String getProductGroupID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorProductGroupMarginField_ProductGroupID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorProductGroupMarginField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcInvestorProductGroupMarginField(), true);
  }

}
