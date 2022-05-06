
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
    "receipt_ctrl",
    "tbraccd"
})
@Generated("jsonschema2pojo")
public class AccountDetailReviews100PutResponse {

    @JsonProperty("receipt_ctrl")
    private List<ReceiptCtrl> receiptCtrl = new ArrayList<ReceiptCtrl>();
    @JsonProperty("tbraccd")
    private List<Tbraccd__1> tbraccd = new ArrayList<Tbraccd__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("receipt_ctrl")
    public List<ReceiptCtrl> getReceiptCtrl() {
        return receiptCtrl;
    }

    @JsonProperty("receipt_ctrl")
    public void setReceiptCtrl(List<ReceiptCtrl> receiptCtrl) {
        this.receiptCtrl = receiptCtrl;
    }

    public AccountDetailReviews100PutResponse withReceiptCtrl(List<ReceiptCtrl> receiptCtrl) {
        this.receiptCtrl = receiptCtrl;
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

    public AccountDetailReviews100PutResponse withTbraccd(List<Tbraccd__1> tbraccd) {
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

    public AccountDetailReviews100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetailReviews100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("receiptCtrl");
        sb.append('=');
        sb.append(((this.receiptCtrl == null)?"<null>":this.receiptCtrl));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.receiptCtrl == null)? 0 :this.receiptCtrl.hashCode()));
        result = ((result* 31)+((this.tbraccd == null)? 0 :this.tbraccd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetailReviews100PutResponse) == false) {
            return false;
        }
        AccountDetailReviews100PutResponse rhs = ((AccountDetailReviews100PutResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.receiptCtrl == rhs.receiptCtrl)||((this.receiptCtrl!= null)&&this.receiptCtrl.equals(rhs.receiptCtrl))))&&((this.tbraccd == rhs.tbraccd)||((this.tbraccd!= null)&&this.tbraccd.equals(rhs.tbraccd))));
    }

}
