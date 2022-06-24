
package com.ellucian.generated.bpapi.ban.group_usage_by_area_inquiry.v0_1_0;

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
    "smrguseArea",
    "smrguseGroup"
})
@Generated("jsonschema2pojo")
public class GroupUsageByAreaInquiry010GetRequest {

    /**
     * Area
     * <p>
     * Lineage reference object : SMRGUSE_AREA
     * 
     */
    @JsonProperty("smrguseArea")
    @JsonPropertyDescription("Lineage reference object : SMRGUSE_AREA")
    private String smrguseArea;
    /**
     * Group
     * <p>
     * Lineage reference object : SMRGUSE_GROUP
     * 
     */
    @JsonProperty("smrguseGroup")
    @JsonPropertyDescription("Lineage reference object : SMRGUSE_GROUP")
    private String smrguseGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Area
     * <p>
     * Lineage reference object : SMRGUSE_AREA
     * 
     */
    @JsonProperty("smrguseArea")
    public String getSmrguseArea() {
        return smrguseArea;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SMRGUSE_AREA
     * 
     */
    @JsonProperty("smrguseArea")
    public void setSmrguseArea(String smrguseArea) {
        this.smrguseArea = smrguseArea;
    }

    public GroupUsageByAreaInquiry010GetRequest withSmrguseArea(String smrguseArea) {
        this.smrguseArea = smrguseArea;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SMRGUSE_GROUP
     * 
     */
    @JsonProperty("smrguseGroup")
    public String getSmrguseGroup() {
        return smrguseGroup;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SMRGUSE_GROUP
     * 
     */
    @JsonProperty("smrguseGroup")
    public void setSmrguseGroup(String smrguseGroup) {
        this.smrguseGroup = smrguseGroup;
    }

    public GroupUsageByAreaInquiry010GetRequest withSmrguseGroup(String smrguseGroup) {
        this.smrguseGroup = smrguseGroup;
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

    public GroupUsageByAreaInquiry010GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GroupUsageByAreaInquiry010GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("smrguseArea");
        sb.append('=');
        sb.append(((this.smrguseArea == null)?"<null>":this.smrguseArea));
        sb.append(',');
        sb.append("smrguseGroup");
        sb.append('=');
        sb.append(((this.smrguseGroup == null)?"<null>":this.smrguseGroup));
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
        result = ((result* 31)+((this.smrguseArea == null)? 0 :this.smrguseArea.hashCode()));
        result = ((result* 31)+((this.smrguseGroup == null)? 0 :this.smrguseGroup.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupUsageByAreaInquiry010GetRequest) == false) {
            return false;
        }
        GroupUsageByAreaInquiry010GetRequest rhs = ((GroupUsageByAreaInquiry010GetRequest) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.smrguseArea == rhs.smrguseArea)||((this.smrguseArea!= null)&&this.smrguseArea.equals(rhs.smrguseArea))))&&((this.smrguseGroup == rhs.smrguseGroup)||((this.smrguseGroup!= null)&&this.smrguseGroup.equals(rhs.smrguseGroup))));
    }

}
