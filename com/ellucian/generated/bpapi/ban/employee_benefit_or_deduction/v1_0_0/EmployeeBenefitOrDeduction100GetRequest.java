
package com.ellucian.generated.bpapi.ban.employee_benefit_or_deduction.v1_0_0;

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
    "queryDate",
    "dbca_code",
    "id"
})
@Generated("jsonschema2pojo")
public class EmployeeBenefitOrDeduction100GetRequest {

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * 
     */
    @JsonProperty("queryDate")
    @JsonPropertyDescription("Lineage reference object : queryDate")
    private Object queryDate;
    /**
     * Deduction
     * <p>
     * Lineage reference object : bdcaCode
     * 
     */
    @JsonProperty("dbca_code")
    @JsonPropertyDescription("Lineage reference object : bdcaCode")
    private Object dbcaCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * 
     */
    @JsonProperty("queryDate")
    public Object getQueryDate() {
        return queryDate;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(Object queryDate) {
        this.queryDate = queryDate;
    }

    public EmployeeBenefitOrDeduction100GetRequest withQueryDate(Object queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Deduction
     * <p>
     * Lineage reference object : bdcaCode
     * 
     */
    @JsonProperty("dbca_code")
    public Object getDbcaCode() {
        return dbcaCode;
    }

    /**
     * Deduction
     * <p>
     * Lineage reference object : bdcaCode
     * 
     */
    @JsonProperty("dbca_code")
    public void setDbcaCode(Object dbcaCode) {
        this.dbcaCode = dbcaCode;
    }

    public EmployeeBenefitOrDeduction100GetRequest withDbcaCode(Object dbcaCode) {
        this.dbcaCode = dbcaCode;
        return this;
    }

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

    public EmployeeBenefitOrDeduction100GetRequest withId(Object id) {
        this.id = id;
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

    public EmployeeBenefitOrDeduction100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeBenefitOrDeduction100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("dbcaCode");
        sb.append('=');
        sb.append(((this.dbcaCode == null)?"<null>":this.dbcaCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dbcaCode == null)? 0 :this.dbcaCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeBenefitOrDeduction100GetRequest) == false) {
            return false;
        }
        EmployeeBenefitOrDeduction100GetRequest rhs = ((EmployeeBenefitOrDeduction100GetRequest) other);
        return (((((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dbcaCode == rhs.dbcaCode)||((this.dbcaCode!= null)&&this.dbcaCode.equals(rhs.dbcaCode))));
    }

}
