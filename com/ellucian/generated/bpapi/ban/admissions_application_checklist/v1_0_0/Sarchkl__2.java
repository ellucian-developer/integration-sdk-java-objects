
package com.ellucian.generated.bpapi.ban.admissions_application_checklist.v1_0_0;

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
    "reqCount",
    "mandatoryInd",
    "deadlineDate",
    "cksrCode",
    "printInd",
    "receiveDate",
    "source",
    "userId",
    "codeValue",
    "sourceDate",
    "admrCode",
    "activityDate",
    "ckstCode",
    "stvadmrDesc",
    "comment",
    "reqDate2",
    "reqDate1"
})
@Generated("jsonschema2pojo")
public class Sarchkl__2 {

    /**
     * Count
     * <p>
     * Lineage reference object : SARCHKL_REQ_COUNT
     * 
     */
    @JsonProperty("reqCount")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_REQ_COUNT")
    private Double reqCount;
    /**
     * Lineage reference object : SARCHKL_MANDATORY_IND
     * 
     */
    @JsonProperty("mandatoryInd")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_MANDATORY_IND")
    private String mandatoryInd;
    /**
     * Deadline
     * <p>
     * Lineage reference object : SARCHKL_DEADLINE_DATE
     * 
     */
    @JsonProperty("deadlineDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_DEADLINE_DATE")
    private Date deadlineDate;
    /**
     * Checklist Origin
     * <p>
     * Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr
     * 
     */
    @JsonProperty("cksrCode")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr")
    private String cksrCode;
    /**
     * Lineage reference object : SARCHKL_PRINT_IND
     * 
     */
    @JsonProperty("printInd")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_PRINT_IND")
    private String printInd;
    /**
     * Received Date
     * <p>
     * Lineage reference object : SARCHKL_RECEIVE_DATE
     * 
     */
    @JsonProperty("receiveDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_RECEIVE_DATE")
    private Date receiveDate;
    /**
     * Lineage reference object : SARCHKL_SOURCE
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_SOURCE")
    private String source;
    /**
     * Lineage reference object : SARCHKL_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_USER_ID")
    private String userId;
    /**
     * Item
     * <p>
     * Lineage reference object : SARCHKL_CODE_VALUE
     * 
     */
    @JsonProperty("codeValue")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_CODE_VALUE")
    private String codeValue;
    /**
     * Date
     * <p>
     * Lineage reference object : SARCHKL_SOURCE_DATE
     * 
     */
    @JsonProperty("sourceDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_SOURCE_DATE")
    private Date sourceDate;
    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * (Required)
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * Lineage reference object : SARCHKL_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Status
     * <p>
     * Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst
     * 
     */
    @JsonProperty("ckstCode")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst")
    private String ckstCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmrDesc")
    private String stvadmrDesc;
    /**
     * Item Description
     * <p>
     * Lineage reference object : SARCHKL_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_COMMENT")
    private String comment;
    /**
     * Last Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE2
     * 
     */
    @JsonProperty("reqDate2")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_REQ_DATE2")
    private Date reqDate2;
    /**
     * First Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE1
     * 
     */
    @JsonProperty("reqDate1")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_REQ_DATE1")
    private Date reqDate1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Count
     * <p>
     * Lineage reference object : SARCHKL_REQ_COUNT
     * 
     */
    @JsonProperty("reqCount")
    public Double getReqCount() {
        return reqCount;
    }

    /**
     * Count
     * <p>
     * Lineage reference object : SARCHKL_REQ_COUNT
     * 
     */
    @JsonProperty("reqCount")
    public void setReqCount(Double reqCount) {
        this.reqCount = reqCount;
    }

    public Sarchkl__2 withReqCount(Double reqCount) {
        this.reqCount = reqCount;
        return this;
    }

    /**
     * Lineage reference object : SARCHKL_MANDATORY_IND
     * 
     */
    @JsonProperty("mandatoryInd")
    public String getMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * Lineage reference object : SARCHKL_MANDATORY_IND
     * 
     */
    @JsonProperty("mandatoryInd")
    public void setMandatoryInd(String mandatoryInd) {
        this.mandatoryInd = mandatoryInd;
    }

    public Sarchkl__2 withMandatoryInd(String mandatoryInd) {
        this.mandatoryInd = mandatoryInd;
        return this;
    }

    /**
     * Deadline
     * <p>
     * Lineage reference object : SARCHKL_DEADLINE_DATE
     * 
     */
    @JsonProperty("deadlineDate")
    public Date getDeadlineDate() {
        return deadlineDate;
    }

    /**
     * Deadline
     * <p>
     * Lineage reference object : SARCHKL_DEADLINE_DATE
     * 
     */
    @JsonProperty("deadlineDate")
    public void setDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public Sarchkl__2 withDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
        return this;
    }

    /**
     * Checklist Origin
     * <p>
     * Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr
     * 
     */
    @JsonProperty("cksrCode")
    public String getCksrCode() {
        return cksrCode;
    }

    /**
     * Checklist Origin
     * <p>
     * Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr
     * 
     */
    @JsonProperty("cksrCode")
    public void setCksrCode(String cksrCode) {
        this.cksrCode = cksrCode;
    }

    public Sarchkl__2 withCksrCode(String cksrCode) {
        this.cksrCode = cksrCode;
        return this;
    }

    /**
     * Lineage reference object : SARCHKL_PRINT_IND
     * 
     */
    @JsonProperty("printInd")
    public String getPrintInd() {
        return printInd;
    }

    /**
     * Lineage reference object : SARCHKL_PRINT_IND
     * 
     */
    @JsonProperty("printInd")
    public void setPrintInd(String printInd) {
        this.printInd = printInd;
    }

    public Sarchkl__2 withPrintInd(String printInd) {
        this.printInd = printInd;
        return this;
    }

    /**
     * Received Date
     * <p>
     * Lineage reference object : SARCHKL_RECEIVE_DATE
     * 
     */
    @JsonProperty("receiveDate")
    public Date getReceiveDate() {
        return receiveDate;
    }

    /**
     * Received Date
     * <p>
     * Lineage reference object : SARCHKL_RECEIVE_DATE
     * 
     */
    @JsonProperty("receiveDate")
    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Sarchkl__2 withReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
        return this;
    }

    /**
     * Lineage reference object : SARCHKL_SOURCE
     * 
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * Lineage reference object : SARCHKL_SOURCE
     * 
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public Sarchkl__2 withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Lineage reference object : SARCHKL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SARCHKL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sarchkl__2 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : SARCHKL_CODE_VALUE
     * 
     */
    @JsonProperty("codeValue")
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : SARCHKL_CODE_VALUE
     * 
     */
    @JsonProperty("codeValue")
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public Sarchkl__2 withCodeValue(String codeValue) {
        this.codeValue = codeValue;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : SARCHKL_SOURCE_DATE
     * 
     */
    @JsonProperty("sourceDate")
    public Date getSourceDate() {
        return sourceDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : SARCHKL_SOURCE_DATE
     * 
     */
    @JsonProperty("sourceDate")
    public void setSourceDate(Date sourceDate) {
        this.sourceDate = sourceDate;
    }

    public Sarchkl__2 withSourceDate(Date sourceDate) {
        this.sourceDate = sourceDate;
        return this;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * (Required)
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * (Required)
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public Sarchkl__2 withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Lineage reference object : SARCHKL_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SARCHKL_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sarchkl__2 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst
     * 
     */
    @JsonProperty("ckstCode")
    public String getCkstCode() {
        return ckstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst
     * 
     */
    @JsonProperty("ckstCode")
    public void setCkstCode(String ckstCode) {
        this.ckstCode = ckstCode;
    }

    public Sarchkl__2 withCkstCode(String ckstCode) {
        this.ckstCode = ckstCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmrDesc")
    public String getStvadmrDesc() {
        return stvadmrDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmrDesc")
    public void setStvadmrDesc(String stvadmrDesc) {
        this.stvadmrDesc = stvadmrDesc;
    }

    public Sarchkl__2 withStvadmrDesc(String stvadmrDesc) {
        this.stvadmrDesc = stvadmrDesc;
        return this;
    }

    /**
     * Item Description
     * <p>
     * Lineage reference object : SARCHKL_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Item Description
     * <p>
     * Lineage reference object : SARCHKL_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Sarchkl__2 withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Last Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE2
     * 
     */
    @JsonProperty("reqDate2")
    public Date getReqDate2() {
        return reqDate2;
    }

    /**
     * Last Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE2
     * 
     */
    @JsonProperty("reqDate2")
    public void setReqDate2(Date reqDate2) {
        this.reqDate2 = reqDate2;
    }

    public Sarchkl__2 withReqDate2(Date reqDate2) {
        this.reqDate2 = reqDate2;
        return this;
    }

    /**
     * First Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE1
     * 
     */
    @JsonProperty("reqDate1")
    public Date getReqDate1() {
        return reqDate1;
    }

    /**
     * First Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE1
     * 
     */
    @JsonProperty("reqDate1")
    public void setReqDate1(Date reqDate1) {
        this.reqDate1 = reqDate1;
    }

    public Sarchkl__2 withReqDate1(Date reqDate1) {
        this.reqDate1 = reqDate1;
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

    public Sarchkl__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sarchkl__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqCount");
        sb.append('=');
        sb.append(((this.reqCount == null)?"<null>":this.reqCount));
        sb.append(',');
        sb.append("mandatoryInd");
        sb.append('=');
        sb.append(((this.mandatoryInd == null)?"<null>":this.mandatoryInd));
        sb.append(',');
        sb.append("deadlineDate");
        sb.append('=');
        sb.append(((this.deadlineDate == null)?"<null>":this.deadlineDate));
        sb.append(',');
        sb.append("cksrCode");
        sb.append('=');
        sb.append(((this.cksrCode == null)?"<null>":this.cksrCode));
        sb.append(',');
        sb.append("printInd");
        sb.append('=');
        sb.append(((this.printInd == null)?"<null>":this.printInd));
        sb.append(',');
        sb.append("receiveDate");
        sb.append('=');
        sb.append(((this.receiveDate == null)?"<null>":this.receiveDate));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("codeValue");
        sb.append('=');
        sb.append(((this.codeValue == null)?"<null>":this.codeValue));
        sb.append(',');
        sb.append("sourceDate");
        sb.append('=');
        sb.append(((this.sourceDate == null)?"<null>":this.sourceDate));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ckstCode");
        sb.append('=');
        sb.append(((this.ckstCode == null)?"<null>":this.ckstCode));
        sb.append(',');
        sb.append("stvadmrDesc");
        sb.append('=');
        sb.append(((this.stvadmrDesc == null)?"<null>":this.stvadmrDesc));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("reqDate2");
        sb.append('=');
        sb.append(((this.reqDate2 == null)?"<null>":this.reqDate2));
        sb.append(',');
        sb.append("reqDate1");
        sb.append('=');
        sb.append(((this.reqDate1 == null)?"<null>":this.reqDate1));
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
        result = ((result* 31)+((this.reqCount == null)? 0 :this.reqCount.hashCode()));
        result = ((result* 31)+((this.mandatoryInd == null)? 0 :this.mandatoryInd.hashCode()));
        result = ((result* 31)+((this.deadlineDate == null)? 0 :this.deadlineDate.hashCode()));
        result = ((result* 31)+((this.cksrCode == null)? 0 :this.cksrCode.hashCode()));
        result = ((result* 31)+((this.printInd == null)? 0 :this.printInd.hashCode()));
        result = ((result* 31)+((this.receiveDate == null)? 0 :this.receiveDate.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.codeValue == null)? 0 :this.codeValue.hashCode()));
        result = ((result* 31)+((this.sourceDate == null)? 0 :this.sourceDate.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ckstCode == null)? 0 :this.ckstCode.hashCode()));
        result = ((result* 31)+((this.stvadmrDesc == null)? 0 :this.stvadmrDesc.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reqDate2 == null)? 0 :this.reqDate2 .hashCode()));
        result = ((result* 31)+((this.reqDate1 == null)? 0 :this.reqDate1 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sarchkl__2) == false) {
            return false;
        }
        Sarchkl__2 rhs = ((Sarchkl__2) other);
        return (((((((((((((((((((this.reqCount == rhs.reqCount)||((this.reqCount!= null)&&this.reqCount.equals(rhs.reqCount)))&&((this.mandatoryInd == rhs.mandatoryInd)||((this.mandatoryInd!= null)&&this.mandatoryInd.equals(rhs.mandatoryInd))))&&((this.deadlineDate == rhs.deadlineDate)||((this.deadlineDate!= null)&&this.deadlineDate.equals(rhs.deadlineDate))))&&((this.cksrCode == rhs.cksrCode)||((this.cksrCode!= null)&&this.cksrCode.equals(rhs.cksrCode))))&&((this.printInd == rhs.printInd)||((this.printInd!= null)&&this.printInd.equals(rhs.printInd))))&&((this.receiveDate == rhs.receiveDate)||((this.receiveDate!= null)&&this.receiveDate.equals(rhs.receiveDate))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.codeValue == rhs.codeValue)||((this.codeValue!= null)&&this.codeValue.equals(rhs.codeValue))))&&((this.sourceDate == rhs.sourceDate)||((this.sourceDate!= null)&&this.sourceDate.equals(rhs.sourceDate))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ckstCode == rhs.ckstCode)||((this.ckstCode!= null)&&this.ckstCode.equals(rhs.ckstCode))))&&((this.stvadmrDesc == rhs.stvadmrDesc)||((this.stvadmrDesc!= null)&&this.stvadmrDesc.equals(rhs.stvadmrDesc))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reqDate2 == rhs.reqDate2)||((this.reqDate2 != null)&&this.reqDate2 .equals(rhs.reqDate2))))&&((this.reqDate1 == rhs.reqDate1)||((this.reqDate1 != null)&&this.reqDate1 .equals(rhs.reqDate1))));
    }

}
