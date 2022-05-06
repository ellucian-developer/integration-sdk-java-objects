
package com.ellucian.generated.bpapi.ban.applicant_requirements.v1_0_0;

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
    "rrrareq",
    "rorstat"
})
@Generated("jsonschema2pojo")
public class ApplicantRequirements100PostResponse {

    @JsonProperty("rrrareq")
    private List<Rrrareq__1> rrrareq = new ArrayList<Rrrareq__1>();
    @JsonProperty("rorstat")
    private List<Rorstat__1> rorstat = new ArrayList<Rorstat__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rrrareq")
    public List<Rrrareq__1> getRrrareq() {
        return rrrareq;
    }

    @JsonProperty("rrrareq")
    public void setRrrareq(List<Rrrareq__1> rrrareq) {
        this.rrrareq = rrrareq;
    }

    public ApplicantRequirements100PostResponse withRrrareq(List<Rrrareq__1> rrrareq) {
        this.rrrareq = rrrareq;
        return this;
    }

    @JsonProperty("rorstat")
    public List<Rorstat__1> getRorstat() {
        return rorstat;
    }

    @JsonProperty("rorstat")
    public void setRorstat(List<Rorstat__1> rorstat) {
        this.rorstat = rorstat;
    }

    public ApplicantRequirements100PostResponse withRorstat(List<Rorstat__1> rorstat) {
        this.rorstat = rorstat;
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

    public ApplicantRequirements100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantRequirements100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rrrareq");
        sb.append('=');
        sb.append(((this.rrrareq == null)?"<null>":this.rrrareq));
        sb.append(',');
        sb.append("rorstat");
        sb.append('=');
        sb.append(((this.rorstat == null)?"<null>":this.rorstat));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rrrareq == null)? 0 :this.rrrareq.hashCode()));
        result = ((result* 31)+((this.rorstat == null)? 0 :this.rorstat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantRequirements100PostResponse) == false) {
            return false;
        }
        ApplicantRequirements100PostResponse rhs = ((ApplicantRequirements100PostResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.rrrareq == rhs.rrrareq)||((this.rrrareq!= null)&&this.rrrareq.equals(rhs.rrrareq))))&&((this.rorstat == rhs.rorstat)||((this.rorstat!= null)&&this.rorstat.equals(rhs.rorstat))));
    }

}
