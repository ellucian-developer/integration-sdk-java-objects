
package com.ellucian.generated.bpapi.ban.vendor_history_query.v1_0_0;

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
    "favvhi5PaidCount",
    "favvhi5FsyrCode",
    "favvhi5OpenCount",
    "faavndhVendCode",
    "favvhi5CreditMemoAmt",
    "favvhi5OpenAmt",
    "favvhi5PaidAmt",
    "favvhi5CreditMemoCount"
})
@Generated("jsonschema2pojo")
public class VendorHistoryQuery100GetRequest {

    /**
     * Paid Invoices Number
     * <p>
     * Lineage reference object : FAVVHI5_PAID_COUNT
     * 
     */
    @JsonProperty("favvhi5PaidCount")
    @JsonPropertyDescription("Lineage reference object : FAVVHI5_PAID_COUNT")
    private Double favvhi5PaidCount;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FAVVHI5_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("favvhi5FsyrCode")
    @JsonPropertyDescription("Lineage reference object : FAVVHI5_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd")
    private String favvhi5FsyrCode;
    /**
     * Open Invoices Number
     * <p>
     * Lineage reference object : FAVVHI5_OPEN_COUNT
     * 
     */
    @JsonProperty("favvhi5OpenCount")
    @JsonPropertyDescription("Lineage reference object : FAVVHI5_OPEN_COUNT")
    private Double favvhi5OpenCount;
    /**
     * Vendor
     * <p>
     * Lineage reference object : faavndhVendCode, Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("faavndhVendCode")
    @JsonPropertyDescription("Lineage reference object : faavndhVendCode, Lookup lineage reference object : ftvvend")
    private Object faavndhVendCode;
    /**
     * Credit Memos Amount
     * <p>
     * Lineage reference object : FAVVHI5_CREDIT_MEMO_AMT
     * 
     */
    @JsonProperty("favvhi5CreditMemoAmt")
    @JsonPropertyDescription("Lineage reference object : FAVVHI5_CREDIT_MEMO_AMT")
    private Double favvhi5CreditMemoAmt;
    /**
     * Open Invoices Amount
     * <p>
     * Lineage reference object : FAVVHI5_OPEN_AMT
     * 
     */
    @JsonProperty("favvhi5OpenAmt")
    @JsonPropertyDescription("Lineage reference object : FAVVHI5_OPEN_AMT")
    private Double favvhi5OpenAmt;
    /**
     * Paid Invoices Amount
     * <p>
     * Lineage reference object : FAVVHI5_PAID_AMT
     * 
     */
    @JsonProperty("favvhi5PaidAmt")
    @JsonPropertyDescription("Lineage reference object : FAVVHI5_PAID_AMT")
    private Double favvhi5PaidAmt;
    /**
     * Credit Memos Number
     * <p>
     * Lineage reference object : FAVVHI5_CREDIT_MEMO_COUNT
     * 
     */
    @JsonProperty("favvhi5CreditMemoCount")
    @JsonPropertyDescription("Lineage reference object : FAVVHI5_CREDIT_MEMO_COUNT")
    private Double favvhi5CreditMemoCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Paid Invoices Number
     * <p>
     * Lineage reference object : FAVVHI5_PAID_COUNT
     * 
     */
    @JsonProperty("favvhi5PaidCount")
    public Double getFavvhi5PaidCount() {
        return favvhi5PaidCount;
    }

    /**
     * Paid Invoices Number
     * <p>
     * Lineage reference object : FAVVHI5_PAID_COUNT
     * 
     */
    @JsonProperty("favvhi5PaidCount")
    public void setFavvhi5PaidCount(Double favvhi5PaidCount) {
        this.favvhi5PaidCount = favvhi5PaidCount;
    }

    public VendorHistoryQuery100GetRequest withFavvhi5PaidCount(Double favvhi5PaidCount) {
        this.favvhi5PaidCount = favvhi5PaidCount;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FAVVHI5_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("favvhi5FsyrCode")
    public String getFavvhi5FsyrCode() {
        return favvhi5FsyrCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FAVVHI5_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("favvhi5FsyrCode")
    public void setFavvhi5FsyrCode(String favvhi5FsyrCode) {
        this.favvhi5FsyrCode = favvhi5FsyrCode;
    }

    public VendorHistoryQuery100GetRequest withFavvhi5FsyrCode(String favvhi5FsyrCode) {
        this.favvhi5FsyrCode = favvhi5FsyrCode;
        return this;
    }

    /**
     * Open Invoices Number
     * <p>
     * Lineage reference object : FAVVHI5_OPEN_COUNT
     * 
     */
    @JsonProperty("favvhi5OpenCount")
    public Double getFavvhi5OpenCount() {
        return favvhi5OpenCount;
    }

    /**
     * Open Invoices Number
     * <p>
     * Lineage reference object : FAVVHI5_OPEN_COUNT
     * 
     */
    @JsonProperty("favvhi5OpenCount")
    public void setFavvhi5OpenCount(Double favvhi5OpenCount) {
        this.favvhi5OpenCount = favvhi5OpenCount;
    }

    public VendorHistoryQuery100GetRequest withFavvhi5OpenCount(Double favvhi5OpenCount) {
        this.favvhi5OpenCount = favvhi5OpenCount;
        return this;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : faavndhVendCode, Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("faavndhVendCode")
    public Object getFaavndhVendCode() {
        return faavndhVendCode;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : faavndhVendCode, Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("faavndhVendCode")
    public void setFaavndhVendCode(Object faavndhVendCode) {
        this.faavndhVendCode = faavndhVendCode;
    }

    public VendorHistoryQuery100GetRequest withFaavndhVendCode(Object faavndhVendCode) {
        this.faavndhVendCode = faavndhVendCode;
        return this;
    }

    /**
     * Credit Memos Amount
     * <p>
     * Lineage reference object : FAVVHI5_CREDIT_MEMO_AMT
     * 
     */
    @JsonProperty("favvhi5CreditMemoAmt")
    public Double getFavvhi5CreditMemoAmt() {
        return favvhi5CreditMemoAmt;
    }

    /**
     * Credit Memos Amount
     * <p>
     * Lineage reference object : FAVVHI5_CREDIT_MEMO_AMT
     * 
     */
    @JsonProperty("favvhi5CreditMemoAmt")
    public void setFavvhi5CreditMemoAmt(Double favvhi5CreditMemoAmt) {
        this.favvhi5CreditMemoAmt = favvhi5CreditMemoAmt;
    }

    public VendorHistoryQuery100GetRequest withFavvhi5CreditMemoAmt(Double favvhi5CreditMemoAmt) {
        this.favvhi5CreditMemoAmt = favvhi5CreditMemoAmt;
        return this;
    }

    /**
     * Open Invoices Amount
     * <p>
     * Lineage reference object : FAVVHI5_OPEN_AMT
     * 
     */
    @JsonProperty("favvhi5OpenAmt")
    public Double getFavvhi5OpenAmt() {
        return favvhi5OpenAmt;
    }

    /**
     * Open Invoices Amount
     * <p>
     * Lineage reference object : FAVVHI5_OPEN_AMT
     * 
     */
    @JsonProperty("favvhi5OpenAmt")
    public void setFavvhi5OpenAmt(Double favvhi5OpenAmt) {
        this.favvhi5OpenAmt = favvhi5OpenAmt;
    }

    public VendorHistoryQuery100GetRequest withFavvhi5OpenAmt(Double favvhi5OpenAmt) {
        this.favvhi5OpenAmt = favvhi5OpenAmt;
        return this;
    }

    /**
     * Paid Invoices Amount
     * <p>
     * Lineage reference object : FAVVHI5_PAID_AMT
     * 
     */
    @JsonProperty("favvhi5PaidAmt")
    public Double getFavvhi5PaidAmt() {
        return favvhi5PaidAmt;
    }

    /**
     * Paid Invoices Amount
     * <p>
     * Lineage reference object : FAVVHI5_PAID_AMT
     * 
     */
    @JsonProperty("favvhi5PaidAmt")
    public void setFavvhi5PaidAmt(Double favvhi5PaidAmt) {
        this.favvhi5PaidAmt = favvhi5PaidAmt;
    }

    public VendorHistoryQuery100GetRequest withFavvhi5PaidAmt(Double favvhi5PaidAmt) {
        this.favvhi5PaidAmt = favvhi5PaidAmt;
        return this;
    }

    /**
     * Credit Memos Number
     * <p>
     * Lineage reference object : FAVVHI5_CREDIT_MEMO_COUNT
     * 
     */
    @JsonProperty("favvhi5CreditMemoCount")
    public Double getFavvhi5CreditMemoCount() {
        return favvhi5CreditMemoCount;
    }

    /**
     * Credit Memos Number
     * <p>
     * Lineage reference object : FAVVHI5_CREDIT_MEMO_COUNT
     * 
     */
    @JsonProperty("favvhi5CreditMemoCount")
    public void setFavvhi5CreditMemoCount(Double favvhi5CreditMemoCount) {
        this.favvhi5CreditMemoCount = favvhi5CreditMemoCount;
    }

    public VendorHistoryQuery100GetRequest withFavvhi5CreditMemoCount(Double favvhi5CreditMemoCount) {
        this.favvhi5CreditMemoCount = favvhi5CreditMemoCount;
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

    public VendorHistoryQuery100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorHistoryQuery100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("favvhi5PaidCount");
        sb.append('=');
        sb.append(((this.favvhi5PaidCount == null)?"<null>":this.favvhi5PaidCount));
        sb.append(',');
        sb.append("favvhi5FsyrCode");
        sb.append('=');
        sb.append(((this.favvhi5FsyrCode == null)?"<null>":this.favvhi5FsyrCode));
        sb.append(',');
        sb.append("favvhi5OpenCount");
        sb.append('=');
        sb.append(((this.favvhi5OpenCount == null)?"<null>":this.favvhi5OpenCount));
        sb.append(',');
        sb.append("faavndhVendCode");
        sb.append('=');
        sb.append(((this.faavndhVendCode == null)?"<null>":this.faavndhVendCode));
        sb.append(',');
        sb.append("favvhi5CreditMemoAmt");
        sb.append('=');
        sb.append(((this.favvhi5CreditMemoAmt == null)?"<null>":this.favvhi5CreditMemoAmt));
        sb.append(',');
        sb.append("favvhi5OpenAmt");
        sb.append('=');
        sb.append(((this.favvhi5OpenAmt == null)?"<null>":this.favvhi5OpenAmt));
        sb.append(',');
        sb.append("favvhi5PaidAmt");
        sb.append('=');
        sb.append(((this.favvhi5PaidAmt == null)?"<null>":this.favvhi5PaidAmt));
        sb.append(',');
        sb.append("favvhi5CreditMemoCount");
        sb.append('=');
        sb.append(((this.favvhi5CreditMemoCount == null)?"<null>":this.favvhi5CreditMemoCount));
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
        result = ((result* 31)+((this.favvhi5PaidCount == null)? 0 :this.favvhi5PaidCount.hashCode()));
        result = ((result* 31)+((this.favvhi5FsyrCode == null)? 0 :this.favvhi5FsyrCode.hashCode()));
        result = ((result* 31)+((this.favvhi5OpenCount == null)? 0 :this.favvhi5OpenCount.hashCode()));
        result = ((result* 31)+((this.faavndhVendCode == null)? 0 :this.faavndhVendCode.hashCode()));
        result = ((result* 31)+((this.favvhi5CreditMemoAmt == null)? 0 :this.favvhi5CreditMemoAmt.hashCode()));
        result = ((result* 31)+((this.favvhi5OpenAmt == null)? 0 :this.favvhi5OpenAmt.hashCode()));
        result = ((result* 31)+((this.favvhi5PaidAmt == null)? 0 :this.favvhi5PaidAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.favvhi5CreditMemoCount == null)? 0 :this.favvhi5CreditMemoCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorHistoryQuery100GetRequest) == false) {
            return false;
        }
        VendorHistoryQuery100GetRequest rhs = ((VendorHistoryQuery100GetRequest) other);
        return ((((((((((this.favvhi5PaidCount == rhs.favvhi5PaidCount)||((this.favvhi5PaidCount!= null)&&this.favvhi5PaidCount.equals(rhs.favvhi5PaidCount)))&&((this.favvhi5FsyrCode == rhs.favvhi5FsyrCode)||((this.favvhi5FsyrCode!= null)&&this.favvhi5FsyrCode.equals(rhs.favvhi5FsyrCode))))&&((this.favvhi5OpenCount == rhs.favvhi5OpenCount)||((this.favvhi5OpenCount!= null)&&this.favvhi5OpenCount.equals(rhs.favvhi5OpenCount))))&&((this.faavndhVendCode == rhs.faavndhVendCode)||((this.faavndhVendCode!= null)&&this.faavndhVendCode.equals(rhs.faavndhVendCode))))&&((this.favvhi5CreditMemoAmt == rhs.favvhi5CreditMemoAmt)||((this.favvhi5CreditMemoAmt!= null)&&this.favvhi5CreditMemoAmt.equals(rhs.favvhi5CreditMemoAmt))))&&((this.favvhi5OpenAmt == rhs.favvhi5OpenAmt)||((this.favvhi5OpenAmt!= null)&&this.favvhi5OpenAmt.equals(rhs.favvhi5OpenAmt))))&&((this.favvhi5PaidAmt == rhs.favvhi5PaidAmt)||((this.favvhi5PaidAmt!= null)&&this.favvhi5PaidAmt.equals(rhs.favvhi5PaidAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.favvhi5CreditMemoCount == rhs.favvhi5CreditMemoCount)||((this.favvhi5CreditMemoCount!= null)&&this.favvhi5CreditMemoCount.equals(rhs.favvhi5CreditMemoCount))));
    }

}
