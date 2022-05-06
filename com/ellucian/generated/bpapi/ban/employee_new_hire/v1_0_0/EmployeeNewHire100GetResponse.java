
package com.ellucian.generated.bpapi.ban.employee_new_hire.v1_0_0;

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
    "bio_demo",
    "gorprac"
})
@Generated("jsonschema2pojo")
public class EmployeeNewHire100GetResponse {

    @JsonProperty("bio_demo")
    private List<BioDemo> bioDemo = new ArrayList<BioDemo>();
    @JsonProperty("gorprac")
    private List<Gorprac> gorprac = new ArrayList<Gorprac>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bio_demo")
    public List<BioDemo> getBioDemo() {
        return bioDemo;
    }

    @JsonProperty("bio_demo")
    public void setBioDemo(List<BioDemo> bioDemo) {
        this.bioDemo = bioDemo;
    }

    public EmployeeNewHire100GetResponse withBioDemo(List<BioDemo> bioDemo) {
        this.bioDemo = bioDemo;
        return this;
    }

    @JsonProperty("gorprac")
    public List<Gorprac> getGorprac() {
        return gorprac;
    }

    @JsonProperty("gorprac")
    public void setGorprac(List<Gorprac> gorprac) {
        this.gorprac = gorprac;
    }

    public EmployeeNewHire100GetResponse withGorprac(List<Gorprac> gorprac) {
        this.gorprac = gorprac;
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

    public EmployeeNewHire100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeNewHire100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bioDemo");
        sb.append('=');
        sb.append(((this.bioDemo == null)?"<null>":this.bioDemo));
        sb.append(',');
        sb.append("gorprac");
        sb.append('=');
        sb.append(((this.gorprac == null)?"<null>":this.gorprac));
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
        result = ((result* 31)+((this.gorprac == null)? 0 :this.gorprac.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bioDemo == null)? 0 :this.bioDemo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeNewHire100GetResponse) == false) {
            return false;
        }
        EmployeeNewHire100GetResponse rhs = ((EmployeeNewHire100GetResponse) other);
        return ((((this.gorprac == rhs.gorprac)||((this.gorprac!= null)&&this.gorprac.equals(rhs.gorprac)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bioDemo == rhs.bioDemo)||((this.bioDemo!= null)&&this.bioDemo.equals(rhs.bioDemo))));
    }

}
