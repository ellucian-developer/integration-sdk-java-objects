
package com.ellucian.generated.bpapi.ban.role_definition_codes.v1_0_0;

import java.util.Date;
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
    "stvroleActivityDate",
    "stvroleCode",
    "stvroleDescription"
})
@Generated("jsonschema2pojo")
public class RoleDefinitionCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVROLE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("stvroleActivityDate")
    @JsonPropertyDescription("Lineage reference object : STVROLE_ACTIVITY_DATE")
    private Date stvroleActivityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVROLE_CODE
     * 
     */
    @JsonProperty("stvroleCode")
    @JsonPropertyDescription("Lineage reference object : STVROLE_CODE")
    private String stvroleCode;
    /**
     * Description
     * <p>
     * Lineage reference object : STVROLE_DESCRIPTION
     * 
     */
    @JsonProperty("stvroleDescription")
    @JsonPropertyDescription("Lineage reference object : STVROLE_DESCRIPTION")
    private String stvroleDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVROLE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("stvroleActivityDate")
    public Date getStvroleActivityDate() {
        return stvroleActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVROLE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("stvroleActivityDate")
    public void setStvroleActivityDate(Date stvroleActivityDate) {
        this.stvroleActivityDate = stvroleActivityDate;
    }

    public RoleDefinitionCodes100QapiPost withStvroleActivityDate(Date stvroleActivityDate) {
        this.stvroleActivityDate = stvroleActivityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVROLE_CODE
     * 
     */
    @JsonProperty("stvroleCode")
    public String getStvroleCode() {
        return stvroleCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVROLE_CODE
     * 
     */
    @JsonProperty("stvroleCode")
    public void setStvroleCode(String stvroleCode) {
        this.stvroleCode = stvroleCode;
    }

    public RoleDefinitionCodes100QapiPost withStvroleCode(String stvroleCode) {
        this.stvroleCode = stvroleCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVROLE_DESCRIPTION
     * 
     */
    @JsonProperty("stvroleDescription")
    public String getStvroleDescription() {
        return stvroleDescription;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVROLE_DESCRIPTION
     * 
     */
    @JsonProperty("stvroleDescription")
    public void setStvroleDescription(String stvroleDescription) {
        this.stvroleDescription = stvroleDescription;
    }

    public RoleDefinitionCodes100QapiPost withStvroleDescription(String stvroleDescription) {
        this.stvroleDescription = stvroleDescription;
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

    public RoleDefinitionCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoleDefinitionCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvroleActivityDate");
        sb.append('=');
        sb.append(((this.stvroleActivityDate == null)?"<null>":this.stvroleActivityDate));
        sb.append(',');
        sb.append("stvroleCode");
        sb.append('=');
        sb.append(((this.stvroleCode == null)?"<null>":this.stvroleCode));
        sb.append(',');
        sb.append("stvroleDescription");
        sb.append('=');
        sb.append(((this.stvroleDescription == null)?"<null>":this.stvroleDescription));
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
        result = ((result* 31)+((this.stvroleDescription == null)? 0 :this.stvroleDescription.hashCode()));
        result = ((result* 31)+((this.stvroleCode == null)? 0 :this.stvroleCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stvroleActivityDate == null)? 0 :this.stvroleActivityDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoleDefinitionCodes100QapiPost) == false) {
            return false;
        }
        RoleDefinitionCodes100QapiPost rhs = ((RoleDefinitionCodes100QapiPost) other);
        return (((((this.stvroleDescription == rhs.stvroleDescription)||((this.stvroleDescription!= null)&&this.stvroleDescription.equals(rhs.stvroleDescription)))&&((this.stvroleCode == rhs.stvroleCode)||((this.stvroleCode!= null)&&this.stvroleCode.equals(rhs.stvroleCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stvroleActivityDate == rhs.stvroleActivityDate)||((this.stvroleActivityDate!= null)&&this.stvroleActivityDate.equals(rhs.stvroleActivityDate))));
    }

}
