
package com.ellucian.generated.bpapi.ban.curricula_summary_honors.v1_0_0;

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
    "shrdgih",
    "shrdgdh",
    "shrdgcm"
})
@Generated("jsonschema2pojo")
public class CurriculaSummaryHonors100GetResponse {

    @JsonProperty("shrdgih")
    private List<Shrdgih> shrdgih = new ArrayList<Shrdgih>();
    @JsonProperty("shrdgdh")
    private List<Shrdgdh> shrdgdh = new ArrayList<Shrdgdh>();
    @JsonProperty("shrdgcm")
    private List<Shrdgcm> shrdgcm = new ArrayList<Shrdgcm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrdgih")
    public List<Shrdgih> getShrdgih() {
        return shrdgih;
    }

    @JsonProperty("shrdgih")
    public void setShrdgih(List<Shrdgih> shrdgih) {
        this.shrdgih = shrdgih;
    }

    public CurriculaSummaryHonors100GetResponse withShrdgih(List<Shrdgih> shrdgih) {
        this.shrdgih = shrdgih;
        return this;
    }

    @JsonProperty("shrdgdh")
    public List<Shrdgdh> getShrdgdh() {
        return shrdgdh;
    }

    @JsonProperty("shrdgdh")
    public void setShrdgdh(List<Shrdgdh> shrdgdh) {
        this.shrdgdh = shrdgdh;
    }

    public CurriculaSummaryHonors100GetResponse withShrdgdh(List<Shrdgdh> shrdgdh) {
        this.shrdgdh = shrdgdh;
        return this;
    }

    @JsonProperty("shrdgcm")
    public List<Shrdgcm> getShrdgcm() {
        return shrdgcm;
    }

    @JsonProperty("shrdgcm")
    public void setShrdgcm(List<Shrdgcm> shrdgcm) {
        this.shrdgcm = shrdgcm;
    }

    public CurriculaSummaryHonors100GetResponse withShrdgcm(List<Shrdgcm> shrdgcm) {
        this.shrdgcm = shrdgcm;
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

    public CurriculaSummaryHonors100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculaSummaryHonors100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrdgih");
        sb.append('=');
        sb.append(((this.shrdgih == null)?"<null>":this.shrdgih));
        sb.append(',');
        sb.append("shrdgdh");
        sb.append('=');
        sb.append(((this.shrdgdh == null)?"<null>":this.shrdgdh));
        sb.append(',');
        sb.append("shrdgcm");
        sb.append('=');
        sb.append(((this.shrdgcm == null)?"<null>":this.shrdgcm));
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
        result = ((result* 31)+((this.shrdgcm == null)? 0 :this.shrdgcm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrdgih == null)? 0 :this.shrdgih.hashCode()));
        result = ((result* 31)+((this.shrdgdh == null)? 0 :this.shrdgdh.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculaSummaryHonors100GetResponse) == false) {
            return false;
        }
        CurriculaSummaryHonors100GetResponse rhs = ((CurriculaSummaryHonors100GetResponse) other);
        return (((((this.shrdgcm == rhs.shrdgcm)||((this.shrdgcm!= null)&&this.shrdgcm.equals(rhs.shrdgcm)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrdgih == rhs.shrdgih)||((this.shrdgih!= null)&&this.shrdgih.equals(rhs.shrdgih))))&&((this.shrdgdh == rhs.shrdgdh)||((this.shrdgdh!= null)&&this.shrdgdh.equals(rhs.shrdgdh))));
    }

}
