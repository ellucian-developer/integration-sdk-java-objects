
package com.ellucian.generated.bpapi.ban.financial_aid_record_maintenance.v1_0_0;

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
    "highPellLeuFlag",
    "depNoParData",
    "formerHealInd",
    "pgrpCodeLockInd",
    "addlStfdEligInd",
    "prepOrTeachInd",
    "ssInfoAccessInd",
    "awdLtrInd",
    "postBaPellOvrd",
    "displayInfoAccessInd",
    "ovrdeSayrSeqNo",
    "borrowerBasedCde",
    "dispRorstatOvrdeSayrCode",
    "ovrdeSayrCode",
    "pellOrigInd",
    "ovrdeSayrAlgoCode",
    "displayDependStatus",
    "pgrpCode",
    "addlPellEligInd",
    "pckgCompDate",
    "displayRtvpgrpDesc",
    "pgrpLockInd"
})
@Generated("jsonschema2pojo")
public class Rorstat {

    /**
     * High Pell LEU
     * <p>
     * Lineage reference object : RORSTAT_HIGH_PELL_LEU_FLAG
     * 
     */
    @JsonProperty("highPellLeuFlag")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_HIGH_PELL_LEU_FLAG")
    private String highPellLeuFlag;
    /**
     * Dependent without Parent Data
     * <p>
     * Lineage reference object : RORSTAT_DEP_NO_PAR_DATA
     * 
     */
    @JsonProperty("depNoParData")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_DEP_NO_PAR_DATA")
    private String depNoParData;
    /**
     * HPPA
     * <p>
     * Lineage reference object : RORSTAT_FORMER_HEAL_IND
     * 
     */
    @JsonProperty("formerHealInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_FORMER_HEAL_IND")
    private String formerHealInd;
    /**
     * Group Lock
     * <p>
     * Lineage reference object : RORSTAT_PGRP_CODE_LOCK_IND
     * 
     */
    @JsonProperty("pgrpCodeLockInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PGRP_CODE_LOCK_IND")
    private String pgrpCodeLockInd;
    /**
     * Additional Stafford
     * <p>
     * Lineage reference object : RORSTAT_ADDL_STFD_ELIG_IND
     * 
     */
    @JsonProperty("addlStfdEligInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_ADDL_STFD_ELIG_IND")
    private String addlStfdEligInd;
    /**
     * Preparatory or Teacher Certification
     * <p>
     * Lineage reference object : RORSTAT_PREP_OR_TEACH_IND
     * (Required)
     * 
     */
    @JsonProperty("prepOrTeachInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PREP_OR_TEACH_IND")
    private String prepOrTeachInd;
    /**
     * College Financing Plan Information Access
     * <p>
     * Lineage reference object : RORSTAT_SS_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("ssInfoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_SS_INFO_ACCESS_IND")
    private String ssInfoAccessInd;
    /**
     * Award Letter
     * <p>
     * Lineage reference object : RORSTAT_AWD_LTR_IND
     * 
     */
    @JsonProperty("awdLtrInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_AWD_LTR_IND")
    private String awdLtrInd;
    /**
     * Post Bachelor's Degree Pell Override
     * <p>
     * Lineage reference object : RORSTAT_POST_BA_PELL_OVRD
     * 
     */
    @JsonProperty("postBaPellOvrd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_POST_BA_PELL_OVRD")
    private String postBaPellOvrd;
    /**
     * Information Access
     * <p>
     * 
     * 
     */
    @JsonProperty("displayInfoAccessInd")
    private String displayInfoAccessInd;
    /**
     * Sequence
     * <p>
     * Lineage reference object : RORSTAT_OVRDE_SAYR_SEQ_NO
     * 
     */
    @JsonProperty("ovrdeSayrSeqNo")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_OVRDE_SAYR_SEQ_NO")
    private Double ovrdeSayrSeqNo;
    /**
     * Borrower Based
     * <p>
     * Lineage reference object : RORSTAT_BORROWER_BASED_CDE
     * 
     */
    @JsonProperty("borrowerBasedCde")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_BORROWER_BASED_CDE")
    private String borrowerBasedCde;
    /**
     * Override SAY
     * <p>
     * 
     * 
     */
    @JsonProperty("dispRorstatOvrdeSayrCode")
    private String dispRorstatOvrdeSayrCode;
    /**
     * Override SAY
     * <p>
     * Lineage reference object : RORSTAT_OVRDE_SAYR_CODE, Lookup lineage reference object : ROBSAYR
     * 
     */
    @JsonProperty("ovrdeSayrCode")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_OVRDE_SAYR_CODE, Lookup lineage reference object : ROBSAYR")
    private String ovrdeSayrCode;
    /**
     * Pell Origination
     * <p>
     * Lineage reference object : RORSTAT_PELL_ORIG_IND
     * 
     */
    @JsonProperty("pellOrigInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PELL_ORIG_IND")
    private String pellOrigInd;
    /**
     * Rule
     * <p>
     * Lineage reference object : RORSTAT_OVRDE_SAYR_ALGO_CODE
     * 
     */
    @JsonProperty("ovrdeSayrAlgoCode")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_OVRDE_SAYR_ALGO_CODE")
    private String ovrdeSayrAlgoCode;
    /**
     * Dependency
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDependStatus")
    private String displayDependStatus;
    /**
     * Group
     * <p>
     * Lineage reference object : RORSTAT_PGRP_CODE, Lookup lineage reference object : rtvpgrp
     * 
     */
    @JsonProperty("pgrpCode")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PGRP_CODE, Lookup lineage reference object : rtvpgrp")
    private String pgrpCode;
    /**
     * Additional Eligibility Indicator
     * <p>
     * Lineage reference object : RORSTAT_ADDL_PELL_ELIG_IND
     * 
     */
    @JsonProperty("addlPellEligInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_ADDL_PELL_ELIG_IND")
    private String addlPellEligInd;
    /**
     * Package Date
     * <p>
     * Lineage reference object : RORSTAT_PCKG_COMP_DATE
     * 
     */
    @JsonProperty("pckgCompDate")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PCKG_COMP_DATE")
    private Date pckgCompDate;
    @JsonProperty("displayRtvpgrpDesc")
    private String displayRtvpgrpDesc;
    /**
     * Packaging Lock
     * <p>
     * Lineage reference object : RORSTAT_PGRP_LOCK_IND
     * 
     */
    @JsonProperty("pgrpLockInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PGRP_LOCK_IND")
    private String pgrpLockInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * High Pell LEU
     * <p>
     * Lineage reference object : RORSTAT_HIGH_PELL_LEU_FLAG
     * 
     */
    @JsonProperty("highPellLeuFlag")
    public String getHighPellLeuFlag() {
        return highPellLeuFlag;
    }

    /**
     * High Pell LEU
     * <p>
     * Lineage reference object : RORSTAT_HIGH_PELL_LEU_FLAG
     * 
     */
    @JsonProperty("highPellLeuFlag")
    public void setHighPellLeuFlag(String highPellLeuFlag) {
        this.highPellLeuFlag = highPellLeuFlag;
    }

    public Rorstat withHighPellLeuFlag(String highPellLeuFlag) {
        this.highPellLeuFlag = highPellLeuFlag;
        return this;
    }

    /**
     * Dependent without Parent Data
     * <p>
     * Lineage reference object : RORSTAT_DEP_NO_PAR_DATA
     * 
     */
    @JsonProperty("depNoParData")
    public String getDepNoParData() {
        return depNoParData;
    }

    /**
     * Dependent without Parent Data
     * <p>
     * Lineage reference object : RORSTAT_DEP_NO_PAR_DATA
     * 
     */
    @JsonProperty("depNoParData")
    public void setDepNoParData(String depNoParData) {
        this.depNoParData = depNoParData;
    }

    public Rorstat withDepNoParData(String depNoParData) {
        this.depNoParData = depNoParData;
        return this;
    }

    /**
     * HPPA
     * <p>
     * Lineage reference object : RORSTAT_FORMER_HEAL_IND
     * 
     */
    @JsonProperty("formerHealInd")
    public String getFormerHealInd() {
        return formerHealInd;
    }

    /**
     * HPPA
     * <p>
     * Lineage reference object : RORSTAT_FORMER_HEAL_IND
     * 
     */
    @JsonProperty("formerHealInd")
    public void setFormerHealInd(String formerHealInd) {
        this.formerHealInd = formerHealInd;
    }

    public Rorstat withFormerHealInd(String formerHealInd) {
        this.formerHealInd = formerHealInd;
        return this;
    }

    /**
     * Group Lock
     * <p>
     * Lineage reference object : RORSTAT_PGRP_CODE_LOCK_IND
     * 
     */
    @JsonProperty("pgrpCodeLockInd")
    public String getPgrpCodeLockInd() {
        return pgrpCodeLockInd;
    }

    /**
     * Group Lock
     * <p>
     * Lineage reference object : RORSTAT_PGRP_CODE_LOCK_IND
     * 
     */
    @JsonProperty("pgrpCodeLockInd")
    public void setPgrpCodeLockInd(String pgrpCodeLockInd) {
        this.pgrpCodeLockInd = pgrpCodeLockInd;
    }

    public Rorstat withPgrpCodeLockInd(String pgrpCodeLockInd) {
        this.pgrpCodeLockInd = pgrpCodeLockInd;
        return this;
    }

    /**
     * Additional Stafford
     * <p>
     * Lineage reference object : RORSTAT_ADDL_STFD_ELIG_IND
     * 
     */
    @JsonProperty("addlStfdEligInd")
    public String getAddlStfdEligInd() {
        return addlStfdEligInd;
    }

    /**
     * Additional Stafford
     * <p>
     * Lineage reference object : RORSTAT_ADDL_STFD_ELIG_IND
     * 
     */
    @JsonProperty("addlStfdEligInd")
    public void setAddlStfdEligInd(String addlStfdEligInd) {
        this.addlStfdEligInd = addlStfdEligInd;
    }

    public Rorstat withAddlStfdEligInd(String addlStfdEligInd) {
        this.addlStfdEligInd = addlStfdEligInd;
        return this;
    }

    /**
     * Preparatory or Teacher Certification
     * <p>
     * Lineage reference object : RORSTAT_PREP_OR_TEACH_IND
     * (Required)
     * 
     */
    @JsonProperty("prepOrTeachInd")
    public String getPrepOrTeachInd() {
        return prepOrTeachInd;
    }

    /**
     * Preparatory or Teacher Certification
     * <p>
     * Lineage reference object : RORSTAT_PREP_OR_TEACH_IND
     * (Required)
     * 
     */
    @JsonProperty("prepOrTeachInd")
    public void setPrepOrTeachInd(String prepOrTeachInd) {
        this.prepOrTeachInd = prepOrTeachInd;
    }

    public Rorstat withPrepOrTeachInd(String prepOrTeachInd) {
        this.prepOrTeachInd = prepOrTeachInd;
        return this;
    }

    /**
     * College Financing Plan Information Access
     * <p>
     * Lineage reference object : RORSTAT_SS_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("ssInfoAccessInd")
    public String getSsInfoAccessInd() {
        return ssInfoAccessInd;
    }

    /**
     * College Financing Plan Information Access
     * <p>
     * Lineage reference object : RORSTAT_SS_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("ssInfoAccessInd")
    public void setSsInfoAccessInd(String ssInfoAccessInd) {
        this.ssInfoAccessInd = ssInfoAccessInd;
    }

    public Rorstat withSsInfoAccessInd(String ssInfoAccessInd) {
        this.ssInfoAccessInd = ssInfoAccessInd;
        return this;
    }

    /**
     * Award Letter
     * <p>
     * Lineage reference object : RORSTAT_AWD_LTR_IND
     * 
     */
    @JsonProperty("awdLtrInd")
    public String getAwdLtrInd() {
        return awdLtrInd;
    }

    /**
     * Award Letter
     * <p>
     * Lineage reference object : RORSTAT_AWD_LTR_IND
     * 
     */
    @JsonProperty("awdLtrInd")
    public void setAwdLtrInd(String awdLtrInd) {
        this.awdLtrInd = awdLtrInd;
    }

    public Rorstat withAwdLtrInd(String awdLtrInd) {
        this.awdLtrInd = awdLtrInd;
        return this;
    }

    /**
     * Post Bachelor's Degree Pell Override
     * <p>
     * Lineage reference object : RORSTAT_POST_BA_PELL_OVRD
     * 
     */
    @JsonProperty("postBaPellOvrd")
    public String getPostBaPellOvrd() {
        return postBaPellOvrd;
    }

    /**
     * Post Bachelor's Degree Pell Override
     * <p>
     * Lineage reference object : RORSTAT_POST_BA_PELL_OVRD
     * 
     */
    @JsonProperty("postBaPellOvrd")
    public void setPostBaPellOvrd(String postBaPellOvrd) {
        this.postBaPellOvrd = postBaPellOvrd;
    }

    public Rorstat withPostBaPellOvrd(String postBaPellOvrd) {
        this.postBaPellOvrd = postBaPellOvrd;
        return this;
    }

    /**
     * Information Access
     * <p>
     * 
     * 
     */
    @JsonProperty("displayInfoAccessInd")
    public String getDisplayInfoAccessInd() {
        return displayInfoAccessInd;
    }

    /**
     * Information Access
     * <p>
     * 
     * 
     */
    @JsonProperty("displayInfoAccessInd")
    public void setDisplayInfoAccessInd(String displayInfoAccessInd) {
        this.displayInfoAccessInd = displayInfoAccessInd;
    }

    public Rorstat withDisplayInfoAccessInd(String displayInfoAccessInd) {
        this.displayInfoAccessInd = displayInfoAccessInd;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : RORSTAT_OVRDE_SAYR_SEQ_NO
     * 
     */
    @JsonProperty("ovrdeSayrSeqNo")
    public Double getOvrdeSayrSeqNo() {
        return ovrdeSayrSeqNo;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : RORSTAT_OVRDE_SAYR_SEQ_NO
     * 
     */
    @JsonProperty("ovrdeSayrSeqNo")
    public void setOvrdeSayrSeqNo(Double ovrdeSayrSeqNo) {
        this.ovrdeSayrSeqNo = ovrdeSayrSeqNo;
    }

    public Rorstat withOvrdeSayrSeqNo(Double ovrdeSayrSeqNo) {
        this.ovrdeSayrSeqNo = ovrdeSayrSeqNo;
        return this;
    }

    /**
     * Borrower Based
     * <p>
     * Lineage reference object : RORSTAT_BORROWER_BASED_CDE
     * 
     */
    @JsonProperty("borrowerBasedCde")
    public String getBorrowerBasedCde() {
        return borrowerBasedCde;
    }

    /**
     * Borrower Based
     * <p>
     * Lineage reference object : RORSTAT_BORROWER_BASED_CDE
     * 
     */
    @JsonProperty("borrowerBasedCde")
    public void setBorrowerBasedCde(String borrowerBasedCde) {
        this.borrowerBasedCde = borrowerBasedCde;
    }

    public Rorstat withBorrowerBasedCde(String borrowerBasedCde) {
        this.borrowerBasedCde = borrowerBasedCde;
        return this;
    }

    /**
     * Override SAY
     * <p>
     * 
     * 
     */
    @JsonProperty("dispRorstatOvrdeSayrCode")
    public String getDispRorstatOvrdeSayrCode() {
        return dispRorstatOvrdeSayrCode;
    }

    /**
     * Override SAY
     * <p>
     * 
     * 
     */
    @JsonProperty("dispRorstatOvrdeSayrCode")
    public void setDispRorstatOvrdeSayrCode(String dispRorstatOvrdeSayrCode) {
        this.dispRorstatOvrdeSayrCode = dispRorstatOvrdeSayrCode;
    }

    public Rorstat withDispRorstatOvrdeSayrCode(String dispRorstatOvrdeSayrCode) {
        this.dispRorstatOvrdeSayrCode = dispRorstatOvrdeSayrCode;
        return this;
    }

    /**
     * Override SAY
     * <p>
     * Lineage reference object : RORSTAT_OVRDE_SAYR_CODE, Lookup lineage reference object : ROBSAYR
     * 
     */
    @JsonProperty("ovrdeSayrCode")
    public String getOvrdeSayrCode() {
        return ovrdeSayrCode;
    }

    /**
     * Override SAY
     * <p>
     * Lineage reference object : RORSTAT_OVRDE_SAYR_CODE, Lookup lineage reference object : ROBSAYR
     * 
     */
    @JsonProperty("ovrdeSayrCode")
    public void setOvrdeSayrCode(String ovrdeSayrCode) {
        this.ovrdeSayrCode = ovrdeSayrCode;
    }

    public Rorstat withOvrdeSayrCode(String ovrdeSayrCode) {
        this.ovrdeSayrCode = ovrdeSayrCode;
        return this;
    }

    /**
     * Pell Origination
     * <p>
     * Lineage reference object : RORSTAT_PELL_ORIG_IND
     * 
     */
    @JsonProperty("pellOrigInd")
    public String getPellOrigInd() {
        return pellOrigInd;
    }

    /**
     * Pell Origination
     * <p>
     * Lineage reference object : RORSTAT_PELL_ORIG_IND
     * 
     */
    @JsonProperty("pellOrigInd")
    public void setPellOrigInd(String pellOrigInd) {
        this.pellOrigInd = pellOrigInd;
    }

    public Rorstat withPellOrigInd(String pellOrigInd) {
        this.pellOrigInd = pellOrigInd;
        return this;
    }

    /**
     * Rule
     * <p>
     * Lineage reference object : RORSTAT_OVRDE_SAYR_ALGO_CODE
     * 
     */
    @JsonProperty("ovrdeSayrAlgoCode")
    public String getOvrdeSayrAlgoCode() {
        return ovrdeSayrAlgoCode;
    }

    /**
     * Rule
     * <p>
     * Lineage reference object : RORSTAT_OVRDE_SAYR_ALGO_CODE
     * 
     */
    @JsonProperty("ovrdeSayrAlgoCode")
    public void setOvrdeSayrAlgoCode(String ovrdeSayrAlgoCode) {
        this.ovrdeSayrAlgoCode = ovrdeSayrAlgoCode;
    }

    public Rorstat withOvrdeSayrAlgoCode(String ovrdeSayrAlgoCode) {
        this.ovrdeSayrAlgoCode = ovrdeSayrAlgoCode;
        return this;
    }

    /**
     * Dependency
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDependStatus")
    public String getDisplayDependStatus() {
        return displayDependStatus;
    }

    /**
     * Dependency
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDependStatus")
    public void setDisplayDependStatus(String displayDependStatus) {
        this.displayDependStatus = displayDependStatus;
    }

    public Rorstat withDisplayDependStatus(String displayDependStatus) {
        this.displayDependStatus = displayDependStatus;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : RORSTAT_PGRP_CODE, Lookup lineage reference object : rtvpgrp
     * 
     */
    @JsonProperty("pgrpCode")
    public String getPgrpCode() {
        return pgrpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : RORSTAT_PGRP_CODE, Lookup lineage reference object : rtvpgrp
     * 
     */
    @JsonProperty("pgrpCode")
    public void setPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
    }

    public Rorstat withPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
        return this;
    }

    /**
     * Additional Eligibility Indicator
     * <p>
     * Lineage reference object : RORSTAT_ADDL_PELL_ELIG_IND
     * 
     */
    @JsonProperty("addlPellEligInd")
    public String getAddlPellEligInd() {
        return addlPellEligInd;
    }

    /**
     * Additional Eligibility Indicator
     * <p>
     * Lineage reference object : RORSTAT_ADDL_PELL_ELIG_IND
     * 
     */
    @JsonProperty("addlPellEligInd")
    public void setAddlPellEligInd(String addlPellEligInd) {
        this.addlPellEligInd = addlPellEligInd;
    }

    public Rorstat withAddlPellEligInd(String addlPellEligInd) {
        this.addlPellEligInd = addlPellEligInd;
        return this;
    }

    /**
     * Package Date
     * <p>
     * Lineage reference object : RORSTAT_PCKG_COMP_DATE
     * 
     */
    @JsonProperty("pckgCompDate")
    public Date getPckgCompDate() {
        return pckgCompDate;
    }

    /**
     * Package Date
     * <p>
     * Lineage reference object : RORSTAT_PCKG_COMP_DATE
     * 
     */
    @JsonProperty("pckgCompDate")
    public void setPckgCompDate(Date pckgCompDate) {
        this.pckgCompDate = pckgCompDate;
    }

    public Rorstat withPckgCompDate(Date pckgCompDate) {
        this.pckgCompDate = pckgCompDate;
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

    public Rorstat withDisplayRtvpgrpDesc(String displayRtvpgrpDesc) {
        this.displayRtvpgrpDesc = displayRtvpgrpDesc;
        return this;
    }

    /**
     * Packaging Lock
     * <p>
     * Lineage reference object : RORSTAT_PGRP_LOCK_IND
     * 
     */
    @JsonProperty("pgrpLockInd")
    public String getPgrpLockInd() {
        return pgrpLockInd;
    }

    /**
     * Packaging Lock
     * <p>
     * Lineage reference object : RORSTAT_PGRP_LOCK_IND
     * 
     */
    @JsonProperty("pgrpLockInd")
    public void setPgrpLockInd(String pgrpLockInd) {
        this.pgrpLockInd = pgrpLockInd;
    }

    public Rorstat withPgrpLockInd(String pgrpLockInd) {
        this.pgrpLockInd = pgrpLockInd;
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

    public Rorstat withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rorstat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("highPellLeuFlag");
        sb.append('=');
        sb.append(((this.highPellLeuFlag == null)?"<null>":this.highPellLeuFlag));
        sb.append(',');
        sb.append("depNoParData");
        sb.append('=');
        sb.append(((this.depNoParData == null)?"<null>":this.depNoParData));
        sb.append(',');
        sb.append("formerHealInd");
        sb.append('=');
        sb.append(((this.formerHealInd == null)?"<null>":this.formerHealInd));
        sb.append(',');
        sb.append("pgrpCodeLockInd");
        sb.append('=');
        sb.append(((this.pgrpCodeLockInd == null)?"<null>":this.pgrpCodeLockInd));
        sb.append(',');
        sb.append("addlStfdEligInd");
        sb.append('=');
        sb.append(((this.addlStfdEligInd == null)?"<null>":this.addlStfdEligInd));
        sb.append(',');
        sb.append("prepOrTeachInd");
        sb.append('=');
        sb.append(((this.prepOrTeachInd == null)?"<null>":this.prepOrTeachInd));
        sb.append(',');
        sb.append("ssInfoAccessInd");
        sb.append('=');
        sb.append(((this.ssInfoAccessInd == null)?"<null>":this.ssInfoAccessInd));
        sb.append(',');
        sb.append("awdLtrInd");
        sb.append('=');
        sb.append(((this.awdLtrInd == null)?"<null>":this.awdLtrInd));
        sb.append(',');
        sb.append("postBaPellOvrd");
        sb.append('=');
        sb.append(((this.postBaPellOvrd == null)?"<null>":this.postBaPellOvrd));
        sb.append(',');
        sb.append("displayInfoAccessInd");
        sb.append('=');
        sb.append(((this.displayInfoAccessInd == null)?"<null>":this.displayInfoAccessInd));
        sb.append(',');
        sb.append("ovrdeSayrSeqNo");
        sb.append('=');
        sb.append(((this.ovrdeSayrSeqNo == null)?"<null>":this.ovrdeSayrSeqNo));
        sb.append(',');
        sb.append("borrowerBasedCde");
        sb.append('=');
        sb.append(((this.borrowerBasedCde == null)?"<null>":this.borrowerBasedCde));
        sb.append(',');
        sb.append("dispRorstatOvrdeSayrCode");
        sb.append('=');
        sb.append(((this.dispRorstatOvrdeSayrCode == null)?"<null>":this.dispRorstatOvrdeSayrCode));
        sb.append(',');
        sb.append("ovrdeSayrCode");
        sb.append('=');
        sb.append(((this.ovrdeSayrCode == null)?"<null>":this.ovrdeSayrCode));
        sb.append(',');
        sb.append("pellOrigInd");
        sb.append('=');
        sb.append(((this.pellOrigInd == null)?"<null>":this.pellOrigInd));
        sb.append(',');
        sb.append("ovrdeSayrAlgoCode");
        sb.append('=');
        sb.append(((this.ovrdeSayrAlgoCode == null)?"<null>":this.ovrdeSayrAlgoCode));
        sb.append(',');
        sb.append("displayDependStatus");
        sb.append('=');
        sb.append(((this.displayDependStatus == null)?"<null>":this.displayDependStatus));
        sb.append(',');
        sb.append("pgrpCode");
        sb.append('=');
        sb.append(((this.pgrpCode == null)?"<null>":this.pgrpCode));
        sb.append(',');
        sb.append("addlPellEligInd");
        sb.append('=');
        sb.append(((this.addlPellEligInd == null)?"<null>":this.addlPellEligInd));
        sb.append(',');
        sb.append("pckgCompDate");
        sb.append('=');
        sb.append(((this.pckgCompDate == null)?"<null>":this.pckgCompDate));
        sb.append(',');
        sb.append("displayRtvpgrpDesc");
        sb.append('=');
        sb.append(((this.displayRtvpgrpDesc == null)?"<null>":this.displayRtvpgrpDesc));
        sb.append(',');
        sb.append("pgrpLockInd");
        sb.append('=');
        sb.append(((this.pgrpLockInd == null)?"<null>":this.pgrpLockInd));
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
        result = ((result* 31)+((this.highPellLeuFlag == null)? 0 :this.highPellLeuFlag.hashCode()));
        result = ((result* 31)+((this.depNoParData == null)? 0 :this.depNoParData.hashCode()));
        result = ((result* 31)+((this.formerHealInd == null)? 0 :this.formerHealInd.hashCode()));
        result = ((result* 31)+((this.pgrpCodeLockInd == null)? 0 :this.pgrpCodeLockInd.hashCode()));
        result = ((result* 31)+((this.addlStfdEligInd == null)? 0 :this.addlStfdEligInd.hashCode()));
        result = ((result* 31)+((this.prepOrTeachInd == null)? 0 :this.prepOrTeachInd.hashCode()));
        result = ((result* 31)+((this.ssInfoAccessInd == null)? 0 :this.ssInfoAccessInd.hashCode()));
        result = ((result* 31)+((this.awdLtrInd == null)? 0 :this.awdLtrInd.hashCode()));
        result = ((result* 31)+((this.postBaPellOvrd == null)? 0 :this.postBaPellOvrd.hashCode()));
        result = ((result* 31)+((this.displayInfoAccessInd == null)? 0 :this.displayInfoAccessInd.hashCode()));
        result = ((result* 31)+((this.ovrdeSayrSeqNo == null)? 0 :this.ovrdeSayrSeqNo.hashCode()));
        result = ((result* 31)+((this.borrowerBasedCde == null)? 0 :this.borrowerBasedCde.hashCode()));
        result = ((result* 31)+((this.dispRorstatOvrdeSayrCode == null)? 0 :this.dispRorstatOvrdeSayrCode.hashCode()));
        result = ((result* 31)+((this.ovrdeSayrCode == null)? 0 :this.ovrdeSayrCode.hashCode()));
        result = ((result* 31)+((this.pellOrigInd == null)? 0 :this.pellOrigInd.hashCode()));
        result = ((result* 31)+((this.ovrdeSayrAlgoCode == null)? 0 :this.ovrdeSayrAlgoCode.hashCode()));
        result = ((result* 31)+((this.displayDependStatus == null)? 0 :this.displayDependStatus.hashCode()));
        result = ((result* 31)+((this.pgrpCode == null)? 0 :this.pgrpCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.addlPellEligInd == null)? 0 :this.addlPellEligInd.hashCode()));
        result = ((result* 31)+((this.pckgCompDate == null)? 0 :this.pckgCompDate.hashCode()));
        result = ((result* 31)+((this.displayRtvpgrpDesc == null)? 0 :this.displayRtvpgrpDesc.hashCode()));
        result = ((result* 31)+((this.pgrpLockInd == null)? 0 :this.pgrpLockInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rorstat) == false) {
            return false;
        }
        Rorstat rhs = ((Rorstat) other);
        return ((((((((((((((((((((((((this.highPellLeuFlag == rhs.highPellLeuFlag)||((this.highPellLeuFlag!= null)&&this.highPellLeuFlag.equals(rhs.highPellLeuFlag)))&&((this.depNoParData == rhs.depNoParData)||((this.depNoParData!= null)&&this.depNoParData.equals(rhs.depNoParData))))&&((this.formerHealInd == rhs.formerHealInd)||((this.formerHealInd!= null)&&this.formerHealInd.equals(rhs.formerHealInd))))&&((this.pgrpCodeLockInd == rhs.pgrpCodeLockInd)||((this.pgrpCodeLockInd!= null)&&this.pgrpCodeLockInd.equals(rhs.pgrpCodeLockInd))))&&((this.addlStfdEligInd == rhs.addlStfdEligInd)||((this.addlStfdEligInd!= null)&&this.addlStfdEligInd.equals(rhs.addlStfdEligInd))))&&((this.prepOrTeachInd == rhs.prepOrTeachInd)||((this.prepOrTeachInd!= null)&&this.prepOrTeachInd.equals(rhs.prepOrTeachInd))))&&((this.ssInfoAccessInd == rhs.ssInfoAccessInd)||((this.ssInfoAccessInd!= null)&&this.ssInfoAccessInd.equals(rhs.ssInfoAccessInd))))&&((this.awdLtrInd == rhs.awdLtrInd)||((this.awdLtrInd!= null)&&this.awdLtrInd.equals(rhs.awdLtrInd))))&&((this.postBaPellOvrd == rhs.postBaPellOvrd)||((this.postBaPellOvrd!= null)&&this.postBaPellOvrd.equals(rhs.postBaPellOvrd))))&&((this.displayInfoAccessInd == rhs.displayInfoAccessInd)||((this.displayInfoAccessInd!= null)&&this.displayInfoAccessInd.equals(rhs.displayInfoAccessInd))))&&((this.ovrdeSayrSeqNo == rhs.ovrdeSayrSeqNo)||((this.ovrdeSayrSeqNo!= null)&&this.ovrdeSayrSeqNo.equals(rhs.ovrdeSayrSeqNo))))&&((this.borrowerBasedCde == rhs.borrowerBasedCde)||((this.borrowerBasedCde!= null)&&this.borrowerBasedCde.equals(rhs.borrowerBasedCde))))&&((this.dispRorstatOvrdeSayrCode == rhs.dispRorstatOvrdeSayrCode)||((this.dispRorstatOvrdeSayrCode!= null)&&this.dispRorstatOvrdeSayrCode.equals(rhs.dispRorstatOvrdeSayrCode))))&&((this.ovrdeSayrCode == rhs.ovrdeSayrCode)||((this.ovrdeSayrCode!= null)&&this.ovrdeSayrCode.equals(rhs.ovrdeSayrCode))))&&((this.pellOrigInd == rhs.pellOrigInd)||((this.pellOrigInd!= null)&&this.pellOrigInd.equals(rhs.pellOrigInd))))&&((this.ovrdeSayrAlgoCode == rhs.ovrdeSayrAlgoCode)||((this.ovrdeSayrAlgoCode!= null)&&this.ovrdeSayrAlgoCode.equals(rhs.ovrdeSayrAlgoCode))))&&((this.displayDependStatus == rhs.displayDependStatus)||((this.displayDependStatus!= null)&&this.displayDependStatus.equals(rhs.displayDependStatus))))&&((this.pgrpCode == rhs.pgrpCode)||((this.pgrpCode!= null)&&this.pgrpCode.equals(rhs.pgrpCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.addlPellEligInd == rhs.addlPellEligInd)||((this.addlPellEligInd!= null)&&this.addlPellEligInd.equals(rhs.addlPellEligInd))))&&((this.pckgCompDate == rhs.pckgCompDate)||((this.pckgCompDate!= null)&&this.pckgCompDate.equals(rhs.pckgCompDate))))&&((this.displayRtvpgrpDesc == rhs.displayRtvpgrpDesc)||((this.displayRtvpgrpDesc!= null)&&this.displayRtvpgrpDesc.equals(rhs.displayRtvpgrpDesc))))&&((this.pgrpLockInd == rhs.pgrpLockInd)||((this.pgrpLockInd!= null)&&this.pgrpLockInd.equals(rhs.pgrpLockInd))));
    }

}
