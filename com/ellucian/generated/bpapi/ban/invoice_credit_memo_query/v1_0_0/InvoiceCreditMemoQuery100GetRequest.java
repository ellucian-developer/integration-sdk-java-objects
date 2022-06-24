
package com.ellucian.generated.bpapi.ban.invoice_credit_memo_query.v1_0_0;

import java.util.Date;
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
    "faainvhDocCode",
    "headerTextInd",
    "activityDate",
    "addrLine4",
    "matchDescription",
    "invoiceChoiceDesc",
    "houseNumber",
    "iatInd",
    "userId",
    "achtCode"
})
@Generated("jsonschema2pojo")
public class InvoiceCreditMemoQuery100GetRequest {

    /**
     * Document
     * <p>
     * Lineage reference object : faainvhDocCode
     * (Required)
     * 
     */
    @JsonProperty("faainvhDocCode")
    @JsonPropertyDescription("Lineage reference object : faainvhDocCode")
    private String faainvhDocCode;
    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("headerTextInd")
    private String headerTextInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine4")
    private String addrLine4;
    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchDescription")
    private String matchDescription;
    /**
     * Lineage reference object : invoiceChoiceDesc
     * 
     */
    @JsonProperty("invoiceChoiceDesc")
    @JsonPropertyDescription("Lineage reference object : invoiceChoiceDesc")
    private String invoiceChoiceDesc;
    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("houseNumber")
    private String houseNumber;
    /**
     * IAT
     * <p>
     * 
     * 
     */
    @JsonProperty("iatInd")
    private String iatInd;
    /**
     * User ID
     * <p>
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : FABINVH_USER_ID")
    private String userId;
    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    @JsonPropertyDescription("Lineage reference object : FABINVH_ACHT_CODE")
    private String achtCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Document
     * <p>
     * Lineage reference object : faainvhDocCode
     * (Required)
     * 
     */
    @JsonProperty("faainvhDocCode")
    public String getFaainvhDocCode() {
        return faainvhDocCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : faainvhDocCode
     * (Required)
     * 
     */
    @JsonProperty("faainvhDocCode")
    public void setFaainvhDocCode(String faainvhDocCode) {
        this.faainvhDocCode = faainvhDocCode;
    }

    public InvoiceCreditMemoQuery100GetRequest withFaainvhDocCode(String faainvhDocCode) {
        this.faainvhDocCode = faainvhDocCode;
        return this;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("headerTextInd")
    public String getHeaderTextInd() {
        return headerTextInd;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("headerTextInd")
    public void setHeaderTextInd(String headerTextInd) {
        this.headerTextInd = headerTextInd;
    }

    public InvoiceCreditMemoQuery100GetRequest withHeaderTextInd(String headerTextInd) {
        this.headerTextInd = headerTextInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FABINVH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public InvoiceCreditMemoQuery100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine4")
    public String getAddrLine4() {
        return addrLine4;
    }

    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("addrLine4")
    public void setAddrLine4(String addrLine4) {
        this.addrLine4 = addrLine4;
    }

    public InvoiceCreditMemoQuery100GetRequest withAddrLine4(String addrLine4) {
        this.addrLine4 = addrLine4;
        return this;
    }

    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchDescription")
    public String getMatchDescription() {
        return matchDescription;
    }

    /**
     * Receipt Required
     * <p>
     * 
     * 
     */
    @JsonProperty("matchDescription")
    public void setMatchDescription(String matchDescription) {
        this.matchDescription = matchDescription;
    }

    public InvoiceCreditMemoQuery100GetRequest withMatchDescription(String matchDescription) {
        this.matchDescription = matchDescription;
        return this;
    }

    /**
     * Lineage reference object : invoiceChoiceDesc
     * 
     */
    @JsonProperty("invoiceChoiceDesc")
    public String getInvoiceChoiceDesc() {
        return invoiceChoiceDesc;
    }

    /**
     * Lineage reference object : invoiceChoiceDesc
     * 
     */
    @JsonProperty("invoiceChoiceDesc")
    public void setInvoiceChoiceDesc(String invoiceChoiceDesc) {
        this.invoiceChoiceDesc = invoiceChoiceDesc;
    }

    public InvoiceCreditMemoQuery100GetRequest withInvoiceChoiceDesc(String invoiceChoiceDesc) {
        this.invoiceChoiceDesc = invoiceChoiceDesc;
        return this;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public InvoiceCreditMemoQuery100GetRequest withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * IAT
     * <p>
     * 
     * 
     */
    @JsonProperty("iatInd")
    public String getIatInd() {
        return iatInd;
    }

    /**
     * IAT
     * <p>
     * 
     * 
     */
    @JsonProperty("iatInd")
    public void setIatInd(String iatInd) {
        this.iatInd = iatInd;
    }

    public InvoiceCreditMemoQuery100GetRequest withIatInd(String iatInd) {
        this.iatInd = iatInd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FABINVH_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public InvoiceCreditMemoQuery100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    public String getAchtCode() {
        return achtCode;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : FABINVH_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    public void setAchtCode(String achtCode) {
        this.achtCode = achtCode;
    }

    public InvoiceCreditMemoQuery100GetRequest withAchtCode(String achtCode) {
        this.achtCode = achtCode;
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

    public InvoiceCreditMemoQuery100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InvoiceCreditMemoQuery100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("faainvhDocCode");
        sb.append('=');
        sb.append(((this.faainvhDocCode == null)?"<null>":this.faainvhDocCode));
        sb.append(',');
        sb.append("headerTextInd");
        sb.append('=');
        sb.append(((this.headerTextInd == null)?"<null>":this.headerTextInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("addrLine4");
        sb.append('=');
        sb.append(((this.addrLine4 == null)?"<null>":this.addrLine4));
        sb.append(',');
        sb.append("matchDescription");
        sb.append('=');
        sb.append(((this.matchDescription == null)?"<null>":this.matchDescription));
        sb.append(',');
        sb.append("invoiceChoiceDesc");
        sb.append('=');
        sb.append(((this.invoiceChoiceDesc == null)?"<null>":this.invoiceChoiceDesc));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
        sb.append(',');
        sb.append("iatInd");
        sb.append('=');
        sb.append(((this.iatInd == null)?"<null>":this.iatInd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("achtCode");
        sb.append('=');
        sb.append(((this.achtCode == null)?"<null>":this.achtCode));
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
        result = ((result* 31)+((this.faainvhDocCode == null)? 0 :this.faainvhDocCode.hashCode()));
        result = ((result* 31)+((this.headerTextInd == null)? 0 :this.headerTextInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.addrLine4 == null)? 0 :this.addrLine4 .hashCode()));
        result = ((result* 31)+((this.matchDescription == null)? 0 :this.matchDescription.hashCode()));
        result = ((result* 31)+((this.invoiceChoiceDesc == null)? 0 :this.invoiceChoiceDesc.hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.iatInd == null)? 0 :this.iatInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.achtCode == null)? 0 :this.achtCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InvoiceCreditMemoQuery100GetRequest) == false) {
            return false;
        }
        InvoiceCreditMemoQuery100GetRequest rhs = ((InvoiceCreditMemoQuery100GetRequest) other);
        return ((((((((((((this.faainvhDocCode == rhs.faainvhDocCode)||((this.faainvhDocCode!= null)&&this.faainvhDocCode.equals(rhs.faainvhDocCode)))&&((this.headerTextInd == rhs.headerTextInd)||((this.headerTextInd!= null)&&this.headerTextInd.equals(rhs.headerTextInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.addrLine4 == rhs.addrLine4)||((this.addrLine4 != null)&&this.addrLine4 .equals(rhs.addrLine4))))&&((this.matchDescription == rhs.matchDescription)||((this.matchDescription!= null)&&this.matchDescription.equals(rhs.matchDescription))))&&((this.invoiceChoiceDesc == rhs.invoiceChoiceDesc)||((this.invoiceChoiceDesc!= null)&&this.invoiceChoiceDesc.equals(rhs.invoiceChoiceDesc))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.iatInd == rhs.iatInd)||((this.iatInd!= null)&&this.iatInd.equals(rhs.iatInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.achtCode == rhs.achtCode)||((this.achtCode!= null)&&this.achtCode.equals(rhs.achtCode))));
    }

}
