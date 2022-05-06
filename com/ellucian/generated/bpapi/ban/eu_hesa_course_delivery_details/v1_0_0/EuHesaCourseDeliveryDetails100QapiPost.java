
package com.ellucian.generated.bpapi.ban.eu_hesa_course_delivery_details.v1_0_0;

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
    "keyblockCourseId",
    "copyCourseId"
})
@Generated("jsonschema2pojo")
public class EuHesaCourseDeliveryDetails100QapiPost {

    @JsonProperty("keyblockCourseId")
    private String keyblockCourseId;
    @JsonProperty("copyCourseId")
    private String copyCourseId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblockCourseId")
    public String getKeyblockCourseId() {
        return keyblockCourseId;
    }

    @JsonProperty("keyblockCourseId")
    public void setKeyblockCourseId(String keyblockCourseId) {
        this.keyblockCourseId = keyblockCourseId;
    }

    public EuHesaCourseDeliveryDetails100QapiPost withKeyblockCourseId(String keyblockCourseId) {
        this.keyblockCourseId = keyblockCourseId;
        return this;
    }

    @JsonProperty("copyCourseId")
    public String getCopyCourseId() {
        return copyCourseId;
    }

    @JsonProperty("copyCourseId")
    public void setCopyCourseId(String copyCourseId) {
        this.copyCourseId = copyCourseId;
    }

    public EuHesaCourseDeliveryDetails100QapiPost withCopyCourseId(String copyCourseId) {
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

    public EuHesaCourseDeliveryDetails100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaCourseDeliveryDetails100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof EuHesaCourseDeliveryDetails100QapiPost) == false) {
            return false;
        }
        EuHesaCourseDeliveryDetails100QapiPost rhs = ((EuHesaCourseDeliveryDetails100QapiPost) other);
        return ((((this.keyblockCourseId == rhs.keyblockCourseId)||((this.keyblockCourseId!= null)&&this.keyblockCourseId.equals(rhs.keyblockCourseId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.copyCourseId == rhs.copyCourseId)||((this.copyCourseId!= null)&&this.copyCourseId.equals(rhs.copyCourseId))));
    }

}
