
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
public class FacultyAssignment100PutResponse {

    @JsonProperty("sirasgn")
    private List<Sirasgn__1> sirasgn = new ArrayList<Sirasgn__1>();
    @JsonProperty("sirnist")
    private List<Sirnist__1> sirnist = new ArrayList<Sirnist__1>();
    @JsonProperty("workload")
    private List<Workload__1> workload = new ArrayList<Workload__1>();
    @JsonProperty("sirflrt")
    private List<Sirflrt__1> sirflrt = new ArrayList<Sirflrt__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sirasgn")
    public List<Sirasgn__1> getSirasgn() {
        return sirasgn;
    }

    @JsonProperty("sirasgn")
    public void setSirasgn(List<Sirasgn__1> sirasgn) {
        this.sirasgn = sirasgn;
    }

    public FacultyAssignment100PutResponse withSirasgn(List<Sirasgn__1> sirasgn) {
        this.sirasgn = sirasgn;
        return this;
    }

    @JsonProperty("sirnist")
    public List<Sirnist__1> getSirnist() {
        return sirnist;
    }

    @JsonProperty("sirnist")
    public void setSirnist(List<Sirnist__1> sirnist) {
        this.sirnist = sirnist;
    }

    public FacultyAssignment100PutResponse withSirnist(List<Sirnist__1> sirnist) {
        this.sirnist = sirnist;
        return this;
    }

    @JsonProperty("workload")
    public List<Workload__1> getWorkload() {
        return workload;
    }

    @JsonProperty("workload")
    public void setWorkload(List<Workload__1> workload) {
        this.workload = workload;
    }

    public FacultyAssignment100PutResponse withWorkload(List<Workload__1> workload) {
        this.workload = workload;
        return this;
    }

    @JsonProperty("sirflrt")
    public List<Sirflrt__1> getSirflrt() {
        return sirflrt;
    }

    @JsonProperty("sirflrt")
    public void setSirflrt(List<Sirflrt__1> sirflrt) {
        this.sirflrt = sirflrt;
    }

    public FacultyAssignment100PutResponse withSirflrt(List<Sirflrt__1> sirflrt) {
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

    public FacultyAssignment100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FacultyAssignment100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof FacultyAssignment100PutResponse) == false) {
            return false;
        }
        FacultyAssignment100PutResponse rhs = ((FacultyAssignment100PutResponse) other);
        return ((((((this.sirasgn == rhs.sirasgn)||((this.sirasgn!= null)&&this.sirasgn.equals(rhs.sirasgn)))&&((this.workload == rhs.workload)||((this.workload!= null)&&this.workload.equals(rhs.workload))))&&((this.sirnist == rhs.sirnist)||((this.sirnist!= null)&&this.sirnist.equals(rhs.sirnist))))&&((this.sirflrt == rhs.sirflrt)||((this.sirflrt!= null)&&this.sirflrt.equals(rhs.sirflrt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
