
package com.ellucian.generated.bpapi.ban.admissions_decision_processing.v1_0_0;

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
    "saradap",
    "sarappd"
})
@Generated("jsonschema2pojo")
public class AdmissionsDecisionProcessing100GetResponse {

    @JsonProperty("saradap")
    private List<Saradap> saradap = new ArrayList<Saradap>();
    @JsonProperty("sarappd")
    private List<Sarappd> sarappd = new ArrayList<Sarappd>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("saradap")
    public List<Saradap> getSaradap() {
        return saradap;
    }

    @JsonProperty("saradap")
    public void setSaradap(List<Saradap> saradap) {
        this.saradap = saradap;
    }

    public AdmissionsDecisionProcessing100GetResponse withSaradap(List<Saradap> saradap) {
        this.saradap = saradap;
        return this;
    }

    @JsonProperty("sarappd")
    public List<Sarappd> getSarappd() {
        return sarappd;
    }

    @JsonProperty("sarappd")
    public void setSarappd(List<Sarappd> sarappd) {
        this.sarappd = sarappd;
    }

    public AdmissionsDecisionProcessing100GetResponse withSarappd(List<Sarappd> sarappd) {
        this.sarappd = sarappd;
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

    public AdmissionsDecisionProcessing100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsDecisionProcessing100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saradap");
        sb.append('=');
        sb.append(((this.saradap == null)?"<null>":this.saradap));
        sb.append(',');
        sb.append("sarappd");
        sb.append('=');
        sb.append(((this.sarappd == null)?"<null>":this.sarappd));
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
        result = ((result* 31)+((this.saradap == null)? 0 :this.saradap.hashCode()));
        result = ((result* 31)+((this.sarappd == null)? 0 :this.sarappd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsDecisionProcessing100GetResponse) == false) {
            return false;
        }
        AdmissionsDecisionProcessing100GetResponse rhs = ((AdmissionsDecisionProcessing100GetResponse) other);
        return ((((this.saradap == rhs.saradap)||((this.saradap!= null)&&this.saradap.equals(rhs.saradap)))&&((this.sarappd == rhs.sarappd)||((this.sarappd!= null)&&this.sarappd.equals(rhs.sarappd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
