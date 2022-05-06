
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
    "fromDate",
    "hlddCode",
    "reason",
    "origDescription",
    "toDate",
    "releaseInd",
    "user",
    "userId",
    "hlddDescription",
    "amountOwed",
    "origCode"
})
@Generated("jsonschema2pojo")
public class HoldInformation100PostResponse {

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
     * Reason
     * <p>
     * Lineage reference object : SPRHOLD_REASON
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_REASON")
    private String reason;
    /**
     * Origination Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("origDescription")
    private String origDescription;
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
     * Created User
     * <p>
     * Lineage reference object : SPRHOLD_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_USER")
    private String user;
    /**
     * Lineage reference object : SPRHOLD_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SPRHOLD_USER_ID")
    private String userId;
    /**
     * Hold Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("hlddDescription")
    private String hlddDescription;
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

    public HoldInformation100PostResponse withFromDate(Date fromDate) {
        this.fromDate = fromDate;
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

    public HoldInformation100PostResponse withHlddCode(String hlddCode) {
        this.hlddCode = hlddCode;
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

    public HoldInformation100PostResponse withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Origination Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("origDescription")
    public String getOrigDescription() {
        return origDescription;
    }

    /**
     * Origination Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("origDescription")
    public void setOrigDescription(String origDescription) {
        this.origDescription = origDescription;
    }

    public HoldInformation100PostResponse withOrigDescription(String origDescription) {
        this.origDescription = origDescription;
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

    public HoldInformation100PostResponse withToDate(Date toDate) {
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

    public HoldInformation100PostResponse withReleaseInd(String releaseInd) {
        this.releaseInd = releaseInd;
        return this;
    }

    /**
     * Created User
     * <p>
     * Lineage reference object : SPRHOLD_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * Created User
     * <p>
     * Lineage reference object : SPRHOLD_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public HoldInformation100PostResponse withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Lineage reference object : SPRHOLD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SPRHOLD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public HoldInformation100PostResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Hold Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("hlddDescription")
    public String getHlddDescription() {
        return hlddDescription;
    }

    /**
     * Hold Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("hlddDescription")
    public void setHlddDescription(String hlddDescription) {
        this.hlddDescription = hlddDescription;
    }

    public HoldInformation100PostResponse withHlddDescription(String hlddDescription) {
        this.hlddDescription = hlddDescription;
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

    public HoldInformation100PostResponse withAmountOwed(Double amountOwed) {
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

    public HoldInformation100PostResponse withOrigCode(String origCode) {
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

    public HoldInformation100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HoldInformation100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("hlddCode");
        sb.append('=');
        sb.append(((this.hlddCode == null)?"<null>":this.hlddCode));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("origDescription");
        sb.append('=');
        sb.append(((this.origDescription == null)?"<null>":this.origDescription));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("releaseInd");
        sb.append('=');
        sb.append(((this.releaseInd == null)?"<null>":this.releaseInd));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("hlddDescription");
        sb.append('=');
        sb.append(((this.hlddDescription == null)?"<null>":this.hlddDescription));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.origDescription == null)? 0 :this.origDescription.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.releaseInd == null)? 0 :this.releaseInd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.amountOwed == null)? 0 :this.amountOwed.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.hlddCode == null)? 0 :this.hlddCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.hlddDescription == null)? 0 :this.hlddDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HoldInformation100PostResponse) == false) {
            return false;
        }
        HoldInformation100PostResponse rhs = ((HoldInformation100PostResponse) other);
        return (((((((((((((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.origDescription == rhs.origDescription)||((this.origDescription!= null)&&this.origDescription.equals(rhs.origDescription))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.releaseInd == rhs.releaseInd)||((this.releaseInd!= null)&&this.releaseInd.equals(rhs.releaseInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.amountOwed == rhs.amountOwed)||((this.amountOwed!= null)&&this.amountOwed.equals(rhs.amountOwed))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.hlddCode == rhs.hlddCode)||((this.hlddCode!= null)&&this.hlddCode.equals(rhs.hlddCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.hlddDescription == rhs.hlddDescription)||((this.hlddDescription!= null)&&this.hlddDescription.equals(rhs.hlddDescription))));
    }

}
