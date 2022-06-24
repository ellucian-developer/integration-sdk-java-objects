
package com.ellucian.generated.bpapi.ban.account_detail_deposits.v1_0_0;

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
    "tbraccd",
    "tbrdepo",
    "tbrcrcp2"
})
@Generated("jsonschema2pojo")
public class AccountDetailDeposits100GetResponse {

    @JsonProperty("tbraccd")
    private List<Tbraccd> tbraccd = new ArrayList<Tbraccd>();
    @JsonProperty("tbrdepo")
    private List<Tbrdepo> tbrdepo = new ArrayList<Tbrdepo>();
    @JsonProperty("tbrcrcp2")
    private List<Tbrcrcp2> tbrcrcp2 = new ArrayList<Tbrcrcp2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbraccd")
    public List<Tbraccd> getTbraccd() {
        return tbraccd;
    }

    @JsonProperty("tbraccd")
    public void setTbraccd(List<Tbraccd> tbraccd) {
        this.tbraccd = tbraccd;
    }

    public AccountDetailDeposits100GetResponse withTbraccd(List<Tbraccd> tbraccd) {
        this.tbraccd = tbraccd;
        return this;
    }

    @JsonProperty("tbrdepo")
    public List<Tbrdepo> getTbrdepo() {
        return tbrdepo;
    }

    @JsonProperty("tbrdepo")
    public void setTbrdepo(List<Tbrdepo> tbrdepo) {
        this.tbrdepo = tbrdepo;
    }

    public AccountDetailDeposits100GetResponse withTbrdepo(List<Tbrdepo> tbrdepo) {
        this.tbrdepo = tbrdepo;
        return this;
    }

    @JsonProperty("tbrcrcp2")
    public List<Tbrcrcp2> getTbrcrcp2() {
        return tbrcrcp2;
    }

    @JsonProperty("tbrcrcp2")
    public void setTbrcrcp2(List<Tbrcrcp2> tbrcrcp2) {
        this.tbrcrcp2 = tbrcrcp2;
    }

    public AccountDetailDeposits100GetResponse withTbrcrcp2(List<Tbrcrcp2> tbrcrcp2) {
        this.tbrcrcp2 = tbrcrcp2;
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

    public AccountDetailDeposits100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetailDeposits100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbraccd");
        sb.append('=');
        sb.append(((this.tbraccd == null)?"<null>":this.tbraccd));
        sb.append(',');
        sb.append("tbrdepo");
        sb.append('=');
        sb.append(((this.tbrdepo == null)?"<null>":this.tbrdepo));
        sb.append(',');
        sb.append("tbrcrcp2");
        sb.append('=');
        sb.append(((this.tbrcrcp2 == null)?"<null>":this.tbrcrcp2));
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
        result = ((result* 31)+((this.tbrcrcp2 == null)? 0 :this.tbrcrcp2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbraccd == null)? 0 :this.tbraccd.hashCode()));
        result = ((result* 31)+((this.tbrdepo == null)? 0 :this.tbrdepo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetailDeposits100GetResponse) == false) {
            return false;
        }
        AccountDetailDeposits100GetResponse rhs = ((AccountDetailDeposits100GetResponse) other);
        return (((((this.tbrcrcp2 == rhs.tbrcrcp2)||((this.tbrcrcp2 != null)&&this.tbrcrcp2 .equals(rhs.tbrcrcp2)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbraccd == rhs.tbraccd)||((this.tbraccd!= null)&&this.tbraccd.equals(rhs.tbraccd))))&&((this.tbrdepo == rhs.tbrdepo)||((this.tbrdepo!= null)&&this.tbrdepo.equals(rhs.tbrdepo))));
    }

}
