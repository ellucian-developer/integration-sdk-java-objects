
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
    "attsCode",
    "saraattActivityDate",
    "kbentryTermCode",
    "ctypCode",
    "saraattUserId",
    "id"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationContactsCohortsAttributes100GetRequest {

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
     * Attribute
     * <p>
     * Lineage reference object : SARAATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * (Required)
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SARAATT_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARAATT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("saraattActivityDate")
    @JsonPropertyDescription("Lineage reference object : SARAATT_ACTIVITY_DATE")
    private Date saraattActivityDate;
    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    @JsonPropertyDescription("Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm")
    private Object kbentryTermCode;
    /**
     * Contact Type
     * <p>
     * Lineage reference object : SORCONT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * (Required)
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : SORCONT_CTYP_CODE, Lookup lineage reference object : stvctyp")
    private String ctypCode;
    /**
     * Lineage reference object : SARAATT_USER_ID
     * 
     */
    @JsonProperty("saraattUserId")
    @JsonPropertyDescription("Lineage reference object : SARAATT_USER_ID")
    private String saraattUserId;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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

    public AdmissionsApplicationContactsCohortsAttributes100GetRequest withActivityDate(Date activityDate) {
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

    public AdmissionsApplicationContactsCohortsAttributes100GetRequest withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SARAATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * (Required)
     * 
     */
    @JsonProperty("attsCode")
    public String getAttsCode() {
        return attsCode;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SARAATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * (Required)
     * 
     */
    @JsonProperty("attsCode")
    public void setAttsCode(String attsCode) {
        this.attsCode = attsCode;
    }

    public AdmissionsApplicationContactsCohortsAttributes100GetRequest withAttsCode(String attsCode) {
        this.attsCode = attsCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARAATT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("saraattActivityDate")
    public Date getSaraattActivityDate() {
        return saraattActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARAATT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("saraattActivityDate")
    public void setSaraattActivityDate(Date saraattActivityDate) {
        this.saraattActivityDate = saraattActivityDate;
    }

    public AdmissionsApplicationContactsCohortsAttributes100GetRequest withSaraattActivityDate(Date saraattActivityDate) {
        this.saraattActivityDate = saraattActivityDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    public Object getKbentryTermCode() {
        return kbentryTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    public void setKbentryTermCode(Object kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
    }

    public AdmissionsApplicationContactsCohortsAttributes100GetRequest withKbentryTermCode(Object kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
        return this;
    }

    /**
     * Contact Type
     * <p>
     * Lineage reference object : SORCONT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * (Required)
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Contact Type
     * <p>
     * Lineage reference object : SORCONT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * (Required)
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public AdmissionsApplicationContactsCohortsAttributes100GetRequest withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * Lineage reference object : SARAATT_USER_ID
     * 
     */
    @JsonProperty("saraattUserId")
    public String getSaraattUserId() {
        return saraattUserId;
    }

    /**
     * Lineage reference object : SARAATT_USER_ID
     * 
     */
    @JsonProperty("saraattUserId")
    public void setSaraattUserId(String saraattUserId) {
        this.saraattUserId = saraattUserId;
    }

    public AdmissionsApplicationContactsCohortsAttributes100GetRequest withSaraattUserId(String saraattUserId) {
        this.saraattUserId = saraattUserId;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public AdmissionsApplicationContactsCohortsAttributes100GetRequest withId(Object id) {
        this.id = id;
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

    public AdmissionsApplicationContactsCohortsAttributes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationContactsCohortsAttributes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("attsCode");
        sb.append('=');
        sb.append(((this.attsCode == null)?"<null>":this.attsCode));
        sb.append(',');
        sb.append("saraattActivityDate");
        sb.append('=');
        sb.append(((this.saraattActivityDate == null)?"<null>":this.saraattActivityDate));
        sb.append(',');
        sb.append("kbentryTermCode");
        sb.append('=');
        sb.append(((this.kbentryTermCode == null)?"<null>":this.kbentryTermCode));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("saraattUserId");
        sb.append('=');
        sb.append(((this.saraattUserId == null)?"<null>":this.saraattUserId));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.saraattActivityDate == null)? 0 :this.saraattActivityDate.hashCode()));
        result = ((result* 31)+((this.kbentryTermCode == null)? 0 :this.kbentryTermCode.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.saraattUserId == null)? 0 :this.saraattUserId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationContactsCohortsAttributes100GetRequest) == false) {
            return false;
        }
        AdmissionsApplicationContactsCohortsAttributes100GetRequest rhs = ((AdmissionsApplicationContactsCohortsAttributes100GetRequest) other);
        return ((((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.saraattActivityDate == rhs.saraattActivityDate)||((this.saraattActivityDate!= null)&&this.saraattActivityDate.equals(rhs.saraattActivityDate))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.saraattUserId == rhs.saraattUserId)||((this.saraattUserId!= null)&&this.saraattUserId.equals(rhs.saraattUserId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
