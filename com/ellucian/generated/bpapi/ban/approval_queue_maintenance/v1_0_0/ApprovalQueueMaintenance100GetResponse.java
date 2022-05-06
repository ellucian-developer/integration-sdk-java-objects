
package com.ellucian.generated.bpapi.ban.approval_queue_maintenance.v1_0_0;

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
    "ftvappq",
    "foraqus"
})
@Generated("jsonschema2pojo")
public class ApprovalQueueMaintenance100GetResponse {

    @JsonProperty("ftvappq")
    private List<Ftvappq> ftvappq = new ArrayList<Ftvappq>();
    @JsonProperty("foraqus")
    private List<Foraqu> foraqus = new ArrayList<Foraqu>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ftvappq")
    public List<Ftvappq> getFtvappq() {
        return ftvappq;
    }

    @JsonProperty("ftvappq")
    public void setFtvappq(List<Ftvappq> ftvappq) {
        this.ftvappq = ftvappq;
    }

    public ApprovalQueueMaintenance100GetResponse withFtvappq(List<Ftvappq> ftvappq) {
        this.ftvappq = ftvappq;
        return this;
    }

    @JsonProperty("foraqus")
    public List<Foraqu> getForaqus() {
        return foraqus;
    }

    @JsonProperty("foraqus")
    public void setForaqus(List<Foraqu> foraqus) {
        this.foraqus = foraqus;
    }

    public ApprovalQueueMaintenance100GetResponse withForaqus(List<Foraqu> foraqus) {
        this.foraqus = foraqus;
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

    public ApprovalQueueMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApprovalQueueMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvappq");
        sb.append('=');
        sb.append(((this.ftvappq == null)?"<null>":this.ftvappq));
        sb.append(',');
        sb.append("foraqus");
        sb.append('=');
        sb.append(((this.foraqus == null)?"<null>":this.foraqus));
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
        result = ((result* 31)+((this.ftvappq == null)? 0 :this.ftvappq.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.foraqus == null)? 0 :this.foraqus.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApprovalQueueMaintenance100GetResponse) == false) {
            return false;
        }
        ApprovalQueueMaintenance100GetResponse rhs = ((ApprovalQueueMaintenance100GetResponse) other);
        return ((((this.ftvappq == rhs.ftvappq)||((this.ftvappq!= null)&&this.ftvappq.equals(rhs.ftvappq)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.foraqus == rhs.foraqus)||((this.foraqus!= null)&&this.foraqus.equals(rhs.foraqus))));
    }

}
