
package com.ellucian.generated.bpapi.ban.detail_encumbrance_activity.v1_0_0;

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
    "fgbench",
    "fgbtrnd",
    "fgbencd"
})
@Generated("jsonschema2pojo")
public class DetailEncumbranceActivity100GetResponse {

    @JsonProperty("fgbench")
    private List<Fgbench> fgbench = new ArrayList<Fgbench>();
    @JsonProperty("fgbtrnd")
    private List<Fgbtrnd> fgbtrnd = new ArrayList<Fgbtrnd>();
    @JsonProperty("fgbencd")
    private List<Fgbencd> fgbencd = new ArrayList<Fgbencd>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fgbench")
    public List<Fgbench> getFgbench() {
        return fgbench;
    }

    @JsonProperty("fgbench")
    public void setFgbench(List<Fgbench> fgbench) {
        this.fgbench = fgbench;
    }

    public DetailEncumbranceActivity100GetResponse withFgbench(List<Fgbench> fgbench) {
        this.fgbench = fgbench;
        return this;
    }

    @JsonProperty("fgbtrnd")
    public List<Fgbtrnd> getFgbtrnd() {
        return fgbtrnd;
    }

    @JsonProperty("fgbtrnd")
    public void setFgbtrnd(List<Fgbtrnd> fgbtrnd) {
        this.fgbtrnd = fgbtrnd;
    }

    public DetailEncumbranceActivity100GetResponse withFgbtrnd(List<Fgbtrnd> fgbtrnd) {
        this.fgbtrnd = fgbtrnd;
        return this;
    }

    @JsonProperty("fgbencd")
    public List<Fgbencd> getFgbencd() {
        return fgbencd;
    }

    @JsonProperty("fgbencd")
    public void setFgbencd(List<Fgbencd> fgbencd) {
        this.fgbencd = fgbencd;
    }

    public DetailEncumbranceActivity100GetResponse withFgbencd(List<Fgbencd> fgbencd) {
        this.fgbencd = fgbencd;
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

    public DetailEncumbranceActivity100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetailEncumbranceActivity100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fgbench");
        sb.append('=');
        sb.append(((this.fgbench == null)?"<null>":this.fgbench));
        sb.append(',');
        sb.append("fgbtrnd");
        sb.append('=');
        sb.append(((this.fgbtrnd == null)?"<null>":this.fgbtrnd));
        sb.append(',');
        sb.append("fgbencd");
        sb.append('=');
        sb.append(((this.fgbencd == null)?"<null>":this.fgbencd));
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
        result = ((result* 31)+((this.fgbencd == null)? 0 :this.fgbencd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fgbench == null)? 0 :this.fgbench.hashCode()));
        result = ((result* 31)+((this.fgbtrnd == null)? 0 :this.fgbtrnd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetailEncumbranceActivity100GetResponse) == false) {
            return false;
        }
        DetailEncumbranceActivity100GetResponse rhs = ((DetailEncumbranceActivity100GetResponse) other);
        return (((((this.fgbencd == rhs.fgbencd)||((this.fgbencd!= null)&&this.fgbencd.equals(rhs.fgbencd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fgbench == rhs.fgbench)||((this.fgbench!= null)&&this.fgbench.equals(rhs.fgbench))))&&((this.fgbtrnd == rhs.fgbtrnd)||((this.fgbtrnd!= null)&&this.fgbtrnd.equals(rhs.fgbtrnd))));
    }

}
