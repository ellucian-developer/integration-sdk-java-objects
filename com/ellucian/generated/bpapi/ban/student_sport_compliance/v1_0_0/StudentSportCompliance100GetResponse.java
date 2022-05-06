
package com.ellucian.generated.bpapi.ban.student_sport_compliance.v1_0_0;

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
    "sgvatpt",
    "sgrsprt"
})
@Generated("jsonschema2pojo")
public class StudentSportCompliance100GetResponse {

    @JsonProperty("sgvatpt")
    private List<Sgvatpt> sgvatpt = new ArrayList<Sgvatpt>();
    @JsonProperty("sgrsprt")
    private List<Sgrsprt> sgrsprt = new ArrayList<Sgrsprt>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sgvatpt")
    public List<Sgvatpt> getSgvatpt() {
        return sgvatpt;
    }

    @JsonProperty("sgvatpt")
    public void setSgvatpt(List<Sgvatpt> sgvatpt) {
        this.sgvatpt = sgvatpt;
    }

    public StudentSportCompliance100GetResponse withSgvatpt(List<Sgvatpt> sgvatpt) {
        this.sgvatpt = sgvatpt;
        return this;
    }

    @JsonProperty("sgrsprt")
    public List<Sgrsprt> getSgrsprt() {
        return sgrsprt;
    }

    @JsonProperty("sgrsprt")
    public void setSgrsprt(List<Sgrsprt> sgrsprt) {
        this.sgrsprt = sgrsprt;
    }

    public StudentSportCompliance100GetResponse withSgrsprt(List<Sgrsprt> sgrsprt) {
        this.sgrsprt = sgrsprt;
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

    public StudentSportCompliance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportCompliance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgvatpt");
        sb.append('=');
        sb.append(((this.sgvatpt == null)?"<null>":this.sgvatpt));
        sb.append(',');
        sb.append("sgrsprt");
        sb.append('=');
        sb.append(((this.sgrsprt == null)?"<null>":this.sgrsprt));
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
        result = ((result* 31)+((this.sgrsprt == null)? 0 :this.sgrsprt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sgvatpt == null)? 0 :this.sgvatpt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportCompliance100GetResponse) == false) {
            return false;
        }
        StudentSportCompliance100GetResponse rhs = ((StudentSportCompliance100GetResponse) other);
        return ((((this.sgrsprt == rhs.sgrsprt)||((this.sgrsprt!= null)&&this.sgrsprt.equals(rhs.sgrsprt)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sgvatpt == rhs.sgvatpt)||((this.sgvatpt!= null)&&this.sgvatpt.equals(rhs.sgvatpt))));
    }

}
