
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
    "ssdtCodeInitiativeid",
    "ssdtCodeInitiativeidSt",
    "userId",
    "validToDate"
})
@Generated("jsonschema2pojo")
public class Sorpcdi {

    /**
     * Lineage reference object : SORPCDI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORPCDI_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SORPCDI_VALID_FROM
     * (Required)
     * 
     */
    @JsonProperty("validFromDate")
    @JsonPropertyDescription("Lineage reference object : SORPCDI_VALID_FROM")
    private Date validFromDate;
    /**
     * Initiative Identifier
     * <p>
     * Lineage reference object : SORPCDI_SSDT_CODE_INITIATIVEID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeInitiativeid")
    @JsonPropertyDescription("Lineage reference object : SORPCDI_SSDT_CODE_INITIATIVEID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeInitiativeid;
    /**
     * Initiative Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeInitiativeidSt")
    private String ssdtCodeInitiativeidSt;
    /**
     * Lineage reference object : SORPCDI_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORPCDI_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SORPCDI_VALID_TO
     * 
     */
    @JsonProperty("validToDate")
    @JsonPropertyDescription("Lineage reference object : SORPCDI_VALID_TO")
    private Date validToDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORPCDI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORPCDI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorpcdi withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SORPCDI_VALID_FROM
     * (Required)
     * 
     */
    @JsonProperty("validFromDate")
    public Date getValidFromDate() {
        return validFromDate;
    }

    /**
     * Lineage reference object : SORPCDI_VALID_FROM
     * (Required)
     * 
     */
    @JsonProperty("validFromDate")
    public void setValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    public Sorpcdi withValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
        return this;
    }

    /**
     * Initiative Identifier
     * <p>
     * Lineage reference object : SORPCDI_SSDT_CODE_INITIATIVEID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeInitiativeid")
    public String getSsdtCodeInitiativeid() {
        return ssdtCodeInitiativeid;
    }

    /**
     * Initiative Identifier
     * <p>
     * Lineage reference object : SORPCDI_SSDT_CODE_INITIATIVEID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeInitiativeid")
    public void setSsdtCodeInitiativeid(String ssdtCodeInitiativeid) {
        this.ssdtCodeInitiativeid = ssdtCodeInitiativeid;
    }

    public Sorpcdi withSsdtCodeInitiativeid(String ssdtCodeInitiativeid) {
        this.ssdtCodeInitiativeid = ssdtCodeInitiativeid;
        return this;
    }

    /**
     * Initiative Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeInitiativeidSt")
    public String getSsdtCodeInitiativeidSt() {
        return ssdtCodeInitiativeidSt;
    }

    /**
     * Initiative Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeInitiativeidSt")
    public void setSsdtCodeInitiativeidSt(String ssdtCodeInitiativeidSt) {
        this.ssdtCodeInitiativeidSt = ssdtCodeInitiativeidSt;
    }

    public Sorpcdi withSsdtCodeInitiativeidSt(String ssdtCodeInitiativeidSt) {
        this.ssdtCodeInitiativeidSt = ssdtCodeInitiativeidSt;
        return this;
    }

    /**
     * Lineage reference object : SORPCDI_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORPCDI_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorpcdi withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SORPCDI_VALID_TO
     * 
     */
    @JsonProperty("validToDate")
    public Date getValidToDate() {
        return validToDate;
    }

    /**
     * Lineage reference object : SORPCDI_VALID_TO
     * 
     */
    @JsonProperty("validToDate")
    public void setValidToDate(Date validToDate) {
        this.validToDate = validToDate;
    }

    public Sorpcdi withValidToDate(Date validToDate) {
        this.validToDate = validToDate;
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

    public Sorpcdi withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorpcdi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("validFromDate");
        sb.append('=');
        sb.append(((this.validFromDate == null)?"<null>":this.validFromDate));
        sb.append(',');
        sb.append("ssdtCodeInitiativeid");
        sb.append('=');
        sb.append(((this.ssdtCodeInitiativeid == null)?"<null>":this.ssdtCodeInitiativeid));
        sb.append(',');
        sb.append("ssdtCodeInitiativeidSt");
        sb.append('=');
        sb.append(((this.ssdtCodeInitiativeidSt == null)?"<null>":this.ssdtCodeInitiativeidSt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("validToDate");
        sb.append('=');
        sb.append(((this.validToDate == null)?"<null>":this.validToDate));
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
        result = ((result* 31)+((this.ssdtCodeInitiativeid == null)? 0 :this.ssdtCodeInitiativeid.hashCode()));
        result = ((result* 31)+((this.ssdtCodeInitiativeidSt == null)? 0 :this.ssdtCodeInitiativeidSt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.validToDate == null)? 0 :this.validToDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorpcdi) == false) {
            return false;
        }
        Sorpcdi rhs = ((Sorpcdi) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.validFromDate == rhs.validFromDate)||((this.validFromDate!= null)&&this.validFromDate.equals(rhs.validFromDate))))&&((this.ssdtCodeInitiativeid == rhs.ssdtCodeInitiativeid)||((this.ssdtCodeInitiativeid!= null)&&this.ssdtCodeInitiativeid.equals(rhs.ssdtCodeInitiativeid))))&&((this.ssdtCodeInitiativeidSt == rhs.ssdtCodeInitiativeidSt)||((this.ssdtCodeInitiativeidSt!= null)&&this.ssdtCodeInitiativeidSt.equals(rhs.ssdtCodeInitiativeidSt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.validToDate == rhs.validToDate)||((this.validToDate!= null)&&this.validToDate.equals(rhs.validToDate))));
    }

}
