
package com.ellucian.generated.bpapi.ban.defer_pay_period_rule.v1_0_0;

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
    "ptrdfpr",
    "ptrdfpn"
})
@Generated("jsonschema2pojo")
public class DeferPayPeriodRule100GetResponse {

    @JsonProperty("ptrdfpr")
    private List<Ptrdfpr> ptrdfpr = new ArrayList<Ptrdfpr>();
    @JsonProperty("ptrdfpn")
    private List<Ptrdfpn> ptrdfpn = new ArrayList<Ptrdfpn>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ptrdfpr")
    public List<Ptrdfpr> getPtrdfpr() {
        return ptrdfpr;
    }

    @JsonProperty("ptrdfpr")
    public void setPtrdfpr(List<Ptrdfpr> ptrdfpr) {
        this.ptrdfpr = ptrdfpr;
    }

    public DeferPayPeriodRule100GetResponse withPtrdfpr(List<Ptrdfpr> ptrdfpr) {
        this.ptrdfpr = ptrdfpr;
        return this;
    }

    @JsonProperty("ptrdfpn")
    public List<Ptrdfpn> getPtrdfpn() {
        return ptrdfpn;
    }

    @JsonProperty("ptrdfpn")
    public void setPtrdfpn(List<Ptrdfpn> ptrdfpn) {
        this.ptrdfpn = ptrdfpn;
    }

    public DeferPayPeriodRule100GetResponse withPtrdfpn(List<Ptrdfpn> ptrdfpn) {
        this.ptrdfpn = ptrdfpn;
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

    public DeferPayPeriodRule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeferPayPeriodRule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ptrdfpr");
        sb.append('=');
        sb.append(((this.ptrdfpr == null)?"<null>":this.ptrdfpr));
        sb.append(',');
        sb.append("ptrdfpn");
        sb.append('=');
        sb.append(((this.ptrdfpn == null)?"<null>":this.ptrdfpn));
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
        result = ((result* 31)+((this.ptrdfpr == null)? 0 :this.ptrdfpr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ptrdfpn == null)? 0 :this.ptrdfpn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeferPayPeriodRule100GetResponse) == false) {
            return false;
        }
        DeferPayPeriodRule100GetResponse rhs = ((DeferPayPeriodRule100GetResponse) other);
        return ((((this.ptrdfpr == rhs.ptrdfpr)||((this.ptrdfpr!= null)&&this.ptrdfpr.equals(rhs.ptrdfpr)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ptrdfpn == rhs.ptrdfpn)||((this.ptrdfpn!= null)&&this.ptrdfpn.equals(rhs.ptrdfpn))));
    }

}
