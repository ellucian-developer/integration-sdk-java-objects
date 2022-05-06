
package com.ellucian.generated.bpapi.ban.college_and_department_text.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "scatextCollCode",
    "scatextDeptCode",
    "scatextEffTerm"
})
@Generated("jsonschema2pojo")
public class CollegeAndDepartmentText100QapiPost {

    @JsonProperty("scatextCollCode")
    private String scatextCollCode;
    @JsonProperty("scatextDeptCode")
    private String scatextDeptCode;
    @JsonProperty("scatextEffTerm")
    private String scatextEffTerm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scatextCollCode")
    public String getScatextCollCode() {
        return scatextCollCode;
    }

    @JsonProperty("scatextCollCode")
    public void setScatextCollCode(String scatextCollCode) {
        this.scatextCollCode = scatextCollCode;
    }

    public CollegeAndDepartmentText100QapiPost withScatextCollCode(String scatextCollCode) {
        this.scatextCollCode = scatextCollCode;
        return this;
    }

    @JsonProperty("scatextDeptCode")
    public String getScatextDeptCode() {
        return scatextDeptCode;
    }

    @JsonProperty("scatextDeptCode")
    public void setScatextDeptCode(String scatextDeptCode) {
        this.scatextDeptCode = scatextDeptCode;
    }

    public CollegeAndDepartmentText100QapiPost withScatextDeptCode(String scatextDeptCode) {
        this.scatextDeptCode = scatextDeptCode;
        return this;
    }

    @JsonProperty("scatextEffTerm")
    public String getScatextEffTerm() {
        return scatextEffTerm;
    }

    @JsonProperty("scatextEffTerm")
    public void setScatextEffTerm(String scatextEffTerm) {
        this.scatextEffTerm = scatextEffTerm;
    }

    public CollegeAndDepartmentText100QapiPost withScatextEffTerm(String scatextEffTerm) {
        this.scatextEffTerm = scatextEffTerm;
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

    public CollegeAndDepartmentText100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollegeAndDepartmentText100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scatextCollCode");
        sb.append('=');
        sb.append(((this.scatextCollCode == null)?"<null>":this.scatextCollCode));
        sb.append(',');
        sb.append("scatextDeptCode");
        sb.append('=');
        sb.append(((this.scatextDeptCode == null)?"<null>":this.scatextDeptCode));
        sb.append(',');
        sb.append("scatextEffTerm");
        sb.append('=');
        sb.append(((this.scatextEffTerm == null)?"<null>":this.scatextEffTerm));
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
        if ((other instanceof CollegeAndDepartmentText100QapiPost) == false) {
            return false;
        }
        CollegeAndDepartmentText100QapiPost rhs = ((CollegeAndDepartmentText100QapiPost) other);
        return (((((this.scatextDeptCode == rhs.scatextDeptCode)||((this.scatextDeptCode!= null)&&this.scatextDeptCode.equals(rhs.scatextDeptCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scatextCollCode == rhs.scatextCollCode)||((this.scatextCollCode!= null)&&this.scatextCollCode.equals(rhs.scatextCollCode))))&&((this.scatextEffTerm == rhs.scatextEffTerm)||((this.scatextEffTerm!= null)&&this.scatextEffTerm.equals(rhs.scatextEffTerm))));
    }

}
