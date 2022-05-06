
package com.ellucian.generated.bpapi.ban.student_registration_group.v1_0_0;

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
    "dummy",
    "hourEnd",
    "beginDate",
    "endDate",
    "hourBegin",
    "priority"
})
@Generated("jsonschema2pojo")
public class Sfrwctl {

    @JsonProperty("dummy")
    private String dummy;
    /**
     * End Times
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_END
     * 
     */
    @JsonProperty("hourEnd")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_HOUR_END")
    private String hourEnd;
    /**
     * Begin Dates
     * <p>
     * Lineage reference object : SFRWCTL_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_BEGIN_DATE")
    private Date beginDate;
    /**
     * End Dates
     * <p>
     * Lineage reference object : SFRWCTL_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_END_DATE")
    private Date endDate;
    /**
     * Begin Times
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_BEGIN
     * 
     */
    @JsonProperty("hourBegin")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_HOUR_BEGIN")
    private String hourBegin;
    /**
     * Priority
     * <p>
     * Lineage reference object : SFRWCTL_PRIORITY
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_PRIORITY")
    private Double priority;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dummy")
    public String getDummy() {
        return dummy;
    }

    @JsonProperty("dummy")
    public void setDummy(String dummy) {
        this.dummy = dummy;
    }

    public Sfrwctl withDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }

    /**
     * End Times
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_END
     * 
     */
    @JsonProperty("hourEnd")
    public String getHourEnd() {
        return hourEnd;
    }

    /**
     * End Times
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_END
     * 
     */
    @JsonProperty("hourEnd")
    public void setHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
    }

    public Sfrwctl withHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
        return this;
    }

    /**
     * Begin Dates
     * <p>
     * Lineage reference object : SFRWCTL_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Dates
     * <p>
     * Lineage reference object : SFRWCTL_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Sfrwctl withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * End Dates
     * <p>
     * Lineage reference object : SFRWCTL_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Dates
     * <p>
     * Lineage reference object : SFRWCTL_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Sfrwctl withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Begin Times
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_BEGIN
     * 
     */
    @JsonProperty("hourBegin")
    public String getHourBegin() {
        return hourBegin;
    }

    /**
     * Begin Times
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_BEGIN
     * 
     */
    @JsonProperty("hourBegin")
    public void setHourBegin(String hourBegin) {
        this.hourBegin = hourBegin;
    }

    public Sfrwctl withHourBegin(String hourBegin) {
        this.hourBegin = hourBegin;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SFRWCTL_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public Double getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SFRWCTL_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public Sfrwctl withPriority(Double priority) {
        this.priority = priority;
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

    public Sfrwctl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfrwctl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dummy");
        sb.append('=');
        sb.append(((this.dummy == null)?"<null>":this.dummy));
        sb.append(',');
        sb.append("hourEnd");
        sb.append('=');
        sb.append(((this.hourEnd == null)?"<null>":this.hourEnd));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("hourBegin");
        sb.append('=');
        sb.append(((this.hourBegin == null)?"<null>":this.hourBegin));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
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
        result = ((result* 31)+((this.dummy == null)? 0 :this.dummy.hashCode()));
        result = ((result* 31)+((this.hourEnd == null)? 0 :this.hourEnd.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.hourBegin == null)? 0 :this.hourBegin.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfrwctl) == false) {
            return false;
        }
        Sfrwctl rhs = ((Sfrwctl) other);
        return ((((((((this.dummy == rhs.dummy)||((this.dummy!= null)&&this.dummy.equals(rhs.dummy)))&&((this.hourEnd == rhs.hourEnd)||((this.hourEnd!= null)&&this.hourEnd.equals(rhs.hourEnd))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.hourBegin == rhs.hourBegin)||((this.hourBegin!= null)&&this.hourBegin.equals(rhs.hourBegin))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))));
    }

}
