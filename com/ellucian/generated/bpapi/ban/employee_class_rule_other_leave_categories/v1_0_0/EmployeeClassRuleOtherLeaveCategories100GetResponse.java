
package com.ellucian.generated.bpapi.ban.employee_class_rule_other_leave_categories.v1_0_0;

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
    "activityDate",
    "lcatCode",
    "lcatDesc"
})
@Generated("jsonschema2pojo")
public class EmployeeClassRuleOtherLeaveCategories100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRECLC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRECLC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Leave Category
     * <p>
     * Lineage reference object : PTRECLC_LCAT_CODE, Lookup lineage reference object : ptvlcat
     * (Required)
     * 
     */
    @JsonProperty("lcatCode")
    @JsonPropertyDescription("Lineage reference object : PTRECLC_LCAT_CODE, Lookup lineage reference object : ptvlcat")
    private String lcatCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lcatDesc")
    private String lcatDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRECLC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRECLC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EmployeeClassRuleOtherLeaveCategories100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Leave Category
     * <p>
     * Lineage reference object : PTRECLC_LCAT_CODE, Lookup lineage reference object : ptvlcat
     * (Required)
     * 
     */
    @JsonProperty("lcatCode")
    public String getLcatCode() {
        return lcatCode;
    }

    /**
     * Leave Category
     * <p>
     * Lineage reference object : PTRECLC_LCAT_CODE, Lookup lineage reference object : ptvlcat
     * (Required)
     * 
     */
    @JsonProperty("lcatCode")
    public void setLcatCode(String lcatCode) {
        this.lcatCode = lcatCode;
    }

    public EmployeeClassRuleOtherLeaveCategories100GetResponse withLcatCode(String lcatCode) {
        this.lcatCode = lcatCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lcatDesc")
    public String getLcatDesc() {
        return lcatDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lcatDesc")
    public void setLcatDesc(String lcatDesc) {
        this.lcatDesc = lcatDesc;
    }

    public EmployeeClassRuleOtherLeaveCategories100GetResponse withLcatDesc(String lcatDesc) {
        this.lcatDesc = lcatDesc;
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

    public EmployeeClassRuleOtherLeaveCategories100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeClassRuleOtherLeaveCategories100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("lcatCode");
        sb.append('=');
        sb.append(((this.lcatCode == null)?"<null>":this.lcatCode));
        sb.append(',');
        sb.append("lcatDesc");
        sb.append('=');
        sb.append(((this.lcatDesc == null)?"<null>":this.lcatDesc));
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
        result = ((result* 31)+((this.lcatDesc == null)? 0 :this.lcatDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lcatCode == null)? 0 :this.lcatCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeClassRuleOtherLeaveCategories100GetResponse) == false) {
            return false;
        }
        EmployeeClassRuleOtherLeaveCategories100GetResponse rhs = ((EmployeeClassRuleOtherLeaveCategories100GetResponse) other);
        return (((((this.lcatDesc == rhs.lcatDesc)||((this.lcatDesc!= null)&&this.lcatDesc.equals(rhs.lcatDesc)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lcatCode == rhs.lcatCode)||((this.lcatCode!= null)&&this.lcatCode.equals(rhs.lcatCode))));
    }

}
