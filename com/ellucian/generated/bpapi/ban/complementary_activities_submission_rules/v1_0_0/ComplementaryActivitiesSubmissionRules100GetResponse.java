
package com.ellucian.generated.bpapi.ban.complementary_activities_submission_rules.v1_0_0;

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
    "sobcasr",
    "sorcada"
})
@Generated("jsonschema2pojo")
public class ComplementaryActivitiesSubmissionRules100GetResponse {

    @JsonProperty("sobcasr")
    private List<Sobcasr> sobcasr = new ArrayList<Sobcasr>();
    @JsonProperty("sorcada")
    private List<Sorcada> sorcada = new ArrayList<Sorcada>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sobcasr")
    public List<Sobcasr> getSobcasr() {
        return sobcasr;
    }

    @JsonProperty("sobcasr")
    public void setSobcasr(List<Sobcasr> sobcasr) {
        this.sobcasr = sobcasr;
    }

    public ComplementaryActivitiesSubmissionRules100GetResponse withSobcasr(List<Sobcasr> sobcasr) {
        this.sobcasr = sobcasr;
        return this;
    }

    @JsonProperty("sorcada")
    public List<Sorcada> getSorcada() {
        return sorcada;
    }

    @JsonProperty("sorcada")
    public void setSorcada(List<Sorcada> sorcada) {
        this.sorcada = sorcada;
    }

    public ComplementaryActivitiesSubmissionRules100GetResponse withSorcada(List<Sorcada> sorcada) {
        this.sorcada = sorcada;
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

    public ComplementaryActivitiesSubmissionRules100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplementaryActivitiesSubmissionRules100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sobcasr");
        sb.append('=');
        sb.append(((this.sobcasr == null)?"<null>":this.sobcasr));
        sb.append(',');
        sb.append("sorcada");
        sb.append('=');
        sb.append(((this.sorcada == null)?"<null>":this.sorcada));
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
        result = ((result* 31)+((this.sobcasr == null)? 0 :this.sobcasr.hashCode()));
        result = ((result* 31)+((this.sorcada == null)? 0 :this.sorcada.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplementaryActivitiesSubmissionRules100GetResponse) == false) {
            return false;
        }
        ComplementaryActivitiesSubmissionRules100GetResponse rhs = ((ComplementaryActivitiesSubmissionRules100GetResponse) other);
        return ((((this.sobcasr == rhs.sobcasr)||((this.sobcasr!= null)&&this.sobcasr.equals(rhs.sobcasr)))&&((this.sorcada == rhs.sorcada)||((this.sorcada!= null)&&this.sorcada.equals(rhs.sorcada))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
