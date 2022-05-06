
package com.ellucian.generated.bpapi.ban.general_person_identification.v1_0_0;

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
    "spriden_current",
    "spriden_previous",
    "spraddr",
    "sprtele",
    "spbpers",
    "gorprac",
    "goremal",
    "spremrg",
    "goradid"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentification100GetResponse {

    @JsonProperty("spriden_current")
    private List<SpridenCurrent> spridenCurrent = new ArrayList<SpridenCurrent>();
    @JsonProperty("spriden_previous")
    private List<SpridenPreviou> spridenPrevious = new ArrayList<SpridenPreviou>();
    @JsonProperty("spraddr")
    private List<Spraddr> spraddr = new ArrayList<Spraddr>();
    @JsonProperty("sprtele")
    private List<Sprtele> sprtele = new ArrayList<Sprtele>();
    @JsonProperty("spbpers")
    private List<Spbper> spbpers = new ArrayList<Spbper>();
    @JsonProperty("gorprac")
    private List<Gorprac> gorprac = new ArrayList<Gorprac>();
    @JsonProperty("goremal")
    private List<Goremal> goremal = new ArrayList<Goremal>();
    @JsonProperty("spremrg")
    private List<Spremrg> spremrg = new ArrayList<Spremrg>();
    @JsonProperty("goradid")
    private List<Goradid> goradid = new ArrayList<Goradid>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("spriden_current")
    public List<SpridenCurrent> getSpridenCurrent() {
        return spridenCurrent;
    }

    @JsonProperty("spriden_current")
    public void setSpridenCurrent(List<SpridenCurrent> spridenCurrent) {
        this.spridenCurrent = spridenCurrent;
    }

    public GeneralPersonIdentification100GetResponse withSpridenCurrent(List<SpridenCurrent> spridenCurrent) {
        this.spridenCurrent = spridenCurrent;
        return this;
    }

    @JsonProperty("spriden_previous")
    public List<SpridenPreviou> getSpridenPrevious() {
        return spridenPrevious;
    }

    @JsonProperty("spriden_previous")
    public void setSpridenPrevious(List<SpridenPreviou> spridenPrevious) {
        this.spridenPrevious = spridenPrevious;
    }

    public GeneralPersonIdentification100GetResponse withSpridenPrevious(List<SpridenPreviou> spridenPrevious) {
        this.spridenPrevious = spridenPrevious;
        return this;
    }

    @JsonProperty("spraddr")
    public List<Spraddr> getSpraddr() {
        return spraddr;
    }

    @JsonProperty("spraddr")
    public void setSpraddr(List<Spraddr> spraddr) {
        this.spraddr = spraddr;
    }

    public GeneralPersonIdentification100GetResponse withSpraddr(List<Spraddr> spraddr) {
        this.spraddr = spraddr;
        return this;
    }

    @JsonProperty("sprtele")
    public List<Sprtele> getSprtele() {
        return sprtele;
    }

    @JsonProperty("sprtele")
    public void setSprtele(List<Sprtele> sprtele) {
        this.sprtele = sprtele;
    }

    public GeneralPersonIdentification100GetResponse withSprtele(List<Sprtele> sprtele) {
        this.sprtele = sprtele;
        return this;
    }

    @JsonProperty("spbpers")
    public List<Spbper> getSpbpers() {
        return spbpers;
    }

    @JsonProperty("spbpers")
    public void setSpbpers(List<Spbper> spbpers) {
        this.spbpers = spbpers;
    }

    public GeneralPersonIdentification100GetResponse withSpbpers(List<Spbper> spbpers) {
        this.spbpers = spbpers;
        return this;
    }

    @JsonProperty("gorprac")
    public List<Gorprac> getGorprac() {
        return gorprac;
    }

    @JsonProperty("gorprac")
    public void setGorprac(List<Gorprac> gorprac) {
        this.gorprac = gorprac;
    }

    public GeneralPersonIdentification100GetResponse withGorprac(List<Gorprac> gorprac) {
        this.gorprac = gorprac;
        return this;
    }

    @JsonProperty("goremal")
    public List<Goremal> getGoremal() {
        return goremal;
    }

    @JsonProperty("goremal")
    public void setGoremal(List<Goremal> goremal) {
        this.goremal = goremal;
    }

    public GeneralPersonIdentification100GetResponse withGoremal(List<Goremal> goremal) {
        this.goremal = goremal;
        return this;
    }

    @JsonProperty("spremrg")
    public List<Spremrg> getSpremrg() {
        return spremrg;
    }

    @JsonProperty("spremrg")
    public void setSpremrg(List<Spremrg> spremrg) {
        this.spremrg = spremrg;
    }

    public GeneralPersonIdentification100GetResponse withSpremrg(List<Spremrg> spremrg) {
        this.spremrg = spremrg;
        return this;
    }

    @JsonProperty("goradid")
    public List<Goradid> getGoradid() {
        return goradid;
    }

    @JsonProperty("goradid")
    public void setGoradid(List<Goradid> goradid) {
        this.goradid = goradid;
    }

    public GeneralPersonIdentification100GetResponse withGoradid(List<Goradid> goradid) {
        this.goradid = goradid;
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

    public GeneralPersonIdentification100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentification100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spridenCurrent");
        sb.append('=');
        sb.append(((this.spridenCurrent == null)?"<null>":this.spridenCurrent));
        sb.append(',');
        sb.append("spridenPrevious");
        sb.append('=');
        sb.append(((this.spridenPrevious == null)?"<null>":this.spridenPrevious));
        sb.append(',');
        sb.append("spraddr");
        sb.append('=');
        sb.append(((this.spraddr == null)?"<null>":this.spraddr));
        sb.append(',');
        sb.append("sprtele");
        sb.append('=');
        sb.append(((this.sprtele == null)?"<null>":this.sprtele));
        sb.append(',');
        sb.append("spbpers");
        sb.append('=');
        sb.append(((this.spbpers == null)?"<null>":this.spbpers));
        sb.append(',');
        sb.append("gorprac");
        sb.append('=');
        sb.append(((this.gorprac == null)?"<null>":this.gorprac));
        sb.append(',');
        sb.append("goremal");
        sb.append('=');
        sb.append(((this.goremal == null)?"<null>":this.goremal));
        sb.append(',');
        sb.append("spremrg");
        sb.append('=');
        sb.append(((this.spremrg == null)?"<null>":this.spremrg));
        sb.append(',');
        sb.append("goradid");
        sb.append('=');
        sb.append(((this.goradid == null)?"<null>":this.goradid));
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
        result = ((result* 31)+((this.spridenCurrent == null)? 0 :this.spridenCurrent.hashCode()));
        result = ((result* 31)+((this.spridenPrevious == null)? 0 :this.spridenPrevious.hashCode()));
        result = ((result* 31)+((this.spremrg == null)? 0 :this.spremrg.hashCode()));
        result = ((result* 31)+((this.sprtele == null)? 0 :this.sprtele.hashCode()));
        result = ((result* 31)+((this.goradid == null)? 0 :this.goradid.hashCode()));
        result = ((result* 31)+((this.gorprac == null)? 0 :this.gorprac.hashCode()));
        result = ((result* 31)+((this.spraddr == null)? 0 :this.spraddr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.goremal == null)? 0 :this.goremal.hashCode()));
        result = ((result* 31)+((this.spbpers == null)? 0 :this.spbpers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralPersonIdentification100GetResponse) == false) {
            return false;
        }
        GeneralPersonIdentification100GetResponse rhs = ((GeneralPersonIdentification100GetResponse) other);
        return (((((((((((this.spridenCurrent == rhs.spridenCurrent)||((this.spridenCurrent!= null)&&this.spridenCurrent.equals(rhs.spridenCurrent)))&&((this.spridenPrevious == rhs.spridenPrevious)||((this.spridenPrevious!= null)&&this.spridenPrevious.equals(rhs.spridenPrevious))))&&((this.spremrg == rhs.spremrg)||((this.spremrg!= null)&&this.spremrg.equals(rhs.spremrg))))&&((this.sprtele == rhs.sprtele)||((this.sprtele!= null)&&this.sprtele.equals(rhs.sprtele))))&&((this.goradid == rhs.goradid)||((this.goradid!= null)&&this.goradid.equals(rhs.goradid))))&&((this.gorprac == rhs.gorprac)||((this.gorprac!= null)&&this.gorprac.equals(rhs.gorprac))))&&((this.spraddr == rhs.spraddr)||((this.spraddr!= null)&&this.spraddr.equals(rhs.spraddr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.goremal == rhs.goremal)||((this.goremal!= null)&&this.goremal.equals(rhs.goremal))))&&((this.spbpers == rhs.spbpers)||((this.spbpers!= null)&&this.spbpers.equals(rhs.spbpers))));
    }

}
