
package com.ellucian.generated.bpapi.ban.specific_section_attribute.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "keyblocTermCodeEff",
    "ssbsectSubjCode",
    "scbcrkyCrseNumb",
    "keyBlckCampCode",
    "keyBlckSessCode",
    "keyBlckAttrCode"
})
@Generated("jsonschema2pojo")
public class SpecificSectionAttribute100QapiPost {

    @JsonProperty("keyblocTermCodeEff")
    private String keyblocTermCodeEff;
    @JsonProperty("ssbsectSubjCode")
    private String ssbsectSubjCode;
    @JsonProperty("scbcrkyCrseNumb")
    private String scbcrkyCrseNumb;
    @JsonProperty("keyBlckCampCode")
    private String keyBlckCampCode;
    @JsonProperty("keyBlckSessCode")
    private String keyBlckSessCode;
    @JsonProperty("keyBlckAttrCode")
    private String keyBlckAttrCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblocTermCodeEff")
    public String getKeyblocTermCodeEff() {
        return keyblocTermCodeEff;
    }

    @JsonProperty("keyblocTermCodeEff")
    public void setKeyblocTermCodeEff(String keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
    }

    public SpecificSectionAttribute100QapiPost withKeyblocTermCodeEff(String keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
        return this;
    }

    @JsonProperty("ssbsectSubjCode")
    public String getSsbsectSubjCode() {
        return ssbsectSubjCode;
    }

    @JsonProperty("ssbsectSubjCode")
    public void setSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
    }

    public SpecificSectionAttribute100QapiPost withSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
        return this;
    }

    @JsonProperty("scbcrkyCrseNumb")
    public String getScbcrkyCrseNumb() {
        return scbcrkyCrseNumb;
    }

    @JsonProperty("scbcrkyCrseNumb")
    public void setScbcrkyCrseNumb(String scbcrkyCrseNumb) {
        this.scbcrkyCrseNumb = scbcrkyCrseNumb;
    }

    public SpecificSectionAttribute100QapiPost withScbcrkyCrseNumb(String scbcrkyCrseNumb) {
        this.scbcrkyCrseNumb = scbcrkyCrseNumb;
        return this;
    }

    @JsonProperty("keyBlckCampCode")
    public String getKeyBlckCampCode() {
        return keyBlckCampCode;
    }

    @JsonProperty("keyBlckCampCode")
    public void setKeyBlckCampCode(String keyBlckCampCode) {
        this.keyBlckCampCode = keyBlckCampCode;
    }

    public SpecificSectionAttribute100QapiPost withKeyBlckCampCode(String keyBlckCampCode) {
        this.keyBlckCampCode = keyBlckCampCode;
        return this;
    }

    @JsonProperty("keyBlckSessCode")
    public String getKeyBlckSessCode() {
        return keyBlckSessCode;
    }

    @JsonProperty("keyBlckSessCode")
    public void setKeyBlckSessCode(String keyBlckSessCode) {
        this.keyBlckSessCode = keyBlckSessCode;
    }

    public SpecificSectionAttribute100QapiPost withKeyBlckSessCode(String keyBlckSessCode) {
        this.keyBlckSessCode = keyBlckSessCode;
        return this;
    }

    @JsonProperty("keyBlckAttrCode")
    public String getKeyBlckAttrCode() {
        return keyBlckAttrCode;
    }

    @JsonProperty("keyBlckAttrCode")
    public void setKeyBlckAttrCode(String keyBlckAttrCode) {
        this.keyBlckAttrCode = keyBlckAttrCode;
    }

    public SpecificSectionAttribute100QapiPost withKeyBlckAttrCode(String keyBlckAttrCode) {
        this.keyBlckAttrCode = keyBlckAttrCode;
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

    public SpecificSectionAttribute100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpecificSectionAttribute100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocTermCodeEff");
        sb.append('=');
        sb.append(((this.keyblocTermCodeEff == null)?"<null>":this.keyblocTermCodeEff));
        sb.append(',');
        sb.append("ssbsectSubjCode");
        sb.append('=');
        sb.append(((this.ssbsectSubjCode == null)?"<null>":this.ssbsectSubjCode));
        sb.append(',');
        sb.append("scbcrkyCrseNumb");
        sb.append('=');
        sb.append(((this.scbcrkyCrseNumb == null)?"<null>":this.scbcrkyCrseNumb));
        sb.append(',');
        sb.append("keyBlckCampCode");
        sb.append('=');
        sb.append(((this.keyBlckCampCode == null)?"<null>":this.keyBlckCampCode));
        sb.append(',');
        sb.append("keyBlckSessCode");
        sb.append('=');
        sb.append(((this.keyBlckSessCode == null)?"<null>":this.keyBlckSessCode));
        sb.append(',');
        sb.append("keyBlckAttrCode");
        sb.append('=');
        sb.append(((this.keyBlckAttrCode == null)?"<null>":this.keyBlckAttrCode));
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
        if ((other instanceof SpecificSectionAttribute100QapiPost) == false) {
            return false;
        }
        SpecificSectionAttribute100QapiPost rhs = ((SpecificSectionAttribute100QapiPost) other);
        return ((((((((this.keyblocTermCodeEff == rhs.keyblocTermCodeEff)||((this.keyblocTermCodeEff!= null)&&this.keyblocTermCodeEff.equals(rhs.keyblocTermCodeEff)))&&((this.scbcrkyCrseNumb == rhs.scbcrkyCrseNumb)||((this.scbcrkyCrseNumb!= null)&&this.scbcrkyCrseNumb.equals(rhs.scbcrkyCrseNumb))))&&((this.keyBlckSessCode == rhs.keyBlckSessCode)||((this.keyBlckSessCode!= null)&&this.keyBlckSessCode.equals(rhs.keyBlckSessCode))))&&((this.keyBlckAttrCode == rhs.keyBlckAttrCode)||((this.keyBlckAttrCode!= null)&&this.keyBlckAttrCode.equals(rhs.keyBlckAttrCode))))&&((this.ssbsectSubjCode == rhs.ssbsectSubjCode)||((this.ssbsectSubjCode!= null)&&this.ssbsectSubjCode.equals(rhs.ssbsectSubjCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyBlckCampCode == rhs.keyBlckCampCode)||((this.keyBlckCampCode!= null)&&this.keyBlckCampCode.equals(rhs.keyBlckCampCode))));
    }

}
