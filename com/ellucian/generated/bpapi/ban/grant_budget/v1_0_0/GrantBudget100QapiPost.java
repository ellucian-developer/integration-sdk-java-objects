
package com.ellucian.generated.bpapi.ban.grant_budget.v1_0_0;

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
    "displayGrntCode",
    "displayGrntBudgCode"
})
@Generated("jsonschema2pojo")
public class GrantBudget100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayGrntCode")
    private String displayGrntCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayGrntBudgCode")
    private String displayGrntBudgCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayGrntCode")
    public String getDisplayGrntCode() {
        return displayGrntCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayGrntCode")
    public void setDisplayGrntCode(String displayGrntCode) {
        this.displayGrntCode = displayGrntCode;
    }

    public GrantBudget100QapiPost withDisplayGrntCode(String displayGrntCode) {
        this.displayGrntCode = displayGrntCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayGrntBudgCode")
    public String getDisplayGrntBudgCode() {
        return displayGrntBudgCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayGrntBudgCode")
    public void setDisplayGrntBudgCode(String displayGrntBudgCode) {
        this.displayGrntBudgCode = displayGrntBudgCode;
    }

    public GrantBudget100QapiPost withDisplayGrntBudgCode(String displayGrntBudgCode) {
        this.displayGrntBudgCode = displayGrntBudgCode;
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

    public GrantBudget100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantBudget100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayGrntCode");
        sb.append('=');
        sb.append(((this.displayGrntCode == null)?"<null>":this.displayGrntCode));
        sb.append(',');
        sb.append("displayGrntBudgCode");
        sb.append('=');
        sb.append(((this.displayGrntBudgCode == null)?"<null>":this.displayGrntBudgCode));
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
        result = ((result* 31)+((this.displayGrntCode == null)? 0 :this.displayGrntCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayGrntBudgCode == null)? 0 :this.displayGrntBudgCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantBudget100QapiPost) == false) {
            return false;
        }
        GrantBudget100QapiPost rhs = ((GrantBudget100QapiPost) other);
        return ((((this.displayGrntCode == rhs.displayGrntCode)||((this.displayGrntCode!= null)&&this.displayGrntCode.equals(rhs.displayGrntCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayGrntBudgCode == rhs.displayGrntBudgCode)||((this.displayGrntBudgCode!= null)&&this.displayGrntBudgCode.equals(rhs.displayGrntBudgCode))));
    }

}
