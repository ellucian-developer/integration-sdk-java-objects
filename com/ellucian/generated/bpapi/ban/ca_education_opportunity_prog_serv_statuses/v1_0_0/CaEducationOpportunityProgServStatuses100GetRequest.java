
package com.ellucian.generated.bpapi.ban.ca_education_opportunity_prog_serv_statuses.v1_0_0;

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
    "careCodeInd",
    "code",
    "activityDate",
    "desc"
})
@Generated("jsonschema2pojo")
public class CaEducationOpportunityProgServStatuses100GetRequest {

    /**
     * Lineage reference object : STVEOPS_CARE_CODE_IND
     * 
     */
    @JsonProperty("careCodeInd")
    @JsonPropertyDescription("Lineage reference object : STVEOPS_CARE_CODE_IND")
    private String careCodeInd;
    /**
     * Code
     * <p>
     * Lineage reference object : STVEOPS_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVEOPS_CODE")
    private String code;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVEOPS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVEOPS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Description
     * <p>
     * Lineage reference object : STVEOPS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVEOPS_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : STVEOPS_CARE_CODE_IND
     * 
     */
    @JsonProperty("careCodeInd")
    public String getCareCodeInd() {
        return careCodeInd;
    }

    /**
     * Lineage reference object : STVEOPS_CARE_CODE_IND
     * 
     */
    @JsonProperty("careCodeInd")
    public void setCareCodeInd(String careCodeInd) {
        this.careCodeInd = careCodeInd;
    }

    public CaEducationOpportunityProgServStatuses100GetRequest withCareCodeInd(String careCodeInd) {
        this.careCodeInd = careCodeInd;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVEOPS_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVEOPS_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaEducationOpportunityProgServStatuses100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVEOPS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVEOPS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaEducationOpportunityProgServStatuses100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVEOPS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVEOPS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaEducationOpportunityProgServStatuses100GetRequest withDesc(String desc) {
        this.desc = desc;
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

    public CaEducationOpportunityProgServStatuses100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaEducationOpportunityProgServStatuses100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("careCodeInd");
        sb.append('=');
        sb.append(((this.careCodeInd == null)?"<null>":this.careCodeInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.careCodeInd == null)? 0 :this.careCodeInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaEducationOpportunityProgServStatuses100GetRequest) == false) {
            return false;
        }
        CaEducationOpportunityProgServStatuses100GetRequest rhs = ((CaEducationOpportunityProgServStatuses100GetRequest) other);
        return ((((((this.careCodeInd == rhs.careCodeInd)||((this.careCodeInd!= null)&&this.careCodeInd.equals(rhs.careCodeInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
