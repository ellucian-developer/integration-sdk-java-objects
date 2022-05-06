
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
    "id",
    "langCode",
    "lptyCode",
    "lplvCode",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class LanguageProficiencyDetails100QapiPost {

    @JsonProperty("id")
    private String id;
    /**
     * Language Identifier
     * <p>
     * Lineage reference object : SORLANP_LANG_CODE, Lookup lineage reference object : stvlang
     * 
     */
    @JsonProperty("langCode")
    @JsonPropertyDescription("Lineage reference object : SORLANP_LANG_CODE, Lookup lineage reference object : stvlang")
    private String langCode;
    /**
     * Proficiency Type
     * <p>
     * Lineage reference object : SORLANP_LPTY_CODE, Lookup lineage reference object : STVLPTY
     * 
     */
    @JsonProperty("lptyCode")
    @JsonPropertyDescription("Lineage reference object : SORLANP_LPTY_CODE, Lookup lineage reference object : STVLPTY")
    private String lptyCode;
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
     * Lineage reference object : SORLANP_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORLANP_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SORLANP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORLANP_ACTIVITY_DATE")
    private Date activityDate;
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

    public LanguageProficiencyDetails100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Language Identifier
     * <p>
     * Lineage reference object : SORLANP_LANG_CODE, Lookup lineage reference object : stvlang
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
     * 
     */
    @JsonProperty("langCode")
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public LanguageProficiencyDetails100QapiPost withLangCode(String langCode) {
        this.langCode = langCode;
        return this;
    }

    /**
     * Proficiency Type
     * <p>
     * Lineage reference object : SORLANP_LPTY_CODE, Lookup lineage reference object : STVLPTY
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
     * 
     */
    @JsonProperty("lptyCode")
    public void setLptyCode(String lptyCode) {
        this.lptyCode = lptyCode;
    }

    public LanguageProficiencyDetails100QapiPost withLptyCode(String lptyCode) {
        this.lptyCode = lptyCode;
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

    public LanguageProficiencyDetails100QapiPost withLplvCode(String lplvCode) {
        this.lplvCode = lplvCode;
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

    public LanguageProficiencyDetails100QapiPost withUserId(String userId) {
        this.userId = userId;
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

    public LanguageProficiencyDetails100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public LanguageProficiencyDetails100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LanguageProficiencyDetails100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("langCode");
        sb.append('=');
        sb.append(((this.langCode == null)?"<null>":this.langCode));
        sb.append(',');
        sb.append("lptyCode");
        sb.append('=');
        sb.append(((this.lptyCode == null)?"<null>":this.lptyCode));
        sb.append(',');
        sb.append("lplvCode");
        sb.append('=');
        sb.append(((this.lplvCode == null)?"<null>":this.lplvCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.langCode == null)? 0 :this.langCode.hashCode()));
        result = ((result* 31)+((this.lplvCode == null)? 0 :this.lplvCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LanguageProficiencyDetails100QapiPost) == false) {
            return false;
        }
        LanguageProficiencyDetails100QapiPost rhs = ((LanguageProficiencyDetails100QapiPost) other);
        return ((((((((this.lptyCode == rhs.lptyCode)||((this.lptyCode!= null)&&this.lptyCode.equals(rhs.lptyCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.langCode == rhs.langCode)||((this.langCode!= null)&&this.langCode.equals(rhs.langCode))))&&((this.lplvCode == rhs.lplvCode)||((this.lplvCode!= null)&&this.lplvCode.equals(rhs.lplvCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
