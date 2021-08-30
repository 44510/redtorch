/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19p1v.api;

public class CThostFtdcAccountregisterField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAccountregisterField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAccountregisterField obj) {
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
        jctpv6v3v19p1x64apiJNI.delete_CThostFtdcAccountregisterField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeDay(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_TradeDay_set(swigCPtr, this, value);
  }

  public String getTradeDay() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_TradeDay_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BankBranchID_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BankAccount_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_AccountID_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_CustomerName_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_CurrencyID_get(swigCPtr, this);
  }

  public void setOpenOrDestroy(char value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_OpenOrDestroy_set(swigCPtr, this, value);
  }

  public char getOpenOrDestroy() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_OpenOrDestroy_get(swigCPtr, this);
  }

  public void setRegDate(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_RegDate_set(swigCPtr, this, value);
  }

  public String getRegDate() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_RegDate_get(swigCPtr, this);
  }

  public void setOutDate(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_OutDate_set(swigCPtr, this, value);
  }

  public String getOutDate() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_OutDate_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_TID_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_CustType_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_BankAccType_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcAccountregisterField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcAccountregisterField() {
    this(jctpv6v3v19p1x64apiJNI.new_CThostFtdcAccountregisterField(), true);
  }

}
