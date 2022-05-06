
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
    "ssdtCodeFranInd",
    "activityDate",
    "ssdtCodeHesaIdSt",
    "ssdtCodeHesaId",
    "ssdtCodeFranIndSt",
    "userId",
    "roleProportion"
})
@Generated("jsonschema2pojo")
public class Sorccdr {

    /**
     * Lineage reference object : SORCCDR_SSDT_CODE_FRAN_IND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFranInd")
    @JsonPropertyDescription("Lineage reference object : SORCCDR_SSDT_CODE_FRAN_IND, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeFranInd;
    /**
     * Lineage reference object : SORCCDR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORCCDR_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("ssdtCodeHesaIdSt")
    private String ssdtCodeHesaIdSt;
    /**
     * Lineage reference object : SORCCDR_SSDT_CODE_HESA_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeHesaId")
    @JsonPropertyDescription("Lineage reference object : SORCCDR_SSDT_CODE_HESA_ID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeHesaId;
    @JsonProperty("ssdtCodeFranIndSt")
    private String ssdtCodeFranIndSt;
    /**
     * Lineage reference object : SORCCDR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORCCDR_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SORCCDR_ROLE_PROPORTION
     * 
     */
    @JsonProperty("roleProportion")
    @JsonPropertyDescription("Lineage reference object : SORCCDR_ROLE_PROPORTION")
    private Double roleProportion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORCCDR_SSDT_CODE_FRAN_IND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFranInd")
    public String getSsdtCodeFranInd() {
        return ssdtCodeFranInd;
    }

    /**
     * Lineage reference object : SORCCDR_SSDT_CODE_FRAN_IND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFranInd")
    public void setSsdtCodeFranInd(String ssdtCodeFranInd) {
        this.ssdtCodeFranInd = ssdtCodeFranInd;
    }

    public Sorccdr withSsdtCodeFranInd(String ssdtCodeFranInd) {
        this.ssdtCodeFranInd = ssdtCodeFranInd;
        return this;
    }

    /**
     * Lineage reference object : SORCCDR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORCCDR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorccdr withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("ssdtCodeHesaIdSt")
    public String getSsdtCodeHesaIdSt() {
        return ssdtCodeHesaIdSt;
    }

    @JsonProperty("ssdtCodeHesaIdSt")
    public void setSsdtCodeHesaIdSt(String ssdtCodeHesaIdSt) {
        this.ssdtCodeHesaIdSt = ssdtCodeHesaIdSt;
    }

    public Sorccdr withSsdtCodeHesaIdSt(String ssdtCodeHesaIdSt) {
        this.ssdtCodeHesaIdSt = ssdtCodeHesaIdSt;
        return this;
    }

    /**
     * Lineage reference object : SORCCDR_SSDT_CODE_HESA_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeHesaId")
    public String getSsdtCodeHesaId() {
        return ssdtCodeHesaId;
    }

    /**
     * Lineage reference object : SORCCDR_SSDT_CODE_HESA_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeHesaId")
    public void setSsdtCodeHesaId(String ssdtCodeHesaId) {
        this.ssdtCodeHesaId = ssdtCodeHesaId;
    }

    public Sorccdr withSsdtCodeHesaId(String ssdtCodeHesaId) {
        this.ssdtCodeHesaId = ssdtCodeHesaId;
        return this;
    }

    @JsonProperty("ssdtCodeFranIndSt")
    public String getSsdtCodeFranIndSt() {
        return ssdtCodeFranIndSt;
    }

    @JsonProperty("ssdtCodeFranIndSt")
    public void setSsdtCodeFranIndSt(String ssdtCodeFranIndSt) {
        this.ssdtCodeFranIndSt = ssdtCodeFranIndSt;
    }

    public Sorccdr withSsdtCodeFranIndSt(String ssdtCodeFranIndSt) {
        this.ssdtCodeFranIndSt = ssdtCodeFranIndSt;
        return this;
    }

    /**
     * Lineage reference object : SORCCDR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORCCDR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorccdr withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SORCCDR_ROLE_PROPORTION
     * 
     */
    @JsonProperty("roleProportion")
    public Double getRoleProportion() {
        return roleProportion;
    }

    /**
     * Lineage reference object : SORCCDR_ROLE_PROPORTION
     * 
     */
    @JsonProperty("roleProportion")
    public void setRoleProportion(Double roleProportion) {
        this.roleProportion = roleProportion;
    }

    public Sorccdr withRoleProportion(Double roleProportion) {
        this.roleProportion = roleProportion;
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

    public Sorccdr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorccdr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssdtCodeFranInd");
        sb.append('=');
        sb.append(((this.ssdtCodeFranInd == null)?"<null>":this.ssdtCodeFranInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeHesaIdSt");
        sb.append('=');
        sb.append(((this.ssdtCodeHesaIdSt == null)?"<null>":this.ssdtCodeHesaIdSt));
        sb.append(',');
        sb.append("ssdtCodeHesaId");
        sb.append('=');
        sb.append(((this.ssdtCodeHesaId == null)?"<null>":this.ssdtCodeHesaId));
        sb.append(',');
        sb.append("ssdtCodeFranIndSt");
        sb.append('=');
        sb.append(((this.ssdtCodeFranIndSt == null)?"<null>":this.ssdtCodeFranIndSt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("roleProportion");
        sb.append('=');
        sb.append(((this.roleProportion == null)?"<null>":this.roleProportion));
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
        result = ((result* 31)+((this.ssdtCodeFranInd == null)? 0 :this.ssdtCodeFranInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeHesaIdSt == null)? 0 :this.ssdtCodeHesaIdSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeHesaId == null)? 0 :this.ssdtCodeHesaId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFranIndSt == null)? 0 :this.ssdtCodeFranIndSt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.roleProportion == null)? 0 :this.roleProportion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorccdr) == false) {
            return false;
        }
        Sorccdr rhs = ((Sorccdr) other);
        return (((((((((this.ssdtCodeFranInd == rhs.ssdtCodeFranInd)||((this.ssdtCodeFranInd!= null)&&this.ssdtCodeFranInd.equals(rhs.ssdtCodeFranInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssdtCodeHesaIdSt == rhs.ssdtCodeHesaIdSt)||((this.ssdtCodeHesaIdSt!= null)&&this.ssdtCodeHesaIdSt.equals(rhs.ssdtCodeHesaIdSt))))&&((this.ssdtCodeHesaId == rhs.ssdtCodeHesaId)||((this.ssdtCodeHesaId!= null)&&this.ssdtCodeHesaId.equals(rhs.ssdtCodeHesaId))))&&((this.ssdtCodeFranIndSt == rhs.ssdtCodeFranIndSt)||((this.ssdtCodeFranIndSt!= null)&&this.ssdtCodeFranIndSt.equals(rhs.ssdtCodeFranIndSt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.roleProportion == rhs.roleProportion)||((this.roleProportion!= null)&&this.roleProportion.equals(rhs.roleProportion))));
    }

}
