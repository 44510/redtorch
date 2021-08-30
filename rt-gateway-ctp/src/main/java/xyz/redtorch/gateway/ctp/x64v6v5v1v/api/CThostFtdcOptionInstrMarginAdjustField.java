/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1v.api;

public class CThostFtdcOptionInstrMarginAdjustField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionInstrMarginAdjustField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrMarginAdjustField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcOptionInstrMarginAdjustField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_reserve1_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_InvestorID_get(swigCPtr, this);
  }

  public void setSShortMarginRatioByMoney(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_SShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getSShortMarginRatioByMoney() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_SShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setSShortMarginRatioByVolume(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_SShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getSShortMarginRatioByVolume() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_SShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setHShortMarginRatioByMoney(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_HShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getHShortMarginRatioByMoney() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_HShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setHShortMarginRatioByVolume(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_HShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getHShortMarginRatioByVolume() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_HShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setAShortMarginRatioByMoney(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_AShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getAShortMarginRatioByMoney() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_AShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setAShortMarginRatioByVolume(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_AShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getAShortMarginRatioByVolume() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_AShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_IsRelative_get(swigCPtr, this);
  }

  public void setMShortMarginRatioByMoney(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_MShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getMShortMarginRatioByMoney() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_MShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setMShortMarginRatioByVolume(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_MShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getMShortMarginRatioByVolume() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_MShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcOptionInstrMarginAdjustField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrMarginAdjustField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcOptionInstrMarginAdjustField(), true);
  }

}
