
package com.ellucian.generated.bpapi.ban.admissions_application_sources_interests_comments.v1_0_0;

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
    "intsDesc",
    "intsCode"
})
@Generated("jsonschema2pojo")
public class Sorint {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORINTS_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORINTS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("intsDesc")
    private String intsDesc;
    /**
     * Interest
     * <p>
     * Lineage reference object : SORINTS_INTS_CODE, Lookup lineage reference object : stvints
     * (Required)
     * 
     */
    @JsonProperty("intsCode")
    @JsonPropertyDescription("Lineage reference object : SORINTS_INTS_CODE, Lookup lineage reference object : stvints")
    private String intsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORINTS_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORINTS_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorint withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("intsDesc")
    public String getIntsDesc() {
        return intsDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("intsDesc")
    public void setIntsDesc(String intsDesc) {
        this.intsDesc = intsDesc;
    }

    public Sorint withIntsDesc(String intsDesc) {
        this.intsDesc = intsDesc;
        return this;
    }

    /**
     * Interest
     * <p>
     * Lineage reference object : SORINTS_INTS_CODE, Lookup lineage reference object : stvints
     * (Required)
     * 
     */
    @JsonProperty("intsCode")
    public String getIntsCode() {
        return intsCode;
    }

    /**
     * Interest
     * <p>
     * Lineage reference object : SORINTS_INTS_CODE, Lookup lineage reference object : stvints
     * (Required)
     * 
     */
    @JsonProperty("intsCode")
    public void setIntsCode(String intsCode) {
        this.intsCode = intsCode;
    }

    public Sorint withIntsCode(String intsCode) {
        this.intsCode = intsCode;
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

    public Sorint withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("intsDesc");
        sb.append('=');
        sb.append(((this.intsDesc == null)?"<null>":this.intsDesc));
        sb.append(',');
        sb.append("intsCode");
        sb.append('=');
        sb.append(((this.intsCode == null)?"<null>":this.intsCode));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.intsDesc == null)? 0 :this.intsDesc.hashCode()));
        result = ((result* 31)+((this.intsCode == null)? 0 :this.intsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorint) == false) {
            return false;
        }
        Sorint rhs = ((Sorint) other);
        return (((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.intsDesc == rhs.intsDesc)||((this.intsDesc!= null)&&this.intsDesc.equals(rhs.intsDesc))))&&((this.intsCode == rhs.intsCode)||((this.intsCode!= null)&&this.intsCode.equals(rhs.intsCode))));
    }

}
