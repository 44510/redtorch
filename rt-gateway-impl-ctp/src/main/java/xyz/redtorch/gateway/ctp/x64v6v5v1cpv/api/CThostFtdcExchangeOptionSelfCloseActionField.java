/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcExchangeOptionSelfCloseActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeOptionSelfCloseActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOptionSelfCloseActionField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcExchangeOptionSelfCloseActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_InstallID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseLocalID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OptionSelfCloseLocalID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseLocalID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OptionSelfCloseLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_UserID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_BranchID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_reserve1_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_MacAddress_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_reserve2_get(swigCPtr, this);
  }

  public void setOptSelfCloseFlag(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OptSelfCloseFlag_set(swigCPtr, this, value);
  }

  public char getOptSelfCloseFlag() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OptSelfCloseFlag_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_IPAddress_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOptionSelfCloseActionField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcExchangeOptionSelfCloseActionField(), true);
  }

}
