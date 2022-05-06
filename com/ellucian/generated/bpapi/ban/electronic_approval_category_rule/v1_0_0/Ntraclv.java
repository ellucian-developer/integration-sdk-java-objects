
package com.ellucian.generated.bpapi.ban.electronic_approval_category_rule.v1_0_0;

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
    "level",
    "actionInd",
    "userId",
    "alvlCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class Ntraclv {

    /**
     * Lineage reference object : NTRACLV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NTRACLV_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Level
     * <p>
     * 
     * 
     */
    @JsonProperty("level")
    private Double level;
    /**
     * Required Action
     * <p>
     * Lineage reference object : NTRACLV_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("actionInd")
    @JsonPropertyDescription("Lineage reference object : NTRACLV_ACTION_IND")
    private String actionInd;
    /**
     * Lineage reference object : NTRACLV_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NTRACLV_USER_ID")
    private String userId;
    /**
     * Level Code
     * <p>
     * Lineage reference object : NTRACLV_ALVL_CODE, Lookup lineage reference object : ntralvl
     * (Required)
     * 
     */
    @JsonProperty("alvlCode")
    @JsonPropertyDescription("Lineage reference object : NTRACLV_ALVL_CODE, Lookup lineage reference object : ntralvl")
    private String alvlCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("desc")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : NTRACLV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : NTRACLV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ntraclv withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Level
     * <p>
     * 
     * 
     */
    @JsonProperty("level")
    public Double getLevel() {
        return level;
    }

    /**
     * Level
     * <p>
     * 
     * 
     */
    @JsonProperty("level")
    public void setLevel(Double level) {
        this.level = level;
    }

    public Ntraclv withLevel(Double level) {
        this.level = level;
        return this;
    }

    /**
     * Required Action
     * <p>
     * Lineage reference object : NTRACLV_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("actionInd")
    public String getActionInd() {
        return actionInd;
    }

    /**
     * Required Action
     * <p>
     * Lineage reference object : NTRACLV_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("actionInd")
    public void setActionInd(String actionInd) {
        this.actionInd = actionInd;
    }

    public Ntraclv withActionInd(String actionInd) {
        this.actionInd = actionInd;
        return this;
    }

    /**
     * Lineage reference object : NTRACLV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : NTRACLV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Ntraclv withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Level Code
     * <p>
     * Lineage reference object : NTRACLV_ALVL_CODE, Lookup lineage reference object : ntralvl
     * (Required)
     * 
     */
    @JsonProperty("alvlCode")
    public String getAlvlCode() {
        return alvlCode;
    }

    /**
     * Level Code
     * <p>
     * Lineage reference object : NTRACLV_ALVL_CODE, Lookup lineage reference object : ntralvl
     * (Required)
     * 
     */
    @JsonProperty("alvlCode")
    public void setAlvlCode(String alvlCode) {
        this.alvlCode = alvlCode;
    }

    public Ntraclv withAlvlCode(String alvlCode) {
        this.alvlCode = alvlCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Ntraclv withDesc(String desc) {
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

    public Ntraclv withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ntraclv.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("actionInd");
        sb.append('=');
        sb.append(((this.actionInd == null)?"<null>":this.actionInd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("alvlCode");
        sb.append('=');
        sb.append(((this.alvlCode == null)?"<null>":this.alvlCode));
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
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.actionInd == null)? 0 :this.actionInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.alvlCode == null)? 0 :this.alvlCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ntraclv) == false) {
            return false;
        }
        Ntraclv rhs = ((Ntraclv) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.actionInd == rhs.actionInd)||((this.actionInd!= null)&&this.actionInd.equals(rhs.actionInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.alvlCode == rhs.alvlCode)||((this.alvlCode!= null)&&this.alvlCode.equals(rhs.alvlCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
