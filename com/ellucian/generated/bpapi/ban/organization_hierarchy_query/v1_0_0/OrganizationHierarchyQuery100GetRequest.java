
package com.ellucian.generated.bpapi.ban.organization_hierarchy_query.v1_0_0;

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
    "ftxorghCoasCode",
    "ftxorghOrgnCode"
})
@Generated("jsonschema2pojo")
public class OrganizationHierarchyQuery100GetRequest {

    /**
     * COA
     * <p>
     * Lineage reference object : ftxorghCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxorghCoasCode")
    @JsonPropertyDescription("Lineage reference object : ftxorghCoasCode, Lookup lineage reference object : ftvcoas")
    private String ftxorghCoasCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : ftxorghOrgnCode
     * 
     */
    @JsonProperty("ftxorghOrgnCode")
    @JsonPropertyDescription("Lineage reference object : ftxorghOrgnCode")
    private String ftxorghOrgnCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * COA
     * <p>
     * Lineage reference object : ftxorghCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxorghCoasCode")
    public String getFtxorghCoasCode() {
        return ftxorghCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : ftxorghCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxorghCoasCode")
    public void setFtxorghCoasCode(String ftxorghCoasCode) {
        this.ftxorghCoasCode = ftxorghCoasCode;
    }

    public OrganizationHierarchyQuery100GetRequest withFtxorghCoasCode(String ftxorghCoasCode) {
        this.ftxorghCoasCode = ftxorghCoasCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : ftxorghOrgnCode
     * 
     */
    @JsonProperty("ftxorghOrgnCode")
    public String getFtxorghOrgnCode() {
        return ftxorghOrgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : ftxorghOrgnCode
     * 
     */
    @JsonProperty("ftxorghOrgnCode")
    public void setFtxorghOrgnCode(String ftxorghOrgnCode) {
        this.ftxorghOrgnCode = ftxorghOrgnCode;
    }

    public OrganizationHierarchyQuery100GetRequest withFtxorghOrgnCode(String ftxorghOrgnCode) {
        this.ftxorghOrgnCode = ftxorghOrgnCode;
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

    public OrganizationHierarchyQuery100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationHierarchyQuery100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftxorghCoasCode");
        sb.append('=');
        sb.append(((this.ftxorghCoasCode == null)?"<null>":this.ftxorghCoasCode));
        sb.append(',');
        sb.append("ftxorghOrgnCode");
        sb.append('=');
        sb.append(((this.ftxorghOrgnCode == null)?"<null>":this.ftxorghOrgnCode));
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
        result = ((result* 31)+((this.ftxorghCoasCode == null)? 0 :this.ftxorghCoasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftxorghOrgnCode == null)? 0 :this.ftxorghOrgnCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationHierarchyQuery100GetRequest) == false) {
            return false;
        }
        OrganizationHierarchyQuery100GetRequest rhs = ((OrganizationHierarchyQuery100GetRequest) other);
        return ((((this.ftxorghCoasCode == rhs.ftxorghCoasCode)||((this.ftxorghCoasCode!= null)&&this.ftxorghCoasCode.equals(rhs.ftxorghCoasCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftxorghOrgnCode == rhs.ftxorghOrgnCode)||((this.ftxorghOrgnCode!= null)&&this.ftxorghOrgnCode.equals(rhs.ftxorghOrgnCode))));
    }

}
