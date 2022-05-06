
package com.ellucian.generated.bpapi.ban.course_syllabus.v1_0_0;

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
    "scrsylo",
    "scrsyln",
    "scrsyrm",
    "scrsytr"
})
@Generated("jsonschema2pojo")
public class CourseSyllabus100GetResponse {

    @JsonProperty("scrsylo")
    private List<Scrsylo> scrsylo = new ArrayList<Scrsylo>();
    @JsonProperty("scrsyln")
    private List<Scrsyln> scrsyln = new ArrayList<Scrsyln>();
    @JsonProperty("scrsyrm")
    private List<Scrsyrm> scrsyrm = new ArrayList<Scrsyrm>();
    @JsonProperty("scrsytr")
    private List<Scrsytr> scrsytr = new ArrayList<Scrsytr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrsylo")
    public List<Scrsylo> getScrsylo() {
        return scrsylo;
    }

    @JsonProperty("scrsylo")
    public void setScrsylo(List<Scrsylo> scrsylo) {
        this.scrsylo = scrsylo;
    }

    public CourseSyllabus100GetResponse withScrsylo(List<Scrsylo> scrsylo) {
        this.scrsylo = scrsylo;
        return this;
    }

    @JsonProperty("scrsyln")
    public List<Scrsyln> getScrsyln() {
        return scrsyln;
    }

    @JsonProperty("scrsyln")
    public void setScrsyln(List<Scrsyln> scrsyln) {
        this.scrsyln = scrsyln;
    }

    public CourseSyllabus100GetResponse withScrsyln(List<Scrsyln> scrsyln) {
        this.scrsyln = scrsyln;
        return this;
    }

    @JsonProperty("scrsyrm")
    public List<Scrsyrm> getScrsyrm() {
        return scrsyrm;
    }

    @JsonProperty("scrsyrm")
    public void setScrsyrm(List<Scrsyrm> scrsyrm) {
        this.scrsyrm = scrsyrm;
    }

    public CourseSyllabus100GetResponse withScrsyrm(List<Scrsyrm> scrsyrm) {
        this.scrsyrm = scrsyrm;
        return this;
    }

    @JsonProperty("scrsytr")
    public List<Scrsytr> getScrsytr() {
        return scrsytr;
    }

    @JsonProperty("scrsytr")
    public void setScrsytr(List<Scrsytr> scrsytr) {
        this.scrsytr = scrsytr;
    }

    public CourseSyllabus100GetResponse withScrsytr(List<Scrsytr> scrsytr) {
        this.scrsytr = scrsytr;
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

    public CourseSyllabus100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseSyllabus100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrsylo");
        sb.append('=');
        sb.append(((this.scrsylo == null)?"<null>":this.scrsylo));
        sb.append(',');
        sb.append("scrsyln");
        sb.append('=');
        sb.append(((this.scrsyln == null)?"<null>":this.scrsyln));
        sb.append(',');
        sb.append("scrsyrm");
        sb.append('=');
        sb.append(((this.scrsyrm == null)?"<null>":this.scrsyrm));
        sb.append(',');
        sb.append("scrsytr");
        sb.append('=');
        sb.append(((this.scrsytr == null)?"<null>":this.scrsytr));
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
        result = ((result* 31)+((this.scrsyln == null)? 0 :this.scrsyln.hashCode()));
        result = ((result* 31)+((this.scrsylo == null)? 0 :this.scrsylo.hashCode()));
        result = ((result* 31)+((this.scrsyrm == null)? 0 :this.scrsyrm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrsytr == null)? 0 :this.scrsytr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseSyllabus100GetResponse) == false) {
            return false;
        }
        CourseSyllabus100GetResponse rhs = ((CourseSyllabus100GetResponse) other);
        return ((((((this.scrsyln == rhs.scrsyln)||((this.scrsyln!= null)&&this.scrsyln.equals(rhs.scrsyln)))&&((this.scrsylo == rhs.scrsylo)||((this.scrsylo!= null)&&this.scrsylo.equals(rhs.scrsylo))))&&((this.scrsyrm == rhs.scrsyrm)||((this.scrsyrm!= null)&&this.scrsyrm.equals(rhs.scrsyrm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrsytr == rhs.scrsytr)||((this.scrsytr!= null)&&this.scrsytr.equals(rhs.scrsytr))));
    }

}
