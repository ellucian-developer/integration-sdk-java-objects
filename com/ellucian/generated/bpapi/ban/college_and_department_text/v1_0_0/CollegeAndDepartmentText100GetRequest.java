
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
    "scatextDeptCode"
})
@Generated("jsonschema2pojo")
public class CollegeAndDepartmentText100GetRequest {

    /**
     * College
     * <p>
     * Lineage reference object : scatextCollCode, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("scatextCollCode")
    @JsonPropertyDescription("Lineage reference object : scatextCollCode, Lookup lineage reference object : stvcoll")
    private Object scatextCollCode;
    /**
     * Term
     * <p>
     * Lineage reference object : scatextEffTerm, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scatextEffTerm")
    @JsonPropertyDescription("Lineage reference object : scatextEffTerm, Lookup lineage reference object : stvterm")
    private Object scatextEffTerm;
    /**
     * Department
     * <p>
     * Lineage reference object : scatextDeptCode, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("scatextDeptCode")
    @JsonPropertyDescription("Lineage reference object : scatextDeptCode, Lookup lineage reference object : stvdept")
    private Object scatextDeptCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * College
     * <p>
     * Lineage reference object : scatextCollCode, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("scatextCollCode")
    public Object getScatextCollCode() {
        return scatextCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : scatextCollCode, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("scatextCollCode")
    public void setScatextCollCode(Object scatextCollCode) {
        this.scatextCollCode = scatextCollCode;
    }

    public CollegeAndDepartmentText100GetRequest withScatextCollCode(Object scatextCollCode) {
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
    public Object getScatextEffTerm() {
        return scatextEffTerm;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scatextEffTerm, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scatextEffTerm")
    public void setScatextEffTerm(Object scatextEffTerm) {
        this.scatextEffTerm = scatextEffTerm;
    }

    public CollegeAndDepartmentText100GetRequest withScatextEffTerm(Object scatextEffTerm) {
        this.scatextEffTerm = scatextEffTerm;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : scatextDeptCode, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("scatextDeptCode")
    public Object getScatextDeptCode() {
        return scatextDeptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : scatextDeptCode, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("scatextDeptCode")
    public void setScatextDeptCode(Object scatextDeptCode) {
        this.scatextDeptCode = scatextDeptCode;
    }

    public CollegeAndDepartmentText100GetRequest withScatextDeptCode(Object scatextDeptCode) {
        this.scatextDeptCode = scatextDeptCode;
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

    public CollegeAndDepartmentText100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollegeAndDepartmentText100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scatextCollCode");
        sb.append('=');
        sb.append(((this.scatextCollCode == null)?"<null>":this.scatextCollCode));
        sb.append(',');
        sb.append("scatextEffTerm");
        sb.append('=');
        sb.append(((this.scatextEffTerm == null)?"<null>":this.scatextEffTerm));
        sb.append(',');
        sb.append("scatextDeptCode");
        sb.append('=');
        sb.append(((this.scatextDeptCode == null)?"<null>":this.scatextDeptCode));
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
        result = ((result* 31)+((this.scatextDeptCode == null)? 0 :this.scatextDeptCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scatextCollCode == null)? 0 :this.scatextCollCode.hashCode()));
        result = ((result* 31)+((this.scatextEffTerm == null)? 0 :this.scatextEffTerm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CollegeAndDepartmentText100GetRequest) == false) {
            return false;
        }
        CollegeAndDepartmentText100GetRequest rhs = ((CollegeAndDepartmentText100GetRequest) other);
        return (((((this.scatextDeptCode == rhs.scatextDeptCode)||((this.scatextDeptCode!= null)&&this.scatextDeptCode.equals(rhs.scatextDeptCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scatextCollCode == rhs.scatextCollCode)||((this.scatextCollCode!= null)&&this.scatextCollCode.equals(rhs.scatextCollCode))))&&((this.scatextEffTerm == rhs.scatextEffTerm)||((this.scatextEffTerm!= null)&&this.scatextEffTerm.equals(rhs.scatextEffTerm))));
    }

}
