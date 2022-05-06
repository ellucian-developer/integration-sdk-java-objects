
package com.ellucian.generated.bpapi.ban.benefit_or_deduction_grouping_rule.v1_0_0;

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
    "bdpgCode"
})
@Generated("jsonschema2pojo")
public class BenefitOrDeductionGroupingRule100GetRequest {

    /**
     * Primary Group
     * <p>
     * Lineage reference object : bdpgCode
     * (Required)
     * 
     */
    @JsonProperty("bdpgCode")
    @JsonPropertyDescription("Lineage reference object : bdpgCode")
    private Object bdpgCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Primary Group
     * <p>
     * Lineage reference object : bdpgCode
     * (Required)
     * 
     */
    @JsonProperty("bdpgCode")
    public Object getBdpgCode() {
        return bdpgCode;
    }

    /**
     * Primary Group
     * <p>
     * Lineage reference object : bdpgCode
     * (Required)
     * 
     */
    @JsonProperty("bdpgCode")
    public void setBdpgCode(Object bdpgCode) {
        this.bdpgCode = bdpgCode;
    }

    public BenefitOrDeductionGroupingRule100GetRequest withBdpgCode(Object bdpgCode) {
        this.bdpgCode = bdpgCode;
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

    public BenefitOrDeductionGroupingRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BenefitOrDeductionGroupingRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bdpgCode");
        sb.append('=');
        sb.append(((this.bdpgCode == null)?"<null>":this.bdpgCode));
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
        result = ((result* 31)+((this.bdpgCode == null)? 0 :this.bdpgCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitOrDeductionGroupingRule100GetRequest) == false) {
            return false;
        }
        BenefitOrDeductionGroupingRule100GetRequest rhs = ((BenefitOrDeductionGroupingRule100GetRequest) other);
        return (((this.bdpgCode == rhs.bdpgCode)||((this.bdpgCode!= null)&&this.bdpgCode.equals(rhs.bdpgCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
