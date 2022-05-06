
package com.ellucian.generated.bpapi.ban.organization_hierarchy_query.v1_0_0;

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
    "ftxorghCoasCode",
    "ftxorghOrgnCode"
})
@Generated("jsonschema2pojo")
public class OrganizationHierarchyQuery100QapiPost {

    @JsonProperty("ftxorghCoasCode")
    private String ftxorghCoasCode;
    @JsonProperty("ftxorghOrgnCode")
    private String ftxorghOrgnCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ftxorghCoasCode")
    public String getFtxorghCoasCode() {
        return ftxorghCoasCode;
    }

    @JsonProperty("ftxorghCoasCode")
    public void setFtxorghCoasCode(String ftxorghCoasCode) {
        this.ftxorghCoasCode = ftxorghCoasCode;
    }

    public OrganizationHierarchyQuery100QapiPost withFtxorghCoasCode(String ftxorghCoasCode) {
        this.ftxorghCoasCode = ftxorghCoasCode;
        return this;
    }

    @JsonProperty("ftxorghOrgnCode")
    public String getFtxorghOrgnCode() {
        return ftxorghOrgnCode;
    }

    @JsonProperty("ftxorghOrgnCode")
    public void setFtxorghOrgnCode(String ftxorghOrgnCode) {
        this.ftxorghOrgnCode = ftxorghOrgnCode;
    }

    public OrganizationHierarchyQuery100QapiPost withFtxorghOrgnCode(String ftxorghOrgnCode) {
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

    public OrganizationHierarchyQuery100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationHierarchyQuery100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof OrganizationHierarchyQuery100QapiPost) == false) {
            return false;
        }
        OrganizationHierarchyQuery100QapiPost rhs = ((OrganizationHierarchyQuery100QapiPost) other);
        return ((((this.ftxorghCoasCode == rhs.ftxorghCoasCode)||((this.ftxorghCoasCode!= null)&&this.ftxorghCoasCode.equals(rhs.ftxorghCoasCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftxorghOrgnCode == rhs.ftxorghOrgnCode)||((this.ftxorghOrgnCode!= null)&&this.ftxorghOrgnCode.equals(rhs.ftxorghOrgnCode))));
    }

}
