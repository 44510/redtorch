/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1v.api;

public class CThostFtdcReqApiHandshakeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqApiHandshakeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqApiHandshakeField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcReqApiHandshakeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCryptoKeyVersion(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqApiHandshakeField_CryptoKeyVersion_set(swigCPtr, this, value);
  }

  public String getCryptoKeyVersion() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqApiHandshakeField_CryptoKeyVersion_get(swigCPtr, this);
  }

  public CThostFtdcReqApiHandshakeField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcReqApiHandshakeField(), true);
  }

}
