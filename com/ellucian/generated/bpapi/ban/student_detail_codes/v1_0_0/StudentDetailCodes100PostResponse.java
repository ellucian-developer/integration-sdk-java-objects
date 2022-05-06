
package com.ellucian.generated.bpapi.ban.student_detail_codes.v1_0_0;

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
    "tbbdetc",
    "tbracct2",
    "tbbeact"
})
@Generated("jsonschema2pojo")
public class StudentDetailCodes100PostResponse {

    @JsonProperty("tbbdetc")
    private List<Tbbdetc__1> tbbdetc = new ArrayList<Tbbdetc__1>();
    @JsonProperty("tbracct2")
    private List<Tbracct2__1> tbracct2 = new ArrayList<Tbracct2__1>();
    @JsonProperty("tbbeact")
    private List<Tbbeact__1> tbbeact = new ArrayList<Tbbeact__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbbdetc")
    public List<Tbbdetc__1> getTbbdetc() {
        return tbbdetc;
    }

    @JsonProperty("tbbdetc")
    public void setTbbdetc(List<Tbbdetc__1> tbbdetc) {
        this.tbbdetc = tbbdetc;
    }

    public StudentDetailCodes100PostResponse withTbbdetc(List<Tbbdetc__1> tbbdetc) {
        this.tbbdetc = tbbdetc;
        return this;
    }

    @JsonProperty("tbracct2")
    public List<Tbracct2__1> getTbracct2() {
        return tbracct2;
    }

    @JsonProperty("tbracct2")
    public void setTbracct2(List<Tbracct2__1> tbracct2) {
        this.tbracct2 = tbracct2;
    }

    public StudentDetailCodes100PostResponse withTbracct2(List<Tbracct2__1> tbracct2) {
        this.tbracct2 = tbracct2;
        return this;
    }

    @JsonProperty("tbbeact")
    public List<Tbbeact__1> getTbbeact() {
        return tbbeact;
    }

    @JsonProperty("tbbeact")
    public void setTbbeact(List<Tbbeact__1> tbbeact) {
        this.tbbeact = tbbeact;
    }

    public StudentDetailCodes100PostResponse withTbbeact(List<Tbbeact__1> tbbeact) {
        this.tbbeact = tbbeact;
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

    public StudentDetailCodes100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentDetailCodes100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbdetc");
        sb.append('=');
        sb.append(((this.tbbdetc == null)?"<null>":this.tbbdetc));
        sb.append(',');
        sb.append("tbracct2");
        sb.append('=');
        sb.append(((this.tbracct2 == null)?"<null>":this.tbracct2));
        sb.append(',');
        sb.append("tbbeact");
        sb.append('=');
        sb.append(((this.tbbeact == null)?"<null>":this.tbbeact));
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
        result = ((result* 31)+((this.tbracct2 == null)? 0 :this.tbracct2 .hashCode()));
        result = ((result* 31)+((this.tbbeact == null)? 0 :this.tbbeact.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbbdetc == null)? 0 :this.tbbdetc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentDetailCodes100PostResponse) == false) {
            return false;
        }
        StudentDetailCodes100PostResponse rhs = ((StudentDetailCodes100PostResponse) other);
        return (((((this.tbracct2 == rhs.tbracct2)||((this.tbracct2 != null)&&this.tbracct2 .equals(rhs.tbracct2)))&&((this.tbbeact == rhs.tbbeact)||((this.tbbeact!= null)&&this.tbbeact.equals(rhs.tbbeact))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbbdetc == rhs.tbbdetc)||((this.tbbdetc!= null)&&this.tbbdetc.equals(rhs.tbbdetc))));
    }

}
