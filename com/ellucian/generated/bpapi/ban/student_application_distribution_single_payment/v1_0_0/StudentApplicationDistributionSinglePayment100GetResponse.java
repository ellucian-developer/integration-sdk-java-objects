
package com.ellucian.generated.bpapi.ban.student_application_distribution_single_payment.v1_0_0;

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
    "tbrcrcp",
    "tbraccd"
})
@Generated("jsonschema2pojo")
public class StudentApplicationDistributionSinglePayment100GetResponse {

    @JsonProperty("tbrcrcp")
    private List<Tbrcrcp> tbrcrcp = new ArrayList<Tbrcrcp>();
    @JsonProperty("tbraccd")
    private List<Tbraccd> tbraccd = new ArrayList<Tbraccd>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbrcrcp")
    public List<Tbrcrcp> getTbrcrcp() {
        return tbrcrcp;
    }

    @JsonProperty("tbrcrcp")
    public void setTbrcrcp(List<Tbrcrcp> tbrcrcp) {
        this.tbrcrcp = tbrcrcp;
    }

    public StudentApplicationDistributionSinglePayment100GetResponse withTbrcrcp(List<Tbrcrcp> tbrcrcp) {
        this.tbrcrcp = tbrcrcp;
        return this;
    }

    @JsonProperty("tbraccd")
    public List<Tbraccd> getTbraccd() {
        return tbraccd;
    }

    @JsonProperty("tbraccd")
    public void setTbraccd(List<Tbraccd> tbraccd) {
        this.tbraccd = tbraccd;
    }

    public StudentApplicationDistributionSinglePayment100GetResponse withTbraccd(List<Tbraccd> tbraccd) {
        this.tbraccd = tbraccd;
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

    public StudentApplicationDistributionSinglePayment100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentApplicationDistributionSinglePayment100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbrcrcp");
        sb.append('=');
        sb.append(((this.tbrcrcp == null)?"<null>":this.tbrcrcp));
        sb.append(',');
        sb.append("tbraccd");
        sb.append('=');
        sb.append(((this.tbraccd == null)?"<null>":this.tbraccd));
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
        result = ((result* 31)+((this.tbrcrcp == null)? 0 :this.tbrcrcp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbraccd == null)? 0 :this.tbraccd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentApplicationDistributionSinglePayment100GetResponse) == false) {
            return false;
        }
        StudentApplicationDistributionSinglePayment100GetResponse rhs = ((StudentApplicationDistributionSinglePayment100GetResponse) other);
        return ((((this.tbrcrcp == rhs.tbrcrcp)||((this.tbrcrcp!= null)&&this.tbrcrcp.equals(rhs.tbrcrcp)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbraccd == rhs.tbraccd)||((this.tbraccd!= null)&&this.tbraccd.equals(rhs.tbraccd))));
    }

}
