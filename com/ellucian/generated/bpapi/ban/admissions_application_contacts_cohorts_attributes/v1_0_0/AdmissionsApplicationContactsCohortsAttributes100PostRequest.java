
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
    "date",
    "chrtCode",
    "attsCode",
    "kbentryTermCode",
    "ctypCode",
    "id"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationContactsCohortsAttributes100PostRequest {

    /**
     * Contact Date
     * <p>
     * Lineage reference object : SORCONT_CONTACT_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Lineage reference object : SORCONT_CONTACT_DATE")
    private Date date;
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
     * Contact Date
     * <p>
     * Lineage reference object : SORCONT_CONTACT_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * Contact Date
     * <p>
     * Lineage reference object : SORCONT_CONTACT_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public AdmissionsApplicationContactsCohortsAttributes100PostRequest withDate(Date date) {
        this.date = date;
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

    public AdmissionsApplicationContactsCohortsAttributes100PostRequest withChrtCode(String chrtCode) {
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

    public AdmissionsApplicationContactsCohortsAttributes100PostRequest withAttsCode(String attsCode) {
        this.attsCode = attsCode;
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

    public AdmissionsApplicationContactsCohortsAttributes100PostRequest withKbentryTermCode(Object kbentryTermCode) {
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

    public AdmissionsApplicationContactsCohortsAttributes100PostRequest withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
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

    public AdmissionsApplicationContactsCohortsAttributes100PostRequest withId(Object id) {
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

    public AdmissionsApplicationContactsCohortsAttributes100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationContactsCohortsAttributes100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("attsCode");
        sb.append('=');
        sb.append(((this.attsCode == null)?"<null>":this.attsCode));
        sb.append(',');
        sb.append("kbentryTermCode");
        sb.append('=');
        sb.append(((this.kbentryTermCode == null)?"<null>":this.kbentryTermCode));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.kbentryTermCode == null)? 0 :this.kbentryTermCode.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationContactsCohortsAttributes100PostRequest) == false) {
            return false;
        }
        AdmissionsApplicationContactsCohortsAttributes100PostRequest rhs = ((AdmissionsApplicationContactsCohortsAttributes100PostRequest) other);
        return ((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
