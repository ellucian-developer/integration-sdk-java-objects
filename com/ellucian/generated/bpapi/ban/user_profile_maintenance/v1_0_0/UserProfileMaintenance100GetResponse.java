
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
    "requestorShipCode",
    "requestorPhoneExt",
    "coasCode",
    "ediOverrideInd",
    "invMatchOvrrdInd",
    "rcvdOverrideInd",
    "wbudMstrFundInd",
    "spridenId",
    "rcvdTolerancePct",
    "ftvshipBuilding",
    "nsfOverride",
    "maxToleranceAmt",
    "expEndPostAuthInd",
    "wbudMstrOrgnInd",
    "whrldAccessInd",
    "pmtHoldOvrdInd",
    "requesterOrgnCode",
    "ftvshipFloor",
    "tolerance",
    "ftvshipAddrLine2",
    "wbudAccessInd",
    "ftvshipAddrLine1",
    "orgnDesc",
    "masterFundInd",
    "requestorPhoneNumber",
    "ftvshipAddrLine3",
    "requestorFaxNumber",
    "masterOrgnInd",
    "accrualPostAuthInd",
    "rcvdToleranceQty",
    "fullName",
    "ftvshipContact",
    "webAccessInd",
    "userName",
    "requestorEmailAddr",
    "rcvdToleranceAmtPct",
    "cardOverrideInd",
    "tolOverrideInd",
    "requestorFaxArea",
    "budId",
    "requestorFaxExt",
    "poMatchOvrrdInd",
    "requestorPhoneArea",
    "achOverrideInd",
    "rcvdToleranceAmt",
    "reqMatchOvrrdInd",
    "poHoldOvrdInd",
    "userInvPriv"
})
@Generated("jsonschema2pojo")
public class UserProfileMaintenance100GetResponse {

    /**
     * Ship To
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("requestorShipCode")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_REQUESTOR_SHIP_CODE, Lookup lineage reference object : ftvship")
    private String requestorShipCode;
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
     * EDI Override
     * <p>
     * Lineage reference object : FOBPROF_EDI_OVERRIDE_IND
     * 
     */
    @JsonProperty("ediOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_EDI_OVERRIDE_IND")
    private String ediOverrideInd;
    /**
     * Invoice Receipt Required Override
     * <p>
     * Lineage reference object : FOBPROF_INV_MATCH_OVRRD_IND
     * 
     */
    @JsonProperty("invMatchOvrrdInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_INV_MATCH_OVRRD_IND")
    private String invMatchOvrrdInd;
    /**
     * Receiving Override
     * <p>
     * Lineage reference object : FOBPROF_RCVD_OVERRIDE_IND
     * 
     */
    @JsonProperty("rcvdOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_RCVD_OVERRIDE_IND")
    private String rcvdOverrideInd;
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
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    private String spridenId;
    /**
     * Receiving Amount Overage Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_PCT
     * 
     */
    @JsonProperty("rcvdTolerancePct")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_RCVD_TOLERANCE_PCT")
    private Double rcvdTolerancePct;
    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipBuilding")
    private String ftvshipBuilding;
    /**
     * NSF Override
     * <p>
     * Lineage reference object : FOBPROF_NSF_OVERRIDE
     * 
     */
    @JsonProperty("nsfOverride")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_NSF_OVERRIDE")
    private String nsfOverride;
    /**
     * Invoice Tolerance Amount
     * <p>
     * Lineage reference object : FOBPROF_MAX_TOLERANCE_AMT
     * 
     */
    @JsonProperty("maxToleranceAmt")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_MAX_TOLERANCE_AMT")
    private Double maxToleranceAmt;
    /**
     * Expenditure End Date Posting
     * <p>
     * Lineage reference object : FOBPROF_EXP_END_POST_AUTH_IND
     * 
     */
    @JsonProperty("expEndPostAuthInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_EXP_END_POST_AUTH_IND")
    private String expEndPostAuthInd;
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
     * Payroll Expense Detail Access
     * <p>
     * Lineage reference object : FOBPROF_WHRLD_ACCESS_IND
     * 
     */
    @JsonProperty("whrldAccessInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_WHRLD_ACCESS_IND")
    private String whrldAccessInd;
    /**
     * Payment Hold Override
     * <p>
     * Lineage reference object : FOBPROF_PMT_HOLD_OVRD_IND
     * 
     */
    @JsonProperty("pmtHoldOvrdInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_PMT_HOLD_OVRD_IND")
    private String pmtHoldOvrdInd;
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
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipFloor")
    private String ftvshipFloor;
    /**
     * Invoice Overage Tolerance
     * <p>
     * Lineage reference object : FOBPROF_TOLERANCE
     * 
     */
    @JsonProperty("tolerance")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_TOLERANCE")
    private Double tolerance;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine2")
    private String ftvshipAddrLine2;
    /**
     * Self Service Budget Access
     * <p>
     * Lineage reference object : FOBPROF_WBUD_ACCESS_IND
     * 
     */
    @JsonProperty("wbudAccessInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_WBUD_ACCESS_IND")
    private String wbudAccessInd;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine1")
    private String ftvshipAddrLine1;
    @JsonProperty("orgnDesc")
    private String orgnDesc;
    /**
     * Master Fund
     * <p>
     * Lineage reference object : FOBPROF_MASTER_FUND_IND
     * 
     */
    @JsonProperty("masterFundInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_MASTER_FUND_IND")
    private String masterFundInd;
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
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine3")
    private String ftvshipAddrLine3;
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
     * Master Organization
     * <p>
     * Lineage reference object : FOBPROF_MASTER_ORGN_IND
     * 
     */
    @JsonProperty("masterOrgnInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_MASTER_ORGN_IND")
    private String masterOrgnInd;
    /**
     * Post in Accrual Period
     * <p>
     * Lineage reference object : FOBPROF_ACCRUAL_POST_AUTH_IND
     * 
     */
    @JsonProperty("accrualPostAuthInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_ACCRUAL_POST_AUTH_IND")
    private String accrualPostAuthInd;
    /**
     * Receiving Quantity Overage Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_QTY
     * 
     */
    @JsonProperty("rcvdToleranceQty")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_RCVD_TOLERANCE_QTY")
    private Double rcvdToleranceQty;
    @JsonProperty("fullName")
    private String fullName;
    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipContact")
    private String ftvshipContact;
    /**
     * Self Service Access
     * <p>
     * Lineage reference object : FOBPROF_WEB_ACCESS_IND
     * 
     */
    @JsonProperty("webAccessInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_WEB_ACCESS_IND")
    private String webAccessInd;
    /**
     * User Name
     * <p>
     * Lineage reference object : FOBPROF_USER_NAME
     * (Required)
     * 
     */
    @JsonProperty("userName")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_USER_NAME")
    private String userName;
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
     * Purchase Card Override
     * <p>
     * Lineage reference object : FOBPROF_CARD_OVERRIDE_IND
     * 
     */
    @JsonProperty("cardOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_CARD_OVERRIDE_IND")
    private String cardOverrideInd;
    /**
     * Invoice Tolerance Override
     * <p>
     * Lineage reference object : FOBPROF_TOL_OVERRIDE_IND
     * 
     */
    @JsonProperty("tolOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_TOL_OVERRIDE_IND")
    private String tolOverrideInd;
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
     * Purchase Order Receipt Required Override
     * <p>
     * Lineage reference object : FOBPROF_PO_MATCH_OVRRD_IND
     * 
     */
    @JsonProperty("poMatchOvrrdInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_PO_MATCH_OVRRD_IND")
    private String poMatchOvrrdInd;
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
     * ACH Override
     * <p>
     * Lineage reference object : FOBPROF_ACH_OVERRIDE_IND
     * 
     */
    @JsonProperty("achOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_ACH_OVERRIDE_IND")
    private String achOverrideInd;
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
     * Requisition Receipt Required Override
     * <p>
     * Lineage reference object : FOBPROF_REQ_MATCH_OVRRD_IND
     * 
     */
    @JsonProperty("reqMatchOvrrdInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_REQ_MATCH_OVRRD_IND")
    private String reqMatchOvrrdInd;
    /**
     * Purchase Order Hold Override
     * <p>
     * Lineage reference object : FOBPROF_PO_HOLD_OVRD_IND
     * 
     */
    @JsonProperty("poHoldOvrdInd")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_PO_HOLD_OVRD_IND")
    private String poHoldOvrdInd;
    /**
     * Invoice Restrictions
     * <p>
     * Lineage reference object : FOBPROF_USER_INV_PRIV
     * 
     */
    @JsonProperty("userInvPriv")
    @JsonPropertyDescription("Lineage reference object : FOBPROF_USER_INV_PRIV")
    private String userInvPriv;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Ship To
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("requestorShipCode")
    public String getRequestorShipCode() {
        return requestorShipCode;
    }

    /**
     * Ship To
     * <p>
     * Lineage reference object : FOBPROF_REQUESTOR_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("requestorShipCode")
    public void setRequestorShipCode(String requestorShipCode) {
        this.requestorShipCode = requestorShipCode;
    }

    public UserProfileMaintenance100GetResponse withRequestorShipCode(String requestorShipCode) {
        this.requestorShipCode = requestorShipCode;
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

    public UserProfileMaintenance100GetResponse withRequestorPhoneExt(String requestorPhoneExt) {
        this.requestorPhoneExt = requestorPhoneExt;
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

    public UserProfileMaintenance100GetResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * EDI Override
     * <p>
     * Lineage reference object : FOBPROF_EDI_OVERRIDE_IND
     * 
     */
    @JsonProperty("ediOverrideInd")
    public String getEdiOverrideInd() {
        return ediOverrideInd;
    }

    /**
     * EDI Override
     * <p>
     * Lineage reference object : FOBPROF_EDI_OVERRIDE_IND
     * 
     */
    @JsonProperty("ediOverrideInd")
    public void setEdiOverrideInd(String ediOverrideInd) {
        this.ediOverrideInd = ediOverrideInd;
    }

    public UserProfileMaintenance100GetResponse withEdiOverrideInd(String ediOverrideInd) {
        this.ediOverrideInd = ediOverrideInd;
        return this;
    }

    /**
     * Invoice Receipt Required Override
     * <p>
     * Lineage reference object : FOBPROF_INV_MATCH_OVRRD_IND
     * 
     */
    @JsonProperty("invMatchOvrrdInd")
    public String getInvMatchOvrrdInd() {
        return invMatchOvrrdInd;
    }

    /**
     * Invoice Receipt Required Override
     * <p>
     * Lineage reference object : FOBPROF_INV_MATCH_OVRRD_IND
     * 
     */
    @JsonProperty("invMatchOvrrdInd")
    public void setInvMatchOvrrdInd(String invMatchOvrrdInd) {
        this.invMatchOvrrdInd = invMatchOvrrdInd;
    }

    public UserProfileMaintenance100GetResponse withInvMatchOvrrdInd(String invMatchOvrrdInd) {
        this.invMatchOvrrdInd = invMatchOvrrdInd;
        return this;
    }

    /**
     * Receiving Override
     * <p>
     * Lineage reference object : FOBPROF_RCVD_OVERRIDE_IND
     * 
     */
    @JsonProperty("rcvdOverrideInd")
    public String getRcvdOverrideInd() {
        return rcvdOverrideInd;
    }

    /**
     * Receiving Override
     * <p>
     * Lineage reference object : FOBPROF_RCVD_OVERRIDE_IND
     * 
     */
    @JsonProperty("rcvdOverrideInd")
    public void setRcvdOverrideInd(String rcvdOverrideInd) {
        this.rcvdOverrideInd = rcvdOverrideInd;
    }

    public UserProfileMaintenance100GetResponse withRcvdOverrideInd(String rcvdOverrideInd) {
        this.rcvdOverrideInd = rcvdOverrideInd;
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

    public UserProfileMaintenance100GetResponse withWbudMstrFundInd(String wbudMstrFundInd) {
        this.wbudMstrFundInd = wbudMstrFundInd;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    public String getSpridenId() {
        return spridenId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    public void setSpridenId(String spridenId) {
        this.spridenId = spridenId;
    }

    public UserProfileMaintenance100GetResponse withSpridenId(String spridenId) {
        this.spridenId = spridenId;
        return this;
    }

    /**
     * Receiving Amount Overage Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_PCT
     * 
     */
    @JsonProperty("rcvdTolerancePct")
    public Double getRcvdTolerancePct() {
        return rcvdTolerancePct;
    }

    /**
     * Receiving Amount Overage Tolerance
     * <p>
     * Lineage reference object : FOBPROF_RCVD_TOLERANCE_PCT
     * 
     */
    @JsonProperty("rcvdTolerancePct")
    public void setRcvdTolerancePct(Double rcvdTolerancePct) {
        this.rcvdTolerancePct = rcvdTolerancePct;
    }

    public UserProfileMaintenance100GetResponse withRcvdTolerancePct(Double rcvdTolerancePct) {
        this.rcvdTolerancePct = rcvdTolerancePct;
        return this;
    }

    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipBuilding")
    public String getFtvshipBuilding() {
        return ftvshipBuilding;
    }

    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipBuilding")
    public void setFtvshipBuilding(String ftvshipBuilding) {
        this.ftvshipBuilding = ftvshipBuilding;
    }

    public UserProfileMaintenance100GetResponse withFtvshipBuilding(String ftvshipBuilding) {
        this.ftvshipBuilding = ftvshipBuilding;
        return this;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FOBPROF_NSF_OVERRIDE
     * 
     */
    @JsonProperty("nsfOverride")
    public String getNsfOverride() {
        return nsfOverride;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FOBPROF_NSF_OVERRIDE
     * 
     */
    @JsonProperty("nsfOverride")
    public void setNsfOverride(String nsfOverride) {
        this.nsfOverride = nsfOverride;
    }

    public UserProfileMaintenance100GetResponse withNsfOverride(String nsfOverride) {
        this.nsfOverride = nsfOverride;
        return this;
    }

    /**
     * Invoice Tolerance Amount
     * <p>
     * Lineage reference object : FOBPROF_MAX_TOLERANCE_AMT
     * 
     */
    @JsonProperty("maxToleranceAmt")
    public Double getMaxToleranceAmt() {
        return maxToleranceAmt;
    }

    /**
     * Invoice Tolerance Amount
     * <p>
     * Lineage reference object : FOBPROF_MAX_TOLERANCE_AMT
     * 
     */
    @JsonProperty("maxToleranceAmt")
    public void setMaxToleranceAmt(Double maxToleranceAmt) {
        this.maxToleranceAmt = maxToleranceAmt;
    }

    public UserProfileMaintenance100GetResponse withMaxToleranceAmt(Double maxToleranceAmt) {
        this.maxToleranceAmt = maxToleranceAmt;
        return this;
    }

    /**
     * Expenditure End Date Posting
     * <p>
     * Lineage reference object : FOBPROF_EXP_END_POST_AUTH_IND
     * 
     */
    @JsonProperty("expEndPostAuthInd")
    public String getExpEndPostAuthInd() {
        return expEndPostAuthInd;
    }

    /**
     * Expenditure End Date Posting
     * <p>
     * Lineage reference object : FOBPROF_EXP_END_POST_AUTH_IND
     * 
     */
    @JsonProperty("expEndPostAuthInd")
    public void setExpEndPostAuthInd(String expEndPostAuthInd) {
        this.expEndPostAuthInd = expEndPostAuthInd;
    }

    public UserProfileMaintenance100GetResponse withExpEndPostAuthInd(String expEndPostAuthInd) {
        this.expEndPostAuthInd = expEndPostAuthInd;
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

    public UserProfileMaintenance100GetResponse withWbudMstrOrgnInd(String wbudMstrOrgnInd) {
        this.wbudMstrOrgnInd = wbudMstrOrgnInd;
        return this;
    }

    /**
     * Payroll Expense Detail Access
     * <p>
     * Lineage reference object : FOBPROF_WHRLD_ACCESS_IND
     * 
     */
    @JsonProperty("whrldAccessInd")
    public String getWhrldAccessInd() {
        return whrldAccessInd;
    }

    /**
     * Payroll Expense Detail Access
     * <p>
     * Lineage reference object : FOBPROF_WHRLD_ACCESS_IND
     * 
     */
    @JsonProperty("whrldAccessInd")
    public void setWhrldAccessInd(String whrldAccessInd) {
        this.whrldAccessInd = whrldAccessInd;
    }

    public UserProfileMaintenance100GetResponse withWhrldAccessInd(String whrldAccessInd) {
        this.whrldAccessInd = whrldAccessInd;
        return this;
    }

    /**
     * Payment Hold Override
     * <p>
     * Lineage reference object : FOBPROF_PMT_HOLD_OVRD_IND
     * 
     */
    @JsonProperty("pmtHoldOvrdInd")
    public String getPmtHoldOvrdInd() {
        return pmtHoldOvrdInd;
    }

    /**
     * Payment Hold Override
     * <p>
     * Lineage reference object : FOBPROF_PMT_HOLD_OVRD_IND
     * 
     */
    @JsonProperty("pmtHoldOvrdInd")
    public void setPmtHoldOvrdInd(String pmtHoldOvrdInd) {
        this.pmtHoldOvrdInd = pmtHoldOvrdInd;
    }

    public UserProfileMaintenance100GetResponse withPmtHoldOvrdInd(String pmtHoldOvrdInd) {
        this.pmtHoldOvrdInd = pmtHoldOvrdInd;
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

    public UserProfileMaintenance100GetResponse withRequesterOrgnCode(String requesterOrgnCode) {
        this.requesterOrgnCode = requesterOrgnCode;
        return this;
    }

    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipFloor")
    public String getFtvshipFloor() {
        return ftvshipFloor;
    }

    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipFloor")
    public void setFtvshipFloor(String ftvshipFloor) {
        this.ftvshipFloor = ftvshipFloor;
    }

    public UserProfileMaintenance100GetResponse withFtvshipFloor(String ftvshipFloor) {
        this.ftvshipFloor = ftvshipFloor;
        return this;
    }

    /**
     * Invoice Overage Tolerance
     * <p>
     * Lineage reference object : FOBPROF_TOLERANCE
     * 
     */
    @JsonProperty("tolerance")
    public Double getTolerance() {
        return tolerance;
    }

    /**
     * Invoice Overage Tolerance
     * <p>
     * Lineage reference object : FOBPROF_TOLERANCE
     * 
     */
    @JsonProperty("tolerance")
    public void setTolerance(Double tolerance) {
        this.tolerance = tolerance;
    }

    public UserProfileMaintenance100GetResponse withTolerance(Double tolerance) {
        this.tolerance = tolerance;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine2")
    public String getFtvshipAddrLine2() {
        return ftvshipAddrLine2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine2")
    public void setFtvshipAddrLine2(String ftvshipAddrLine2) {
        this.ftvshipAddrLine2 = ftvshipAddrLine2;
    }

    public UserProfileMaintenance100GetResponse withFtvshipAddrLine2(String ftvshipAddrLine2) {
        this.ftvshipAddrLine2 = ftvshipAddrLine2;
        return this;
    }

    /**
     * Self Service Budget Access
     * <p>
     * Lineage reference object : FOBPROF_WBUD_ACCESS_IND
     * 
     */
    @JsonProperty("wbudAccessInd")
    public String getWbudAccessInd() {
        return wbudAccessInd;
    }

    /**
     * Self Service Budget Access
     * <p>
     * Lineage reference object : FOBPROF_WBUD_ACCESS_IND
     * 
     */
    @JsonProperty("wbudAccessInd")
    public void setWbudAccessInd(String wbudAccessInd) {
        this.wbudAccessInd = wbudAccessInd;
    }

    public UserProfileMaintenance100GetResponse withWbudAccessInd(String wbudAccessInd) {
        this.wbudAccessInd = wbudAccessInd;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine1")
    public String getFtvshipAddrLine1() {
        return ftvshipAddrLine1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine1")
    public void setFtvshipAddrLine1(String ftvshipAddrLine1) {
        this.ftvshipAddrLine1 = ftvshipAddrLine1;
    }

    public UserProfileMaintenance100GetResponse withFtvshipAddrLine1(String ftvshipAddrLine1) {
        this.ftvshipAddrLine1 = ftvshipAddrLine1;
        return this;
    }

    @JsonProperty("orgnDesc")
    public String getOrgnDesc() {
        return orgnDesc;
    }

    @JsonProperty("orgnDesc")
    public void setOrgnDesc(String orgnDesc) {
        this.orgnDesc = orgnDesc;
    }

    public UserProfileMaintenance100GetResponse withOrgnDesc(String orgnDesc) {
        this.orgnDesc = orgnDesc;
        return this;
    }

    /**
     * Master Fund
     * <p>
     * Lineage reference object : FOBPROF_MASTER_FUND_IND
     * 
     */
    @JsonProperty("masterFundInd")
    public String getMasterFundInd() {
        return masterFundInd;
    }

    /**
     * Master Fund
     * <p>
     * Lineage reference object : FOBPROF_MASTER_FUND_IND
     * 
     */
    @JsonProperty("masterFundInd")
    public void setMasterFundInd(String masterFundInd) {
        this.masterFundInd = masterFundInd;
    }

    public UserProfileMaintenance100GetResponse withMasterFundInd(String masterFundInd) {
        this.masterFundInd = masterFundInd;
        return this;
    }

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

    public UserProfileMaintenance100GetResponse withRequestorPhoneNumber(String requestorPhoneNumber) {
        this.requestorPhoneNumber = requestorPhoneNumber;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine3")
    public String getFtvshipAddrLine3() {
        return ftvshipAddrLine3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipAddrLine3")
    public void setFtvshipAddrLine3(String ftvshipAddrLine3) {
        this.ftvshipAddrLine3 = ftvshipAddrLine3;
    }

    public UserProfileMaintenance100GetResponse withFtvshipAddrLine3(String ftvshipAddrLine3) {
        this.ftvshipAddrLine3 = ftvshipAddrLine3;
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

    public UserProfileMaintenance100GetResponse withRequestorFaxNumber(String requestorFaxNumber) {
        this.requestorFaxNumber = requestorFaxNumber;
        return this;
    }

    /**
     * Master Organization
     * <p>
     * Lineage reference object : FOBPROF_MASTER_ORGN_IND
     * 
     */
    @JsonProperty("masterOrgnInd")
    public String getMasterOrgnInd() {
        return masterOrgnInd;
    }

    /**
     * Master Organization
     * <p>
     * Lineage reference object : FOBPROF_MASTER_ORGN_IND
     * 
     */
    @JsonProperty("masterOrgnInd")
    public void setMasterOrgnInd(String masterOrgnInd) {
        this.masterOrgnInd = masterOrgnInd;
    }

    public UserProfileMaintenance100GetResponse withMasterOrgnInd(String masterOrgnInd) {
        this.masterOrgnInd = masterOrgnInd;
        return this;
    }

    /**
     * Post in Accrual Period
     * <p>
     * Lineage reference object : FOBPROF_ACCRUAL_POST_AUTH_IND
     * 
     */
    @JsonProperty("accrualPostAuthInd")
    public String getAccrualPostAuthInd() {
        return accrualPostAuthInd;
    }

    /**
     * Post in Accrual Period
     * <p>
     * Lineage reference object : FOBPROF_ACCRUAL_POST_AUTH_IND
     * 
     */
    @JsonProperty("accrualPostAuthInd")
    public void setAccrualPostAuthInd(String accrualPostAuthInd) {
        this.accrualPostAuthInd = accrualPostAuthInd;
    }

    public UserProfileMaintenance100GetResponse withAccrualPostAuthInd(String accrualPostAuthInd) {
        this.accrualPostAuthInd = accrualPostAuthInd;
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

    public UserProfileMaintenance100GetResponse withRcvdToleranceQty(Double rcvdToleranceQty) {
        this.rcvdToleranceQty = rcvdToleranceQty;
        return this;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserProfileMaintenance100GetResponse withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipContact")
    public String getFtvshipContact() {
        return ftvshipContact;
    }

    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvshipContact")
    public void setFtvshipContact(String ftvshipContact) {
        this.ftvshipContact = ftvshipContact;
    }

    public UserProfileMaintenance100GetResponse withFtvshipContact(String ftvshipContact) {
        this.ftvshipContact = ftvshipContact;
        return this;
    }

    /**
     * Self Service Access
     * <p>
     * Lineage reference object : FOBPROF_WEB_ACCESS_IND
     * 
     */
    @JsonProperty("webAccessInd")
    public String getWebAccessInd() {
        return webAccessInd;
    }

    /**
     * Self Service Access
     * <p>
     * Lineage reference object : FOBPROF_WEB_ACCESS_IND
     * 
     */
    @JsonProperty("webAccessInd")
    public void setWebAccessInd(String webAccessInd) {
        this.webAccessInd = webAccessInd;
    }

    public UserProfileMaintenance100GetResponse withWebAccessInd(String webAccessInd) {
        this.webAccessInd = webAccessInd;
        return this;
    }

    /**
     * User Name
     * <p>
     * Lineage reference object : FOBPROF_USER_NAME
     * (Required)
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * User Name
     * <p>
     * Lineage reference object : FOBPROF_USER_NAME
     * (Required)
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserProfileMaintenance100GetResponse withUserName(String userName) {
        this.userName = userName;
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

    public UserProfileMaintenance100GetResponse withRequestorEmailAddr(String requestorEmailAddr) {
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

    public UserProfileMaintenance100GetResponse withRcvdToleranceAmtPct(Double rcvdToleranceAmtPct) {
        this.rcvdToleranceAmtPct = rcvdToleranceAmtPct;
        return this;
    }

    /**
     * Purchase Card Override
     * <p>
     * Lineage reference object : FOBPROF_CARD_OVERRIDE_IND
     * 
     */
    @JsonProperty("cardOverrideInd")
    public String getCardOverrideInd() {
        return cardOverrideInd;
    }

    /**
     * Purchase Card Override
     * <p>
     * Lineage reference object : FOBPROF_CARD_OVERRIDE_IND
     * 
     */
    @JsonProperty("cardOverrideInd")
    public void setCardOverrideInd(String cardOverrideInd) {
        this.cardOverrideInd = cardOverrideInd;
    }

    public UserProfileMaintenance100GetResponse withCardOverrideInd(String cardOverrideInd) {
        this.cardOverrideInd = cardOverrideInd;
        return this;
    }

    /**
     * Invoice Tolerance Override
     * <p>
     * Lineage reference object : FOBPROF_TOL_OVERRIDE_IND
     * 
     */
    @JsonProperty("tolOverrideInd")
    public String getTolOverrideInd() {
        return tolOverrideInd;
    }

    /**
     * Invoice Tolerance Override
     * <p>
     * Lineage reference object : FOBPROF_TOL_OVERRIDE_IND
     * 
     */
    @JsonProperty("tolOverrideInd")
    public void setTolOverrideInd(String tolOverrideInd) {
        this.tolOverrideInd = tolOverrideInd;
    }

    public UserProfileMaintenance100GetResponse withTolOverrideInd(String tolOverrideInd) {
        this.tolOverrideInd = tolOverrideInd;
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

    public UserProfileMaintenance100GetResponse withRequestorFaxArea(String requestorFaxArea) {
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

    public UserProfileMaintenance100GetResponse withBudId(String budId) {
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

    public UserProfileMaintenance100GetResponse withRequestorFaxExt(String requestorFaxExt) {
        this.requestorFaxExt = requestorFaxExt;
        return this;
    }

    /**
     * Purchase Order Receipt Required Override
     * <p>
     * Lineage reference object : FOBPROF_PO_MATCH_OVRRD_IND
     * 
     */
    @JsonProperty("poMatchOvrrdInd")
    public String getPoMatchOvrrdInd() {
        return poMatchOvrrdInd;
    }

    /**
     * Purchase Order Receipt Required Override
     * <p>
     * Lineage reference object : FOBPROF_PO_MATCH_OVRRD_IND
     * 
     */
    @JsonProperty("poMatchOvrrdInd")
    public void setPoMatchOvrrdInd(String poMatchOvrrdInd) {
        this.poMatchOvrrdInd = poMatchOvrrdInd;
    }

    public UserProfileMaintenance100GetResponse withPoMatchOvrrdInd(String poMatchOvrrdInd) {
        this.poMatchOvrrdInd = poMatchOvrrdInd;
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

    public UserProfileMaintenance100GetResponse withRequestorPhoneArea(String requestorPhoneArea) {
        this.requestorPhoneArea = requestorPhoneArea;
        return this;
    }

    /**
     * ACH Override
     * <p>
     * Lineage reference object : FOBPROF_ACH_OVERRIDE_IND
     * 
     */
    @JsonProperty("achOverrideInd")
    public String getAchOverrideInd() {
        return achOverrideInd;
    }

    /**
     * ACH Override
     * <p>
     * Lineage reference object : FOBPROF_ACH_OVERRIDE_IND
     * 
     */
    @JsonProperty("achOverrideInd")
    public void setAchOverrideInd(String achOverrideInd) {
        this.achOverrideInd = achOverrideInd;
    }

    public UserProfileMaintenance100GetResponse withAchOverrideInd(String achOverrideInd) {
        this.achOverrideInd = achOverrideInd;
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

    public UserProfileMaintenance100GetResponse withRcvdToleranceAmt(Double rcvdToleranceAmt) {
        this.rcvdToleranceAmt = rcvdToleranceAmt;
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

    public UserProfileMaintenance100GetResponse withReqMatchOvrrdInd(String reqMatchOvrrdInd) {
        this.reqMatchOvrrdInd = reqMatchOvrrdInd;
        return this;
    }

    /**
     * Purchase Order Hold Override
     * <p>
     * Lineage reference object : FOBPROF_PO_HOLD_OVRD_IND
     * 
     */
    @JsonProperty("poHoldOvrdInd")
    public String getPoHoldOvrdInd() {
        return poHoldOvrdInd;
    }

    /**
     * Purchase Order Hold Override
     * <p>
     * Lineage reference object : FOBPROF_PO_HOLD_OVRD_IND
     * 
     */
    @JsonProperty("poHoldOvrdInd")
    public void setPoHoldOvrdInd(String poHoldOvrdInd) {
        this.poHoldOvrdInd = poHoldOvrdInd;
    }

    public UserProfileMaintenance100GetResponse withPoHoldOvrdInd(String poHoldOvrdInd) {
        this.poHoldOvrdInd = poHoldOvrdInd;
        return this;
    }

    /**
     * Invoice Restrictions
     * <p>
     * Lineage reference object : FOBPROF_USER_INV_PRIV
     * 
     */
    @JsonProperty("userInvPriv")
    public String getUserInvPriv() {
        return userInvPriv;
    }

    /**
     * Invoice Restrictions
     * <p>
     * Lineage reference object : FOBPROF_USER_INV_PRIV
     * 
     */
    @JsonProperty("userInvPriv")
    public void setUserInvPriv(String userInvPriv) {
        this.userInvPriv = userInvPriv;
    }

    public UserProfileMaintenance100GetResponse withUserInvPriv(String userInvPriv) {
        this.userInvPriv = userInvPriv;
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

    public UserProfileMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserProfileMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requestorShipCode");
        sb.append('=');
        sb.append(((this.requestorShipCode == null)?"<null>":this.requestorShipCode));
        sb.append(',');
        sb.append("requestorPhoneExt");
        sb.append('=');
        sb.append(((this.requestorPhoneExt == null)?"<null>":this.requestorPhoneExt));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("ediOverrideInd");
        sb.append('=');
        sb.append(((this.ediOverrideInd == null)?"<null>":this.ediOverrideInd));
        sb.append(',');
        sb.append("invMatchOvrrdInd");
        sb.append('=');
        sb.append(((this.invMatchOvrrdInd == null)?"<null>":this.invMatchOvrrdInd));
        sb.append(',');
        sb.append("rcvdOverrideInd");
        sb.append('=');
        sb.append(((this.rcvdOverrideInd == null)?"<null>":this.rcvdOverrideInd));
        sb.append(',');
        sb.append("wbudMstrFundInd");
        sb.append('=');
        sb.append(((this.wbudMstrFundInd == null)?"<null>":this.wbudMstrFundInd));
        sb.append(',');
        sb.append("spridenId");
        sb.append('=');
        sb.append(((this.spridenId == null)?"<null>":this.spridenId));
        sb.append(',');
        sb.append("rcvdTolerancePct");
        sb.append('=');
        sb.append(((this.rcvdTolerancePct == null)?"<null>":this.rcvdTolerancePct));
        sb.append(',');
        sb.append("ftvshipBuilding");
        sb.append('=');
        sb.append(((this.ftvshipBuilding == null)?"<null>":this.ftvshipBuilding));
        sb.append(',');
        sb.append("nsfOverride");
        sb.append('=');
        sb.append(((this.nsfOverride == null)?"<null>":this.nsfOverride));
        sb.append(',');
        sb.append("maxToleranceAmt");
        sb.append('=');
        sb.append(((this.maxToleranceAmt == null)?"<null>":this.maxToleranceAmt));
        sb.append(',');
        sb.append("expEndPostAuthInd");
        sb.append('=');
        sb.append(((this.expEndPostAuthInd == null)?"<null>":this.expEndPostAuthInd));
        sb.append(',');
        sb.append("wbudMstrOrgnInd");
        sb.append('=');
        sb.append(((this.wbudMstrOrgnInd == null)?"<null>":this.wbudMstrOrgnInd));
        sb.append(',');
        sb.append("whrldAccessInd");
        sb.append('=');
        sb.append(((this.whrldAccessInd == null)?"<null>":this.whrldAccessInd));
        sb.append(',');
        sb.append("pmtHoldOvrdInd");
        sb.append('=');
        sb.append(((this.pmtHoldOvrdInd == null)?"<null>":this.pmtHoldOvrdInd));
        sb.append(',');
        sb.append("requesterOrgnCode");
        sb.append('=');
        sb.append(((this.requesterOrgnCode == null)?"<null>":this.requesterOrgnCode));
        sb.append(',');
        sb.append("ftvshipFloor");
        sb.append('=');
        sb.append(((this.ftvshipFloor == null)?"<null>":this.ftvshipFloor));
        sb.append(',');
        sb.append("tolerance");
        sb.append('=');
        sb.append(((this.tolerance == null)?"<null>":this.tolerance));
        sb.append(',');
        sb.append("ftvshipAddrLine2");
        sb.append('=');
        sb.append(((this.ftvshipAddrLine2 == null)?"<null>":this.ftvshipAddrLine2));
        sb.append(',');
        sb.append("wbudAccessInd");
        sb.append('=');
        sb.append(((this.wbudAccessInd == null)?"<null>":this.wbudAccessInd));
        sb.append(',');
        sb.append("ftvshipAddrLine1");
        sb.append('=');
        sb.append(((this.ftvshipAddrLine1 == null)?"<null>":this.ftvshipAddrLine1));
        sb.append(',');
        sb.append("orgnDesc");
        sb.append('=');
        sb.append(((this.orgnDesc == null)?"<null>":this.orgnDesc));
        sb.append(',');
        sb.append("masterFundInd");
        sb.append('=');
        sb.append(((this.masterFundInd == null)?"<null>":this.masterFundInd));
        sb.append(',');
        sb.append("requestorPhoneNumber");
        sb.append('=');
        sb.append(((this.requestorPhoneNumber == null)?"<null>":this.requestorPhoneNumber));
        sb.append(',');
        sb.append("ftvshipAddrLine3");
        sb.append('=');
        sb.append(((this.ftvshipAddrLine3 == null)?"<null>":this.ftvshipAddrLine3));
        sb.append(',');
        sb.append("requestorFaxNumber");
        sb.append('=');
        sb.append(((this.requestorFaxNumber == null)?"<null>":this.requestorFaxNumber));
        sb.append(',');
        sb.append("masterOrgnInd");
        sb.append('=');
        sb.append(((this.masterOrgnInd == null)?"<null>":this.masterOrgnInd));
        sb.append(',');
        sb.append("accrualPostAuthInd");
        sb.append('=');
        sb.append(((this.accrualPostAuthInd == null)?"<null>":this.accrualPostAuthInd));
        sb.append(',');
        sb.append("rcvdToleranceQty");
        sb.append('=');
        sb.append(((this.rcvdToleranceQty == null)?"<null>":this.rcvdToleranceQty));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("ftvshipContact");
        sb.append('=');
        sb.append(((this.ftvshipContact == null)?"<null>":this.ftvshipContact));
        sb.append(',');
        sb.append("webAccessInd");
        sb.append('=');
        sb.append(((this.webAccessInd == null)?"<null>":this.webAccessInd));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("requestorEmailAddr");
        sb.append('=');
        sb.append(((this.requestorEmailAddr == null)?"<null>":this.requestorEmailAddr));
        sb.append(',');
        sb.append("rcvdToleranceAmtPct");
        sb.append('=');
        sb.append(((this.rcvdToleranceAmtPct == null)?"<null>":this.rcvdToleranceAmtPct));
        sb.append(',');
        sb.append("cardOverrideInd");
        sb.append('=');
        sb.append(((this.cardOverrideInd == null)?"<null>":this.cardOverrideInd));
        sb.append(',');
        sb.append("tolOverrideInd");
        sb.append('=');
        sb.append(((this.tolOverrideInd == null)?"<null>":this.tolOverrideInd));
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
        sb.append("poMatchOvrrdInd");
        sb.append('=');
        sb.append(((this.poMatchOvrrdInd == null)?"<null>":this.poMatchOvrrdInd));
        sb.append(',');
        sb.append("requestorPhoneArea");
        sb.append('=');
        sb.append(((this.requestorPhoneArea == null)?"<null>":this.requestorPhoneArea));
        sb.append(',');
        sb.append("achOverrideInd");
        sb.append('=');
        sb.append(((this.achOverrideInd == null)?"<null>":this.achOverrideInd));
        sb.append(',');
        sb.append("rcvdToleranceAmt");
        sb.append('=');
        sb.append(((this.rcvdToleranceAmt == null)?"<null>":this.rcvdToleranceAmt));
        sb.append(',');
        sb.append("reqMatchOvrrdInd");
        sb.append('=');
        sb.append(((this.reqMatchOvrrdInd == null)?"<null>":this.reqMatchOvrrdInd));
        sb.append(',');
        sb.append("poHoldOvrdInd");
        sb.append('=');
        sb.append(((this.poHoldOvrdInd == null)?"<null>":this.poHoldOvrdInd));
        sb.append(',');
        sb.append("userInvPriv");
        sb.append('=');
        sb.append(((this.userInvPriv == null)?"<null>":this.userInvPriv));
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
        result = ((result* 31)+((this.rcvdOverrideInd == null)? 0 :this.rcvdOverrideInd.hashCode()));
        result = ((result* 31)+((this.wbudMstrFundInd == null)? 0 :this.wbudMstrFundInd.hashCode()));
        result = ((result* 31)+((this.spridenId == null)? 0 :this.spridenId.hashCode()));
        result = ((result* 31)+((this.wbudMstrOrgnInd == null)? 0 :this.wbudMstrOrgnInd.hashCode()));
        result = ((result* 31)+((this.whrldAccessInd == null)? 0 :this.whrldAccessInd.hashCode()));
        result = ((result* 31)+((this.tolerance == null)? 0 :this.tolerance.hashCode()));
        result = ((result* 31)+((this.orgnDesc == null)? 0 :this.orgnDesc.hashCode()));
        result = ((result* 31)+((this.masterFundInd == null)? 0 :this.masterFundInd.hashCode()));
        result = ((result* 31)+((this.requestorFaxNumber == null)? 0 :this.requestorFaxNumber.hashCode()));
        result = ((result* 31)+((this.rcvdToleranceQty == null)? 0 :this.rcvdToleranceQty.hashCode()));
        result = ((result* 31)+((this.webAccessInd == null)? 0 :this.webAccessInd.hashCode()));
        result = ((result* 31)+((this.requestorEmailAddr == null)? 0 :this.requestorEmailAddr.hashCode()));
        result = ((result* 31)+((this.tolOverrideInd == null)? 0 :this.tolOverrideInd.hashCode()));
        result = ((result* 31)+((this.requestorFaxArea == null)? 0 :this.requestorFaxArea.hashCode()));
        result = ((result* 31)+((this.requestorFaxExt == null)? 0 :this.requestorFaxExt.hashCode()));
        result = ((result* 31)+((this.poMatchOvrrdInd == null)? 0 :this.poMatchOvrrdInd.hashCode()));
        result = ((result* 31)+((this.rcvdToleranceAmt == null)? 0 :this.rcvdToleranceAmt.hashCode()));
        result = ((result* 31)+((this.reqMatchOvrrdInd == null)? 0 :this.reqMatchOvrrdInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.poHoldOvrdInd == null)? 0 :this.poHoldOvrdInd.hashCode()));
        result = ((result* 31)+((this.userInvPriv == null)? 0 :this.userInvPriv.hashCode()));
        result = ((result* 31)+((this.requestorShipCode == null)? 0 :this.requestorShipCode.hashCode()));
        result = ((result* 31)+((this.requestorPhoneExt == null)? 0 :this.requestorPhoneExt.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.ediOverrideInd == null)? 0 :this.ediOverrideInd.hashCode()));
        result = ((result* 31)+((this.invMatchOvrrdInd == null)? 0 :this.invMatchOvrrdInd.hashCode()));
        result = ((result* 31)+((this.rcvdTolerancePct == null)? 0 :this.rcvdTolerancePct.hashCode()));
        result = ((result* 31)+((this.ftvshipBuilding == null)? 0 :this.ftvshipBuilding.hashCode()));
        result = ((result* 31)+((this.nsfOverride == null)? 0 :this.nsfOverride.hashCode()));
        result = ((result* 31)+((this.maxToleranceAmt == null)? 0 :this.maxToleranceAmt.hashCode()));
        result = ((result* 31)+((this.expEndPostAuthInd == null)? 0 :this.expEndPostAuthInd.hashCode()));
        result = ((result* 31)+((this.pmtHoldOvrdInd == null)? 0 :this.pmtHoldOvrdInd.hashCode()));
        result = ((result* 31)+((this.requesterOrgnCode == null)? 0 :this.requesterOrgnCode.hashCode()));
        result = ((result* 31)+((this.ftvshipFloor == null)? 0 :this.ftvshipFloor.hashCode()));
        result = ((result* 31)+((this.ftvshipAddrLine2 == null)? 0 :this.ftvshipAddrLine2 .hashCode()));
        result = ((result* 31)+((this.wbudAccessInd == null)? 0 :this.wbudAccessInd.hashCode()));
        result = ((result* 31)+((this.ftvshipAddrLine1 == null)? 0 :this.ftvshipAddrLine1 .hashCode()));
        result = ((result* 31)+((this.requestorPhoneNumber == null)? 0 :this.requestorPhoneNumber.hashCode()));
        result = ((result* 31)+((this.ftvshipAddrLine3 == null)? 0 :this.ftvshipAddrLine3 .hashCode()));
        result = ((result* 31)+((this.masterOrgnInd == null)? 0 :this.masterOrgnInd.hashCode()));
        result = ((result* 31)+((this.accrualPostAuthInd == null)? 0 :this.accrualPostAuthInd.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.ftvshipContact == null)? 0 :this.ftvshipContact.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.rcvdToleranceAmtPct == null)? 0 :this.rcvdToleranceAmtPct.hashCode()));
        result = ((result* 31)+((this.cardOverrideInd == null)? 0 :this.cardOverrideInd.hashCode()));
        result = ((result* 31)+((this.budId == null)? 0 :this.budId.hashCode()));
        result = ((result* 31)+((this.requestorPhoneArea == null)? 0 :this.requestorPhoneArea.hashCode()));
        result = ((result* 31)+((this.achOverrideInd == null)? 0 :this.achOverrideInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserProfileMaintenance100GetResponse) == false) {
            return false;
        }
        UserProfileMaintenance100GetResponse rhs = ((UserProfileMaintenance100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.rcvdOverrideInd == rhs.rcvdOverrideInd)||((this.rcvdOverrideInd!= null)&&this.rcvdOverrideInd.equals(rhs.rcvdOverrideInd)))&&((this.wbudMstrFundInd == rhs.wbudMstrFundInd)||((this.wbudMstrFundInd!= null)&&this.wbudMstrFundInd.equals(rhs.wbudMstrFundInd))))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.wbudMstrOrgnInd == rhs.wbudMstrOrgnInd)||((this.wbudMstrOrgnInd!= null)&&this.wbudMstrOrgnInd.equals(rhs.wbudMstrOrgnInd))))&&((this.whrldAccessInd == rhs.whrldAccessInd)||((this.whrldAccessInd!= null)&&this.whrldAccessInd.equals(rhs.whrldAccessInd))))&&((this.tolerance == rhs.tolerance)||((this.tolerance!= null)&&this.tolerance.equals(rhs.tolerance))))&&((this.orgnDesc == rhs.orgnDesc)||((this.orgnDesc!= null)&&this.orgnDesc.equals(rhs.orgnDesc))))&&((this.masterFundInd == rhs.masterFundInd)||((this.masterFundInd!= null)&&this.masterFundInd.equals(rhs.masterFundInd))))&&((this.requestorFaxNumber == rhs.requestorFaxNumber)||((this.requestorFaxNumber!= null)&&this.requestorFaxNumber.equals(rhs.requestorFaxNumber))))&&((this.rcvdToleranceQty == rhs.rcvdToleranceQty)||((this.rcvdToleranceQty!= null)&&this.rcvdToleranceQty.equals(rhs.rcvdToleranceQty))))&&((this.webAccessInd == rhs.webAccessInd)||((this.webAccessInd!= null)&&this.webAccessInd.equals(rhs.webAccessInd))))&&((this.requestorEmailAddr == rhs.requestorEmailAddr)||((this.requestorEmailAddr!= null)&&this.requestorEmailAddr.equals(rhs.requestorEmailAddr))))&&((this.tolOverrideInd == rhs.tolOverrideInd)||((this.tolOverrideInd!= null)&&this.tolOverrideInd.equals(rhs.tolOverrideInd))))&&((this.requestorFaxArea == rhs.requestorFaxArea)||((this.requestorFaxArea!= null)&&this.requestorFaxArea.equals(rhs.requestorFaxArea))))&&((this.requestorFaxExt == rhs.requestorFaxExt)||((this.requestorFaxExt!= null)&&this.requestorFaxExt.equals(rhs.requestorFaxExt))))&&((this.poMatchOvrrdInd == rhs.poMatchOvrrdInd)||((this.poMatchOvrrdInd!= null)&&this.poMatchOvrrdInd.equals(rhs.poMatchOvrrdInd))))&&((this.rcvdToleranceAmt == rhs.rcvdToleranceAmt)||((this.rcvdToleranceAmt!= null)&&this.rcvdToleranceAmt.equals(rhs.rcvdToleranceAmt))))&&((this.reqMatchOvrrdInd == rhs.reqMatchOvrrdInd)||((this.reqMatchOvrrdInd!= null)&&this.reqMatchOvrrdInd.equals(rhs.reqMatchOvrrdInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.poHoldOvrdInd == rhs.poHoldOvrdInd)||((this.poHoldOvrdInd!= null)&&this.poHoldOvrdInd.equals(rhs.poHoldOvrdInd))))&&((this.userInvPriv == rhs.userInvPriv)||((this.userInvPriv!= null)&&this.userInvPriv.equals(rhs.userInvPriv))))&&((this.requestorShipCode == rhs.requestorShipCode)||((this.requestorShipCode!= null)&&this.requestorShipCode.equals(rhs.requestorShipCode))))&&((this.requestorPhoneExt == rhs.requestorPhoneExt)||((this.requestorPhoneExt!= null)&&this.requestorPhoneExt.equals(rhs.requestorPhoneExt))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.ediOverrideInd == rhs.ediOverrideInd)||((this.ediOverrideInd!= null)&&this.ediOverrideInd.equals(rhs.ediOverrideInd))))&&((this.invMatchOvrrdInd == rhs.invMatchOvrrdInd)||((this.invMatchOvrrdInd!= null)&&this.invMatchOvrrdInd.equals(rhs.invMatchOvrrdInd))))&&((this.rcvdTolerancePct == rhs.rcvdTolerancePct)||((this.rcvdTolerancePct!= null)&&this.rcvdTolerancePct.equals(rhs.rcvdTolerancePct))))&&((this.ftvshipBuilding == rhs.ftvshipBuilding)||((this.ftvshipBuilding!= null)&&this.ftvshipBuilding.equals(rhs.ftvshipBuilding))))&&((this.nsfOverride == rhs.nsfOverride)||((this.nsfOverride!= null)&&this.nsfOverride.equals(rhs.nsfOverride))))&&((this.maxToleranceAmt == rhs.maxToleranceAmt)||((this.maxToleranceAmt!= null)&&this.maxToleranceAmt.equals(rhs.maxToleranceAmt))))&&((this.expEndPostAuthInd == rhs.expEndPostAuthInd)||((this.expEndPostAuthInd!= null)&&this.expEndPostAuthInd.equals(rhs.expEndPostAuthInd))))&&((this.pmtHoldOvrdInd == rhs.pmtHoldOvrdInd)||((this.pmtHoldOvrdInd!= null)&&this.pmtHoldOvrdInd.equals(rhs.pmtHoldOvrdInd))))&&((this.requesterOrgnCode == rhs.requesterOrgnCode)||((this.requesterOrgnCode!= null)&&this.requesterOrgnCode.equals(rhs.requesterOrgnCode))))&&((this.ftvshipFloor == rhs.ftvshipFloor)||((this.ftvshipFloor!= null)&&this.ftvshipFloor.equals(rhs.ftvshipFloor))))&&((this.ftvshipAddrLine2 == rhs.ftvshipAddrLine2)||((this.ftvshipAddrLine2 != null)&&this.ftvshipAddrLine2 .equals(rhs.ftvshipAddrLine2))))&&((this.wbudAccessInd == rhs.wbudAccessInd)||((this.wbudAccessInd!= null)&&this.wbudAccessInd.equals(rhs.wbudAccessInd))))&&((this.ftvshipAddrLine1 == rhs.ftvshipAddrLine1)||((this.ftvshipAddrLine1 != null)&&this.ftvshipAddrLine1 .equals(rhs.ftvshipAddrLine1))))&&((this.requestorPhoneNumber == rhs.requestorPhoneNumber)||((this.requestorPhoneNumber!= null)&&this.requestorPhoneNumber.equals(rhs.requestorPhoneNumber))))&&((this.ftvshipAddrLine3 == rhs.ftvshipAddrLine3)||((this.ftvshipAddrLine3 != null)&&this.ftvshipAddrLine3 .equals(rhs.ftvshipAddrLine3))))&&((this.masterOrgnInd == rhs.masterOrgnInd)||((this.masterOrgnInd!= null)&&this.masterOrgnInd.equals(rhs.masterOrgnInd))))&&((this.accrualPostAuthInd == rhs.accrualPostAuthInd)||((this.accrualPostAuthInd!= null)&&this.accrualPostAuthInd.equals(rhs.accrualPostAuthInd))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.ftvshipContact == rhs.ftvshipContact)||((this.ftvshipContact!= null)&&this.ftvshipContact.equals(rhs.ftvshipContact))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.rcvdToleranceAmtPct == rhs.rcvdToleranceAmtPct)||((this.rcvdToleranceAmtPct!= null)&&this.rcvdToleranceAmtPct.equals(rhs.rcvdToleranceAmtPct))))&&((this.cardOverrideInd == rhs.cardOverrideInd)||((this.cardOverrideInd!= null)&&this.cardOverrideInd.equals(rhs.cardOverrideInd))))&&((this.budId == rhs.budId)||((this.budId!= null)&&this.budId.equals(rhs.budId))))&&((this.requestorPhoneArea == rhs.requestorPhoneArea)||((this.requestorPhoneArea!= null)&&this.requestorPhoneArea.equals(rhs.requestorPhoneArea))))&&((this.achOverrideInd == rhs.achOverrideInd)||((this.achOverrideInd!= null)&&this.achOverrideInd.equals(rhs.achOverrideInd))));
    }

}
