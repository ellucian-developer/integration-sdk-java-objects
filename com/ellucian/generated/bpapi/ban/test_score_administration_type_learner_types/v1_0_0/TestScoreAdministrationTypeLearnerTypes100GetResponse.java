
package com.ellucian.generated.bpapi.ban.test_score_administration_type_learner_types.v1_0_0;

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
    "sgbstdn",
    "sorlcur",
    "sorlfos"
})
@Generated("jsonschema2pojo")
public class TestScoreAdministrationTypeLearnerTypes100GetResponse {

    @JsonProperty("sgbstdn")
    private List<Sgbstdn> sgbstdn = new ArrayList<Sgbstdn>();
    @JsonProperty("sorlcur")
    private List<Sorlcur> sorlcur = new ArrayList<Sorlcur>();
    @JsonProperty("sorlfos")
    private List<Sorlfo> sorlfos = new ArrayList<Sorlfo>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sgbstdn")
    public List<Sgbstdn> getSgbstdn() {
        return sgbstdn;
    }

    @JsonProperty("sgbstdn")
    public void setSgbstdn(List<Sgbstdn> sgbstdn) {
        this.sgbstdn = sgbstdn;
    }

    public TestScoreAdministrationTypeLearnerTypes100GetResponse withSgbstdn(List<Sgbstdn> sgbstdn) {
        this.sgbstdn = sgbstdn;
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

    public TestScoreAdministrationTypeLearnerTypes100GetResponse withSorlcur(List<Sorlcur> sorlcur) {
        this.sorlcur = sorlcur;
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

    public TestScoreAdministrationTypeLearnerTypes100GetResponse withSorlfos(List<Sorlfo> sorlfos) {
        this.sorlfos = sorlfos;
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

    public TestScoreAdministrationTypeLearnerTypes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreAdministrationTypeLearnerTypes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgbstdn");
        sb.append('=');
        sb.append(((this.sgbstdn == null)?"<null>":this.sgbstdn));
        sb.append(',');
        sb.append("sorlcur");
        sb.append('=');
        sb.append(((this.sorlcur == null)?"<null>":this.sorlcur));
        sb.append(',');
        sb.append("sorlfos");
        sb.append('=');
        sb.append(((this.sorlfos == null)?"<null>":this.sorlfos));
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
        result = ((result* 31)+((this.sgbstdn == null)? 0 :this.sgbstdn.hashCode()));
        result = ((result* 31)+((this.sorlfos == null)? 0 :this.sorlfos.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorlcur == null)? 0 :this.sorlcur.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreAdministrationTypeLearnerTypes100GetResponse) == false) {
            return false;
        }
        TestScoreAdministrationTypeLearnerTypes100GetResponse rhs = ((TestScoreAdministrationTypeLearnerTypes100GetResponse) other);
        return (((((this.sgbstdn == rhs.sgbstdn)||((this.sgbstdn!= null)&&this.sgbstdn.equals(rhs.sgbstdn)))&&((this.sorlfos == rhs.sorlfos)||((this.sorlfos!= null)&&this.sorlfos.equals(rhs.sorlfos))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorlcur == rhs.sorlcur)||((this.sorlcur!= null)&&this.sorlcur.equals(rhs.sorlcur))));
    }

}
