
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
    "ecls",
    "ptreclcLcatCode",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class EmployeeClassRuleOtherLeaveCategories100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ecls")
    private String ecls;
    @JsonProperty("ptreclcLcatCode")
    private String ptreclcLcatCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRECLC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRECLC_ACTIVITY_DATE")
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

    public EmployeeClassRuleOtherLeaveCategories100QapiPost withEcls(String ecls) {
        this.ecls = ecls;
        return this;
    }

    @JsonProperty("ptreclcLcatCode")
    public String getPtreclcLcatCode() {
        return ptreclcLcatCode;
    }

    @JsonProperty("ptreclcLcatCode")
    public void setPtreclcLcatCode(String ptreclcLcatCode) {
        this.ptreclcLcatCode = ptreclcLcatCode;
    }

    public EmployeeClassRuleOtherLeaveCategories100QapiPost withPtreclcLcatCode(String ptreclcLcatCode) {
        this.ptreclcLcatCode = ptreclcLcatCode;
        return this;
    }

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

    public EmployeeClassRuleOtherLeaveCategories100QapiPost withActivityDate(Date activityDate) {
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

    public EmployeeClassRuleOtherLeaveCategories100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeClassRuleOtherLeaveCategories100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ecls");
        sb.append('=');
        sb.append(((this.ecls == null)?"<null>":this.ecls));
        sb.append(',');
        sb.append("ptreclcLcatCode");
        sb.append('=');
        sb.append(((this.ptreclcLcatCode == null)?"<null>":this.ptreclcLcatCode));
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
        result = ((result* 31)+((this.ptreclcLcatCode == null)? 0 :this.ptreclcLcatCode.hashCode()));
        result = ((result* 31)+((this.ecls == null)? 0 :this.ecls.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeClassRuleOtherLeaveCategories100QapiPost) == false) {
            return false;
        }
        EmployeeClassRuleOtherLeaveCategories100QapiPost rhs = ((EmployeeClassRuleOtherLeaveCategories100QapiPost) other);
        return (((((this.ptreclcLcatCode == rhs.ptreclcLcatCode)||((this.ptreclcLcatCode!= null)&&this.ptreclcLcatCode.equals(rhs.ptreclcLcatCode)))&&((this.ecls == rhs.ecls)||((this.ecls!= null)&&this.ecls.equals(rhs.ecls))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
