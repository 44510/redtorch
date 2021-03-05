/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1v.api;

public class CThostFtdcReqOpenAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqOpenAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqOpenAccountField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcReqOpenAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setCashExchangeCode(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_CashExchangeCode_set(swigCPtr, this, value);
  }

  public char getCashExchangeCode() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_CashExchangeCode_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_OperNo_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_TID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_UserID_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return jctpv6v5v1x64apiJNI.CThostFtdcReqOpenAccountField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcReqOpenAccountField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcReqOpenAccountField(), true);
  }

}
