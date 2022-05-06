
package com.ellucian.generated.bpapi.ban.grade_code_substitution.v1_0_0;

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
    "shrgrde",
    "shrgrds"
})
@Generated("jsonschema2pojo")
public class GradeCodeSubstitution100GetResponse {

    @JsonProperty("shrgrde")
    private List<Shrgrde> shrgrde = new ArrayList<Shrgrde>();
    @JsonProperty("shrgrds")
    private List<Shrgrd> shrgrds = new ArrayList<Shrgrd>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrgrde")
    public List<Shrgrde> getShrgrde() {
        return shrgrde;
    }

    @JsonProperty("shrgrde")
    public void setShrgrde(List<Shrgrde> shrgrde) {
        this.shrgrde = shrgrde;
    }

    public GradeCodeSubstitution100GetResponse withShrgrde(List<Shrgrde> shrgrde) {
        this.shrgrde = shrgrde;
        return this;
    }

    @JsonProperty("shrgrds")
    public List<Shrgrd> getShrgrds() {
        return shrgrds;
    }

    @JsonProperty("shrgrds")
    public void setShrgrds(List<Shrgrd> shrgrds) {
        this.shrgrds = shrgrds;
    }

    public GradeCodeSubstitution100GetResponse withShrgrds(List<Shrgrd> shrgrds) {
        this.shrgrds = shrgrds;
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

    public GradeCodeSubstitution100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeCodeSubstitution100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrgrde");
        sb.append('=');
        sb.append(((this.shrgrde == null)?"<null>":this.shrgrde));
        sb.append(',');
        sb.append("shrgrds");
        sb.append('=');
        sb.append(((this.shrgrds == null)?"<null>":this.shrgrds));
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
        result = ((result* 31)+((this.shrgrde == null)? 0 :this.shrgrde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrgrds == null)? 0 :this.shrgrds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeCodeSubstitution100GetResponse) == false) {
            return false;
        }
        GradeCodeSubstitution100GetResponse rhs = ((GradeCodeSubstitution100GetResponse) other);
        return ((((this.shrgrde == rhs.shrgrde)||((this.shrgrde!= null)&&this.shrgrde.equals(rhs.shrgrde)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrgrds == rhs.shrgrds)||((this.shrgrds!= null)&&this.shrgrds.equals(rhs.shrgrds))));
    }

}
