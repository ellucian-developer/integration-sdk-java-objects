
package com.ellucian.generated.bpapi.ban.fund_hierarchy_query.v1_0_0;

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
    "ftxfndhFundCode",
    "ftxfndhCoasCode"
})
@Generated("jsonschema2pojo")
public class FundHierarchyQuery100GetRequest {

    /**
     * Fund
     * <p>
     * Lineage reference object : ftxfndhFundCode
     * 
     */
    @JsonProperty("ftxfndhFundCode")
    @JsonPropertyDescription("Lineage reference object : ftxfndhFundCode")
    private Object ftxfndhFundCode;
    /**
     * COA
     * <p>
     * Lineage reference object : ftxfndhCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxfndhCoasCode")
    @JsonPropertyDescription("Lineage reference object : ftxfndhCoasCode, Lookup lineage reference object : ftvcoas")
    private Object ftxfndhCoasCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fund
     * <p>
     * Lineage reference object : ftxfndhFundCode
     * 
     */
    @JsonProperty("ftxfndhFundCode")
    public Object getFtxfndhFundCode() {
        return ftxfndhFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : ftxfndhFundCode
     * 
     */
    @JsonProperty("ftxfndhFundCode")
    public void setFtxfndhFundCode(Object ftxfndhFundCode) {
        this.ftxfndhFundCode = ftxfndhFundCode;
    }

    public FundHierarchyQuery100GetRequest withFtxfndhFundCode(Object ftxfndhFundCode) {
        this.ftxfndhFundCode = ftxfndhFundCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : ftxfndhCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxfndhCoasCode")
    public Object getFtxfndhCoasCode() {
        return ftxfndhCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : ftxfndhCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxfndhCoasCode")
    public void setFtxfndhCoasCode(Object ftxfndhCoasCode) {
        this.ftxfndhCoasCode = ftxfndhCoasCode;
    }

    public FundHierarchyQuery100GetRequest withFtxfndhCoasCode(Object ftxfndhCoasCode) {
        this.ftxfndhCoasCode = ftxfndhCoasCode;
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

    public FundHierarchyQuery100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundHierarchyQuery100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftxfndhFundCode");
        sb.append('=');
        sb.append(((this.ftxfndhFundCode == null)?"<null>":this.ftxfndhFundCode));
        sb.append(',');
        sb.append("ftxfndhCoasCode");
        sb.append('=');
        sb.append(((this.ftxfndhCoasCode == null)?"<null>":this.ftxfndhCoasCode));
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
        result = ((result* 31)+((this.ftxfndhFundCode == null)? 0 :this.ftxfndhFundCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftxfndhCoasCode == null)? 0 :this.ftxfndhCoasCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundHierarchyQuery100GetRequest) == false) {
            return false;
        }
        FundHierarchyQuery100GetRequest rhs = ((FundHierarchyQuery100GetRequest) other);
        return ((((this.ftxfndhFundCode == rhs.ftxfndhFundCode)||((this.ftxfndhFundCode!= null)&&this.ftxfndhFundCode.equals(rhs.ftxfndhFundCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftxfndhCoasCode == rhs.ftxfndhCoasCode)||((this.ftxfndhCoasCode!= null)&&this.ftxfndhCoasCode.equals(rhs.ftxfndhCoasCode))));
    }

}
