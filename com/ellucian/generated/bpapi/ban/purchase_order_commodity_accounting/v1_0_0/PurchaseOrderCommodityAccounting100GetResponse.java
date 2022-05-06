
package com.ellucian.generated.bpapi.ban.purchase_order_commodity_accounting.v1_0_0;

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
    "fprpodt",
    "fprpoda"
})
@Generated("jsonschema2pojo")
public class PurchaseOrderCommodityAccounting100GetResponse {

    @JsonProperty("fprpodt")
    private List<Fprpodt> fprpodt = new ArrayList<Fprpodt>();
    @JsonProperty("fprpoda")
    private List<Fprpoda> fprpoda = new ArrayList<Fprpoda>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fprpodt")
    public List<Fprpodt> getFprpodt() {
        return fprpodt;
    }

    @JsonProperty("fprpodt")
    public void setFprpodt(List<Fprpodt> fprpodt) {
        this.fprpodt = fprpodt;
    }

    public PurchaseOrderCommodityAccounting100GetResponse withFprpodt(List<Fprpodt> fprpodt) {
        this.fprpodt = fprpodt;
        return this;
    }

    @JsonProperty("fprpoda")
    public List<Fprpoda> getFprpoda() {
        return fprpoda;
    }

    @JsonProperty("fprpoda")
    public void setFprpoda(List<Fprpoda> fprpoda) {
        this.fprpoda = fprpoda;
    }

    public PurchaseOrderCommodityAccounting100GetResponse withFprpoda(List<Fprpoda> fprpoda) {
        this.fprpoda = fprpoda;
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

    public PurchaseOrderCommodityAccounting100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseOrderCommodityAccounting100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fprpodt");
        sb.append('=');
        sb.append(((this.fprpodt == null)?"<null>":this.fprpodt));
        sb.append(',');
        sb.append("fprpoda");
        sb.append('=');
        sb.append(((this.fprpoda == null)?"<null>":this.fprpoda));
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
        result = ((result* 31)+((this.fprpoda == null)? 0 :this.fprpoda.hashCode()));
        result = ((result* 31)+((this.fprpodt == null)? 0 :this.fprpodt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseOrderCommodityAccounting100GetResponse) == false) {
            return false;
        }
        PurchaseOrderCommodityAccounting100GetResponse rhs = ((PurchaseOrderCommodityAccounting100GetResponse) other);
        return ((((this.fprpoda == rhs.fprpoda)||((this.fprpoda!= null)&&this.fprpoda.equals(rhs.fprpoda)))&&((this.fprpodt == rhs.fprpodt)||((this.fprpodt!= null)&&this.fprpodt.equals(rhs.fprpodt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
