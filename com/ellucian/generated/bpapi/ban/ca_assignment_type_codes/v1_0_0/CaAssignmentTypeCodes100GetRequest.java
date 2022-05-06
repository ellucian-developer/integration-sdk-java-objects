
package com.ellucian.generated.bpapi.ban.ca_assignment_type_codes.v1_0_0;

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
    "code",
    "activityDate",
    "loadActiveInd",
    "nonTeachingInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class CaAssignmentTypeCodes100GetRequest {

    /**
     * Code
     * <p>
     * Lineage reference object : STVASTY_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVASTY_CODE")
    private String code;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVASTY_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVASTY_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : STVASTY_LOAD_ACTIVE_IND
     * 
     */
    @JsonProperty("loadActiveInd")
    @JsonPropertyDescription("Lineage reference object : STVASTY_LOAD_ACTIVE_IND")
    private String loadActiveInd;
    /**
     * Lineage reference object : STVASTY_NON_TEACHING_IND
     * 
     */
    @JsonProperty("nonTeachingInd")
    @JsonPropertyDescription("Lineage reference object : STVASTY_NON_TEACHING_IND")
    private String nonTeachingInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVASTY_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVASTY_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : STVASTY_CODE
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
     * Lineage reference object : STVASTY_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaAssignmentTypeCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVASTY_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVASTY_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaAssignmentTypeCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : STVASTY_LOAD_ACTIVE_IND
     * 
     */
    @JsonProperty("loadActiveInd")
    public String getLoadActiveInd() {
        return loadActiveInd;
    }

    /**
     * Lineage reference object : STVASTY_LOAD_ACTIVE_IND
     * 
     */
    @JsonProperty("loadActiveInd")
    public void setLoadActiveInd(String loadActiveInd) {
        this.loadActiveInd = loadActiveInd;
    }

    public CaAssignmentTypeCodes100GetRequest withLoadActiveInd(String loadActiveInd) {
        this.loadActiveInd = loadActiveInd;
        return this;
    }

    /**
     * Lineage reference object : STVASTY_NON_TEACHING_IND
     * 
     */
    @JsonProperty("nonTeachingInd")
    public String getNonTeachingInd() {
        return nonTeachingInd;
    }

    /**
     * Lineage reference object : STVASTY_NON_TEACHING_IND
     * 
     */
    @JsonProperty("nonTeachingInd")
    public void setNonTeachingInd(String nonTeachingInd) {
        this.nonTeachingInd = nonTeachingInd;
    }

    public CaAssignmentTypeCodes100GetRequest withNonTeachingInd(String nonTeachingInd) {
        this.nonTeachingInd = nonTeachingInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVASTY_DESC
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
     * Lineage reference object : STVASTY_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaAssignmentTypeCodes100GetRequest withDesc(String desc) {
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

    public CaAssignmentTypeCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaAssignmentTypeCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("loadActiveInd");
        sb.append('=');
        sb.append(((this.loadActiveInd == null)?"<null>":this.loadActiveInd));
        sb.append(',');
        sb.append("nonTeachingInd");
        sb.append('=');
        sb.append(((this.nonTeachingInd == null)?"<null>":this.nonTeachingInd));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.loadActiveInd == null)? 0 :this.loadActiveInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nonTeachingInd == null)? 0 :this.nonTeachingInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaAssignmentTypeCodes100GetRequest) == false) {
            return false;
        }
        CaAssignmentTypeCodes100GetRequest rhs = ((CaAssignmentTypeCodes100GetRequest) other);
        return (((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.loadActiveInd == rhs.loadActiveInd)||((this.loadActiveInd!= null)&&this.loadActiveInd.equals(rhs.loadActiveInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nonTeachingInd == rhs.nonTeachingInd)||((this.nonTeachingInd!= null)&&this.nonTeachingInd.equals(rhs.nonTeachingInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
