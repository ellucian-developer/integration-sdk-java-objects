
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
    "criteria.langCode",
    "criteria.activityDate",
    "criteria.userId",
    "criteria.lptyCode",
    "langCode",
    "lplvCode",
    "id",
    "criteria.lplvCode"
})
@Generated("jsonschema2pojo")
public class LanguageProficiencyDetails100PutRequest {

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
     * Language Identifier
     * <p>
     * Lineage reference object : SORLANP_LANG_CODE, Lookup lineage reference object : stvlang
     * (Required)
     * 
     */
    @JsonProperty("criteria.langCode")
    @JsonPropertyDescription("Lineage reference object : SORLANP_LANG_CODE, Lookup lineage reference object : stvlang")
    private String criteriaLangCode;
    /**
     * Lineage reference object : SORLANP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SORLANP_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Lineage reference object : SORLANP_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SORLANP_USER_ID")
    private String criteriaUserId;
    /**
     * Proficiency Type
     * <p>
     * Lineage reference object : SORLANP_LPTY_CODE, Lookup lineage reference object : STVLPTY
     * (Required)
     * 
     */
    @JsonProperty("criteria.lptyCode")
    @JsonPropertyDescription("Lineage reference object : SORLANP_LPTY_CODE, Lookup lineage reference object : STVLPTY")
    private String criteriaLptyCode;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Proficiency Level
     * <p>
     * Lineage reference object : SORLANP_LPLV_CODE, Lookup lineage reference object : STVLPLV
     * 
     */
    @JsonProperty("criteria.lplvCode")
    @JsonPropertyDescription("Lineage reference object : SORLANP_LPLV_CODE, Lookup lineage reference object : STVLPLV")
    private String criteriaLplvCode;
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

    public LanguageProficiencyDetails100PutRequest withLptyCode(String lptyCode) {
        this.lptyCode = lptyCode;
        return this;
    }

    /**
     * Language Identifier
     * <p>
     * Lineage reference object : SORLANP_LANG_CODE, Lookup lineage reference object : stvlang
     * (Required)
     * 
     */
    @JsonProperty("criteria.langCode")
    public String getCriteriaLangCode() {
        return criteriaLangCode;
    }

    /**
     * Language Identifier
     * <p>
     * Lineage reference object : SORLANP_LANG_CODE, Lookup lineage reference object : stvlang
     * (Required)
     * 
     */
    @JsonProperty("criteria.langCode")
    public void setCriteriaLangCode(String criteriaLangCode) {
        this.criteriaLangCode = criteriaLangCode;
    }

    public LanguageProficiencyDetails100PutRequest withCriteriaLangCode(String criteriaLangCode) {
        this.criteriaLangCode = criteriaLangCode;
        return this;
    }

    /**
     * Lineage reference object : SORLANP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : SORLANP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public LanguageProficiencyDetails100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Lineage reference object : SORLANP_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : SORLANP_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public LanguageProficiencyDetails100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Proficiency Type
     * <p>
     * Lineage reference object : SORLANP_LPTY_CODE, Lookup lineage reference object : STVLPTY
     * (Required)
     * 
     */
    @JsonProperty("criteria.lptyCode")
    public String getCriteriaLptyCode() {
        return criteriaLptyCode;
    }

    /**
     * Proficiency Type
     * <p>
     * Lineage reference object : SORLANP_LPTY_CODE, Lookup lineage reference object : STVLPTY
     * (Required)
     * 
     */
    @JsonProperty("criteria.lptyCode")
    public void setCriteriaLptyCode(String criteriaLptyCode) {
        this.criteriaLptyCode = criteriaLptyCode;
    }

    public LanguageProficiencyDetails100PutRequest withCriteriaLptyCode(String criteriaLptyCode) {
        this.criteriaLptyCode = criteriaLptyCode;
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

    public LanguageProficiencyDetails100PutRequest withLangCode(String langCode) {
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

    public LanguageProficiencyDetails100PutRequest withLplvCode(String lplvCode) {
        this.lplvCode = lplvCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public LanguageProficiencyDetails100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Proficiency Level
     * <p>
     * Lineage reference object : SORLANP_LPLV_CODE, Lookup lineage reference object : STVLPLV
     * 
     */
    @JsonProperty("criteria.lplvCode")
    public String getCriteriaLplvCode() {
        return criteriaLplvCode;
    }

    /**
     * Proficiency Level
     * <p>
     * Lineage reference object : SORLANP_LPLV_CODE, Lookup lineage reference object : STVLPLV
     * 
     */
    @JsonProperty("criteria.lplvCode")
    public void setCriteriaLplvCode(String criteriaLplvCode) {
        this.criteriaLplvCode = criteriaLplvCode;
    }

    public LanguageProficiencyDetails100PutRequest withCriteriaLplvCode(String criteriaLplvCode) {
        this.criteriaLplvCode = criteriaLplvCode;
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

    public LanguageProficiencyDetails100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LanguageProficiencyDetails100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lptyCode");
        sb.append('=');
        sb.append(((this.lptyCode == null)?"<null>":this.lptyCode));
        sb.append(',');
        sb.append("criteriaLangCode");
        sb.append('=');
        sb.append(((this.criteriaLangCode == null)?"<null>":this.criteriaLangCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaLptyCode");
        sb.append('=');
        sb.append(((this.criteriaLptyCode == null)?"<null>":this.criteriaLptyCode));
        sb.append(',');
        sb.append("langCode");
        sb.append('=');
        sb.append(((this.langCode == null)?"<null>":this.langCode));
        sb.append(',');
        sb.append("lplvCode");
        sb.append('=');
        sb.append(((this.lplvCode == null)?"<null>":this.lplvCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaLplvCode");
        sb.append('=');
        sb.append(((this.criteriaLplvCode == null)?"<null>":this.criteriaLplvCode));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.lptyCode == null)? 0 :this.lptyCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.langCode == null)? 0 :this.langCode.hashCode()));
        result = ((result* 31)+((this.criteriaLplvCode == null)? 0 :this.criteriaLplvCode.hashCode()));
        result = ((result* 31)+((this.lplvCode == null)? 0 :this.lplvCode.hashCode()));
        result = ((result* 31)+((this.criteriaLptyCode == null)? 0 :this.criteriaLptyCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaLangCode == null)? 0 :this.criteriaLangCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LanguageProficiencyDetails100PutRequest) == false) {
            return false;
        }
        LanguageProficiencyDetails100PutRequest rhs = ((LanguageProficiencyDetails100PutRequest) other);
        return (((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.lptyCode == rhs.lptyCode)||((this.lptyCode!= null)&&this.lptyCode.equals(rhs.lptyCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.langCode == rhs.langCode)||((this.langCode!= null)&&this.langCode.equals(rhs.langCode))))&&((this.criteriaLplvCode == rhs.criteriaLplvCode)||((this.criteriaLplvCode!= null)&&this.criteriaLplvCode.equals(rhs.criteriaLplvCode))))&&((this.lplvCode == rhs.lplvCode)||((this.lplvCode!= null)&&this.lplvCode.equals(rhs.lplvCode))))&&((this.criteriaLptyCode == rhs.criteriaLptyCode)||((this.criteriaLptyCode!= null)&&this.criteriaLptyCode.equals(rhs.criteriaLptyCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaLangCode == rhs.criteriaLangCode)||((this.criteriaLangCode!= null)&&this.criteriaLangCode.equals(rhs.criteriaLangCode))));
    }

}
