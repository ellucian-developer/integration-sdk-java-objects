
package com.ellucian.generated.bpapi.ban.student_account_detail_charges_payments.v1_0_0;

import java.util.HashMap;
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
    "tbrcrcpDummy"
})
@Generated("jsonschema2pojo")
public class Tbrcrcp1 {

    @JsonProperty("tbrcrcpDummy")
    private String tbrcrcpDummy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbrcrcpDummy")
    public String getTbrcrcpDummy() {
        return tbrcrcpDummy;
    }

    @JsonProperty("tbrcrcpDummy")
    public void setTbrcrcpDummy(String tbrcrcpDummy) {
        this.tbrcrcpDummy = tbrcrcpDummy;
    }

    public Tbrcrcp1 withTbrcrcpDummy(String tbrcrcpDummy) {
        this.tbrcrcpDummy = tbrcrcpDummy;
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

    public Tbrcrcp1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbrcrcp1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbrcrcpDummy");
        sb.append('=');
        sb.append(((this.tbrcrcpDummy == null)?"<null>":this.tbrcrcpDummy));
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
        result = ((result* 31)+((this.tbrcrcpDummy == null)? 0 :this.tbrcrcpDummy.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbrcrcp1) == false) {
            return false;
        }
        Tbrcrcp1 rhs = ((Tbrcrcp1) other);
        return (((this.tbrcrcpDummy == rhs.tbrcrcpDummy)||((this.tbrcrcpDummy!= null)&&this.tbrcrcpDummy.equals(rhs.tbrcrcpDummy)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
