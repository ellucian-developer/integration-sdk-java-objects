
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
    "ssdtCodeCrdtPtsLvl",
    "fullTimeEquivalence",
    "SobccidSsdtCodeLangId",
    "activityDate",
    "ssdtCodeCrdtPtsLvlSt",
    "SobccidModuleTitle",
    "modCrdtVal",
    "ssdtCodeCrdtTraSchSt",
    "userId",
    "modId",
    "SobccidSsdtCodeLangIdSt",
    "ssdtCodeCrdtTraSch"
})
@Generated("jsonschema2pojo")
public class Sobccid {

    /**
     * Lineage reference object : SOBCCID_SSDT_CODE_CRDT_PTS_LVL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCrdtPtsLvl")
    @JsonPropertyDescription("Lineage reference object : SOBCCID_SSDT_CODE_CRDT_PTS_LVL, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeCrdtPtsLvl;
    /**
     * Lineage reference object : SOBCCID_FULL_TIME_EQUIVALENCE
     * 
     */
    @JsonProperty("fullTimeEquivalence")
    @JsonPropertyDescription("Lineage reference object : SOBCCID_FULL_TIME_EQUIVALENCE")
    private Double fullTimeEquivalence;
    /**
     * Lineage reference object : SOBCCID_SSDT_CODE_LANG_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("SobccidSsdtCodeLangId")
    @JsonPropertyDescription("Lineage reference object : SOBCCID_SSDT_CODE_LANG_ID, Lookup lineage reference object : skvssdt,skvssdt")
    private String sobccidSsdtCodeLangId;
    /**
     * Lineage reference object : SOBCCID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBCCID_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("ssdtCodeCrdtPtsLvlSt")
    private String ssdtCodeCrdtPtsLvlSt;
    /**
     * Lineage reference object : SOBCCID_MODULE_TITLE
     * 
     */
    @JsonProperty("SobccidModuleTitle")
    @JsonPropertyDescription("Lineage reference object : SOBCCID_MODULE_TITLE")
    private String sobccidModuleTitle;
    /**
     * Lineage reference object : SOBCCID_MOD_CRDT_VAL
     * 
     */
    @JsonProperty("modCrdtVal")
    @JsonPropertyDescription("Lineage reference object : SOBCCID_MOD_CRDT_VAL")
    private Double modCrdtVal;
    @JsonProperty("ssdtCodeCrdtTraSchSt")
    private String ssdtCodeCrdtTraSchSt;
    /**
     * Lineage reference object : SOBCCID_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBCCID_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SOBCCID_MOD_ID
     * 
     */
    @JsonProperty("modId")
    @JsonPropertyDescription("Lineage reference object : SOBCCID_MOD_ID")
    private String modId;
    @JsonProperty("SobccidSsdtCodeLangIdSt")
    private String sobccidSsdtCodeLangIdSt;
    /**
     * Lineage reference object : SOBCCID_SSDT_CODE_CRDT_TRA_SCH, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCrdtTraSch")
    @JsonPropertyDescription("Lineage reference object : SOBCCID_SSDT_CODE_CRDT_TRA_SCH, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeCrdtTraSch;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBCCID_SSDT_CODE_CRDT_PTS_LVL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCrdtPtsLvl")
    public String getSsdtCodeCrdtPtsLvl() {
        return ssdtCodeCrdtPtsLvl;
    }

    /**
     * Lineage reference object : SOBCCID_SSDT_CODE_CRDT_PTS_LVL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCrdtPtsLvl")
    public void setSsdtCodeCrdtPtsLvl(String ssdtCodeCrdtPtsLvl) {
        this.ssdtCodeCrdtPtsLvl = ssdtCodeCrdtPtsLvl;
    }

    public Sobccid withSsdtCodeCrdtPtsLvl(String ssdtCodeCrdtPtsLvl) {
        this.ssdtCodeCrdtPtsLvl = ssdtCodeCrdtPtsLvl;
        return this;
    }

    /**
     * Lineage reference object : SOBCCID_FULL_TIME_EQUIVALENCE
     * 
     */
    @JsonProperty("fullTimeEquivalence")
    public Double getFullTimeEquivalence() {
        return fullTimeEquivalence;
    }

    /**
     * Lineage reference object : SOBCCID_FULL_TIME_EQUIVALENCE
     * 
     */
    @JsonProperty("fullTimeEquivalence")
    public void setFullTimeEquivalence(Double fullTimeEquivalence) {
        this.fullTimeEquivalence = fullTimeEquivalence;
    }

    public Sobccid withFullTimeEquivalence(Double fullTimeEquivalence) {
        this.fullTimeEquivalence = fullTimeEquivalence;
        return this;
    }

    /**
     * Lineage reference object : SOBCCID_SSDT_CODE_LANG_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("SobccidSsdtCodeLangId")
    public String getSobccidSsdtCodeLangId() {
        return sobccidSsdtCodeLangId;
    }

    /**
     * Lineage reference object : SOBCCID_SSDT_CODE_LANG_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("SobccidSsdtCodeLangId")
    public void setSobccidSsdtCodeLangId(String sobccidSsdtCodeLangId) {
        this.sobccidSsdtCodeLangId = sobccidSsdtCodeLangId;
    }

    public Sobccid withSobccidSsdtCodeLangId(String sobccidSsdtCodeLangId) {
        this.sobccidSsdtCodeLangId = sobccidSsdtCodeLangId;
        return this;
    }

    /**
     * Lineage reference object : SOBCCID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBCCID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobccid withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("ssdtCodeCrdtPtsLvlSt")
    public String getSsdtCodeCrdtPtsLvlSt() {
        return ssdtCodeCrdtPtsLvlSt;
    }

    @JsonProperty("ssdtCodeCrdtPtsLvlSt")
    public void setSsdtCodeCrdtPtsLvlSt(String ssdtCodeCrdtPtsLvlSt) {
        this.ssdtCodeCrdtPtsLvlSt = ssdtCodeCrdtPtsLvlSt;
    }

    public Sobccid withSsdtCodeCrdtPtsLvlSt(String ssdtCodeCrdtPtsLvlSt) {
        this.ssdtCodeCrdtPtsLvlSt = ssdtCodeCrdtPtsLvlSt;
        return this;
    }

    /**
     * Lineage reference object : SOBCCID_MODULE_TITLE
     * 
     */
    @JsonProperty("SobccidModuleTitle")
    public String getSobccidModuleTitle() {
        return sobccidModuleTitle;
    }

    /**
     * Lineage reference object : SOBCCID_MODULE_TITLE
     * 
     */
    @JsonProperty("SobccidModuleTitle")
    public void setSobccidModuleTitle(String sobccidModuleTitle) {
        this.sobccidModuleTitle = sobccidModuleTitle;
    }

    public Sobccid withSobccidModuleTitle(String sobccidModuleTitle) {
        this.sobccidModuleTitle = sobccidModuleTitle;
        return this;
    }

    /**
     * Lineage reference object : SOBCCID_MOD_CRDT_VAL
     * 
     */
    @JsonProperty("modCrdtVal")
    public Double getModCrdtVal() {
        return modCrdtVal;
    }

    /**
     * Lineage reference object : SOBCCID_MOD_CRDT_VAL
     * 
     */
    @JsonProperty("modCrdtVal")
    public void setModCrdtVal(Double modCrdtVal) {
        this.modCrdtVal = modCrdtVal;
    }

    public Sobccid withModCrdtVal(Double modCrdtVal) {
        this.modCrdtVal = modCrdtVal;
        return this;
    }

    @JsonProperty("ssdtCodeCrdtTraSchSt")
    public String getSsdtCodeCrdtTraSchSt() {
        return ssdtCodeCrdtTraSchSt;
    }

    @JsonProperty("ssdtCodeCrdtTraSchSt")
    public void setSsdtCodeCrdtTraSchSt(String ssdtCodeCrdtTraSchSt) {
        this.ssdtCodeCrdtTraSchSt = ssdtCodeCrdtTraSchSt;
    }

    public Sobccid withSsdtCodeCrdtTraSchSt(String ssdtCodeCrdtTraSchSt) {
        this.ssdtCodeCrdtTraSchSt = ssdtCodeCrdtTraSchSt;
        return this;
    }

    /**
     * Lineage reference object : SOBCCID_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBCCID_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobccid withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SOBCCID_MOD_ID
     * 
     */
    @JsonProperty("modId")
    public String getModId() {
        return modId;
    }

    /**
     * Lineage reference object : SOBCCID_MOD_ID
     * 
     */
    @JsonProperty("modId")
    public void setModId(String modId) {
        this.modId = modId;
    }

    public Sobccid withModId(String modId) {
        this.modId = modId;
        return this;
    }

    @JsonProperty("SobccidSsdtCodeLangIdSt")
    public String getSobccidSsdtCodeLangIdSt() {
        return sobccidSsdtCodeLangIdSt;
    }

    @JsonProperty("SobccidSsdtCodeLangIdSt")
    public void setSobccidSsdtCodeLangIdSt(String sobccidSsdtCodeLangIdSt) {
        this.sobccidSsdtCodeLangIdSt = sobccidSsdtCodeLangIdSt;
    }

    public Sobccid withSobccidSsdtCodeLangIdSt(String sobccidSsdtCodeLangIdSt) {
        this.sobccidSsdtCodeLangIdSt = sobccidSsdtCodeLangIdSt;
        return this;
    }

    /**
     * Lineage reference object : SOBCCID_SSDT_CODE_CRDT_TRA_SCH, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCrdtTraSch")
    public String getSsdtCodeCrdtTraSch() {
        return ssdtCodeCrdtTraSch;
    }

    /**
     * Lineage reference object : SOBCCID_SSDT_CODE_CRDT_TRA_SCH, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCrdtTraSch")
    public void setSsdtCodeCrdtTraSch(String ssdtCodeCrdtTraSch) {
        this.ssdtCodeCrdtTraSch = ssdtCodeCrdtTraSch;
    }

    public Sobccid withSsdtCodeCrdtTraSch(String ssdtCodeCrdtTraSch) {
        this.ssdtCodeCrdtTraSch = ssdtCodeCrdtTraSch;
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

    public Sobccid withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobccid.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssdtCodeCrdtPtsLvl");
        sb.append('=');
        sb.append(((this.ssdtCodeCrdtPtsLvl == null)?"<null>":this.ssdtCodeCrdtPtsLvl));
        sb.append(',');
        sb.append("fullTimeEquivalence");
        sb.append('=');
        sb.append(((this.fullTimeEquivalence == null)?"<null>":this.fullTimeEquivalence));
        sb.append(',');
        sb.append("sobccidSsdtCodeLangId");
        sb.append('=');
        sb.append(((this.sobccidSsdtCodeLangId == null)?"<null>":this.sobccidSsdtCodeLangId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeCrdtPtsLvlSt");
        sb.append('=');
        sb.append(((this.ssdtCodeCrdtPtsLvlSt == null)?"<null>":this.ssdtCodeCrdtPtsLvlSt));
        sb.append(',');
        sb.append("sobccidModuleTitle");
        sb.append('=');
        sb.append(((this.sobccidModuleTitle == null)?"<null>":this.sobccidModuleTitle));
        sb.append(',');
        sb.append("modCrdtVal");
        sb.append('=');
        sb.append(((this.modCrdtVal == null)?"<null>":this.modCrdtVal));
        sb.append(',');
        sb.append("ssdtCodeCrdtTraSchSt");
        sb.append('=');
        sb.append(((this.ssdtCodeCrdtTraSchSt == null)?"<null>":this.ssdtCodeCrdtTraSchSt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("modId");
        sb.append('=');
        sb.append(((this.modId == null)?"<null>":this.modId));
        sb.append(',');
        sb.append("sobccidSsdtCodeLangIdSt");
        sb.append('=');
        sb.append(((this.sobccidSsdtCodeLangIdSt == null)?"<null>":this.sobccidSsdtCodeLangIdSt));
        sb.append(',');
        sb.append("ssdtCodeCrdtTraSch");
        sb.append('=');
        sb.append(((this.ssdtCodeCrdtTraSch == null)?"<null>":this.ssdtCodeCrdtTraSch));
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
        result = ((result* 31)+((this.ssdtCodeCrdtPtsLvl == null)? 0 :this.ssdtCodeCrdtPtsLvl.hashCode()));
        result = ((result* 31)+((this.fullTimeEquivalence == null)? 0 :this.fullTimeEquivalence.hashCode()));
        result = ((result* 31)+((this.sobccidSsdtCodeLangIdSt == null)? 0 :this.sobccidSsdtCodeLangIdSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCrdtPtsLvlSt == null)? 0 :this.ssdtCodeCrdtPtsLvlSt.hashCode()));
        result = ((result* 31)+((this.modCrdtVal == null)? 0 :this.modCrdtVal.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.modId == null)? 0 :this.modId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCrdtTraSch == null)? 0 :this.ssdtCodeCrdtTraSch.hashCode()));
        result = ((result* 31)+((this.sobccidModuleTitle == null)? 0 :this.sobccidModuleTitle.hashCode()));
        result = ((result* 31)+((this.sobccidSsdtCodeLangId == null)? 0 :this.sobccidSsdtCodeLangId.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCrdtTraSchSt == null)? 0 :this.ssdtCodeCrdtTraSchSt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobccid) == false) {
            return false;
        }
        Sobccid rhs = ((Sobccid) other);
        return ((((((((((((((this.ssdtCodeCrdtPtsLvl == rhs.ssdtCodeCrdtPtsLvl)||((this.ssdtCodeCrdtPtsLvl!= null)&&this.ssdtCodeCrdtPtsLvl.equals(rhs.ssdtCodeCrdtPtsLvl)))&&((this.fullTimeEquivalence == rhs.fullTimeEquivalence)||((this.fullTimeEquivalence!= null)&&this.fullTimeEquivalence.equals(rhs.fullTimeEquivalence))))&&((this.sobccidSsdtCodeLangIdSt == rhs.sobccidSsdtCodeLangIdSt)||((this.sobccidSsdtCodeLangIdSt!= null)&&this.sobccidSsdtCodeLangIdSt.equals(rhs.sobccidSsdtCodeLangIdSt))))&&((this.ssdtCodeCrdtPtsLvlSt == rhs.ssdtCodeCrdtPtsLvlSt)||((this.ssdtCodeCrdtPtsLvlSt!= null)&&this.ssdtCodeCrdtPtsLvlSt.equals(rhs.ssdtCodeCrdtPtsLvlSt))))&&((this.modCrdtVal == rhs.modCrdtVal)||((this.modCrdtVal!= null)&&this.modCrdtVal.equals(rhs.modCrdtVal))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.modId == rhs.modId)||((this.modId!= null)&&this.modId.equals(rhs.modId))))&&((this.ssdtCodeCrdtTraSch == rhs.ssdtCodeCrdtTraSch)||((this.ssdtCodeCrdtTraSch!= null)&&this.ssdtCodeCrdtTraSch.equals(rhs.ssdtCodeCrdtTraSch))))&&((this.sobccidModuleTitle == rhs.sobccidModuleTitle)||((this.sobccidModuleTitle!= null)&&this.sobccidModuleTitle.equals(rhs.sobccidModuleTitle))))&&((this.sobccidSsdtCodeLangId == rhs.sobccidSsdtCodeLangId)||((this.sobccidSsdtCodeLangId!= null)&&this.sobccidSsdtCodeLangId.equals(rhs.sobccidSsdtCodeLangId))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeCrdtTraSchSt == rhs.ssdtCodeCrdtTraSchSt)||((this.ssdtCodeCrdtTraSchSt!= null)&&this.ssdtCodeCrdtTraSchSt.equals(rhs.ssdtCodeCrdtTraSchSt))));
    }

}
