/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19t1v.api;

public class CThostFtdcSyncingInvestorGroupField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingInvestorGroupField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInvestorGroupField obj) {
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
        jctpv6v3v19t1x64apiJNI.delete_CThostFtdcSyncingInvestorGroupField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcSyncingInvestorGroupField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcSyncingInvestorGroupField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setInvestorGroupName(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupName_set(swigCPtr, this, value);
  }

  public String getInvestorGroupName() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupName_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInvestorGroupField() {
    this(jctpv6v3v19t1x64apiJNI.new_CThostFtdcSyncingInvestorGroupField(), true);
  }

}
