
package com.ellucian.generated.bpapi.ban.college_and_department_text.v1_0_0;

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
    "scatextCollCode",
    "scatextEffTerm",
    "criteria.text",
    "scatextDeptCode",
    "text"
})
@Generated("jsonschema2pojo")
public class CollegeAndDepartmentText100PutRequest {

    /**
     * College
     * <p>
     * Lineage reference object : scatextCollCode, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("scatextCollCode")
    @JsonPropertyDescription("Lineage reference object : scatextCollCode, Lookup lineage reference object : stvcoll")
    private String scatextCollCode;
    /**
     * Term
     * <p>
     * Lineage reference object : scatextEffTerm, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scatextEffTerm")
    @JsonPropertyDescription("Lineage reference object : scatextEffTerm, Lookup lineage reference object : stvterm")
    private String scatextEffTerm;
    /**
     * Lineage reference object : SCRCDTX_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    @JsonPropertyDescription("Lineage reference object : SCRCDTX_TEXT")
    private String criteriaText;
    /**
     * Department
     * <p>
     * Lineage reference object : scatextDeptCode, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("scatextDeptCode")
    @JsonPropertyDescription("Lineage reference object : scatextDeptCode, Lookup lineage reference object : stvdept")
    private String scatextDeptCode;
    /**
     * Lineage reference object : SCRCDTX_TEXT
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : SCRCDTX_TEXT")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * College
     * <p>
     * Lineage reference object : scatextCollCode, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("scatextCollCode")
    public String getScatextCollCode() {
        return scatextCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : scatextCollCode, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("scatextCollCode")
    public void setScatextCollCode(String scatextCollCode) {
        this.scatextCollCode = scatextCollCode;
    }

    public CollegeAndDepartmentText100PutRequest withScatextCollCode(String scatextCollCode) {
        this.scatextCollCode = scatextCollCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scatextEffTerm, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scatextEffTerm")
    public String getScatextEffTerm() {
        return scatextEffTerm;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scatextEffTerm, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scatextEffTerm")
    public void setScatextEffTerm(String scatextEffTerm) {
        this.scatextEffTerm = scatextEffTerm;
    }

    public CollegeAndDepartmentText100PutRequest withScatextEffTerm(String scatextEffTerm) {
        this.scatextEffTerm = scatextEffTerm;
        return this;
    }

    /**
     * Lineage reference object : SCRCDTX_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    public String getCriteriaText() {
        return criteriaText;
    }

    /**
     * Lineage reference object : SCRCDTX_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    public void setCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
    }

    public CollegeAndDepartmentText100PutRequest withCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : scatextDeptCode, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("scatextDeptCode")
    public String getScatextDeptCode() {
        return scatextDeptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : scatextDeptCode, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("scatextDeptCode")
    public void setScatextDeptCode(String scatextDeptCode) {
        this.scatextDeptCode = scatextDeptCode;
    }

    public CollegeAndDepartmentText100PutRequest withScatextDeptCode(String scatextDeptCode) {
        this.scatextDeptCode = scatextDeptCode;
        return this;
    }

    /**
     * Lineage reference object : SCRCDTX_TEXT
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Lineage reference object : SCRCDTX_TEXT
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public CollegeAndDepartmentText100PutRequest withText(String text) {
        this.text = text;
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

    public CollegeAndDepartmentText100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollegeAndDepartmentText100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scatextCollCode");
        sb.append('=');
        sb.append(((this.scatextCollCode == null)?"<null>":this.scatextCollCode));
        sb.append(',');
        sb.append("scatextEffTerm");
        sb.append('=');
        sb.append(((this.scatextEffTerm == null)?"<null>":this.scatextEffTerm));
        sb.append(',');
        sb.append("criteriaText");
        sb.append('=');
        sb.append(((this.criteriaText == null)?"<null>":this.criteriaText));
        sb.append(',');
        sb.append("scatextDeptCode");
        sb.append('=');
        sb.append(((this.scatextDeptCode == null)?"<null>":this.scatextDeptCode));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
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
        result = ((result* 31)+((this.scatextCollCode == null)? 0 :this.scatextCollCode.hashCode()));
        result = ((result* 31)+((this.scatextEffTerm == null)? 0 :this.scatextEffTerm.hashCode()));
        result = ((result* 31)+((this.criteriaText == null)? 0 :this.criteriaText.hashCode()));
        result = ((result* 31)+((this.scatextDeptCode == null)? 0 :this.scatextDeptCode.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CollegeAndDepartmentText100PutRequest) == false) {
            return false;
        }
        CollegeAndDepartmentText100PutRequest rhs = ((CollegeAndDepartmentText100PutRequest) other);
        return (((((((this.scatextCollCode == rhs.scatextCollCode)||((this.scatextCollCode!= null)&&this.scatextCollCode.equals(rhs.scatextCollCode)))&&((this.scatextEffTerm == rhs.scatextEffTerm)||((this.scatextEffTerm!= null)&&this.scatextEffTerm.equals(rhs.scatextEffTerm))))&&((this.criteriaText == rhs.criteriaText)||((this.criteriaText!= null)&&this.criteriaText.equals(rhs.criteriaText))))&&((this.scatextDeptCode == rhs.scatextDeptCode)||((this.scatextDeptCode!= null)&&this.scatextDeptCode.equals(rhs.scatextDeptCode))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
