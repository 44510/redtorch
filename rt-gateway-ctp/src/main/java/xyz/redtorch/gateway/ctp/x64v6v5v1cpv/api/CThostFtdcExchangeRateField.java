/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcExchangeRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeRateField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcExchangeRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeRateField_BrokerID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeRateField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeRateField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setFromCurrencyUnit(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeRateField_FromCurrencyUnit_set(swigCPtr, this, value);
  }

  public double getFromCurrencyUnit() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeRateField_FromCurrencyUnit_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeRateField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeRateField_ToCurrencyID_get(swigCPtr, this);
  }

  public void setExchangeRate(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeRateField_ExchangeRate_set(swigCPtr, this, value);
  }

  public double getExchangeRate() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExchangeRateField_ExchangeRate_get(swigCPtr, this);
  }

  public CThostFtdcExchangeRateField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcExchangeRateField(), true);
  }

}
