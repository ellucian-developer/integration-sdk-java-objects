
package com.ellucian.generated.bpapi.ban.employee_benefit_or_deduction.v1_0_0;

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
    "ptrbdcaAmt3Title",
    "ptrbdcaOption2Title",
    "lockinFstaFilSt",
    "w4SignedDate",
    "lockinLetterStatus",
    "entryValue12",
    "breaDesc",
    "commentInd",
    "lockinDependentAmt",
    "lockinLetterDate",
    "bdclCode",
    "1042sLimitBenCde",
    "bdclEmprLimit",
    "ptrbdcaAmt2Title",
    "ptrbdcaAmt7Title",
    "ptrbdcaOption3Title",
    "ptrbdcaAmt4Title",
    "lockinStep2cInd",
    "bdclEmplLimit",
    "eventDate",
    "status",
    "optCode2",
    "optCode3",
    "refNo",
    "ptrbdcaAmt6Title",
    "optCode1",
    "optCode4",
    "optCode5",
    "ptrbdcaOption5Title",
    "amount7",
    "amount6",
    "amount5",
    "amount4",
    "activityDate",
    "amount3",
    "entryValue8",
    "amount2",
    "entryValue7",
    "ptrbdcaAmt1Title",
    "ptrbdcaAmt5Title",
    "amount1",
    "dedEffectiveDateComment",
    "entryValue9",
    "entryValue4",
    "entryValue3",
    "entryValue6",
    "entryValue5",
    "bdclEmplEmprLimit",
    "entryValue2",
    "entryValue1",
    "filingStatusDesc",
    "userId",
    "entryValue10",
    "entryValue11",
    "ptrbdcaOption4Title",
    "lockinDeductionsAmt",
    "dedEffectiveDateLockin",
    "breaCode",
    "lockinOtherincomeAmt",
    "w4SignedUser",
    "commentDate",
    "w4NameChangeInd",
    "bdclDesc",
    "lockinWithholdAllow",
    "comment",
    "bdclMaxGross",
    "commentUserId",
    "effectiveDate",
    "lockinAddwithholdAmt"
})
@Generated("jsonschema2pojo")
public class Pdrdedn {

    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt3Title")
    private String ptrbdcaAmt3Title;
    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption2Title")
    private String ptrbdcaOption2Title;
    /**
     * Filing Status
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_FSTA_FIL_ST
     * 
     */
    @JsonProperty("lockinFstaFilSt")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_LOCKIN_FSTA_FIL_ST")
    private String lockinFstaFilSt;
    /**
     * Signed Date
     * <p>
     * Lineage reference object : PDRDEDN_W4_SIGNED_DATE
     * 
     */
    @JsonProperty("w4SignedDate")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_W4_SIGNED_DATE")
    private Date w4SignedDate;
    /**
     * Letter Status
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_LETTER_STATUS
     * (Required)
     * 
     */
    @JsonProperty("lockinLetterStatus")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_LOCKIN_LETTER_STATUS")
    private String lockinLetterStatus;
    @JsonProperty("entryValue12")
    private String entryValue12;
    @JsonProperty("breaDesc")
    private String breaDesc;
    /**
     * Comments Exist
     * <p>
     * 
     * 
     */
    @JsonProperty("commentInd")
    private String commentInd;
    /**
     * Dependent Amount
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_DEPENDENT_AMT
     * 
     */
    @JsonProperty("lockinDependentAmt")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_LOCKIN_DEPENDENT_AMT")
    private Double lockinDependentAmt;
    /**
     * Letter Date
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_LETTER_DATE
     * 
     */
    @JsonProperty("lockinLetterDate")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_LOCKIN_LETTER_DATE")
    private Date lockinLetterDate;
    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PDRDEDN_BDCL_CODE
     * 
     */
    @JsonProperty("bdclCode")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_BDCL_CODE")
    private String bdclCode;
    /**
     * Limitation on Benefits
     * <p>
     * Lineage reference object : PDRDEDN_1042S_LIMIT_BEN_CDE
     * 
     */
    @JsonProperty("1042sLimitBenCde")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_1042S_LIMIT_BEN_CDE")
    private String _1042sLimitBenCde;
    /**
     * Employer Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclEmprLimit")
    private Double bdclEmprLimit;
    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt2Title")
    private String ptrbdcaAmt2Title;
    /**
     *  7
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt7Title")
    private String ptrbdcaAmt7Title;
    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption3Title")
    private String ptrbdcaOption3Title;
    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt4Title")
    private String ptrbdcaAmt4Title;
    /**
     * Step 2C Indicator
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_STEP2C_IND
     * 
     */
    @JsonProperty("lockinStep2cInd")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_LOCKIN_STEP2C_IND")
    private String lockinStep2cInd;
    /**
     * Employee Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclEmplLimit")
    private Double bdclEmplLimit;
    /**
     * Event Date
     * <p>
     * Lineage reference object : PDRDEDN_EVENT_DATE
     * 
     */
    @JsonProperty("eventDate")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_EVENT_DATE")
    private Date eventDate;
    /**
     * Status
     * <p>
     * Lineage reference object : PDRDEDN_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_STATUS")
    private String status;
    /**
     * Lineage reference object : PDRDEDN_OPT_CODE2
     * 
     */
    @JsonProperty("optCode2")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_OPT_CODE2")
    private String optCode2;
    /**
     * Lineage reference object : PDRDEDN_OPT_CODE3
     * 
     */
    @JsonProperty("optCode3")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_OPT_CODE3")
    private String optCode3;
    /**
     * Reference
     * <p>
     * Lineage reference object : PDRDEDN_REF_NO
     * 
     */
    @JsonProperty("refNo")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_REF_NO")
    private String refNo;
    /**
     *  6
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt6Title")
    private String ptrbdcaAmt6Title;
    /**
     * Value
     * <p>
     * Lineage reference object : PDRDEDN_OPT_CODE1
     * 
     */
    @JsonProperty("optCode1")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_OPT_CODE1")
    private String optCode1;
    /**
     * Lineage reference object : PDRDEDN_OPT_CODE4
     * 
     */
    @JsonProperty("optCode4")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_OPT_CODE4")
    private String optCode4;
    /**
     * Lineage reference object : PDRDEDN_OPT_CODE5
     * 
     */
    @JsonProperty("optCode5")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_OPT_CODE5")
    private String optCode5;
    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption5Title")
    private String ptrbdcaOption5Title;
    @JsonProperty("amount7")
    private Double amount7;
    @JsonProperty("amount6")
    private Double amount6;
    @JsonProperty("amount5")
    private Double amount5;
    @JsonProperty("amount4")
    private Double amount4;
    /**
     * Lineage reference object : PDRDEDN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("amount3")
    private Double amount3;
    @JsonProperty("entryValue8")
    private String entryValue8;
    @JsonProperty("amount2")
    private Double amount2;
    @JsonProperty("entryValue7")
    private String entryValue7;
    /**
     *  1
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt1Title")
    private String ptrbdcaAmt1Title;
    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt5Title")
    private String ptrbdcaAmt5Title;
    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("amount1")
    private Double amount1;
    /**
     * Deduction Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("dedEffectiveDateComment")
    private Date dedEffectiveDateComment;
    @JsonProperty("entryValue9")
    private String entryValue9;
    @JsonProperty("entryValue4")
    private String entryValue4;
    @JsonProperty("entryValue3")
    private String entryValue3;
    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue6")
    private String entryValue6;
    @JsonProperty("entryValue5")
    private String entryValue5;
    /**
     * Combined Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclEmplEmprLimit")
    private Double bdclEmplEmprLimit;
    @JsonProperty("entryValue2")
    private String entryValue2;
    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue1")
    private String entryValue1;
    @JsonProperty("filingStatusDesc")
    private String filingStatusDesc;
    /**
     * Lineage reference object : PDRDEDN_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_USER_ID")
    private String userId;
    @JsonProperty("entryValue10")
    private String entryValue10;
    @JsonProperty("entryValue11")
    private String entryValue11;
    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption4Title")
    private String ptrbdcaOption4Title;
    /**
     * Deductions Amount
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_DEDUCTIONS_AMT
     * 
     */
    @JsonProperty("lockinDeductionsAmt")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_LOCKIN_DEDUCTIONS_AMT")
    private Double lockinDeductionsAmt;
    /**
     * Deduction Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("dedEffectiveDateLockin")
    private Date dedEffectiveDateLockin;
    /**
     * Deduction Change Reason
     * <p>
     * Lineage reference object : PDRDEDN_BREA_CODE, Lookup lineage reference object : PTRBREA
     * 
     */
    @JsonProperty("breaCode")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_BREA_CODE, Lookup lineage reference object : PTRBREA")
    private String breaCode;
    /**
     * Other Income
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_OTHERINCOME_AMT
     * 
     */
    @JsonProperty("lockinOtherincomeAmt")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_LOCKIN_OTHERINCOME_AMT")
    private Double lockinOtherincomeAmt;
    /**
     * Update By
     * <p>
     * 
     * 
     */
    @JsonProperty("w4SignedUser")
    private String w4SignedUser;
    /**
     * Comment Date
     * <p>
     * Lineage reference object : PDRDEDN_COMMENT_DATE
     * 
     */
    @JsonProperty("commentDate")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_COMMENT_DATE")
    private Date commentDate;
    /**
     * W-4 Last Name Differs from Social Security Card
     * <p>
     * Lineage reference object : PDRDEDN_W4_NAME_CHANGE_IND
     * 
     */
    @JsonProperty("w4NameChangeInd")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_W4_NAME_CHANGE_IND")
    private String w4NameChangeInd;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclDesc")
    private String bdclDesc;
    /**
     * Allowances
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_WITHHOLD_ALLOW
     * 
     */
    @JsonProperty("lockinWithholdAllow")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_LOCKIN_WITHHOLD_ALLOW")
    private Double lockinWithholdAllow;
    /**
     * Comments
     * <p>
     * Lineage reference object : PDRDEDN_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_COMMENT")
    private String comment;
    /**
     * Applicable Gross Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclMaxGross")
    private Double bdclMaxGross;
    /**
     * Comment User ID
     * <p>
     * Lineage reference object : PDRDEDN_COMMENT_USER_ID
     * 
     */
    @JsonProperty("commentUserId")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_COMMENT_USER_ID")
    private String commentUserId;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : PDRDEDN_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Additional Withholding
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_ADDWITHHOLD_AMT
     * 
     */
    @JsonProperty("lockinAddwithholdAmt")
    @JsonPropertyDescription("Lineage reference object : PDRDEDN_LOCKIN_ADDWITHHOLD_AMT")
    private Double lockinAddwithholdAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt3Title")
    public String getPtrbdcaAmt3Title() {
        return ptrbdcaAmt3Title;
    }

    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt3Title")
    public void setPtrbdcaAmt3Title(String ptrbdcaAmt3Title) {
        this.ptrbdcaAmt3Title = ptrbdcaAmt3Title;
    }

    public Pdrdedn withPtrbdcaAmt3Title(String ptrbdcaAmt3Title) {
        this.ptrbdcaAmt3Title = ptrbdcaAmt3Title;
        return this;
    }

    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption2Title")
    public String getPtrbdcaOption2Title() {
        return ptrbdcaOption2Title;
    }

    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption2Title")
    public void setPtrbdcaOption2Title(String ptrbdcaOption2Title) {
        this.ptrbdcaOption2Title = ptrbdcaOption2Title;
    }

    public Pdrdedn withPtrbdcaOption2Title(String ptrbdcaOption2Title) {
        this.ptrbdcaOption2Title = ptrbdcaOption2Title;
        return this;
    }

    /**
     * Filing Status
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_FSTA_FIL_ST
     * 
     */
    @JsonProperty("lockinFstaFilSt")
    public String getLockinFstaFilSt() {
        return lockinFstaFilSt;
    }

    /**
     * Filing Status
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_FSTA_FIL_ST
     * 
     */
    @JsonProperty("lockinFstaFilSt")
    public void setLockinFstaFilSt(String lockinFstaFilSt) {
        this.lockinFstaFilSt = lockinFstaFilSt;
    }

    public Pdrdedn withLockinFstaFilSt(String lockinFstaFilSt) {
        this.lockinFstaFilSt = lockinFstaFilSt;
        return this;
    }

    /**
     * Signed Date
     * <p>
     * Lineage reference object : PDRDEDN_W4_SIGNED_DATE
     * 
     */
    @JsonProperty("w4SignedDate")
    public Date getW4SignedDate() {
        return w4SignedDate;
    }

    /**
     * Signed Date
     * <p>
     * Lineage reference object : PDRDEDN_W4_SIGNED_DATE
     * 
     */
    @JsonProperty("w4SignedDate")
    public void setW4SignedDate(Date w4SignedDate) {
        this.w4SignedDate = w4SignedDate;
    }

    public Pdrdedn withW4SignedDate(Date w4SignedDate) {
        this.w4SignedDate = w4SignedDate;
        return this;
    }

    /**
     * Letter Status
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_LETTER_STATUS
     * (Required)
     * 
     */
    @JsonProperty("lockinLetterStatus")
    public String getLockinLetterStatus() {
        return lockinLetterStatus;
    }

    /**
     * Letter Status
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_LETTER_STATUS
     * (Required)
     * 
     */
    @JsonProperty("lockinLetterStatus")
    public void setLockinLetterStatus(String lockinLetterStatus) {
        this.lockinLetterStatus = lockinLetterStatus;
    }

    public Pdrdedn withLockinLetterStatus(String lockinLetterStatus) {
        this.lockinLetterStatus = lockinLetterStatus;
        return this;
    }

    @JsonProperty("entryValue12")
    public String getEntryValue12() {
        return entryValue12;
    }

    @JsonProperty("entryValue12")
    public void setEntryValue12(String entryValue12) {
        this.entryValue12 = entryValue12;
    }

    public Pdrdedn withEntryValue12(String entryValue12) {
        this.entryValue12 = entryValue12;
        return this;
    }

    @JsonProperty("breaDesc")
    public String getBreaDesc() {
        return breaDesc;
    }

    @JsonProperty("breaDesc")
    public void setBreaDesc(String breaDesc) {
        this.breaDesc = breaDesc;
    }

    public Pdrdedn withBreaDesc(String breaDesc) {
        this.breaDesc = breaDesc;
        return this;
    }

    /**
     * Comments Exist
     * <p>
     * 
     * 
     */
    @JsonProperty("commentInd")
    public String getCommentInd() {
        return commentInd;
    }

    /**
     * Comments Exist
     * <p>
     * 
     * 
     */
    @JsonProperty("commentInd")
    public void setCommentInd(String commentInd) {
        this.commentInd = commentInd;
    }

    public Pdrdedn withCommentInd(String commentInd) {
        this.commentInd = commentInd;
        return this;
    }

    /**
     * Dependent Amount
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_DEPENDENT_AMT
     * 
     */
    @JsonProperty("lockinDependentAmt")
    public Double getLockinDependentAmt() {
        return lockinDependentAmt;
    }

    /**
     * Dependent Amount
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_DEPENDENT_AMT
     * 
     */
    @JsonProperty("lockinDependentAmt")
    public void setLockinDependentAmt(Double lockinDependentAmt) {
        this.lockinDependentAmt = lockinDependentAmt;
    }

    public Pdrdedn withLockinDependentAmt(Double lockinDependentAmt) {
        this.lockinDependentAmt = lockinDependentAmt;
        return this;
    }

    /**
     * Letter Date
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_LETTER_DATE
     * 
     */
    @JsonProperty("lockinLetterDate")
    public Date getLockinLetterDate() {
        return lockinLetterDate;
    }

    /**
     * Letter Date
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_LETTER_DATE
     * 
     */
    @JsonProperty("lockinLetterDate")
    public void setLockinLetterDate(Date lockinLetterDate) {
        this.lockinLetterDate = lockinLetterDate;
    }

    public Pdrdedn withLockinLetterDate(Date lockinLetterDate) {
        this.lockinLetterDate = lockinLetterDate;
        return this;
    }

    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PDRDEDN_BDCL_CODE
     * 
     */
    @JsonProperty("bdclCode")
    public String getBdclCode() {
        return bdclCode;
    }

    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PDRDEDN_BDCL_CODE
     * 
     */
    @JsonProperty("bdclCode")
    public void setBdclCode(String bdclCode) {
        this.bdclCode = bdclCode;
    }

    public Pdrdedn withBdclCode(String bdclCode) {
        this.bdclCode = bdclCode;
        return this;
    }

    /**
     * Limitation on Benefits
     * <p>
     * Lineage reference object : PDRDEDN_1042S_LIMIT_BEN_CDE
     * 
     */
    @JsonProperty("1042sLimitBenCde")
    public String get1042sLimitBenCde() {
        return _1042sLimitBenCde;
    }

    /**
     * Limitation on Benefits
     * <p>
     * Lineage reference object : PDRDEDN_1042S_LIMIT_BEN_CDE
     * 
     */
    @JsonProperty("1042sLimitBenCde")
    public void set1042sLimitBenCde(String _1042sLimitBenCde) {
        this._1042sLimitBenCde = _1042sLimitBenCde;
    }

    public Pdrdedn with1042sLimitBenCde(String _1042sLimitBenCde) {
        this._1042sLimitBenCde = _1042sLimitBenCde;
        return this;
    }

    /**
     * Employer Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclEmprLimit")
    public Double getBdclEmprLimit() {
        return bdclEmprLimit;
    }

    /**
     * Employer Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclEmprLimit")
    public void setBdclEmprLimit(Double bdclEmprLimit) {
        this.bdclEmprLimit = bdclEmprLimit;
    }

    public Pdrdedn withBdclEmprLimit(Double bdclEmprLimit) {
        this.bdclEmprLimit = bdclEmprLimit;
        return this;
    }

    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt2Title")
    public String getPtrbdcaAmt2Title() {
        return ptrbdcaAmt2Title;
    }

    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt2Title")
    public void setPtrbdcaAmt2Title(String ptrbdcaAmt2Title) {
        this.ptrbdcaAmt2Title = ptrbdcaAmt2Title;
    }

    public Pdrdedn withPtrbdcaAmt2Title(String ptrbdcaAmt2Title) {
        this.ptrbdcaAmt2Title = ptrbdcaAmt2Title;
        return this;
    }

    /**
     *  7
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt7Title")
    public String getPtrbdcaAmt7Title() {
        return ptrbdcaAmt7Title;
    }

    /**
     *  7
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt7Title")
    public void setPtrbdcaAmt7Title(String ptrbdcaAmt7Title) {
        this.ptrbdcaAmt7Title = ptrbdcaAmt7Title;
    }

    public Pdrdedn withPtrbdcaAmt7Title(String ptrbdcaAmt7Title) {
        this.ptrbdcaAmt7Title = ptrbdcaAmt7Title;
        return this;
    }

    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption3Title")
    public String getPtrbdcaOption3Title() {
        return ptrbdcaOption3Title;
    }

    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption3Title")
    public void setPtrbdcaOption3Title(String ptrbdcaOption3Title) {
        this.ptrbdcaOption3Title = ptrbdcaOption3Title;
    }

    public Pdrdedn withPtrbdcaOption3Title(String ptrbdcaOption3Title) {
        this.ptrbdcaOption3Title = ptrbdcaOption3Title;
        return this;
    }

    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt4Title")
    public String getPtrbdcaAmt4Title() {
        return ptrbdcaAmt4Title;
    }

    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt4Title")
    public void setPtrbdcaAmt4Title(String ptrbdcaAmt4Title) {
        this.ptrbdcaAmt4Title = ptrbdcaAmt4Title;
    }

    public Pdrdedn withPtrbdcaAmt4Title(String ptrbdcaAmt4Title) {
        this.ptrbdcaAmt4Title = ptrbdcaAmt4Title;
        return this;
    }

    /**
     * Step 2C Indicator
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_STEP2C_IND
     * 
     */
    @JsonProperty("lockinStep2cInd")
    public String getLockinStep2cInd() {
        return lockinStep2cInd;
    }

    /**
     * Step 2C Indicator
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_STEP2C_IND
     * 
     */
    @JsonProperty("lockinStep2cInd")
    public void setLockinStep2cInd(String lockinStep2cInd) {
        this.lockinStep2cInd = lockinStep2cInd;
    }

    public Pdrdedn withLockinStep2cInd(String lockinStep2cInd) {
        this.lockinStep2cInd = lockinStep2cInd;
        return this;
    }

    /**
     * Employee Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclEmplLimit")
    public Double getBdclEmplLimit() {
        return bdclEmplLimit;
    }

    /**
     * Employee Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclEmplLimit")
    public void setBdclEmplLimit(Double bdclEmplLimit) {
        this.bdclEmplLimit = bdclEmplLimit;
    }

    public Pdrdedn withBdclEmplLimit(Double bdclEmplLimit) {
        this.bdclEmplLimit = bdclEmplLimit;
        return this;
    }

    /**
     * Event Date
     * <p>
     * Lineage reference object : PDRDEDN_EVENT_DATE
     * 
     */
    @JsonProperty("eventDate")
    public Date getEventDate() {
        return eventDate;
    }

    /**
     * Event Date
     * <p>
     * Lineage reference object : PDRDEDN_EVENT_DATE
     * 
     */
    @JsonProperty("eventDate")
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Pdrdedn withEventDate(Date eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : PDRDEDN_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : PDRDEDN_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Pdrdedn withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Lineage reference object : PDRDEDN_OPT_CODE2
     * 
     */
    @JsonProperty("optCode2")
    public String getOptCode2() {
        return optCode2;
    }

    /**
     * Lineage reference object : PDRDEDN_OPT_CODE2
     * 
     */
    @JsonProperty("optCode2")
    public void setOptCode2(String optCode2) {
        this.optCode2 = optCode2;
    }

    public Pdrdedn withOptCode2(String optCode2) {
        this.optCode2 = optCode2;
        return this;
    }

    /**
     * Lineage reference object : PDRDEDN_OPT_CODE3
     * 
     */
    @JsonProperty("optCode3")
    public String getOptCode3() {
        return optCode3;
    }

    /**
     * Lineage reference object : PDRDEDN_OPT_CODE3
     * 
     */
    @JsonProperty("optCode3")
    public void setOptCode3(String optCode3) {
        this.optCode3 = optCode3;
    }

    public Pdrdedn withOptCode3(String optCode3) {
        this.optCode3 = optCode3;
        return this;
    }

    /**
     * Reference
     * <p>
     * Lineage reference object : PDRDEDN_REF_NO
     * 
     */
    @JsonProperty("refNo")
    public String getRefNo() {
        return refNo;
    }

    /**
     * Reference
     * <p>
     * Lineage reference object : PDRDEDN_REF_NO
     * 
     */
    @JsonProperty("refNo")
    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public Pdrdedn withRefNo(String refNo) {
        this.refNo = refNo;
        return this;
    }

    /**
     *  6
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt6Title")
    public String getPtrbdcaAmt6Title() {
        return ptrbdcaAmt6Title;
    }

    /**
     *  6
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt6Title")
    public void setPtrbdcaAmt6Title(String ptrbdcaAmt6Title) {
        this.ptrbdcaAmt6Title = ptrbdcaAmt6Title;
    }

    public Pdrdedn withPtrbdcaAmt6Title(String ptrbdcaAmt6Title) {
        this.ptrbdcaAmt6Title = ptrbdcaAmt6Title;
        return this;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : PDRDEDN_OPT_CODE1
     * 
     */
    @JsonProperty("optCode1")
    public String getOptCode1() {
        return optCode1;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : PDRDEDN_OPT_CODE1
     * 
     */
    @JsonProperty("optCode1")
    public void setOptCode1(String optCode1) {
        this.optCode1 = optCode1;
    }

    public Pdrdedn withOptCode1(String optCode1) {
        this.optCode1 = optCode1;
        return this;
    }

    /**
     * Lineage reference object : PDRDEDN_OPT_CODE4
     * 
     */
    @JsonProperty("optCode4")
    public String getOptCode4() {
        return optCode4;
    }

    /**
     * Lineage reference object : PDRDEDN_OPT_CODE4
     * 
     */
    @JsonProperty("optCode4")
    public void setOptCode4(String optCode4) {
        this.optCode4 = optCode4;
    }

    public Pdrdedn withOptCode4(String optCode4) {
        this.optCode4 = optCode4;
        return this;
    }

    /**
     * Lineage reference object : PDRDEDN_OPT_CODE5
     * 
     */
    @JsonProperty("optCode5")
    public String getOptCode5() {
        return optCode5;
    }

    /**
     * Lineage reference object : PDRDEDN_OPT_CODE5
     * 
     */
    @JsonProperty("optCode5")
    public void setOptCode5(String optCode5) {
        this.optCode5 = optCode5;
    }

    public Pdrdedn withOptCode5(String optCode5) {
        this.optCode5 = optCode5;
        return this;
    }

    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption5Title")
    public String getPtrbdcaOption5Title() {
        return ptrbdcaOption5Title;
    }

    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption5Title")
    public void setPtrbdcaOption5Title(String ptrbdcaOption5Title) {
        this.ptrbdcaOption5Title = ptrbdcaOption5Title;
    }

    public Pdrdedn withPtrbdcaOption5Title(String ptrbdcaOption5Title) {
        this.ptrbdcaOption5Title = ptrbdcaOption5Title;
        return this;
    }

    @JsonProperty("amount7")
    public Double getAmount7() {
        return amount7;
    }

    @JsonProperty("amount7")
    public void setAmount7(Double amount7) {
        this.amount7 = amount7;
    }

    public Pdrdedn withAmount7(Double amount7) {
        this.amount7 = amount7;
        return this;
    }

    @JsonProperty("amount6")
    public Double getAmount6() {
        return amount6;
    }

    @JsonProperty("amount6")
    public void setAmount6(Double amount6) {
        this.amount6 = amount6;
    }

    public Pdrdedn withAmount6(Double amount6) {
        this.amount6 = amount6;
        return this;
    }

    @JsonProperty("amount5")
    public Double getAmount5() {
        return amount5;
    }

    @JsonProperty("amount5")
    public void setAmount5(Double amount5) {
        this.amount5 = amount5;
    }

    public Pdrdedn withAmount5(Double amount5) {
        this.amount5 = amount5;
        return this;
    }

    @JsonProperty("amount4")
    public Double getAmount4() {
        return amount4;
    }

    @JsonProperty("amount4")
    public void setAmount4(Double amount4) {
        this.amount4 = amount4;
    }

    public Pdrdedn withAmount4(Double amount4) {
        this.amount4 = amount4;
        return this;
    }

    /**
     * Lineage reference object : PDRDEDN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PDRDEDN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Pdrdedn withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("amount3")
    public Double getAmount3() {
        return amount3;
    }

    @JsonProperty("amount3")
    public void setAmount3(Double amount3) {
        this.amount3 = amount3;
    }

    public Pdrdedn withAmount3(Double amount3) {
        this.amount3 = amount3;
        return this;
    }

    @JsonProperty("entryValue8")
    public String getEntryValue8() {
        return entryValue8;
    }

    @JsonProperty("entryValue8")
    public void setEntryValue8(String entryValue8) {
        this.entryValue8 = entryValue8;
    }

    public Pdrdedn withEntryValue8(String entryValue8) {
        this.entryValue8 = entryValue8;
        return this;
    }

    @JsonProperty("amount2")
    public Double getAmount2() {
        return amount2;
    }

    @JsonProperty("amount2")
    public void setAmount2(Double amount2) {
        this.amount2 = amount2;
    }

    public Pdrdedn withAmount2(Double amount2) {
        this.amount2 = amount2;
        return this;
    }

    @JsonProperty("entryValue7")
    public String getEntryValue7() {
        return entryValue7;
    }

    @JsonProperty("entryValue7")
    public void setEntryValue7(String entryValue7) {
        this.entryValue7 = entryValue7;
    }

    public Pdrdedn withEntryValue7(String entryValue7) {
        this.entryValue7 = entryValue7;
        return this;
    }

    /**
     *  1
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt1Title")
    public String getPtrbdcaAmt1Title() {
        return ptrbdcaAmt1Title;
    }

    /**
     *  1
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt1Title")
    public void setPtrbdcaAmt1Title(String ptrbdcaAmt1Title) {
        this.ptrbdcaAmt1Title = ptrbdcaAmt1Title;
    }

    public Pdrdedn withPtrbdcaAmt1Title(String ptrbdcaAmt1Title) {
        this.ptrbdcaAmt1Title = ptrbdcaAmt1Title;
        return this;
    }

    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt5Title")
    public String getPtrbdcaAmt5Title() {
        return ptrbdcaAmt5Title;
    }

    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt5Title")
    public void setPtrbdcaAmt5Title(String ptrbdcaAmt5Title) {
        this.ptrbdcaAmt5Title = ptrbdcaAmt5Title;
    }

    public Pdrdedn withPtrbdcaAmt5Title(String ptrbdcaAmt5Title) {
        this.ptrbdcaAmt5Title = ptrbdcaAmt5Title;
        return this;
    }

    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("amount1")
    public Double getAmount1() {
        return amount1;
    }

    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("amount1")
    public void setAmount1(Double amount1) {
        this.amount1 = amount1;
    }

    public Pdrdedn withAmount1(Double amount1) {
        this.amount1 = amount1;
        return this;
    }

    /**
     * Deduction Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("dedEffectiveDateComment")
    public Date getDedEffectiveDateComment() {
        return dedEffectiveDateComment;
    }

    /**
     * Deduction Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("dedEffectiveDateComment")
    public void setDedEffectiveDateComment(Date dedEffectiveDateComment) {
        this.dedEffectiveDateComment = dedEffectiveDateComment;
    }

    public Pdrdedn withDedEffectiveDateComment(Date dedEffectiveDateComment) {
        this.dedEffectiveDateComment = dedEffectiveDateComment;
        return this;
    }

    @JsonProperty("entryValue9")
    public String getEntryValue9() {
        return entryValue9;
    }

    @JsonProperty("entryValue9")
    public void setEntryValue9(String entryValue9) {
        this.entryValue9 = entryValue9;
    }

    public Pdrdedn withEntryValue9(String entryValue9) {
        this.entryValue9 = entryValue9;
        return this;
    }

    @JsonProperty("entryValue4")
    public String getEntryValue4() {
        return entryValue4;
    }

    @JsonProperty("entryValue4")
    public void setEntryValue4(String entryValue4) {
        this.entryValue4 = entryValue4;
    }

    public Pdrdedn withEntryValue4(String entryValue4) {
        this.entryValue4 = entryValue4;
        return this;
    }

    @JsonProperty("entryValue3")
    public String getEntryValue3() {
        return entryValue3;
    }

    @JsonProperty("entryValue3")
    public void setEntryValue3(String entryValue3) {
        this.entryValue3 = entryValue3;
    }

    public Pdrdedn withEntryValue3(String entryValue3) {
        this.entryValue3 = entryValue3;
        return this;
    }

    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue6")
    public String getEntryValue6() {
        return entryValue6;
    }

    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue6")
    public void setEntryValue6(String entryValue6) {
        this.entryValue6 = entryValue6;
    }

    public Pdrdedn withEntryValue6(String entryValue6) {
        this.entryValue6 = entryValue6;
        return this;
    }

    @JsonProperty("entryValue5")
    public String getEntryValue5() {
        return entryValue5;
    }

    @JsonProperty("entryValue5")
    public void setEntryValue5(String entryValue5) {
        this.entryValue5 = entryValue5;
    }

    public Pdrdedn withEntryValue5(String entryValue5) {
        this.entryValue5 = entryValue5;
        return this;
    }

    /**
     * Combined Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclEmplEmprLimit")
    public Double getBdclEmplEmprLimit() {
        return bdclEmplEmprLimit;
    }

    /**
     * Combined Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclEmplEmprLimit")
    public void setBdclEmplEmprLimit(Double bdclEmplEmprLimit) {
        this.bdclEmplEmprLimit = bdclEmplEmprLimit;
    }

    public Pdrdedn withBdclEmplEmprLimit(Double bdclEmplEmprLimit) {
        this.bdclEmplEmprLimit = bdclEmplEmprLimit;
        return this;
    }

    @JsonProperty("entryValue2")
    public String getEntryValue2() {
        return entryValue2;
    }

    @JsonProperty("entryValue2")
    public void setEntryValue2(String entryValue2) {
        this.entryValue2 = entryValue2;
    }

    public Pdrdedn withEntryValue2(String entryValue2) {
        this.entryValue2 = entryValue2;
        return this;
    }

    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue1")
    public String getEntryValue1() {
        return entryValue1;
    }

    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue1")
    public void setEntryValue1(String entryValue1) {
        this.entryValue1 = entryValue1;
    }

    public Pdrdedn withEntryValue1(String entryValue1) {
        this.entryValue1 = entryValue1;
        return this;
    }

    @JsonProperty("filingStatusDesc")
    public String getFilingStatusDesc() {
        return filingStatusDesc;
    }

    @JsonProperty("filingStatusDesc")
    public void setFilingStatusDesc(String filingStatusDesc) {
        this.filingStatusDesc = filingStatusDesc;
    }

    public Pdrdedn withFilingStatusDesc(String filingStatusDesc) {
        this.filingStatusDesc = filingStatusDesc;
        return this;
    }

    /**
     * Lineage reference object : PDRDEDN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PDRDEDN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Pdrdedn withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("entryValue10")
    public String getEntryValue10() {
        return entryValue10;
    }

    @JsonProperty("entryValue10")
    public void setEntryValue10(String entryValue10) {
        this.entryValue10 = entryValue10;
    }

    public Pdrdedn withEntryValue10(String entryValue10) {
        this.entryValue10 = entryValue10;
        return this;
    }

    @JsonProperty("entryValue11")
    public String getEntryValue11() {
        return entryValue11;
    }

    @JsonProperty("entryValue11")
    public void setEntryValue11(String entryValue11) {
        this.entryValue11 = entryValue11;
    }

    public Pdrdedn withEntryValue11(String entryValue11) {
        this.entryValue11 = entryValue11;
        return this;
    }

    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption4Title")
    public String getPtrbdcaOption4Title() {
        return ptrbdcaOption4Title;
    }

    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption4Title")
    public void setPtrbdcaOption4Title(String ptrbdcaOption4Title) {
        this.ptrbdcaOption4Title = ptrbdcaOption4Title;
    }

    public Pdrdedn withPtrbdcaOption4Title(String ptrbdcaOption4Title) {
        this.ptrbdcaOption4Title = ptrbdcaOption4Title;
        return this;
    }

    /**
     * Deductions Amount
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_DEDUCTIONS_AMT
     * 
     */
    @JsonProperty("lockinDeductionsAmt")
    public Double getLockinDeductionsAmt() {
        return lockinDeductionsAmt;
    }

    /**
     * Deductions Amount
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_DEDUCTIONS_AMT
     * 
     */
    @JsonProperty("lockinDeductionsAmt")
    public void setLockinDeductionsAmt(Double lockinDeductionsAmt) {
        this.lockinDeductionsAmt = lockinDeductionsAmt;
    }

    public Pdrdedn withLockinDeductionsAmt(Double lockinDeductionsAmt) {
        this.lockinDeductionsAmt = lockinDeductionsAmt;
        return this;
    }

    /**
     * Deduction Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("dedEffectiveDateLockin")
    public Date getDedEffectiveDateLockin() {
        return dedEffectiveDateLockin;
    }

    /**
     * Deduction Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("dedEffectiveDateLockin")
    public void setDedEffectiveDateLockin(Date dedEffectiveDateLockin) {
        this.dedEffectiveDateLockin = dedEffectiveDateLockin;
    }

    public Pdrdedn withDedEffectiveDateLockin(Date dedEffectiveDateLockin) {
        this.dedEffectiveDateLockin = dedEffectiveDateLockin;
        return this;
    }

    /**
     * Deduction Change Reason
     * <p>
     * Lineage reference object : PDRDEDN_BREA_CODE, Lookup lineage reference object : PTRBREA
     * 
     */
    @JsonProperty("breaCode")
    public String getBreaCode() {
        return breaCode;
    }

    /**
     * Deduction Change Reason
     * <p>
     * Lineage reference object : PDRDEDN_BREA_CODE, Lookup lineage reference object : PTRBREA
     * 
     */
    @JsonProperty("breaCode")
    public void setBreaCode(String breaCode) {
        this.breaCode = breaCode;
    }

    public Pdrdedn withBreaCode(String breaCode) {
        this.breaCode = breaCode;
        return this;
    }

    /**
     * Other Income
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_OTHERINCOME_AMT
     * 
     */
    @JsonProperty("lockinOtherincomeAmt")
    public Double getLockinOtherincomeAmt() {
        return lockinOtherincomeAmt;
    }

    /**
     * Other Income
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_OTHERINCOME_AMT
     * 
     */
    @JsonProperty("lockinOtherincomeAmt")
    public void setLockinOtherincomeAmt(Double lockinOtherincomeAmt) {
        this.lockinOtherincomeAmt = lockinOtherincomeAmt;
    }

    public Pdrdedn withLockinOtherincomeAmt(Double lockinOtherincomeAmt) {
        this.lockinOtherincomeAmt = lockinOtherincomeAmt;
        return this;
    }

    /**
     * Update By
     * <p>
     * 
     * 
     */
    @JsonProperty("w4SignedUser")
    public String getW4SignedUser() {
        return w4SignedUser;
    }

    /**
     * Update By
     * <p>
     * 
     * 
     */
    @JsonProperty("w4SignedUser")
    public void setW4SignedUser(String w4SignedUser) {
        this.w4SignedUser = w4SignedUser;
    }

    public Pdrdedn withW4SignedUser(String w4SignedUser) {
        this.w4SignedUser = w4SignedUser;
        return this;
    }

    /**
     * Comment Date
     * <p>
     * Lineage reference object : PDRDEDN_COMMENT_DATE
     * 
     */
    @JsonProperty("commentDate")
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * Comment Date
     * <p>
     * Lineage reference object : PDRDEDN_COMMENT_DATE
     * 
     */
    @JsonProperty("commentDate")
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Pdrdedn withCommentDate(Date commentDate) {
        this.commentDate = commentDate;
        return this;
    }

    /**
     * W-4 Last Name Differs from Social Security Card
     * <p>
     * Lineage reference object : PDRDEDN_W4_NAME_CHANGE_IND
     * 
     */
    @JsonProperty("w4NameChangeInd")
    public String getW4NameChangeInd() {
        return w4NameChangeInd;
    }

    /**
     * W-4 Last Name Differs from Social Security Card
     * <p>
     * Lineage reference object : PDRDEDN_W4_NAME_CHANGE_IND
     * 
     */
    @JsonProperty("w4NameChangeInd")
    public void setW4NameChangeInd(String w4NameChangeInd) {
        this.w4NameChangeInd = w4NameChangeInd;
    }

    public Pdrdedn withW4NameChangeInd(String w4NameChangeInd) {
        this.w4NameChangeInd = w4NameChangeInd;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclDesc")
    public String getBdclDesc() {
        return bdclDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclDesc")
    public void setBdclDesc(String bdclDesc) {
        this.bdclDesc = bdclDesc;
    }

    public Pdrdedn withBdclDesc(String bdclDesc) {
        this.bdclDesc = bdclDesc;
        return this;
    }

    /**
     * Allowances
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_WITHHOLD_ALLOW
     * 
     */
    @JsonProperty("lockinWithholdAllow")
    public Double getLockinWithholdAllow() {
        return lockinWithholdAllow;
    }

    /**
     * Allowances
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_WITHHOLD_ALLOW
     * 
     */
    @JsonProperty("lockinWithholdAllow")
    public void setLockinWithholdAllow(Double lockinWithholdAllow) {
        this.lockinWithholdAllow = lockinWithholdAllow;
    }

    public Pdrdedn withLockinWithholdAllow(Double lockinWithholdAllow) {
        this.lockinWithholdAllow = lockinWithholdAllow;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : PDRDEDN_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : PDRDEDN_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Pdrdedn withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Applicable Gross Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclMaxGross")
    public Double getBdclMaxGross() {
        return bdclMaxGross;
    }

    /**
     * Applicable Gross Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("bdclMaxGross")
    public void setBdclMaxGross(Double bdclMaxGross) {
        this.bdclMaxGross = bdclMaxGross;
    }

    public Pdrdedn withBdclMaxGross(Double bdclMaxGross) {
        this.bdclMaxGross = bdclMaxGross;
        return this;
    }

    /**
     * Comment User ID
     * <p>
     * Lineage reference object : PDRDEDN_COMMENT_USER_ID
     * 
     */
    @JsonProperty("commentUserId")
    public String getCommentUserId() {
        return commentUserId;
    }

    /**
     * Comment User ID
     * <p>
     * Lineage reference object : PDRDEDN_COMMENT_USER_ID
     * 
     */
    @JsonProperty("commentUserId")
    public void setCommentUserId(String commentUserId) {
        this.commentUserId = commentUserId;
    }

    public Pdrdedn withCommentUserId(String commentUserId) {
        this.commentUserId = commentUserId;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : PDRDEDN_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : PDRDEDN_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Pdrdedn withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Additional Withholding
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_ADDWITHHOLD_AMT
     * 
     */
    @JsonProperty("lockinAddwithholdAmt")
    public Double getLockinAddwithholdAmt() {
        return lockinAddwithholdAmt;
    }

    /**
     * Additional Withholding
     * <p>
     * Lineage reference object : PDRDEDN_LOCKIN_ADDWITHHOLD_AMT
     * 
     */
    @JsonProperty("lockinAddwithholdAmt")
    public void setLockinAddwithholdAmt(Double lockinAddwithholdAmt) {
        this.lockinAddwithholdAmt = lockinAddwithholdAmt;
    }

    public Pdrdedn withLockinAddwithholdAmt(Double lockinAddwithholdAmt) {
        this.lockinAddwithholdAmt = lockinAddwithholdAmt;
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

    public Pdrdedn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pdrdedn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ptrbdcaAmt3Title");
        sb.append('=');
        sb.append(((this.ptrbdcaAmt3Title == null)?"<null>":this.ptrbdcaAmt3Title));
        sb.append(',');
        sb.append("ptrbdcaOption2Title");
        sb.append('=');
        sb.append(((this.ptrbdcaOption2Title == null)?"<null>":this.ptrbdcaOption2Title));
        sb.append(',');
        sb.append("lockinFstaFilSt");
        sb.append('=');
        sb.append(((this.lockinFstaFilSt == null)?"<null>":this.lockinFstaFilSt));
        sb.append(',');
        sb.append("w4SignedDate");
        sb.append('=');
        sb.append(((this.w4SignedDate == null)?"<null>":this.w4SignedDate));
        sb.append(',');
        sb.append("lockinLetterStatus");
        sb.append('=');
        sb.append(((this.lockinLetterStatus == null)?"<null>":this.lockinLetterStatus));
        sb.append(',');
        sb.append("entryValue12");
        sb.append('=');
        sb.append(((this.entryValue12 == null)?"<null>":this.entryValue12));
        sb.append(',');
        sb.append("breaDesc");
        sb.append('=');
        sb.append(((this.breaDesc == null)?"<null>":this.breaDesc));
        sb.append(',');
        sb.append("commentInd");
        sb.append('=');
        sb.append(((this.commentInd == null)?"<null>":this.commentInd));
        sb.append(',');
        sb.append("lockinDependentAmt");
        sb.append('=');
        sb.append(((this.lockinDependentAmt == null)?"<null>":this.lockinDependentAmt));
        sb.append(',');
        sb.append("lockinLetterDate");
        sb.append('=');
        sb.append(((this.lockinLetterDate == null)?"<null>":this.lockinLetterDate));
        sb.append(',');
        sb.append("bdclCode");
        sb.append('=');
        sb.append(((this.bdclCode == null)?"<null>":this.bdclCode));
        sb.append(',');
        sb.append("_1042sLimitBenCde");
        sb.append('=');
        sb.append(((this._1042sLimitBenCde == null)?"<null>":this._1042sLimitBenCde));
        sb.append(',');
        sb.append("bdclEmprLimit");
        sb.append('=');
        sb.append(((this.bdclEmprLimit == null)?"<null>":this.bdclEmprLimit));
        sb.append(',');
        sb.append("ptrbdcaAmt2Title");
        sb.append('=');
        sb.append(((this.ptrbdcaAmt2Title == null)?"<null>":this.ptrbdcaAmt2Title));
        sb.append(',');
        sb.append("ptrbdcaAmt7Title");
        sb.append('=');
        sb.append(((this.ptrbdcaAmt7Title == null)?"<null>":this.ptrbdcaAmt7Title));
        sb.append(',');
        sb.append("ptrbdcaOption3Title");
        sb.append('=');
        sb.append(((this.ptrbdcaOption3Title == null)?"<null>":this.ptrbdcaOption3Title));
        sb.append(',');
        sb.append("ptrbdcaAmt4Title");
        sb.append('=');
        sb.append(((this.ptrbdcaAmt4Title == null)?"<null>":this.ptrbdcaAmt4Title));
        sb.append(',');
        sb.append("lockinStep2cInd");
        sb.append('=');
        sb.append(((this.lockinStep2cInd == null)?"<null>":this.lockinStep2cInd));
        sb.append(',');
        sb.append("bdclEmplLimit");
        sb.append('=');
        sb.append(((this.bdclEmplLimit == null)?"<null>":this.bdclEmplLimit));
        sb.append(',');
        sb.append("eventDate");
        sb.append('=');
        sb.append(((this.eventDate == null)?"<null>":this.eventDate));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("optCode2");
        sb.append('=');
        sb.append(((this.optCode2 == null)?"<null>":this.optCode2));
        sb.append(',');
        sb.append("optCode3");
        sb.append('=');
        sb.append(((this.optCode3 == null)?"<null>":this.optCode3));
        sb.append(',');
        sb.append("refNo");
        sb.append('=');
        sb.append(((this.refNo == null)?"<null>":this.refNo));
        sb.append(',');
        sb.append("ptrbdcaAmt6Title");
        sb.append('=');
        sb.append(((this.ptrbdcaAmt6Title == null)?"<null>":this.ptrbdcaAmt6Title));
        sb.append(',');
        sb.append("optCode1");
        sb.append('=');
        sb.append(((this.optCode1 == null)?"<null>":this.optCode1));
        sb.append(',');
        sb.append("optCode4");
        sb.append('=');
        sb.append(((this.optCode4 == null)?"<null>":this.optCode4));
        sb.append(',');
        sb.append("optCode5");
        sb.append('=');
        sb.append(((this.optCode5 == null)?"<null>":this.optCode5));
        sb.append(',');
        sb.append("ptrbdcaOption5Title");
        sb.append('=');
        sb.append(((this.ptrbdcaOption5Title == null)?"<null>":this.ptrbdcaOption5Title));
        sb.append(',');
        sb.append("amount7");
        sb.append('=');
        sb.append(((this.amount7 == null)?"<null>":this.amount7));
        sb.append(',');
        sb.append("amount6");
        sb.append('=');
        sb.append(((this.amount6 == null)?"<null>":this.amount6));
        sb.append(',');
        sb.append("amount5");
        sb.append('=');
        sb.append(((this.amount5 == null)?"<null>":this.amount5));
        sb.append(',');
        sb.append("amount4");
        sb.append('=');
        sb.append(((this.amount4 == null)?"<null>":this.amount4));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("amount3");
        sb.append('=');
        sb.append(((this.amount3 == null)?"<null>":this.amount3));
        sb.append(',');
        sb.append("entryValue8");
        sb.append('=');
        sb.append(((this.entryValue8 == null)?"<null>":this.entryValue8));
        sb.append(',');
        sb.append("amount2");
        sb.append('=');
        sb.append(((this.amount2 == null)?"<null>":this.amount2));
        sb.append(',');
        sb.append("entryValue7");
        sb.append('=');
        sb.append(((this.entryValue7 == null)?"<null>":this.entryValue7));
        sb.append(',');
        sb.append("ptrbdcaAmt1Title");
        sb.append('=');
        sb.append(((this.ptrbdcaAmt1Title == null)?"<null>":this.ptrbdcaAmt1Title));
        sb.append(',');
        sb.append("ptrbdcaAmt5Title");
        sb.append('=');
        sb.append(((this.ptrbdcaAmt5Title == null)?"<null>":this.ptrbdcaAmt5Title));
        sb.append(',');
        sb.append("amount1");
        sb.append('=');
        sb.append(((this.amount1 == null)?"<null>":this.amount1));
        sb.append(',');
        sb.append("dedEffectiveDateComment");
        sb.append('=');
        sb.append(((this.dedEffectiveDateComment == null)?"<null>":this.dedEffectiveDateComment));
        sb.append(',');
        sb.append("entryValue9");
        sb.append('=');
        sb.append(((this.entryValue9 == null)?"<null>":this.entryValue9));
        sb.append(',');
        sb.append("entryValue4");
        sb.append('=');
        sb.append(((this.entryValue4 == null)?"<null>":this.entryValue4));
        sb.append(',');
        sb.append("entryValue3");
        sb.append('=');
        sb.append(((this.entryValue3 == null)?"<null>":this.entryValue3));
        sb.append(',');
        sb.append("entryValue6");
        sb.append('=');
        sb.append(((this.entryValue6 == null)?"<null>":this.entryValue6));
        sb.append(',');
        sb.append("entryValue5");
        sb.append('=');
        sb.append(((this.entryValue5 == null)?"<null>":this.entryValue5));
        sb.append(',');
        sb.append("bdclEmplEmprLimit");
        sb.append('=');
        sb.append(((this.bdclEmplEmprLimit == null)?"<null>":this.bdclEmplEmprLimit));
        sb.append(',');
        sb.append("entryValue2");
        sb.append('=');
        sb.append(((this.entryValue2 == null)?"<null>":this.entryValue2));
        sb.append(',');
        sb.append("entryValue1");
        sb.append('=');
        sb.append(((this.entryValue1 == null)?"<null>":this.entryValue1));
        sb.append(',');
        sb.append("filingStatusDesc");
        sb.append('=');
        sb.append(((this.filingStatusDesc == null)?"<null>":this.filingStatusDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("entryValue10");
        sb.append('=');
        sb.append(((this.entryValue10 == null)?"<null>":this.entryValue10));
        sb.append(',');
        sb.append("entryValue11");
        sb.append('=');
        sb.append(((this.entryValue11 == null)?"<null>":this.entryValue11));
        sb.append(',');
        sb.append("ptrbdcaOption4Title");
        sb.append('=');
        sb.append(((this.ptrbdcaOption4Title == null)?"<null>":this.ptrbdcaOption4Title));
        sb.append(',');
        sb.append("lockinDeductionsAmt");
        sb.append('=');
        sb.append(((this.lockinDeductionsAmt == null)?"<null>":this.lockinDeductionsAmt));
        sb.append(',');
        sb.append("dedEffectiveDateLockin");
        sb.append('=');
        sb.append(((this.dedEffectiveDateLockin == null)?"<null>":this.dedEffectiveDateLockin));
        sb.append(',');
        sb.append("breaCode");
        sb.append('=');
        sb.append(((this.breaCode == null)?"<null>":this.breaCode));
        sb.append(',');
        sb.append("lockinOtherincomeAmt");
        sb.append('=');
        sb.append(((this.lockinOtherincomeAmt == null)?"<null>":this.lockinOtherincomeAmt));
        sb.append(',');
        sb.append("w4SignedUser");
        sb.append('=');
        sb.append(((this.w4SignedUser == null)?"<null>":this.w4SignedUser));
        sb.append(',');
        sb.append("commentDate");
        sb.append('=');
        sb.append(((this.commentDate == null)?"<null>":this.commentDate));
        sb.append(',');
        sb.append("w4NameChangeInd");
        sb.append('=');
        sb.append(((this.w4NameChangeInd == null)?"<null>":this.w4NameChangeInd));
        sb.append(',');
        sb.append("bdclDesc");
        sb.append('=');
        sb.append(((this.bdclDesc == null)?"<null>":this.bdclDesc));
        sb.append(',');
        sb.append("lockinWithholdAllow");
        sb.append('=');
        sb.append(((this.lockinWithholdAllow == null)?"<null>":this.lockinWithholdAllow));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("bdclMaxGross");
        sb.append('=');
        sb.append(((this.bdclMaxGross == null)?"<null>":this.bdclMaxGross));
        sb.append(',');
        sb.append("commentUserId");
        sb.append('=');
        sb.append(((this.commentUserId == null)?"<null>":this.commentUserId));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("lockinAddwithholdAmt");
        sb.append('=');
        sb.append(((this.lockinAddwithholdAmt == null)?"<null>":this.lockinAddwithholdAmt));
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
        result = ((result* 31)+((this.ptrbdcaAmt3Title == null)? 0 :this.ptrbdcaAmt3Title.hashCode()));
        result = ((result* 31)+((this.ptrbdcaOption2Title == null)? 0 :this.ptrbdcaOption2Title.hashCode()));
        result = ((result* 31)+((this.lockinFstaFilSt == null)? 0 :this.lockinFstaFilSt.hashCode()));
        result = ((result* 31)+((this.w4SignedDate == null)? 0 :this.w4SignedDate.hashCode()));
        result = ((result* 31)+((this.lockinLetterStatus == null)? 0 :this.lockinLetterStatus.hashCode()));
        result = ((result* 31)+((this.entryValue12 == null)? 0 :this.entryValue12 .hashCode()));
        result = ((result* 31)+((this.breaDesc == null)? 0 :this.breaDesc.hashCode()));
        result = ((result* 31)+((this.commentInd == null)? 0 :this.commentInd.hashCode()));
        result = ((result* 31)+((this.lockinDependentAmt == null)? 0 :this.lockinDependentAmt.hashCode()));
        result = ((result* 31)+((this.lockinLetterDate == null)? 0 :this.lockinLetterDate.hashCode()));
        result = ((result* 31)+((this.bdclCode == null)? 0 :this.bdclCode.hashCode()));
        result = ((result* 31)+((this.bdclEmprLimit == null)? 0 :this.bdclEmprLimit.hashCode()));
        result = ((result* 31)+((this.ptrbdcaAmt2Title == null)? 0 :this.ptrbdcaAmt2Title.hashCode()));
        result = ((result* 31)+((this.ptrbdcaAmt7Title == null)? 0 :this.ptrbdcaAmt7Title.hashCode()));
        result = ((result* 31)+((this.ptrbdcaOption3Title == null)? 0 :this.ptrbdcaOption3Title.hashCode()));
        result = ((result* 31)+((this.ptrbdcaAmt4Title == null)? 0 :this.ptrbdcaAmt4Title.hashCode()));
        result = ((result* 31)+((this.lockinStep2cInd == null)? 0 :this.lockinStep2cInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bdclEmplLimit == null)? 0 :this.bdclEmplLimit.hashCode()));
        result = ((result* 31)+((this._1042sLimitBenCde == null)? 0 :this._1042sLimitBenCde.hashCode()));
        result = ((result* 31)+((this.eventDate == null)? 0 :this.eventDate.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.optCode2 == null)? 0 :this.optCode2 .hashCode()));
        result = ((result* 31)+((this.optCode3 == null)? 0 :this.optCode3 .hashCode()));
        result = ((result* 31)+((this.refNo == null)? 0 :this.refNo.hashCode()));
        result = ((result* 31)+((this.ptrbdcaAmt6Title == null)? 0 :this.ptrbdcaAmt6Title.hashCode()));
        result = ((result* 31)+((this.optCode1 == null)? 0 :this.optCode1 .hashCode()));
        result = ((result* 31)+((this.optCode4 == null)? 0 :this.optCode4 .hashCode()));
        result = ((result* 31)+((this.optCode5 == null)? 0 :this.optCode5 .hashCode()));
        result = ((result* 31)+((this.ptrbdcaOption5Title == null)? 0 :this.ptrbdcaOption5Title.hashCode()));
        result = ((result* 31)+((this.amount7 == null)? 0 :this.amount7 .hashCode()));
        result = ((result* 31)+((this.amount6 == null)? 0 :this.amount6 .hashCode()));
        result = ((result* 31)+((this.amount5 == null)? 0 :this.amount5 .hashCode()));
        result = ((result* 31)+((this.amount4 == null)? 0 :this.amount4 .hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.amount3 == null)? 0 :this.amount3 .hashCode()));
        result = ((result* 31)+((this.entryValue8 == null)? 0 :this.entryValue8 .hashCode()));
        result = ((result* 31)+((this.amount2 == null)? 0 :this.amount2 .hashCode()));
        result = ((result* 31)+((this.entryValue7 == null)? 0 :this.entryValue7 .hashCode()));
        result = ((result* 31)+((this.ptrbdcaAmt1Title == null)? 0 :this.ptrbdcaAmt1Title.hashCode()));
        result = ((result* 31)+((this.ptrbdcaAmt5Title == null)? 0 :this.ptrbdcaAmt5Title.hashCode()));
        result = ((result* 31)+((this.amount1 == null)? 0 :this.amount1 .hashCode()));
        result = ((result* 31)+((this.dedEffectiveDateComment == null)? 0 :this.dedEffectiveDateComment.hashCode()));
        result = ((result* 31)+((this.entryValue9 == null)? 0 :this.entryValue9 .hashCode()));
        result = ((result* 31)+((this.entryValue4 == null)? 0 :this.entryValue4 .hashCode()));
        result = ((result* 31)+((this.entryValue3 == null)? 0 :this.entryValue3 .hashCode()));
        result = ((result* 31)+((this.entryValue6 == null)? 0 :this.entryValue6 .hashCode()));
        result = ((result* 31)+((this.entryValue5 == null)? 0 :this.entryValue5 .hashCode()));
        result = ((result* 31)+((this.bdclEmplEmprLimit == null)? 0 :this.bdclEmplEmprLimit.hashCode()));
        result = ((result* 31)+((this.entryValue2 == null)? 0 :this.entryValue2 .hashCode()));
        result = ((result* 31)+((this.entryValue1 == null)? 0 :this.entryValue1 .hashCode()));
        result = ((result* 31)+((this.filingStatusDesc == null)? 0 :this.filingStatusDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.entryValue10 == null)? 0 :this.entryValue10 .hashCode()));
        result = ((result* 31)+((this.entryValue11 == null)? 0 :this.entryValue11 .hashCode()));
        result = ((result* 31)+((this.ptrbdcaOption4Title == null)? 0 :this.ptrbdcaOption4Title.hashCode()));
        result = ((result* 31)+((this.lockinDeductionsAmt == null)? 0 :this.lockinDeductionsAmt.hashCode()));
        result = ((result* 31)+((this.dedEffectiveDateLockin == null)? 0 :this.dedEffectiveDateLockin.hashCode()));
        result = ((result* 31)+((this.breaCode == null)? 0 :this.breaCode.hashCode()));
        result = ((result* 31)+((this.lockinOtherincomeAmt == null)? 0 :this.lockinOtherincomeAmt.hashCode()));
        result = ((result* 31)+((this.w4SignedUser == null)? 0 :this.w4SignedUser.hashCode()));
        result = ((result* 31)+((this.commentDate == null)? 0 :this.commentDate.hashCode()));
        result = ((result* 31)+((this.w4NameChangeInd == null)? 0 :this.w4NameChangeInd.hashCode()));
        result = ((result* 31)+((this.bdclDesc == null)? 0 :this.bdclDesc.hashCode()));
        result = ((result* 31)+((this.lockinWithholdAllow == null)? 0 :this.lockinWithholdAllow.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.bdclMaxGross == null)? 0 :this.bdclMaxGross.hashCode()));
        result = ((result* 31)+((this.commentUserId == null)? 0 :this.commentUserId.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.lockinAddwithholdAmt == null)? 0 :this.lockinAddwithholdAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pdrdedn) == false) {
            return false;
        }
        Pdrdedn rhs = ((Pdrdedn) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.ptrbdcaAmt3Title == rhs.ptrbdcaAmt3Title)||((this.ptrbdcaAmt3Title!= null)&&this.ptrbdcaAmt3Title.equals(rhs.ptrbdcaAmt3Title)))&&((this.ptrbdcaOption2Title == rhs.ptrbdcaOption2Title)||((this.ptrbdcaOption2Title!= null)&&this.ptrbdcaOption2Title.equals(rhs.ptrbdcaOption2Title))))&&((this.lockinFstaFilSt == rhs.lockinFstaFilSt)||((this.lockinFstaFilSt!= null)&&this.lockinFstaFilSt.equals(rhs.lockinFstaFilSt))))&&((this.w4SignedDate == rhs.w4SignedDate)||((this.w4SignedDate!= null)&&this.w4SignedDate.equals(rhs.w4SignedDate))))&&((this.lockinLetterStatus == rhs.lockinLetterStatus)||((this.lockinLetterStatus!= null)&&this.lockinLetterStatus.equals(rhs.lockinLetterStatus))))&&((this.entryValue12 == rhs.entryValue12)||((this.entryValue12 != null)&&this.entryValue12 .equals(rhs.entryValue12))))&&((this.breaDesc == rhs.breaDesc)||((this.breaDesc!= null)&&this.breaDesc.equals(rhs.breaDesc))))&&((this.commentInd == rhs.commentInd)||((this.commentInd!= null)&&this.commentInd.equals(rhs.commentInd))))&&((this.lockinDependentAmt == rhs.lockinDependentAmt)||((this.lockinDependentAmt!= null)&&this.lockinDependentAmt.equals(rhs.lockinDependentAmt))))&&((this.lockinLetterDate == rhs.lockinLetterDate)||((this.lockinLetterDate!= null)&&this.lockinLetterDate.equals(rhs.lockinLetterDate))))&&((this.bdclCode == rhs.bdclCode)||((this.bdclCode!= null)&&this.bdclCode.equals(rhs.bdclCode))))&&((this.bdclEmprLimit == rhs.bdclEmprLimit)||((this.bdclEmprLimit!= null)&&this.bdclEmprLimit.equals(rhs.bdclEmprLimit))))&&((this.ptrbdcaAmt2Title == rhs.ptrbdcaAmt2Title)||((this.ptrbdcaAmt2Title!= null)&&this.ptrbdcaAmt2Title.equals(rhs.ptrbdcaAmt2Title))))&&((this.ptrbdcaAmt7Title == rhs.ptrbdcaAmt7Title)||((this.ptrbdcaAmt7Title!= null)&&this.ptrbdcaAmt7Title.equals(rhs.ptrbdcaAmt7Title))))&&((this.ptrbdcaOption3Title == rhs.ptrbdcaOption3Title)||((this.ptrbdcaOption3Title!= null)&&this.ptrbdcaOption3Title.equals(rhs.ptrbdcaOption3Title))))&&((this.ptrbdcaAmt4Title == rhs.ptrbdcaAmt4Title)||((this.ptrbdcaAmt4Title!= null)&&this.ptrbdcaAmt4Title.equals(rhs.ptrbdcaAmt4Title))))&&((this.lockinStep2cInd == rhs.lockinStep2cInd)||((this.lockinStep2cInd!= null)&&this.lockinStep2cInd.equals(rhs.lockinStep2cInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bdclEmplLimit == rhs.bdclEmplLimit)||((this.bdclEmplLimit!= null)&&this.bdclEmplLimit.equals(rhs.bdclEmplLimit))))&&((this._1042sLimitBenCde == rhs._1042sLimitBenCde)||((this._1042sLimitBenCde!= null)&&this._1042sLimitBenCde.equals(rhs._1042sLimitBenCde))))&&((this.eventDate == rhs.eventDate)||((this.eventDate!= null)&&this.eventDate.equals(rhs.eventDate))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.optCode2 == rhs.optCode2)||((this.optCode2 != null)&&this.optCode2 .equals(rhs.optCode2))))&&((this.optCode3 == rhs.optCode3)||((this.optCode3 != null)&&this.optCode3 .equals(rhs.optCode3))))&&((this.refNo == rhs.refNo)||((this.refNo!= null)&&this.refNo.equals(rhs.refNo))))&&((this.ptrbdcaAmt6Title == rhs.ptrbdcaAmt6Title)||((this.ptrbdcaAmt6Title!= null)&&this.ptrbdcaAmt6Title.equals(rhs.ptrbdcaAmt6Title))))&&((this.optCode1 == rhs.optCode1)||((this.optCode1 != null)&&this.optCode1 .equals(rhs.optCode1))))&&((this.optCode4 == rhs.optCode4)||((this.optCode4 != null)&&this.optCode4 .equals(rhs.optCode4))))&&((this.optCode5 == rhs.optCode5)||((this.optCode5 != null)&&this.optCode5 .equals(rhs.optCode5))))&&((this.ptrbdcaOption5Title == rhs.ptrbdcaOption5Title)||((this.ptrbdcaOption5Title!= null)&&this.ptrbdcaOption5Title.equals(rhs.ptrbdcaOption5Title))))&&((this.amount7 == rhs.amount7)||((this.amount7 != null)&&this.amount7 .equals(rhs.amount7))))&&((this.amount6 == rhs.amount6)||((this.amount6 != null)&&this.amount6 .equals(rhs.amount6))))&&((this.amount5 == rhs.amount5)||((this.amount5 != null)&&this.amount5 .equals(rhs.amount5))))&&((this.amount4 == rhs.amount4)||((this.amount4 != null)&&this.amount4 .equals(rhs.amount4))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.amount3 == rhs.amount3)||((this.amount3 != null)&&this.amount3 .equals(rhs.amount3))))&&((this.entryValue8 == rhs.entryValue8)||((this.entryValue8 != null)&&this.entryValue8 .equals(rhs.entryValue8))))&&((this.amount2 == rhs.amount2)||((this.amount2 != null)&&this.amount2 .equals(rhs.amount2))))&&((this.entryValue7 == rhs.entryValue7)||((this.entryValue7 != null)&&this.entryValue7 .equals(rhs.entryValue7))))&&((this.ptrbdcaAmt1Title == rhs.ptrbdcaAmt1Title)||((this.ptrbdcaAmt1Title!= null)&&this.ptrbdcaAmt1Title.equals(rhs.ptrbdcaAmt1Title))))&&((this.ptrbdcaAmt5Title == rhs.ptrbdcaAmt5Title)||((this.ptrbdcaAmt5Title!= null)&&this.ptrbdcaAmt5Title.equals(rhs.ptrbdcaAmt5Title))))&&((this.amount1 == rhs.amount1)||((this.amount1 != null)&&this.amount1 .equals(rhs.amount1))))&&((this.dedEffectiveDateComment == rhs.dedEffectiveDateComment)||((this.dedEffectiveDateComment!= null)&&this.dedEffectiveDateComment.equals(rhs.dedEffectiveDateComment))))&&((this.entryValue9 == rhs.entryValue9)||((this.entryValue9 != null)&&this.entryValue9 .equals(rhs.entryValue9))))&&((this.entryValue4 == rhs.entryValue4)||((this.entryValue4 != null)&&this.entryValue4 .equals(rhs.entryValue4))))&&((this.entryValue3 == rhs.entryValue3)||((this.entryValue3 != null)&&this.entryValue3 .equals(rhs.entryValue3))))&&((this.entryValue6 == rhs.entryValue6)||((this.entryValue6 != null)&&this.entryValue6 .equals(rhs.entryValue6))))&&((this.entryValue5 == rhs.entryValue5)||((this.entryValue5 != null)&&this.entryValue5 .equals(rhs.entryValue5))))&&((this.bdclEmplEmprLimit == rhs.bdclEmplEmprLimit)||((this.bdclEmplEmprLimit!= null)&&this.bdclEmplEmprLimit.equals(rhs.bdclEmplEmprLimit))))&&((this.entryValue2 == rhs.entryValue2)||((this.entryValue2 != null)&&this.entryValue2 .equals(rhs.entryValue2))))&&((this.entryValue1 == rhs.entryValue1)||((this.entryValue1 != null)&&this.entryValue1 .equals(rhs.entryValue1))))&&((this.filingStatusDesc == rhs.filingStatusDesc)||((this.filingStatusDesc!= null)&&this.filingStatusDesc.equals(rhs.filingStatusDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.entryValue10 == rhs.entryValue10)||((this.entryValue10 != null)&&this.entryValue10 .equals(rhs.entryValue10))))&&((this.entryValue11 == rhs.entryValue11)||((this.entryValue11 != null)&&this.entryValue11 .equals(rhs.entryValue11))))&&((this.ptrbdcaOption4Title == rhs.ptrbdcaOption4Title)||((this.ptrbdcaOption4Title!= null)&&this.ptrbdcaOption4Title.equals(rhs.ptrbdcaOption4Title))))&&((this.lockinDeductionsAmt == rhs.lockinDeductionsAmt)||((this.lockinDeductionsAmt!= null)&&this.lockinDeductionsAmt.equals(rhs.lockinDeductionsAmt))))&&((this.dedEffectiveDateLockin == rhs.dedEffectiveDateLockin)||((this.dedEffectiveDateLockin!= null)&&this.dedEffectiveDateLockin.equals(rhs.dedEffectiveDateLockin))))&&((this.breaCode == rhs.breaCode)||((this.breaCode!= null)&&this.breaCode.equals(rhs.breaCode))))&&((this.lockinOtherincomeAmt == rhs.lockinOtherincomeAmt)||((this.lockinOtherincomeAmt!= null)&&this.lockinOtherincomeAmt.equals(rhs.lockinOtherincomeAmt))))&&((this.w4SignedUser == rhs.w4SignedUser)||((this.w4SignedUser!= null)&&this.w4SignedUser.equals(rhs.w4SignedUser))))&&((this.commentDate == rhs.commentDate)||((this.commentDate!= null)&&this.commentDate.equals(rhs.commentDate))))&&((this.w4NameChangeInd == rhs.w4NameChangeInd)||((this.w4NameChangeInd!= null)&&this.w4NameChangeInd.equals(rhs.w4NameChangeInd))))&&((this.bdclDesc == rhs.bdclDesc)||((this.bdclDesc!= null)&&this.bdclDesc.equals(rhs.bdclDesc))))&&((this.lockinWithholdAllow == rhs.lockinWithholdAllow)||((this.lockinWithholdAllow!= null)&&this.lockinWithholdAllow.equals(rhs.lockinWithholdAllow))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.bdclMaxGross == rhs.bdclMaxGross)||((this.bdclMaxGross!= null)&&this.bdclMaxGross.equals(rhs.bdclMaxGross))))&&((this.commentUserId == rhs.commentUserId)||((this.commentUserId!= null)&&this.commentUserId.equals(rhs.commentUserId))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.lockinAddwithholdAmt == rhs.lockinAddwithholdAmt)||((this.lockinAddwithholdAmt!= null)&&this.lockinAddwithholdAmt.equals(rhs.lockinAddwithholdAmt))));
    }

}
