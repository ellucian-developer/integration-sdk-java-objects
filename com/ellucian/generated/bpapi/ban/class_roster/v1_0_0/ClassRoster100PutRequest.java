
package com.ellucian.generated.bpapi.ban.class_roster.v1_0_0;

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
    "ssbsectCrnt",
    "ssbsectDegsAwrdInd",
    "ssbsectTermCodet",
    "criteria.regSeq",
    "criteria.rolled",
    "grdeCodeMid",
    "rollIndicator",
    "criteria.rstsDate",
    "grdeCode",
    "criteria.rstsCode",
    "grdeIncmpFinal",
    "criteria.grdeCodeMid",
    "gcmtCode",
    "criteria.creditHr",
    "criteria.incompleteExtDate",
    "criteria.grdeCode",
    "criteria.grdeIncmpFinal",
    "criteria.gcmtCode",
    "criteria.gmodCode"
})
@Generated("jsonschema2pojo")
public class ClassRoster100PutRequest {

    /**
     * CRN
     * <p>
     * Lineage reference object : ssbsectCrnt
     * 
     */
    @JsonProperty("ssbsectCrnt")
    @JsonPropertyDescription("Lineage reference object : ssbsectCrnt")
    private String ssbsectCrnt;
    /**
     * Degree Award Status
     * <p>
     * Lineage reference object : ssbsectDegsAwrdInd
     * 
     */
    @JsonProperty("ssbsectDegsAwrdInd")
    @JsonPropertyDescription("Lineage reference object : ssbsectDegsAwrdInd")
    private String ssbsectDegsAwrdInd;
    /**
     * Term
     * <p>
     * Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssbsectTermCodet")
    @JsonPropertyDescription("Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm")
    private String ssbsectTermCodet;
    /**
     * Sequence
     * <p>
     * Lineage reference object : SFRSTCR_REG_SEQ
     * 
     */
    @JsonProperty("criteria.regSeq")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_REG_SEQ")
    private Double criteriaRegSeq;
    @JsonProperty("criteria.rolled")
    private String criteriaRolled;
    /**
     * Midterm Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_MID
     * 
     */
    @JsonProperty("grdeCodeMid")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GRDE_CODE_MID")
    private String grdeCodeMid;
    /**
     * Roll
     * <p>
     * Lineage reference object : rollIndicator
     * 
     */
    @JsonProperty("rollIndicator")
    @JsonPropertyDescription("Lineage reference object : rollIndicator")
    private String rollIndicator;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("criteria.rstsDate")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_RSTS_DATE")
    private Date criteriaRstsDate;
    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GRDE_CODE")
    private String grdeCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("criteria.rstsCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts")
    private String criteriaRstsCode;
    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeIncmpFinal")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde")
    private String grdeIncmpFinal;
    /**
     * Midterm Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_MID
     * 
     */
    @JsonProperty("criteria.grdeCodeMid")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GRDE_CODE_MID")
    private String criteriaGrdeCodeMid;
    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt")
    private String gcmtCode;
    /**
     * Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("criteria.creditHr")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_CREDIT_HR")
    private Double criteriaCreditHr;
    /**
     * Extension Date
     * <p>
     * Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("criteria.incompleteExtDate")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE")
    private Date criteriaIncompleteExtDate;
    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("criteria.grdeCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GRDE_CODE")
    private String criteriaGrdeCode;
    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeIncmpFinal")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde")
    private String criteriaGrdeIncmpFinal;
    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("criteria.gcmtCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt")
    private String criteriaGcmtCode;
    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("criteria.gmodCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod")
    private String criteriaGmodCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * CRN
     * <p>
     * Lineage reference object : ssbsectCrnt
     * 
     */
    @JsonProperty("ssbsectCrnt")
    public String getSsbsectCrnt() {
        return ssbsectCrnt;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssbsectCrnt
     * 
     */
    @JsonProperty("ssbsectCrnt")
    public void setSsbsectCrnt(String ssbsectCrnt) {
        this.ssbsectCrnt = ssbsectCrnt;
    }

    public ClassRoster100PutRequest withSsbsectCrnt(String ssbsectCrnt) {
        this.ssbsectCrnt = ssbsectCrnt;
        return this;
    }

    /**
     * Degree Award Status
     * <p>
     * Lineage reference object : ssbsectDegsAwrdInd
     * 
     */
    @JsonProperty("ssbsectDegsAwrdInd")
    public String getSsbsectDegsAwrdInd() {
        return ssbsectDegsAwrdInd;
    }

    /**
     * Degree Award Status
     * <p>
     * Lineage reference object : ssbsectDegsAwrdInd
     * 
     */
    @JsonProperty("ssbsectDegsAwrdInd")
    public void setSsbsectDegsAwrdInd(String ssbsectDegsAwrdInd) {
        this.ssbsectDegsAwrdInd = ssbsectDegsAwrdInd;
    }

    public ClassRoster100PutRequest withSsbsectDegsAwrdInd(String ssbsectDegsAwrdInd) {
        this.ssbsectDegsAwrdInd = ssbsectDegsAwrdInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssbsectTermCodet")
    public String getSsbsectTermCodet() {
        return ssbsectTermCodet;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssbsectTermCodet")
    public void setSsbsectTermCodet(String ssbsectTermCodet) {
        this.ssbsectTermCodet = ssbsectTermCodet;
    }

    public ClassRoster100PutRequest withSsbsectTermCodet(String ssbsectTermCodet) {
        this.ssbsectTermCodet = ssbsectTermCodet;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SFRSTCR_REG_SEQ
     * 
     */
    @JsonProperty("criteria.regSeq")
    public Double getCriteriaRegSeq() {
        return criteriaRegSeq;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SFRSTCR_REG_SEQ
     * 
     */
    @JsonProperty("criteria.regSeq")
    public void setCriteriaRegSeq(Double criteriaRegSeq) {
        this.criteriaRegSeq = criteriaRegSeq;
    }

    public ClassRoster100PutRequest withCriteriaRegSeq(Double criteriaRegSeq) {
        this.criteriaRegSeq = criteriaRegSeq;
        return this;
    }

    @JsonProperty("criteria.rolled")
    public String getCriteriaRolled() {
        return criteriaRolled;
    }

    @JsonProperty("criteria.rolled")
    public void setCriteriaRolled(String criteriaRolled) {
        this.criteriaRolled = criteriaRolled;
    }

    public ClassRoster100PutRequest withCriteriaRolled(String criteriaRolled) {
        this.criteriaRolled = criteriaRolled;
        return this;
    }

    /**
     * Midterm Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_MID
     * 
     */
    @JsonProperty("grdeCodeMid")
    public String getGrdeCodeMid() {
        return grdeCodeMid;
    }

    /**
     * Midterm Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_MID
     * 
     */
    @JsonProperty("grdeCodeMid")
    public void setGrdeCodeMid(String grdeCodeMid) {
        this.grdeCodeMid = grdeCodeMid;
    }

    public ClassRoster100PutRequest withGrdeCodeMid(String grdeCodeMid) {
        this.grdeCodeMid = grdeCodeMid;
        return this;
    }

    /**
     * Roll
     * <p>
     * Lineage reference object : rollIndicator
     * 
     */
    @JsonProperty("rollIndicator")
    public String getRollIndicator() {
        return rollIndicator;
    }

    /**
     * Roll
     * <p>
     * Lineage reference object : rollIndicator
     * 
     */
    @JsonProperty("rollIndicator")
    public void setRollIndicator(String rollIndicator) {
        this.rollIndicator = rollIndicator;
    }

    public ClassRoster100PutRequest withRollIndicator(String rollIndicator) {
        this.rollIndicator = rollIndicator;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("criteria.rstsDate")
    public Date getCriteriaRstsDate() {
        return criteriaRstsDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("criteria.rstsDate")
    public void setCriteriaRstsDate(Date criteriaRstsDate) {
        this.criteriaRstsDate = criteriaRstsDate;
    }

    public ClassRoster100PutRequest withCriteriaRstsDate(Date criteriaRstsDate) {
        this.criteriaRstsDate = criteriaRstsDate;
        return this;
    }

    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    public String getGrdeCode() {
        return grdeCode;
    }

    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    public void setGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
    }

    public ClassRoster100PutRequest withGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("criteria.rstsCode")
    public String getCriteriaRstsCode() {
        return criteriaRstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("criteria.rstsCode")
    public void setCriteriaRstsCode(String criteriaRstsCode) {
        this.criteriaRstsCode = criteriaRstsCode;
    }

    public ClassRoster100PutRequest withCriteriaRstsCode(String criteriaRstsCode) {
        this.criteriaRstsCode = criteriaRstsCode;
        return this;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeIncmpFinal")
    public String getGrdeIncmpFinal() {
        return grdeIncmpFinal;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeIncmpFinal")
    public void setGrdeIncmpFinal(String grdeIncmpFinal) {
        this.grdeIncmpFinal = grdeIncmpFinal;
    }

    public ClassRoster100PutRequest withGrdeIncmpFinal(String grdeIncmpFinal) {
        this.grdeIncmpFinal = grdeIncmpFinal;
        return this;
    }

    /**
     * Midterm Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_MID
     * 
     */
    @JsonProperty("criteria.grdeCodeMid")
    public String getCriteriaGrdeCodeMid() {
        return criteriaGrdeCodeMid;
    }

    /**
     * Midterm Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_MID
     * 
     */
    @JsonProperty("criteria.grdeCodeMid")
    public void setCriteriaGrdeCodeMid(String criteriaGrdeCodeMid) {
        this.criteriaGrdeCodeMid = criteriaGrdeCodeMid;
    }

    public ClassRoster100PutRequest withCriteriaGrdeCodeMid(String criteriaGrdeCodeMid) {
        this.criteriaGrdeCodeMid = criteriaGrdeCodeMid;
        return this;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    public String getGcmtCode() {
        return gcmtCode;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    public void setGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
    }

    public ClassRoster100PutRequest withGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
        return this;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("criteria.creditHr")
    public Double getCriteriaCreditHr() {
        return criteriaCreditHr;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("criteria.creditHr")
    public void setCriteriaCreditHr(Double criteriaCreditHr) {
        this.criteriaCreditHr = criteriaCreditHr;
    }

    public ClassRoster100PutRequest withCriteriaCreditHr(Double criteriaCreditHr) {
        this.criteriaCreditHr = criteriaCreditHr;
        return this;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("criteria.incompleteExtDate")
    public Date getCriteriaIncompleteExtDate() {
        return criteriaIncompleteExtDate;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("criteria.incompleteExtDate")
    public void setCriteriaIncompleteExtDate(Date criteriaIncompleteExtDate) {
        this.criteriaIncompleteExtDate = criteriaIncompleteExtDate;
    }

    public ClassRoster100PutRequest withCriteriaIncompleteExtDate(Date criteriaIncompleteExtDate) {
        this.criteriaIncompleteExtDate = criteriaIncompleteExtDate;
        return this;
    }

    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("criteria.grdeCode")
    public String getCriteriaGrdeCode() {
        return criteriaGrdeCode;
    }

    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("criteria.grdeCode")
    public void setCriteriaGrdeCode(String criteriaGrdeCode) {
        this.criteriaGrdeCode = criteriaGrdeCode;
    }

    public ClassRoster100PutRequest withCriteriaGrdeCode(String criteriaGrdeCode) {
        this.criteriaGrdeCode = criteriaGrdeCode;
        return this;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeIncmpFinal")
    public String getCriteriaGrdeIncmpFinal() {
        return criteriaGrdeIncmpFinal;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeIncmpFinal")
    public void setCriteriaGrdeIncmpFinal(String criteriaGrdeIncmpFinal) {
        this.criteriaGrdeIncmpFinal = criteriaGrdeIncmpFinal;
    }

    public ClassRoster100PutRequest withCriteriaGrdeIncmpFinal(String criteriaGrdeIncmpFinal) {
        this.criteriaGrdeIncmpFinal = criteriaGrdeIncmpFinal;
        return this;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("criteria.gcmtCode")
    public String getCriteriaGcmtCode() {
        return criteriaGcmtCode;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("criteria.gcmtCode")
    public void setCriteriaGcmtCode(String criteriaGcmtCode) {
        this.criteriaGcmtCode = criteriaGcmtCode;
    }

    public ClassRoster100PutRequest withCriteriaGcmtCode(String criteriaGcmtCode) {
        this.criteriaGcmtCode = criteriaGcmtCode;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("criteria.gmodCode")
    public String getCriteriaGmodCode() {
        return criteriaGmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("criteria.gmodCode")
    public void setCriteriaGmodCode(String criteriaGmodCode) {
        this.criteriaGmodCode = criteriaGmodCode;
    }

    public ClassRoster100PutRequest withCriteriaGmodCode(String criteriaGmodCode) {
        this.criteriaGmodCode = criteriaGmodCode;
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

    public ClassRoster100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClassRoster100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssbsectCrnt");
        sb.append('=');
        sb.append(((this.ssbsectCrnt == null)?"<null>":this.ssbsectCrnt));
        sb.append(',');
        sb.append("ssbsectDegsAwrdInd");
        sb.append('=');
        sb.append(((this.ssbsectDegsAwrdInd == null)?"<null>":this.ssbsectDegsAwrdInd));
        sb.append(',');
        sb.append("ssbsectTermCodet");
        sb.append('=');
        sb.append(((this.ssbsectTermCodet == null)?"<null>":this.ssbsectTermCodet));
        sb.append(',');
        sb.append("criteriaRegSeq");
        sb.append('=');
        sb.append(((this.criteriaRegSeq == null)?"<null>":this.criteriaRegSeq));
        sb.append(',');
        sb.append("criteriaRolled");
        sb.append('=');
        sb.append(((this.criteriaRolled == null)?"<null>":this.criteriaRolled));
        sb.append(',');
        sb.append("grdeCodeMid");
        sb.append('=');
        sb.append(((this.grdeCodeMid == null)?"<null>":this.grdeCodeMid));
        sb.append(',');
        sb.append("rollIndicator");
        sb.append('=');
        sb.append(((this.rollIndicator == null)?"<null>":this.rollIndicator));
        sb.append(',');
        sb.append("criteriaRstsDate");
        sb.append('=');
        sb.append(((this.criteriaRstsDate == null)?"<null>":this.criteriaRstsDate));
        sb.append(',');
        sb.append("grdeCode");
        sb.append('=');
        sb.append(((this.grdeCode == null)?"<null>":this.grdeCode));
        sb.append(',');
        sb.append("criteriaRstsCode");
        sb.append('=');
        sb.append(((this.criteriaRstsCode == null)?"<null>":this.criteriaRstsCode));
        sb.append(',');
        sb.append("grdeIncmpFinal");
        sb.append('=');
        sb.append(((this.grdeIncmpFinal == null)?"<null>":this.grdeIncmpFinal));
        sb.append(',');
        sb.append("criteriaGrdeCodeMid");
        sb.append('=');
        sb.append(((this.criteriaGrdeCodeMid == null)?"<null>":this.criteriaGrdeCodeMid));
        sb.append(',');
        sb.append("gcmtCode");
        sb.append('=');
        sb.append(((this.gcmtCode == null)?"<null>":this.gcmtCode));
        sb.append(',');
        sb.append("criteriaCreditHr");
        sb.append('=');
        sb.append(((this.criteriaCreditHr == null)?"<null>":this.criteriaCreditHr));
        sb.append(',');
        sb.append("criteriaIncompleteExtDate");
        sb.append('=');
        sb.append(((this.criteriaIncompleteExtDate == null)?"<null>":this.criteriaIncompleteExtDate));
        sb.append(',');
        sb.append("criteriaGrdeCode");
        sb.append('=');
        sb.append(((this.criteriaGrdeCode == null)?"<null>":this.criteriaGrdeCode));
        sb.append(',');
        sb.append("criteriaGrdeIncmpFinal");
        sb.append('=');
        sb.append(((this.criteriaGrdeIncmpFinal == null)?"<null>":this.criteriaGrdeIncmpFinal));
        sb.append(',');
        sb.append("criteriaGcmtCode");
        sb.append('=');
        sb.append(((this.criteriaGcmtCode == null)?"<null>":this.criteriaGcmtCode));
        sb.append(',');
        sb.append("criteriaGmodCode");
        sb.append('=');
        sb.append(((this.criteriaGmodCode == null)?"<null>":this.criteriaGmodCode));
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
        result = ((result* 31)+((this.criteriaGrdeCodeMid == null)? 0 :this.criteriaGrdeCodeMid.hashCode()));
        result = ((result* 31)+((this.criteriaGcmtCode == null)? 0 :this.criteriaGcmtCode.hashCode()));
        result = ((result* 31)+((this.ssbsectCrnt == null)? 0 :this.ssbsectCrnt.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeCode == null)? 0 :this.criteriaGrdeCode.hashCode()));
        result = ((result* 31)+((this.ssbsectDegsAwrdInd == null)? 0 :this.ssbsectDegsAwrdInd.hashCode()));
        result = ((result* 31)+((this.ssbsectTermCodet == null)? 0 :this.ssbsectTermCodet.hashCode()));
        result = ((result* 31)+((this.grdeCodeMid == null)? 0 :this.grdeCodeMid.hashCode()));
        result = ((result* 31)+((this.criteriaRstsDate == null)? 0 :this.criteriaRstsDate.hashCode()));
        result = ((result* 31)+((this.rollIndicator == null)? 0 :this.rollIndicator.hashCode()));
        result = ((result* 31)+((this.grdeCode == null)? 0 :this.grdeCode.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeIncmpFinal == null)? 0 :this.criteriaGrdeIncmpFinal.hashCode()));
        result = ((result* 31)+((this.criteriaRstsCode == null)? 0 :this.criteriaRstsCode.hashCode()));
        result = ((result* 31)+((this.grdeIncmpFinal == null)? 0 :this.grdeIncmpFinal.hashCode()));
        result = ((result* 31)+((this.criteriaGmodCode == null)? 0 :this.criteriaGmodCode.hashCode()));
        result = ((result* 31)+((this.criteriaCreditHr == null)? 0 :this.criteriaCreditHr.hashCode()));
        result = ((result* 31)+((this.gcmtCode == null)? 0 :this.gcmtCode.hashCode()));
        result = ((result* 31)+((this.criteriaRegSeq == null)? 0 :this.criteriaRegSeq.hashCode()));
        result = ((result* 31)+((this.criteriaRolled == null)? 0 :this.criteriaRolled.hashCode()));
        result = ((result* 31)+((this.criteriaIncompleteExtDate == null)? 0 :this.criteriaIncompleteExtDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassRoster100PutRequest) == false) {
            return false;
        }
        ClassRoster100PutRequest rhs = ((ClassRoster100PutRequest) other);
        return (((((((((((((((((((((this.criteriaGrdeCodeMid == rhs.criteriaGrdeCodeMid)||((this.criteriaGrdeCodeMid!= null)&&this.criteriaGrdeCodeMid.equals(rhs.criteriaGrdeCodeMid)))&&((this.criteriaGcmtCode == rhs.criteriaGcmtCode)||((this.criteriaGcmtCode!= null)&&this.criteriaGcmtCode.equals(rhs.criteriaGcmtCode))))&&((this.ssbsectCrnt == rhs.ssbsectCrnt)||((this.ssbsectCrnt!= null)&&this.ssbsectCrnt.equals(rhs.ssbsectCrnt))))&&((this.criteriaGrdeCode == rhs.criteriaGrdeCode)||((this.criteriaGrdeCode!= null)&&this.criteriaGrdeCode.equals(rhs.criteriaGrdeCode))))&&((this.ssbsectDegsAwrdInd == rhs.ssbsectDegsAwrdInd)||((this.ssbsectDegsAwrdInd!= null)&&this.ssbsectDegsAwrdInd.equals(rhs.ssbsectDegsAwrdInd))))&&((this.ssbsectTermCodet == rhs.ssbsectTermCodet)||((this.ssbsectTermCodet!= null)&&this.ssbsectTermCodet.equals(rhs.ssbsectTermCodet))))&&((this.grdeCodeMid == rhs.grdeCodeMid)||((this.grdeCodeMid!= null)&&this.grdeCodeMid.equals(rhs.grdeCodeMid))))&&((this.criteriaRstsDate == rhs.criteriaRstsDate)||((this.criteriaRstsDate!= null)&&this.criteriaRstsDate.equals(rhs.criteriaRstsDate))))&&((this.rollIndicator == rhs.rollIndicator)||((this.rollIndicator!= null)&&this.rollIndicator.equals(rhs.rollIndicator))))&&((this.grdeCode == rhs.grdeCode)||((this.grdeCode!= null)&&this.grdeCode.equals(rhs.grdeCode))))&&((this.criteriaGrdeIncmpFinal == rhs.criteriaGrdeIncmpFinal)||((this.criteriaGrdeIncmpFinal!= null)&&this.criteriaGrdeIncmpFinal.equals(rhs.criteriaGrdeIncmpFinal))))&&((this.criteriaRstsCode == rhs.criteriaRstsCode)||((this.criteriaRstsCode!= null)&&this.criteriaRstsCode.equals(rhs.criteriaRstsCode))))&&((this.grdeIncmpFinal == rhs.grdeIncmpFinal)||((this.grdeIncmpFinal!= null)&&this.grdeIncmpFinal.equals(rhs.grdeIncmpFinal))))&&((this.criteriaGmodCode == rhs.criteriaGmodCode)||((this.criteriaGmodCode!= null)&&this.criteriaGmodCode.equals(rhs.criteriaGmodCode))))&&((this.criteriaCreditHr == rhs.criteriaCreditHr)||((this.criteriaCreditHr!= null)&&this.criteriaCreditHr.equals(rhs.criteriaCreditHr))))&&((this.gcmtCode == rhs.gcmtCode)||((this.gcmtCode!= null)&&this.gcmtCode.equals(rhs.gcmtCode))))&&((this.criteriaRegSeq == rhs.criteriaRegSeq)||((this.criteriaRegSeq!= null)&&this.criteriaRegSeq.equals(rhs.criteriaRegSeq))))&&((this.criteriaRolled == rhs.criteriaRolled)||((this.criteriaRolled!= null)&&this.criteriaRolled.equals(rhs.criteriaRolled))))&&((this.criteriaIncompleteExtDate == rhs.criteriaIncompleteExtDate)||((this.criteriaIncompleteExtDate!= null)&&this.criteriaIncompleteExtDate.equals(rhs.criteriaIncompleteExtDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
