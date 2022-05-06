
package com.ellucian.generated.bpapi.ban.student_classification_rules.v1_0_0;

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
    "sgrclsr",
    "sgrcatt"
})
@Generated("jsonschema2pojo")
public class StudentClassificationRules100PutResponse {

    @JsonProperty("sgrclsr")
    private List<Sgrclsr__2> sgrclsr = new ArrayList<Sgrclsr__2>();
    @JsonProperty("sgrcatt")
    private List<Sgrcatt__2> sgrcatt = new ArrayList<Sgrcatt__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sgrclsr")
    public List<Sgrclsr__2> getSgrclsr() {
        return sgrclsr;
    }

    @JsonProperty("sgrclsr")
    public void setSgrclsr(List<Sgrclsr__2> sgrclsr) {
        this.sgrclsr = sgrclsr;
    }

    public StudentClassificationRules100PutResponse withSgrclsr(List<Sgrclsr__2> sgrclsr) {
        this.sgrclsr = sgrclsr;
        return this;
    }

    @JsonProperty("sgrcatt")
    public List<Sgrcatt__2> getSgrcatt() {
        return sgrcatt;
    }

    @JsonProperty("sgrcatt")
    public void setSgrcatt(List<Sgrcatt__2> sgrcatt) {
        this.sgrcatt = sgrcatt;
    }

    public StudentClassificationRules100PutResponse withSgrcatt(List<Sgrcatt__2> sgrcatt) {
        this.sgrcatt = sgrcatt;
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

    public StudentClassificationRules100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentClassificationRules100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgrclsr");
        sb.append('=');
        sb.append(((this.sgrclsr == null)?"<null>":this.sgrclsr));
        sb.append(',');
        sb.append("sgrcatt");
        sb.append('=');
        sb.append(((this.sgrcatt == null)?"<null>":this.sgrcatt));
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
        result = ((result* 31)+((this.sgrcatt == null)? 0 :this.sgrcatt.hashCode()));
        result = ((result* 31)+((this.sgrclsr == null)? 0 :this.sgrclsr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentClassificationRules100PutResponse) == false) {
            return false;
        }
        StudentClassificationRules100PutResponse rhs = ((StudentClassificationRules100PutResponse) other);
        return ((((this.sgrcatt == rhs.sgrcatt)||((this.sgrcatt!= null)&&this.sgrcatt.equals(rhs.sgrcatt)))&&((this.sgrclsr == rhs.sgrclsr)||((this.sgrclsr!= null)&&this.sgrclsr.equals(rhs.sgrclsr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
