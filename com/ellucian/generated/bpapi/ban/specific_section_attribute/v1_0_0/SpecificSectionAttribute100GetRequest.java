
package com.ellucian.generated.bpapi.ban.specific_section_attribute.v1_0_0;

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
    "keyblocTermCodeEff",
    "scbcrkyCrseNumb",
    "keyBlckSessCode",
    "keyBlckAttrCode",
    "ssbsectSubjCode",
    "keyBlckCampCode"
})
@Generated("jsonschema2pojo")
public class SpecificSectionAttribute100GetRequest {

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm")
    private Object keyblocTermCodeEff;
    /**
     * Course
     * <p>
     * Lineage reference object : scbcrkyCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scbcrkyCrseNumb")
    @JsonPropertyDescription("Lineage reference object : scbcrkyCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private Object scbcrkyCrseNumb;
    /**
     * Session
     * <p>
     * Lineage reference object : keyBlckSessCode, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("keyBlckSessCode")
    @JsonPropertyDescription("Lineage reference object : keyBlckSessCode, Lookup lineage reference object : stvsess")
    private Object keyBlckSessCode;
    /**
     * Attribute
     * <p>
     * Lineage reference object : keyBlckAttrCode, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("keyBlckAttrCode")
    @JsonPropertyDescription("Lineage reference object : keyBlckAttrCode, Lookup lineage reference object : stvattr")
    private Object keyBlckAttrCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : ssbsectSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    @JsonPropertyDescription("Lineage reference object : ssbsectSubjCode, Lookup lineage reference object : stvsubj")
    private Object ssbsectSubjCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : keyBlckCampCode, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("keyBlckCampCode")
    @JsonPropertyDescription("Lineage reference object : keyBlckCampCode, Lookup lineage reference object : stvcamp")
    private Object keyBlckCampCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    public Object getKeyblocTermCodeEff() {
        return keyblocTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    public void setKeyblocTermCodeEff(Object keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
    }

    public SpecificSectionAttribute100GetRequest withKeyblocTermCodeEff(Object keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scbcrkyCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scbcrkyCrseNumb")
    public Object getScbcrkyCrseNumb() {
        return scbcrkyCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scbcrkyCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scbcrkyCrseNumb")
    public void setScbcrkyCrseNumb(Object scbcrkyCrseNumb) {
        this.scbcrkyCrseNumb = scbcrkyCrseNumb;
    }

    public SpecificSectionAttribute100GetRequest withScbcrkyCrseNumb(Object scbcrkyCrseNumb) {
        this.scbcrkyCrseNumb = scbcrkyCrseNumb;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : keyBlckSessCode, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("keyBlckSessCode")
    public Object getKeyBlckSessCode() {
        return keyBlckSessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : keyBlckSessCode, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("keyBlckSessCode")
    public void setKeyBlckSessCode(Object keyBlckSessCode) {
        this.keyBlckSessCode = keyBlckSessCode;
    }

    public SpecificSectionAttribute100GetRequest withKeyBlckSessCode(Object keyBlckSessCode) {
        this.keyBlckSessCode = keyBlckSessCode;
        return this;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : keyBlckAttrCode, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("keyBlckAttrCode")
    public Object getKeyBlckAttrCode() {
        return keyBlckAttrCode;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : keyBlckAttrCode, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("keyBlckAttrCode")
    public void setKeyBlckAttrCode(Object keyBlckAttrCode) {
        this.keyBlckAttrCode = keyBlckAttrCode;
    }

    public SpecificSectionAttribute100GetRequest withKeyBlckAttrCode(Object keyBlckAttrCode) {
        this.keyBlckAttrCode = keyBlckAttrCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : ssbsectSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public Object getSsbsectSubjCode() {
        return ssbsectSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : ssbsectSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public void setSsbsectSubjCode(Object ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
    }

    public SpecificSectionAttribute100GetRequest withSsbsectSubjCode(Object ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : keyBlckCampCode, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("keyBlckCampCode")
    public Object getKeyBlckCampCode() {
        return keyBlckCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : keyBlckCampCode, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("keyBlckCampCode")
    public void setKeyBlckCampCode(Object keyBlckCampCode) {
        this.keyBlckCampCode = keyBlckCampCode;
    }

    public SpecificSectionAttribute100GetRequest withKeyBlckCampCode(Object keyBlckCampCode) {
        this.keyBlckCampCode = keyBlckCampCode;
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

    public SpecificSectionAttribute100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpecificSectionAttribute100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocTermCodeEff");
        sb.append('=');
        sb.append(((this.keyblocTermCodeEff == null)?"<null>":this.keyblocTermCodeEff));
        sb.append(',');
        sb.append("scbcrkyCrseNumb");
        sb.append('=');
        sb.append(((this.scbcrkyCrseNumb == null)?"<null>":this.scbcrkyCrseNumb));
        sb.append(',');
        sb.append("keyBlckSessCode");
        sb.append('=');
        sb.append(((this.keyBlckSessCode == null)?"<null>":this.keyBlckSessCode));
        sb.append(',');
        sb.append("keyBlckAttrCode");
        sb.append('=');
        sb.append(((this.keyBlckAttrCode == null)?"<null>":this.keyBlckAttrCode));
        sb.append(',');
        sb.append("ssbsectSubjCode");
        sb.append('=');
        sb.append(((this.ssbsectSubjCode == null)?"<null>":this.ssbsectSubjCode));
        sb.append(',');
        sb.append("keyBlckCampCode");
        sb.append('=');
        sb.append(((this.keyBlckCampCode == null)?"<null>":this.keyBlckCampCode));
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
        result = ((result* 31)+((this.keyblocTermCodeEff == null)? 0 :this.keyblocTermCodeEff.hashCode()));
        result = ((result* 31)+((this.scbcrkyCrseNumb == null)? 0 :this.scbcrkyCrseNumb.hashCode()));
        result = ((result* 31)+((this.keyBlckSessCode == null)? 0 :this.keyBlckSessCode.hashCode()));
        result = ((result* 31)+((this.keyBlckAttrCode == null)? 0 :this.keyBlckAttrCode.hashCode()));
        result = ((result* 31)+((this.ssbsectSubjCode == null)? 0 :this.ssbsectSubjCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyBlckCampCode == null)? 0 :this.keyBlckCampCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpecificSectionAttribute100GetRequest) == false) {
            return false;
        }
        SpecificSectionAttribute100GetRequest rhs = ((SpecificSectionAttribute100GetRequest) other);
        return ((((((((this.keyblocTermCodeEff == rhs.keyblocTermCodeEff)||((this.keyblocTermCodeEff!= null)&&this.keyblocTermCodeEff.equals(rhs.keyblocTermCodeEff)))&&((this.scbcrkyCrseNumb == rhs.scbcrkyCrseNumb)||((this.scbcrkyCrseNumb!= null)&&this.scbcrkyCrseNumb.equals(rhs.scbcrkyCrseNumb))))&&((this.keyBlckSessCode == rhs.keyBlckSessCode)||((this.keyBlckSessCode!= null)&&this.keyBlckSessCode.equals(rhs.keyBlckSessCode))))&&((this.keyBlckAttrCode == rhs.keyBlckAttrCode)||((this.keyBlckAttrCode!= null)&&this.keyBlckAttrCode.equals(rhs.keyBlckAttrCode))))&&((this.ssbsectSubjCode == rhs.ssbsectSubjCode)||((this.ssbsectSubjCode!= null)&&this.ssbsectSubjCode.equals(rhs.ssbsectSubjCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyBlckCampCode == rhs.keyBlckCampCode)||((this.keyBlckCampCode!= null)&&this.keyBlckCampCode.equals(rhs.keyBlckCampCode))));
    }

}
