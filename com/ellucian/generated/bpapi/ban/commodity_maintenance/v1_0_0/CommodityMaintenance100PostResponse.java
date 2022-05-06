
package com.ellucian.generated.bpapi.ban.commodity_maintenance.v1_0_0;

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
    "ftvcomm",
    "ftrcomm"
})
@Generated("jsonschema2pojo")
public class CommodityMaintenance100PostResponse {

    @JsonProperty("ftvcomm")
    private List<Ftvcomm> ftvcomm = new ArrayList<Ftvcomm>();
    @JsonProperty("ftrcomm")
    private List<Ftrcomm> ftrcomm = new ArrayList<Ftrcomm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ftvcomm")
    public List<Ftvcomm> getFtvcomm() {
        return ftvcomm;
    }

    @JsonProperty("ftvcomm")
    public void setFtvcomm(List<Ftvcomm> ftvcomm) {
        this.ftvcomm = ftvcomm;
    }

    public CommodityMaintenance100PostResponse withFtvcomm(List<Ftvcomm> ftvcomm) {
        this.ftvcomm = ftvcomm;
        return this;
    }

    @JsonProperty("ftrcomm")
    public List<Ftrcomm> getFtrcomm() {
        return ftrcomm;
    }

    @JsonProperty("ftrcomm")
    public void setFtrcomm(List<Ftrcomm> ftrcomm) {
        this.ftrcomm = ftrcomm;
    }

    public CommodityMaintenance100PostResponse withFtrcomm(List<Ftrcomm> ftrcomm) {
        this.ftrcomm = ftrcomm;
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

    public CommodityMaintenance100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommodityMaintenance100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvcomm");
        sb.append('=');
        sb.append(((this.ftvcomm == null)?"<null>":this.ftvcomm));
        sb.append(',');
        sb.append("ftrcomm");
        sb.append('=');
        sb.append(((this.ftrcomm == null)?"<null>":this.ftrcomm));
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
        result = ((result* 31)+((this.ftrcomm == null)? 0 :this.ftrcomm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftvcomm == null)? 0 :this.ftvcomm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommodityMaintenance100PostResponse) == false) {
            return false;
        }
        CommodityMaintenance100PostResponse rhs = ((CommodityMaintenance100PostResponse) other);
        return ((((this.ftrcomm == rhs.ftrcomm)||((this.ftrcomm!= null)&&this.ftrcomm.equals(rhs.ftrcomm)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftvcomm == rhs.ftvcomm)||((this.ftvcomm!= null)&&this.ftvcomm.equals(rhs.ftvcomm))));
    }

}
