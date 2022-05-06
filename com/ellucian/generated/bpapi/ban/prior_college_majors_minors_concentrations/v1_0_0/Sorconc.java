
package com.ellucian.generated.bpapi.ban.prior_college_majors_minors_concentrations.v1_0_0;

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
    "concDesc",
    "activityDate",
    "majrCodeConc",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sorconc {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("concDesc")
    private String concDesc;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORCONC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORCONC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeConc")
    @JsonPropertyDescription("Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr")
    private String majrCodeConc;
    /**
     * User ID
     * <p>
     * Lineage reference object : SORCONC_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORCONC_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("concDesc")
    public String getConcDesc() {
        return concDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("concDesc")
    public void setConcDesc(String concDesc) {
        this.concDesc = concDesc;
    }

    public Sorconc withConcDesc(String concDesc) {
        this.concDesc = concDesc;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORCONC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORCONC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorconc withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeConc")
    public String getMajrCodeConc() {
        return majrCodeConc;
    }

    /**
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeConc")
    public void setMajrCodeConc(String majrCodeConc) {
        this.majrCodeConc = majrCodeConc;
    }

    public Sorconc withMajrCodeConc(String majrCodeConc) {
        this.majrCodeConc = majrCodeConc;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SORCONC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SORCONC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorconc withUserId(String userId) {
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

    public Sorconc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorconc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("concDesc");
        sb.append('=');
        sb.append(((this.concDesc == null)?"<null>":this.concDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("majrCodeConc");
        sb.append('=');
        sb.append(((this.majrCodeConc == null)?"<null>":this.majrCodeConc));
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
        result = ((result* 31)+((this.majrCodeConc == null)? 0 :this.majrCodeConc.hashCode()));
        result = ((result* 31)+((this.concDesc == null)? 0 :this.concDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorconc) == false) {
            return false;
        }
        Sorconc rhs = ((Sorconc) other);
        return ((((((this.majrCodeConc == rhs.majrCodeConc)||((this.majrCodeConc!= null)&&this.majrCodeConc.equals(rhs.majrCodeConc)))&&((this.concDesc == rhs.concDesc)||((this.concDesc!= null)&&this.concDesc.equals(rhs.concDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
