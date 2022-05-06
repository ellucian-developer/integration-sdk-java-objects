
package com.ellucian.generated.bpapi.ban.course_registration_campus_and_college_restrictions.v1_0_0;

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
    "scrrcam",
    "scrrcol"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationCampusAndCollegeRestrictions100PostResponse {

    @JsonProperty("scrrcam")
    private List<Scrrcam__1> scrrcam = new ArrayList<Scrrcam__1>();
    @JsonProperty("scrrcol")
    private List<Scrrcol__1> scrrcol = new ArrayList<Scrrcol__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrrcam")
    public List<Scrrcam__1> getScrrcam() {
        return scrrcam;
    }

    @JsonProperty("scrrcam")
    public void setScrrcam(List<Scrrcam__1> scrrcam) {
        this.scrrcam = scrrcam;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PostResponse withScrrcam(List<Scrrcam__1> scrrcam) {
        this.scrrcam = scrrcam;
        return this;
    }

    @JsonProperty("scrrcol")
    public List<Scrrcol__1> getScrrcol() {
        return scrrcol;
    }

    @JsonProperty("scrrcol")
    public void setScrrcol(List<Scrrcol__1> scrrcol) {
        this.scrrcol = scrrcol;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PostResponse withScrrcol(List<Scrrcol__1> scrrcol) {
        this.scrrcol = scrrcol;
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

    public CourseRegistrationCampusAndCollegeRestrictions100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationCampusAndCollegeRestrictions100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrcam");
        sb.append('=');
        sb.append(((this.scrrcam == null)?"<null>":this.scrrcam));
        sb.append(',');
        sb.append("scrrcol");
        sb.append('=');
        sb.append(((this.scrrcol == null)?"<null>":this.scrrcol));
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
        result = ((result* 31)+((this.scrrcol == null)? 0 :this.scrrcol.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrcam == null)? 0 :this.scrrcam.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationCampusAndCollegeRestrictions100PostResponse) == false) {
            return false;
        }
        CourseRegistrationCampusAndCollegeRestrictions100PostResponse rhs = ((CourseRegistrationCampusAndCollegeRestrictions100PostResponse) other);
        return ((((this.scrrcol == rhs.scrrcol)||((this.scrrcol!= null)&&this.scrrcol.equals(rhs.scrrcol)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrcam == rhs.scrrcam)||((this.scrrcam!= null)&&this.scrrcam.equals(rhs.scrrcam))));
    }

}
