/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcQryTransferBankField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryTransferBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryTransferBankField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcQryTransferBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBankID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryTransferBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryTransferBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryTransferBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryTransferBankField_BankBrchID_get(swigCPtr, this);
  }

  public CThostFtdcQryTransferBankField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcQryTransferBankField(), true);
  }

}
