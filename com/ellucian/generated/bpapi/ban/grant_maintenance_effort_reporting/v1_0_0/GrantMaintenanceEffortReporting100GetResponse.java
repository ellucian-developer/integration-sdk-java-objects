
package com.ellucian.generated.bpapi.ban.grant_maintenance_effort_reporting.v1_0_0;

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
    "frbgrnt",
    "frrgrec"
})
@Generated("jsonschema2pojo")
public class GrantMaintenanceEffortReporting100GetResponse {

    @JsonProperty("frbgrnt")
    private List<Frbgrnt> frbgrnt = new ArrayList<Frbgrnt>();
    @JsonProperty("frrgrec")
    private List<Frrgrec> frrgrec = new ArrayList<Frrgrec>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("frbgrnt")
    public List<Frbgrnt> getFrbgrnt() {
        return frbgrnt;
    }

    @JsonProperty("frbgrnt")
    public void setFrbgrnt(List<Frbgrnt> frbgrnt) {
        this.frbgrnt = frbgrnt;
    }

    public GrantMaintenanceEffortReporting100GetResponse withFrbgrnt(List<Frbgrnt> frbgrnt) {
        this.frbgrnt = frbgrnt;
        return this;
    }

    @JsonProperty("frrgrec")
    public List<Frrgrec> getFrrgrec() {
        return frrgrec;
    }

    @JsonProperty("frrgrec")
    public void setFrrgrec(List<Frrgrec> frrgrec) {
        this.frrgrec = frrgrec;
    }

    public GrantMaintenanceEffortReporting100GetResponse withFrrgrec(List<Frrgrec> frrgrec) {
        this.frrgrec = frrgrec;
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

    public GrantMaintenanceEffortReporting100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantMaintenanceEffortReporting100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("frbgrnt");
        sb.append('=');
        sb.append(((this.frbgrnt == null)?"<null>":this.frbgrnt));
        sb.append(',');
        sb.append("frrgrec");
        sb.append('=');
        sb.append(((this.frrgrec == null)?"<null>":this.frrgrec));
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
        result = ((result* 31)+((this.frrgrec == null)? 0 :this.frrgrec.hashCode()));
        result = ((result* 31)+((this.frbgrnt == null)? 0 :this.frbgrnt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantMaintenanceEffortReporting100GetResponse) == false) {
            return false;
        }
        GrantMaintenanceEffortReporting100GetResponse rhs = ((GrantMaintenanceEffortReporting100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.frrgrec == rhs.frrgrec)||((this.frrgrec!= null)&&this.frrgrec.equals(rhs.frrgrec))))&&((this.frbgrnt == rhs.frbgrnt)||((this.frbgrnt!= null)&&this.frbgrnt.equals(rhs.frbgrnt))));
    }

}
