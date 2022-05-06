
package com.ellucian.generated.bpapi.ban.benefit_category_rule.v1_0_0;

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
    "bcatCode"
})
@Generated("jsonschema2pojo")
public class BenefitCategoryRule100GetRequest {

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : bcatCode, Lookup lineage reference object : ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("bcatCode")
    @JsonPropertyDescription("Lineage reference object : bcatCode, Lookup lineage reference object : ptrbcat")
    private Object bcatCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : bcatCode, Lookup lineage reference object : ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("bcatCode")
    public Object getBcatCode() {
        return bcatCode;
    }

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : bcatCode, Lookup lineage reference object : ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("bcatCode")
    public void setBcatCode(Object bcatCode) {
        this.bcatCode = bcatCode;
    }

    public BenefitCategoryRule100GetRequest withBcatCode(Object bcatCode) {
        this.bcatCode = bcatCode;
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

    public BenefitCategoryRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BenefitCategoryRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bcatCode");
        sb.append('=');
        sb.append(((this.bcatCode == null)?"<null>":this.bcatCode));
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
        result = ((result* 31)+((this.bcatCode == null)? 0 :this.bcatCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitCategoryRule100GetRequest) == false) {
            return false;
        }
        BenefitCategoryRule100GetRequest rhs = ((BenefitCategoryRule100GetRequest) other);
        return (((this.bcatCode == rhs.bcatCode)||((this.bcatCode!= null)&&this.bcatCode.equals(rhs.bcatCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
