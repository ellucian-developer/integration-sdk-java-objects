
package com.ellucian.generated.bpapi.ban.financial_aid_record_maintenance.v1_0_0;

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
    "keyblckAidyCode",
    "id",
    "fundCode",
    "fundDescription",
    "awstCode",
    "lockInd",
    "sysInd",
    "offerAmt",
    "acceptAmt",
    "displayDeccanAmt",
    "displayMemautAmt",
    "paidAmt",
    "infoAccessInd",
    "pgrpCode",
    "displayRtvpgrpDesc",
    "prepOrTeachInd",
    "pellOrigInd",
    "pgrpCodeLockInd",
    "highPellLeuFlag",
    "addlPellEligInd",
    "pckgCompDate",
    "borrowerBasedCde",
    "postBaPellOvrd",
    "pgrpLockInd",
    "ovrdeSayrCode",
    "formerHealInd",
    "addlStfdEligInd",
    "awdLtrInd",
    "depNoParData",
    "displayDependStatus",
    "displayInfoAccessInd",
    "ssInfoAccessInd"
})
@Generated("jsonschema2pojo")
public class FinancialAidRecordMaintenance100QapiPost {

    @JsonProperty("keyblckAidyCode")
    private String keyblckAidyCode;
    @JsonProperty("id")
    private String id;
    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_FUND_CODE")
    private String fundCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    private String fundDescription;
    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE
     * 
     */
    @JsonProperty("awstCode")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_AWST_CODE")
    private String awstCode;
    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_LOCK_IND")
    private String lockInd;
    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_SYS_IND")
    private String sysInd;
    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_OFFER_AMT")
    private Double offerAmt;
    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_ACCEPT_AMT")
    private Double acceptAmt;
    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    private Double displayDeccanAmt;
    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    private Double displayMemautAmt;
    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_PAID_AMT")
    private Double paidAmt;
    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_INFO_ACCESS_IND")
    private String infoAccessInd;
    @JsonProperty("pgrpCode")
    private String pgrpCode;
    @JsonProperty("displayRtvpgrpDesc")
    private String displayRtvpgrpDesc;
    @JsonProperty("prepOrTeachInd")
    private String prepOrTeachInd;
    @JsonProperty("pellOrigInd")
    private String pellOrigInd;
    @JsonProperty("pgrpCodeLockInd")
    private String pgrpCodeLockInd;
    @JsonProperty("highPellLeuFlag")
    private String highPellLeuFlag;
    @JsonProperty("addlPellEligInd")
    private String addlPellEligInd;
    @JsonProperty("pckgCompDate")
    private String pckgCompDate;
    @JsonProperty("borrowerBasedCde")
    private String borrowerBasedCde;
    @JsonProperty("postBaPellOvrd")
    private String postBaPellOvrd;
    @JsonProperty("pgrpLockInd")
    private String pgrpLockInd;
    @JsonProperty("ovrdeSayrCode")
    private String ovrdeSayrCode;
    @JsonProperty("formerHealInd")
    private String formerHealInd;
    @JsonProperty("addlStfdEligInd")
    private String addlStfdEligInd;
    @JsonProperty("awdLtrInd")
    private String awdLtrInd;
    @JsonProperty("depNoParData")
    private String depNoParData;
    @JsonProperty("displayDependStatus")
    private String displayDependStatus;
    @JsonProperty("displayInfoAccessInd")
    private String displayInfoAccessInd;
    @JsonProperty("ssInfoAccessInd")
    private String ssInfoAccessInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public FinancialAidRecordMaintenance100QapiPost withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FinancialAidRecordMaintenance100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public FinancialAidRecordMaintenance100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    public String getFundDescription() {
        return fundDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    public void setFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
    }

    public FinancialAidRecordMaintenance100QapiPost withFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE
     * 
     */
    @JsonProperty("awstCode")
    public String getAwstCode() {
        return awstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE
     * 
     */
    @JsonProperty("awstCode")
    public void setAwstCode(String awstCode) {
        this.awstCode = awstCode;
    }

    public FinancialAidRecordMaintenance100QapiPost withAwstCode(String awstCode) {
        this.awstCode = awstCode;
        return this;
    }

    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    public String getLockInd() {
        return lockInd;
    }

    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    public void setLockInd(String lockInd) {
        this.lockInd = lockInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withLockInd(String lockInd) {
        this.lockInd = lockInd;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    public String getSysInd() {
        return sysInd;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    public void setSysInd(String sysInd) {
        this.sysInd = sysInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withSysInd(String sysInd) {
        this.sysInd = sysInd;
        return this;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    public Double getOfferAmt() {
        return offerAmt;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    public void setOfferAmt(Double offerAmt) {
        this.offerAmt = offerAmt;
    }

    public FinancialAidRecordMaintenance100QapiPost withOfferAmt(Double offerAmt) {
        this.offerAmt = offerAmt;
        return this;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    public Double getAcceptAmt() {
        return acceptAmt;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    public void setAcceptAmt(Double acceptAmt) {
        this.acceptAmt = acceptAmt;
    }

    public FinancialAidRecordMaintenance100QapiPost withAcceptAmt(Double acceptAmt) {
        this.acceptAmt = acceptAmt;
        return this;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    public Double getDisplayDeccanAmt() {
        return displayDeccanAmt;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    public void setDisplayDeccanAmt(Double displayDeccanAmt) {
        this.displayDeccanAmt = displayDeccanAmt;
    }

    public FinancialAidRecordMaintenance100QapiPost withDisplayDeccanAmt(Double displayDeccanAmt) {
        this.displayDeccanAmt = displayDeccanAmt;
        return this;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    public Double getDisplayMemautAmt() {
        return displayMemautAmt;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    public void setDisplayMemautAmt(Double displayMemautAmt) {
        this.displayMemautAmt = displayMemautAmt;
    }

    public FinancialAidRecordMaintenance100QapiPost withDisplayMemautAmt(Double displayMemautAmt) {
        this.displayMemautAmt = displayMemautAmt;
        return this;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    public Double getPaidAmt() {
        return paidAmt;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    public void setPaidAmt(Double paidAmt) {
        this.paidAmt = paidAmt;
    }

    public FinancialAidRecordMaintenance100QapiPost withPaidAmt(Double paidAmt) {
        this.paidAmt = paidAmt;
        return this;
    }

    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    @JsonProperty("pgrpCode")
    public String getPgrpCode() {
        return pgrpCode;
    }

    @JsonProperty("pgrpCode")
    public void setPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
    }

    public FinancialAidRecordMaintenance100QapiPost withPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
        return this;
    }

    @JsonProperty("displayRtvpgrpDesc")
    public String getDisplayRtvpgrpDesc() {
        return displayRtvpgrpDesc;
    }

    @JsonProperty("displayRtvpgrpDesc")
    public void setDisplayRtvpgrpDesc(String displayRtvpgrpDesc) {
        this.displayRtvpgrpDesc = displayRtvpgrpDesc;
    }

    public FinancialAidRecordMaintenance100QapiPost withDisplayRtvpgrpDesc(String displayRtvpgrpDesc) {
        this.displayRtvpgrpDesc = displayRtvpgrpDesc;
        return this;
    }

    @JsonProperty("prepOrTeachInd")
    public String getPrepOrTeachInd() {
        return prepOrTeachInd;
    }

    @JsonProperty("prepOrTeachInd")
    public void setPrepOrTeachInd(String prepOrTeachInd) {
        this.prepOrTeachInd = prepOrTeachInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withPrepOrTeachInd(String prepOrTeachInd) {
        this.prepOrTeachInd = prepOrTeachInd;
        return this;
    }

    @JsonProperty("pellOrigInd")
    public String getPellOrigInd() {
        return pellOrigInd;
    }

    @JsonProperty("pellOrigInd")
    public void setPellOrigInd(String pellOrigInd) {
        this.pellOrigInd = pellOrigInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withPellOrigInd(String pellOrigInd) {
        this.pellOrigInd = pellOrigInd;
        return this;
    }

    @JsonProperty("pgrpCodeLockInd")
    public String getPgrpCodeLockInd() {
        return pgrpCodeLockInd;
    }

    @JsonProperty("pgrpCodeLockInd")
    public void setPgrpCodeLockInd(String pgrpCodeLockInd) {
        this.pgrpCodeLockInd = pgrpCodeLockInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withPgrpCodeLockInd(String pgrpCodeLockInd) {
        this.pgrpCodeLockInd = pgrpCodeLockInd;
        return this;
    }

    @JsonProperty("highPellLeuFlag")
    public String getHighPellLeuFlag() {
        return highPellLeuFlag;
    }

    @JsonProperty("highPellLeuFlag")
    public void setHighPellLeuFlag(String highPellLeuFlag) {
        this.highPellLeuFlag = highPellLeuFlag;
    }

    public FinancialAidRecordMaintenance100QapiPost withHighPellLeuFlag(String highPellLeuFlag) {
        this.highPellLeuFlag = highPellLeuFlag;
        return this;
    }

    @JsonProperty("addlPellEligInd")
    public String getAddlPellEligInd() {
        return addlPellEligInd;
    }

    @JsonProperty("addlPellEligInd")
    public void setAddlPellEligInd(String addlPellEligInd) {
        this.addlPellEligInd = addlPellEligInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withAddlPellEligInd(String addlPellEligInd) {
        this.addlPellEligInd = addlPellEligInd;
        return this;
    }

    @JsonProperty("pckgCompDate")
    public String getPckgCompDate() {
        return pckgCompDate;
    }

    @JsonProperty("pckgCompDate")
    public void setPckgCompDate(String pckgCompDate) {
        this.pckgCompDate = pckgCompDate;
    }

    public FinancialAidRecordMaintenance100QapiPost withPckgCompDate(String pckgCompDate) {
        this.pckgCompDate = pckgCompDate;
        return this;
    }

    @JsonProperty("borrowerBasedCde")
    public String getBorrowerBasedCde() {
        return borrowerBasedCde;
    }

    @JsonProperty("borrowerBasedCde")
    public void setBorrowerBasedCde(String borrowerBasedCde) {
        this.borrowerBasedCde = borrowerBasedCde;
    }

    public FinancialAidRecordMaintenance100QapiPost withBorrowerBasedCde(String borrowerBasedCde) {
        this.borrowerBasedCde = borrowerBasedCde;
        return this;
    }

    @JsonProperty("postBaPellOvrd")
    public String getPostBaPellOvrd() {
        return postBaPellOvrd;
    }

    @JsonProperty("postBaPellOvrd")
    public void setPostBaPellOvrd(String postBaPellOvrd) {
        this.postBaPellOvrd = postBaPellOvrd;
    }

    public FinancialAidRecordMaintenance100QapiPost withPostBaPellOvrd(String postBaPellOvrd) {
        this.postBaPellOvrd = postBaPellOvrd;
        return this;
    }

    @JsonProperty("pgrpLockInd")
    public String getPgrpLockInd() {
        return pgrpLockInd;
    }

    @JsonProperty("pgrpLockInd")
    public void setPgrpLockInd(String pgrpLockInd) {
        this.pgrpLockInd = pgrpLockInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withPgrpLockInd(String pgrpLockInd) {
        this.pgrpLockInd = pgrpLockInd;
        return this;
    }

    @JsonProperty("ovrdeSayrCode")
    public String getOvrdeSayrCode() {
        return ovrdeSayrCode;
    }

    @JsonProperty("ovrdeSayrCode")
    public void setOvrdeSayrCode(String ovrdeSayrCode) {
        this.ovrdeSayrCode = ovrdeSayrCode;
    }

    public FinancialAidRecordMaintenance100QapiPost withOvrdeSayrCode(String ovrdeSayrCode) {
        this.ovrdeSayrCode = ovrdeSayrCode;
        return this;
    }

    @JsonProperty("formerHealInd")
    public String getFormerHealInd() {
        return formerHealInd;
    }

    @JsonProperty("formerHealInd")
    public void setFormerHealInd(String formerHealInd) {
        this.formerHealInd = formerHealInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withFormerHealInd(String formerHealInd) {
        this.formerHealInd = formerHealInd;
        return this;
    }

    @JsonProperty("addlStfdEligInd")
    public String getAddlStfdEligInd() {
        return addlStfdEligInd;
    }

    @JsonProperty("addlStfdEligInd")
    public void setAddlStfdEligInd(String addlStfdEligInd) {
        this.addlStfdEligInd = addlStfdEligInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withAddlStfdEligInd(String addlStfdEligInd) {
        this.addlStfdEligInd = addlStfdEligInd;
        return this;
    }

    @JsonProperty("awdLtrInd")
    public String getAwdLtrInd() {
        return awdLtrInd;
    }

    @JsonProperty("awdLtrInd")
    public void setAwdLtrInd(String awdLtrInd) {
        this.awdLtrInd = awdLtrInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withAwdLtrInd(String awdLtrInd) {
        this.awdLtrInd = awdLtrInd;
        return this;
    }

    @JsonProperty("depNoParData")
    public String getDepNoParData() {
        return depNoParData;
    }

    @JsonProperty("depNoParData")
    public void setDepNoParData(String depNoParData) {
        this.depNoParData = depNoParData;
    }

    public FinancialAidRecordMaintenance100QapiPost withDepNoParData(String depNoParData) {
        this.depNoParData = depNoParData;
        return this;
    }

    @JsonProperty("displayDependStatus")
    public String getDisplayDependStatus() {
        return displayDependStatus;
    }

    @JsonProperty("displayDependStatus")
    public void setDisplayDependStatus(String displayDependStatus) {
        this.displayDependStatus = displayDependStatus;
    }

    public FinancialAidRecordMaintenance100QapiPost withDisplayDependStatus(String displayDependStatus) {
        this.displayDependStatus = displayDependStatus;
        return this;
    }

    @JsonProperty("displayInfoAccessInd")
    public String getDisplayInfoAccessInd() {
        return displayInfoAccessInd;
    }

    @JsonProperty("displayInfoAccessInd")
    public void setDisplayInfoAccessInd(String displayInfoAccessInd) {
        this.displayInfoAccessInd = displayInfoAccessInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withDisplayInfoAccessInd(String displayInfoAccessInd) {
        this.displayInfoAccessInd = displayInfoAccessInd;
        return this;
    }

    @JsonProperty("ssInfoAccessInd")
    public String getSsInfoAccessInd() {
        return ssInfoAccessInd;
    }

    @JsonProperty("ssInfoAccessInd")
    public void setSsInfoAccessInd(String ssInfoAccessInd) {
        this.ssInfoAccessInd = ssInfoAccessInd;
    }

    public FinancialAidRecordMaintenance100QapiPost withSsInfoAccessInd(String ssInfoAccessInd) {
        this.ssInfoAccessInd = ssInfoAccessInd;
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

    public FinancialAidRecordMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialAidRecordMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("fundDescription");
        sb.append('=');
        sb.append(((this.fundDescription == null)?"<null>":this.fundDescription));
        sb.append(',');
        sb.append("awstCode");
        sb.append('=');
        sb.append(((this.awstCode == null)?"<null>":this.awstCode));
        sb.append(',');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
        sb.append(',');
        sb.append("sysInd");
        sb.append('=');
        sb.append(((this.sysInd == null)?"<null>":this.sysInd));
        sb.append(',');
        sb.append("offerAmt");
        sb.append('=');
        sb.append(((this.offerAmt == null)?"<null>":this.offerAmt));
        sb.append(',');
        sb.append("acceptAmt");
        sb.append('=');
        sb.append(((this.acceptAmt == null)?"<null>":this.acceptAmt));
        sb.append(',');
        sb.append("displayDeccanAmt");
        sb.append('=');
        sb.append(((this.displayDeccanAmt == null)?"<null>":this.displayDeccanAmt));
        sb.append(',');
        sb.append("displayMemautAmt");
        sb.append('=');
        sb.append(((this.displayMemautAmt == null)?"<null>":this.displayMemautAmt));
        sb.append(',');
        sb.append("paidAmt");
        sb.append('=');
        sb.append(((this.paidAmt == null)?"<null>":this.paidAmt));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("pgrpCode");
        sb.append('=');
        sb.append(((this.pgrpCode == null)?"<null>":this.pgrpCode));
        sb.append(',');
        sb.append("displayRtvpgrpDesc");
        sb.append('=');
        sb.append(((this.displayRtvpgrpDesc == null)?"<null>":this.displayRtvpgrpDesc));
        sb.append(',');
        sb.append("prepOrTeachInd");
        sb.append('=');
        sb.append(((this.prepOrTeachInd == null)?"<null>":this.prepOrTeachInd));
        sb.append(',');
        sb.append("pellOrigInd");
        sb.append('=');
        sb.append(((this.pellOrigInd == null)?"<null>":this.pellOrigInd));
        sb.append(',');
        sb.append("pgrpCodeLockInd");
        sb.append('=');
        sb.append(((this.pgrpCodeLockInd == null)?"<null>":this.pgrpCodeLockInd));
        sb.append(',');
        sb.append("highPellLeuFlag");
        sb.append('=');
        sb.append(((this.highPellLeuFlag == null)?"<null>":this.highPellLeuFlag));
        sb.append(',');
        sb.append("addlPellEligInd");
        sb.append('=');
        sb.append(((this.addlPellEligInd == null)?"<null>":this.addlPellEligInd));
        sb.append(',');
        sb.append("pckgCompDate");
        sb.append('=');
        sb.append(((this.pckgCompDate == null)?"<null>":this.pckgCompDate));
        sb.append(',');
        sb.append("borrowerBasedCde");
        sb.append('=');
        sb.append(((this.borrowerBasedCde == null)?"<null>":this.borrowerBasedCde));
        sb.append(',');
        sb.append("postBaPellOvrd");
        sb.append('=');
        sb.append(((this.postBaPellOvrd == null)?"<null>":this.postBaPellOvrd));
        sb.append(',');
        sb.append("pgrpLockInd");
        sb.append('=');
        sb.append(((this.pgrpLockInd == null)?"<null>":this.pgrpLockInd));
        sb.append(',');
        sb.append("ovrdeSayrCode");
        sb.append('=');
        sb.append(((this.ovrdeSayrCode == null)?"<null>":this.ovrdeSayrCode));
        sb.append(',');
        sb.append("formerHealInd");
        sb.append('=');
        sb.append(((this.formerHealInd == null)?"<null>":this.formerHealInd));
        sb.append(',');
        sb.append("addlStfdEligInd");
        sb.append('=');
        sb.append(((this.addlStfdEligInd == null)?"<null>":this.addlStfdEligInd));
        sb.append(',');
        sb.append("awdLtrInd");
        sb.append('=');
        sb.append(((this.awdLtrInd == null)?"<null>":this.awdLtrInd));
        sb.append(',');
        sb.append("depNoParData");
        sb.append('=');
        sb.append(((this.depNoParData == null)?"<null>":this.depNoParData));
        sb.append(',');
        sb.append("displayDependStatus");
        sb.append('=');
        sb.append(((this.displayDependStatus == null)?"<null>":this.displayDependStatus));
        sb.append(',');
        sb.append("displayInfoAccessInd");
        sb.append('=');
        sb.append(((this.displayInfoAccessInd == null)?"<null>":this.displayInfoAccessInd));
        sb.append(',');
        sb.append("ssInfoAccessInd");
        sb.append('=');
        sb.append(((this.ssInfoAccessInd == null)?"<null>":this.ssInfoAccessInd));
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
        result = ((result* 31)+((this.displayMemautAmt == null)? 0 :this.displayMemautAmt.hashCode()));
        result = ((result* 31)+((this.depNoParData == null)? 0 :this.depNoParData.hashCode()));
        result = ((result* 31)+((this.sysInd == null)? 0 :this.sysInd.hashCode()));
        result = ((result* 31)+((this.addlStfdEligInd == null)? 0 :this.addlStfdEligInd.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.displayInfoAccessInd == null)? 0 :this.displayInfoAccessInd.hashCode()));
        result = ((result* 31)+((this.borrowerBasedCde == null)? 0 :this.borrowerBasedCde.hashCode()));
        result = ((result* 31)+((this.pellOrigInd == null)? 0 :this.pellOrigInd.hashCode()));
        result = ((result* 31)+((this.ovrdeSayrCode == null)? 0 :this.ovrdeSayrCode.hashCode()));
        result = ((result* 31)+((this.displayDependStatus == null)? 0 :this.displayDependStatus.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.displayRtvpgrpDesc == null)? 0 :this.displayRtvpgrpDesc.hashCode()));
        result = ((result* 31)+((this.highPellLeuFlag == null)? 0 :this.highPellLeuFlag.hashCode()));
        result = ((result* 31)+((this.acceptAmt == null)? 0 :this.acceptAmt.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.formerHealInd == null)? 0 :this.formerHealInd.hashCode()));
        result = ((result* 31)+((this.paidAmt == null)? 0 :this.paidAmt.hashCode()));
        result = ((result* 31)+((this.pgrpCodeLockInd == null)? 0 :this.pgrpCodeLockInd.hashCode()));
        result = ((result* 31)+((this.fundDescription == null)? 0 :this.fundDescription.hashCode()));
        result = ((result* 31)+((this.prepOrTeachInd == null)? 0 :this.prepOrTeachInd.hashCode()));
        result = ((result* 31)+((this.ssInfoAccessInd == null)? 0 :this.ssInfoAccessInd.hashCode()));
        result = ((result* 31)+((this.awstCode == null)? 0 :this.awstCode.hashCode()));
        result = ((result* 31)+((this.awdLtrInd == null)? 0 :this.awdLtrInd.hashCode()));
        result = ((result* 31)+((this.postBaPellOvrd == null)? 0 :this.postBaPellOvrd.hashCode()));
        result = ((result* 31)+((this.pgrpCode == null)? 0 :this.pgrpCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.offerAmt == null)? 0 :this.offerAmt.hashCode()));
        result = ((result* 31)+((this.displayDeccanAmt == null)? 0 :this.displayDeccanAmt.hashCode()));
        result = ((result* 31)+((this.addlPellEligInd == null)? 0 :this.addlPellEligInd.hashCode()));
        result = ((result* 31)+((this.pckgCompDate == null)? 0 :this.pckgCompDate.hashCode()));
        result = ((result* 31)+((this.pgrpLockInd == null)? 0 :this.pgrpLockInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialAidRecordMaintenance100QapiPost) == false) {
            return false;
        }
        FinancialAidRecordMaintenance100QapiPost rhs = ((FinancialAidRecordMaintenance100QapiPost) other);
        return ((((((((((((((((((((((((((((((((((this.displayMemautAmt == rhs.displayMemautAmt)||((this.displayMemautAmt!= null)&&this.displayMemautAmt.equals(rhs.displayMemautAmt)))&&((this.depNoParData == rhs.depNoParData)||((this.depNoParData!= null)&&this.depNoParData.equals(rhs.depNoParData))))&&((this.sysInd == rhs.sysInd)||((this.sysInd!= null)&&this.sysInd.equals(rhs.sysInd))))&&((this.addlStfdEligInd == rhs.addlStfdEligInd)||((this.addlStfdEligInd!= null)&&this.addlStfdEligInd.equals(rhs.addlStfdEligInd))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.displayInfoAccessInd == rhs.displayInfoAccessInd)||((this.displayInfoAccessInd!= null)&&this.displayInfoAccessInd.equals(rhs.displayInfoAccessInd))))&&((this.borrowerBasedCde == rhs.borrowerBasedCde)||((this.borrowerBasedCde!= null)&&this.borrowerBasedCde.equals(rhs.borrowerBasedCde))))&&((this.pellOrigInd == rhs.pellOrigInd)||((this.pellOrigInd!= null)&&this.pellOrigInd.equals(rhs.pellOrigInd))))&&((this.ovrdeSayrCode == rhs.ovrdeSayrCode)||((this.ovrdeSayrCode!= null)&&this.ovrdeSayrCode.equals(rhs.ovrdeSayrCode))))&&((this.displayDependStatus == rhs.displayDependStatus)||((this.displayDependStatus!= null)&&this.displayDependStatus.equals(rhs.displayDependStatus))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.displayRtvpgrpDesc == rhs.displayRtvpgrpDesc)||((this.displayRtvpgrpDesc!= null)&&this.displayRtvpgrpDesc.equals(rhs.displayRtvpgrpDesc))))&&((this.highPellLeuFlag == rhs.highPellLeuFlag)||((this.highPellLeuFlag!= null)&&this.highPellLeuFlag.equals(rhs.highPellLeuFlag))))&&((this.acceptAmt == rhs.acceptAmt)||((this.acceptAmt!= null)&&this.acceptAmt.equals(rhs.acceptAmt))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.formerHealInd == rhs.formerHealInd)||((this.formerHealInd!= null)&&this.formerHealInd.equals(rhs.formerHealInd))))&&((this.paidAmt == rhs.paidAmt)||((this.paidAmt!= null)&&this.paidAmt.equals(rhs.paidAmt))))&&((this.pgrpCodeLockInd == rhs.pgrpCodeLockInd)||((this.pgrpCodeLockInd!= null)&&this.pgrpCodeLockInd.equals(rhs.pgrpCodeLockInd))))&&((this.fundDescription == rhs.fundDescription)||((this.fundDescription!= null)&&this.fundDescription.equals(rhs.fundDescription))))&&((this.prepOrTeachInd == rhs.prepOrTeachInd)||((this.prepOrTeachInd!= null)&&this.prepOrTeachInd.equals(rhs.prepOrTeachInd))))&&((this.ssInfoAccessInd == rhs.ssInfoAccessInd)||((this.ssInfoAccessInd!= null)&&this.ssInfoAccessInd.equals(rhs.ssInfoAccessInd))))&&((this.awstCode == rhs.awstCode)||((this.awstCode!= null)&&this.awstCode.equals(rhs.awstCode))))&&((this.awdLtrInd == rhs.awdLtrInd)||((this.awdLtrInd!= null)&&this.awdLtrInd.equals(rhs.awdLtrInd))))&&((this.postBaPellOvrd == rhs.postBaPellOvrd)||((this.postBaPellOvrd!= null)&&this.postBaPellOvrd.equals(rhs.postBaPellOvrd))))&&((this.pgrpCode == rhs.pgrpCode)||((this.pgrpCode!= null)&&this.pgrpCode.equals(rhs.pgrpCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.offerAmt == rhs.offerAmt)||((this.offerAmt!= null)&&this.offerAmt.equals(rhs.offerAmt))))&&((this.displayDeccanAmt == rhs.displayDeccanAmt)||((this.displayDeccanAmt!= null)&&this.displayDeccanAmt.equals(rhs.displayDeccanAmt))))&&((this.addlPellEligInd == rhs.addlPellEligInd)||((this.addlPellEligInd!= null)&&this.addlPellEligInd.equals(rhs.addlPellEligInd))))&&((this.pckgCompDate == rhs.pckgCompDate)||((this.pckgCompDate!= null)&&this.pckgCompDate.equals(rhs.pckgCompDate))))&&((this.pgrpLockInd == rhs.pgrpLockInd)||((this.pgrpLockInd!= null)&&this.pgrpLockInd.equals(rhs.pgrpLockInd))));
    }

}
