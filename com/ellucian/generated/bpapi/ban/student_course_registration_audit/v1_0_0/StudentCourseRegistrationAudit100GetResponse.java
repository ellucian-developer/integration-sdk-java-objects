
package com.ellucian.generated.bpapi.ban.student_course_registration_audit.v1_0_0;

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
    "sfrstca",
    "sfrrscm"
})
@Generated("jsonschema2pojo")
public class StudentCourseRegistrationAudit100GetResponse {

    @JsonProperty("sfrstca")
    private List<Sfrstca> sfrstca = new ArrayList<Sfrstca>();
    @JsonProperty("sfrrscm")
    private List<Sfrrscm> sfrrscm = new ArrayList<Sfrrscm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sfrstca")
    public List<Sfrstca> getSfrstca() {
        return sfrstca;
    }

    @JsonProperty("sfrstca")
    public void setSfrstca(List<Sfrstca> sfrstca) {
        this.sfrstca = sfrstca;
    }

    public StudentCourseRegistrationAudit100GetResponse withSfrstca(List<Sfrstca> sfrstca) {
        this.sfrstca = sfrstca;
        return this;
    }

    @JsonProperty("sfrrscm")
    public List<Sfrrscm> getSfrrscm() {
        return sfrrscm;
    }

    @JsonProperty("sfrrscm")
    public void setSfrrscm(List<Sfrrscm> sfrrscm) {
        this.sfrrscm = sfrrscm;
    }

    public StudentCourseRegistrationAudit100GetResponse withSfrrscm(List<Sfrrscm> sfrrscm) {
        this.sfrrscm = sfrrscm;
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

    public StudentCourseRegistrationAudit100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseRegistrationAudit100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sfrstca");
        sb.append('=');
        sb.append(((this.sfrstca == null)?"<null>":this.sfrstca));
        sb.append(',');
        sb.append("sfrrscm");
        sb.append('=');
        sb.append(((this.sfrrscm == null)?"<null>":this.sfrrscm));
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
        result = ((result* 31)+((this.sfrstca == null)? 0 :this.sfrstca.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sfrrscm == null)? 0 :this.sfrrscm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseRegistrationAudit100GetResponse) == false) {
            return false;
        }
        StudentCourseRegistrationAudit100GetResponse rhs = ((StudentCourseRegistrationAudit100GetResponse) other);
        return ((((this.sfrstca == rhs.sfrstca)||((this.sfrstca!= null)&&this.sfrstca.equals(rhs.sfrstca)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sfrrscm == rhs.sfrrscm)||((this.sfrrscm!= null)&&this.sfrrscm.equals(rhs.sfrrscm))));
    }

}
