
package com.ellucian.generated.bpapi.ban.registration_courses.v1_0_0;

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
    "ssrmeet",
    "ssbsect",
    "sfrstcr"
})
@Generated("jsonschema2pojo")
public class RegistrationCourses100GetResponse {

    @JsonProperty("ssrmeet")
    private List<Ssrmeet> ssrmeet = new ArrayList<Ssrmeet>();
    @JsonProperty("ssbsect")
    private List<Ssbsect> ssbsect = new ArrayList<Ssbsect>();
    @JsonProperty("sfrstcr")
    private List<Sfrstcr> sfrstcr = new ArrayList<Sfrstcr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrmeet")
    public List<Ssrmeet> getSsrmeet() {
        return ssrmeet;
    }

    @JsonProperty("ssrmeet")
    public void setSsrmeet(List<Ssrmeet> ssrmeet) {
        this.ssrmeet = ssrmeet;
    }

    public RegistrationCourses100GetResponse withSsrmeet(List<Ssrmeet> ssrmeet) {
        this.ssrmeet = ssrmeet;
        return this;
    }

    @JsonProperty("ssbsect")
    public List<Ssbsect> getSsbsect() {
        return ssbsect;
    }

    @JsonProperty("ssbsect")
    public void setSsbsect(List<Ssbsect> ssbsect) {
        this.ssbsect = ssbsect;
    }

    public RegistrationCourses100GetResponse withSsbsect(List<Ssbsect> ssbsect) {
        this.ssbsect = ssbsect;
        return this;
    }

    @JsonProperty("sfrstcr")
    public List<Sfrstcr> getSfrstcr() {
        return sfrstcr;
    }

    @JsonProperty("sfrstcr")
    public void setSfrstcr(List<Sfrstcr> sfrstcr) {
        this.sfrstcr = sfrstcr;
    }

    public RegistrationCourses100GetResponse withSfrstcr(List<Sfrstcr> sfrstcr) {
        this.sfrstcr = sfrstcr;
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

    public RegistrationCourses100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationCourses100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrmeet");
        sb.append('=');
        sb.append(((this.ssrmeet == null)?"<null>":this.ssrmeet));
        sb.append(',');
        sb.append("ssbsect");
        sb.append('=');
        sb.append(((this.ssbsect == null)?"<null>":this.ssbsect));
        sb.append(',');
        sb.append("sfrstcr");
        sb.append('=');
        sb.append(((this.sfrstcr == null)?"<null>":this.sfrstcr));
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
        result = ((result* 31)+((this.ssbsect == null)? 0 :this.ssbsect.hashCode()));
        result = ((result* 31)+((this.ssrmeet == null)? 0 :this.ssrmeet.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationCourses100GetResponse) == false) {
            return false;
        }
        RegistrationCourses100GetResponse rhs = ((RegistrationCourses100GetResponse) other);
        return (((((this.sfrstcr == rhs.sfrstcr)||((this.sfrstcr!= null)&&this.sfrstcr.equals(rhs.sfrstcr)))&&((this.ssbsect == rhs.ssbsect)||((this.ssbsect!= null)&&this.ssbsect.equals(rhs.ssbsect))))&&((this.ssrmeet == rhs.ssrmeet)||((this.ssrmeet!= null)&&this.ssrmeet.equals(rhs.ssrmeet))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
