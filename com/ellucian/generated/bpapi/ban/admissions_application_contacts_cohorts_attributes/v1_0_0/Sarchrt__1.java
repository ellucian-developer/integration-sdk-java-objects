
package com.ellucian.generated.bpapi.ban.admissions_application_contacts_cohorts_attributes.v1_0_0;

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
    "chrtCode",
    "chrtDesc"
})
@Generated("jsonschema2pojo")
public class Sarchrt__1 {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARCHRT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SARCHRT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Cohort
     * <p>
     * Lineage reference object : SARCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt
     * (Required)
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : SARCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("chrtDesc")
    private String chrtDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARCHRT_ACTIVITY_DATE
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
     * Lineage reference object : SARCHRT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sarchrt__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SARCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt
     * (Required)
     * 
     */
    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SARCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt
     * (Required)
     * 
     */
    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public Sarchrt__1 withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("chrtDesc")
    public String getChrtDesc() {
        return chrtDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("chrtDesc")
    public void setChrtDesc(String chrtDesc) {
        this.chrtDesc = chrtDesc;
    }

    public Sarchrt__1 withChrtDesc(String chrtDesc) {
        this.chrtDesc = chrtDesc;
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

    public Sarchrt__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sarchrt__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("chrtDesc");
        sb.append('=');
        sb.append(((this.chrtDesc == null)?"<null>":this.chrtDesc));
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
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.chrtDesc == null)? 0 :this.chrtDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sarchrt__1) == false) {
            return false;
        }
        Sarchrt__1 rhs = ((Sarchrt__1) other);
        return (((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.chrtDesc == rhs.chrtDesc)||((this.chrtDesc!= null)&&this.chrtDesc.equals(rhs.chrtDesc))));
    }

}
