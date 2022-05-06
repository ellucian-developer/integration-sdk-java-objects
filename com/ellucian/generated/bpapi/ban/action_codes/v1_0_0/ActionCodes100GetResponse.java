
package com.ellucian.generated.bpapi.ban.action_codes.v1_0_0;

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
    "countInd",
    "actionInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class ActionCodes100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVACTN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVACTN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVACTN_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVACTN_CODE")
    private String code;
    /**
     * Lineage reference object : STVACTN_COUNT_IND
     * 
     */
    @JsonProperty("countInd")
    @JsonPropertyDescription("Lineage reference object : STVACTN_COUNT_IND")
    private String countInd;
    /**
     * Action Indicator
     * <p>
     * Lineage reference object : STVACTN_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("actionInd")
    @JsonPropertyDescription("Lineage reference object : STVACTN_ACTION_IND")
    private String actionInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVACTN_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVACTN_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVACTN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVACTN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ActionCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVACTN_CODE
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
     * Lineage reference object : STVACTN_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ActionCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVACTN_COUNT_IND
     * 
     */
    @JsonProperty("countInd")
    public String getCountInd() {
        return countInd;
    }

    /**
     * Lineage reference object : STVACTN_COUNT_IND
     * 
     */
    @JsonProperty("countInd")
    public void setCountInd(String countInd) {
        this.countInd = countInd;
    }

    public ActionCodes100GetResponse withCountInd(String countInd) {
        this.countInd = countInd;
        return this;
    }

    /**
     * Action Indicator
     * <p>
     * Lineage reference object : STVACTN_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("actionInd")
    public String getActionInd() {
        return actionInd;
    }

    /**
     * Action Indicator
     * <p>
     * Lineage reference object : STVACTN_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("actionInd")
    public void setActionInd(String actionInd) {
        this.actionInd = actionInd;
    }

    public ActionCodes100GetResponse withActionInd(String actionInd) {
        this.actionInd = actionInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVACTN_DESC
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
     * Lineage reference object : STVACTN_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ActionCodes100GetResponse withDesc(String desc) {
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

    public ActionCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ActionCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("countInd");
        sb.append('=');
        sb.append(((this.countInd == null)?"<null>":this.countInd));
        sb.append(',');
        sb.append("actionInd");
        sb.append('=');
        sb.append(((this.actionInd == null)?"<null>":this.actionInd));
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
        result = ((result* 31)+((this.countInd == null)? 0 :this.countInd.hashCode()));
        result = ((result* 31)+((this.actionInd == null)? 0 :this.actionInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActionCodes100GetResponse) == false) {
            return false;
        }
        ActionCodes100GetResponse rhs = ((ActionCodes100GetResponse) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.countInd == rhs.countInd)||((this.countInd!= null)&&this.countInd.equals(rhs.countInd))))&&((this.actionInd == rhs.actionInd)||((this.actionInd!= null)&&this.actionInd.equals(rhs.actionInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
