
package com.ellucian.generated.bpapi.ban.academic_non_course.v1_0_0;

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
    "shrncrd",
    "shrncrs"
})
@Generated("jsonschema2pojo")
public class AcademicNonCourse100PostResponse {

    @JsonProperty("shrncrd")
    private List<Shrncrd__1> shrncrd = new ArrayList<Shrncrd__1>();
    @JsonProperty("shrncrs")
    private List<Shrncr__1> shrncrs = new ArrayList<Shrncr__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrncrd")
    public List<Shrncrd__1> getShrncrd() {
        return shrncrd;
    }

    @JsonProperty("shrncrd")
    public void setShrncrd(List<Shrncrd__1> shrncrd) {
        this.shrncrd = shrncrd;
    }

    public AcademicNonCourse100PostResponse withShrncrd(List<Shrncrd__1> shrncrd) {
        this.shrncrd = shrncrd;
        return this;
    }

    @JsonProperty("shrncrs")
    public List<Shrncr__1> getShrncrs() {
        return shrncrs;
    }

    @JsonProperty("shrncrs")
    public void setShrncrs(List<Shrncr__1> shrncrs) {
        this.shrncrs = shrncrs;
    }

    public AcademicNonCourse100PostResponse withShrncrs(List<Shrncr__1> shrncrs) {
        this.shrncrs = shrncrs;
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

    public AcademicNonCourse100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicNonCourse100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrncrd");
        sb.append('=');
        sb.append(((this.shrncrd == null)?"<null>":this.shrncrd));
        sb.append(',');
        sb.append("shrncrs");
        sb.append('=');
        sb.append(((this.shrncrs == null)?"<null>":this.shrncrs));
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
        result = ((result* 31)+((this.shrncrd == null)? 0 :this.shrncrd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrncrs == null)? 0 :this.shrncrs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicNonCourse100PostResponse) == false) {
            return false;
        }
        AcademicNonCourse100PostResponse rhs = ((AcademicNonCourse100PostResponse) other);
        return ((((this.shrncrd == rhs.shrncrd)||((this.shrncrd!= null)&&this.shrncrd.equals(rhs.shrncrd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrncrs == rhs.shrncrs)||((this.shrncrs!= null)&&this.shrncrs.equals(rhs.shrncrs))));
    }

}
