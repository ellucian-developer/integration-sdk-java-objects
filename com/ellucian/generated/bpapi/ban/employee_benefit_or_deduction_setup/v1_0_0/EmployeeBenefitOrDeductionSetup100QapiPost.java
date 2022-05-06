
package com.ellucian.generated.bpapi.ban.employee_benefit_or_deduction_setup.v1_0_0;

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
    "id",
    "defaultBeginDate"
})
@Generated("jsonschema2pojo")
public class EmployeeBenefitOrDeductionSetup100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("defaultBeginDate")
    private String defaultBeginDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeBenefitOrDeductionSetup100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("defaultBeginDate")
    public String getDefaultBeginDate() {
        return defaultBeginDate;
    }

    @JsonProperty("defaultBeginDate")
    public void setDefaultBeginDate(String defaultBeginDate) {
        this.defaultBeginDate = defaultBeginDate;
    }

    public EmployeeBenefitOrDeductionSetup100QapiPost withDefaultBeginDate(String defaultBeginDate) {
        this.defaultBeginDate = defaultBeginDate;
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

    public EmployeeBenefitOrDeductionSetup100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeBenefitOrDeductionSetup100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("defaultBeginDate");
        sb.append('=');
        sb.append(((this.defaultBeginDate == null)?"<null>":this.defaultBeginDate));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.defaultBeginDate == null)? 0 :this.defaultBeginDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeBenefitOrDeductionSetup100QapiPost) == false) {
            return false;
        }
        EmployeeBenefitOrDeductionSetup100QapiPost rhs = ((EmployeeBenefitOrDeductionSetup100QapiPost) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.defaultBeginDate == rhs.defaultBeginDate)||((this.defaultBeginDate!= null)&&this.defaultBeginDate.equals(rhs.defaultBeginDate))));
    }

}
