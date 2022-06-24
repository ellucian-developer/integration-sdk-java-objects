
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
    "program",
    "termCode",
    "accgCode",
    "reqHoursCategory",
    "reqCreditsCategory",
    "actcCode",
    "reqHoursActivity",
    "reqCreditsActivity"
})
@Generated("jsonschema2pojo")
public class ComplementaryActivitiesProgramRules100QapiPost {

    @JsonProperty("program")
    private String program;
    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("accgCode")
    private String accgCode;
    @JsonProperty("reqHoursCategory")
    private String reqHoursCategory;
    @JsonProperty("reqCreditsCategory")
    private String reqCreditsCategory;
    /**
     * Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC
     * 
     */
    @JsonProperty("actcCode")
    @JsonPropertyDescription("Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC")
    private String actcCode;
    @JsonProperty("reqHoursActivity")
    private String reqHoursActivity;
    /**
     * Lineage reference object : SORCAAR_REQ_CREDITS_ACTIVITY
     * 
     */
    @JsonProperty("reqCreditsActivity")
    @JsonPropertyDescription("Lineage reference object : SORCAAR_REQ_CREDITS_ACTIVITY")
    private Double reqCreditsActivity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public ComplementaryActivitiesProgramRules100QapiPost withProgram(String program) {
        this.program = program;
        return this;
    }

    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public ComplementaryActivitiesProgramRules100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonProperty("accgCode")
    public String getAccgCode() {
        return accgCode;
    }

    @JsonProperty("accgCode")
    public void setAccgCode(String accgCode) {
        this.accgCode = accgCode;
    }

    public ComplementaryActivitiesProgramRules100QapiPost withAccgCode(String accgCode) {
        this.accgCode = accgCode;
        return this;
    }

    @JsonProperty("reqHoursCategory")
    public String getReqHoursCategory() {
        return reqHoursCategory;
    }

    @JsonProperty("reqHoursCategory")
    public void setReqHoursCategory(String reqHoursCategory) {
        this.reqHoursCategory = reqHoursCategory;
    }

    public ComplementaryActivitiesProgramRules100QapiPost withReqHoursCategory(String reqHoursCategory) {
        this.reqHoursCategory = reqHoursCategory;
        return this;
    }

    @JsonProperty("reqCreditsCategory")
    public String getReqCreditsCategory() {
        return reqCreditsCategory;
    }

    @JsonProperty("reqCreditsCategory")
    public void setReqCreditsCategory(String reqCreditsCategory) {
        this.reqCreditsCategory = reqCreditsCategory;
    }

    public ComplementaryActivitiesProgramRules100QapiPost withReqCreditsCategory(String reqCreditsCategory) {
        this.reqCreditsCategory = reqCreditsCategory;
        return this;
    }

    /**
     * Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC
     * 
     */
    @JsonProperty("actcCode")
    public String getActcCode() {
        return actcCode;
    }

    /**
     * Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC
     * 
     */
    @JsonProperty("actcCode")
    public void setActcCode(String actcCode) {
        this.actcCode = actcCode;
    }

    public ComplementaryActivitiesProgramRules100QapiPost withActcCode(String actcCode) {
        this.actcCode = actcCode;
        return this;
    }

    @JsonProperty("reqHoursActivity")
    public String getReqHoursActivity() {
        return reqHoursActivity;
    }

    @JsonProperty("reqHoursActivity")
    public void setReqHoursActivity(String reqHoursActivity) {
        this.reqHoursActivity = reqHoursActivity;
    }

    public ComplementaryActivitiesProgramRules100QapiPost withReqHoursActivity(String reqHoursActivity) {
        this.reqHoursActivity = reqHoursActivity;
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

    public ComplementaryActivitiesProgramRules100QapiPost withReqCreditsActivity(Double reqCreditsActivity) {
        this.reqCreditsActivity = reqCreditsActivity;
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

    public ComplementaryActivitiesProgramRules100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplementaryActivitiesProgramRules100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("accgCode");
        sb.append('=');
        sb.append(((this.accgCode == null)?"<null>":this.accgCode));
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
        sb.append("reqHoursActivity");
        sb.append('=');
        sb.append(((this.reqHoursActivity == null)?"<null>":this.reqHoursActivity));
        sb.append(',');
        sb.append("reqCreditsActivity");
        sb.append('=');
        sb.append(((this.reqCreditsActivity == null)?"<null>":this.reqCreditsActivity));
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
        result = ((result* 31)+((this.accgCode == null)? 0 :this.accgCode.hashCode()));
        result = ((result* 31)+((this.reqCreditsActivity == null)? 0 :this.reqCreditsActivity.hashCode()));
        result = ((result* 31)+((this.reqHoursActivity == null)? 0 :this.reqHoursActivity.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reqHoursCategory == null)? 0 :this.reqHoursCategory.hashCode()));
        result = ((result* 31)+((this.reqCreditsCategory == null)? 0 :this.reqCreditsCategory.hashCode()));
        result = ((result* 31)+((this.actcCode == null)? 0 :this.actcCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplementaryActivitiesProgramRules100QapiPost) == false) {
            return false;
        }
        ComplementaryActivitiesProgramRules100QapiPost rhs = ((ComplementaryActivitiesProgramRules100QapiPost) other);
        return ((((((((((this.accgCode == rhs.accgCode)||((this.accgCode!= null)&&this.accgCode.equals(rhs.accgCode)))&&((this.reqCreditsActivity == rhs.reqCreditsActivity)||((this.reqCreditsActivity!= null)&&this.reqCreditsActivity.equals(rhs.reqCreditsActivity))))&&((this.reqHoursActivity == rhs.reqHoursActivity)||((this.reqHoursActivity!= null)&&this.reqHoursActivity.equals(rhs.reqHoursActivity))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reqHoursCategory == rhs.reqHoursCategory)||((this.reqHoursCategory!= null)&&this.reqHoursCategory.equals(rhs.reqHoursCategory))))&&((this.reqCreditsCategory == rhs.reqCreditsCategory)||((this.reqCreditsCategory!= null)&&this.reqCreditsCategory.equals(rhs.reqCreditsCategory))))&&((this.actcCode == rhs.actcCode)||((this.actcCode!= null)&&this.actcCode.equals(rhs.actcCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
