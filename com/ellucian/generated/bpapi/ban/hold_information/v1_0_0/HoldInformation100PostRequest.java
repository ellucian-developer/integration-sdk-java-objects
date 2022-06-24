
package com.ellucian.generated.bpapi.ban.hold_information.v1_0_0;

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
    "hlddCode",
    "fromDate",
    "reason",
    "toDate",
    "releaseInd",
    "id",
    "amountOwed",
    "origCode"
})
@Generated("jsonschema2pojo")
public class HoldInformation100PostRequest {

    /**
     * Hold Type
     * <p>
     * Lineage reference object : SPRHOLD_HLDD_CODE, Lookup lineage reference object : stvhldd
     * (Required)
     * 
     */
    @JsonProperty("hlddCode")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_HLDD_CODE, Lookup lineage reference object : stvhldd")
    private String hlddCode;
    /**
     * From
     * <p>
     * Lineage reference object : SPRHOLD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_FROM_DATE")
    private Date fromDate;
    /**
     * Reason
     * <p>
     * Lineage reference object : SPRHOLD_REASON
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_REASON")
    private String reason;
    /**
     * To
     * <p>
     * Lineage reference object : SPRHOLD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_TO_DATE")
    private Date toDate;
    /**
     * Release Indicator
     * <p>
     * Lineage reference object : SPRHOLD_RELEASE_IND
     * 
     */
    @JsonProperty("releaseInd")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_RELEASE_IND")
    private String releaseInd;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Amount
     * <p>
     * Lineage reference object : SPRHOLD_AMOUNT_OWED
     * 
     */
    @JsonProperty("amountOwed")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_AMOUNT_OWED")
    private Double amountOwed;
    /**
     * Origination Code
     * <p>
     * Lineage reference object : SPRHOLD_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Hold Type
     * <p>
     * Lineage reference object : SPRHOLD_HLDD_CODE, Lookup lineage reference object : stvhldd
     * (Required)
     * 
     */
    @JsonProperty("hlddCode")
    public String getHlddCode() {
        return hlddCode;
    }

    /**
     * Hold Type
     * <p>
     * Lineage reference object : SPRHOLD_HLDD_CODE, Lookup lineage reference object : stvhldd
     * (Required)
     * 
     */
    @JsonProperty("hlddCode")
    public void setHlddCode(String hlddCode) {
        this.hlddCode = hlddCode;
    }

    public HoldInformation100PostRequest withHlddCode(String hlddCode) {
        this.hlddCode = hlddCode;
        return this;
    }

    /**
     * From
     * <p>
     * Lineage reference object : SPRHOLD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * From
     * <p>
     * Lineage reference object : SPRHOLD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public HoldInformation100PostRequest withFromDate(Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SPRHOLD_REASON
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SPRHOLD_REASON
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    public HoldInformation100PostRequest withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * To
     * <p>
     * Lineage reference object : SPRHOLD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    public Date getToDate() {
        return toDate;
    }

    /**
     * To
     * <p>
     * Lineage reference object : SPRHOLD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public HoldInformation100PostRequest withToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Release Indicator
     * <p>
     * Lineage reference object : SPRHOLD_RELEASE_IND
     * 
     */
    @JsonProperty("releaseInd")
    public String getReleaseInd() {
        return releaseInd;
    }

    /**
     * Release Indicator
     * <p>
     * Lineage reference object : SPRHOLD_RELEASE_IND
     * 
     */
    @JsonProperty("releaseInd")
    public void setReleaseInd(String releaseInd) {
        this.releaseInd = releaseInd;
    }

    public HoldInformation100PostRequest withReleaseInd(String releaseInd) {
        this.releaseInd = releaseInd;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public HoldInformation100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : SPRHOLD_AMOUNT_OWED
     * 
     */
    @JsonProperty("amountOwed")
    public Double getAmountOwed() {
        return amountOwed;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : SPRHOLD_AMOUNT_OWED
     * 
     */
    @JsonProperty("amountOwed")
    public void setAmountOwed(Double amountOwed) {
        this.amountOwed = amountOwed;
    }

    public HoldInformation100PostRequest withAmountOwed(Double amountOwed) {
        this.amountOwed = amountOwed;
        return this;
    }

    /**
     * Origination Code
     * <p>
     * Lineage reference object : SPRHOLD_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Origination Code
     * <p>
     * Lineage reference object : SPRHOLD_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public HoldInformation100PostRequest withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public HoldInformation100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HoldInformation100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hlddCode");
        sb.append('=');
        sb.append(((this.hlddCode == null)?"<null>":this.hlddCode));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("releaseInd");
        sb.append('=');
        sb.append(((this.releaseInd == null)?"<null>":this.releaseInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("amountOwed");
        sb.append('=');
        sb.append(((this.amountOwed == null)?"<null>":this.amountOwed));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
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
        result = ((result* 31)+((this.hlddCode == null)? 0 :this.hlddCode.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.releaseInd == null)? 0 :this.releaseInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.amountOwed == null)? 0 :this.amountOwed.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HoldInformation100PostRequest) == false) {
            return false;
        }
        HoldInformation100PostRequest rhs = ((HoldInformation100PostRequest) other);
        return ((((((((((this.hlddCode == rhs.hlddCode)||((this.hlddCode!= null)&&this.hlddCode.equals(rhs.hlddCode)))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.releaseInd == rhs.releaseInd)||((this.releaseInd!= null)&&this.releaseInd.equals(rhs.releaseInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.amountOwed == rhs.amountOwed)||((this.amountOwed!= null)&&this.amountOwed.equals(rhs.amountOwed))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))));
    }

}
