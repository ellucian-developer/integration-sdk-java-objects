
package com.ellucian.generated.bpapi.ban.population_selection_inquiry.v1_0_0;

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
    "glbextrUserId",
    "glbextrCount"
})
@Generated("jsonschema2pojo")
public class Glvslct {

    /**
     * User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("glbextrUserId")
    private String glbextrUserId;
    /**
     * Count
     * <p>
     * 
     * 
     */
    @JsonProperty("glbextrCount")
    private Double glbextrCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("glbextrUserId")
    public String getGlbextrUserId() {
        return glbextrUserId;
    }

    /**
     * User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("glbextrUserId")
    public void setGlbextrUserId(String glbextrUserId) {
        this.glbextrUserId = glbextrUserId;
    }

    public Glvslct withGlbextrUserId(String glbextrUserId) {
        this.glbextrUserId = glbextrUserId;
        return this;
    }

    /**
     * Count
     * <p>
     * 
     * 
     */
    @JsonProperty("glbextrCount")
    public Double getGlbextrCount() {
        return glbextrCount;
    }

    /**
     * Count
     * <p>
     * 
     * 
     */
    @JsonProperty("glbextrCount")
    public void setGlbextrCount(Double glbextrCount) {
        this.glbextrCount = glbextrCount;
    }

    public Glvslct withGlbextrCount(Double glbextrCount) {
        this.glbextrCount = glbextrCount;
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

    public Glvslct withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Glvslct.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("glbextrUserId");
        sb.append('=');
        sb.append(((this.glbextrUserId == null)?"<null>":this.glbextrUserId));
        sb.append(',');
        sb.append("glbextrCount");
        sb.append('=');
        sb.append(((this.glbextrCount == null)?"<null>":this.glbextrCount));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.glbextrUserId == null)? 0 :this.glbextrUserId.hashCode()));
        result = ((result* 31)+((this.glbextrCount == null)? 0 :this.glbextrCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Glvslct) == false) {
            return false;
        }
        Glvslct rhs = ((Glvslct) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.glbextrUserId == rhs.glbextrUserId)||((this.glbextrUserId!= null)&&this.glbextrUserId.equals(rhs.glbextrUserId))))&&((this.glbextrCount == rhs.glbextrCount)||((this.glbextrCount!= null)&&this.glbextrCount.equals(rhs.glbextrCount))));
    }

}
