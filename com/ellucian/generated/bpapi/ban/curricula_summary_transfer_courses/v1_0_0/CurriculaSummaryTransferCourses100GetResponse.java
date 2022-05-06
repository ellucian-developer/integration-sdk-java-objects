
package com.ellucian.generated.bpapi.ban.curricula_summary_transfer_courses.v1_0_0;

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
    "shrtatt",
    "shrtrce"
})
@Generated("jsonschema2pojo")
public class CurriculaSummaryTransferCourses100GetResponse {

    @JsonProperty("shrtatt")
    private List<Shrtatt> shrtatt = new ArrayList<Shrtatt>();
    @JsonProperty("shrtrce")
    private List<Shrtrce> shrtrce = new ArrayList<Shrtrce>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrtatt")
    public List<Shrtatt> getShrtatt() {
        return shrtatt;
    }

    @JsonProperty("shrtatt")
    public void setShrtatt(List<Shrtatt> shrtatt) {
        this.shrtatt = shrtatt;
    }

    public CurriculaSummaryTransferCourses100GetResponse withShrtatt(List<Shrtatt> shrtatt) {
        this.shrtatt = shrtatt;
        return this;
    }

    @JsonProperty("shrtrce")
    public List<Shrtrce> getShrtrce() {
        return shrtrce;
    }

    @JsonProperty("shrtrce")
    public void setShrtrce(List<Shrtrce> shrtrce) {
        this.shrtrce = shrtrce;
    }

    public CurriculaSummaryTransferCourses100GetResponse withShrtrce(List<Shrtrce> shrtrce) {
        this.shrtrce = shrtrce;
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

    public CurriculaSummaryTransferCourses100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculaSummaryTransferCourses100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrtatt");
        sb.append('=');
        sb.append(((this.shrtatt == null)?"<null>":this.shrtatt));
        sb.append(',');
        sb.append("shrtrce");
        sb.append('=');
        sb.append(((this.shrtrce == null)?"<null>":this.shrtrce));
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
        result = ((result* 31)+((this.shrtatt == null)? 0 :this.shrtatt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrtrce == null)? 0 :this.shrtrce.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculaSummaryTransferCourses100GetResponse) == false) {
            return false;
        }
        CurriculaSummaryTransferCourses100GetResponse rhs = ((CurriculaSummaryTransferCourses100GetResponse) other);
        return ((((this.shrtatt == rhs.shrtatt)||((this.shrtatt!= null)&&this.shrtatt.equals(rhs.shrtatt)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrtrce == rhs.shrtrce)||((this.shrtrce!= null)&&this.shrtrce.equals(rhs.shrtrce))));
    }

}
