
package com.ellucian.generated.bpapi.ban.application_verification_steps.v1_0_0;

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
    "applInd",
    "code",
    "activeInd",
    "persInd",
    "loadInd",
    "priority",
    "desc"
})
@Generated("jsonschema2pojo")
public class ApplicationVerificationSteps100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVASTA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVASTA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : STVASTA_APPL_IND
     * 
     */
    @JsonProperty("applInd")
    @JsonPropertyDescription("Lineage reference object : STVASTA_APPL_IND")
    private String applInd;
    /**
     * Code
     * <p>
     * Lineage reference object : STVASTA_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVASTA_CODE")
    private String code;
    /**
     * Lineage reference object : STVASTA_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : STVASTA_ACTIVE_IND")
    private String activeInd;
    /**
     * Lineage reference object : STVASTA_PERS_IND
     * 
     */
    @JsonProperty("persInd")
    @JsonPropertyDescription("Lineage reference object : STVASTA_PERS_IND")
    private String persInd;
    /**
     * Lineage reference object : STVASTA_LOAD_IND
     * 
     */
    @JsonProperty("loadInd")
    @JsonPropertyDescription("Lineage reference object : STVASTA_LOAD_IND")
    private String loadInd;
    /**
     * Priority
     * <p>
     * Lineage reference object : STVASTA_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : STVASTA_PRIORITY")
    private Double priority;
    /**
     * Description
     * <p>
     * Lineage reference object : STVASTA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVASTA_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVASTA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVASTA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ApplicationVerificationSteps100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : STVASTA_APPL_IND
     * 
     */
    @JsonProperty("applInd")
    public String getApplInd() {
        return applInd;
    }

    /**
     * Lineage reference object : STVASTA_APPL_IND
     * 
     */
    @JsonProperty("applInd")
    public void setApplInd(String applInd) {
        this.applInd = applInd;
    }

    public ApplicationVerificationSteps100GetResponse withApplInd(String applInd) {
        this.applInd = applInd;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVASTA_CODE
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
     * Lineage reference object : STVASTA_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ApplicationVerificationSteps100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVASTA_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : STVASTA_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public ApplicationVerificationSteps100GetResponse withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Lineage reference object : STVASTA_PERS_IND
     * 
     */
    @JsonProperty("persInd")
    public String getPersInd() {
        return persInd;
    }

    /**
     * Lineage reference object : STVASTA_PERS_IND
     * 
     */
    @JsonProperty("persInd")
    public void setPersInd(String persInd) {
        this.persInd = persInd;
    }

    public ApplicationVerificationSteps100GetResponse withPersInd(String persInd) {
        this.persInd = persInd;
        return this;
    }

    /**
     * Lineage reference object : STVASTA_LOAD_IND
     * 
     */
    @JsonProperty("loadInd")
    public String getLoadInd() {
        return loadInd;
    }

    /**
     * Lineage reference object : STVASTA_LOAD_IND
     * 
     */
    @JsonProperty("loadInd")
    public void setLoadInd(String loadInd) {
        this.loadInd = loadInd;
    }

    public ApplicationVerificationSteps100GetResponse withLoadInd(String loadInd) {
        this.loadInd = loadInd;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : STVASTA_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public Double getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : STVASTA_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public ApplicationVerificationSteps100GetResponse withPriority(Double priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVASTA_DESC
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
     * Lineage reference object : STVASTA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ApplicationVerificationSteps100GetResponse withDesc(String desc) {
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

    public ApplicationVerificationSteps100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationVerificationSteps100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("applInd");
        sb.append('=');
        sb.append(((this.applInd == null)?"<null>":this.applInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("persInd");
        sb.append('=');
        sb.append(((this.persInd == null)?"<null>":this.persInd));
        sb.append(',');
        sb.append("loadInd");
        sb.append('=');
        sb.append(((this.loadInd == null)?"<null>":this.loadInd));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
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
        result = ((result* 31)+((this.applInd == null)? 0 :this.applInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.persInd == null)? 0 :this.persInd.hashCode()));
        result = ((result* 31)+((this.loadInd == null)? 0 :this.loadInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationVerificationSteps100GetResponse) == false) {
            return false;
        }
        ApplicationVerificationSteps100GetResponse rhs = ((ApplicationVerificationSteps100GetResponse) other);
        return ((((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.applInd == rhs.applInd)||((this.applInd!= null)&&this.applInd.equals(rhs.applInd))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.persInd == rhs.persInd)||((this.persInd!= null)&&this.persInd.equals(rhs.persInd))))&&((this.loadInd == rhs.loadInd)||((this.loadInd!= null)&&this.loadInd.equals(rhs.loadInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
