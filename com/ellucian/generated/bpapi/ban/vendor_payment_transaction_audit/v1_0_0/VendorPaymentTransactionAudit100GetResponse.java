
package com.ellucian.generated.bpapi.ban.vendor_payment_transaction_audit.v1_0_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "procCode",
    "payTransId",
    "vendorAuthCode",
    "applNo",
    "successUrl",
    "giftNo",
    "updateFunction",
    "failureUrl",
    "bannerStatus",
    "activityDate",
    "merchantId",
    "subCode",
    "sysiCode",
    "vendorStatus",
    "location",
    "applicationData",
    "detail",
    "id",
    "vendorErrorMsg",
    "vendorReferNo",
    "status",
    "termCode"
})
@Generated("jsonschema2pojo")
public class VendorPaymentTransactionAudit100GetResponse {

    /**
     * Amount
     * <p>
     * Lineage reference object : GORCCAU_AMOUNT
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_AMOUNT")
    private Double amount;
    /**
     * Process
     * <p>
     * Lineage reference object : GORCCAU_PROC_CODE
     * 
     */
    @JsonProperty("procCode")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_PROC_CODE")
    private String procCode;
    /**
     * Transaction ID
     * <p>
     * Lineage reference object : GORCCAU_PAY_TRANS_ID
     * 
     */
    @JsonProperty("payTransId")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_PAY_TRANS_ID")
    private Double payTransId;
    /**
     * Auth Code
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_AUTH_CODE
     * 
     */
    @JsonProperty("vendorAuthCode")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_VENDOR_AUTH_CODE")
    private String vendorAuthCode;
    /**
     * Application
     * <p>
     * Lineage reference object : GORCCAU_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_APPL_NO")
    private Double applNo;
    /**
     * Success URL
     * <p>
     * Lineage reference object : GORCCAU_SUCCESS_URL
     * 
     */
    @JsonProperty("successUrl")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_SUCCESS_URL")
    private String successUrl;
    /**
     * Gift No
     * <p>
     * Lineage reference object : GORCCAU_GIFT_NO
     * 
     */
    @JsonProperty("giftNo")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_GIFT_NO")
    private String giftNo;
    /**
     * Update Function
     * <p>
     * Lineage reference object : GORCCAU_UPDATE_FUNCTION
     * 
     */
    @JsonProperty("updateFunction")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_UPDATE_FUNCTION")
    private String updateFunction;
    /**
     * Failure URL
     * <p>
     * Lineage reference object : GORCCAU_FAILURE_URL
     * 
     */
    @JsonProperty("failureUrl")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_FAILURE_URL")
    private String failureUrl;
    /**
     * Banner Status
     * <p>
     * Lineage reference object : GORCCAU_BANNER_STATUS
     * 
     */
    @JsonProperty("bannerStatus")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_BANNER_STATUS")
    private String bannerStatus;
    /**
     * Date
     * <p>
     * Lineage reference object : GORCCAU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Merchant
     * <p>
     * Lineage reference object : GORCCAU_MERCHANT_ID
     * 
     */
    @JsonProperty("merchantId")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_MERCHANT_ID")
    private String merchantId;
    /**
     * Sub Code
     * <p>
     * Lineage reference object : GORCCAU_SUB_CODE
     * 
     */
    @JsonProperty("subCode")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_SUB_CODE")
    private String subCode;
    /**
     * System
     * <p>
     * Lineage reference object : GORCCAU_SYSI_CODE
     * 
     */
    @JsonProperty("sysiCode")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_SYSI_CODE")
    private String sysiCode;
    /**
     * Vendor Status
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_STATUS
     * 
     */
    @JsonProperty("vendorStatus")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_VENDOR_STATUS")
    private String vendorStatus;
    /**
     * Location
     * <p>
     * Lineage reference object : GORCCAU_LOCATION
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_LOCATION")
    private String location;
    /**
     * Appl Data
     * <p>
     * Lineage reference object : GORCCAU_APPLICATION_DATA
     * 
     */
    @JsonProperty("applicationData")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_APPLICATION_DATA")
    private String applicationData;
    /**
     * Pay Card
     * <p>
     * Lineage reference object : GORCCAU_DETAIL
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_DETAIL")
    private String detail;
    /**
     * ID
     * <p>
     * Lineage reference object : GORCCAU_ID
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_ID")
    private String id;
    /**
     * Vendor Message
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_ERROR_MSG
     * 
     */
    @JsonProperty("vendorErrorMsg")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_VENDOR_ERROR_MSG")
    private String vendorErrorMsg;
    /**
     * Ref No
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_REFER_NO
     * 
     */
    @JsonProperty("vendorReferNo")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_VENDOR_REFER_NO")
    private String vendorReferNo;
    /**
     * Status
     * <p>
     * Lineage reference object : GORCCAU_STATUS
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_STATUS")
    private String status;
    /**
     * Term
     * <p>
     * Lineage reference object : GORCCAU_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : GORCCAU_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Amount
     * <p>
     * Lineage reference object : GORCCAU_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : GORCCAU_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public VendorPaymentTransactionAudit100GetResponse withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Process
     * <p>
     * Lineage reference object : GORCCAU_PROC_CODE
     * 
     */
    @JsonProperty("procCode")
    public String getProcCode() {
        return procCode;
    }

    /**
     * Process
     * <p>
     * Lineage reference object : GORCCAU_PROC_CODE
     * 
     */
    @JsonProperty("procCode")
    public void setProcCode(String procCode) {
        this.procCode = procCode;
    }

    public VendorPaymentTransactionAudit100GetResponse withProcCode(String procCode) {
        this.procCode = procCode;
        return this;
    }

    /**
     * Transaction ID
     * <p>
     * Lineage reference object : GORCCAU_PAY_TRANS_ID
     * 
     */
    @JsonProperty("payTransId")
    public Double getPayTransId() {
        return payTransId;
    }

    /**
     * Transaction ID
     * <p>
     * Lineage reference object : GORCCAU_PAY_TRANS_ID
     * 
     */
    @JsonProperty("payTransId")
    public void setPayTransId(Double payTransId) {
        this.payTransId = payTransId;
    }

    public VendorPaymentTransactionAudit100GetResponse withPayTransId(Double payTransId) {
        this.payTransId = payTransId;
        return this;
    }

    /**
     * Auth Code
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_AUTH_CODE
     * 
     */
    @JsonProperty("vendorAuthCode")
    public String getVendorAuthCode() {
        return vendorAuthCode;
    }

    /**
     * Auth Code
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_AUTH_CODE
     * 
     */
    @JsonProperty("vendorAuthCode")
    public void setVendorAuthCode(String vendorAuthCode) {
        this.vendorAuthCode = vendorAuthCode;
    }

    public VendorPaymentTransactionAudit100GetResponse withVendorAuthCode(String vendorAuthCode) {
        this.vendorAuthCode = vendorAuthCode;
        return this;
    }

    /**
     * Application
     * <p>
     * Lineage reference object : GORCCAU_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    public Double getApplNo() {
        return applNo;
    }

    /**
     * Application
     * <p>
     * Lineage reference object : GORCCAU_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    public void setApplNo(Double applNo) {
        this.applNo = applNo;
    }

    public VendorPaymentTransactionAudit100GetResponse withApplNo(Double applNo) {
        this.applNo = applNo;
        return this;
    }

    /**
     * Success URL
     * <p>
     * Lineage reference object : GORCCAU_SUCCESS_URL
     * 
     */
    @JsonProperty("successUrl")
    public String getSuccessUrl() {
        return successUrl;
    }

    /**
     * Success URL
     * <p>
     * Lineage reference object : GORCCAU_SUCCESS_URL
     * 
     */
    @JsonProperty("successUrl")
    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    public VendorPaymentTransactionAudit100GetResponse withSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
        return this;
    }

    /**
     * Gift No
     * <p>
     * Lineage reference object : GORCCAU_GIFT_NO
     * 
     */
    @JsonProperty("giftNo")
    public String getGiftNo() {
        return giftNo;
    }

    /**
     * Gift No
     * <p>
     * Lineage reference object : GORCCAU_GIFT_NO
     * 
     */
    @JsonProperty("giftNo")
    public void setGiftNo(String giftNo) {
        this.giftNo = giftNo;
    }

    public VendorPaymentTransactionAudit100GetResponse withGiftNo(String giftNo) {
        this.giftNo = giftNo;
        return this;
    }

    /**
     * Update Function
     * <p>
     * Lineage reference object : GORCCAU_UPDATE_FUNCTION
     * 
     */
    @JsonProperty("updateFunction")
    public String getUpdateFunction() {
        return updateFunction;
    }

    /**
     * Update Function
     * <p>
     * Lineage reference object : GORCCAU_UPDATE_FUNCTION
     * 
     */
    @JsonProperty("updateFunction")
    public void setUpdateFunction(String updateFunction) {
        this.updateFunction = updateFunction;
    }

    public VendorPaymentTransactionAudit100GetResponse withUpdateFunction(String updateFunction) {
        this.updateFunction = updateFunction;
        return this;
    }

    /**
     * Failure URL
     * <p>
     * Lineage reference object : GORCCAU_FAILURE_URL
     * 
     */
    @JsonProperty("failureUrl")
    public String getFailureUrl() {
        return failureUrl;
    }

    /**
     * Failure URL
     * <p>
     * Lineage reference object : GORCCAU_FAILURE_URL
     * 
     */
    @JsonProperty("failureUrl")
    public void setFailureUrl(String failureUrl) {
        this.failureUrl = failureUrl;
    }

    public VendorPaymentTransactionAudit100GetResponse withFailureUrl(String failureUrl) {
        this.failureUrl = failureUrl;
        return this;
    }

    /**
     * Banner Status
     * <p>
     * Lineage reference object : GORCCAU_BANNER_STATUS
     * 
     */
    @JsonProperty("bannerStatus")
    public String getBannerStatus() {
        return bannerStatus;
    }

    /**
     * Banner Status
     * <p>
     * Lineage reference object : GORCCAU_BANNER_STATUS
     * 
     */
    @JsonProperty("bannerStatus")
    public void setBannerStatus(String bannerStatus) {
        this.bannerStatus = bannerStatus;
    }

    public VendorPaymentTransactionAudit100GetResponse withBannerStatus(String bannerStatus) {
        this.bannerStatus = bannerStatus;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : GORCCAU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : GORCCAU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public VendorPaymentTransactionAudit100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Merchant
     * <p>
     * Lineage reference object : GORCCAU_MERCHANT_ID
     * 
     */
    @JsonProperty("merchantId")
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Merchant
     * <p>
     * Lineage reference object : GORCCAU_MERCHANT_ID
     * 
     */
    @JsonProperty("merchantId")
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public VendorPaymentTransactionAudit100GetResponse withMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }

    /**
     * Sub Code
     * <p>
     * Lineage reference object : GORCCAU_SUB_CODE
     * 
     */
    @JsonProperty("subCode")
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sub Code
     * <p>
     * Lineage reference object : GORCCAU_SUB_CODE
     * 
     */
    @JsonProperty("subCode")
    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public VendorPaymentTransactionAudit100GetResponse withSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : GORCCAU_SYSI_CODE
     * 
     */
    @JsonProperty("sysiCode")
    public String getSysiCode() {
        return sysiCode;
    }

    /**
     * System
     * <p>
     * Lineage reference object : GORCCAU_SYSI_CODE
     * 
     */
    @JsonProperty("sysiCode")
    public void setSysiCode(String sysiCode) {
        this.sysiCode = sysiCode;
    }

    public VendorPaymentTransactionAudit100GetResponse withSysiCode(String sysiCode) {
        this.sysiCode = sysiCode;
        return this;
    }

    /**
     * Vendor Status
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_STATUS
     * 
     */
    @JsonProperty("vendorStatus")
    public String getVendorStatus() {
        return vendorStatus;
    }

    /**
     * Vendor Status
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_STATUS
     * 
     */
    @JsonProperty("vendorStatus")
    public void setVendorStatus(String vendorStatus) {
        this.vendorStatus = vendorStatus;
    }

    public VendorPaymentTransactionAudit100GetResponse withVendorStatus(String vendorStatus) {
        this.vendorStatus = vendorStatus;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : GORCCAU_LOCATION
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : GORCCAU_LOCATION
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public VendorPaymentTransactionAudit100GetResponse withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Appl Data
     * <p>
     * Lineage reference object : GORCCAU_APPLICATION_DATA
     * 
     */
    @JsonProperty("applicationData")
    public String getApplicationData() {
        return applicationData;
    }

    /**
     * Appl Data
     * <p>
     * Lineage reference object : GORCCAU_APPLICATION_DATA
     * 
     */
    @JsonProperty("applicationData")
    public void setApplicationData(String applicationData) {
        this.applicationData = applicationData;
    }

    public VendorPaymentTransactionAudit100GetResponse withApplicationData(String applicationData) {
        this.applicationData = applicationData;
        return this;
    }

    /**
     * Pay Card
     * <p>
     * Lineage reference object : GORCCAU_DETAIL
     * 
     */
    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    /**
     * Pay Card
     * <p>
     * Lineage reference object : GORCCAU_DETAIL
     * 
     */
    @JsonProperty("detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public VendorPaymentTransactionAudit100GetResponse withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : GORCCAU_ID
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : GORCCAU_ID
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public VendorPaymentTransactionAudit100GetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Vendor Message
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_ERROR_MSG
     * 
     */
    @JsonProperty("vendorErrorMsg")
    public String getVendorErrorMsg() {
        return vendorErrorMsg;
    }

    /**
     * Vendor Message
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_ERROR_MSG
     * 
     */
    @JsonProperty("vendorErrorMsg")
    public void setVendorErrorMsg(String vendorErrorMsg) {
        this.vendorErrorMsg = vendorErrorMsg;
    }

    public VendorPaymentTransactionAudit100GetResponse withVendorErrorMsg(String vendorErrorMsg) {
        this.vendorErrorMsg = vendorErrorMsg;
        return this;
    }

    /**
     * Ref No
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_REFER_NO
     * 
     */
    @JsonProperty("vendorReferNo")
    public String getVendorReferNo() {
        return vendorReferNo;
    }

    /**
     * Ref No
     * <p>
     * Lineage reference object : GORCCAU_VENDOR_REFER_NO
     * 
     */
    @JsonProperty("vendorReferNo")
    public void setVendorReferNo(String vendorReferNo) {
        this.vendorReferNo = vendorReferNo;
    }

    public VendorPaymentTransactionAudit100GetResponse withVendorReferNo(String vendorReferNo) {
        this.vendorReferNo = vendorReferNo;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : GORCCAU_STATUS
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : GORCCAU_STATUS
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public VendorPaymentTransactionAudit100GetResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : GORCCAU_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : GORCCAU_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public VendorPaymentTransactionAudit100GetResponse withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public VendorPaymentTransactionAudit100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorPaymentTransactionAudit100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("procCode");
        sb.append('=');
        sb.append(((this.procCode == null)?"<null>":this.procCode));
        sb.append(',');
        sb.append("payTransId");
        sb.append('=');
        sb.append(((this.payTransId == null)?"<null>":this.payTransId));
        sb.append(',');
        sb.append("vendorAuthCode");
        sb.append('=');
        sb.append(((this.vendorAuthCode == null)?"<null>":this.vendorAuthCode));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("successUrl");
        sb.append('=');
        sb.append(((this.successUrl == null)?"<null>":this.successUrl));
        sb.append(',');
        sb.append("giftNo");
        sb.append('=');
        sb.append(((this.giftNo == null)?"<null>":this.giftNo));
        sb.append(',');
        sb.append("updateFunction");
        sb.append('=');
        sb.append(((this.updateFunction == null)?"<null>":this.updateFunction));
        sb.append(',');
        sb.append("failureUrl");
        sb.append('=');
        sb.append(((this.failureUrl == null)?"<null>":this.failureUrl));
        sb.append(',');
        sb.append("bannerStatus");
        sb.append('=');
        sb.append(((this.bannerStatus == null)?"<null>":this.bannerStatus));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("merchantId");
        sb.append('=');
        sb.append(((this.merchantId == null)?"<null>":this.merchantId));
        sb.append(',');
        sb.append("subCode");
        sb.append('=');
        sb.append(((this.subCode == null)?"<null>":this.subCode));
        sb.append(',');
        sb.append("sysiCode");
        sb.append('=');
        sb.append(((this.sysiCode == null)?"<null>":this.sysiCode));
        sb.append(',');
        sb.append("vendorStatus");
        sb.append('=');
        sb.append(((this.vendorStatus == null)?"<null>":this.vendorStatus));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("applicationData");
        sb.append('=');
        sb.append(((this.applicationData == null)?"<null>":this.applicationData));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("vendorErrorMsg");
        sb.append('=');
        sb.append(((this.vendorErrorMsg == null)?"<null>":this.vendorErrorMsg));
        sb.append(',');
        sb.append("vendorReferNo");
        sb.append('=');
        sb.append(((this.vendorReferNo == null)?"<null>":this.vendorReferNo));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.payTransId == null)? 0 :this.payTransId.hashCode()));
        result = ((result* 31)+((this.vendorAuthCode == null)? 0 :this.vendorAuthCode.hashCode()));
        result = ((result* 31)+((this.failureUrl == null)? 0 :this.failureUrl.hashCode()));
        result = ((result* 31)+((this.bannerStatus == null)? 0 :this.bannerStatus.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.merchantId == null)? 0 :this.merchantId.hashCode()));
        result = ((result* 31)+((this.subCode == null)? 0 :this.subCode.hashCode()));
        result = ((result* 31)+((this.sysiCode == null)? 0 :this.sysiCode.hashCode()));
        result = ((result* 31)+((this.vendorStatus == null)? 0 :this.vendorStatus.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.procCode == null)? 0 :this.procCode.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.successUrl == null)? 0 :this.successUrl.hashCode()));
        result = ((result* 31)+((this.giftNo == null)? 0 :this.giftNo.hashCode()));
        result = ((result* 31)+((this.updateFunction == null)? 0 :this.updateFunction.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.applicationData == null)? 0 :this.applicationData.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.vendorErrorMsg == null)? 0 :this.vendorErrorMsg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vendorReferNo == null)? 0 :this.vendorReferNo.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorPaymentTransactionAudit100GetResponse) == false) {
            return false;
        }
        VendorPaymentTransactionAudit100GetResponse rhs = ((VendorPaymentTransactionAudit100GetResponse) other);
        return (((((((((((((((((((((((((this.payTransId == rhs.payTransId)||((this.payTransId!= null)&&this.payTransId.equals(rhs.payTransId)))&&((this.vendorAuthCode == rhs.vendorAuthCode)||((this.vendorAuthCode!= null)&&this.vendorAuthCode.equals(rhs.vendorAuthCode))))&&((this.failureUrl == rhs.failureUrl)||((this.failureUrl!= null)&&this.failureUrl.equals(rhs.failureUrl))))&&((this.bannerStatus == rhs.bannerStatus)||((this.bannerStatus!= null)&&this.bannerStatus.equals(rhs.bannerStatus))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.merchantId == rhs.merchantId)||((this.merchantId!= null)&&this.merchantId.equals(rhs.merchantId))))&&((this.subCode == rhs.subCode)||((this.subCode!= null)&&this.subCode.equals(rhs.subCode))))&&((this.sysiCode == rhs.sysiCode)||((this.sysiCode!= null)&&this.sysiCode.equals(rhs.sysiCode))))&&((this.vendorStatus == rhs.vendorStatus)||((this.vendorStatus!= null)&&this.vendorStatus.equals(rhs.vendorStatus))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.procCode == rhs.procCode)||((this.procCode!= null)&&this.procCode.equals(rhs.procCode))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.successUrl == rhs.successUrl)||((this.successUrl!= null)&&this.successUrl.equals(rhs.successUrl))))&&((this.giftNo == rhs.giftNo)||((this.giftNo!= null)&&this.giftNo.equals(rhs.giftNo))))&&((this.updateFunction == rhs.updateFunction)||((this.updateFunction!= null)&&this.updateFunction.equals(rhs.updateFunction))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.applicationData == rhs.applicationData)||((this.applicationData!= null)&&this.applicationData.equals(rhs.applicationData))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.vendorErrorMsg == rhs.vendorErrorMsg)||((this.vendorErrorMsg!= null)&&this.vendorErrorMsg.equals(rhs.vendorErrorMsg))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vendorReferNo == rhs.vendorReferNo)||((this.vendorReferNo!= null)&&this.vendorReferNo.equals(rhs.vendorReferNo))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
