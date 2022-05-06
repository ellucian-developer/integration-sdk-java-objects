
package com.ellucian.generated.bpapi.ban.employee_benefit_or_deduction_setup.v1_0_0;

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
    "id",
    "defaultBeginDate"
})
@Generated("jsonschema2pojo")
public class EmployeeBenefitOrDeductionSetup100GetRequest {

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Default Begin Date
     * <p>
     * Lineage reference object : defaultBeginDate
     * 
     */
    @JsonProperty("defaultBeginDate")
    @JsonPropertyDescription("Lineage reference object : defaultBeginDate")
    private Object defaultBeginDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public EmployeeBenefitOrDeductionSetup100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Default Begin Date
     * <p>
     * Lineage reference object : defaultBeginDate
     * 
     */
    @JsonProperty("defaultBeginDate")
    public Object getDefaultBeginDate() {
        return defaultBeginDate;
    }

    /**
     * Default Begin Date
     * <p>
     * Lineage reference object : defaultBeginDate
     * 
     */
    @JsonProperty("defaultBeginDate")
    public void setDefaultBeginDate(Object defaultBeginDate) {
        this.defaultBeginDate = defaultBeginDate;
    }

    public EmployeeBenefitOrDeductionSetup100GetRequest withDefaultBeginDate(Object defaultBeginDate) {
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

    public EmployeeBenefitOrDeductionSetup100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeBenefitOrDeductionSetup100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof EmployeeBenefitOrDeductionSetup100GetRequest) == false) {
            return false;
        }
        EmployeeBenefitOrDeductionSetup100GetRequest rhs = ((EmployeeBenefitOrDeductionSetup100GetRequest) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.defaultBeginDate == rhs.defaultBeginDate)||((this.defaultBeginDate!= null)&&this.defaultBeginDate.equals(rhs.defaultBeginDate))));
    }

}
