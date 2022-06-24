
package com.ellucian.generated.bpapi.ban.language_proficiency_details.v1_0_0;

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
    "lptyCode",
    "activityDate",
    "stvlplvDesc",
    "langCode",
    "lplvCode",
    "stvlptyDesc",
    "userId",
    "stvlangDesc"
})
@Generated("jsonschema2pojo")
public class LanguageProficiencyDetails100PutResponse {

    /**
     * Proficiency Type
     * <p>
     * Lineage reference object : SORLANP_LPTY_CODE, Lookup lineage reference object : STVLPTY
     * (Required)
     * 
     */
    @JsonProperty("lptyCode")
    @JsonPropertyDescription("Lineage reference object : SORLANP_LPTY_CODE, Lookup lineage reference object : STVLPTY")
    private String lptyCode;
    /**
     * Lineage reference object : SORLANP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORLANP_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Proficiency Level Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlplvDesc")
    private String stvlplvDesc;
    /**
     * Language Identifier
     * <p>
     * Lineage reference object : SORLANP_LANG_CODE, Lookup lineage reference object : stvlang
     * (Required)
     * 
     */
    @JsonProperty("langCode")
    @JsonPropertyDescription("Lineage reference object : SORLANP_LANG_CODE, Lookup lineage reference object : stvlang")
    private String langCode;
    /**
     * Proficiency Level
     * <p>
     * Lineage reference object : SORLANP_LPLV_CODE, Lookup lineage reference object : STVLPLV
     * 
     */
    @JsonProperty("lplvCode")
    @JsonPropertyDescription("Lineage reference object : SORLANP_LPLV_CODE, Lookup lineage reference object : STVLPLV")
    private String lplvCode;
    /**
     * Proficiency Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlptyDesc")
    private String stvlptyDesc;
    /**
     * Lineage reference object : SORLANP_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORLANP_USER_ID")
    private String userId;
    /**
     * Language Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlangDesc")
    private String stvlangDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Proficiency Type
     * <p>
     * Lineage reference object : SORLANP_LPTY_CODE, Lookup lineage reference object : STVLPTY
     * (Required)
     * 
     */
    @JsonProperty("lptyCode")
    public String getLptyCode() {
        return lptyCode;
    }

    /**
     * Proficiency Type
     * <p>
     * Lineage reference object : SORLANP_LPTY_CODE, Lookup lineage reference object : STVLPTY
     * (Required)
     * 
     */
    @JsonProperty("lptyCode")
    public void setLptyCode(String lptyCode) {
        this.lptyCode = lptyCode;
    }

    public LanguageProficiencyDetails100PutResponse withLptyCode(String lptyCode) {
        this.lptyCode = lptyCode;
        return this;
    }

    /**
     * Lineage reference object : SORLANP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORLANP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LanguageProficiencyDetails100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Proficiency Level Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlplvDesc")
    public String getStvlplvDesc() {
        return stvlplvDesc;
    }

    /**
     * Proficiency Level Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlplvDesc")
    public void setStvlplvDesc(String stvlplvDesc) {
        this.stvlplvDesc = stvlplvDesc;
    }

    public LanguageProficiencyDetails100PutResponse withStvlplvDesc(String stvlplvDesc) {
        this.stvlplvDesc = stvlplvDesc;
        return this;
    }

    /**
     * Language Identifier
     * <p>
     * Lineage reference object : SORLANP_LANG_CODE, Lookup lineage reference object : stvlang
     * (Required)
     * 
     */
    @JsonProperty("langCode")
    public String getLangCode() {
        return langCode;
    }

    /**
     * Language Identifier
     * <p>
     * Lineage reference object : SORLANP_LANG_CODE, Lookup lineage reference object : stvlang
     * (Required)
     * 
     */
    @JsonProperty("langCode")
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public LanguageProficiencyDetails100PutResponse withLangCode(String langCode) {
        this.langCode = langCode;
        return this;
    }

    /**
     * Proficiency Level
     * <p>
     * Lineage reference object : SORLANP_LPLV_CODE, Lookup lineage reference object : STVLPLV
     * 
     */
    @JsonProperty("lplvCode")
    public String getLplvCode() {
        return lplvCode;
    }

    /**
     * Proficiency Level
     * <p>
     * Lineage reference object : SORLANP_LPLV_CODE, Lookup lineage reference object : STVLPLV
     * 
     */
    @JsonProperty("lplvCode")
    public void setLplvCode(String lplvCode) {
        this.lplvCode = lplvCode;
    }

    public LanguageProficiencyDetails100PutResponse withLplvCode(String lplvCode) {
        this.lplvCode = lplvCode;
        return this;
    }

    /**
     * Proficiency Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlptyDesc")
    public String getStvlptyDesc() {
        return stvlptyDesc;
    }

    /**
     * Proficiency Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlptyDesc")
    public void setStvlptyDesc(String stvlptyDesc) {
        this.stvlptyDesc = stvlptyDesc;
    }

    public LanguageProficiencyDetails100PutResponse withStvlptyDesc(String stvlptyDesc) {
        this.stvlptyDesc = stvlptyDesc;
        return this;
    }

    /**
     * Lineage reference object : SORLANP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORLANP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LanguageProficiencyDetails100PutResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Language Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlangDesc")
    public String getStvlangDesc() {
        return stvlangDesc;
    }

    /**
     * Language Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlangDesc")
    public void setStvlangDesc(String stvlangDesc) {
        this.stvlangDesc = stvlangDesc;
    }

    public LanguageProficiencyDetails100PutResponse withStvlangDesc(String stvlangDesc) {
        this.stvlangDesc = stvlangDesc;
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

    public LanguageProficiencyDetails100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LanguageProficiencyDetails100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lptyCode");
        sb.append('=');
        sb.append(((this.lptyCode == null)?"<null>":this.lptyCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("stvlplvDesc");
        sb.append('=');
        sb.append(((this.stvlplvDesc == null)?"<null>":this.stvlplvDesc));
        sb.append(',');
        sb.append("langCode");
        sb.append('=');
        sb.append(((this.langCode == null)?"<null>":this.langCode));
        sb.append(',');
        sb.append("lplvCode");
        sb.append('=');
        sb.append(((this.lplvCode == null)?"<null>":this.lplvCode));
        sb.append(',');
        sb.append("stvlptyDesc");
        sb.append('=');
        sb.append(((this.stvlptyDesc == null)?"<null>":this.stvlptyDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("stvlangDesc");
        sb.append('=');
        sb.append(((this.stvlangDesc == null)?"<null>":this.stvlangDesc));
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
        result = ((result* 31)+((this.lptyCode == null)? 0 :this.lptyCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.stvlplvDesc == null)? 0 :this.stvlplvDesc.hashCode()));
        result = ((result* 31)+((this.langCode == null)? 0 :this.langCode.hashCode()));
        result = ((result* 31)+((this.lplvCode == null)? 0 :this.lplvCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stvlptyDesc == null)? 0 :this.stvlptyDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.stvlangDesc == null)? 0 :this.stvlangDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LanguageProficiencyDetails100PutResponse) == false) {
            return false;
        }
        LanguageProficiencyDetails100PutResponse rhs = ((LanguageProficiencyDetails100PutResponse) other);
        return ((((((((((this.lptyCode == rhs.lptyCode)||((this.lptyCode!= null)&&this.lptyCode.equals(rhs.lptyCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.stvlplvDesc == rhs.stvlplvDesc)||((this.stvlplvDesc!= null)&&this.stvlplvDesc.equals(rhs.stvlplvDesc))))&&((this.langCode == rhs.langCode)||((this.langCode!= null)&&this.langCode.equals(rhs.langCode))))&&((this.lplvCode == rhs.lplvCode)||((this.lplvCode!= null)&&this.lplvCode.equals(rhs.lplvCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stvlptyDesc == rhs.stvlptyDesc)||((this.stvlptyDesc!= null)&&this.stvlptyDesc.equals(rhs.stvlptyDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.stvlangDesc == rhs.stvlangDesc)||((this.stvlangDesc!= null)&&this.stvlangDesc.equals(rhs.stvlangDesc))));
    }

}
