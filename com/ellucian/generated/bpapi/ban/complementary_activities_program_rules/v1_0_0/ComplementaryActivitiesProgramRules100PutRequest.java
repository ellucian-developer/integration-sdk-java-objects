
package com.ellucian.generated.bpapi.ban.complementary_activities_program_rules.v1_0_0;

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
    "termCodeStart",
    "reqCreditsProgram",
    "reqHoursActivity",
    "program",
    "creditEquivalent",
    "criteria.reqCreditsCategory",
    "reqHoursCategory",
    "reqCreditsCategory",
    "criteria.reqHoursCategory",
    "criteria.accgCode",
    "reqCreditsActivity",
    "reqHoursProgram",
    "termCode"
})
@Generated("jsonschema2pojo")
public class ComplementaryActivitiesProgramRules100PutRequest {

    /**
     * From Term
     * <p>
     * Lineage reference object : sobcarpTermCodeStart
     * (Required)
     * 
     */
    @JsonProperty("termCodeStart")
    @JsonPropertyDescription("Lineage reference object : sobcarpTermCodeStart")
    private String termCodeStart;
    /**
     * Required Credits
     * <p>
     * Lineage reference object : SOBCARP_REQ_CREDITS_PROGRAM
     * 
     */
    @JsonProperty("reqCreditsProgram")
    @JsonPropertyDescription("Lineage reference object : SOBCARP_REQ_CREDITS_PROGRAM")
    private Double reqCreditsProgram;
    /**
     * Lineage reference object : SORCAAR_REQ_HOURS_ACTIVITY
     * 
     */
    @JsonProperty("reqHoursActivity")
    @JsonPropertyDescription("Lineage reference object : SORCAAR_REQ_HOURS_ACTIVITY")
    private Double reqHoursActivity;
    /**
     * Lineage reference object : program
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : program")
    private String program;
    /**
     * Equivalent Credits
     * <p>
     * Lineage reference object : SOBCARP_CREDIT_EQUIVALENT
     * 
     */
    @JsonProperty("creditEquivalent")
    @JsonPropertyDescription("Lineage reference object : SOBCARP_CREDIT_EQUIVALENT")
    private Double creditEquivalent;
    /**
     * Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY
     * 
     */
    @JsonProperty("criteria.reqCreditsCategory")
    @JsonPropertyDescription("Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY")
    private Double criteriaReqCreditsCategory;
    /**
     * Lineage reference object : SORCACR_REQ_HOURS_CATEGORY
     * 
     */
    @JsonProperty("reqHoursCategory")
    @JsonPropertyDescription("Lineage reference object : SORCACR_REQ_HOURS_CATEGORY")
    private Double reqHoursCategory;
    /**
     * Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY
     * 
     */
    @JsonProperty("reqCreditsCategory")
    @JsonPropertyDescription("Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY")
    private Double reqCreditsCategory;
    /**
     * Lineage reference object : SORCACR_REQ_HOURS_CATEGORY
     * 
     */
    @JsonProperty("criteria.reqHoursCategory")
    @JsonPropertyDescription("Lineage reference object : SORCACR_REQ_HOURS_CATEGORY")
    private Double criteriaReqHoursCategory;
    /**
     * Lineage reference object : SORCACR_ACCG_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.accgCode")
    @JsonPropertyDescription("Lineage reference object : SORCACR_ACCG_CODE")
    private String criteriaAccgCode;
    /**
     * Lineage reference object : SORCAAR_REQ_CREDITS_ACTIVITY
     * 
     */
    @JsonProperty("reqCreditsActivity")
    @JsonPropertyDescription("Lineage reference object : SORCAAR_REQ_CREDITS_ACTIVITY")
    private Double reqCreditsActivity;
    /**
     * Lineage reference object : SOBCARP_REQ_HOURS_PROGRAM
     * 
     */
    @JsonProperty("reqHoursProgram")
    @JsonPropertyDescription("Lineage reference object : SOBCARP_REQ_HOURS_PROGRAM")
    private Double reqHoursProgram;
    /**
     * Lineage reference object : termCode
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : termCode")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * From Term
     * <p>
     * Lineage reference object : sobcarpTermCodeStart
     * (Required)
     * 
     */
    @JsonProperty("termCodeStart")
    public String getTermCodeStart() {
        return termCodeStart;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : sobcarpTermCodeStart
     * (Required)
     * 
     */
    @JsonProperty("termCodeStart")
    public void setTermCodeStart(String termCodeStart) {
        this.termCodeStart = termCodeStart;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withTermCodeStart(String termCodeStart) {
        this.termCodeStart = termCodeStart;
        return this;
    }

    /**
     * Required Credits
     * <p>
     * Lineage reference object : SOBCARP_REQ_CREDITS_PROGRAM
     * 
     */
    @JsonProperty("reqCreditsProgram")
    public Double getReqCreditsProgram() {
        return reqCreditsProgram;
    }

    /**
     * Required Credits
     * <p>
     * Lineage reference object : SOBCARP_REQ_CREDITS_PROGRAM
     * 
     */
    @JsonProperty("reqCreditsProgram")
    public void setReqCreditsProgram(Double reqCreditsProgram) {
        this.reqCreditsProgram = reqCreditsProgram;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withReqCreditsProgram(Double reqCreditsProgram) {
        this.reqCreditsProgram = reqCreditsProgram;
        return this;
    }

    /**
     * Lineage reference object : SORCAAR_REQ_HOURS_ACTIVITY
     * 
     */
    @JsonProperty("reqHoursActivity")
    public Double getReqHoursActivity() {
        return reqHoursActivity;
    }

    /**
     * Lineage reference object : SORCAAR_REQ_HOURS_ACTIVITY
     * 
     */
    @JsonProperty("reqHoursActivity")
    public void setReqHoursActivity(Double reqHoursActivity) {
        this.reqHoursActivity = reqHoursActivity;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withReqHoursActivity(Double reqHoursActivity) {
        this.reqHoursActivity = reqHoursActivity;
        return this;
    }

    /**
     * Lineage reference object : program
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Lineage reference object : program
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Equivalent Credits
     * <p>
     * Lineage reference object : SOBCARP_CREDIT_EQUIVALENT
     * 
     */
    @JsonProperty("creditEquivalent")
    public Double getCreditEquivalent() {
        return creditEquivalent;
    }

    /**
     * Equivalent Credits
     * <p>
     * Lineage reference object : SOBCARP_CREDIT_EQUIVALENT
     * 
     */
    @JsonProperty("creditEquivalent")
    public void setCreditEquivalent(Double creditEquivalent) {
        this.creditEquivalent = creditEquivalent;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withCreditEquivalent(Double creditEquivalent) {
        this.creditEquivalent = creditEquivalent;
        return this;
    }

    /**
     * Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY
     * 
     */
    @JsonProperty("criteria.reqCreditsCategory")
    public Double getCriteriaReqCreditsCategory() {
        return criteriaReqCreditsCategory;
    }

    /**
     * Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY
     * 
     */
    @JsonProperty("criteria.reqCreditsCategory")
    public void setCriteriaReqCreditsCategory(Double criteriaReqCreditsCategory) {
        this.criteriaReqCreditsCategory = criteriaReqCreditsCategory;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withCriteriaReqCreditsCategory(Double criteriaReqCreditsCategory) {
        this.criteriaReqCreditsCategory = criteriaReqCreditsCategory;
        return this;
    }

    /**
     * Lineage reference object : SORCACR_REQ_HOURS_CATEGORY
     * 
     */
    @JsonProperty("reqHoursCategory")
    public Double getReqHoursCategory() {
        return reqHoursCategory;
    }

    /**
     * Lineage reference object : SORCACR_REQ_HOURS_CATEGORY
     * 
     */
    @JsonProperty("reqHoursCategory")
    public void setReqHoursCategory(Double reqHoursCategory) {
        this.reqHoursCategory = reqHoursCategory;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withReqHoursCategory(Double reqHoursCategory) {
        this.reqHoursCategory = reqHoursCategory;
        return this;
    }

    /**
     * Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY
     * 
     */
    @JsonProperty("reqCreditsCategory")
    public Double getReqCreditsCategory() {
        return reqCreditsCategory;
    }

    /**
     * Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY
     * 
     */
    @JsonProperty("reqCreditsCategory")
    public void setReqCreditsCategory(Double reqCreditsCategory) {
        this.reqCreditsCategory = reqCreditsCategory;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withReqCreditsCategory(Double reqCreditsCategory) {
        this.reqCreditsCategory = reqCreditsCategory;
        return this;
    }

    /**
     * Lineage reference object : SORCACR_REQ_HOURS_CATEGORY
     * 
     */
    @JsonProperty("criteria.reqHoursCategory")
    public Double getCriteriaReqHoursCategory() {
        return criteriaReqHoursCategory;
    }

    /**
     * Lineage reference object : SORCACR_REQ_HOURS_CATEGORY
     * 
     */
    @JsonProperty("criteria.reqHoursCategory")
    public void setCriteriaReqHoursCategory(Double criteriaReqHoursCategory) {
        this.criteriaReqHoursCategory = criteriaReqHoursCategory;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withCriteriaReqHoursCategory(Double criteriaReqHoursCategory) {
        this.criteriaReqHoursCategory = criteriaReqHoursCategory;
        return this;
    }

    /**
     * Lineage reference object : SORCACR_ACCG_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.accgCode")
    public String getCriteriaAccgCode() {
        return criteriaAccgCode;
    }

    /**
     * Lineage reference object : SORCACR_ACCG_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.accgCode")
    public void setCriteriaAccgCode(String criteriaAccgCode) {
        this.criteriaAccgCode = criteriaAccgCode;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withCriteriaAccgCode(String criteriaAccgCode) {
        this.criteriaAccgCode = criteriaAccgCode;
        return this;
    }

    /**
     * Lineage reference object : SORCAAR_REQ_CREDITS_ACTIVITY
     * 
     */
    @JsonProperty("reqCreditsActivity")
    public Double getReqCreditsActivity() {
        return reqCreditsActivity;
    }

    /**
     * Lineage reference object : SORCAAR_REQ_CREDITS_ACTIVITY
     * 
     */
    @JsonProperty("reqCreditsActivity")
    public void setReqCreditsActivity(Double reqCreditsActivity) {
        this.reqCreditsActivity = reqCreditsActivity;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withReqCreditsActivity(Double reqCreditsActivity) {
        this.reqCreditsActivity = reqCreditsActivity;
        return this;
    }

    /**
     * Lineage reference object : SOBCARP_REQ_HOURS_PROGRAM
     * 
     */
    @JsonProperty("reqHoursProgram")
    public Double getReqHoursProgram() {
        return reqHoursProgram;
    }

    /**
     * Lineage reference object : SOBCARP_REQ_HOURS_PROGRAM
     * 
     */
    @JsonProperty("reqHoursProgram")
    public void setReqHoursProgram(Double reqHoursProgram) {
        this.reqHoursProgram = reqHoursProgram;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withReqHoursProgram(Double reqHoursProgram) {
        this.reqHoursProgram = reqHoursProgram;
        return this;
    }

    /**
     * Lineage reference object : termCode
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Lineage reference object : termCode
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public ComplementaryActivitiesProgramRules100PutRequest withTermCode(String termCode) {
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

    public ComplementaryActivitiesProgramRules100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplementaryActivitiesProgramRules100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termCodeStart");
        sb.append('=');
        sb.append(((this.termCodeStart == null)?"<null>":this.termCodeStart));
        sb.append(',');
        sb.append("reqCreditsProgram");
        sb.append('=');
        sb.append(((this.reqCreditsProgram == null)?"<null>":this.reqCreditsProgram));
        sb.append(',');
        sb.append("reqHoursActivity");
        sb.append('=');
        sb.append(((this.reqHoursActivity == null)?"<null>":this.reqHoursActivity));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("creditEquivalent");
        sb.append('=');
        sb.append(((this.creditEquivalent == null)?"<null>":this.creditEquivalent));
        sb.append(',');
        sb.append("criteriaReqCreditsCategory");
        sb.append('=');
        sb.append(((this.criteriaReqCreditsCategory == null)?"<null>":this.criteriaReqCreditsCategory));
        sb.append(',');
        sb.append("reqHoursCategory");
        sb.append('=');
        sb.append(((this.reqHoursCategory == null)?"<null>":this.reqHoursCategory));
        sb.append(',');
        sb.append("reqCreditsCategory");
        sb.append('=');
        sb.append(((this.reqCreditsCategory == null)?"<null>":this.reqCreditsCategory));
        sb.append(',');
        sb.append("criteriaReqHoursCategory");
        sb.append('=');
        sb.append(((this.criteriaReqHoursCategory == null)?"<null>":this.criteriaReqHoursCategory));
        sb.append(',');
        sb.append("criteriaAccgCode");
        sb.append('=');
        sb.append(((this.criteriaAccgCode == null)?"<null>":this.criteriaAccgCode));
        sb.append(',');
        sb.append("reqCreditsActivity");
        sb.append('=');
        sb.append(((this.reqCreditsActivity == null)?"<null>":this.reqCreditsActivity));
        sb.append(',');
        sb.append("reqHoursProgram");
        sb.append('=');
        sb.append(((this.reqHoursProgram == null)?"<null>":this.reqHoursProgram));
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
        result = ((result* 31)+((this.termCodeStart == null)? 0 :this.termCodeStart.hashCode()));
        result = ((result* 31)+((this.reqCreditsProgram == null)? 0 :this.reqCreditsProgram.hashCode()));
        result = ((result* 31)+((this.criteriaReqHoursCategory == null)? 0 :this.criteriaReqHoursCategory.hashCode()));
        result = ((result* 31)+((this.reqHoursActivity == null)? 0 :this.reqHoursActivity.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.creditEquivalent == null)? 0 :this.creditEquivalent.hashCode()));
        result = ((result* 31)+((this.criteriaReqCreditsCategory == null)? 0 :this.criteriaReqCreditsCategory.hashCode()));
        result = ((result* 31)+((this.reqHoursCategory == null)? 0 :this.reqHoursCategory.hashCode()));
        result = ((result* 31)+((this.reqCreditsCategory == null)? 0 :this.reqCreditsCategory.hashCode()));
        result = ((result* 31)+((this.criteriaAccgCode == null)? 0 :this.criteriaAccgCode.hashCode()));
        result = ((result* 31)+((this.reqCreditsActivity == null)? 0 :this.reqCreditsActivity.hashCode()));
        result = ((result* 31)+((this.reqHoursProgram == null)? 0 :this.reqHoursProgram.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplementaryActivitiesProgramRules100PutRequest) == false) {
            return false;
        }
        ComplementaryActivitiesProgramRules100PutRequest rhs = ((ComplementaryActivitiesProgramRules100PutRequest) other);
        return (((((((((((((((this.termCodeStart == rhs.termCodeStart)||((this.termCodeStart!= null)&&this.termCodeStart.equals(rhs.termCodeStart)))&&((this.reqCreditsProgram == rhs.reqCreditsProgram)||((this.reqCreditsProgram!= null)&&this.reqCreditsProgram.equals(rhs.reqCreditsProgram))))&&((this.criteriaReqHoursCategory == rhs.criteriaReqHoursCategory)||((this.criteriaReqHoursCategory!= null)&&this.criteriaReqHoursCategory.equals(rhs.criteriaReqHoursCategory))))&&((this.reqHoursActivity == rhs.reqHoursActivity)||((this.reqHoursActivity!= null)&&this.reqHoursActivity.equals(rhs.reqHoursActivity))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.creditEquivalent == rhs.creditEquivalent)||((this.creditEquivalent!= null)&&this.creditEquivalent.equals(rhs.creditEquivalent))))&&((this.criteriaReqCreditsCategory == rhs.criteriaReqCreditsCategory)||((this.criteriaReqCreditsCategory!= null)&&this.criteriaReqCreditsCategory.equals(rhs.criteriaReqCreditsCategory))))&&((this.reqHoursCategory == rhs.reqHoursCategory)||((this.reqHoursCategory!= null)&&this.reqHoursCategory.equals(rhs.reqHoursCategory))))&&((this.reqCreditsCategory == rhs.reqCreditsCategory)||((this.reqCreditsCategory!= null)&&this.reqCreditsCategory.equals(rhs.reqCreditsCategory))))&&((this.criteriaAccgCode == rhs.criteriaAccgCode)||((this.criteriaAccgCode!= null)&&this.criteriaAccgCode.equals(rhs.criteriaAccgCode))))&&((this.reqCreditsActivity == rhs.reqCreditsActivity)||((this.reqCreditsActivity!= null)&&this.reqCreditsActivity.equals(rhs.reqCreditsActivity))))&&((this.reqHoursProgram == rhs.reqHoursProgram)||((this.reqHoursProgram!= null)&&this.reqHoursProgram.equals(rhs.reqHoursProgram))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
