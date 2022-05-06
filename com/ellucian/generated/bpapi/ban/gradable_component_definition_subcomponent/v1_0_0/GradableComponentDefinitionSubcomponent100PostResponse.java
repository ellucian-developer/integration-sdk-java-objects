
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
    "ssbsect",
    "shrgcom",
    "shrscom"
})
@Generated("jsonschema2pojo")
public class GradableComponentDefinitionSubcomponent100PostResponse {

    @JsonProperty("ssbsect")
    private List<Ssbsect__1> ssbsect = new ArrayList<Ssbsect__1>();
    @JsonProperty("shrgcom")
    private List<Shrgcom__1> shrgcom = new ArrayList<Shrgcom__1>();
    @JsonProperty("shrscom")
    private List<Shrscom__1> shrscom = new ArrayList<Shrscom__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssbsect")
    public List<Ssbsect__1> getSsbsect() {
        return ssbsect;
    }

    @JsonProperty("ssbsect")
    public void setSsbsect(List<Ssbsect__1> ssbsect) {
        this.ssbsect = ssbsect;
    }

    public GradableComponentDefinitionSubcomponent100PostResponse withSsbsect(List<Ssbsect__1> ssbsect) {
        this.ssbsect = ssbsect;
        return this;
    }

    @JsonProperty("shrgcom")
    public List<Shrgcom__1> getShrgcom() {
        return shrgcom;
    }

    @JsonProperty("shrgcom")
    public void setShrgcom(List<Shrgcom__1> shrgcom) {
        this.shrgcom = shrgcom;
    }

    public GradableComponentDefinitionSubcomponent100PostResponse withShrgcom(List<Shrgcom__1> shrgcom) {
        this.shrgcom = shrgcom;
        return this;
    }

    @JsonProperty("shrscom")
    public List<Shrscom__1> getShrscom() {
        return shrscom;
    }

    @JsonProperty("shrscom")
    public void setShrscom(List<Shrscom__1> shrscom) {
        this.shrscom = shrscom;
    }

    public GradableComponentDefinitionSubcomponent100PostResponse withShrscom(List<Shrscom__1> shrscom) {
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

    public GradableComponentDefinitionSubcomponent100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradableComponentDefinitionSubcomponent100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssbsect");
        sb.append('=');
        sb.append(((this.ssbsect == null)?"<null>":this.ssbsect));
        sb.append(',');
        sb.append("shrgcom");
        sb.append('=');
        sb.append(((this.shrgcom == null)?"<null>":this.shrgcom));
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
        if ((other instanceof GradableComponentDefinitionSubcomponent100PostResponse) == false) {
            return false;
        }
        GradableComponentDefinitionSubcomponent100PostResponse rhs = ((GradableComponentDefinitionSubcomponent100PostResponse) other);
        return (((((this.ssbsect == rhs.ssbsect)||((this.ssbsect!= null)&&this.ssbsect.equals(rhs.ssbsect)))&&((this.shrscom == rhs.shrscom)||((this.shrscom!= null)&&this.shrscom.equals(rhs.shrscom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrgcom == rhs.shrgcom)||((this.shrgcom!= null)&&this.shrgcom.equals(rhs.shrgcom))));
    }

}
