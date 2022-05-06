
package com.ellucian.generated.bpapi.ban.applicant_requirements_additional_requirements.v1_0_0;

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
    "rfrprom",
    "rrrareq_p2"
})
@Generated("jsonschema2pojo")
public class ApplicantRequirementsAdditionalRequirements100GetResponse {

    @JsonProperty("rfrprom")
    private List<Rfrprom> rfrprom = new ArrayList<Rfrprom>();
    @JsonProperty("rrrareq_p2")
    private List<RrrareqP2> rrrareqP2 = new ArrayList<RrrareqP2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rfrprom")
    public List<Rfrprom> getRfrprom() {
        return rfrprom;
    }

    @JsonProperty("rfrprom")
    public void setRfrprom(List<Rfrprom> rfrprom) {
        this.rfrprom = rfrprom;
    }

    public ApplicantRequirementsAdditionalRequirements100GetResponse withRfrprom(List<Rfrprom> rfrprom) {
        this.rfrprom = rfrprom;
        return this;
    }

    @JsonProperty("rrrareq_p2")
    public List<RrrareqP2> getRrrareqP2() {
        return rrrareqP2;
    }

    @JsonProperty("rrrareq_p2")
    public void setRrrareqP2(List<RrrareqP2> rrrareqP2) {
        this.rrrareqP2 = rrrareqP2;
    }

    public ApplicantRequirementsAdditionalRequirements100GetResponse withRrrareqP2(List<RrrareqP2> rrrareqP2) {
        this.rrrareqP2 = rrrareqP2;
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

    public ApplicantRequirementsAdditionalRequirements100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantRequirementsAdditionalRequirements100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rfrprom");
        sb.append('=');
        sb.append(((this.rfrprom == null)?"<null>":this.rfrprom));
        sb.append(',');
        sb.append("rrrareqP2");
        sb.append('=');
        sb.append(((this.rrrareqP2 == null)?"<null>":this.rrrareqP2));
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
        result = ((result* 31)+((this.rrrareqP2 == null)? 0 :this.rrrareqP2 .hashCode()));
        result = ((result* 31)+((this.rfrprom == null)? 0 :this.rfrprom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantRequirementsAdditionalRequirements100GetResponse) == false) {
            return false;
        }
        ApplicantRequirementsAdditionalRequirements100GetResponse rhs = ((ApplicantRequirementsAdditionalRequirements100GetResponse) other);
        return ((((this.rrrareqP2 == rhs.rrrareqP2)||((this.rrrareqP2 != null)&&this.rrrareqP2 .equals(rhs.rrrareqP2)))&&((this.rfrprom == rhs.rfrprom)||((this.rfrprom!= null)&&this.rfrprom.equals(rhs.rfrprom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
