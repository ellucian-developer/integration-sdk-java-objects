
package com.ellucian.generated.bpapi.ban.gradable_component_definition_subcomponent.v1_0_0;

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
    "shrgcom",
    "ssbsect",
    "shrscom"
})
@Generated("jsonschema2pojo")
public class GradableComponentDefinitionSubcomponent100GetResponse {

    @JsonProperty("shrgcom")
    private List<Shrgcom> shrgcom = new ArrayList<Shrgcom>();
    @JsonProperty("ssbsect")
    private List<Ssbsect> ssbsect = new ArrayList<Ssbsect>();
    @JsonProperty("shrscom")
    private List<Shrscom> shrscom = new ArrayList<Shrscom>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrgcom")
    public List<Shrgcom> getShrgcom() {
        return shrgcom;
    }

    @JsonProperty("shrgcom")
    public void setShrgcom(List<Shrgcom> shrgcom) {
        this.shrgcom = shrgcom;
    }

    public GradableComponentDefinitionSubcomponent100GetResponse withShrgcom(List<Shrgcom> shrgcom) {
        this.shrgcom = shrgcom;
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

    public GradableComponentDefinitionSubcomponent100GetResponse withSsbsect(List<Ssbsect> ssbsect) {
        this.ssbsect = ssbsect;
        return this;
    }

    @JsonProperty("shrscom")
    public List<Shrscom> getShrscom() {
        return shrscom;
    }

    @JsonProperty("shrscom")
    public void setShrscom(List<Shrscom> shrscom) {
        this.shrscom = shrscom;
    }

    public GradableComponentDefinitionSubcomponent100GetResponse withShrscom(List<Shrscom> shrscom) {
        this.shrscom = shrscom;
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

    public GradableComponentDefinitionSubcomponent100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradableComponentDefinitionSubcomponent100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrgcom");
        sb.append('=');
        sb.append(((this.shrgcom == null)?"<null>":this.shrgcom));
        sb.append(',');
        sb.append("ssbsect");
        sb.append('=');
        sb.append(((this.ssbsect == null)?"<null>":this.ssbsect));
        sb.append(',');
        sb.append("shrscom");
        sb.append('=');
        sb.append(((this.shrscom == null)?"<null>":this.shrscom));
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
        result = ((result* 31)+((this.ssbsect == null)? 0 :this.ssbsect.hashCode()));
        result = ((result* 31)+((this.shrscom == null)? 0 :this.shrscom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrgcom == null)? 0 :this.shrgcom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradableComponentDefinitionSubcomponent100GetResponse) == false) {
            return false;
        }
        GradableComponentDefinitionSubcomponent100GetResponse rhs = ((GradableComponentDefinitionSubcomponent100GetResponse) other);
        return (((((this.ssbsect == rhs.ssbsect)||((this.ssbsect!= null)&&this.ssbsect.equals(rhs.ssbsect)))&&((this.shrscom == rhs.shrscom)||((this.shrscom!= null)&&this.shrscom.equals(rhs.shrscom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrgcom == rhs.shrgcom)||((this.shrgcom!= null)&&this.shrgcom.equals(rhs.shrgcom))));
    }

}
