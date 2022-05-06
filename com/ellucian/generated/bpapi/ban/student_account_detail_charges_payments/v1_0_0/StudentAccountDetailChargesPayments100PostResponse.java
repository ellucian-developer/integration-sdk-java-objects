
package com.ellucian.generated.bpapi.ban.student_account_detail_charges_payments.v1_0_0;

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
    "tbrcrcp1",
    "tbraccd"
})
@Generated("jsonschema2pojo")
public class StudentAccountDetailChargesPayments100PostResponse {

    @JsonProperty("tbrcrcp1")
    private List<Tbrcrcp1> tbrcrcp1 = new ArrayList<Tbrcrcp1>();
    @JsonProperty("tbraccd")
    private List<Tbraccd__1> tbraccd = new ArrayList<Tbraccd__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbrcrcp1")
    public List<Tbrcrcp1> getTbrcrcp1() {
        return tbrcrcp1;
    }

    @JsonProperty("tbrcrcp1")
    public void setTbrcrcp1(List<Tbrcrcp1> tbrcrcp1) {
        this.tbrcrcp1 = tbrcrcp1;
    }

    public StudentAccountDetailChargesPayments100PostResponse withTbrcrcp1(List<Tbrcrcp1> tbrcrcp1) {
        this.tbrcrcp1 = tbrcrcp1;
        return this;
    }

    @JsonProperty("tbraccd")
    public List<Tbraccd__1> getTbraccd() {
        return tbraccd;
    }

    @JsonProperty("tbraccd")
    public void setTbraccd(List<Tbraccd__1> tbraccd) {
        this.tbraccd = tbraccd;
    }

    public StudentAccountDetailChargesPayments100PostResponse withTbraccd(List<Tbraccd__1> tbraccd) {
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

    public StudentAccountDetailChargesPayments100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAccountDetailChargesPayments100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbrcrcp1");
        sb.append('=');
        sb.append(((this.tbrcrcp1 == null)?"<null>":this.tbrcrcp1));
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
        result = ((result* 31)+((this.tbrcrcp1 == null)? 0 :this.tbrcrcp1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbraccd == null)? 0 :this.tbraccd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAccountDetailChargesPayments100PostResponse) == false) {
            return false;
        }
        StudentAccountDetailChargesPayments100PostResponse rhs = ((StudentAccountDetailChargesPayments100PostResponse) other);
        return ((((this.tbrcrcp1 == rhs.tbrcrcp1)||((this.tbrcrcp1 != null)&&this.tbrcrcp1 .equals(rhs.tbrcrcp1)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbraccd == rhs.tbraccd)||((this.tbraccd!= null)&&this.tbraccd.equals(rhs.tbraccd))));
    }

}
