
package com.ellucian.generated.bpapi.ban.account_hierarchy_query.v1_0_0;

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
    "ftxacthCoasCode",
    "ftxacthAcctCode"
})
@Generated("jsonschema2pojo")
public class AccountHierarchyQuery100QapiPost {

    @JsonProperty("ftxacthCoasCode")
    private String ftxacthCoasCode;
    @JsonProperty("ftxacthAcctCode")
    private String ftxacthAcctCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ftxacthCoasCode")
    public String getFtxacthCoasCode() {
        return ftxacthCoasCode;
    }

    @JsonProperty("ftxacthCoasCode")
    public void setFtxacthCoasCode(String ftxacthCoasCode) {
        this.ftxacthCoasCode = ftxacthCoasCode;
    }

    public AccountHierarchyQuery100QapiPost withFtxacthCoasCode(String ftxacthCoasCode) {
        this.ftxacthCoasCode = ftxacthCoasCode;
        return this;
    }

    @JsonProperty("ftxacthAcctCode")
    public String getFtxacthAcctCode() {
        return ftxacthAcctCode;
    }

    @JsonProperty("ftxacthAcctCode")
    public void setFtxacthAcctCode(String ftxacthAcctCode) {
        this.ftxacthAcctCode = ftxacthAcctCode;
    }

    public AccountHierarchyQuery100QapiPost withFtxacthAcctCode(String ftxacthAcctCode) {
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

    public AccountHierarchyQuery100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountHierarchyQuery100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof AccountHierarchyQuery100QapiPost) == false) {
            return false;
        }
        AccountHierarchyQuery100QapiPost rhs = ((AccountHierarchyQuery100QapiPost) other);
        return ((((this.ftxacthCoasCode == rhs.ftxacthCoasCode)||((this.ftxacthCoasCode!= null)&&this.ftxacthCoasCode.equals(rhs.ftxacthCoasCode)))&&((this.ftxacthAcctCode == rhs.ftxacthAcctCode)||((this.ftxacthAcctCode!= null)&&this.ftxacthAcctCode.equals(rhs.ftxacthAcctCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
