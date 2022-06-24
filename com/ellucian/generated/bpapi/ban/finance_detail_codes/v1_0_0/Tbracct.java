
package com.ellucian.generated.bpapi.ban.finance_detail_codes.v1_0_0;

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
    "code",
    "accountB",
    "accountA",
    "accountPercent"
})
@Generated("jsonschema2pojo")
public class Tbracct {

    /**
     * Designator
     * <p>
     * 
     * 
     */
    @JsonProperty("code")
    private String code;
    /**
     * Account B
     * <p>
     * Lineage reference object : TBRACCT_ACCOUNT_B
     * (Required)
     * 
     */
    @JsonProperty("accountB")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_ACCOUNT_B")
    private String accountB;
    /**
     * Account A
     * <p>
     * Lineage reference object : TBRACCT_ACCOUNT_A
     * (Required)
     * 
     */
    @JsonProperty("accountA")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_ACCOUNT_A")
    private String accountA;
    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("accountPercent")
    private Double accountPercent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Designator
     * <p>
     * 
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Designator
     * <p>
     * 
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Tbracct withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Account B
     * <p>
     * Lineage reference object : TBRACCT_ACCOUNT_B
     * (Required)
     * 
     */
    @JsonProperty("accountB")
    public String getAccountB() {
        return accountB;
    }

    /**
     * Account B
     * <p>
     * Lineage reference object : TBRACCT_ACCOUNT_B
     * (Required)
     * 
     */
    @JsonProperty("accountB")
    public void setAccountB(String accountB) {
        this.accountB = accountB;
    }

    public Tbracct withAccountB(String accountB) {
        this.accountB = accountB;
        return this;
    }

    /**
     * Account A
     * <p>
     * Lineage reference object : TBRACCT_ACCOUNT_A
     * (Required)
     * 
     */
    @JsonProperty("accountA")
    public String getAccountA() {
        return accountA;
    }

    /**
     * Account A
     * <p>
     * Lineage reference object : TBRACCT_ACCOUNT_A
     * (Required)
     * 
     */
    @JsonProperty("accountA")
    public void setAccountA(String accountA) {
        this.accountA = accountA;
    }

    public Tbracct withAccountA(String accountA) {
        this.accountA = accountA;
        return this;
    }

    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("accountPercent")
    public Double getAccountPercent() {
        return accountPercent;
    }

    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("accountPercent")
    public void setAccountPercent(Double accountPercent) {
        this.accountPercent = accountPercent;
    }

    public Tbracct withAccountPercent(Double accountPercent) {
        this.accountPercent = accountPercent;
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

    public Tbracct withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbracct.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("accountB");
        sb.append('=');
        sb.append(((this.accountB == null)?"<null>":this.accountB));
        sb.append(',');
        sb.append("accountA");
        sb.append('=');
        sb.append(((this.accountA == null)?"<null>":this.accountA));
        sb.append(',');
        sb.append("accountPercent");
        sb.append('=');
        sb.append(((this.accountPercent == null)?"<null>":this.accountPercent));
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
        result = ((result* 31)+((this.accountB == null)? 0 :this.accountB.hashCode()));
        result = ((result* 31)+((this.accountA == null)? 0 :this.accountA.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.accountPercent == null)? 0 :this.accountPercent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbracct) == false) {
            return false;
        }
        Tbracct rhs = ((Tbracct) other);
        return ((((((this.accountB == rhs.accountB)||((this.accountB!= null)&&this.accountB.equals(rhs.accountB)))&&((this.accountA == rhs.accountA)||((this.accountA!= null)&&this.accountA.equals(rhs.accountA))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.accountPercent == rhs.accountPercent)||((this.accountPercent!= null)&&this.accountPercent.equals(rhs.accountPercent))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
