
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
    "reqCreditsProgram",
    "accgCode",
    "reqCreditsActivity",
    "reqHoursProgram",
    "reqHoursActivity",
    "program",
    "creditEquivalent",
    "reqHoursCategory",
    "reqCreditsCategory",
    "actcCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class ComplementaryActivitiesProgramRules100PostRequest {

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
     * Lineage reference object : SORCACR_ACCG_CODE
     * (Required)
     * 
     */
    @JsonProperty("accgCode")
    @JsonPropertyDescription("Lineage reference object : SORCACR_ACCG_CODE")
    private String accgCode;
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
     * Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    @JsonPropertyDescription("Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC")
    private String actcCode;
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

    public ComplementaryActivitiesProgramRules100PostRequest withReqCreditsProgram(Double reqCreditsProgram) {
        this.reqCreditsProgram = reqCreditsProgram;
        return this;
    }

    /**
     * Lineage reference object : SORCACR_ACCG_CODE
     * (Required)
     * 
     */
    @JsonProperty("accgCode")
    public String getAccgCode() {
        return accgCode;
    }

    /**
     * Lineage reference object : SORCACR_ACCG_CODE
     * (Required)
     * 
     */
    @JsonProperty("accgCode")
    public void setAccgCode(String accgCode) {
        this.accgCode = accgCode;
    }

    public ComplementaryActivitiesProgramRules100PostRequest withAccgCode(String accgCode) {
        this.accgCode = accgCode;
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

    public ComplementaryActivitiesProgramRules100PostRequest withReqCreditsActivity(Double reqCreditsActivity) {
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

    public ComplementaryActivitiesProgramRules100PostRequest withReqHoursProgram(Double reqHoursProgram) {
        this.reqHoursProgram = reqHoursProgram;
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

    public ComplementaryActivitiesProgramRules100PostRequest withReqHoursActivity(Double reqHoursActivity) {
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

    public ComplementaryActivitiesProgramRules100PostRequest withProgram(String program) {
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

    public ComplementaryActivitiesProgramRules100PostRequest withCreditEquivalent(Double creditEquivalent) {
        this.creditEquivalent = creditEquivalent;
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

    public ComplementaryActivitiesProgramRules100PostRequest withReqHoursCategory(Double reqHoursCategory) {
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

    public ComplementaryActivitiesProgramRules100PostRequest withReqCreditsCategory(Double reqCreditsCategory) {
        this.reqCreditsCategory = reqCreditsCategory;
        return this;
    }

    /**
     * Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public String getActcCode() {
        return actcCode;
    }

    /**
     * Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public void setActcCode(String actcCode) {
        this.actcCode = actcCode;
    }

    public ComplementaryActivitiesProgramRules100PostRequest withActcCode(String actcCode) {
        this.actcCode = actcCode;
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

    public ComplementaryActivitiesProgramRules100PostRequest withTermCode(String termCode) {
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

    public ComplementaryActivitiesProgramRules100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplementaryActivitiesProgramRules100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqCreditsProgram");
        sb.append('=');
        sb.append(((this.reqCreditsProgram == null)?"<null>":this.reqCreditsProgram));
        sb.append(',');
        sb.append("accgCode");
        sb.append('=');
        sb.append(((this.accgCode == null)?"<null>":this.accgCode));
        sb.append(',');
        sb.append("reqCreditsActivity");
        sb.append('=');
        sb.append(((this.reqCreditsActivity == null)?"<null>":this.reqCreditsActivity));
        sb.append(',');
        sb.append("reqHoursProgram");
        sb.append('=');
        sb.append(((this.reqHoursProgram == null)?"<null>":this.reqHoursProgram));
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
        sb.append("reqHoursCategory");
        sb.append('=');
        sb.append(((this.reqHoursCategory == null)?"<null>":this.reqHoursCategory));
        sb.append(',');
        sb.append("reqCreditsCategory");
        sb.append('=');
        sb.append(((this.reqCreditsCategory == null)?"<null>":this.reqCreditsCategory));
        sb.append(',');
        sb.append("actcCode");
        sb.append('=');
        sb.append(((this.actcCode == null)?"<null>":this.actcCode));
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
        result = ((result* 31)+((this.reqCreditsProgram == null)? 0 :this.reqCreditsProgram.hashCode()));
        result = ((result* 31)+((this.accgCode == null)? 0 :this.accgCode.hashCode()));
        result = ((result* 31)+((this.reqHoursActivity == null)? 0 :this.reqHoursActivity.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.creditEquivalent == null)? 0 :this.creditEquivalent.hashCode()));
        result = ((result* 31)+((this.reqHoursCategory == null)? 0 :this.reqHoursCategory.hashCode()));
        result = ((result* 31)+((this.reqCreditsCategory == null)? 0 :this.reqCreditsCategory.hashCode()));
        result = ((result* 31)+((this.reqCreditsActivity == null)? 0 :this.reqCreditsActivity.hashCode()));
        result = ((result* 31)+((this.reqHoursProgram == null)? 0 :this.reqHoursProgram.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actcCode == null)? 0 :this.actcCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplementaryActivitiesProgramRules100PostRequest) == false) {
            return false;
        }
        ComplementaryActivitiesProgramRules100PostRequest rhs = ((ComplementaryActivitiesProgramRules100PostRequest) other);
        return (((((((((((((this.reqCreditsProgram == rhs.reqCreditsProgram)||((this.reqCreditsProgram!= null)&&this.reqCreditsProgram.equals(rhs.reqCreditsProgram)))&&((this.accgCode == rhs.accgCode)||((this.accgCode!= null)&&this.accgCode.equals(rhs.accgCode))))&&((this.reqHoursActivity == rhs.reqHoursActivity)||((this.reqHoursActivity!= null)&&this.reqHoursActivity.equals(rhs.reqHoursActivity))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.creditEquivalent == rhs.creditEquivalent)||((this.creditEquivalent!= null)&&this.creditEquivalent.equals(rhs.creditEquivalent))))&&((this.reqHoursCategory == rhs.reqHoursCategory)||((this.reqHoursCategory!= null)&&this.reqHoursCategory.equals(rhs.reqHoursCategory))))&&((this.reqCreditsCategory == rhs.reqCreditsCategory)||((this.reqCreditsCategory!= null)&&this.reqCreditsCategory.equals(rhs.reqCreditsCategory))))&&((this.reqCreditsActivity == rhs.reqCreditsActivity)||((this.reqCreditsActivity!= null)&&this.reqCreditsActivity.equals(rhs.reqCreditsActivity))))&&((this.reqHoursProgram == rhs.reqHoursProgram)||((this.reqHoursProgram!= null)&&this.reqHoursProgram.equals(rhs.reqHoursProgram))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actcCode == rhs.actcCode)||((this.actcCode!= null)&&this.actcCode.equals(rhs.actcCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
