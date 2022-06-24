
package com.ellucian.generated.bpapi.ban.complementary_activities_program_rules.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "sobcarp",
    "sorcacr",
    "sorcaar"
})
@Generated("jsonschema2pojo")
public class ComplementaryActivitiesProgramRules100PostResponse {

    @JsonProperty("sobcarp")
    private List<Sobcarp__1> sobcarp = new ArrayList<Sobcarp__1>();
    @JsonProperty("sorcacr")
    private List<Sorcacr__1> sorcacr = new ArrayList<Sorcacr__1>();
    @JsonProperty("sorcaar")
    private List<Sorcaar__1> sorcaar = new ArrayList<Sorcaar__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sobcarp")
    public List<Sobcarp__1> getSobcarp() {
        return sobcarp;
    }

    @JsonProperty("sobcarp")
    public void setSobcarp(List<Sobcarp__1> sobcarp) {
        this.sobcarp = sobcarp;
    }

    public ComplementaryActivitiesProgramRules100PostResponse withSobcarp(List<Sobcarp__1> sobcarp) {
        this.sobcarp = sobcarp;
        return this;
    }

    @JsonProperty("sorcacr")
    public List<Sorcacr__1> getSorcacr() {
        return sorcacr;
    }

    @JsonProperty("sorcacr")
    public void setSorcacr(List<Sorcacr__1> sorcacr) {
        this.sorcacr = sorcacr;
    }

    public ComplementaryActivitiesProgramRules100PostResponse withSorcacr(List<Sorcacr__1> sorcacr) {
        this.sorcacr = sorcacr;
        return this;
    }

    @JsonProperty("sorcaar")
    public List<Sorcaar__1> getSorcaar() {
        return sorcaar;
    }

    @JsonProperty("sorcaar")
    public void setSorcaar(List<Sorcaar__1> sorcaar) {
        this.sorcaar = sorcaar;
    }

    public ComplementaryActivitiesProgramRules100PostResponse withSorcaar(List<Sorcaar__1> sorcaar) {
        this.sorcaar = sorcaar;
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

    public ComplementaryActivitiesProgramRules100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplementaryActivitiesProgramRules100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sobcarp");
        sb.append('=');
        sb.append(((this.sobcarp == null)?"<null>":this.sobcarp));
        sb.append(',');
        sb.append("sorcacr");
        sb.append('=');
        sb.append(((this.sorcacr == null)?"<null>":this.sorcacr));
        sb.append(',');
        sb.append("sorcaar");
        sb.append('=');
        sb.append(((this.sorcaar == null)?"<null>":this.sorcaar));
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
        result = ((result* 31)+((this.sobcarp == null)? 0 :this.sobcarp.hashCode()));
        result = ((result* 31)+((this.sorcacr == null)? 0 :this.sorcacr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorcaar == null)? 0 :this.sorcaar.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplementaryActivitiesProgramRules100PostResponse) == false) {
            return false;
        }
        ComplementaryActivitiesProgramRules100PostResponse rhs = ((ComplementaryActivitiesProgramRules100PostResponse) other);
        return (((((this.sobcarp == rhs.sobcarp)||((this.sobcarp!= null)&&this.sobcarp.equals(rhs.sobcarp)))&&((this.sorcacr == rhs.sorcacr)||((this.sorcacr!= null)&&this.sorcacr.equals(rhs.sorcacr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorcaar == rhs.sorcaar)||((this.sorcaar!= null)&&this.sorcaar.equals(rhs.sorcaar))));
    }

}
