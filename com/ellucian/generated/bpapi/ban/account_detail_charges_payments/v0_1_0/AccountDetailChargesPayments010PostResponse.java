
package com.ellucian.generated.bpapi.ban.account_detail_charges_payments.v0_1_0;

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
    "tbraccd_ctrl",
    "tbraccd"
})
@Generated("jsonschema2pojo")
public class AccountDetailChargesPayments010PostResponse {

    @JsonProperty("tbraccd_ctrl")
    private List<TbraccdCtrl> tbraccdCtrl = new ArrayList<TbraccdCtrl>();
    @JsonProperty("tbraccd")
    private List<Tbraccd> tbraccd = new ArrayList<Tbraccd>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbraccd_ctrl")
    public List<TbraccdCtrl> getTbraccdCtrl() {
        return tbraccdCtrl;
    }

    @JsonProperty("tbraccd_ctrl")
    public void setTbraccdCtrl(List<TbraccdCtrl> tbraccdCtrl) {
        this.tbraccdCtrl = tbraccdCtrl;
    }

    public AccountDetailChargesPayments010PostResponse withTbraccdCtrl(List<TbraccdCtrl> tbraccdCtrl) {
        this.tbraccdCtrl = tbraccdCtrl;
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

    public AccountDetailChargesPayments010PostResponse withTbraccd(List<Tbraccd> tbraccd) {
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

    public AccountDetailChargesPayments010PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetailChargesPayments010PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbraccdCtrl");
        sb.append('=');
        sb.append(((this.tbraccdCtrl == null)?"<null>":this.tbraccdCtrl));
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
        result = ((result* 31)+((this.tbraccdCtrl == null)? 0 :this.tbraccdCtrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbraccd == null)? 0 :this.tbraccd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetailChargesPayments010PostResponse) == false) {
            return false;
        }
        AccountDetailChargesPayments010PostResponse rhs = ((AccountDetailChargesPayments010PostResponse) other);
        return ((((this.tbraccdCtrl == rhs.tbraccdCtrl)||((this.tbraccdCtrl!= null)&&this.tbraccdCtrl.equals(rhs.tbraccdCtrl)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbraccd == rhs.tbraccd)||((this.tbraccd!= null)&&this.tbraccd.equals(rhs.tbraccd))));
    }

}
