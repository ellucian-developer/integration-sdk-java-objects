
package com.ellucian.generated.bpapi.ban.receipt_queries.v1_0_0;

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
    "date",
    "feedDate",
    "feedDocCode",
    "sessionNumber",
    "acctFeedInd",
    "name",
    "id",
    "type",
    "user",
    "receiptNumber"
})
@Generated("jsonschema2pojo")
public class Tbvrcp1 {

    /**
     * Date
     * <p>
     * Lineage reference object : TBVRCP1_DATE
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Lineage reference object : TBVRCP1_DATE")
    private Date date;
    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBVRCP1_FEED_DATE
     * 
     */
    @JsonProperty("feedDate")
    @JsonPropertyDescription("Lineage reference object : TBVRCP1_FEED_DATE")
    private Date feedDate;
    /**
     * Feed Document
     * <p>
     * Lineage reference object : TBVRCP1_FEED_DOC_CODE
     * 
     */
    @JsonProperty("feedDocCode")
    @JsonPropertyDescription("Lineage reference object : TBVRCP1_FEED_DOC_CODE")
    private String feedDocCode;
    /**
     * Session
     * <p>
     * Lineage reference object : TBVRCP1_SESSION_NUMBER
     * 
     */
    @JsonProperty("sessionNumber")
    @JsonPropertyDescription("Lineage reference object : TBVRCP1_SESSION_NUMBER")
    private Double sessionNumber;
    /**
     * Tbvrcp2 Type
     * <p>
     * Lineage reference object : TBVRCP1_ACCT_FEED_IND
     * 
     */
    @JsonProperty("acctFeedInd")
    @JsonPropertyDescription("Lineage reference object : TBVRCP1_ACCT_FEED_IND")
    private String acctFeedInd;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Tbvrcp2 Type
     * <p>
     * Lineage reference object : TBVRCP1_TYPE
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lineage reference object : TBVRCP1_TYPE")
    private String type;
    /**
     * User
     * <p>
     * Lineage reference object : TBVRCP1_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : TBVRCP1_USER")
    private String user;
    /**
     * Receipt Number
     * <p>
     * Lineage reference object : TBVRCP1_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("receiptNumber")
    @JsonPropertyDescription("Lineage reference object : TBVRCP1_RECEIPT_NUMBER")
    private Double receiptNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Date
     * <p>
     * Lineage reference object : TBVRCP1_DATE
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TBVRCP1_DATE
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public Tbvrcp1 withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBVRCP1_FEED_DATE
     * 
     */
    @JsonProperty("feedDate")
    public Date getFeedDate() {
        return feedDate;
    }

    /**
     * Feed Date
     * <p>
     * Lineage reference object : TBVRCP1_FEED_DATE
     * 
     */
    @JsonProperty("feedDate")
    public void setFeedDate(Date feedDate) {
        this.feedDate = feedDate;
    }

    public Tbvrcp1 withFeedDate(Date feedDate) {
        this.feedDate = feedDate;
        return this;
    }

    /**
     * Feed Document
     * <p>
     * Lineage reference object : TBVRCP1_FEED_DOC_CODE
     * 
     */
    @JsonProperty("feedDocCode")
    public String getFeedDocCode() {
        return feedDocCode;
    }

    /**
     * Feed Document
     * <p>
     * Lineage reference object : TBVRCP1_FEED_DOC_CODE
     * 
     */
    @JsonProperty("feedDocCode")
    public void setFeedDocCode(String feedDocCode) {
        this.feedDocCode = feedDocCode;
    }

    public Tbvrcp1 withFeedDocCode(String feedDocCode) {
        this.feedDocCode = feedDocCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : TBVRCP1_SESSION_NUMBER
     * 
     */
    @JsonProperty("sessionNumber")
    public Double getSessionNumber() {
        return sessionNumber;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : TBVRCP1_SESSION_NUMBER
     * 
     */
    @JsonProperty("sessionNumber")
    public void setSessionNumber(Double sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public Tbvrcp1 withSessionNumber(Double sessionNumber) {
        this.sessionNumber = sessionNumber;
        return this;
    }

    /**
     * Tbvrcp2 Type
     * <p>
     * Lineage reference object : TBVRCP1_ACCT_FEED_IND
     * 
     */
    @JsonProperty("acctFeedInd")
    public String getAcctFeedInd() {
        return acctFeedInd;
    }

    /**
     * Tbvrcp2 Type
     * <p>
     * Lineage reference object : TBVRCP1_ACCT_FEED_IND
     * 
     */
    @JsonProperty("acctFeedInd")
    public void setAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
    }

    public Tbvrcp1 withAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Tbvrcp1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Tbvrcp1 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Tbvrcp2 Type
     * <p>
     * Lineage reference object : TBVRCP1_TYPE
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Tbvrcp2 Type
     * <p>
     * Lineage reference object : TBVRCP1_TYPE
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Tbvrcp1 withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : TBVRCP1_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User
     * <p>
     * Lineage reference object : TBVRCP1_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Tbvrcp1 withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Receipt Number
     * <p>
     * Lineage reference object : TBVRCP1_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("receiptNumber")
    public Double getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Receipt Number
     * <p>
     * Lineage reference object : TBVRCP1_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("receiptNumber")
    public void setReceiptNumber(Double receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public Tbvrcp1 withReceiptNumber(Double receiptNumber) {
        this.receiptNumber = receiptNumber;
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

    public Tbvrcp1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbvrcp1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("feedDate");
        sb.append('=');
        sb.append(((this.feedDate == null)?"<null>":this.feedDate));
        sb.append(',');
        sb.append("feedDocCode");
        sb.append('=');
        sb.append(((this.feedDocCode == null)?"<null>":this.feedDocCode));
        sb.append(',');
        sb.append("sessionNumber");
        sb.append('=');
        sb.append(((this.sessionNumber == null)?"<null>":this.sessionNumber));
        sb.append(',');
        sb.append("acctFeedInd");
        sb.append('=');
        sb.append(((this.acctFeedInd == null)?"<null>":this.acctFeedInd));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("receiptNumber");
        sb.append('=');
        sb.append(((this.receiptNumber == null)?"<null>":this.receiptNumber));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.feedDate == null)? 0 :this.feedDate.hashCode()));
        result = ((result* 31)+((this.feedDocCode == null)? 0 :this.feedDocCode.hashCode()));
        result = ((result* 31)+((this.sessionNumber == null)? 0 :this.sessionNumber.hashCode()));
        result = ((result* 31)+((this.acctFeedInd == null)? 0 :this.acctFeedInd.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.receiptNumber == null)? 0 :this.receiptNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbvrcp1) == false) {
            return false;
        }
        Tbvrcp1 rhs = ((Tbvrcp1) other);
        return ((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.feedDate == rhs.feedDate)||((this.feedDate!= null)&&this.feedDate.equals(rhs.feedDate))))&&((this.feedDocCode == rhs.feedDocCode)||((this.feedDocCode!= null)&&this.feedDocCode.equals(rhs.feedDocCode))))&&((this.sessionNumber == rhs.sessionNumber)||((this.sessionNumber!= null)&&this.sessionNumber.equals(rhs.sessionNumber))))&&((this.acctFeedInd == rhs.acctFeedInd)||((this.acctFeedInd!= null)&&this.acctFeedInd.equals(rhs.acctFeedInd))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.receiptNumber == rhs.receiptNumber)||((this.receiptNumber!= null)&&this.receiptNumber.equals(rhs.receiptNumber))));
    }

}
