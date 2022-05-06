
package com.ellucian.generated.bpapi.ban.quick_admit_students.v1_0_0;

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
    "sgbstdn",
    "sorlfos_lite",
    "sorlcur_lite",
    "spbpers",
    "spraddr",
    "gorprac"
})
@Generated("jsonschema2pojo")
public class QuickAdmitStudents100PostResponse {

    @JsonProperty("sgbstdn")
    private List<Sgbstdn> sgbstdn = new ArrayList<Sgbstdn>();
    @JsonProperty("sorlfos_lite")
    private List<SorlfosLite> sorlfosLite = new ArrayList<SorlfosLite>();
    @JsonProperty("sorlcur_lite")
    private List<SorlcurLite> sorlcurLite = new ArrayList<SorlcurLite>();
    @JsonProperty("spbpers")
    private List<Spbper> spbpers = new ArrayList<Spbper>();
    @JsonProperty("spraddr")
    private List<Spraddr> spraddr = new ArrayList<Spraddr>();
    @JsonProperty("gorprac")
    private List<Gorprac> gorprac = new ArrayList<Gorprac>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sgbstdn")
    public List<Sgbstdn> getSgbstdn() {
        return sgbstdn;
    }

    @JsonProperty("sgbstdn")
    public void setSgbstdn(List<Sgbstdn> sgbstdn) {
        this.sgbstdn = sgbstdn;
    }

    public QuickAdmitStudents100PostResponse withSgbstdn(List<Sgbstdn> sgbstdn) {
        this.sgbstdn = sgbstdn;
        return this;
    }

    @JsonProperty("sorlfos_lite")
    public List<SorlfosLite> getSorlfosLite() {
        return sorlfosLite;
    }

    @JsonProperty("sorlfos_lite")
    public void setSorlfosLite(List<SorlfosLite> sorlfosLite) {
        this.sorlfosLite = sorlfosLite;
    }

    public QuickAdmitStudents100PostResponse withSorlfosLite(List<SorlfosLite> sorlfosLite) {
        this.sorlfosLite = sorlfosLite;
        return this;
    }

    @JsonProperty("sorlcur_lite")
    public List<SorlcurLite> getSorlcurLite() {
        return sorlcurLite;
    }

    @JsonProperty("sorlcur_lite")
    public void setSorlcurLite(List<SorlcurLite> sorlcurLite) {
        this.sorlcurLite = sorlcurLite;
    }

    public QuickAdmitStudents100PostResponse withSorlcurLite(List<SorlcurLite> sorlcurLite) {
        this.sorlcurLite = sorlcurLite;
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

    public QuickAdmitStudents100PostResponse withSpbpers(List<Spbper> spbpers) {
        this.spbpers = spbpers;
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

    public QuickAdmitStudents100PostResponse withSpraddr(List<Spraddr> spraddr) {
        this.spraddr = spraddr;
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

    public QuickAdmitStudents100PostResponse withGorprac(List<Gorprac> gorprac) {
        this.gorprac = gorprac;
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

    public QuickAdmitStudents100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuickAdmitStudents100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgbstdn");
        sb.append('=');
        sb.append(((this.sgbstdn == null)?"<null>":this.sgbstdn));
        sb.append(',');
        sb.append("sorlfosLite");
        sb.append('=');
        sb.append(((this.sorlfosLite == null)?"<null>":this.sorlfosLite));
        sb.append(',');
        sb.append("sorlcurLite");
        sb.append('=');
        sb.append(((this.sorlcurLite == null)?"<null>":this.sorlcurLite));
        sb.append(',');
        sb.append("spbpers");
        sb.append('=');
        sb.append(((this.spbpers == null)?"<null>":this.spbpers));
        sb.append(',');
        sb.append("spraddr");
        sb.append('=');
        sb.append(((this.spraddr == null)?"<null>":this.spraddr));
        sb.append(',');
        sb.append("gorprac");
        sb.append('=');
        sb.append(((this.gorprac == null)?"<null>":this.gorprac));
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
        result = ((result* 31)+((this.sgbstdn == null)? 0 :this.sgbstdn.hashCode()));
        result = ((result* 31)+((this.sorlfosLite == null)? 0 :this.sorlfosLite.hashCode()));
        result = ((result* 31)+((this.gorprac == null)? 0 :this.gorprac.hashCode()));
        result = ((result* 31)+((this.spraddr == null)? 0 :this.spraddr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorlcurLite == null)? 0 :this.sorlcurLite.hashCode()));
        result = ((result* 31)+((this.spbpers == null)? 0 :this.spbpers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuickAdmitStudents100PostResponse) == false) {
            return false;
        }
        QuickAdmitStudents100PostResponse rhs = ((QuickAdmitStudents100PostResponse) other);
        return ((((((((this.sgbstdn == rhs.sgbstdn)||((this.sgbstdn!= null)&&this.sgbstdn.equals(rhs.sgbstdn)))&&((this.sorlfosLite == rhs.sorlfosLite)||((this.sorlfosLite!= null)&&this.sorlfosLite.equals(rhs.sorlfosLite))))&&((this.gorprac == rhs.gorprac)||((this.gorprac!= null)&&this.gorprac.equals(rhs.gorprac))))&&((this.spraddr == rhs.spraddr)||((this.spraddr!= null)&&this.spraddr.equals(rhs.spraddr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorlcurLite == rhs.sorlcurLite)||((this.sorlcurLite!= null)&&this.sorlcurLite.equals(rhs.sorlcurLite))))&&((this.spbpers == rhs.spbpers)||((this.spbpers!= null)&&this.spbpers.equals(rhs.spbpers))));
    }

}
