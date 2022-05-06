
package com.ellucian.generated.bpapi.ban.employee_benefit_or_deduction.v1_0_0;

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
    "dbca_code",
    "queryDate"
})
@Generated("jsonschema2pojo")
public class EmployeeBenefitOrDeduction100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dbca_code")
    private String dbcaCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    private String queryDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeBenefitOrDeduction100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dbca_code")
    public String getDbcaCode() {
        return dbcaCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dbca_code")
    public void setDbcaCode(String dbcaCode) {
        this.dbcaCode = dbcaCode;
    }

    public EmployeeBenefitOrDeduction100QapiPost withDbcaCode(String dbcaCode) {
        this.dbcaCode = dbcaCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public String getQueryDate() {
        return queryDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate;
    }

    public EmployeeBenefitOrDeduction100QapiPost withQueryDate(String queryDate) {
        this.queryDate = queryDate;
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

    public EmployeeBenefitOrDeduction100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeBenefitOrDeduction100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("dbcaCode");
        sb.append('=');
        sb.append(((this.dbcaCode == null)?"<null>":this.dbcaCode));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
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
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dbcaCode == null)? 0 :this.dbcaCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeBenefitOrDeduction100QapiPost) == false) {
            return false;
        }
        EmployeeBenefitOrDeduction100QapiPost rhs = ((EmployeeBenefitOrDeduction100QapiPost) other);
        return (((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dbcaCode == rhs.dbcaCode)||((this.dbcaCode!= null)&&this.dbcaCode.equals(rhs.dbcaCode))));
    }

}
