
package com.ellucian.generated.bpapi.ban.grade_book_rule_definition.v0_1_0;

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
    "ruleTypeDesc",
    "ruleType",
    "description"
})
@Generated("jsonschema2pojo")
public class Shbgrul {

    @JsonProperty("ruleTypeDesc")
    private String ruleTypeDesc;
    /**
     * Rule Type
     * <p>
     * Lineage reference object : SHBGRUL_RULE_TYPE
     * (Required)
     * 
     */
    @JsonProperty("ruleType")
    @JsonPropertyDescription("Lineage reference object : SHBGRUL_RULE_TYPE")
    private String ruleType;
    /**
     * Description
     * <p>
     * Lineage reference object : SHBGRUL_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : SHBGRUL_DESCRIPTION")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ruleTypeDesc")
    public String getRuleTypeDesc() {
        return ruleTypeDesc;
    }

    @JsonProperty("ruleTypeDesc")
    public void setRuleTypeDesc(String ruleTypeDesc) {
        this.ruleTypeDesc = ruleTypeDesc;
    }

    public Shbgrul withRuleTypeDesc(String ruleTypeDesc) {
        this.ruleTypeDesc = ruleTypeDesc;
        return this;
    }

    /**
     * Rule Type
     * <p>
     * Lineage reference object : SHBGRUL_RULE_TYPE
     * (Required)
     * 
     */
    @JsonProperty("ruleType")
    public String getRuleType() {
        return ruleType;
    }

    /**
     * Rule Type
     * <p>
     * Lineage reference object : SHBGRUL_RULE_TYPE
     * (Required)
     * 
     */
    @JsonProperty("ruleType")
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public Shbgrul withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHBGRUL_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHBGRUL_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Shbgrul withDescription(String description) {
        this.description = description;
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

    public Shbgrul withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shbgrul.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ruleTypeDesc");
        sb.append('=');
        sb.append(((this.ruleTypeDesc == null)?"<null>":this.ruleTypeDesc));
        sb.append(',');
        sb.append("ruleType");
        sb.append('=');
        sb.append(((this.ruleType == null)?"<null>":this.ruleType));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ruleTypeDesc == null)? 0 :this.ruleTypeDesc.hashCode()));
        result = ((result* 31)+((this.ruleType == null)? 0 :this.ruleType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shbgrul) == false) {
            return false;
        }
        Shbgrul rhs = ((Shbgrul) other);
        return (((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ruleTypeDesc == rhs.ruleTypeDesc)||((this.ruleTypeDesc!= null)&&this.ruleTypeDesc.equals(rhs.ruleTypeDesc))))&&((this.ruleType == rhs.ruleType)||((this.ruleType!= null)&&this.ruleType.equals(rhs.ruleType))));
    }

}
