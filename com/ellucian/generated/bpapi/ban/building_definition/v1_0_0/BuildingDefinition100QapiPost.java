
package com.ellucian.generated.bpapi.ban.building_definition.v1_0_0;

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
    "slabldgBldgCode"
})
@Generated("jsonschema2pojo")
public class BuildingDefinition100QapiPost {

    @JsonProperty("slabldgBldgCode")
    private String slabldgBldgCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("slabldgBldgCode")
    public String getSlabldgBldgCode() {
        return slabldgBldgCode;
    }

    @JsonProperty("slabldgBldgCode")
    public void setSlabldgBldgCode(String slabldgBldgCode) {
        this.slabldgBldgCode = slabldgBldgCode;
    }

    public BuildingDefinition100QapiPost withSlabldgBldgCode(String slabldgBldgCode) {
        this.slabldgBldgCode = slabldgBldgCode;
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

    public BuildingDefinition100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BuildingDefinition100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("slabldgBldgCode");
        sb.append('=');
        sb.append(((this.slabldgBldgCode == null)?"<null>":this.slabldgBldgCode));
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
        result = ((result* 31)+((this.slabldgBldgCode == null)? 0 :this.slabldgBldgCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuildingDefinition100QapiPost) == false) {
            return false;
        }
        BuildingDefinition100QapiPost rhs = ((BuildingDefinition100QapiPost) other);
        return (((this.slabldgBldgCode == rhs.slabldgBldgCode)||((this.slabldgBldgCode!= null)&&this.slabldgBldgCode.equals(rhs.slabldgBldgCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
