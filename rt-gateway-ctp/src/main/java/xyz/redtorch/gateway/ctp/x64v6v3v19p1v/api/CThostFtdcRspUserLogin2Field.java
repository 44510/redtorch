/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19p1v.api;

public class CThostFtdcRspUserLogin2Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspUserLogin2Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspUserLogin2Field obj) {
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
        jctpv6v3v19p1x64apiJNI.delete_CThostFtdcRspUserLogin2Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_TradingDay_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_LoginTime_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_UserID_get(swigCPtr, this);
  }

  public void setSystemName(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_SystemName_set(swigCPtr, this, value);
  }

  public String getSystemName() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_SystemName_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_SessionID_get(swigCPtr, this);
  }

  public void setMaxOrderRef(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_MaxOrderRef_set(swigCPtr, this, value);
  }

  public String getMaxOrderRef() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_MaxOrderRef_get(swigCPtr, this);
  }

  public void setSHFETime(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_SHFETime_set(swigCPtr, this, value);
  }

  public String getSHFETime() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_SHFETime_get(swigCPtr, this);
  }

  public void setDCETime(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_DCETime_set(swigCPtr, this, value);
  }

  public String getDCETime() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_DCETime_get(swigCPtr, this);
  }

  public void setCZCETime(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_CZCETime_set(swigCPtr, this, value);
  }

  public String getCZCETime() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_CZCETime_get(swigCPtr, this);
  }

  public void setFFEXTime(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_FFEXTime_set(swigCPtr, this, value);
  }

  public String getFFEXTime() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_FFEXTime_get(swigCPtr, this);
  }

  public void setINETime(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_INETime_set(swigCPtr, this, value);
  }

  public String getINETime() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_INETime_get(swigCPtr, this);
  }

  public void setRandomString(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_RandomString_set(swigCPtr, this, value);
  }

  public String getRandomString() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcRspUserLogin2Field_RandomString_get(swigCPtr, this);
  }

  public CThostFtdcRspUserLogin2Field() {
    this(jctpv6v3v19p1x64apiJNI.new_CThostFtdcRspUserLogin2Field(), true);
  }

}
