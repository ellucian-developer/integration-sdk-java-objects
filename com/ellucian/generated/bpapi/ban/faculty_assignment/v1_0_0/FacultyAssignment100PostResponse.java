
package com.ellucian.generated.bpapi.ban.faculty_assignment.v1_0_0;

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
    "sirasgn",
    "sirnist",
    "workload",
    "sirflrt"
})
@Generated("jsonschema2pojo")
public class FacultyAssignment100PostResponse {

    @JsonProperty("sirasgn")
    private List<Sirasgn> sirasgn = new ArrayList<Sirasgn>();
    @JsonProperty("sirnist")
    private List<Sirnist> sirnist = new ArrayList<Sirnist>();
    @JsonProperty("workload")
    private List<Workload> workload = new ArrayList<Workload>();
    @JsonProperty("sirflrt")
    private List<Sirflrt> sirflrt = new ArrayList<Sirflrt>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sirasgn")
    public List<Sirasgn> getSirasgn() {
        return sirasgn;
    }

    @JsonProperty("sirasgn")
    public void setSirasgn(List<Sirasgn> sirasgn) {
        this.sirasgn = sirasgn;
    }

    public FacultyAssignment100PostResponse withSirasgn(List<Sirasgn> sirasgn) {
        this.sirasgn = sirasgn;
        return this;
    }

    @JsonProperty("sirnist")
    public List<Sirnist> getSirnist() {
        return sirnist;
    }

    @JsonProperty("sirnist")
    public void setSirnist(List<Sirnist> sirnist) {
        this.sirnist = sirnist;
    }

    public FacultyAssignment100PostResponse withSirnist(List<Sirnist> sirnist) {
        this.sirnist = sirnist;
        return this;
    }

    @JsonProperty("workload")
    public List<Workload> getWorkload() {
        return workload;
    }

    @JsonProperty("workload")
    public void setWorkload(List<Workload> workload) {
        this.workload = workload;
    }

    public FacultyAssignment100PostResponse withWorkload(List<Workload> workload) {
        this.workload = workload;
        return this;
    }

    @JsonProperty("sirflrt")
    public List<Sirflrt> getSirflrt() {
        return sirflrt;
    }

    @JsonProperty("sirflrt")
    public void setSirflrt(List<Sirflrt> sirflrt) {
        this.sirflrt = sirflrt;
    }

    public FacultyAssignment100PostResponse withSirflrt(List<Sirflrt> sirflrt) {
        this.sirflrt = sirflrt;
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

    public FacultyAssignment100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FacultyAssignment100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sirasgn");
        sb.append('=');
        sb.append(((this.sirasgn == null)?"<null>":this.sirasgn));
        sb.append(',');
        sb.append("sirnist");
        sb.append('=');
        sb.append(((this.sirnist == null)?"<null>":this.sirnist));
        sb.append(',');
        sb.append("workload");
        sb.append('=');
        sb.append(((this.workload == null)?"<null>":this.workload));
        sb.append(',');
        sb.append("sirflrt");
        sb.append('=');
        sb.append(((this.sirflrt == null)?"<null>":this.sirflrt));
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
        result = ((result* 31)+((this.workload == null)? 0 :this.workload.hashCode()));
        result = ((result* 31)+((this.sirnist == null)? 0 :this.sirnist.hashCode()));
        result = ((result* 31)+((this.sirflrt == null)? 0 :this.sirflrt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FacultyAssignment100PostResponse) == false) {
            return false;
        }
        FacultyAssignment100PostResponse rhs = ((FacultyAssignment100PostResponse) other);
        return ((((((this.sirasgn == rhs.sirasgn)||((this.sirasgn!= null)&&this.sirasgn.equals(rhs.sirasgn)))&&((this.workload == rhs.workload)||((this.workload!= null)&&this.workload.equals(rhs.workload))))&&((this.sirnist == rhs.sirnist)||((this.sirnist!= null)&&this.sirnist.equals(rhs.sirnist))))&&((this.sirflrt == rhs.sirflrt)||((this.sirflrt!= null)&&this.sirflrt.equals(rhs.sirflrt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
