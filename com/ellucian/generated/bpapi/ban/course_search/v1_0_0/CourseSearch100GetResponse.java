
package com.ellucian.generated.bpapi.ban.course_search.v1_0_0;

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
    "scacrse_key_block",
    "scbcrse"
})
@Generated("jsonschema2pojo")
public class CourseSearch100GetResponse {

    @JsonProperty("scacrse_key_block")
    private List<ScacrseKeyBlock> scacrseKeyBlock = new ArrayList<ScacrseKeyBlock>();
    @JsonProperty("scbcrse")
    private List<Scbcrse> scbcrse = new ArrayList<Scbcrse>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scacrse_key_block")
    public List<ScacrseKeyBlock> getScacrseKeyBlock() {
        return scacrseKeyBlock;
    }

    @JsonProperty("scacrse_key_block")
    public void setScacrseKeyBlock(List<ScacrseKeyBlock> scacrseKeyBlock) {
        this.scacrseKeyBlock = scacrseKeyBlock;
    }

    public CourseSearch100GetResponse withScacrseKeyBlock(List<ScacrseKeyBlock> scacrseKeyBlock) {
        this.scacrseKeyBlock = scacrseKeyBlock;
        return this;
    }

    @JsonProperty("scbcrse")
    public List<Scbcrse> getScbcrse() {
        return scbcrse;
    }

    @JsonProperty("scbcrse")
    public void setScbcrse(List<Scbcrse> scbcrse) {
        this.scbcrse = scbcrse;
    }

    public CourseSearch100GetResponse withScbcrse(List<Scbcrse> scbcrse) {
        this.scbcrse = scbcrse;
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

    public CourseSearch100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseSearch100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseKeyBlock");
        sb.append('=');
        sb.append(((this.scacrseKeyBlock == null)?"<null>":this.scacrseKeyBlock));
        sb.append(',');
        sb.append("scbcrse");
        sb.append('=');
        sb.append(((this.scbcrse == null)?"<null>":this.scbcrse));
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
        result = ((result* 31)+((this.scacrseKeyBlock == null)? 0 :this.scacrseKeyBlock.hashCode()));
        result = ((result* 31)+((this.scbcrse == null)? 0 :this.scbcrse.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseSearch100GetResponse) == false) {
            return false;
        }
        CourseSearch100GetResponse rhs = ((CourseSearch100GetResponse) other);
        return ((((this.scacrseKeyBlock == rhs.scacrseKeyBlock)||((this.scacrseKeyBlock!= null)&&this.scacrseKeyBlock.equals(rhs.scacrseKeyBlock)))&&((this.scbcrse == rhs.scbcrse)||((this.scbcrse!= null)&&this.scbcrse.equals(rhs.scbcrse))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
