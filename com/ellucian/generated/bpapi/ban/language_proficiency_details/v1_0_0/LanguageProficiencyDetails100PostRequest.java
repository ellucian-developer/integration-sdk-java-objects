
package com.ellucian.generated.bpapi.ban.language_proficiency_details.v1_0_0;

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
    "langCode",
    "lplvCode",
    "id"
})
@Generated("jsonschema2pojo")
public class LanguageProficiencyDetails100PostRequest {

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

    public LanguageProficiencyDetails100PostRequest withLptyCode(String lptyCode) {
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

    public LanguageProficiencyDetails100PostRequest withLangCode(String langCode) {
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

    public LanguageProficiencyDetails100PostRequest withLplvCode(String lplvCode) {
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

    public LanguageProficiencyDetails100PostRequest withId(String id) {
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

    public LanguageProficiencyDetails100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LanguageProficiencyDetails100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lptyCode");
        sb.append('=');
        sb.append(((this.lptyCode == null)?"<null>":this.lptyCode));
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
        result = ((result* 31)+((this.lplvCode == null)? 0 :this.lplvCode.hashCode()));
        result = ((result* 31)+((this.lptyCode == null)? 0 :this.lptyCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.langCode == null)? 0 :this.langCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LanguageProficiencyDetails100PostRequest) == false) {
            return false;
        }
        LanguageProficiencyDetails100PostRequest rhs = ((LanguageProficiencyDetails100PostRequest) other);
        return ((((((this.lplvCode == rhs.lplvCode)||((this.lplvCode!= null)&&this.lplvCode.equals(rhs.lplvCode)))&&((this.lptyCode == rhs.lptyCode)||((this.lptyCode!= null)&&this.lptyCode.equals(rhs.lptyCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.langCode == rhs.langCode)||((this.langCode!= null)&&this.langCode.equals(rhs.langCode))));
    }

}
