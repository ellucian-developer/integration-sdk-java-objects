
package com.ellucian.generated.bpapi.ban.translation_manager_languages.v1_0_0;

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
    "lengthSemantics",
    "activityDate",
    "langDesc",
    "oraNlsChst",
    "langCode",
    "oraNlsLang",
    "oraNlsTerr",
    "userId"
})
@Generated("jsonschema2pojo")
public class TranslationManagerLanguages100GetResponse {

    /**
     * Lineage reference object : GTVLANG_LENGTH_SEMANTICS
     * 
     */
    @JsonProperty("lengthSemantics")
    @JsonPropertyDescription("Lineage reference object : GTVLANG_LENGTH_SEMANTICS")
    private String lengthSemantics;
    /**
     * Lineage reference object : GTVLANG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVLANG_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : GTVLANG_DESC
     * 
     */
    @JsonProperty("langDesc")
    @JsonPropertyDescription("Lineage reference object : GTVLANG_DESC")
    private String langDesc;
    /**
     * Lineage reference object : GTVLANG_ORA_NLS_CHST, Lookup lineage reference object : v,nls_valid_values
     * 
     */
    @JsonProperty("oraNlsChst")
    @JsonPropertyDescription("Lineage reference object : GTVLANG_ORA_NLS_CHST, Lookup lineage reference object : v,nls_valid_values")
    private String oraNlsChst;
    /**
     * Lineage reference object : GTVLANG_CODE
     * (Required)
     * 
     */
    @JsonProperty("langCode")
    @JsonPropertyDescription("Lineage reference object : GTVLANG_CODE")
    private String langCode;
    /**
     * Lineage reference object : GTVLANG_ORA_NLS_LANG, Lookup lineage reference object : v,nls_valid_values
     * 
     */
    @JsonProperty("oraNlsLang")
    @JsonPropertyDescription("Lineage reference object : GTVLANG_ORA_NLS_LANG, Lookup lineage reference object : v,nls_valid_values")
    private String oraNlsLang;
    /**
     * Lineage reference object : GTVLANG_ORA_NLS_TERR, Lookup lineage reference object : v,nls_valid_values
     * 
     */
    @JsonProperty("oraNlsTerr")
    @JsonPropertyDescription("Lineage reference object : GTVLANG_ORA_NLS_TERR, Lookup lineage reference object : v,nls_valid_values")
    private String oraNlsTerr;
    /**
     * Lineage reference object : GTVLANG_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GTVLANG_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : GTVLANG_LENGTH_SEMANTICS
     * 
     */
    @JsonProperty("lengthSemantics")
    public String getLengthSemantics() {
        return lengthSemantics;
    }

    /**
     * Lineage reference object : GTVLANG_LENGTH_SEMANTICS
     * 
     */
    @JsonProperty("lengthSemantics")
    public void setLengthSemantics(String lengthSemantics) {
        this.lengthSemantics = lengthSemantics;
    }

    public TranslationManagerLanguages100GetResponse withLengthSemantics(String lengthSemantics) {
        this.lengthSemantics = lengthSemantics;
        return this;
    }

    /**
     * Lineage reference object : GTVLANG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : GTVLANG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public TranslationManagerLanguages100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : GTVLANG_DESC
     * 
     */
    @JsonProperty("langDesc")
    public String getLangDesc() {
        return langDesc;
    }

    /**
     * Lineage reference object : GTVLANG_DESC
     * 
     */
    @JsonProperty("langDesc")
    public void setLangDesc(String langDesc) {
        this.langDesc = langDesc;
    }

    public TranslationManagerLanguages100GetResponse withLangDesc(String langDesc) {
        this.langDesc = langDesc;
        return this;
    }

    /**
     * Lineage reference object : GTVLANG_ORA_NLS_CHST, Lookup lineage reference object : v,nls_valid_values
     * 
     */
    @JsonProperty("oraNlsChst")
    public String getOraNlsChst() {
        return oraNlsChst;
    }

    /**
     * Lineage reference object : GTVLANG_ORA_NLS_CHST, Lookup lineage reference object : v,nls_valid_values
     * 
     */
    @JsonProperty("oraNlsChst")
    public void setOraNlsChst(String oraNlsChst) {
        this.oraNlsChst = oraNlsChst;
    }

    public TranslationManagerLanguages100GetResponse withOraNlsChst(String oraNlsChst) {
        this.oraNlsChst = oraNlsChst;
        return this;
    }

    /**
     * Lineage reference object : GTVLANG_CODE
     * (Required)
     * 
     */
    @JsonProperty("langCode")
    public String getLangCode() {
        return langCode;
    }

    /**
     * Lineage reference object : GTVLANG_CODE
     * (Required)
     * 
     */
    @JsonProperty("langCode")
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public TranslationManagerLanguages100GetResponse withLangCode(String langCode) {
        this.langCode = langCode;
        return this;
    }

    /**
     * Lineage reference object : GTVLANG_ORA_NLS_LANG, Lookup lineage reference object : v,nls_valid_values
     * 
     */
    @JsonProperty("oraNlsLang")
    public String getOraNlsLang() {
        return oraNlsLang;
    }

    /**
     * Lineage reference object : GTVLANG_ORA_NLS_LANG, Lookup lineage reference object : v,nls_valid_values
     * 
     */
    @JsonProperty("oraNlsLang")
    public void setOraNlsLang(String oraNlsLang) {
        this.oraNlsLang = oraNlsLang;
    }

    public TranslationManagerLanguages100GetResponse withOraNlsLang(String oraNlsLang) {
        this.oraNlsLang = oraNlsLang;
        return this;
    }

    /**
     * Lineage reference object : GTVLANG_ORA_NLS_TERR, Lookup lineage reference object : v,nls_valid_values
     * 
     */
    @JsonProperty("oraNlsTerr")
    public String getOraNlsTerr() {
        return oraNlsTerr;
    }

    /**
     * Lineage reference object : GTVLANG_ORA_NLS_TERR, Lookup lineage reference object : v,nls_valid_values
     * 
     */
    @JsonProperty("oraNlsTerr")
    public void setOraNlsTerr(String oraNlsTerr) {
        this.oraNlsTerr = oraNlsTerr;
    }

    public TranslationManagerLanguages100GetResponse withOraNlsTerr(String oraNlsTerr) {
        this.oraNlsTerr = oraNlsTerr;
        return this;
    }

    /**
     * Lineage reference object : GTVLANG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : GTVLANG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TranslationManagerLanguages100GetResponse withUserId(String userId) {
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

    public TranslationManagerLanguages100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TranslationManagerLanguages100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lengthSemantics");
        sb.append('=');
        sb.append(((this.lengthSemantics == null)?"<null>":this.lengthSemantics));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("langDesc");
        sb.append('=');
        sb.append(((this.langDesc == null)?"<null>":this.langDesc));
        sb.append(',');
        sb.append("oraNlsChst");
        sb.append('=');
        sb.append(((this.oraNlsChst == null)?"<null>":this.oraNlsChst));
        sb.append(',');
        sb.append("langCode");
        sb.append('=');
        sb.append(((this.langCode == null)?"<null>":this.langCode));
        sb.append(',');
        sb.append("oraNlsLang");
        sb.append('=');
        sb.append(((this.oraNlsLang == null)?"<null>":this.oraNlsLang));
        sb.append(',');
        sb.append("oraNlsTerr");
        sb.append('=');
        sb.append(((this.oraNlsTerr == null)?"<null>":this.oraNlsTerr));
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
        result = ((result* 31)+((this.lengthSemantics == null)? 0 :this.lengthSemantics.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.langDesc == null)? 0 :this.langDesc.hashCode()));
        result = ((result* 31)+((this.oraNlsChst == null)? 0 :this.oraNlsChst.hashCode()));
        result = ((result* 31)+((this.langCode == null)? 0 :this.langCode.hashCode()));
        result = ((result* 31)+((this.oraNlsLang == null)? 0 :this.oraNlsLang.hashCode()));
        result = ((result* 31)+((this.oraNlsTerr == null)? 0 :this.oraNlsTerr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TranslationManagerLanguages100GetResponse) == false) {
            return false;
        }
        TranslationManagerLanguages100GetResponse rhs = ((TranslationManagerLanguages100GetResponse) other);
        return ((((((((((this.lengthSemantics == rhs.lengthSemantics)||((this.lengthSemantics!= null)&&this.lengthSemantics.equals(rhs.lengthSemantics)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.langDesc == rhs.langDesc)||((this.langDesc!= null)&&this.langDesc.equals(rhs.langDesc))))&&((this.oraNlsChst == rhs.oraNlsChst)||((this.oraNlsChst!= null)&&this.oraNlsChst.equals(rhs.oraNlsChst))))&&((this.langCode == rhs.langCode)||((this.langCode!= null)&&this.langCode.equals(rhs.langCode))))&&((this.oraNlsLang == rhs.oraNlsLang)||((this.oraNlsLang!= null)&&this.oraNlsLang.equals(rhs.oraNlsLang))))&&((this.oraNlsTerr == rhs.oraNlsTerr)||((this.oraNlsTerr!= null)&&this.oraNlsTerr.equals(rhs.oraNlsTerr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
