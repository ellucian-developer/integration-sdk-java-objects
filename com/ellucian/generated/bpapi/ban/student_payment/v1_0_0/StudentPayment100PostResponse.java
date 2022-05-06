
package com.ellucian.generated.bpapi.ban.student_payment.v1_0_0;

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
    "account_ctrl",
    "tbraccd"
})
@Generated("jsonschema2pojo")
public class StudentPayment100PostResponse {

    @JsonProperty("account_ctrl")
    private List<AccountCtrl__1> accountCtrl = new ArrayList<AccountCtrl__1>();
    @JsonProperty("tbraccd")
    private List<Tbraccd__1> tbraccd = new ArrayList<Tbraccd__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("account_ctrl")
    public List<AccountCtrl__1> getAccountCtrl() {
        return accountCtrl;
    }

    @JsonProperty("account_ctrl")
    public void setAccountCtrl(List<AccountCtrl__1> accountCtrl) {
        this.accountCtrl = accountCtrl;
    }

    public StudentPayment100PostResponse withAccountCtrl(List<AccountCtrl__1> accountCtrl) {
        this.accountCtrl = accountCtrl;
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

    public StudentPayment100PostResponse withTbraccd(List<Tbraccd__1> tbraccd) {
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

    public StudentPayment100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentPayment100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountCtrl");
        sb.append('=');
        sb.append(((this.accountCtrl == null)?"<null>":this.accountCtrl));
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
        result = ((result* 31)+((this.accountCtrl == null)? 0 :this.accountCtrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbraccd == null)? 0 :this.tbraccd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentPayment100PostResponse) == false) {
            return false;
        }
        StudentPayment100PostResponse rhs = ((StudentPayment100PostResponse) other);
        return ((((this.accountCtrl == rhs.accountCtrl)||((this.accountCtrl!= null)&&this.accountCtrl.equals(rhs.accountCtrl)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbraccd == rhs.tbraccd)||((this.tbraccd!= null)&&this.tbraccd.equals(rhs.tbraccd))));
    }

}
