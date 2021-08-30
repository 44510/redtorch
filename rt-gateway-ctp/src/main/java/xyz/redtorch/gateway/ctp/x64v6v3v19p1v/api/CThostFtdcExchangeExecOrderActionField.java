/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19p1v.api;

public class CThostFtdcExchangeExecOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeExecOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeExecOrderActionField obj) {
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
        jctpv6v3v19p1x64apiJNI.delete_CThostFtdcExchangeExecOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ActionType_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcExchangeExecOrderActionField_Volume_get(swigCPtr, this);
  }

  public CThostFtdcExchangeExecOrderActionField() {
    this(jctpv6v3v19p1x64apiJNI.new_CThostFtdcExchangeExecOrderActionField(), true);
  }

}
