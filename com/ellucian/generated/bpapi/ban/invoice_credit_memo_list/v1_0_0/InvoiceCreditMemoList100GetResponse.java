
package com.ellucian.generated.bpapi.ban.invoice_credit_memo_list.v1_0_0;

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
    "apprInd",
    "pohdCode",
    "vendHoldRsnCode",
    "completeInd",
    "vendorName",
    "vendId",
    "crMemoInd",
    "invoiceAmt"
})
@Generated("jsonschema2pojo")
public class InvoiceCreditMemoList100GetResponse {

    /**
     * Invoice
     * <p>
     * Lineage reference object : FAVINVQ_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FAVINVQ_CODE")
    private String code;
    /**
     * Approved
     * <p>
     * Lineage reference object : FAVINVQ_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    @JsonPropertyDescription("Lineage reference object : FAVINVQ_APPR_IND")
    private String apprInd;
    /**
     * Purchase Order/Encumbrance
     * <p>
     * Lineage reference object : FAVINVQ_POHD_CODE
     * 
     */
    @JsonProperty("pohdCode")
    @JsonPropertyDescription("Lineage reference object : FAVINVQ_POHD_CODE")
    private String pohdCode;
    /**
     * Vendor Hold
     * <p>
     * Lineage reference object : FAVINVQ_VEND_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("vendHoldRsnCode")
    @JsonPropertyDescription("Lineage reference object : FAVINVQ_VEND_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn")
    private String vendHoldRsnCode;
    /**
     * Completed
     * <p>
     * Lineage reference object : FAVINVQ_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    @JsonPropertyDescription("Lineage reference object : FAVINVQ_COMPLETE_IND")
    private String completeInd;
    /**
     * Vendor Name
     * <p>
     * Lineage reference object : FAVINVQ_VENDOR_NAME
     * 
     */
    @JsonProperty("vendorName")
    @JsonPropertyDescription("Lineage reference object : FAVINVQ_VENDOR_NAME")
    private String vendorName;
    /**
     * Vendor ID
     * <p>
     * Lineage reference object : FAVINVQ_VEND_ID
     * 
     */
    @JsonProperty("vendId")
    @JsonPropertyDescription("Lineage reference object : FAVINVQ_VEND_ID")
    private String vendId;
    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FAVINVQ_CR_MEMO_IND
     * 
     */
    @JsonProperty("crMemoInd")
    @JsonPropertyDescription("Lineage reference object : FAVINVQ_CR_MEMO_IND")
    private String crMemoInd;
    /**
     * Invoice Total
     * <p>
     * Lineage reference object : FAVINVQ_INVOICE_AMT
     * 
     */
    @JsonProperty("invoiceAmt")
    @JsonPropertyDescription("Lineage reference object : FAVINVQ_INVOICE_AMT")
    private Double invoiceAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Invoice
     * <p>
     * Lineage reference object : FAVINVQ_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Invoice
     * <p>
     * Lineage reference object : FAVINVQ_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public InvoiceCreditMemoList100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Approved
     * <p>
     * Lineage reference object : FAVINVQ_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public String getApprInd() {
        return apprInd;
    }

    /**
     * Approved
     * <p>
     * Lineage reference object : FAVINVQ_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public void setApprInd(String apprInd) {
        this.apprInd = apprInd;
    }

    public InvoiceCreditMemoList100GetResponse withApprInd(String apprInd) {
        this.apprInd = apprInd;
        return this;
    }

    /**
     * Purchase Order/Encumbrance
     * <p>
     * Lineage reference object : FAVINVQ_POHD_CODE
     * 
     */
    @JsonProperty("pohdCode")
    public String getPohdCode() {
        return pohdCode;
    }

    /**
     * Purchase Order/Encumbrance
     * <p>
     * Lineage reference object : FAVINVQ_POHD_CODE
     * 
     */
    @JsonProperty("pohdCode")
    public void setPohdCode(String pohdCode) {
        this.pohdCode = pohdCode;
    }

    public InvoiceCreditMemoList100GetResponse withPohdCode(String pohdCode) {
        this.pohdCode = pohdCode;
        return this;
    }

    /**
     * Vendor Hold
     * <p>
     * Lineage reference object : FAVINVQ_VEND_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("vendHoldRsnCode")
    public String getVendHoldRsnCode() {
        return vendHoldRsnCode;
    }

    /**
     * Vendor Hold
     * <p>
     * Lineage reference object : FAVINVQ_VEND_HOLD_RSN_CODE, Lookup lineage reference object : ftvhrsn
     * 
     */
    @JsonProperty("vendHoldRsnCode")
    public void setVendHoldRsnCode(String vendHoldRsnCode) {
        this.vendHoldRsnCode = vendHoldRsnCode;
    }

    public InvoiceCreditMemoList100GetResponse withVendHoldRsnCode(String vendHoldRsnCode) {
        this.vendHoldRsnCode = vendHoldRsnCode;
        return this;
    }

    /**
     * Completed
     * <p>
     * Lineage reference object : FAVINVQ_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    public String getCompleteInd() {
        return completeInd;
    }

    /**
     * Completed
     * <p>
     * Lineage reference object : FAVINVQ_COMPLETE_IND
     * 
     */
    @JsonProperty("completeInd")
    public void setCompleteInd(String completeInd) {
        this.completeInd = completeInd;
    }

    public InvoiceCreditMemoList100GetResponse withCompleteInd(String completeInd) {
        this.completeInd = completeInd;
        return this;
    }

    /**
     * Vendor Name
     * <p>
     * Lineage reference object : FAVINVQ_VENDOR_NAME
     * 
     */
    @JsonProperty("vendorName")
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Vendor Name
     * <p>
     * Lineage reference object : FAVINVQ_VENDOR_NAME
     * 
     */
    @JsonProperty("vendorName")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public InvoiceCreditMemoList100GetResponse withVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    /**
     * Vendor ID
     * <p>
     * Lineage reference object : FAVINVQ_VEND_ID
     * 
     */
    @JsonProperty("vendId")
    public String getVendId() {
        return vendId;
    }

    /**
     * Vendor ID
     * <p>
     * Lineage reference object : FAVINVQ_VEND_ID
     * 
     */
    @JsonProperty("vendId")
    public void setVendId(String vendId) {
        this.vendId = vendId;
    }

    public InvoiceCreditMemoList100GetResponse withVendId(String vendId) {
        this.vendId = vendId;
        return this;
    }

    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FAVINVQ_CR_MEMO_IND
     * 
     */
    @JsonProperty("crMemoInd")
    public String getCrMemoInd() {
        return crMemoInd;
    }

    /**
     * Credit Memo
     * <p>
     * Lineage reference object : FAVINVQ_CR_MEMO_IND
     * 
     */
    @JsonProperty("crMemoInd")
    public void setCrMemoInd(String crMemoInd) {
        this.crMemoInd = crMemoInd;
    }

    public InvoiceCreditMemoList100GetResponse withCrMemoInd(String crMemoInd) {
        this.crMemoInd = crMemoInd;
        return this;
    }

    /**
     * Invoice Total
     * <p>
     * Lineage reference object : FAVINVQ_INVOICE_AMT
     * 
     */
    @JsonProperty("invoiceAmt")
    public Double getInvoiceAmt() {
        return invoiceAmt;
    }

    /**
     * Invoice Total
     * <p>
     * Lineage reference object : FAVINVQ_INVOICE_AMT
     * 
     */
    @JsonProperty("invoiceAmt")
    public void setInvoiceAmt(Double invoiceAmt) {
        this.invoiceAmt = invoiceAmt;
    }

    public InvoiceCreditMemoList100GetResponse withInvoiceAmt(Double invoiceAmt) {
        this.invoiceAmt = invoiceAmt;
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

    public InvoiceCreditMemoList100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InvoiceCreditMemoList100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("apprInd");
        sb.append('=');
        sb.append(((this.apprInd == null)?"<null>":this.apprInd));
        sb.append(',');
        sb.append("pohdCode");
        sb.append('=');
        sb.append(((this.pohdCode == null)?"<null>":this.pohdCode));
        sb.append(',');
        sb.append("vendHoldRsnCode");
        sb.append('=');
        sb.append(((this.vendHoldRsnCode == null)?"<null>":this.vendHoldRsnCode));
        sb.append(',');
        sb.append("completeInd");
        sb.append('=');
        sb.append(((this.completeInd == null)?"<null>":this.completeInd));
        sb.append(',');
        sb.append("vendorName");
        sb.append('=');
        sb.append(((this.vendorName == null)?"<null>":this.vendorName));
        sb.append(',');
        sb.append("vendId");
        sb.append('=');
        sb.append(((this.vendId == null)?"<null>":this.vendId));
        sb.append(',');
        sb.append("crMemoInd");
        sb.append('=');
        sb.append(((this.crMemoInd == null)?"<null>":this.crMemoInd));
        sb.append(',');
        sb.append("invoiceAmt");
        sb.append('=');
        sb.append(((this.invoiceAmt == null)?"<null>":this.invoiceAmt));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.apprInd == null)? 0 :this.apprInd.hashCode()));
        result = ((result* 31)+((this.pohdCode == null)? 0 :this.pohdCode.hashCode()));
        result = ((result* 31)+((this.vendHoldRsnCode == null)? 0 :this.vendHoldRsnCode.hashCode()));
        result = ((result* 31)+((this.completeInd == null)? 0 :this.completeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vendorName == null)? 0 :this.vendorName.hashCode()));
        result = ((result* 31)+((this.vendId == null)? 0 :this.vendId.hashCode()));
        result = ((result* 31)+((this.crMemoInd == null)? 0 :this.crMemoInd.hashCode()));
        result = ((result* 31)+((this.invoiceAmt == null)? 0 :this.invoiceAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InvoiceCreditMemoList100GetResponse) == false) {
            return false;
        }
        InvoiceCreditMemoList100GetResponse rhs = ((InvoiceCreditMemoList100GetResponse) other);
        return (((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.apprInd == rhs.apprInd)||((this.apprInd!= null)&&this.apprInd.equals(rhs.apprInd))))&&((this.pohdCode == rhs.pohdCode)||((this.pohdCode!= null)&&this.pohdCode.equals(rhs.pohdCode))))&&((this.vendHoldRsnCode == rhs.vendHoldRsnCode)||((this.vendHoldRsnCode!= null)&&this.vendHoldRsnCode.equals(rhs.vendHoldRsnCode))))&&((this.completeInd == rhs.completeInd)||((this.completeInd!= null)&&this.completeInd.equals(rhs.completeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vendorName == rhs.vendorName)||((this.vendorName!= null)&&this.vendorName.equals(rhs.vendorName))))&&((this.vendId == rhs.vendId)||((this.vendId!= null)&&this.vendId.equals(rhs.vendId))))&&((this.crMemoInd == rhs.crMemoInd)||((this.crMemoInd!= null)&&this.crMemoInd.equals(rhs.crMemoInd))))&&((this.invoiceAmt == rhs.invoiceAmt)||((this.invoiceAmt!= null)&&this.invoiceAmt.equals(rhs.invoiceAmt))));
    }

}
