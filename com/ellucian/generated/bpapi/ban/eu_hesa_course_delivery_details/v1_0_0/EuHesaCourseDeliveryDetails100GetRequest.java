
package com.ellucian.generated.bpapi.ban.eu_hesa_course_delivery_details.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "keyblockCourseId",
    "copyCourseId"
})
@Generated("jsonschema2pojo")
public class EuHesaCourseDeliveryDetails100GetRequest {

    /**
     * Lineage reference object : keyblockCourseId, Lookup lineage reference object : sorpcde
     * 
     */
    @JsonProperty("keyblockCourseId")
    @JsonPropertyDescription("Lineage reference object : keyblockCourseId, Lookup lineage reference object : sorpcde")
    private Object keyblockCourseId;
    /**
     * Lineage reference object : copyCourseId, Lookup lineage reference object : sorpcde
     * 
     */
    @JsonProperty("copyCourseId")
    @JsonPropertyDescription("Lineage reference object : copyCourseId, Lookup lineage reference object : sorpcde")
    private Object copyCourseId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : keyblockCourseId, Lookup lineage reference object : sorpcde
     * 
     */
    @JsonProperty("keyblockCourseId")
    public Object getKeyblockCourseId() {
        return keyblockCourseId;
    }

    /**
     * Lineage reference object : keyblockCourseId, Lookup lineage reference object : sorpcde
     * 
     */
    @JsonProperty("keyblockCourseId")
    public void setKeyblockCourseId(Object keyblockCourseId) {
        this.keyblockCourseId = keyblockCourseId;
    }

    public EuHesaCourseDeliveryDetails100GetRequest withKeyblockCourseId(Object keyblockCourseId) {
        this.keyblockCourseId = keyblockCourseId;
        return this;
    }

    /**
     * Lineage reference object : copyCourseId, Lookup lineage reference object : sorpcde
     * 
     */
    @JsonProperty("copyCourseId")
    public Object getCopyCourseId() {
        return copyCourseId;
    }

    /**
     * Lineage reference object : copyCourseId, Lookup lineage reference object : sorpcde
     * 
     */
    @JsonProperty("copyCourseId")
    public void setCopyCourseId(Object copyCourseId) {
        this.copyCourseId = copyCourseId;
    }

    public EuHesaCourseDeliveryDetails100GetRequest withCopyCourseId(Object copyCourseId) {
        this.copyCourseId = copyCourseId;
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

    public EuHesaCourseDeliveryDetails100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaCourseDeliveryDetails100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblockCourseId");
        sb.append('=');
        sb.append(((this.keyblockCourseId == null)?"<null>":this.keyblockCourseId));
        sb.append(',');
        sb.append("copyCourseId");
        sb.append('=');
        sb.append(((this.copyCourseId == null)?"<null>":this.copyCourseId));
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
        result = ((result* 31)+((this.keyblockCourseId == null)? 0 :this.keyblockCourseId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.copyCourseId == null)? 0 :this.copyCourseId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaCourseDeliveryDetails100GetRequest) == false) {
            return false;
        }
        EuHesaCourseDeliveryDetails100GetRequest rhs = ((EuHesaCourseDeliveryDetails100GetRequest) other);
        return ((((this.keyblockCourseId == rhs.keyblockCourseId)||((this.keyblockCourseId!= null)&&this.keyblockCourseId.equals(rhs.keyblockCourseId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.copyCourseId == rhs.copyCourseId)||((this.copyCourseId!= null)&&this.copyCourseId.equals(rhs.copyCourseId))));
    }

}
