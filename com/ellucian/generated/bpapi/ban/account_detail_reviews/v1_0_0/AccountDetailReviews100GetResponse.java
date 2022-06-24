
package com.ellucian.generated.bpapi.ban.account_detail_reviews.v1_0_0;

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
    "tbraccd",
    "tbrcsum",
    "tbrcbrq",
    "tbraccd_ctrl"
})
@Generated("jsonschema2pojo")
public class AccountDetailReviews100GetResponse {

    @JsonProperty("tbrcrcp")
    private List<Tbrcrcp> tbrcrcp = new ArrayList<Tbrcrcp>();
    @JsonProperty("tbraccd")
    private List<Tbraccd> tbraccd = new ArrayList<Tbraccd>();
    @JsonProperty("tbrcsum")
    private List<Tbrcsum> tbrcsum = new ArrayList<Tbrcsum>();
    @JsonProperty("tbrcbrq")
    private List<Tbrcbrq> tbrcbrq = new ArrayList<Tbrcbrq>();
    @JsonProperty("tbraccd_ctrl")
    private List<TbraccdCtrl> tbraccdCtrl = new ArrayList<TbraccdCtrl>();
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

    public AccountDetailReviews100GetResponse withTbrcrcp(List<Tbrcrcp> tbrcrcp) {
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

    public AccountDetailReviews100GetResponse withTbraccd(List<Tbraccd> tbraccd) {
        this.tbraccd = tbraccd;
        return this;
    }

    @JsonProperty("tbrcsum")
    public List<Tbrcsum> getTbrcsum() {
        return tbrcsum;
    }

    @JsonProperty("tbrcsum")
    public void setTbrcsum(List<Tbrcsum> tbrcsum) {
        this.tbrcsum = tbrcsum;
    }

    public AccountDetailReviews100GetResponse withTbrcsum(List<Tbrcsum> tbrcsum) {
        this.tbrcsum = tbrcsum;
        return this;
    }

    @JsonProperty("tbrcbrq")
    public List<Tbrcbrq> getTbrcbrq() {
        return tbrcbrq;
    }

    @JsonProperty("tbrcbrq")
    public void setTbrcbrq(List<Tbrcbrq> tbrcbrq) {
        this.tbrcbrq = tbrcbrq;
    }

    public AccountDetailReviews100GetResponse withTbrcbrq(List<Tbrcbrq> tbrcbrq) {
        this.tbrcbrq = tbrcbrq;
        return this;
    }

    @JsonProperty("tbraccd_ctrl")
    public List<TbraccdCtrl> getTbraccdCtrl() {
        return tbraccdCtrl;
    }

    @JsonProperty("tbraccd_ctrl")
    public void setTbraccdCtrl(List<TbraccdCtrl> tbraccdCtrl) {
        this.tbraccdCtrl = tbraccdCtrl;
    }

    public AccountDetailReviews100GetResponse withTbraccdCtrl(List<TbraccdCtrl> tbraccdCtrl) {
        this.tbraccdCtrl = tbraccdCtrl;
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

    public AccountDetailReviews100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetailReviews100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbrcrcp");
        sb.append('=');
        sb.append(((this.tbrcrcp == null)?"<null>":this.tbrcrcp));
        sb.append(',');
        sb.append("tbraccd");
        sb.append('=');
        sb.append(((this.tbraccd == null)?"<null>":this.tbraccd));
        sb.append(',');
        sb.append("tbrcsum");
        sb.append('=');
        sb.append(((this.tbrcsum == null)?"<null>":this.tbrcsum));
        sb.append(',');
        sb.append("tbrcbrq");
        sb.append('=');
        sb.append(((this.tbrcbrq == null)?"<null>":this.tbrcbrq));
        sb.append(',');
        sb.append("tbraccdCtrl");
        sb.append('=');
        sb.append(((this.tbraccdCtrl == null)?"<null>":this.tbraccdCtrl));
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
        result = ((result* 31)+((this.tbrcbrq == null)? 0 :this.tbrcbrq.hashCode()));
        result = ((result* 31)+((this.tbraccdCtrl == null)? 0 :this.tbraccdCtrl.hashCode()));
        result = ((result* 31)+((this.tbrcrcp == null)? 0 :this.tbrcrcp.hashCode()));
        result = ((result* 31)+((this.tbraccd == null)? 0 :this.tbraccd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbrcsum == null)? 0 :this.tbrcsum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetailReviews100GetResponse) == false) {
            return false;
        }
        AccountDetailReviews100GetResponse rhs = ((AccountDetailReviews100GetResponse) other);
        return (((((((this.tbrcbrq == rhs.tbrcbrq)||((this.tbrcbrq!= null)&&this.tbrcbrq.equals(rhs.tbrcbrq)))&&((this.tbraccdCtrl == rhs.tbraccdCtrl)||((this.tbraccdCtrl!= null)&&this.tbraccdCtrl.equals(rhs.tbraccdCtrl))))&&((this.tbrcrcp == rhs.tbrcrcp)||((this.tbrcrcp!= null)&&this.tbrcrcp.equals(rhs.tbrcrcp))))&&((this.tbraccd == rhs.tbraccd)||((this.tbraccd!= null)&&this.tbraccd.equals(rhs.tbraccd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbrcsum == rhs.tbrcsum)||((this.tbrcsum!= null)&&this.tbrcsum.equals(rhs.tbrcsum))));
    }

}
