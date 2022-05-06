
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
    "criteria.fromDate",
    "reason",
    "criteria.reason",
    "criteria.toDate",
    "criteria.origCode",
    "criteria.amountOwed",
    "toDate",
    "releaseInd",
    "criteria.releaseInd",
    "amountOwed",
    "origCode",
    "hlddCode",
    "fromDate",
    "id",
    "criteria.hlddCode"
})
@Generated("jsonschema2pojo")
public class HoldInformation100PutRequest {

    /**
     * From
     * <p>
     * Lineage reference object : SPRHOLD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fromDate")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_FROM_DATE")
    private Date criteriaFromDate;
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
     * Reason
     * <p>
     * Lineage reference object : SPRHOLD_REASON
     * 
     */
    @JsonProperty("criteria.reason")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_REASON")
    private String criteriaReason;
    /**
     * To
     * <p>
     * Lineage reference object : SPRHOLD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.toDate")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_TO_DATE")
    private Date criteriaToDate;
    /**
     * Origination Code
     * <p>
     * Lineage reference object : SPRHOLD_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String criteriaOrigCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : SPRHOLD_AMOUNT_OWED
     * 
     */
    @JsonProperty("criteria.amountOwed")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_AMOUNT_OWED")
    private Double criteriaAmountOwed;
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
     * Release Indicator
     * <p>
     * Lineage reference object : SPRHOLD_RELEASE_IND
     * 
     */
    @JsonProperty("criteria.releaseInd")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_RELEASE_IND")
    private String criteriaReleaseInd;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Hold Type
     * <p>
     * Lineage reference object : SPRHOLD_HLDD_CODE, Lookup lineage reference object : stvhldd
     * (Required)
     * 
     */
    @JsonProperty("criteria.hlddCode")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_HLDD_CODE, Lookup lineage reference object : stvhldd")
    private String criteriaHlddCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * From
     * <p>
     * Lineage reference object : SPRHOLD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fromDate")
    public Date getCriteriaFromDate() {
        return criteriaFromDate;
    }

    /**
     * From
     * <p>
     * Lineage reference object : SPRHOLD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fromDate")
    public void setCriteriaFromDate(Date criteriaFromDate) {
        this.criteriaFromDate = criteriaFromDate;
    }

    public HoldInformation100PutRequest withCriteriaFromDate(Date criteriaFromDate) {
        this.criteriaFromDate = criteriaFromDate;
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

    public HoldInformation100PutRequest withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SPRHOLD_REASON
     * 
     */
    @JsonProperty("criteria.reason")
    public String getCriteriaReason() {
        return criteriaReason;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SPRHOLD_REASON
     * 
     */
    @JsonProperty("criteria.reason")
    public void setCriteriaReason(String criteriaReason) {
        this.criteriaReason = criteriaReason;
    }

    public HoldInformation100PutRequest withCriteriaReason(String criteriaReason) {
        this.criteriaReason = criteriaReason;
        return this;
    }

    /**
     * To
     * <p>
     * Lineage reference object : SPRHOLD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.toDate")
    public Date getCriteriaToDate() {
        return criteriaToDate;
    }

    /**
     * To
     * <p>
     * Lineage reference object : SPRHOLD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.toDate")
    public void setCriteriaToDate(Date criteriaToDate) {
        this.criteriaToDate = criteriaToDate;
    }

    public HoldInformation100PutRequest withCriteriaToDate(Date criteriaToDate) {
        this.criteriaToDate = criteriaToDate;
        return this;
    }

    /**
     * Origination Code
     * <p>
     * Lineage reference object : SPRHOLD_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public String getCriteriaOrigCode() {
        return criteriaOrigCode;
    }

    /**
     * Origination Code
     * <p>
     * Lineage reference object : SPRHOLD_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public void setCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
    }

    public HoldInformation100PutRequest withCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : SPRHOLD_AMOUNT_OWED
     * 
     */
    @JsonProperty("criteria.amountOwed")
    public Double getCriteriaAmountOwed() {
        return criteriaAmountOwed;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : SPRHOLD_AMOUNT_OWED
     * 
     */
    @JsonProperty("criteria.amountOwed")
    public void setCriteriaAmountOwed(Double criteriaAmountOwed) {
        this.criteriaAmountOwed = criteriaAmountOwed;
    }

    public HoldInformation100PutRequest withCriteriaAmountOwed(Double criteriaAmountOwed) {
        this.criteriaAmountOwed = criteriaAmountOwed;
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

    public HoldInformation100PutRequest withToDate(Date toDate) {
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

    public HoldInformation100PutRequest withReleaseInd(String releaseInd) {
        this.releaseInd = releaseInd;
        return this;
    }

    /**
     * Release Indicator
     * <p>
     * Lineage reference object : SPRHOLD_RELEASE_IND
     * 
     */
    @JsonProperty("criteria.releaseInd")
    public String getCriteriaReleaseInd() {
        return criteriaReleaseInd;
    }

    /**
     * Release Indicator
     * <p>
     * Lineage reference object : SPRHOLD_RELEASE_IND
     * 
     */
    @JsonProperty("criteria.releaseInd")
    public void setCriteriaReleaseInd(String criteriaReleaseInd) {
        this.criteriaReleaseInd = criteriaReleaseInd;
    }

    public HoldInformation100PutRequest withCriteriaReleaseInd(String criteriaReleaseInd) {
        this.criteriaReleaseInd = criteriaReleaseInd;
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

    public HoldInformation100PutRequest withAmountOwed(Double amountOwed) {
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

    public HoldInformation100PutRequest withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

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

    public HoldInformation100PutRequest withHlddCode(String hlddCode) {
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

    public HoldInformation100PutRequest withFromDate(Date fromDate) {
        this.fromDate = fromDate;
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

    public HoldInformation100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Hold Type
     * <p>
     * Lineage reference object : SPRHOLD_HLDD_CODE, Lookup lineage reference object : stvhldd
     * (Required)
     * 
     */
    @JsonProperty("criteria.hlddCode")
    public String getCriteriaHlddCode() {
        return criteriaHlddCode;
    }

    /**
     * Hold Type
     * <p>
     * Lineage reference object : SPRHOLD_HLDD_CODE, Lookup lineage reference object : stvhldd
     * (Required)
     * 
     */
    @JsonProperty("criteria.hlddCode")
    public void setCriteriaHlddCode(String criteriaHlddCode) {
        this.criteriaHlddCode = criteriaHlddCode;
    }

    public HoldInformation100PutRequest withCriteriaHlddCode(String criteriaHlddCode) {
        this.criteriaHlddCode = criteriaHlddCode;
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

    public HoldInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HoldInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaFromDate");
        sb.append('=');
        sb.append(((this.criteriaFromDate == null)?"<null>":this.criteriaFromDate));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("criteriaReason");
        sb.append('=');
        sb.append(((this.criteriaReason == null)?"<null>":this.criteriaReason));
        sb.append(',');
        sb.append("criteriaToDate");
        sb.append('=');
        sb.append(((this.criteriaToDate == null)?"<null>":this.criteriaToDate));
        sb.append(',');
        sb.append("criteriaOrigCode");
        sb.append('=');
        sb.append(((this.criteriaOrigCode == null)?"<null>":this.criteriaOrigCode));
        sb.append(',');
        sb.append("criteriaAmountOwed");
        sb.append('=');
        sb.append(((this.criteriaAmountOwed == null)?"<null>":this.criteriaAmountOwed));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("releaseInd");
        sb.append('=');
        sb.append(((this.releaseInd == null)?"<null>":this.releaseInd));
        sb.append(',');
        sb.append("criteriaReleaseInd");
        sb.append('=');
        sb.append(((this.criteriaReleaseInd == null)?"<null>":this.criteriaReleaseInd));
        sb.append(',');
        sb.append("amountOwed");
        sb.append('=');
        sb.append(((this.amountOwed == null)?"<null>":this.amountOwed));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("hlddCode");
        sb.append('=');
        sb.append(((this.hlddCode == null)?"<null>":this.hlddCode));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaHlddCode");
        sb.append('=');
        sb.append(((this.criteriaHlddCode == null)?"<null>":this.criteriaHlddCode));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.criteriaFromDate == null)? 0 :this.criteriaFromDate.hashCode()));
        result = ((result* 31)+((this.criteriaOrigCode == null)? 0 :this.criteriaOrigCode.hashCode()));
        result = ((result* 31)+((this.criteriaReleaseInd == null)? 0 :this.criteriaReleaseInd.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.releaseInd == null)? 0 :this.releaseInd.hashCode()));
        result = ((result* 31)+((this.amountOwed == null)? 0 :this.amountOwed.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.hlddCode == null)? 0 :this.hlddCode.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.criteriaAmountOwed == null)? 0 :this.criteriaAmountOwed.hashCode()));
        result = ((result* 31)+((this.criteriaReason == null)? 0 :this.criteriaReason.hashCode()));
        result = ((result* 31)+((this.criteriaToDate == null)? 0 :this.criteriaToDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaHlddCode == null)? 0 :this.criteriaHlddCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HoldInformation100PutRequest) == false) {
            return false;
        }
        HoldInformation100PutRequest rhs = ((HoldInformation100PutRequest) other);
        return (((((((((((((((((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.criteriaFromDate == rhs.criteriaFromDate)||((this.criteriaFromDate!= null)&&this.criteriaFromDate.equals(rhs.criteriaFromDate))))&&((this.criteriaOrigCode == rhs.criteriaOrigCode)||((this.criteriaOrigCode!= null)&&this.criteriaOrigCode.equals(rhs.criteriaOrigCode))))&&((this.criteriaReleaseInd == rhs.criteriaReleaseInd)||((this.criteriaReleaseInd!= null)&&this.criteriaReleaseInd.equals(rhs.criteriaReleaseInd))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.releaseInd == rhs.releaseInd)||((this.releaseInd!= null)&&this.releaseInd.equals(rhs.releaseInd))))&&((this.amountOwed == rhs.amountOwed)||((this.amountOwed!= null)&&this.amountOwed.equals(rhs.amountOwed))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.hlddCode == rhs.hlddCode)||((this.hlddCode!= null)&&this.hlddCode.equals(rhs.hlddCode))))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.criteriaAmountOwed == rhs.criteriaAmountOwed)||((this.criteriaAmountOwed!= null)&&this.criteriaAmountOwed.equals(rhs.criteriaAmountOwed))))&&((this.criteriaReason == rhs.criteriaReason)||((this.criteriaReason!= null)&&this.criteriaReason.equals(rhs.criteriaReason))))&&((this.criteriaToDate == rhs.criteriaToDate)||((this.criteriaToDate!= null)&&this.criteriaToDate.equals(rhs.criteriaToDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaHlddCode == rhs.criteriaHlddCode)||((this.criteriaHlddCode!= null)&&this.criteriaHlddCode.equals(rhs.criteriaHlddCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
