
package com.ellucian.generated.bpapi.ban.student_account_detail_deposits.v1_0_0;

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
    "tbrdepo",
    "receipt_ctrl2"
})
@Generated("jsonschema2pojo")
public class StudentAccountDetailDeposits100PutResponse {

    @JsonProperty("tbrdepo")
    private List<Tbrdepo> tbrdepo = new ArrayList<Tbrdepo>();
    @JsonProperty("receipt_ctrl2")
    private List<ReceiptCtrl2> receiptCtrl2 = new ArrayList<ReceiptCtrl2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbrdepo")
    public List<Tbrdepo> getTbrdepo() {
        return tbrdepo;
    }

    @JsonProperty("tbrdepo")
    public void setTbrdepo(List<Tbrdepo> tbrdepo) {
        this.tbrdepo = tbrdepo;
    }

    public StudentAccountDetailDeposits100PutResponse withTbrdepo(List<Tbrdepo> tbrdepo) {
        this.tbrdepo = tbrdepo;
        return this;
    }

    @JsonProperty("receipt_ctrl2")
    public List<ReceiptCtrl2> getReceiptCtrl2() {
        return receiptCtrl2;
    }

    @JsonProperty("receipt_ctrl2")
    public void setReceiptCtrl2(List<ReceiptCtrl2> receiptCtrl2) {
        this.receiptCtrl2 = receiptCtrl2;
    }

    public StudentAccountDetailDeposits100PutResponse withReceiptCtrl2(List<ReceiptCtrl2> receiptCtrl2) {
        this.receiptCtrl2 = receiptCtrl2;
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

    public StudentAccountDetailDeposits100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAccountDetailDeposits100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbrdepo");
        sb.append('=');
        sb.append(((this.tbrdepo == null)?"<null>":this.tbrdepo));
        sb.append(',');
        sb.append("receiptCtrl2");
        sb.append('=');
        sb.append(((this.receiptCtrl2 == null)?"<null>":this.receiptCtrl2));
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
        result = ((result* 31)+((this.receiptCtrl2 == null)? 0 :this.receiptCtrl2 .hashCode()));
        result = ((result* 31)+((this.tbrdepo == null)? 0 :this.tbrdepo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAccountDetailDeposits100PutResponse) == false) {
            return false;
        }
        StudentAccountDetailDeposits100PutResponse rhs = ((StudentAccountDetailDeposits100PutResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.receiptCtrl2 == rhs.receiptCtrl2)||((this.receiptCtrl2 != null)&&this.receiptCtrl2 .equals(rhs.receiptCtrl2))))&&((this.tbrdepo == rhs.tbrdepo)||((this.tbrdepo!= null)&&this.tbrdepo.equals(rhs.tbrdepo))));
    }

}
