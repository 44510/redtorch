/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcTransferQryBankRspField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferQryBankRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferQryBankRspField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcTransferQryBankRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRetCode(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_RetCode_set(swigCPtr, this, value);
  }

  public String getRetCode() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_RetCode_get(swigCPtr, this);
  }

  public void setRetInfo(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_RetInfo_set(swigCPtr, this, value);
  }

  public String getRetInfo() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_RetInfo_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_TradeAmt_get(swigCPtr, this);
  }

  public void setUseAmt(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_UseAmt_set(swigCPtr, this, value);
  }

  public double getUseAmt() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_UseAmt_get(swigCPtr, this);
  }

  public void setFetchAmt(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_FetchAmt_set(swigCPtr, this, value);
  }

  public double getFetchAmt() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_FetchAmt_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcTransferQryBankRspField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryBankRspField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcTransferQryBankRspField(), true);
  }

}
