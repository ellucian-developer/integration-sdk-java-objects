
package com.ellucian.generated.bpapi.ban.course_registration_restrictions.v1_0_0;

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
    "scrrdep",
    "scrrmaj",
    "scrrcls",
    "scrrlvl",
    "scrrdeg",
    "scrrprg",
    "scrrcam",
    "scrrcol",
    "scrrchr",
    "scrratt"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationRestrictions100GetResponse {

    @JsonProperty("scrrdep")
    private List<Scrrdep> scrrdep = new ArrayList<Scrrdep>();
    @JsonProperty("scrrmaj")
    private List<Scrrmaj> scrrmaj = new ArrayList<Scrrmaj>();
    @JsonProperty("scrrcls")
    private List<Scrrcl> scrrcls = new ArrayList<Scrrcl>();
    @JsonProperty("scrrlvl")
    private List<Scrrlvl> scrrlvl = new ArrayList<Scrrlvl>();
    @JsonProperty("scrrdeg")
    private List<Scrrdeg> scrrdeg = new ArrayList<Scrrdeg>();
    @JsonProperty("scrrprg")
    private List<Scrrprg> scrrprg = new ArrayList<Scrrprg>();
    @JsonProperty("scrrcam")
    private List<Scrrcam> scrrcam = new ArrayList<Scrrcam>();
    @JsonProperty("scrrcol")
    private List<Scrrcol> scrrcol = new ArrayList<Scrrcol>();
    @JsonProperty("scrrchr")
    private List<Scrrchr> scrrchr = new ArrayList<Scrrchr>();
    @JsonProperty("scrratt")
    private List<Scrratt> scrratt = new ArrayList<Scrratt>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrrdep")
    public List<Scrrdep> getScrrdep() {
        return scrrdep;
    }

    @JsonProperty("scrrdep")
    public void setScrrdep(List<Scrrdep> scrrdep) {
        this.scrrdep = scrrdep;
    }

    public CourseRegistrationRestrictions100GetResponse withScrrdep(List<Scrrdep> scrrdep) {
        this.scrrdep = scrrdep;
        return this;
    }

    @JsonProperty("scrrmaj")
    public List<Scrrmaj> getScrrmaj() {
        return scrrmaj;
    }

    @JsonProperty("scrrmaj")
    public void setScrrmaj(List<Scrrmaj> scrrmaj) {
        this.scrrmaj = scrrmaj;
    }

    public CourseRegistrationRestrictions100GetResponse withScrrmaj(List<Scrrmaj> scrrmaj) {
        this.scrrmaj = scrrmaj;
        return this;
    }

    @JsonProperty("scrrcls")
    public List<Scrrcl> getScrrcls() {
        return scrrcls;
    }

    @JsonProperty("scrrcls")
    public void setScrrcls(List<Scrrcl> scrrcls) {
        this.scrrcls = scrrcls;
    }

    public CourseRegistrationRestrictions100GetResponse withScrrcls(List<Scrrcl> scrrcls) {
        this.scrrcls = scrrcls;
        return this;
    }

    @JsonProperty("scrrlvl")
    public List<Scrrlvl> getScrrlvl() {
        return scrrlvl;
    }

    @JsonProperty("scrrlvl")
    public void setScrrlvl(List<Scrrlvl> scrrlvl) {
        this.scrrlvl = scrrlvl;
    }

    public CourseRegistrationRestrictions100GetResponse withScrrlvl(List<Scrrlvl> scrrlvl) {
        this.scrrlvl = scrrlvl;
        return this;
    }

    @JsonProperty("scrrdeg")
    public List<Scrrdeg> getScrrdeg() {
        return scrrdeg;
    }

    @JsonProperty("scrrdeg")
    public void setScrrdeg(List<Scrrdeg> scrrdeg) {
        this.scrrdeg = scrrdeg;
    }

    public CourseRegistrationRestrictions100GetResponse withScrrdeg(List<Scrrdeg> scrrdeg) {
        this.scrrdeg = scrrdeg;
        return this;
    }

    @JsonProperty("scrrprg")
    public List<Scrrprg> getScrrprg() {
        return scrrprg;
    }

    @JsonProperty("scrrprg")
    public void setScrrprg(List<Scrrprg> scrrprg) {
        this.scrrprg = scrrprg;
    }

    public CourseRegistrationRestrictions100GetResponse withScrrprg(List<Scrrprg> scrrprg) {
        this.scrrprg = scrrprg;
        return this;
    }

    @JsonProperty("scrrcam")
    public List<Scrrcam> getScrrcam() {
        return scrrcam;
    }

    @JsonProperty("scrrcam")
    public void setScrrcam(List<Scrrcam> scrrcam) {
        this.scrrcam = scrrcam;
    }

    public CourseRegistrationRestrictions100GetResponse withScrrcam(List<Scrrcam> scrrcam) {
        this.scrrcam = scrrcam;
        return this;
    }

    @JsonProperty("scrrcol")
    public List<Scrrcol> getScrrcol() {
        return scrrcol;
    }

    @JsonProperty("scrrcol")
    public void setScrrcol(List<Scrrcol> scrrcol) {
        this.scrrcol = scrrcol;
    }

    public CourseRegistrationRestrictions100GetResponse withScrrcol(List<Scrrcol> scrrcol) {
        this.scrrcol = scrrcol;
        return this;
    }

    @JsonProperty("scrrchr")
    public List<Scrrchr> getScrrchr() {
        return scrrchr;
    }

    @JsonProperty("scrrchr")
    public void setScrrchr(List<Scrrchr> scrrchr) {
        this.scrrchr = scrrchr;
    }

    public CourseRegistrationRestrictions100GetResponse withScrrchr(List<Scrrchr> scrrchr) {
        this.scrrchr = scrrchr;
        return this;
    }

    @JsonProperty("scrratt")
    public List<Scrratt> getScrratt() {
        return scrratt;
    }

    @JsonProperty("scrratt")
    public void setScrratt(List<Scrratt> scrratt) {
        this.scrratt = scrratt;
    }

    public CourseRegistrationRestrictions100GetResponse withScrratt(List<Scrratt> scrratt) {
        this.scrratt = scrratt;
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

    public CourseRegistrationRestrictions100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationRestrictions100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrdep");
        sb.append('=');
        sb.append(((this.scrrdep == null)?"<null>":this.scrrdep));
        sb.append(',');
        sb.append("scrrmaj");
        sb.append('=');
        sb.append(((this.scrrmaj == null)?"<null>":this.scrrmaj));
        sb.append(',');
        sb.append("scrrcls");
        sb.append('=');
        sb.append(((this.scrrcls == null)?"<null>":this.scrrcls));
        sb.append(',');
        sb.append("scrrlvl");
        sb.append('=');
        sb.append(((this.scrrlvl == null)?"<null>":this.scrrlvl));
        sb.append(',');
        sb.append("scrrdeg");
        sb.append('=');
        sb.append(((this.scrrdeg == null)?"<null>":this.scrrdeg));
        sb.append(',');
        sb.append("scrrprg");
        sb.append('=');
        sb.append(((this.scrrprg == null)?"<null>":this.scrrprg));
        sb.append(',');
        sb.append("scrrcam");
        sb.append('=');
        sb.append(((this.scrrcam == null)?"<null>":this.scrrcam));
        sb.append(',');
        sb.append("scrrcol");
        sb.append('=');
        sb.append(((this.scrrcol == null)?"<null>":this.scrrcol));
        sb.append(',');
        sb.append("scrrchr");
        sb.append('=');
        sb.append(((this.scrrchr == null)?"<null>":this.scrrchr));
        sb.append(',');
        sb.append("scrratt");
        sb.append('=');
        sb.append(((this.scrratt == null)?"<null>":this.scrratt));
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
        result = ((result* 31)+((this.scrrcls == null)? 0 :this.scrrcls.hashCode()));
        result = ((result* 31)+((this.scrrchr == null)? 0 :this.scrrchr.hashCode()));
        result = ((result* 31)+((this.scrrdep == null)? 0 :this.scrrdep.hashCode()));
        result = ((result* 31)+((this.scrrcam == null)? 0 :this.scrrcam.hashCode()));
        result = ((result* 31)+((this.scrrcol == null)? 0 :this.scrrcol.hashCode()));
        result = ((result* 31)+((this.scrratt == null)? 0 :this.scrratt.hashCode()));
        result = ((result* 31)+((this.scrrlvl == null)? 0 :this.scrrlvl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrprg == null)? 0 :this.scrrprg.hashCode()));
        result = ((result* 31)+((this.scrrmaj == null)? 0 :this.scrrmaj.hashCode()));
        result = ((result* 31)+((this.scrrdeg == null)? 0 :this.scrrdeg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationRestrictions100GetResponse) == false) {
            return false;
        }
        CourseRegistrationRestrictions100GetResponse rhs = ((CourseRegistrationRestrictions100GetResponse) other);
        return ((((((((((((this.scrrcls == rhs.scrrcls)||((this.scrrcls!= null)&&this.scrrcls.equals(rhs.scrrcls)))&&((this.scrrchr == rhs.scrrchr)||((this.scrrchr!= null)&&this.scrrchr.equals(rhs.scrrchr))))&&((this.scrrdep == rhs.scrrdep)||((this.scrrdep!= null)&&this.scrrdep.equals(rhs.scrrdep))))&&((this.scrrcam == rhs.scrrcam)||((this.scrrcam!= null)&&this.scrrcam.equals(rhs.scrrcam))))&&((this.scrrcol == rhs.scrrcol)||((this.scrrcol!= null)&&this.scrrcol.equals(rhs.scrrcol))))&&((this.scrratt == rhs.scrratt)||((this.scrratt!= null)&&this.scrratt.equals(rhs.scrratt))))&&((this.scrrlvl == rhs.scrrlvl)||((this.scrrlvl!= null)&&this.scrrlvl.equals(rhs.scrrlvl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrprg == rhs.scrrprg)||((this.scrrprg!= null)&&this.scrrprg.equals(rhs.scrrprg))))&&((this.scrrmaj == rhs.scrrmaj)||((this.scrrmaj!= null)&&this.scrrmaj.equals(rhs.scrrmaj))))&&((this.scrrdeg == rhs.scrrdeg)||((this.scrrdeg!= null)&&this.scrrdeg.equals(rhs.scrrdeg))));
    }

}
