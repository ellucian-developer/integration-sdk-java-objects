
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
    "sortspc"
})
@Generated("jsonschema2pojo")
public class TestScoreInformation010PostResponse {

    @JsonProperty("sortest")
    private List<Sortest__1> sortest = new ArrayList<Sortest__1>();
    @JsonProperty("sortspc")
    private List<Sortspc> sortspc = new ArrayList<Sortspc>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sortest")
    public List<Sortest__1> getSortest() {
        return sortest;
    }

    @JsonProperty("sortest")
    public void setSortest(List<Sortest__1> sortest) {
        this.sortest = sortest;
    }

    public TestScoreInformation010PostResponse withSortest(List<Sortest__1> sortest) {
        this.sortest = sortest;
        return this;
    }

    @JsonProperty("sortspc")
    public List<Sortspc> getSortspc() {
        return sortspc;
    }

    @JsonProperty("sortspc")
    public void setSortspc(List<Sortspc> sortspc) {
        this.sortspc = sortspc;
    }

    public TestScoreInformation010PostResponse withSortspc(List<Sortspc> sortspc) {
        this.sortspc = sortspc;
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

    public TestScoreInformation010PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreInformation010PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sortest");
        sb.append('=');
        sb.append(((this.sortest == null)?"<null>":this.sortest));
        sb.append(',');
        sb.append("sortspc");
        sb.append('=');
        sb.append(((this.sortspc == null)?"<null>":this.sortspc));
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
        result = ((result* 31)+((this.sortspc == null)? 0 :this.sortspc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreInformation010PostResponse) == false) {
            return false;
        }
        TestScoreInformation010PostResponse rhs = ((TestScoreInformation010PostResponse) other);
        return ((((this.sortest == rhs.sortest)||((this.sortest!= null)&&this.sortest.equals(rhs.sortest)))&&((this.sortspc == rhs.sortspc)||((this.sortspc!= null)&&this.sortspc.equals(rhs.sortspc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
