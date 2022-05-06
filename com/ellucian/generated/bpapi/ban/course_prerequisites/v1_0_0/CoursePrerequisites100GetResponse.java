
package com.ellucian.generated.bpapi.ban.course_prerequisites.v1_0_0;

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
    "scbcrse",
    "scrrtst",
    "scrrare"
})
@Generated("jsonschema2pojo")
public class CoursePrerequisites100GetResponse {

    @JsonProperty("scbcrse")
    private List<Scbcrse> scbcrse = new ArrayList<Scbcrse>();
    @JsonProperty("scrrtst")
    private List<Scrrtst> scrrtst = new ArrayList<Scrrtst>();
    @JsonProperty("scrrare")
    private List<Scrrare> scrrare = new ArrayList<Scrrare>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scbcrse")
    public List<Scbcrse> getScbcrse() {
        return scbcrse;
    }

    @JsonProperty("scbcrse")
    public void setScbcrse(List<Scbcrse> scbcrse) {
        this.scbcrse = scbcrse;
    }

    public CoursePrerequisites100GetResponse withScbcrse(List<Scbcrse> scbcrse) {
        this.scbcrse = scbcrse;
        return this;
    }

    @JsonProperty("scrrtst")
    public List<Scrrtst> getScrrtst() {
        return scrrtst;
    }

    @JsonProperty("scrrtst")
    public void setScrrtst(List<Scrrtst> scrrtst) {
        this.scrrtst = scrrtst;
    }

    public CoursePrerequisites100GetResponse withScrrtst(List<Scrrtst> scrrtst) {
        this.scrrtst = scrrtst;
        return this;
    }

    @JsonProperty("scrrare")
    public List<Scrrare> getScrrare() {
        return scrrare;
    }

    @JsonProperty("scrrare")
    public void setScrrare(List<Scrrare> scrrare) {
        this.scrrare = scrrare;
    }

    public CoursePrerequisites100GetResponse withScrrare(List<Scrrare> scrrare) {
        this.scrrare = scrrare;
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

    public CoursePrerequisites100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoursePrerequisites100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scbcrse");
        sb.append('=');
        sb.append(((this.scbcrse == null)?"<null>":this.scbcrse));
        sb.append(',');
        sb.append("scrrtst");
        sb.append('=');
        sb.append(((this.scrrtst == null)?"<null>":this.scrrtst));
        sb.append(',');
        sb.append("scrrare");
        sb.append('=');
        sb.append(((this.scrrare == null)?"<null>":this.scrrare));
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
        result = ((result* 31)+((this.scbcrse == null)? 0 :this.scbcrse.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrare == null)? 0 :this.scrrare.hashCode()));
        result = ((result* 31)+((this.scrrtst == null)? 0 :this.scrrtst.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoursePrerequisites100GetResponse) == false) {
            return false;
        }
        CoursePrerequisites100GetResponse rhs = ((CoursePrerequisites100GetResponse) other);
        return (((((this.scbcrse == rhs.scbcrse)||((this.scbcrse!= null)&&this.scbcrse.equals(rhs.scbcrse)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrare == rhs.scrrare)||((this.scrrare!= null)&&this.scrrare.equals(rhs.scrrare))))&&((this.scrrtst == rhs.scrrtst)||((this.scrrtst!= null)&&this.scrrtst.equals(rhs.scrrtst))));
    }

}
