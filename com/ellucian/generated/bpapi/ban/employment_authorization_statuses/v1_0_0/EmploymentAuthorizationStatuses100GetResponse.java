
package com.ellucian.generated.bpapi.ban.employment_authorization_statuses.v1_0_0;

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
    "code",
    "activeInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class EmploymentAuthorizationStatuses100GetResponse {

    /**
     * Date
     * <p>
     * Lineage reference object : RTVAUST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RTVAUST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Status
     * <p>
     * Lineage reference object : RTVAUST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVAUST_CODE")
    private String code;
    /**
     * Active Indicator
     * <p>
     * Lineage reference object : RTVAUST_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : RTVAUST_ACTIVE_IND")
    private String activeInd;
    /**
     * Description
     * <p>
     * Lineage reference object : RTVAUST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVAUST_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Date
     * <p>
     * Lineage reference object : RTVAUST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : RTVAUST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EmploymentAuthorizationStatuses100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RTVAUST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RTVAUST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public EmploymentAuthorizationStatuses100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Active Indicator
     * <p>
     * Lineage reference object : RTVAUST_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Active Indicator
     * <p>
     * Lineage reference object : RTVAUST_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public EmploymentAuthorizationStatuses100GetResponse withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVAUST_DESC
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
     * Lineage reference object : RTVAUST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EmploymentAuthorizationStatuses100GetResponse withDesc(String desc) {
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

    public EmploymentAuthorizationStatuses100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmploymentAuthorizationStatuses100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmploymentAuthorizationStatuses100GetResponse) == false) {
            return false;
        }
        EmploymentAuthorizationStatuses100GetResponse rhs = ((EmploymentAuthorizationStatuses100GetResponse) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}