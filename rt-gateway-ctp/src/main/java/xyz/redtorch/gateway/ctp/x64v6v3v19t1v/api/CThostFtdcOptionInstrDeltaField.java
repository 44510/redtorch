/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19t1v.api;

public class CThostFtdcOptionInstrDeltaField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionInstrDeltaField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrDeltaField obj) {
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
        jctpv6v3v19t1x64apiJNI.delete_CThostFtdcOptionInstrDeltaField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcOptionInstrDeltaField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcOptionInstrDeltaField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcOptionInstrDeltaField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcOptionInstrDeltaField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcOptionInstrDeltaField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcOptionInstrDeltaField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcOptionInstrDeltaField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcOptionInstrDeltaField_InvestorID_get(swigCPtr, this);
  }

  public void setDelta(double value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcOptionInstrDeltaField_Delta_set(swigCPtr, this, value);
  }

  public double getDelta() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcOptionInstrDeltaField_Delta_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrDeltaField() {
    this(jctpv6v3v19t1x64apiJNI.new_CThostFtdcOptionInstrDeltaField(), true);
  }

}
