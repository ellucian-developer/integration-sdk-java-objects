
package com.ellucian.generated.bpapi.ban.direct_cash_receipt.v1_0_0;

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
    "fgbcshh",
    "fgbcshd"
})
@Generated("jsonschema2pojo")
public class DirectCashReceipt100PutResponse {

    @JsonProperty("fgbcshh")
    private List<Fgbcshh__1> fgbcshh = new ArrayList<Fgbcshh__1>();
    @JsonProperty("fgbcshd")
    private List<Fgbcshd__1> fgbcshd = new ArrayList<Fgbcshd__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fgbcshh")
    public List<Fgbcshh__1> getFgbcshh() {
        return fgbcshh;
    }

    @JsonProperty("fgbcshh")
    public void setFgbcshh(List<Fgbcshh__1> fgbcshh) {
        this.fgbcshh = fgbcshh;
    }

    public DirectCashReceipt100PutResponse withFgbcshh(List<Fgbcshh__1> fgbcshh) {
        this.fgbcshh = fgbcshh;
        return this;
    }

    @JsonProperty("fgbcshd")
    public List<Fgbcshd__1> getFgbcshd() {
        return fgbcshd;
    }

    @JsonProperty("fgbcshd")
    public void setFgbcshd(List<Fgbcshd__1> fgbcshd) {
        this.fgbcshd = fgbcshd;
    }

    public DirectCashReceipt100PutResponse withFgbcshd(List<Fgbcshd__1> fgbcshd) {
        this.fgbcshd = fgbcshd;
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

    public DirectCashReceipt100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DirectCashReceipt100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fgbcshh");
        sb.append('=');
        sb.append(((this.fgbcshh == null)?"<null>":this.fgbcshh));
        sb.append(',');
        sb.append("fgbcshd");
        sb.append('=');
        sb.append(((this.fgbcshd == null)?"<null>":this.fgbcshd));
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
        result = ((result* 31)+((this.fgbcshh == null)? 0 :this.fgbcshh.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fgbcshd == null)? 0 :this.fgbcshd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DirectCashReceipt100PutResponse) == false) {
            return false;
        }
        DirectCashReceipt100PutResponse rhs = ((DirectCashReceipt100PutResponse) other);
        return ((((this.fgbcshh == rhs.fgbcshh)||((this.fgbcshh!= null)&&this.fgbcshh.equals(rhs.fgbcshh)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fgbcshd == rhs.fgbcshd)||((this.fgbcshd!= null)&&this.fgbcshd.equals(rhs.fgbcshd))));
    }

}
