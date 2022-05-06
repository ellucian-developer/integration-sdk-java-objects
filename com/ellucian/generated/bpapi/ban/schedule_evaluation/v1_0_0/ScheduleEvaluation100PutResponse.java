
package com.ellucian.generated.bpapi.ban.schedule_evaluation.v1_0_0;

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
    "stveval",
    "sirasgn"
})
@Generated("jsonschema2pojo")
public class ScheduleEvaluation100PutResponse {

    @JsonProperty("stveval")
    private List<Stveval__1> stveval = new ArrayList<Stveval__1>();
    @JsonProperty("sirasgn")
    private List<Sirasgn__1> sirasgn = new ArrayList<Sirasgn__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stveval")
    public List<Stveval__1> getStveval() {
        return stveval;
    }

    @JsonProperty("stveval")
    public void setStveval(List<Stveval__1> stveval) {
        this.stveval = stveval;
    }

    public ScheduleEvaluation100PutResponse withStveval(List<Stveval__1> stveval) {
        this.stveval = stveval;
        return this;
    }

    @JsonProperty("sirasgn")
    public List<Sirasgn__1> getSirasgn() {
        return sirasgn;
    }

    @JsonProperty("sirasgn")
    public void setSirasgn(List<Sirasgn__1> sirasgn) {
        this.sirasgn = sirasgn;
    }

    public ScheduleEvaluation100PutResponse withSirasgn(List<Sirasgn__1> sirasgn) {
        this.sirasgn = sirasgn;
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

    public ScheduleEvaluation100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleEvaluation100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stveval");
        sb.append('=');
        sb.append(((this.stveval == null)?"<null>":this.stveval));
        sb.append(',');
        sb.append("sirasgn");
        sb.append('=');
        sb.append(((this.sirasgn == null)?"<null>":this.sirasgn));
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
        result = ((result* 31)+((this.sirasgn == null)? 0 :this.sirasgn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stveval == null)? 0 :this.stveval.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleEvaluation100PutResponse) == false) {
            return false;
        }
        ScheduleEvaluation100PutResponse rhs = ((ScheduleEvaluation100PutResponse) other);
        return ((((this.sirasgn == rhs.sirasgn)||((this.sirasgn!= null)&&this.sirasgn.equals(rhs.sirasgn)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stveval == rhs.stveval)||((this.stveval!= null)&&this.stveval.equals(rhs.stveval))));
    }

}
