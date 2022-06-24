
package com.ellucian.generated.bpapi.ban.test_score_information.v0_1_0;

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
    "sortest",
    "distest"
})
@Generated("jsonschema2pojo")
public class TestScoreInformation010GetResponse {

    @JsonProperty("sortest")
    private List<Sortest> sortest = new ArrayList<Sortest>();
    @JsonProperty("distest")
    private List<Distest> distest = new ArrayList<Distest>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sortest")
    public List<Sortest> getSortest() {
        return sortest;
    }

    @JsonProperty("sortest")
    public void setSortest(List<Sortest> sortest) {
        this.sortest = sortest;
    }

    public TestScoreInformation010GetResponse withSortest(List<Sortest> sortest) {
        this.sortest = sortest;
        return this;
    }

    @JsonProperty("distest")
    public List<Distest> getDistest() {
        return distest;
    }

    @JsonProperty("distest")
    public void setDistest(List<Distest> distest) {
        this.distest = distest;
    }

    public TestScoreInformation010GetResponse withDistest(List<Distest> distest) {
        this.distest = distest;
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

    public TestScoreInformation010GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreInformation010GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sortest");
        sb.append('=');
        sb.append(((this.sortest == null)?"<null>":this.sortest));
        sb.append(',');
        sb.append("distest");
        sb.append('=');
        sb.append(((this.distest == null)?"<null>":this.distest));
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
        result = ((result* 31)+((this.sortest == null)? 0 :this.sortest.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.distest == null)? 0 :this.distest.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreInformation010GetResponse) == false) {
            return false;
        }
        TestScoreInformation010GetResponse rhs = ((TestScoreInformation010GetResponse) other);
        return ((((this.sortest == rhs.sortest)||((this.sortest!= null)&&this.sortest.equals(rhs.sortest)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.distest == rhs.distest)||((this.distest!= null)&&this.distest.equals(rhs.distest))));
    }

}
