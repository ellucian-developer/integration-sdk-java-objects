
package com.ellucian.generated.bpapi.ban.course_registration_degree_and_program_restrictions.v1_0_0;

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
    "scrrdeg",
    "scrrprg"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationDegreeAndProgramRestrictions100PostResponse {

    @JsonProperty("scrrdeg")
    private List<Scrrdeg__1> scrrdeg = new ArrayList<Scrrdeg__1>();
    @JsonProperty("scrrprg")
    private List<Scrrprg__1> scrrprg = new ArrayList<Scrrprg__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrrdeg")
    public List<Scrrdeg__1> getScrrdeg() {
        return scrrdeg;
    }

    @JsonProperty("scrrdeg")
    public void setScrrdeg(List<Scrrdeg__1> scrrdeg) {
        this.scrrdeg = scrrdeg;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100PostResponse withScrrdeg(List<Scrrdeg__1> scrrdeg) {
        this.scrrdeg = scrrdeg;
        return this;
    }

    @JsonProperty("scrrprg")
    public List<Scrrprg__1> getScrrprg() {
        return scrrprg;
    }

    @JsonProperty("scrrprg")
    public void setScrrprg(List<Scrrprg__1> scrrprg) {
        this.scrrprg = scrrprg;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100PostResponse withScrrprg(List<Scrrprg__1> scrrprg) {
        this.scrrprg = scrrprg;
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

    public CourseRegistrationDegreeAndProgramRestrictions100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationDegreeAndProgramRestrictions100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrdeg");
        sb.append('=');
        sb.append(((this.scrrdeg == null)?"<null>":this.scrrdeg));
        sb.append(',');
        sb.append("scrrprg");
        sb.append('=');
        sb.append(((this.scrrprg == null)?"<null>":this.scrrprg));
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
        result = ((result* 31)+((this.scrrprg == null)? 0 :this.scrrprg.hashCode()));
        result = ((result* 31)+((this.scrrdeg == null)? 0 :this.scrrdeg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationDegreeAndProgramRestrictions100PostResponse) == false) {
            return false;
        }
        CourseRegistrationDegreeAndProgramRestrictions100PostResponse rhs = ((CourseRegistrationDegreeAndProgramRestrictions100PostResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.scrrprg == rhs.scrrprg)||((this.scrrprg!= null)&&this.scrrprg.equals(rhs.scrrprg))))&&((this.scrrdeg == rhs.scrrdeg)||((this.scrrdeg!= null)&&this.scrrdeg.equals(rhs.scrrdeg))));
    }

}
