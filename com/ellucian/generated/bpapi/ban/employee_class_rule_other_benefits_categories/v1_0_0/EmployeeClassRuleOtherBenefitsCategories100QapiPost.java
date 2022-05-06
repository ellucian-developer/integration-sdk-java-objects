
package com.ellucian.generated.bpapi.ban.employee_class_rule_other_benefits_categories.v1_0_0;

import java.util.Date;
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
    "ecls",
    "bcatCode",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class EmployeeClassRuleOtherBenefitsCategories100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ecls")
    private String ecls;
    /**
     * Benefit Category
     * <p>
     * Lineage reference object : PTRECBC_BCAT_CODE, Lookup lineage reference object : ptrbcat
     * 
     */
    @JsonProperty("bcatCode")
    @JsonPropertyDescription("Lineage reference object : PTRECBC_BCAT_CODE, Lookup lineage reference object : ptrbcat")
    private String bcatCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRECBC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRECBC_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ecls")
    public String getEcls() {
        return ecls;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ecls")
    public void setEcls(String ecls) {
        this.ecls = ecls;
    }

    public EmployeeClassRuleOtherBenefitsCategories100QapiPost withEcls(String ecls) {
        this.ecls = ecls;
        return this;
    }

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : PTRECBC_BCAT_CODE, Lookup lineage reference object : ptrbcat
     * 
     */
    @JsonProperty("bcatCode")
    public String getBcatCode() {
        return bcatCode;
    }

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : PTRECBC_BCAT_CODE, Lookup lineage reference object : ptrbcat
     * 
     */
    @JsonProperty("bcatCode")
    public void setBcatCode(String bcatCode) {
        this.bcatCode = bcatCode;
    }

    public EmployeeClassRuleOtherBenefitsCategories100QapiPost withBcatCode(String bcatCode) {
        this.bcatCode = bcatCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRECBC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRECBC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EmployeeClassRuleOtherBenefitsCategories100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public EmployeeClassRuleOtherBenefitsCategories100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeClassRuleOtherBenefitsCategories100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ecls");
        sb.append('=');
        sb.append(((this.ecls == null)?"<null>":this.ecls));
        sb.append(',');
        sb.append("bcatCode");
        sb.append('=');
        sb.append(((this.bcatCode == null)?"<null>":this.bcatCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.ecls == null)? 0 :this.ecls.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bcatCode == null)? 0 :this.bcatCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeClassRuleOtherBenefitsCategories100QapiPost) == false) {
            return false;
        }
        EmployeeClassRuleOtherBenefitsCategories100QapiPost rhs = ((EmployeeClassRuleOtherBenefitsCategories100QapiPost) other);
        return (((((this.ecls == rhs.ecls)||((this.ecls!= null)&&this.ecls.equals(rhs.ecls)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bcatCode == rhs.bcatCode)||((this.bcatCode!= null)&&this.bcatCode.equals(rhs.bcatCode))));
    }

}
