
package com.ellucian.generated.bpapi.ban.group_output_inquiry.v0_1_0;

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
    "area",
    "id",
    "requestNo",
    "group"
})
@Generated("jsonschema2pojo")
public class GroupOutputInquiry010GetRequest {

    /**
     * Area
     * <p>
     * Lineage reference object : area, Lookup lineage reference object : smbaogn,smralib,smbgogn
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("Lineage reference object : area, Lookup lineage reference object : smbaogn,smralib,smbgogn")
    private String area;
    /**
     * ID
     * <p>
     * Lineage reference object : id, Lookup lineage reference object : spriden,smbgogn
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id, Lookup lineage reference object : spriden,smbgogn")
    private String id;
    /**
     * Request Number
     * <p>
     * Lineage reference object : requestNo, Lookup lineage reference object : smbpogn,smbgogn
     * 
     */
    @JsonProperty("requestNo")
    @JsonPropertyDescription("Lineage reference object : requestNo, Lookup lineage reference object : smbpogn,smbgogn")
    private Double requestNo;
    /**
     * Group
     * <p>
     * Lineage reference object : group, Lookup lineage reference object : smbgogn,smrglib
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("Lineage reference object : group, Lookup lineage reference object : smbgogn,smrglib")
    private String group;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Area
     * <p>
     * Lineage reference object : area, Lookup lineage reference object : smbaogn,smralib,smbgogn
     * 
     */
    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : area, Lookup lineage reference object : smbaogn,smralib,smbgogn
     * 
     */
    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    public GroupOutputInquiry010GetRequest withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id, Lookup lineage reference object : spriden,smbgogn
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id, Lookup lineage reference object : spriden,smbgogn
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GroupOutputInquiry010GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Request Number
     * <p>
     * Lineage reference object : requestNo, Lookup lineage reference object : smbpogn,smbgogn
     * 
     */
    @JsonProperty("requestNo")
    public Double getRequestNo() {
        return requestNo;
    }

    /**
     * Request Number
     * <p>
     * Lineage reference object : requestNo, Lookup lineage reference object : smbpogn,smbgogn
     * 
     */
    @JsonProperty("requestNo")
    public void setRequestNo(Double requestNo) {
        this.requestNo = requestNo;
    }

    public GroupOutputInquiry010GetRequest withRequestNo(Double requestNo) {
        this.requestNo = requestNo;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : group, Lookup lineage reference object : smbgogn,smrglib
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : group, Lookup lineage reference object : smbgogn,smrglib
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public GroupOutputInquiry010GetRequest withGroup(String group) {
        this.group = group;
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

    public GroupOutputInquiry010GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GroupOutputInquiry010GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("requestNo");
        sb.append('=');
        sb.append(((this.requestNo == null)?"<null>":this.requestNo));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
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
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.requestNo == null)? 0 :this.requestNo.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupOutputInquiry010GetRequest) == false) {
            return false;
        }
        GroupOutputInquiry010GetRequest rhs = ((GroupOutputInquiry010GetRequest) other);
        return ((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.requestNo == rhs.requestNo)||((this.requestNo!= null)&&this.requestNo.equals(rhs.requestNo))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
