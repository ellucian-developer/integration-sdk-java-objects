
package com.ellucian.generated.bpapi.ban.student_course_fee_assessment_query.v1_0_0;

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
    "sfrstcr",
    "sfbetrm"
})
@Generated("jsonschema2pojo")
public class StudentCourseFeeAssessmentQuery100GetResponse {

    @JsonProperty("sfrstcr")
    private List<Sfrstcr> sfrstcr = new ArrayList<Sfrstcr>();
    @JsonProperty("sfbetrm")
    private List<Sfbetrm> sfbetrm = new ArrayList<Sfbetrm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sfrstcr")
    public List<Sfrstcr> getSfrstcr() {
        return sfrstcr;
    }

    @JsonProperty("sfrstcr")
    public void setSfrstcr(List<Sfrstcr> sfrstcr) {
        this.sfrstcr = sfrstcr;
    }

    public StudentCourseFeeAssessmentQuery100GetResponse withSfrstcr(List<Sfrstcr> sfrstcr) {
        this.sfrstcr = sfrstcr;
        return this;
    }

    @JsonProperty("sfbetrm")
    public List<Sfbetrm> getSfbetrm() {
        return sfbetrm;
    }

    @JsonProperty("sfbetrm")
    public void setSfbetrm(List<Sfbetrm> sfbetrm) {
        this.sfbetrm = sfbetrm;
    }

    public StudentCourseFeeAssessmentQuery100GetResponse withSfbetrm(List<Sfbetrm> sfbetrm) {
        this.sfbetrm = sfbetrm;
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

    public StudentCourseFeeAssessmentQuery100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseFeeAssessmentQuery100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sfrstcr");
        sb.append('=');
        sb.append(((this.sfrstcr == null)?"<null>":this.sfrstcr));
        sb.append(',');
        sb.append("sfbetrm");
        sb.append('=');
        sb.append(((this.sfbetrm == null)?"<null>":this.sfbetrm));
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
        result = ((result* 31)+((this.sfrstcr == null)? 0 :this.sfrstcr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sfbetrm == null)? 0 :this.sfbetrm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseFeeAssessmentQuery100GetResponse) == false) {
            return false;
        }
        StudentCourseFeeAssessmentQuery100GetResponse rhs = ((StudentCourseFeeAssessmentQuery100GetResponse) other);
        return ((((this.sfrstcr == rhs.sfrstcr)||((this.sfrstcr!= null)&&this.sfrstcr.equals(rhs.sfrstcr)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sfbetrm == rhs.sfbetrm)||((this.sfbetrm!= null)&&this.sfbetrm.equals(rhs.sfbetrm))));
    }

}
