
package com.ellucian.generated.bpapi.ban.student_sport_eligibility_and_general_comments.v1_0_0;

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
    "sgrathe",
    "sgratct"
})
@Generated("jsonschema2pojo")
public class StudentSportEligibilityAndGeneralComments100PostResponse {

    @JsonProperty("sgrathe")
    private List<Sgrathe__1> sgrathe = new ArrayList<Sgrathe__1>();
    @JsonProperty("sgratct")
    private List<Sgratct__1> sgratct = new ArrayList<Sgratct__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sgrathe")
    public List<Sgrathe__1> getSgrathe() {
        return sgrathe;
    }

    @JsonProperty("sgrathe")
    public void setSgrathe(List<Sgrathe__1> sgrathe) {
        this.sgrathe = sgrathe;
    }

    public StudentSportEligibilityAndGeneralComments100PostResponse withSgrathe(List<Sgrathe__1> sgrathe) {
        this.sgrathe = sgrathe;
        return this;
    }

    @JsonProperty("sgratct")
    public List<Sgratct__1> getSgratct() {
        return sgratct;
    }

    @JsonProperty("sgratct")
    public void setSgratct(List<Sgratct__1> sgratct) {
        this.sgratct = sgratct;
    }

    public StudentSportEligibilityAndGeneralComments100PostResponse withSgratct(List<Sgratct__1> sgratct) {
        this.sgratct = sgratct;
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

    public StudentSportEligibilityAndGeneralComments100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportEligibilityAndGeneralComments100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgrathe");
        sb.append('=');
        sb.append(((this.sgrathe == null)?"<null>":this.sgrathe));
        sb.append(',');
        sb.append("sgratct");
        sb.append('=');
        sb.append(((this.sgratct == null)?"<null>":this.sgratct));
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
        result = ((result* 31)+((this.sgrathe == null)? 0 :this.sgrathe.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sgratct == null)? 0 :this.sgratct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportEligibilityAndGeneralComments100PostResponse) == false) {
            return false;
        }
        StudentSportEligibilityAndGeneralComments100PostResponse rhs = ((StudentSportEligibilityAndGeneralComments100PostResponse) other);
        return ((((this.sgrathe == rhs.sgrathe)||((this.sgrathe!= null)&&this.sgrathe.equals(rhs.sgrathe)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sgratct == rhs.sgratct)||((this.sgratct!= null)&&this.sgratct.equals(rhs.sgratct))));
    }

}
