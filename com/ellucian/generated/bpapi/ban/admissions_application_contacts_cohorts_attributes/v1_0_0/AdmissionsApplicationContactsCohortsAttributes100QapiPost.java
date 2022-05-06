
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
    "id",
    "kbentryTermCode",
    "ctypCode",
    "activityDate",
    "chrtCode",
    "attsCode",
    "saraattActivityDate",
    "saraattUserId"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationContactsCohortsAttributes100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("kbentryTermCode")
    private String kbentryTermCode;
    @JsonProperty("ctypCode")
    private String ctypCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARAATT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SARAATT_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("chrtCode")
    private String chrtCode;
    /**
     * Attribute
     * <p>
     * Lineage reference object : SARAATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SARAATT_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
    @JsonProperty("saraattActivityDate")
    private String saraattActivityDate;
    @JsonProperty("saraattUserId")
    private String saraattUserId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionsApplicationContactsCohortsAttributes100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("kbentryTermCode")
    public String getKbentryTermCode() {
        return kbentryTermCode;
    }

    @JsonProperty("kbentryTermCode")
    public void setKbentryTermCode(String kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
    }

    public AdmissionsApplicationContactsCohortsAttributes100QapiPost withKbentryTermCode(String kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
        return this;
    }

    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public AdmissionsApplicationContactsCohortsAttributes100QapiPost withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARAATT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARAATT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AdmissionsApplicationContactsCohortsAttributes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public AdmissionsApplicationContactsCohortsAttributes100QapiPost withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SARAATT_ATTS_CODE, Lookup lineage reference object : stvatts
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
     * 
     */
    @JsonProperty("attsCode")
    public void setAttsCode(String attsCode) {
        this.attsCode = attsCode;
    }

    public AdmissionsApplicationContactsCohortsAttributes100QapiPost withAttsCode(String attsCode) {
        this.attsCode = attsCode;
        return this;
    }

    @JsonProperty("saraattActivityDate")
    public String getSaraattActivityDate() {
        return saraattActivityDate;
    }

    @JsonProperty("saraattActivityDate")
    public void setSaraattActivityDate(String saraattActivityDate) {
        this.saraattActivityDate = saraattActivityDate;
    }

    public AdmissionsApplicationContactsCohortsAttributes100QapiPost withSaraattActivityDate(String saraattActivityDate) {
        this.saraattActivityDate = saraattActivityDate;
        return this;
    }

    @JsonProperty("saraattUserId")
    public String getSaraattUserId() {
        return saraattUserId;
    }

    @JsonProperty("saraattUserId")
    public void setSaraattUserId(String saraattUserId) {
        this.saraattUserId = saraattUserId;
    }

    public AdmissionsApplicationContactsCohortsAttributes100QapiPost withSaraattUserId(String saraattUserId) {
        this.saraattUserId = saraattUserId;
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

    public AdmissionsApplicationContactsCohortsAttributes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationContactsCohortsAttributes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("kbentryTermCode");
        sb.append('=');
        sb.append(((this.kbentryTermCode == null)?"<null>":this.kbentryTermCode));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
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
        sb.append("saraattUserId");
        sb.append('=');
        sb.append(((this.saraattUserId == null)?"<null>":this.saraattUserId));
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
        if ((other instanceof AdmissionsApplicationContactsCohortsAttributes100QapiPost) == false) {
            return false;
        }
        AdmissionsApplicationContactsCohortsAttributes100QapiPost rhs = ((AdmissionsApplicationContactsCohortsAttributes100QapiPost) other);
        return ((((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.saraattActivityDate == rhs.saraattActivityDate)||((this.saraattActivityDate!= null)&&this.saraattActivityDate.equals(rhs.saraattActivityDate))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.saraattUserId == rhs.saraattUserId)||((this.saraattUserId!= null)&&this.saraattUserId.equals(rhs.saraattUserId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
