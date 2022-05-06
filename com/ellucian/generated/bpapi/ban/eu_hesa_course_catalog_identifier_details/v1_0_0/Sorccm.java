
package com.ellucian.generated.bpapi.ban.eu_hesa_course_catalog_identifier_details.v1_0_0;

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
    "ssdtCodeModSubSt",
    "ssdtCodeModSub",
    "modProportion",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sorccm {

    /**
     * Lineage reference object : SORCCMS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORCCMS_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("ssdtCodeModSubSt")
    private String ssdtCodeModSubSt;
    /**
     * Lineage reference object : SORCCMS_SSDT_CODE_MOD_SUB, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeModSub")
    @JsonPropertyDescription("Lineage reference object : SORCCMS_SSDT_CODE_MOD_SUB, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeModSub;
    /**
     * Lineage reference object : SORCCMS_MOD_PROPORTION
     * 
     */
    @JsonProperty("modProportion")
    @JsonPropertyDescription("Lineage reference object : SORCCMS_MOD_PROPORTION")
    private Double modProportion;
    /**
     * Lineage reference object : SORCCMS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORCCMS_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORCCMS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORCCMS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorccm withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("ssdtCodeModSubSt")
    public String getSsdtCodeModSubSt() {
        return ssdtCodeModSubSt;
    }

    @JsonProperty("ssdtCodeModSubSt")
    public void setSsdtCodeModSubSt(String ssdtCodeModSubSt) {
        this.ssdtCodeModSubSt = ssdtCodeModSubSt;
    }

    public Sorccm withSsdtCodeModSubSt(String ssdtCodeModSubSt) {
        this.ssdtCodeModSubSt = ssdtCodeModSubSt;
        return this;
    }

    /**
     * Lineage reference object : SORCCMS_SSDT_CODE_MOD_SUB, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeModSub")
    public String getSsdtCodeModSub() {
        return ssdtCodeModSub;
    }

    /**
     * Lineage reference object : SORCCMS_SSDT_CODE_MOD_SUB, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeModSub")
    public void setSsdtCodeModSub(String ssdtCodeModSub) {
        this.ssdtCodeModSub = ssdtCodeModSub;
    }

    public Sorccm withSsdtCodeModSub(String ssdtCodeModSub) {
        this.ssdtCodeModSub = ssdtCodeModSub;
        return this;
    }

    /**
     * Lineage reference object : SORCCMS_MOD_PROPORTION
     * 
     */
    @JsonProperty("modProportion")
    public Double getModProportion() {
        return modProportion;
    }

    /**
     * Lineage reference object : SORCCMS_MOD_PROPORTION
     * 
     */
    @JsonProperty("modProportion")
    public void setModProportion(Double modProportion) {
        this.modProportion = modProportion;
    }

    public Sorccm withModProportion(Double modProportion) {
        this.modProportion = modProportion;
        return this;
    }

    /**
     * Lineage reference object : SORCCMS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORCCMS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorccm withUserId(String userId) {
        this.userId = userId;
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

    public Sorccm withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorccm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeModSubSt");
        sb.append('=');
        sb.append(((this.ssdtCodeModSubSt == null)?"<null>":this.ssdtCodeModSubSt));
        sb.append(',');
        sb.append("ssdtCodeModSub");
        sb.append('=');
        sb.append(((this.ssdtCodeModSub == null)?"<null>":this.ssdtCodeModSub));
        sb.append(',');
        sb.append("modProportion");
        sb.append('=');
        sb.append(((this.modProportion == null)?"<null>":this.modProportion));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.ssdtCodeModSubSt == null)? 0 :this.ssdtCodeModSubSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeModSub == null)? 0 :this.ssdtCodeModSub.hashCode()));
        result = ((result* 31)+((this.modProportion == null)? 0 :this.modProportion.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorccm) == false) {
            return false;
        }
        Sorccm rhs = ((Sorccm) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.ssdtCodeModSubSt == rhs.ssdtCodeModSubSt)||((this.ssdtCodeModSubSt!= null)&&this.ssdtCodeModSubSt.equals(rhs.ssdtCodeModSubSt))))&&((this.ssdtCodeModSub == rhs.ssdtCodeModSub)||((this.ssdtCodeModSub!= null)&&this.ssdtCodeModSub.equals(rhs.ssdtCodeModSub))))&&((this.modProportion == rhs.modProportion)||((this.modProportion!= null)&&this.modProportion.equals(rhs.modProportion))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
