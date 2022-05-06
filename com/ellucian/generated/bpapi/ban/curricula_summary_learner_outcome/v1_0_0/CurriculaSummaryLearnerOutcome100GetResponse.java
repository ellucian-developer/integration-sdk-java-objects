
package com.ellucian.generated.bpapi.ban.curricula_summary_learner_outcome.v1_0_0;

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
    "shrdgmr",
    "sorlfos",
    "sorlcur"
})
@Generated("jsonschema2pojo")
public class CurriculaSummaryLearnerOutcome100GetResponse {

    @JsonProperty("shrdgmr")
    private List<Shrdgmr> shrdgmr = new ArrayList<Shrdgmr>();
    @JsonProperty("sorlfos")
    private List<Sorlfo> sorlfos = new ArrayList<Sorlfo>();
    @JsonProperty("sorlcur")
    private List<Sorlcur> sorlcur = new ArrayList<Sorlcur>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrdgmr")
    public List<Shrdgmr> getShrdgmr() {
        return shrdgmr;
    }

    @JsonProperty("shrdgmr")
    public void setShrdgmr(List<Shrdgmr> shrdgmr) {
        this.shrdgmr = shrdgmr;
    }

    public CurriculaSummaryLearnerOutcome100GetResponse withShrdgmr(List<Shrdgmr> shrdgmr) {
        this.shrdgmr = shrdgmr;
        return this;
    }

    @JsonProperty("sorlfos")
    public List<Sorlfo> getSorlfos() {
        return sorlfos;
    }

    @JsonProperty("sorlfos")
    public void setSorlfos(List<Sorlfo> sorlfos) {
        this.sorlfos = sorlfos;
    }

    public CurriculaSummaryLearnerOutcome100GetResponse withSorlfos(List<Sorlfo> sorlfos) {
        this.sorlfos = sorlfos;
        return this;
    }

    @JsonProperty("sorlcur")
    public List<Sorlcur> getSorlcur() {
        return sorlcur;
    }

    @JsonProperty("sorlcur")
    public void setSorlcur(List<Sorlcur> sorlcur) {
        this.sorlcur = sorlcur;
    }

    public CurriculaSummaryLearnerOutcome100GetResponse withSorlcur(List<Sorlcur> sorlcur) {
        this.sorlcur = sorlcur;
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

    public CurriculaSummaryLearnerOutcome100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculaSummaryLearnerOutcome100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrdgmr");
        sb.append('=');
        sb.append(((this.shrdgmr == null)?"<null>":this.shrdgmr));
        sb.append(',');
        sb.append("sorlfos");
        sb.append('=');
        sb.append(((this.sorlfos == null)?"<null>":this.sorlfos));
        sb.append(',');
        sb.append("sorlcur");
        sb.append('=');
        sb.append(((this.sorlcur == null)?"<null>":this.sorlcur));
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
        result = ((result* 31)+((this.sorlfos == null)? 0 :this.sorlfos.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorlcur == null)? 0 :this.sorlcur.hashCode()));
        result = ((result* 31)+((this.shrdgmr == null)? 0 :this.shrdgmr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculaSummaryLearnerOutcome100GetResponse) == false) {
            return false;
        }
        CurriculaSummaryLearnerOutcome100GetResponse rhs = ((CurriculaSummaryLearnerOutcome100GetResponse) other);
        return (((((this.sorlfos == rhs.sorlfos)||((this.sorlfos!= null)&&this.sorlfos.equals(rhs.sorlfos)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorlcur == rhs.sorlcur)||((this.sorlcur!= null)&&this.sorlcur.equals(rhs.sorlcur))))&&((this.shrdgmr == rhs.shrdgmr)||((this.shrdgmr!= null)&&this.shrdgmr.equals(rhs.shrdgmr))));
    }

}
