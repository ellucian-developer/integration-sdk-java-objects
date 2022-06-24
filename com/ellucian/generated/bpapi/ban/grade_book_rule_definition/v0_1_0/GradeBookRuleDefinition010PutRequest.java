
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
    "criteria.parmValue",
    "parmValue",
    "name",
    "criteria.parm"
})
@Generated("jsonschema2pojo")
public class GradeBookRuleDefinition010PutRequest {

    /**
     * Values
     * <p>
     * Lineage reference object : SHRGRUL_PARM_VALUE
     * 
     */
    @JsonProperty("criteria.parmValue")
    @JsonPropertyDescription("Lineage reference object : SHRGRUL_PARM_VALUE")
    private String criteriaParmValue;
    /**
     * Values
     * <p>
     * Lineage reference object : SHRGRUL_PARM_VALUE
     * 
     */
    @JsonProperty("parmValue")
    @JsonPropertyDescription("Lineage reference object : SHRGRUL_PARM_VALUE")
    private String parmValue;
    /**
     * Lineage reference object : nName, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : nName, Lookup lineage reference object : shbgrul")
    private String name;
    /**
     * Parameters
     * <p>
     * Lineage reference object : SHRGRUL_PARM
     * 
     */
    @JsonProperty("criteria.parm")
    @JsonPropertyDescription("Lineage reference object : SHRGRUL_PARM")
    private String criteriaParm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Values
     * <p>
     * Lineage reference object : SHRGRUL_PARM_VALUE
     * 
     */
    @JsonProperty("criteria.parmValue")
    public String getCriteriaParmValue() {
        return criteriaParmValue;
    }

    /**
     * Values
     * <p>
     * Lineage reference object : SHRGRUL_PARM_VALUE
     * 
     */
    @JsonProperty("criteria.parmValue")
    public void setCriteriaParmValue(String criteriaParmValue) {
        this.criteriaParmValue = criteriaParmValue;
    }

    public GradeBookRuleDefinition010PutRequest withCriteriaParmValue(String criteriaParmValue) {
        this.criteriaParmValue = criteriaParmValue;
        return this;
    }

    /**
     * Values
     * <p>
     * Lineage reference object : SHRGRUL_PARM_VALUE
     * 
     */
    @JsonProperty("parmValue")
    public String getParmValue() {
        return parmValue;
    }

    /**
     * Values
     * <p>
     * Lineage reference object : SHRGRUL_PARM_VALUE
     * 
     */
    @JsonProperty("parmValue")
    public void setParmValue(String parmValue) {
        this.parmValue = parmValue;
    }

    public GradeBookRuleDefinition010PutRequest withParmValue(String parmValue) {
        this.parmValue = parmValue;
        return this;
    }

    /**
     * Lineage reference object : nName, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Lineage reference object : nName, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public GradeBookRuleDefinition010PutRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Parameters
     * <p>
     * Lineage reference object : SHRGRUL_PARM
     * 
     */
    @JsonProperty("criteria.parm")
    public String getCriteriaParm() {
        return criteriaParm;
    }

    /**
     * Parameters
     * <p>
     * Lineage reference object : SHRGRUL_PARM
     * 
     */
    @JsonProperty("criteria.parm")
    public void setCriteriaParm(String criteriaParm) {
        this.criteriaParm = criteriaParm;
    }

    public GradeBookRuleDefinition010PutRequest withCriteriaParm(String criteriaParm) {
        this.criteriaParm = criteriaParm;
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

    public GradeBookRuleDefinition010PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeBookRuleDefinition010PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaParmValue");
        sb.append('=');
        sb.append(((this.criteriaParmValue == null)?"<null>":this.criteriaParmValue));
        sb.append(',');
        sb.append("parmValue");
        sb.append('=');
        sb.append(((this.parmValue == null)?"<null>":this.parmValue));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("criteriaParm");
        sb.append('=');
        sb.append(((this.criteriaParm == null)?"<null>":this.criteriaParm));
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
        result = ((result* 31)+((this.criteriaParmValue == null)? 0 :this.criteriaParmValue.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.criteriaParm == null)? 0 :this.criteriaParm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.parmValue == null)? 0 :this.parmValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeBookRuleDefinition010PutRequest) == false) {
            return false;
        }
        GradeBookRuleDefinition010PutRequest rhs = ((GradeBookRuleDefinition010PutRequest) other);
        return ((((((this.criteriaParmValue == rhs.criteriaParmValue)||((this.criteriaParmValue!= null)&&this.criteriaParmValue.equals(rhs.criteriaParmValue)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.criteriaParm == rhs.criteriaParm)||((this.criteriaParm!= null)&&this.criteriaParm.equals(rhs.criteriaParm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.parmValue == rhs.parmValue)||((this.parmValue!= null)&&this.parmValue.equals(rhs.parmValue))));
    }

}
