/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19p1v.api;

public class CThostFtdcExchangeMarginRateAdjustField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeMarginRateAdjustField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeMarginRateAdjustField obj) {
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
        jctpv6v3v19p1x64apiJNI.delete_CThostFtdcExchangeMarginRateAdjustField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setExchLongMarginRatioByMoney(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getExchLongMarginRatioByMoney() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setExchLongMarginRatioByVolume(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getExchLongMarginRatioByVolume() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setExchShortMarginRatioByMoney(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getExchShortMarginRatioByMoney() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setExchShortMarginRatioByVolume(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getExchShortMarginRatioByVolume() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setNoLongMarginRatioByMoney(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getNoLongMarginRatioByMoney() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setNoLongMarginRatioByVolume(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getNoLongMarginRatioByVolume() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setNoShortMarginRatioByMoney(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getNoShortMarginRatioByMoney() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setNoShortMarginRatioByVolume(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getNoShortMarginRatioByVolume() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcExchangeMarginRateAdjustField() {
    this(jctpv6v3v19p1x64apiJNI.new_CThostFtdcExchangeMarginRateAdjustField(), true);
  }

}
