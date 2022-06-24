
package com.ellucian.generated.bpapi.ban.group_usage_by_area_inquiry.v0_1_0;

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
    "smrguse2",
    "smrguse1"
})
@Generated("jsonschema2pojo")
public class GroupUsageByAreaInquiry010GetResponse {

    @JsonProperty("smrguse2")
    private List<Smrguse2> smrguse2 = new ArrayList<Smrguse2>();
    @JsonProperty("smrguse1")
    private List<Smrguse1> smrguse1 = new ArrayList<Smrguse1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("smrguse2")
    public List<Smrguse2> getSmrguse2() {
        return smrguse2;
    }

    @JsonProperty("smrguse2")
    public void setSmrguse2(List<Smrguse2> smrguse2) {
        this.smrguse2 = smrguse2;
    }

    public GroupUsageByAreaInquiry010GetResponse withSmrguse2(List<Smrguse2> smrguse2) {
        this.smrguse2 = smrguse2;
        return this;
    }

    @JsonProperty("smrguse1")
    public List<Smrguse1> getSmrguse1() {
        return smrguse1;
    }

    @JsonProperty("smrguse1")
    public void setSmrguse1(List<Smrguse1> smrguse1) {
        this.smrguse1 = smrguse1;
    }

    public GroupUsageByAreaInquiry010GetResponse withSmrguse1(List<Smrguse1> smrguse1) {
        this.smrguse1 = smrguse1;
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

    public GroupUsageByAreaInquiry010GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GroupUsageByAreaInquiry010GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("smrguse2");
        sb.append('=');
        sb.append(((this.smrguse2 == null)?"<null>":this.smrguse2));
        sb.append(',');
        sb.append("smrguse1");
        sb.append('=');
        sb.append(((this.smrguse1 == null)?"<null>":this.smrguse1));
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
        result = ((result* 31)+((this.smrguse1 == null)? 0 :this.smrguse1 .hashCode()));
        result = ((result* 31)+((this.smrguse2 == null)? 0 :this.smrguse2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupUsageByAreaInquiry010GetResponse) == false) {
            return false;
        }
        GroupUsageByAreaInquiry010GetResponse rhs = ((GroupUsageByAreaInquiry010GetResponse) other);
        return ((((this.smrguse1 == rhs.smrguse1)||((this.smrguse1 != null)&&this.smrguse1 .equals(rhs.smrguse1)))&&((this.smrguse2 == rhs.smrguse2)||((this.smrguse2 != null)&&this.smrguse2 .equals(rhs.smrguse2))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
