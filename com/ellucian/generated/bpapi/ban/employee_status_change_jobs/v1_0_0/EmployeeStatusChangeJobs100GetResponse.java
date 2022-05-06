
package com.ellucian.generated.bpapi.ban.employee_status_change_jobs.v1_0_0;

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
    "pebempl",
    "nbrbjob"
})
@Generated("jsonschema2pojo")
public class EmployeeStatusChangeJobs100GetResponse {

    @JsonProperty("pebempl")
    private List<Pebempl> pebempl = new ArrayList<Pebempl>();
    @JsonProperty("nbrbjob")
    private List<Nbrbjob> nbrbjob = new ArrayList<Nbrbjob>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pebempl")
    public List<Pebempl> getPebempl() {
        return pebempl;
    }

    @JsonProperty("pebempl")
    public void setPebempl(List<Pebempl> pebempl) {
        this.pebempl = pebempl;
    }

    public EmployeeStatusChangeJobs100GetResponse withPebempl(List<Pebempl> pebempl) {
        this.pebempl = pebempl;
        return this;
    }

    @JsonProperty("nbrbjob")
    public List<Nbrbjob> getNbrbjob() {
        return nbrbjob;
    }

    @JsonProperty("nbrbjob")
    public void setNbrbjob(List<Nbrbjob> nbrbjob) {
        this.nbrbjob = nbrbjob;
    }

    public EmployeeStatusChangeJobs100GetResponse withNbrbjob(List<Nbrbjob> nbrbjob) {
        this.nbrbjob = nbrbjob;
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

    public EmployeeStatusChangeJobs100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeStatusChangeJobs100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pebempl");
        sb.append('=');
        sb.append(((this.pebempl == null)?"<null>":this.pebempl));
        sb.append(',');
        sb.append("nbrbjob");
        sb.append('=');
        sb.append(((this.nbrbjob == null)?"<null>":this.nbrbjob));
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
        result = ((result* 31)+((this.nbrbjob == null)? 0 :this.nbrbjob.hashCode()));
        result = ((result* 31)+((this.pebempl == null)? 0 :this.pebempl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeStatusChangeJobs100GetResponse) == false) {
            return false;
        }
        EmployeeStatusChangeJobs100GetResponse rhs = ((EmployeeStatusChangeJobs100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.nbrbjob == rhs.nbrbjob)||((this.nbrbjob!= null)&&this.nbrbjob.equals(rhs.nbrbjob))))&&((this.pebempl == rhs.pebempl)||((this.pebempl!= null)&&this.pebempl.equals(rhs.pebempl))));
    }

}
