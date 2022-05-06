
package com.ellucian.generated.bpapi.ban.installment_payment_plan_amount.v1_0_0;

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
    "tbvinss",
    "tbvinsp"
})
@Generated("jsonschema2pojo")
public class InstallmentPaymentPlanAmount100GetResponse {

    @JsonProperty("tbvinss")
    private List<Tbvins> tbvinss = new ArrayList<Tbvins>();
    @JsonProperty("tbvinsp")
    private List<Tbvinsp> tbvinsp = new ArrayList<Tbvinsp>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbvinss")
    public List<Tbvins> getTbvinss() {
        return tbvinss;
    }

    @JsonProperty("tbvinss")
    public void setTbvinss(List<Tbvins> tbvinss) {
        this.tbvinss = tbvinss;
    }

    public InstallmentPaymentPlanAmount100GetResponse withTbvinss(List<Tbvins> tbvinss) {
        this.tbvinss = tbvinss;
        return this;
    }

    @JsonProperty("tbvinsp")
    public List<Tbvinsp> getTbvinsp() {
        return tbvinsp;
    }

    @JsonProperty("tbvinsp")
    public void setTbvinsp(List<Tbvinsp> tbvinsp) {
        this.tbvinsp = tbvinsp;
    }

    public InstallmentPaymentPlanAmount100GetResponse withTbvinsp(List<Tbvinsp> tbvinsp) {
        this.tbvinsp = tbvinsp;
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

    public InstallmentPaymentPlanAmount100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstallmentPaymentPlanAmount100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbvinss");
        sb.append('=');
        sb.append(((this.tbvinss == null)?"<null>":this.tbvinss));
        sb.append(',');
        sb.append("tbvinsp");
        sb.append('=');
        sb.append(((this.tbvinsp == null)?"<null>":this.tbvinsp));
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
        result = ((result* 31)+((this.tbvinss == null)? 0 :this.tbvinss.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbvinsp == null)? 0 :this.tbvinsp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstallmentPaymentPlanAmount100GetResponse) == false) {
            return false;
        }
        InstallmentPaymentPlanAmount100GetResponse rhs = ((InstallmentPaymentPlanAmount100GetResponse) other);
        return ((((this.tbvinss == rhs.tbvinss)||((this.tbvinss!= null)&&this.tbvinss.equals(rhs.tbvinss)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbvinsp == rhs.tbvinsp)||((this.tbvinsp!= null)&&this.tbvinsp.equals(rhs.tbvinsp))));
    }

}
