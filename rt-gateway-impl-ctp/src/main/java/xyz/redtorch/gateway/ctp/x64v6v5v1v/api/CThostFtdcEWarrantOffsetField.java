/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1v.api;

public class CThostFtdcEWarrantOffsetField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcEWarrantOffsetField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcEWarrantOffsetField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcEWarrantOffsetField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_InvestorID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_ExchangeID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_reserve1_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_Direction_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_HedgeFlag_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_Volume_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcEWarrantOffsetField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcEWarrantOffsetField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcEWarrantOffsetField(), true);
  }

}
