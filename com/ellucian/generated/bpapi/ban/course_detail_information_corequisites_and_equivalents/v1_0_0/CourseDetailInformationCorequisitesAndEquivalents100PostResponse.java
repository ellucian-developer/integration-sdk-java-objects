
package com.ellucian.generated.bpapi.ban.course_detail_information_corequisites_and_equivalents.v1_0_0;

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
    "scrcorq",
    "screqiv"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationCorequisitesAndEquivalents100PostResponse {

    @JsonProperty("scrcorq")
    private List<Scrcorq__1> scrcorq = new ArrayList<Scrcorq__1>();
    @JsonProperty("screqiv")
    private List<Screqiv__1> screqiv = new ArrayList<Screqiv__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrcorq")
    public List<Scrcorq__1> getScrcorq() {
        return scrcorq;
    }

    @JsonProperty("scrcorq")
    public void setScrcorq(List<Scrcorq__1> scrcorq) {
        this.scrcorq = scrcorq;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100PostResponse withScrcorq(List<Scrcorq__1> scrcorq) {
        this.scrcorq = scrcorq;
        return this;
    }

    @JsonProperty("screqiv")
    public List<Screqiv__1> getScreqiv() {
        return screqiv;
    }

    @JsonProperty("screqiv")
    public void setScreqiv(List<Screqiv__1> screqiv) {
        this.screqiv = screqiv;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100PostResponse withScreqiv(List<Screqiv__1> screqiv) {
        this.screqiv = screqiv;
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

    public CourseDetailInformationCorequisitesAndEquivalents100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationCorequisitesAndEquivalents100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrcorq");
        sb.append('=');
        sb.append(((this.scrcorq == null)?"<null>":this.scrcorq));
        sb.append(',');
        sb.append("screqiv");
        sb.append('=');
        sb.append(((this.screqiv == null)?"<null>":this.screqiv));
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
        result = ((result* 31)+((this.screqiv == null)? 0 :this.screqiv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrcorq == null)? 0 :this.scrcorq.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationCorequisitesAndEquivalents100PostResponse) == false) {
            return false;
        }
        CourseDetailInformationCorequisitesAndEquivalents100PostResponse rhs = ((CourseDetailInformationCorequisitesAndEquivalents100PostResponse) other);
        return ((((this.screqiv == rhs.screqiv)||((this.screqiv!= null)&&this.screqiv.equals(rhs.screqiv)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrcorq == rhs.scrcorq)||((this.scrcorq!= null)&&this.scrcorq.equals(rhs.scrcorq))));
    }

}
