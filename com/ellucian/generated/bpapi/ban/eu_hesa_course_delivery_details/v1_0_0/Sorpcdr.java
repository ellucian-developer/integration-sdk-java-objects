
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
    "ssdtCodeRolTypSt",
    "activityDate",
    "ssdtCodeHesaidSt",
    "ssdtCodeHesaid",
    "ssdtCodeRolTyp",
    "crseRolProportion",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sorpcdr {

    @JsonProperty("ssdtCodeRolTypSt")
    private String ssdtCodeRolTypSt;
    /**
     * Lineage reference object : SORPCDR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORPCDR_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("ssdtCodeHesaidSt")
    private String ssdtCodeHesaidSt;
    /**
     * Lineage reference object : SORPCDR_SSDT_CODE_HESAID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeHesaid")
    @JsonPropertyDescription("Lineage reference object : SORPCDR_SSDT_CODE_HESAID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeHesaid;
    /**
     * Lineage reference object : SORPCDR_SSDT_CODE_ROLE_TYPE, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRolTyp")
    @JsonPropertyDescription("Lineage reference object : SORPCDR_SSDT_CODE_ROLE_TYPE, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeRolTyp;
    /**
     * Lineage reference object : SORPCDR_CRSE_ROLE_PROPORTION
     * 
     */
    @JsonProperty("crseRolProportion")
    @JsonPropertyDescription("Lineage reference object : SORPCDR_CRSE_ROLE_PROPORTION")
    private Double crseRolProportion;
    /**
     * Lineage reference object : SORPCDR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORPCDR_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssdtCodeRolTypSt")
    public String getSsdtCodeRolTypSt() {
        return ssdtCodeRolTypSt;
    }

    @JsonProperty("ssdtCodeRolTypSt")
    public void setSsdtCodeRolTypSt(String ssdtCodeRolTypSt) {
        this.ssdtCodeRolTypSt = ssdtCodeRolTypSt;
    }

    public Sorpcdr withSsdtCodeRolTypSt(String ssdtCodeRolTypSt) {
        this.ssdtCodeRolTypSt = ssdtCodeRolTypSt;
        return this;
    }

    /**
     * Lineage reference object : SORPCDR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORPCDR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorpcdr withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("ssdtCodeHesaidSt")
    public String getSsdtCodeHesaidSt() {
        return ssdtCodeHesaidSt;
    }

    @JsonProperty("ssdtCodeHesaidSt")
    public void setSsdtCodeHesaidSt(String ssdtCodeHesaidSt) {
        this.ssdtCodeHesaidSt = ssdtCodeHesaidSt;
    }

    public Sorpcdr withSsdtCodeHesaidSt(String ssdtCodeHesaidSt) {
        this.ssdtCodeHesaidSt = ssdtCodeHesaidSt;
        return this;
    }

    /**
     * Lineage reference object : SORPCDR_SSDT_CODE_HESAID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeHesaid")
    public String getSsdtCodeHesaid() {
        return ssdtCodeHesaid;
    }

    /**
     * Lineage reference object : SORPCDR_SSDT_CODE_HESAID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeHesaid")
    public void setSsdtCodeHesaid(String ssdtCodeHesaid) {
        this.ssdtCodeHesaid = ssdtCodeHesaid;
    }

    public Sorpcdr withSsdtCodeHesaid(String ssdtCodeHesaid) {
        this.ssdtCodeHesaid = ssdtCodeHesaid;
        return this;
    }

    /**
     * Lineage reference object : SORPCDR_SSDT_CODE_ROLE_TYPE, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRolTyp")
    public String getSsdtCodeRolTyp() {
        return ssdtCodeRolTyp;
    }

    /**
     * Lineage reference object : SORPCDR_SSDT_CODE_ROLE_TYPE, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRolTyp")
    public void setSsdtCodeRolTyp(String ssdtCodeRolTyp) {
        this.ssdtCodeRolTyp = ssdtCodeRolTyp;
    }

    public Sorpcdr withSsdtCodeRolTyp(String ssdtCodeRolTyp) {
        this.ssdtCodeRolTyp = ssdtCodeRolTyp;
        return this;
    }

    /**
     * Lineage reference object : SORPCDR_CRSE_ROLE_PROPORTION
     * 
     */
    @JsonProperty("crseRolProportion")
    public Double getCrseRolProportion() {
        return crseRolProportion;
    }

    /**
     * Lineage reference object : SORPCDR_CRSE_ROLE_PROPORTION
     * 
     */
    @JsonProperty("crseRolProportion")
    public void setCrseRolProportion(Double crseRolProportion) {
        this.crseRolProportion = crseRolProportion;
    }

    public Sorpcdr withCrseRolProportion(Double crseRolProportion) {
        this.crseRolProportion = crseRolProportion;
        return this;
    }

    /**
     * Lineage reference object : SORPCDR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORPCDR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorpcdr withUserId(String userId) {
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

    public Sorpcdr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorpcdr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssdtCodeRolTypSt");
        sb.append('=');
        sb.append(((this.ssdtCodeRolTypSt == null)?"<null>":this.ssdtCodeRolTypSt));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeHesaidSt");
        sb.append('=');
        sb.append(((this.ssdtCodeHesaidSt == null)?"<null>":this.ssdtCodeHesaidSt));
        sb.append(',');
        sb.append("ssdtCodeHesaid");
        sb.append('=');
        sb.append(((this.ssdtCodeHesaid == null)?"<null>":this.ssdtCodeHesaid));
        sb.append(',');
        sb.append("ssdtCodeRolTyp");
        sb.append('=');
        sb.append(((this.ssdtCodeRolTyp == null)?"<null>":this.ssdtCodeRolTyp));
        sb.append(',');
        sb.append("crseRolProportion");
        sb.append('=');
        sb.append(((this.crseRolProportion == null)?"<null>":this.crseRolProportion));
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
        result = ((result* 31)+((this.ssdtCodeRolTypSt == null)? 0 :this.ssdtCodeRolTypSt.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeHesaidSt == null)? 0 :this.ssdtCodeHesaidSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeHesaid == null)? 0 :this.ssdtCodeHesaid.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRolTyp == null)? 0 :this.ssdtCodeRolTyp.hashCode()));
        result = ((result* 31)+((this.crseRolProportion == null)? 0 :this.crseRolProportion.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorpcdr) == false) {
            return false;
        }
        Sorpcdr rhs = ((Sorpcdr) other);
        return (((((((((this.ssdtCodeRolTypSt == rhs.ssdtCodeRolTypSt)||((this.ssdtCodeRolTypSt!= null)&&this.ssdtCodeRolTypSt.equals(rhs.ssdtCodeRolTypSt)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssdtCodeHesaidSt == rhs.ssdtCodeHesaidSt)||((this.ssdtCodeHesaidSt!= null)&&this.ssdtCodeHesaidSt.equals(rhs.ssdtCodeHesaidSt))))&&((this.ssdtCodeHesaid == rhs.ssdtCodeHesaid)||((this.ssdtCodeHesaid!= null)&&this.ssdtCodeHesaid.equals(rhs.ssdtCodeHesaid))))&&((this.ssdtCodeRolTyp == rhs.ssdtCodeRolTyp)||((this.ssdtCodeRolTyp!= null)&&this.ssdtCodeRolTyp.equals(rhs.ssdtCodeRolTyp))))&&((this.crseRolProportion == rhs.crseRolProportion)||((this.crseRolProportion!= null)&&this.crseRolProportion.equals(rhs.crseRolProportion))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
