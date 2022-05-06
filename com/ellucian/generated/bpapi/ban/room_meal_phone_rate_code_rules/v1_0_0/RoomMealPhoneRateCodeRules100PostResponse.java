
package com.ellucian.generated.bpapi.ban.room_meal_phone_rate_code_rules.v1_0_0;

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
    "slarrcd",
    "slaprcd"
})
@Generated("jsonschema2pojo")
public class RoomMealPhoneRateCodeRules100PostResponse {

    @JsonProperty("slarrcd")
    private List<Slarrcd> slarrcd = new ArrayList<Slarrcd>();
    @JsonProperty("slaprcd")
    private List<Slaprcd> slaprcd = new ArrayList<Slaprcd>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("slarrcd")
    public List<Slarrcd> getSlarrcd() {
        return slarrcd;
    }

    @JsonProperty("slarrcd")
    public void setSlarrcd(List<Slarrcd> slarrcd) {
        this.slarrcd = slarrcd;
    }

    public RoomMealPhoneRateCodeRules100PostResponse withSlarrcd(List<Slarrcd> slarrcd) {
        this.slarrcd = slarrcd;
        return this;
    }

    @JsonProperty("slaprcd")
    public List<Slaprcd> getSlaprcd() {
        return slaprcd;
    }

    @JsonProperty("slaprcd")
    public void setSlaprcd(List<Slaprcd> slaprcd) {
        this.slaprcd = slaprcd;
    }

    public RoomMealPhoneRateCodeRules100PostResponse withSlaprcd(List<Slaprcd> slaprcd) {
        this.slaprcd = slaprcd;
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

    public RoomMealPhoneRateCodeRules100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomMealPhoneRateCodeRules100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("slarrcd");
        sb.append('=');
        sb.append(((this.slarrcd == null)?"<null>":this.slarrcd));
        sb.append(',');
        sb.append("slaprcd");
        sb.append('=');
        sb.append(((this.slaprcd == null)?"<null>":this.slaprcd));
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
        result = ((result* 31)+((this.slaprcd == null)? 0 :this.slaprcd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.slarrcd == null)? 0 :this.slarrcd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomMealPhoneRateCodeRules100PostResponse) == false) {
            return false;
        }
        RoomMealPhoneRateCodeRules100PostResponse rhs = ((RoomMealPhoneRateCodeRules100PostResponse) other);
        return ((((this.slaprcd == rhs.slaprcd)||((this.slaprcd!= null)&&this.slaprcd.equals(rhs.slaprcd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.slarrcd == rhs.slarrcd)||((this.slarrcd!= null)&&this.slarrcd.equals(rhs.slarrcd))));
    }

}
