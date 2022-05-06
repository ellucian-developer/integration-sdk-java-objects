
package com.ellucian.generated.bpapi.ban.fiscal_year_maintenance.v1_0_0;

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
    "ftvfsyr",
    "ftvfspd"
})
@Generated("jsonschema2pojo")
public class FiscalYearMaintenance100PutResponse {

    @JsonProperty("ftvfsyr")
    private List<Ftvfsyr__2> ftvfsyr = new ArrayList<Ftvfsyr__2>();
    @JsonProperty("ftvfspd")
    private List<Ftvfspd__2> ftvfspd = new ArrayList<Ftvfspd__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ftvfsyr")
    public List<Ftvfsyr__2> getFtvfsyr() {
        return ftvfsyr;
    }

    @JsonProperty("ftvfsyr")
    public void setFtvfsyr(List<Ftvfsyr__2> ftvfsyr) {
        this.ftvfsyr = ftvfsyr;
    }

    public FiscalYearMaintenance100PutResponse withFtvfsyr(List<Ftvfsyr__2> ftvfsyr) {
        this.ftvfsyr = ftvfsyr;
        return this;
    }

    @JsonProperty("ftvfspd")
    public List<Ftvfspd__2> getFtvfspd() {
        return ftvfspd;
    }

    @JsonProperty("ftvfspd")
    public void setFtvfspd(List<Ftvfspd__2> ftvfspd) {
        this.ftvfspd = ftvfspd;
    }

    public FiscalYearMaintenance100PutResponse withFtvfspd(List<Ftvfspd__2> ftvfspd) {
        this.ftvfspd = ftvfspd;
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

    public FiscalYearMaintenance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FiscalYearMaintenance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvfsyr");
        sb.append('=');
        sb.append(((this.ftvfsyr == null)?"<null>":this.ftvfsyr));
        sb.append(',');
        sb.append("ftvfspd");
        sb.append('=');
        sb.append(((this.ftvfspd == null)?"<null>":this.ftvfspd));
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
        result = ((result* 31)+((this.ftvfsyr == null)? 0 :this.ftvfsyr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftvfspd == null)? 0 :this.ftvfspd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FiscalYearMaintenance100PutResponse) == false) {
            return false;
        }
        FiscalYearMaintenance100PutResponse rhs = ((FiscalYearMaintenance100PutResponse) other);
        return ((((this.ftvfsyr == rhs.ftvfsyr)||((this.ftvfsyr!= null)&&this.ftvfsyr.equals(rhs.ftvfsyr)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftvfspd == rhs.ftvfspd)||((this.ftvfspd!= null)&&this.ftvfspd.equals(rhs.ftvfspd))));
    }

}
