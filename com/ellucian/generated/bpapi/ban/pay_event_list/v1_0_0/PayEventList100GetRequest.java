
package com.ellucian.generated.bpapi.ban.pay_event_list.v1_0_0;

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
    "adjBySeqNo",
    "adjsSeqNo",
    "typeInd",
    "seqNo",
    "gross",
    "year",
    "disp",
    "adjsDate",
    "adjByDate",
    "userId",
    "payno",
    "postingOverrideDate",
    "pictCode",
    "commentInd",
    "id",
    "net",
    "eventDate"
})
@Generated("jsonschema2pojo")
public class PayEventList100GetRequest {

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PHRHIST_ADJ_BY_SEQ_NO
     * 
     */
    @JsonProperty("adjBySeqNo")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_ADJ_BY_SEQ_NO")
    private String adjBySeqNo;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PHRHIST_ADJS_SEQ_NO
     * 
     */
    @JsonProperty("adjsSeqNo")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_ADJS_SEQ_NO")
    private Double adjsSeqNo;
    /**
     * Event Type
     * <p>
     * Lineage reference object : PHRHIST_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_TYPE_IND")
    private String typeInd;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PHRHIST_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_SEQ_NO")
    private Double seqNo;
    /**
     * Gross
     * <p>
     * Lineage reference object : PHRHIST_GROSS
     * 
     */
    @JsonProperty("gross")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_GROSS")
    private Double gross;
    /**
     * Year
     * <p>
     * Lineage reference object : PHRHIST_YEAR
     * 
     */
    @JsonProperty("year")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_YEAR")
    private String year;
    /**
     * Disposition
     * <p>
     * Lineage reference object : PHRHIST_DISP
     * 
     */
    @JsonProperty("disp")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_DISP")
    private String disp;
    /**
     * Adjusts Date
     * <p>
     * Lineage reference object : PHRHIST_ADJS_DATE
     * 
     */
    @JsonProperty("adjsDate")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_ADJS_DATE")
    private Date adjsDate;
    /**
     * Adjusted By Date
     * <p>
     * Lineage reference object : PHRHIST_ADJ_BY_DATE
     * 
     */
    @JsonProperty("adjByDate")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_ADJ_BY_DATE")
    private Date adjByDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : PHRHIST_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_USER_ID")
    private String userId;
    /**
     * Payroll Number
     * <p>
     * Lineage reference object : PHRHIST_PAYNO
     * 
     */
    @JsonProperty("payno")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_PAYNO")
    private Double payno;
    /**
     * Posting Override Date
     * <p>
     * Lineage reference object : PHRHIST_POSTING_OVERRIDE_DATE
     * 
     */
    @JsonProperty("postingOverrideDate")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_POSTING_OVERRIDE_DATE")
    private Date postingOverrideDate;
    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PHRHIST_PICT_CODE
     * 
     */
    @JsonProperty("pictCode")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_PICT_CODE")
    private String pictCode;
    @JsonProperty("commentInd")
    private String commentInd;
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
     * Net
     * <p>
     * Lineage reference object : PHRHIST_NET
     * 
     */
    @JsonProperty("net")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_NET")
    private Double net;
    /**
     * History Date
     * <p>
     * Lineage reference object : PHRHIST_EVENT_DATE
     * 
     */
    @JsonProperty("eventDate")
    @JsonPropertyDescription("Lineage reference object : PHRHIST_EVENT_DATE")
    private Date eventDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PHRHIST_ADJ_BY_SEQ_NO
     * 
     */
    @JsonProperty("adjBySeqNo")
    public String getAdjBySeqNo() {
        return adjBySeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PHRHIST_ADJ_BY_SEQ_NO
     * 
     */
    @JsonProperty("adjBySeqNo")
    public void setAdjBySeqNo(String adjBySeqNo) {
        this.adjBySeqNo = adjBySeqNo;
    }

    public PayEventList100GetRequest withAdjBySeqNo(String adjBySeqNo) {
        this.adjBySeqNo = adjBySeqNo;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PHRHIST_ADJS_SEQ_NO
     * 
     */
    @JsonProperty("adjsSeqNo")
    public Double getAdjsSeqNo() {
        return adjsSeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PHRHIST_ADJS_SEQ_NO
     * 
     */
    @JsonProperty("adjsSeqNo")
    public void setAdjsSeqNo(Double adjsSeqNo) {
        this.adjsSeqNo = adjsSeqNo;
    }

    public PayEventList100GetRequest withAdjsSeqNo(Double adjsSeqNo) {
        this.adjsSeqNo = adjsSeqNo;
        return this;
    }

    /**
     * Event Type
     * <p>
     * Lineage reference object : PHRHIST_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    public String getTypeInd() {
        return typeInd;
    }

    /**
     * Event Type
     * <p>
     * Lineage reference object : PHRHIST_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    public void setTypeInd(String typeInd) {
        this.typeInd = typeInd;
    }

    public PayEventList100GetRequest withTypeInd(String typeInd) {
        this.typeInd = typeInd;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PHRHIST_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PHRHIST_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public PayEventList100GetRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Gross
     * <p>
     * Lineage reference object : PHRHIST_GROSS
     * 
     */
    @JsonProperty("gross")
    public Double getGross() {
        return gross;
    }

    /**
     * Gross
     * <p>
     * Lineage reference object : PHRHIST_GROSS
     * 
     */
    @JsonProperty("gross")
    public void setGross(Double gross) {
        this.gross = gross;
    }

    public PayEventList100GetRequest withGross(Double gross) {
        this.gross = gross;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : PHRHIST_YEAR
     * 
     */
    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : PHRHIST_YEAR
     * 
     */
    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    public PayEventList100GetRequest withYear(String year) {
        this.year = year;
        return this;
    }

    /**
     * Disposition
     * <p>
     * Lineage reference object : PHRHIST_DISP
     * 
     */
    @JsonProperty("disp")
    public String getDisp() {
        return disp;
    }

    /**
     * Disposition
     * <p>
     * Lineage reference object : PHRHIST_DISP
     * 
     */
    @JsonProperty("disp")
    public void setDisp(String disp) {
        this.disp = disp;
    }

    public PayEventList100GetRequest withDisp(String disp) {
        this.disp = disp;
        return this;
    }

    /**
     * Adjusts Date
     * <p>
     * Lineage reference object : PHRHIST_ADJS_DATE
     * 
     */
    @JsonProperty("adjsDate")
    public Date getAdjsDate() {
        return adjsDate;
    }

    /**
     * Adjusts Date
     * <p>
     * Lineage reference object : PHRHIST_ADJS_DATE
     * 
     */
    @JsonProperty("adjsDate")
    public void setAdjsDate(Date adjsDate) {
        this.adjsDate = adjsDate;
    }

    public PayEventList100GetRequest withAdjsDate(Date adjsDate) {
        this.adjsDate = adjsDate;
        return this;
    }

    /**
     * Adjusted By Date
     * <p>
     * Lineage reference object : PHRHIST_ADJ_BY_DATE
     * 
     */
    @JsonProperty("adjByDate")
    public Date getAdjByDate() {
        return adjByDate;
    }

    /**
     * Adjusted By Date
     * <p>
     * Lineage reference object : PHRHIST_ADJ_BY_DATE
     * 
     */
    @JsonProperty("adjByDate")
    public void setAdjByDate(Date adjByDate) {
        this.adjByDate = adjByDate;
    }

    public PayEventList100GetRequest withAdjByDate(Date adjByDate) {
        this.adjByDate = adjByDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : PHRHIST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : PHRHIST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PayEventList100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Payroll Number
     * <p>
     * Lineage reference object : PHRHIST_PAYNO
     * 
     */
    @JsonProperty("payno")
    public Double getPayno() {
        return payno;
    }

    /**
     * Payroll Number
     * <p>
     * Lineage reference object : PHRHIST_PAYNO
     * 
     */
    @JsonProperty("payno")
    public void setPayno(Double payno) {
        this.payno = payno;
    }

    public PayEventList100GetRequest withPayno(Double payno) {
        this.payno = payno;
        return this;
    }

    /**
     * Posting Override Date
     * <p>
     * Lineage reference object : PHRHIST_POSTING_OVERRIDE_DATE
     * 
     */
    @JsonProperty("postingOverrideDate")
    public Date getPostingOverrideDate() {
        return postingOverrideDate;
    }

    /**
     * Posting Override Date
     * <p>
     * Lineage reference object : PHRHIST_POSTING_OVERRIDE_DATE
     * 
     */
    @JsonProperty("postingOverrideDate")
    public void setPostingOverrideDate(Date postingOverrideDate) {
        this.postingOverrideDate = postingOverrideDate;
    }

    public PayEventList100GetRequest withPostingOverrideDate(Date postingOverrideDate) {
        this.postingOverrideDate = postingOverrideDate;
        return this;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PHRHIST_PICT_CODE
     * 
     */
    @JsonProperty("pictCode")
    public String getPictCode() {
        return pictCode;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PHRHIST_PICT_CODE
     * 
     */
    @JsonProperty("pictCode")
    public void setPictCode(String pictCode) {
        this.pictCode = pictCode;
    }

    public PayEventList100GetRequest withPictCode(String pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    @JsonProperty("commentInd")
    public String getCommentInd() {
        return commentInd;
    }

    @JsonProperty("commentInd")
    public void setCommentInd(String commentInd) {
        this.commentInd = commentInd;
    }

    public PayEventList100GetRequest withCommentInd(String commentInd) {
        this.commentInd = commentInd;
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

    public PayEventList100GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Net
     * <p>
     * Lineage reference object : PHRHIST_NET
     * 
     */
    @JsonProperty("net")
    public Double getNet() {
        return net;
    }

    /**
     * Net
     * <p>
     * Lineage reference object : PHRHIST_NET
     * 
     */
    @JsonProperty("net")
    public void setNet(Double net) {
        this.net = net;
    }

    public PayEventList100GetRequest withNet(Double net) {
        this.net = net;
        return this;
    }

    /**
     * History Date
     * <p>
     * Lineage reference object : PHRHIST_EVENT_DATE
     * 
     */
    @JsonProperty("eventDate")
    public Date getEventDate() {
        return eventDate;
    }

    /**
     * History Date
     * <p>
     * Lineage reference object : PHRHIST_EVENT_DATE
     * 
     */
    @JsonProperty("eventDate")
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public PayEventList100GetRequest withEventDate(Date eventDate) {
        this.eventDate = eventDate;
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

    public PayEventList100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayEventList100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adjBySeqNo");
        sb.append('=');
        sb.append(((this.adjBySeqNo == null)?"<null>":this.adjBySeqNo));
        sb.append(',');
        sb.append("adjsSeqNo");
        sb.append('=');
        sb.append(((this.adjsSeqNo == null)?"<null>":this.adjsSeqNo));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("gross");
        sb.append('=');
        sb.append(((this.gross == null)?"<null>":this.gross));
        sb.append(',');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("disp");
        sb.append('=');
        sb.append(((this.disp == null)?"<null>":this.disp));
        sb.append(',');
        sb.append("adjsDate");
        sb.append('=');
        sb.append(((this.adjsDate == null)?"<null>":this.adjsDate));
        sb.append(',');
        sb.append("adjByDate");
        sb.append('=');
        sb.append(((this.adjByDate == null)?"<null>":this.adjByDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("payno");
        sb.append('=');
        sb.append(((this.payno == null)?"<null>":this.payno));
        sb.append(',');
        sb.append("postingOverrideDate");
        sb.append('=');
        sb.append(((this.postingOverrideDate == null)?"<null>":this.postingOverrideDate));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("commentInd");
        sb.append('=');
        sb.append(((this.commentInd == null)?"<null>":this.commentInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("net");
        sb.append('=');
        sb.append(((this.net == null)?"<null>":this.net));
        sb.append(',');
        sb.append("eventDate");
        sb.append('=');
        sb.append(((this.eventDate == null)?"<null>":this.eventDate));
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
        result = ((result* 31)+((this.adjBySeqNo == null)? 0 :this.adjBySeqNo.hashCode()));
        result = ((result* 31)+((this.adjsSeqNo == null)? 0 :this.adjsSeqNo.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.gross == null)? 0 :this.gross.hashCode()));
        result = ((result* 31)+((this.year == null)? 0 :this.year.hashCode()));
        result = ((result* 31)+((this.disp == null)? 0 :this.disp.hashCode()));
        result = ((result* 31)+((this.adjsDate == null)? 0 :this.adjsDate.hashCode()));
        result = ((result* 31)+((this.adjByDate == null)? 0 :this.adjByDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.payno == null)? 0 :this.payno.hashCode()));
        result = ((result* 31)+((this.postingOverrideDate == null)? 0 :this.postingOverrideDate.hashCode()));
        result = ((result* 31)+((this.pictCode == null)? 0 :this.pictCode.hashCode()));
        result = ((result* 31)+((this.commentInd == null)? 0 :this.commentInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.net == null)? 0 :this.net.hashCode()));
        result = ((result* 31)+((this.eventDate == null)? 0 :this.eventDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayEventList100GetRequest) == false) {
            return false;
        }
        PayEventList100GetRequest rhs = ((PayEventList100GetRequest) other);
        return (((((((((((((((((((this.adjBySeqNo == rhs.adjBySeqNo)||((this.adjBySeqNo!= null)&&this.adjBySeqNo.equals(rhs.adjBySeqNo)))&&((this.adjsSeqNo == rhs.adjsSeqNo)||((this.adjsSeqNo!= null)&&this.adjsSeqNo.equals(rhs.adjsSeqNo))))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.gross == rhs.gross)||((this.gross!= null)&&this.gross.equals(rhs.gross))))&&((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year))))&&((this.disp == rhs.disp)||((this.disp!= null)&&this.disp.equals(rhs.disp))))&&((this.adjsDate == rhs.adjsDate)||((this.adjsDate!= null)&&this.adjsDate.equals(rhs.adjsDate))))&&((this.adjByDate == rhs.adjByDate)||((this.adjByDate!= null)&&this.adjByDate.equals(rhs.adjByDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.payno == rhs.payno)||((this.payno!= null)&&this.payno.equals(rhs.payno))))&&((this.postingOverrideDate == rhs.postingOverrideDate)||((this.postingOverrideDate!= null)&&this.postingOverrideDate.equals(rhs.postingOverrideDate))))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.commentInd == rhs.commentInd)||((this.commentInd!= null)&&this.commentInd.equals(rhs.commentInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.net == rhs.net)||((this.net!= null)&&this.net.equals(rhs.net))))&&((this.eventDate == rhs.eventDate)||((this.eventDate!= null)&&this.eventDate.equals(rhs.eventDate))));
    }

}
