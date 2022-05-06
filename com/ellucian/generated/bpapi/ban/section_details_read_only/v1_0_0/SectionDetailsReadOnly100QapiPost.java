
package com.ellucian.generated.bpapi.ban.section_details_read_only.v1_0_0;

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
    "keyblckCrn"
})
@Generated("jsonschema2pojo")
public class SectionDetailsReadOnly100QapiPost {

    @JsonProperty("keyblocTermCodeEff")
    private String keyblocTermCodeEff;
    @JsonProperty("keyblckCrn")
    private String keyblckCrn;
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

    public SectionDetailsReadOnly100QapiPost withKeyblocTermCodeEff(String keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
        return this;
    }

    @JsonProperty("keyblckCrn")
    public String getKeyblckCrn() {
        return keyblckCrn;
    }

    @JsonProperty("keyblckCrn")
    public void setKeyblckCrn(String keyblckCrn) {
        this.keyblckCrn = keyblckCrn;
    }

    public SectionDetailsReadOnly100QapiPost withKeyblckCrn(String keyblckCrn) {
        this.keyblckCrn = keyblckCrn;
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

    public SectionDetailsReadOnly100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionDetailsReadOnly100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocTermCodeEff");
        sb.append('=');
        sb.append(((this.keyblocTermCodeEff == null)?"<null>":this.keyblocTermCodeEff));
        sb.append(',');
        sb.append("keyblckCrn");
        sb.append('=');
        sb.append(((this.keyblckCrn == null)?"<null>":this.keyblckCrn));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblocTermCodeEff == null)? 0 :this.keyblocTermCodeEff.hashCode()));
        result = ((result* 31)+((this.keyblckCrn == null)? 0 :this.keyblckCrn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionDetailsReadOnly100QapiPost) == false) {
            return false;
        }
        SectionDetailsReadOnly100QapiPost rhs = ((SectionDetailsReadOnly100QapiPost) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.keyblocTermCodeEff == rhs.keyblocTermCodeEff)||((this.keyblocTermCodeEff!= null)&&this.keyblocTermCodeEff.equals(rhs.keyblocTermCodeEff))))&&((this.keyblckCrn == rhs.keyblckCrn)||((this.keyblckCrn!= null)&&this.keyblckCrn.equals(rhs.keyblckCrn))));
    }

}
