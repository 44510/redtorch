/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19t1v.api;

public class CThostFtdcManualSyncBrokerUserOTPField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcManualSyncBrokerUserOTPField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcManualSyncBrokerUserOTPField obj) {
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
        jctpv6v3v19t1x64apiJNI.delete_CThostFtdcManualSyncBrokerUserOTPField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcManualSyncBrokerUserOTPField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcManualSyncBrokerUserOTPField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcManualSyncBrokerUserOTPField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcManualSyncBrokerUserOTPField_UserID_get(swigCPtr, this);
  }

  public void setOTPType(char value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcManualSyncBrokerUserOTPField_OTPType_set(swigCPtr, this, value);
  }

  public char getOTPType() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcManualSyncBrokerUserOTPField_OTPType_get(swigCPtr, this);
  }

  public void setFirstOTP(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcManualSyncBrokerUserOTPField_FirstOTP_set(swigCPtr, this, value);
  }

  public String getFirstOTP() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcManualSyncBrokerUserOTPField_FirstOTP_get(swigCPtr, this);
  }

  public void setSecondOTP(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcManualSyncBrokerUserOTPField_SecondOTP_set(swigCPtr, this, value);
  }

  public String getSecondOTP() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcManualSyncBrokerUserOTPField_SecondOTP_get(swigCPtr, this);
  }

  public CThostFtdcManualSyncBrokerUserOTPField() {
    this(jctpv6v3v19t1x64apiJNI.new_CThostFtdcManualSyncBrokerUserOTPField(), true);
  }

}
