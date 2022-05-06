
package com.ellucian.generated.bpapi.ban.user_profile_maintenance.v1_0_0;

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
    "requestorPhoneNumber",
    "requestorPhoneExt",
    "requestorFaxNumber",
    "coasCode",
    "rcvdToleranceQty",
    "userId",
    "wbudMstrFundInd",
    "requestorEmailAddr",
    "rcvdToleranceAmtPct",
    "ctryCodeReqPhone",
    "requestorFaxArea",
    "budId",
    "requestorFaxExt",
    "wbudMstrOrgnInd",
    "requestorPhoneArea",
    "reqMatchOvrrdInd",
    "rcvdToleranceAmt",
    "requesterOrgnCode",
    "ctryCodeReqFax"
})
@Generated("jsonschema2pojo")
public class UserProfileMaintenance100PutRequest {

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_PHONE_NUMBER
     * 
     */
    @JsonProperty("requestorPhoneNumber")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_REQUESTOR_PHONE_NUMBER")
    private String requestorPhoneNumber;
    /**
     * Extension
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_PHONE_EXT
     * 
     */
    @JsonProperty("requestorPhoneExt")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_REQUESTOR_PHONE_EXT")
    private String requestorPhoneExt;
    /**
     * Phone
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_FAX_NUMBER
     * 
     */
    @JsonProperty("requestorFaxNumber")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_REQUESTOR_FAX_NUMBER")
    private String requestorFaxNumber;
    /**
     * COA
     * <p>
     * Lineage reference object : FOBPROF_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Receiving Quantity Overage Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_QTY
     * 
     */
    @JsonProperty("rcvdToleranceQty")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_RCVD_TOLERANCE_QTY")
    private Double rcvdToleranceQty;
    /**
     * User ID
     * <p>
     * Lineage reference object : keyBlockUserId, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : keyBlockUserId, Lookup lineage reference object : all_users")
    private Object userId;
    /**
     * Budget Master Fund
     * <p>
     * Lineage reference object : FOBPROF_WBUD_MSTR_FUND_IND
     * (Required)
     * 
     */
    @JsonProperty("wbudMstrFundInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_WBUD_MSTR_FUND_IND")
    private String wbudMstrFundInd;
    /**
     * Email
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_EMAIL_ADDR
     * 
     */
    @JsonProperty("requestorEmailAddr")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_REQUESTOR_EMAIL_ADDR")
    private String requestorEmailAddr;
    /**
     * Receiving Amount Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_AMT_PCT
     * 
     */
    @JsonProperty("rcvdToleranceAmtPct")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_RCVD_TOLERANCE_AMT_PCT")
    private Double rcvdToleranceAmtPct;
    /**
     * Country Code
     * <p>
     * Lineage reference object : FOBPROF_CTRY_CODE_REQ_PHONE
     * 
     */
    @JsonProperty("ctryCodeReqPhone")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_CTRY_CODE_REQ_PHONE")
    private String ctryCodeReqPhone;
    /**
     * Fax
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_FAX_AREA
     * 
     */
    @JsonProperty("requestorFaxArea")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_REQUESTOR_FAX_AREA")
    private String requestorFaxArea;
    /**
     * Budget ID
     * <p>
     * Lineage reference object : FOBPROF_BUD_ID, Lookup lineage reference object : ftvobud
     * 
     */
    @JsonProperty("budId")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_BUD_ID, Lookup lineage reference object : ftvobud")
    private String budId;
    /**
     * Lineage reference object : FOBPROF_REQUESTOR_FAX_EXT
     * 
     */
    @JsonProperty("requestorFaxExt")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_REQUESTOR_FAX_EXT")
    private String requestorFaxExt;
    /**
     * Budget Master Organization
     * <p>
     * Lineage reference object : FOBPROF_WBUD_MSTR_ORGN_IND
     * (Required)
     * 
     */
    @JsonProperty("wbudMstrOrgnInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_WBUD_MSTR_ORGN_IND")
    private String wbudMstrOrgnInd;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_PHONE_AREA
     * 
     */
    @JsonProperty("requestorPhoneArea")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_REQUESTOR_PHONE_AREA")
    private String requestorPhoneArea;
    /**
     * Requisition Receipt Required Override
     * <p>
     * Lineage reference object : FOBPROF_REQ_MATCH_OVRRD_IND
     * 
     */
    @JsonProperty("reqMatchOvrrdInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_REQ_MATCH_OVRRD_IND")
    private String reqMatchOvrrdInd;
    /**
     * Receiving Quantity Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_AMT
     * 
     */
    @JsonProperty("rcvdToleranceAmt")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_RCVD_TOLERANCE_AMT")
    private Double rcvdToleranceAmt;
    /**
     * Organization
     * <p>
     * Lineage reference object : FOBPROF_REQUESTER_ORGN_CODE
     * 
     */
    @JsonProperty("requesterOrgnCode")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_REQUESTER_ORGN_CODE")
    private String requesterOrgnCode;
    /**
     * Lineage reference object : FOBPROF_CTRY_CODE_REQ_FAX
     * 
     */
    @JsonProperty("ctryCodeReqFax")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_CTRY_CODE_REQ_FAX")
    private String ctryCodeReqFax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_PHONE_NUMBER
     * 
     */
    @JsonProperty("requestorPhoneNumber")
    public String getRequestorPhoneNumber() {
        return requestorPhoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_PHONE_NUMBER
     * 
     */
    @JsonProperty("requestorPhoneNumber")
    public void setRequestorPhoneNumber(String requestorPhoneNumber) {
        this.requestorPhoneNumber = requestorPhoneNumber;
    }

    public UserProfileMaintenance100PutRequest withRequestorPhoneNumber(String requestorPhoneNumber) {
        this.requestorPhoneNumber = requestorPhoneNumber;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_PHONE_EXT
     * 
     */
    @JsonProperty("requestorPhoneExt")
    public String getRequestorPhoneExt() {
        return requestorPhoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_PHONE_EXT
     * 
     */
    @JsonProperty("requestorPhoneExt")
    public void setRequestorPhoneExt(String requestorPhoneExt) {
        this.requestorPhoneExt = requestorPhoneExt;
    }

    public UserProfileMaintenance100PutRequest withRequestorPhoneExt(String requestorPhoneExt) {
        this.requestorPhoneExt = requestorPhoneExt;
        return this;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_FAX_NUMBER
     * 
     */
    @JsonProperty("requestorFaxNumber")
    public String getRequestorFaxNumber() {
        return requestorFaxNumber;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_FAX_NUMBER
     * 
     */
    @JsonProperty("requestorFaxNumber")
    public void setRequestorFaxNumber(String requestorFaxNumber) {
        this.requestorFaxNumber = requestorFaxNumber;
    }

    public UserProfileMaintenance100PutRequest withRequestorFaxNumber(String requestorFaxNumber) {
        this.requestorFaxNumber = requestorFaxNumber;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FOBPROF_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FOBPROF_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public UserProfileMaintenance100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Receiving Quantity Overage Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_QTY
     * 
     */
    @JsonProperty("rcvdToleranceQty")
    public Double getRcvdToleranceQty() {
        return rcvdToleranceQty;
    }

    /**
     * Receiving Quantity Overage Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_QTY
     * 
     */
    @JsonProperty("rcvdToleranceQty")
    public void setRcvdToleranceQty(Double rcvdToleranceQty) {
        this.rcvdToleranceQty = rcvdToleranceQty;
    }

    public UserProfileMaintenance100PutRequest withRcvdToleranceQty(Double rcvdToleranceQty) {
        this.rcvdToleranceQty = rcvdToleranceQty;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : keyBlockUserId, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public Object getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : keyBlockUserId, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public UserProfileMaintenance100PutRequest withUserId(Object userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Budget Master Fund
     * <p>
     * Lineage reference object : FOBPROF_WBUD_MSTR_FUND_IND
     * (Required)
     * 
     */
    @JsonProperty("wbudMstrFundInd")
    public String getWbudMstrFundInd() {
        return wbudMstrFundInd;
    }

    /**
     * Budget Master Fund
     * <p>
     * Lineage reference object : FOBPROF_WBUD_MSTR_FUND_IND
     * (Required)
     * 
     */
    @JsonProperty("wbudMstrFundInd")
    public void setWbudMstrFundInd(String wbudMstrFundInd) {
        this.wbudMstrFundInd = wbudMstrFundInd;
    }

    public UserProfileMaintenance100PutRequest withWbudMstrFundInd(String wbudMstrFundInd) {
        this.wbudMstrFundInd = wbudMstrFundInd;
        return this;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_EMAIL_ADDR
     * 
     */
    @JsonProperty("requestorEmailAddr")
    public String getRequestorEmailAddr() {
        return requestorEmailAddr;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_EMAIL_ADDR
     * 
     */
    @JsonProperty("requestorEmailAddr")
    public void setRequestorEmailAddr(String requestorEmailAddr) {
        this.requestorEmailAddr = requestorEmailAddr;
    }

    public UserProfileMaintenance100PutRequest withRequestorEmailAddr(String requestorEmailAddr) {
        this.requestorEmailAddr = requestorEmailAddr;
        return this;
    }

    /**
     * Receiving Amount Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_AMT_PCT
     * 
     */
    @JsonProperty("rcvdToleranceAmtPct")
    public Double getRcvdToleranceAmtPct() {
        return rcvdToleranceAmtPct;
    }

    /**
     * Receiving Amount Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_AMT_PCT
     * 
     */
    @JsonProperty("rcvdToleranceAmtPct")
    public void setRcvdToleranceAmtPct(Double rcvdToleranceAmtPct) {
        this.rcvdToleranceAmtPct = rcvdToleranceAmtPct;
    }

    public UserProfileMaintenance100PutRequest withRcvdToleranceAmtPct(Double rcvdToleranceAmtPct) {
        this.rcvdToleranceAmtPct = rcvdToleranceAmtPct;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FOBPROF_CTRY_CODE_REQ_PHONE
     * 
     */
    @JsonProperty("ctryCodeReqPhone")
    public String getCtryCodeReqPhone() {
        return ctryCodeReqPhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FOBPROF_CTRY_CODE_REQ_PHONE
     * 
     */
    @JsonProperty("ctryCodeReqPhone")
    public void setCtryCodeReqPhone(String ctryCodeReqPhone) {
        this.ctryCodeReqPhone = ctryCodeReqPhone;
    }

    public UserProfileMaintenance100PutRequest withCtryCodeReqPhone(String ctryCodeReqPhone) {
        this.ctryCodeReqPhone = ctryCodeReqPhone;
        return this;
    }

    /**
     * Fax
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_FAX_AREA
     * 
     */
    @JsonProperty("requestorFaxArea")
    public String getRequestorFaxArea() {
        return requestorFaxArea;
    }

    /**
     * Fax
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_FAX_AREA
     * 
     */
    @JsonProperty("requestorFaxArea")
    public void setRequestorFaxArea(String requestorFaxArea) {
        this.requestorFaxArea = requestorFaxArea;
    }

    public UserProfileMaintenance100PutRequest withRequestorFaxArea(String requestorFaxArea) {
        this.requestorFaxArea = requestorFaxArea;
        return this;
    }

    /**
     * Budget ID
     * <p>
     * Lineage reference object : FOBPROF_BUD_ID, Lookup lineage reference object : ftvobud
     * 
     */
    @JsonProperty("budId")
    public String getBudId() {
        return budId;
    }

    /**
     * Budget ID
     * <p>
     * Lineage reference object : FOBPROF_BUD_ID, Lookup lineage reference object : ftvobud
     * 
     */
    @JsonProperty("budId")
    public void setBudId(String budId) {
        this.budId = budId;
    }

    public UserProfileMaintenance100PutRequest withBudId(String budId) {
        this.budId = budId;
        return this;
    }

    /**
     * Lineage reference object : FOBPROF_REQUESTOR_FAX_EXT
     * 
     */
    @JsonProperty("requestorFaxExt")
    public String getRequestorFaxExt() {
        return requestorFaxExt;
    }

    /**
     * Lineage reference object : FOBPROF_REQUESTOR_FAX_EXT
     * 
     */
    @JsonProperty("requestorFaxExt")
    public void setRequestorFaxExt(String requestorFaxExt) {
        this.requestorFaxExt = requestorFaxExt;
    }

    public UserProfileMaintenance100PutRequest withRequestorFaxExt(String requestorFaxExt) {
        this.requestorFaxExt = requestorFaxExt;
        return this;
    }

    /**
     * Budget Master Organization
     * <p>
     * Lineage reference object : FOBPROF_WBUD_MSTR_ORGN_IND
     * (Required)
     * 
     */
    @JsonProperty("wbudMstrOrgnInd")
    public String getWbudMstrOrgnInd() {
        return wbudMstrOrgnInd;
    }

    /**
     * Budget Master Organization
     * <p>
     * Lineage reference object : FOBPROF_WBUD_MSTR_ORGN_IND
     * (Required)
     * 
     */
    @JsonProperty("wbudMstrOrgnInd")
    public void setWbudMstrOrgnInd(String wbudMstrOrgnInd) {
        this.wbudMstrOrgnInd = wbudMstrOrgnInd;
    }

    public UserProfileMaintenance100PutRequest withWbudMstrOrgnInd(String wbudMstrOrgnInd) {
        this.wbudMstrOrgnInd = wbudMstrOrgnInd;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_PHONE_AREA
     * 
     */
    @JsonProperty("requestorPhoneArea")
    public String getRequestorPhoneArea() {
        return requestorPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_PHONE_AREA
     * 
     */
    @JsonProperty("requestorPhoneArea")
    public void setRequestorPhoneArea(String requestorPhoneArea) {
        this.requestorPhoneArea = requestorPhoneArea;
    }

    public UserProfileMaintenance100PutRequest withRequestorPhoneArea(String requestorPhoneArea) {
        this.requestorPhoneArea = requestorPhoneArea;
        return this;
    }

    /**
     * Requisition Receipt Required Override
     * <p>
     * Lineage reference object : FOBPROF_REQ_MATCH_OVRRD_IND
     * 
     */
    @JsonProperty("reqMatchOvrrdInd")
    public String getReqMatchOvrrdInd() {
        return reqMatchOvrrdInd;
    }

    /**
     * Requisition Receipt Required Override
     * <p>
     * Lineage reference object : FOBPROF_REQ_MATCH_OVRRD_IND
     * 
     */
    @JsonProperty("reqMatchOvrrdInd")
    public void setReqMatchOvrrdInd(String reqMatchOvrrdInd) {
        this.reqMatchOvrrdInd = reqMatchOvrrdInd;
    }

    public UserProfileMaintenance100PutRequest withReqMatchOvrrdInd(String reqMatchOvrrdInd) {
        this.reqMatchOvrrdInd = reqMatchOvrrdInd;
        return this;
    }

    /**
     * Receiving Quantity Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_AMT
     * 
     */
    @JsonProperty("rcvdToleranceAmt")
    public Double getRcvdToleranceAmt() {
        return rcvdToleranceAmt;
    }

    /**
     * Receiving Quantity Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_AMT
     * 
     */
    @JsonProperty("rcvdToleranceAmt")
    public void setRcvdToleranceAmt(Double rcvdToleranceAmt) {
        this.rcvdToleranceAmt = rcvdToleranceAmt;
    }

    public UserProfileMaintenance100PutRequest withRcvdToleranceAmt(Double rcvdToleranceAmt) {
        this.rcvdToleranceAmt = rcvdToleranceAmt;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FOBPROF_REQUESTER_ORGN_CODE
     * 
     */
    @JsonProperty("requesterOrgnCode")
    public String getRequesterOrgnCode() {
        return requesterOrgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FOBPROF_REQUESTER_ORGN_CODE
     * 
     */
    @JsonProperty("requesterOrgnCode")
    public void setRequesterOrgnCode(String requesterOrgnCode) {
        this.requesterOrgnCode = requesterOrgnCode;
    }

    public UserProfileMaintenance100PutRequest withRequesterOrgnCode(String requesterOrgnCode) {
        this.requesterOrgnCode = requesterOrgnCode;
        return this;
    }

    /**
     * Lineage reference object : FOBPROF_CTRY_CODE_REQ_FAX
     * 
     */
    @JsonProperty("ctryCodeReqFax")
    public String getCtryCodeReqFax() {
        return ctryCodeReqFax;
    }

    /**
     * Lineage reference object : FOBPROF_CTRY_CODE_REQ_FAX
     * 
     */
    @JsonProperty("ctryCodeReqFax")
    public void setCtryCodeReqFax(String ctryCodeReqFax) {
        this.ctryCodeReqFax = ctryCodeReqFax;
    }

    public UserProfileMaintenance100PutRequest withCtryCodeReqFax(String ctryCodeReqFax) {
        this.ctryCodeReqFax = ctryCodeReqFax;
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

    public UserProfileMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserProfileMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requestorPhoneNumber");
        sb.append('=');
        sb.append(((this.requestorPhoneNumber == null)?"<null>":this.requestorPhoneNumber));
        sb.append(',');
        sb.append("requestorPhoneExt");
        sb.append('=');
        sb.append(((this.requestorPhoneExt == null)?"<null>":this.requestorPhoneExt));
        sb.append(',');
        sb.append("requestorFaxNumber");
        sb.append('=');
        sb.append(((this.requestorFaxNumber == null)?"<null>":this.requestorFaxNumber));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("rcvdToleranceQty");
        sb.append('=');
        sb.append(((this.rcvdToleranceQty == null)?"<null>":this.rcvdToleranceQty));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("wbudMstrFundInd");
        sb.append('=');
        sb.append(((this.wbudMstrFundInd == null)?"<null>":this.wbudMstrFundInd));
        sb.append(',');
        sb.append("requestorEmailAddr");
        sb.append('=');
        sb.append(((this.requestorEmailAddr == null)?"<null>":this.requestorEmailAddr));
        sb.append(',');
        sb.append("rcvdToleranceAmtPct");
        sb.append('=');
        sb.append(((this.rcvdToleranceAmtPct == null)?"<null>":this.rcvdToleranceAmtPct));
        sb.append(',');
        sb.append("ctryCodeReqPhone");
        sb.append('=');
        sb.append(((this.ctryCodeReqPhone == null)?"<null>":this.ctryCodeReqPhone));
        sb.append(',');
        sb.append("requestorFaxArea");
        sb.append('=');
        sb.append(((this.requestorFaxArea == null)?"<null>":this.requestorFaxArea));
        sb.append(',');
        sb.append("budId");
        sb.append('=');
        sb.append(((this.budId == null)?"<null>":this.budId));
        sb.append(',');
        sb.append("requestorFaxExt");
        sb.append('=');
        sb.append(((this.requestorFaxExt == null)?"<null>":this.requestorFaxExt));
        sb.append(',');
        sb.append("wbudMstrOrgnInd");
        sb.append('=');
        sb.append(((this.wbudMstrOrgnInd == null)?"<null>":this.wbudMstrOrgnInd));
        sb.append(',');
        sb.append("requestorPhoneArea");
        sb.append('=');
        sb.append(((this.requestorPhoneArea == null)?"<null>":this.requestorPhoneArea));
        sb.append(',');
        sb.append("reqMatchOvrrdInd");
        sb.append('=');
        sb.append(((this.reqMatchOvrrdInd == null)?"<null>":this.reqMatchOvrrdInd));
        sb.append(',');
        sb.append("rcvdToleranceAmt");
        sb.append('=');
        sb.append(((this.rcvdToleranceAmt == null)?"<null>":this.rcvdToleranceAmt));
        sb.append(',');
        sb.append("requesterOrgnCode");
        sb.append('=');
        sb.append(((this.requesterOrgnCode == null)?"<null>":this.requesterOrgnCode));
        sb.append(',');
        sb.append("ctryCodeReqFax");
        sb.append('=');
        sb.append(((this.ctryCodeReqFax == null)?"<null>":this.ctryCodeReqFax));
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
        result = ((result* 31)+((this.requestorPhoneNumber == null)? 0 :this.requestorPhoneNumber.hashCode()));
        result = ((result* 31)+((this.requestorPhoneExt == null)? 0 :this.requestorPhoneExt.hashCode()));
        result = ((result* 31)+((this.requestorFaxNumber == null)? 0 :this.requestorFaxNumber.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.rcvdToleranceQty == null)? 0 :this.rcvdToleranceQty.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.wbudMstrFundInd == null)? 0 :this.wbudMstrFundInd.hashCode()));
        result = ((result* 31)+((this.requestorEmailAddr == null)? 0 :this.requestorEmailAddr.hashCode()));
        result = ((result* 31)+((this.rcvdToleranceAmtPct == null)? 0 :this.rcvdToleranceAmtPct.hashCode()));
        result = ((result* 31)+((this.ctryCodeReqPhone == null)? 0 :this.ctryCodeReqPhone.hashCode()));
        result = ((result* 31)+((this.requestorFaxArea == null)? 0 :this.requestorFaxArea.hashCode()));
        result = ((result* 31)+((this.budId == null)? 0 :this.budId.hashCode()));
        result = ((result* 31)+((this.requestorFaxExt == null)? 0 :this.requestorFaxExt.hashCode()));
        result = ((result* 31)+((this.wbudMstrOrgnInd == null)? 0 :this.wbudMstrOrgnInd.hashCode()));
        result = ((result* 31)+((this.requestorPhoneArea == null)? 0 :this.requestorPhoneArea.hashCode()));
        result = ((result* 31)+((this.reqMatchOvrrdInd == null)? 0 :this.reqMatchOvrrdInd.hashCode()));
        result = ((result* 31)+((this.rcvdToleranceAmt == null)? 0 :this.rcvdToleranceAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.requesterOrgnCode == null)? 0 :this.requesterOrgnCode.hashCode()));
        result = ((result* 31)+((this.ctryCodeReqFax == null)? 0 :this.ctryCodeReqFax.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserProfileMaintenance100PutRequest) == false) {
            return false;
        }
        UserProfileMaintenance100PutRequest rhs = ((UserProfileMaintenance100PutRequest) other);
        return (((((((((((((((((((((this.requestorPhoneNumber == rhs.requestorPhoneNumber)||((this.requestorPhoneNumber!= null)&&this.requestorPhoneNumber.equals(rhs.requestorPhoneNumber)))&&((this.requestorPhoneExt == rhs.requestorPhoneExt)||((this.requestorPhoneExt!= null)&&this.requestorPhoneExt.equals(rhs.requestorPhoneExt))))&&((this.requestorFaxNumber == rhs.requestorFaxNumber)||((this.requestorFaxNumber!= null)&&this.requestorFaxNumber.equals(rhs.requestorFaxNumber))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.rcvdToleranceQty == rhs.rcvdToleranceQty)||((this.rcvdToleranceQty!= null)&&this.rcvdToleranceQty.equals(rhs.rcvdToleranceQty))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.wbudMstrFundInd == rhs.wbudMstrFundInd)||((this.wbudMstrFundInd!= null)&&this.wbudMstrFundInd.equals(rhs.wbudMstrFundInd))))&&((this.requestorEmailAddr == rhs.requestorEmailAddr)||((this.requestorEmailAddr!= null)&&this.requestorEmailAddr.equals(rhs.requestorEmailAddr))))&&((this.rcvdToleranceAmtPct == rhs.rcvdToleranceAmtPct)||((this.rcvdToleranceAmtPct!= null)&&this.rcvdToleranceAmtPct.equals(rhs.rcvdToleranceAmtPct))))&&((this.ctryCodeReqPhone == rhs.ctryCodeReqPhone)||((this.ctryCodeReqPhone!= null)&&this.ctryCodeReqPhone.equals(rhs.ctryCodeReqPhone))))&&((this.requestorFaxArea == rhs.requestorFaxArea)||((this.requestorFaxArea!= null)&&this.requestorFaxArea.equals(rhs.requestorFaxArea))))&&((this.budId == rhs.budId)||((this.budId!= null)&&this.budId.equals(rhs.budId))))&&((this.requestorFaxExt == rhs.requestorFaxExt)||((this.requestorFaxExt!= null)&&this.requestorFaxExt.equals(rhs.requestorFaxExt))))&&((this.wbudMstrOrgnInd == rhs.wbudMstrOrgnInd)||((this.wbudMstrOrgnInd!= null)&&this.wbudMstrOrgnInd.equals(rhs.wbudMstrOrgnInd))))&&((this.requestorPhoneArea == rhs.requestorPhoneArea)||((this.requestorPhoneArea!= null)&&this.requestorPhoneArea.equals(rhs.requestorPhoneArea))))&&((this.reqMatchOvrrdInd == rhs.reqMatchOvrrdInd)||((this.reqMatchOvrrdInd!= null)&&this.reqMatchOvrrdInd.equals(rhs.reqMatchOvrrdInd))))&&((this.rcvdToleranceAmt == rhs.rcvdToleranceAmt)||((this.rcvdToleranceAmt!= null)&&this.rcvdToleranceAmt.equals(rhs.rcvdToleranceAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.requesterOrgnCode == rhs.requesterOrgnCode)||((this.requesterOrgnCode!= null)&&this.requesterOrgnCode.equals(rhs.requesterOrgnCode))))&&((this.ctryCodeReqFax == rhs.ctryCodeReqFax)||((this.ctryCodeReqFax!= null)&&this.ctryCodeReqFax.equals(rhs.ctryCodeReqFax))));
    }

}
