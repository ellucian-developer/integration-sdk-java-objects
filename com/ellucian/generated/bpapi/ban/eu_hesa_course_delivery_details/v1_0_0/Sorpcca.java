
package com.ellucian.generated.bpapi.ban.eu_hesa_course_delivery_details.v1_0_0;

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
    "validFromDate",
    "ssdtCodeAccreditidSt",
    "userId",
    "validToDate",
    "ssdtCodeAccreditid"
})
@Generated("jsonschema2pojo")
public class Sorpcca {

    /**
     * Lineage reference object : SORPCCA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORPCCA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SORPCCA_VALID_FROM
     * (Required)
     * 
     */
    @JsonProperty("validFromDate")
    @JsonPropertyDescription("Lineage reference object : SORPCCA_VALID_FROM")
    private Date validFromDate;
    /**
     * Accreditation Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAccreditidSt")
    private String ssdtCodeAccreditidSt;
    /**
     * Lineage reference object : SORPCCA_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORPCCA_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SORPCCA_VALID_TO
     * 
     */
    @JsonProperty("validToDate")
    @JsonPropertyDescription("Lineage reference object : SORPCCA_VALID_TO")
    private Date validToDate;
    /**
     * Accreditation Identifier
     * <p>
     * Lineage reference object : SORPCCA_SSDT_CODE_ACCREDITID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeAccreditid")
    @JsonPropertyDescription("Lineage reference object : SORPCCA_SSDT_CODE_ACCREDITID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeAccreditid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORPCCA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORPCCA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorpcca withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SORPCCA_VALID_FROM
     * (Required)
     * 
     */
    @JsonProperty("validFromDate")
    public Date getValidFromDate() {
        return validFromDate;
    }

    /**
     * Lineage reference object : SORPCCA_VALID_FROM
     * (Required)
     * 
     */
    @JsonProperty("validFromDate")
    public void setValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    public Sorpcca withValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
        return this;
    }

    /**
     * Accreditation Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAccreditidSt")
    public String getSsdtCodeAccreditidSt() {
        return ssdtCodeAccreditidSt;
    }

    /**
     * Accreditation Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAccreditidSt")
    public void setSsdtCodeAccreditidSt(String ssdtCodeAccreditidSt) {
        this.ssdtCodeAccreditidSt = ssdtCodeAccreditidSt;
    }

    public Sorpcca withSsdtCodeAccreditidSt(String ssdtCodeAccreditidSt) {
        this.ssdtCodeAccreditidSt = ssdtCodeAccreditidSt;
        return this;
    }

    /**
     * Lineage reference object : SORPCCA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORPCCA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorpcca withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SORPCCA_VALID_TO
     * 
     */
    @JsonProperty("validToDate")
    public Date getValidToDate() {
        return validToDate;
    }

    /**
     * Lineage reference object : SORPCCA_VALID_TO
     * 
     */
    @JsonProperty("validToDate")
    public void setValidToDate(Date validToDate) {
        this.validToDate = validToDate;
    }

    public Sorpcca withValidToDate(Date validToDate) {
        this.validToDate = validToDate;
        return this;
    }

    /**
     * Accreditation Identifier
     * <p>
     * Lineage reference object : SORPCCA_SSDT_CODE_ACCREDITID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeAccreditid")
    public String getSsdtCodeAccreditid() {
        return ssdtCodeAccreditid;
    }

    /**
     * Accreditation Identifier
     * <p>
     * Lineage reference object : SORPCCA_SSDT_CODE_ACCREDITID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeAccreditid")
    public void setSsdtCodeAccreditid(String ssdtCodeAccreditid) {
        this.ssdtCodeAccreditid = ssdtCodeAccreditid;
    }

    public Sorpcca withSsdtCodeAccreditid(String ssdtCodeAccreditid) {
        this.ssdtCodeAccreditid = ssdtCodeAccreditid;
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

    public Sorpcca withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorpcca.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("validFromDate");
        sb.append('=');
        sb.append(((this.validFromDate == null)?"<null>":this.validFromDate));
        sb.append(',');
        sb.append("ssdtCodeAccreditidSt");
        sb.append('=');
        sb.append(((this.ssdtCodeAccreditidSt == null)?"<null>":this.ssdtCodeAccreditidSt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("validToDate");
        sb.append('=');
        sb.append(((this.validToDate == null)?"<null>":this.validToDate));
        sb.append(',');
        sb.append("ssdtCodeAccreditid");
        sb.append('=');
        sb.append(((this.ssdtCodeAccreditid == null)?"<null>":this.ssdtCodeAccreditid));
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
        result = ((result* 31)+((this.validFromDate == null)? 0 :this.validFromDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssdtCodeAccreditidSt == null)? 0 :this.ssdtCodeAccreditidSt.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.validToDate == null)? 0 :this.validToDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeAccreditid == null)? 0 :this.ssdtCodeAccreditid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorpcca) == false) {
            return false;
        }
        Sorpcca rhs = ((Sorpcca) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.validFromDate == rhs.validFromDate)||((this.validFromDate!= null)&&this.validFromDate.equals(rhs.validFromDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeAccreditidSt == rhs.ssdtCodeAccreditidSt)||((this.ssdtCodeAccreditidSt!= null)&&this.ssdtCodeAccreditidSt.equals(rhs.ssdtCodeAccreditidSt))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.validToDate == rhs.validToDate)||((this.validToDate!= null)&&this.validToDate.equals(rhs.validToDate))))&&((this.ssdtCodeAccreditid == rhs.ssdtCodeAccreditid)||((this.ssdtCodeAccreditid!= null)&&this.ssdtCodeAccreditid.equals(rhs.ssdtCodeAccreditid))));
    }

}
