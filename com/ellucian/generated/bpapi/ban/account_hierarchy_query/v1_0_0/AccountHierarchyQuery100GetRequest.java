
package com.ellucian.generated.bpapi.ban.account_hierarchy_query.v1_0_0;

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
    "ftxacthCoasCode",
    "ftxacthAcctCode"
})
@Generated("jsonschema2pojo")
public class AccountHierarchyQuery100GetRequest {

    /**
     * COA
     * <p>
     * Lineage reference object : ftxacthCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxacthCoasCode")
    @JsonPropertyDescription("Lineage reference object : ftxacthCoasCode, Lookup lineage reference object : ftvcoas")
    private Object ftxacthCoasCode;
    /**
     * Account
     * <p>
     * Lineage reference object : ftxacthAcctCode
     * 
     */
    @JsonProperty("ftxacthAcctCode")
    @JsonPropertyDescription("Lineage reference object : ftxacthAcctCode")
    private Object ftxacthAcctCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * COA
     * <p>
     * Lineage reference object : ftxacthCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxacthCoasCode")
    public Object getFtxacthCoasCode() {
        return ftxacthCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : ftxacthCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxacthCoasCode")
    public void setFtxacthCoasCode(Object ftxacthCoasCode) {
        this.ftxacthCoasCode = ftxacthCoasCode;
    }

    public AccountHierarchyQuery100GetRequest withFtxacthCoasCode(Object ftxacthCoasCode) {
        this.ftxacthCoasCode = ftxacthCoasCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : ftxacthAcctCode
     * 
     */
    @JsonProperty("ftxacthAcctCode")
    public Object getFtxacthAcctCode() {
        return ftxacthAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : ftxacthAcctCode
     * 
     */
    @JsonProperty("ftxacthAcctCode")
    public void setFtxacthAcctCode(Object ftxacthAcctCode) {
        this.ftxacthAcctCode = ftxacthAcctCode;
    }

    public AccountHierarchyQuery100GetRequest withFtxacthAcctCode(Object ftxacthAcctCode) {
        this.ftxacthAcctCode = ftxacthAcctCode;
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

    public AccountHierarchyQuery100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountHierarchyQuery100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftxacthCoasCode");
        sb.append('=');
        sb.append(((this.ftxacthCoasCode == null)?"<null>":this.ftxacthCoasCode));
        sb.append(',');
        sb.append("ftxacthAcctCode");
        sb.append('=');
        sb.append(((this.ftxacthAcctCode == null)?"<null>":this.ftxacthAcctCode));
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
        result = ((result* 31)+((this.ftxacthCoasCode == null)? 0 :this.ftxacthCoasCode.hashCode()));
        result = ((result* 31)+((this.ftxacthAcctCode == null)? 0 :this.ftxacthAcctCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountHierarchyQuery100GetRequest) == false) {
            return false;
        }
        AccountHierarchyQuery100GetRequest rhs = ((AccountHierarchyQuery100GetRequest) other);
        return ((((this.ftxacthCoasCode == rhs.ftxacthCoasCode)||((this.ftxacthCoasCode!= null)&&this.ftxacthCoasCode.equals(rhs.ftxacthCoasCode)))&&((this.ftxacthAcctCode == rhs.ftxacthAcctCode)||((this.ftxacthAcctCode!= null)&&this.ftxacthAcctCode.equals(rhs.ftxacthAcctCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
