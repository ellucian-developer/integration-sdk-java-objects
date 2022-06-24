
package com.ellucian.generated.bpapi.ban.receipt_queries.v1_0_0;

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
    "tbvrcp1",
    "tbvrcp2"
})
@Generated("jsonschema2pojo")
public class ReceiptQueries100GetResponse {

    @JsonProperty("tbvrcp1")
    private List<Tbvrcp1> tbvrcp1 = new ArrayList<Tbvrcp1>();
    @JsonProperty("tbvrcp2")
    private List<Tbvrcp2> tbvrcp2 = new ArrayList<Tbvrcp2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbvrcp1")
    public List<Tbvrcp1> getTbvrcp1() {
        return tbvrcp1;
    }

    @JsonProperty("tbvrcp1")
    public void setTbvrcp1(List<Tbvrcp1> tbvrcp1) {
        this.tbvrcp1 = tbvrcp1;
    }

    public ReceiptQueries100GetResponse withTbvrcp1(List<Tbvrcp1> tbvrcp1) {
        this.tbvrcp1 = tbvrcp1;
        return this;
    }

    @JsonProperty("tbvrcp2")
    public List<Tbvrcp2> getTbvrcp2() {
        return tbvrcp2;
    }

    @JsonProperty("tbvrcp2")
    public void setTbvrcp2(List<Tbvrcp2> tbvrcp2) {
        this.tbvrcp2 = tbvrcp2;
    }

    public ReceiptQueries100GetResponse withTbvrcp2(List<Tbvrcp2> tbvrcp2) {
        this.tbvrcp2 = tbvrcp2;
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

    public ReceiptQueries100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReceiptQueries100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbvrcp1");
        sb.append('=');
        sb.append(((this.tbvrcp1 == null)?"<null>":this.tbvrcp1));
        sb.append(',');
        sb.append("tbvrcp2");
        sb.append('=');
        sb.append(((this.tbvrcp2 == null)?"<null>":this.tbvrcp2));
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
        result = ((result* 31)+((this.tbvrcp2 == null)? 0 :this.tbvrcp2 .hashCode()));
        result = ((result* 31)+((this.tbvrcp1 == null)? 0 :this.tbvrcp1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptQueries100GetResponse) == false) {
            return false;
        }
        ReceiptQueries100GetResponse rhs = ((ReceiptQueries100GetResponse) other);
        return ((((this.tbvrcp2 == rhs.tbvrcp2)||((this.tbvrcp2 != null)&&this.tbvrcp2 .equals(rhs.tbvrcp2)))&&((this.tbvrcp1 == rhs.tbvrcp1)||((this.tbvrcp1 != null)&&this.tbvrcp1 .equals(rhs.tbvrcp1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
