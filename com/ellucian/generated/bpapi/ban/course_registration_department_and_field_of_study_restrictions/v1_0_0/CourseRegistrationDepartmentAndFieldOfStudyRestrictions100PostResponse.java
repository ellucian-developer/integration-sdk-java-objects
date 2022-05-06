
package com.ellucian.generated.bpapi.ban.course_registration_department_and_field_of_study_restrictions.v1_0_0;

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
    "scrrmaj"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationDepartmentAndFieldOfStudyRestrictions100PostResponse {

    @JsonProperty("scrrdep")
    private List<Scrrdep__1> scrrdep = new ArrayList<Scrrdep__1>();
    @JsonProperty("scrrmaj")
    private List<Scrrmaj__1> scrrmaj = new ArrayList<Scrrmaj__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrrdep")
    public List<Scrrdep__1> getScrrdep() {
        return scrrdep;
    }

    @JsonProperty("scrrdep")
    public void setScrrdep(List<Scrrdep__1> scrrdep) {
        this.scrrdep = scrrdep;
    }

    public CourseRegistrationDepartmentAndFieldOfStudyRestrictions100PostResponse withScrrdep(List<Scrrdep__1> scrrdep) {
        this.scrrdep = scrrdep;
        return this;
    }

    @JsonProperty("scrrmaj")
    public List<Scrrmaj__1> getScrrmaj() {
        return scrrmaj;
    }

    @JsonProperty("scrrmaj")
    public void setScrrmaj(List<Scrrmaj__1> scrrmaj) {
        this.scrrmaj = scrrmaj;
    }

    public CourseRegistrationDepartmentAndFieldOfStudyRestrictions100PostResponse withScrrmaj(List<Scrrmaj__1> scrrmaj) {
        this.scrrmaj = scrrmaj;
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

    public CourseRegistrationDepartmentAndFieldOfStudyRestrictions100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationDepartmentAndFieldOfStudyRestrictions100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrdep");
        sb.append('=');
        sb.append(((this.scrrdep == null)?"<null>":this.scrrdep));
        sb.append(',');
        sb.append("scrrmaj");
        sb.append('=');
        sb.append(((this.scrrmaj == null)?"<null>":this.scrrmaj));
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
        result = ((result* 31)+((this.scrrmaj == null)? 0 :this.scrrmaj.hashCode()));
        result = ((result* 31)+((this.scrrdep == null)? 0 :this.scrrdep.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationDepartmentAndFieldOfStudyRestrictions100PostResponse) == false) {
            return false;
        }
        CourseRegistrationDepartmentAndFieldOfStudyRestrictions100PostResponse rhs = ((CourseRegistrationDepartmentAndFieldOfStudyRestrictions100PostResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.scrrmaj == rhs.scrrmaj)||((this.scrrmaj!= null)&&this.scrrmaj.equals(rhs.scrrmaj))))&&((this.scrrdep == rhs.scrrdep)||((this.scrrdep!= null)&&this.scrrdep.equals(rhs.scrrdep))));
    }

}
