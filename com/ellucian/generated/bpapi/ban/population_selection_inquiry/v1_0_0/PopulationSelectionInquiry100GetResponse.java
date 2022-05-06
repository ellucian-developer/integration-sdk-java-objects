
package com.ellucian.generated.bpapi.ban.population_selection_inquiry.v1_0_0;

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
    "glbslct",
    "glvslct"
})
@Generated("jsonschema2pojo")
public class PopulationSelectionInquiry100GetResponse {

    @JsonProperty("glbslct")
    private List<Glbslct> glbslct = new ArrayList<Glbslct>();
    @JsonProperty("glvslct")
    private List<Glvslct> glvslct = new ArrayList<Glvslct>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("glbslct")
    public List<Glbslct> getGlbslct() {
        return glbslct;
    }

    @JsonProperty("glbslct")
    public void setGlbslct(List<Glbslct> glbslct) {
        this.glbslct = glbslct;
    }

    public PopulationSelectionInquiry100GetResponse withGlbslct(List<Glbslct> glbslct) {
        this.glbslct = glbslct;
        return this;
    }

    @JsonProperty("glvslct")
    public List<Glvslct> getGlvslct() {
        return glvslct;
    }

    @JsonProperty("glvslct")
    public void setGlvslct(List<Glvslct> glvslct) {
        this.glvslct = glvslct;
    }

    public PopulationSelectionInquiry100GetResponse withGlvslct(List<Glvslct> glvslct) {
        this.glvslct = glvslct;
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

    public PopulationSelectionInquiry100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PopulationSelectionInquiry100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("glbslct");
        sb.append('=');
        sb.append(((this.glbslct == null)?"<null>":this.glbslct));
        sb.append(',');
        sb.append("glvslct");
        sb.append('=');
        sb.append(((this.glvslct == null)?"<null>":this.glvslct));
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
        result = ((result* 31)+((this.glvslct == null)? 0 :this.glvslct.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.glbslct == null)? 0 :this.glbslct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PopulationSelectionInquiry100GetResponse) == false) {
            return false;
        }
        PopulationSelectionInquiry100GetResponse rhs = ((PopulationSelectionInquiry100GetResponse) other);
        return ((((this.glvslct == rhs.glvslct)||((this.glvslct!= null)&&this.glvslct.equals(rhs.glvslct)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.glbslct == rhs.glbslct)||((this.glbslct!= null)&&this.glbslct.equals(rhs.glbslct))));
    }

}
