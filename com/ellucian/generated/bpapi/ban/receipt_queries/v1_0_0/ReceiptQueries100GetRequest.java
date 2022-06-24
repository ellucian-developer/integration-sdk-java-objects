
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
    "tranNumber",
    "tagOption",
    "type",
    "detailCode",
    "sessionNumber",
    "feedDocCode",
    "acctFeedInd",
    "name",
    "id",
    "user",
    "receiptNumber",
    "termCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class ReceiptQueries100GetRequest {

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
     * Tbvrcp2 Tran Number
     * <p>
     * Lineage reference object : TBVRCP2_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    @JsonPropertyDescription("Lineage reference object : TBVRCP2_TRAN_NUMBER")
    private Double tranNumber;
    /**
     * Display By
     * <p>
     * Lineage reference object : tagOption
     * 
     */
    @JsonProperty("tagOption")
    @JsonPropertyDescription("Lineage reference object : tagOption")
    private Double tagOption;
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
     * Tbvrcp2 Detail Code
     * <p>
     * Lineage reference object : TBVRCP2_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBVRCP2_DETAIL_CODE")
    private String detailCode;
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
     * Feed Document
     * <p>
     * Lineage reference object : TBVRCP1_FEED_DOC_CODE
     * 
     */
    @JsonProperty("feedDocCode")
    @JsonPropertyDescription("Lineage reference object : TBVRCP1_FEED_DOC_CODE")
    private String feedDocCode;
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
    /**
     * Tbvrcp2 Term Code
     * <p>
     * Lineage reference object : TBVRCP2_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBVRCP2_TERM_CODE")
    private String termCode;
    /**
     * Tbvrcp2 Desc
     * <p>
     * Lineage reference object : TBVRCP2_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBVRCP2_DESC")
    private String desc;
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

    public ReceiptQueries100GetRequest withDate(Date date) {
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

    public ReceiptQueries100GetRequest withFeedDate(Date feedDate) {
        this.feedDate = feedDate;
        return this;
    }

    /**
     * Tbvrcp2 Tran Number
     * <p>
     * Lineage reference object : TBVRCP2_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public Double getTranNumber() {
        return tranNumber;
    }

    /**
     * Tbvrcp2 Tran Number
     * <p>
     * Lineage reference object : TBVRCP2_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public void setTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
    }

    public ReceiptQueries100GetRequest withTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
        return this;
    }

    /**
     * Display By
     * <p>
     * Lineage reference object : tagOption
     * 
     */
    @JsonProperty("tagOption")
    public Double getTagOption() {
        return tagOption;
    }

    /**
     * Display By
     * <p>
     * Lineage reference object : tagOption
     * 
     */
    @JsonProperty("tagOption")
    public void setTagOption(Double tagOption) {
        this.tagOption = tagOption;
    }

    public ReceiptQueries100GetRequest withTagOption(Double tagOption) {
        this.tagOption = tagOption;
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

    public ReceiptQueries100GetRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Tbvrcp2 Detail Code
     * <p>
     * Lineage reference object : TBVRCP2_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Tbvrcp2 Detail Code
     * <p>
     * Lineage reference object : TBVRCP2_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public ReceiptQueries100GetRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public ReceiptQueries100GetRequest withSessionNumber(Double sessionNumber) {
        this.sessionNumber = sessionNumber;
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

    public ReceiptQueries100GetRequest withFeedDocCode(String feedDocCode) {
        this.feedDocCode = feedDocCode;
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

    public ReceiptQueries100GetRequest withAcctFeedInd(String acctFeedInd) {
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

    public ReceiptQueries100GetRequest withName(String name) {
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

    public ReceiptQueries100GetRequest withId(String id) {
        this.id = id;
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

    public ReceiptQueries100GetRequest withUser(String user) {
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

    public ReceiptQueries100GetRequest withReceiptNumber(Double receiptNumber) {
        this.receiptNumber = receiptNumber;
        return this;
    }

    /**
     * Tbvrcp2 Term Code
     * <p>
     * Lineage reference object : TBVRCP2_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Tbvrcp2 Term Code
     * <p>
     * Lineage reference object : TBVRCP2_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public ReceiptQueries100GetRequest withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    /**
     * Tbvrcp2 Desc
     * <p>
     * Lineage reference object : TBVRCP2_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Tbvrcp2 Desc
     * <p>
     * Lineage reference object : TBVRCP2_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ReceiptQueries100GetRequest withDesc(String desc) {
        this.desc = desc;
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

    public ReceiptQueries100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReceiptQueries100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("feedDate");
        sb.append('=');
        sb.append(((this.feedDate == null)?"<null>":this.feedDate));
        sb.append(',');
        sb.append("tranNumber");
        sb.append('=');
        sb.append(((this.tranNumber == null)?"<null>":this.tranNumber));
        sb.append(',');
        sb.append("tagOption");
        sb.append('=');
        sb.append(((this.tagOption == null)?"<null>":this.tagOption));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("sessionNumber");
        sb.append('=');
        sb.append(((this.sessionNumber == null)?"<null>":this.sessionNumber));
        sb.append(',');
        sb.append("feedDocCode");
        sb.append('=');
        sb.append(((this.feedDocCode == null)?"<null>":this.feedDocCode));
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
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("receiptNumber");
        sb.append('=');
        sb.append(((this.receiptNumber == null)?"<null>":this.receiptNumber));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.tranNumber == null)? 0 :this.tranNumber.hashCode()));
        result = ((result* 31)+((this.tagOption == null)? 0 :this.tagOption.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.sessionNumber == null)? 0 :this.sessionNumber.hashCode()));
        result = ((result* 31)+((this.feedDocCode == null)? 0 :this.feedDocCode.hashCode()));
        result = ((result* 31)+((this.acctFeedInd == null)? 0 :this.acctFeedInd.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.receiptNumber == null)? 0 :this.receiptNumber.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptQueries100GetRequest) == false) {
            return false;
        }
        ReceiptQueries100GetRequest rhs = ((ReceiptQueries100GetRequest) other);
        return (((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.feedDate == rhs.feedDate)||((this.feedDate!= null)&&this.feedDate.equals(rhs.feedDate))))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.tagOption == rhs.tagOption)||((this.tagOption!= null)&&this.tagOption.equals(rhs.tagOption))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.sessionNumber == rhs.sessionNumber)||((this.sessionNumber!= null)&&this.sessionNumber.equals(rhs.sessionNumber))))&&((this.feedDocCode == rhs.feedDocCode)||((this.feedDocCode!= null)&&this.feedDocCode.equals(rhs.feedDocCode))))&&((this.acctFeedInd == rhs.acctFeedInd)||((this.acctFeedInd!= null)&&this.acctFeedInd.equals(rhs.acctFeedInd))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.receiptNumber == rhs.receiptNumber)||((this.receiptNumber!= null)&&this.receiptNumber.equals(rhs.receiptNumber))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
