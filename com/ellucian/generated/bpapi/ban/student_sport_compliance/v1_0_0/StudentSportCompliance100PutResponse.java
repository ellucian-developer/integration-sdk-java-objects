
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
public class StudentSportCompliance100PutResponse {

    @JsonProperty("sgvatpt")
    private List<Sgvatpt__2> sgvatpt = new ArrayList<Sgvatpt__2>();
    @JsonProperty("sgrsprt")
    private List<Sgrsprt__2> sgrsprt = new ArrayList<Sgrsprt__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sgvatpt")
    public List<Sgvatpt__2> getSgvatpt() {
        return sgvatpt;
    }

    @JsonProperty("sgvatpt")
    public void setSgvatpt(List<Sgvatpt__2> sgvatpt) {
        this.sgvatpt = sgvatpt;
    }

    public StudentSportCompliance100PutResponse withSgvatpt(List<Sgvatpt__2> sgvatpt) {
        this.sgvatpt = sgvatpt;
        return this;
    }

    @JsonProperty("sgrsprt")
    public List<Sgrsprt__2> getSgrsprt() {
        return sgrsprt;
    }

    @JsonProperty("sgrsprt")
    public void setSgrsprt(List<Sgrsprt__2> sgrsprt) {
        this.sgrsprt = sgrsprt;
    }

    public StudentSportCompliance100PutResponse withSgrsprt(List<Sgrsprt__2> sgrsprt) {
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

    public StudentSportCompliance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportCompliance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof StudentSportCompliance100PutResponse) == false) {
            return false;
        }
        StudentSportCompliance100PutResponse rhs = ((StudentSportCompliance100PutResponse) other);
        return ((((this.sgrsprt == rhs.sgrsprt)||((this.sgrsprt!= null)&&this.sgrsprt.equals(rhs.sgrsprt)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sgvatpt == rhs.sgvatpt)||((this.sgvatpt!= null)&&this.sgvatpt.equals(rhs.sgvatpt))));
    }

}
