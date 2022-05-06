
package com.ellucian.generated.bpapi.ban.course_registration_student_attribute_and_cohort_restrictions.v1_0_0;

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
    "scrrchr",
    "scrratt"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationStudentAttributeAndCohortRestrictions100PutResponse {

    @JsonProperty("scrrchr")
    private List<Scrrchr__2> scrrchr = new ArrayList<Scrrchr__2>();
    @JsonProperty("scrratt")
    private List<Scrratt__2> scrratt = new ArrayList<Scrratt__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrrchr")
    public List<Scrrchr__2> getScrrchr() {
        return scrrchr;
    }

    @JsonProperty("scrrchr")
    public void setScrrchr(List<Scrrchr__2> scrrchr) {
        this.scrrchr = scrrchr;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100PutResponse withScrrchr(List<Scrrchr__2> scrrchr) {
        this.scrrchr = scrrchr;
        return this;
    }

    @JsonProperty("scrratt")
    public List<Scrratt__2> getScrratt() {
        return scrratt;
    }

    @JsonProperty("scrratt")
    public void setScrratt(List<Scrratt__2> scrratt) {
        this.scrratt = scrratt;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100PutResponse withScrratt(List<Scrratt__2> scrratt) {
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

    public CourseRegistrationStudentAttributeAndCohortRestrictions100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationStudentAttributeAndCohortRestrictions100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.scrratt == null)? 0 :this.scrratt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrchr == null)? 0 :this.scrrchr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationStudentAttributeAndCohortRestrictions100PutResponse) == false) {
            return false;
        }
        CourseRegistrationStudentAttributeAndCohortRestrictions100PutResponse rhs = ((CourseRegistrationStudentAttributeAndCohortRestrictions100PutResponse) other);
        return ((((this.scrratt == rhs.scrratt)||((this.scrratt!= null)&&this.scrratt.equals(rhs.scrratt)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrchr == rhs.scrrchr)||((this.scrrchr!= null)&&this.scrrchr.equals(rhs.scrrchr))));
    }

}
