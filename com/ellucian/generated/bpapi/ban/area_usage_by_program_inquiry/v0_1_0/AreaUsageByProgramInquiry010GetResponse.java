
package com.ellucian.generated.bpapi.ban.area_usage_by_program_inquiry.v0_1_0;

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
    "smrause2",
    "smrause1"
})
@Generated("jsonschema2pojo")
public class AreaUsageByProgramInquiry010GetResponse {

    @JsonProperty("smrause2")
    private List<Smrause2> smrause2 = new ArrayList<Smrause2>();
    @JsonProperty("smrause1")
    private List<Smrause1> smrause1 = new ArrayList<Smrause1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("smrause2")
    public List<Smrause2> getSmrause2() {
        return smrause2;
    }

    @JsonProperty("smrause2")
    public void setSmrause2(List<Smrause2> smrause2) {
        this.smrause2 = smrause2;
    }

    public AreaUsageByProgramInquiry010GetResponse withSmrause2(List<Smrause2> smrause2) {
        this.smrause2 = smrause2;
        return this;
    }

    @JsonProperty("smrause1")
    public List<Smrause1> getSmrause1() {
        return smrause1;
    }

    @JsonProperty("smrause1")
    public void setSmrause1(List<Smrause1> smrause1) {
        this.smrause1 = smrause1;
    }

    public AreaUsageByProgramInquiry010GetResponse withSmrause1(List<Smrause1> smrause1) {
        this.smrause1 = smrause1;
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

    public AreaUsageByProgramInquiry010GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AreaUsageByProgramInquiry010GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("smrause2");
        sb.append('=');
        sb.append(((this.smrause2 == null)?"<null>":this.smrause2));
        sb.append(',');
        sb.append("smrause1");
        sb.append('=');
        sb.append(((this.smrause1 == null)?"<null>":this.smrause1));
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
        result = ((result* 31)+((this.smrause2 == null)? 0 :this.smrause2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.smrause1 == null)? 0 :this.smrause1 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AreaUsageByProgramInquiry010GetResponse) == false) {
            return false;
        }
        AreaUsageByProgramInquiry010GetResponse rhs = ((AreaUsageByProgramInquiry010GetResponse) other);
        return ((((this.smrause2 == rhs.smrause2)||((this.smrause2 != null)&&this.smrause2 .equals(rhs.smrause2)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.smrause1 == rhs.smrause1)||((this.smrause1 != null)&&this.smrause1 .equals(rhs.smrause1))));
    }

}
