
package com.ellucian.generated.bpapi.ban.finance_account_reviews.v1_0_0;

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
    "colcId",
    "billCode",
    "id"
})
@Generated("jsonschema2pojo")
public class FinanceAccountReviews100PostRequest {

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("colcId")
    private String colcId;
    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill")
    private String billCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("colcId")
    public String getColcId() {
        return colcId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("colcId")
    public void setColcId(String colcId) {
        this.colcId = colcId;
    }

    public FinanceAccountReviews100PostRequest withColcId(String colcId) {
        this.colcId = colcId;
        return this;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    public String getBillCode() {
        return billCode;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public FinanceAccountReviews100PostRequest withBillCode(String billCode) {
        this.billCode = billCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public FinanceAccountReviews100PostRequest withId(Object id) {
        this.id = id;
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

    public FinanceAccountReviews100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceAccountReviews100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("colcId");
        sb.append('=');
        sb.append(((this.colcId == null)?"<null>":this.colcId));
        sb.append(',');
        sb.append("billCode");
        sb.append('=');
        sb.append(((this.billCode == null)?"<null>":this.billCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.colcId == null)? 0 :this.colcId.hashCode()));
        result = ((result* 31)+((this.billCode == null)? 0 :this.billCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceAccountReviews100PostRequest) == false) {
            return false;
        }
        FinanceAccountReviews100PostRequest rhs = ((FinanceAccountReviews100PostRequest) other);
        return (((((this.colcId == rhs.colcId)||((this.colcId!= null)&&this.colcId.equals(rhs.colcId)))&&((this.billCode == rhs.billCode)||((this.billCode!= null)&&this.billCode.equals(rhs.billCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
