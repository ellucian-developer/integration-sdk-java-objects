
package com.ellucian.generated.bpapi.ban.common_matching_source.v1_0_0;

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
    "columnCode",
    "cmscCode",
    "dataReqInd",
    "length",
    "priorityNo",
    "activityDate",
    "userId"
})
@Generated("jsonschema2pojo")
public class CommonMatchingSource100QapiPost {

    @JsonProperty("columnCode")
    private String columnCode;
    /**
     * Source
     * <p>
     * Lineage reference object : GORCMSR_CMSC_CODE
     * 
     */
    @JsonProperty("cmscCode")
    @JsonPropertyDescription("Lineage reference object : GORCMSR_CMSC_CODE")
    private String cmscCode;
    /**
     * Data Requirement
     * <p>
     * Lineage reference object : GORCMSR_DATA_REQ_IND
     * 
     */
    @JsonProperty("dataReqInd")
    @JsonPropertyDescription("Lineage reference object : GORCMSR_DATA_REQ_IND")
    private String dataReqInd;
    /**
     * Length
     * <p>
     * Lineage reference object : GORCMSR_LENGTH
     * 
     */
    @JsonProperty("length")
    @JsonPropertyDescription("Lineage reference object : GORCMSR_LENGTH")
    private Double length;
    /**
     * Rule Set
     * <p>
     * Lineage reference object : GORCMSR_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    @JsonPropertyDescription("Lineage reference object : GORCMSR_PRIORITY_NO")
    private Double priorityNo;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORCMSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GORCMSR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : GORCMSR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GORCMSR_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("columnCode")
    public String getColumnCode() {
        return columnCode;
    }

    @JsonProperty("columnCode")
    public void setColumnCode(String columnCode) {
        this.columnCode = columnCode;
    }

    public CommonMatchingSource100QapiPost withColumnCode(String columnCode) {
        this.columnCode = columnCode;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : GORCMSR_CMSC_CODE
     * 
     */
    @JsonProperty("cmscCode")
    public String getCmscCode() {
        return cmscCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : GORCMSR_CMSC_CODE
     * 
     */
    @JsonProperty("cmscCode")
    public void setCmscCode(String cmscCode) {
        this.cmscCode = cmscCode;
    }

    public CommonMatchingSource100QapiPost withCmscCode(String cmscCode) {
        this.cmscCode = cmscCode;
        return this;
    }

    /**
     * Data Requirement
     * <p>
     * Lineage reference object : GORCMSR_DATA_REQ_IND
     * 
     */
    @JsonProperty("dataReqInd")
    public String getDataReqInd() {
        return dataReqInd;
    }

    /**
     * Data Requirement
     * <p>
     * Lineage reference object : GORCMSR_DATA_REQ_IND
     * 
     */
    @JsonProperty("dataReqInd")
    public void setDataReqInd(String dataReqInd) {
        this.dataReqInd = dataReqInd;
    }

    public CommonMatchingSource100QapiPost withDataReqInd(String dataReqInd) {
        this.dataReqInd = dataReqInd;
        return this;
    }

    /**
     * Length
     * <p>
     * Lineage reference object : GORCMSR_LENGTH
     * 
     */
    @JsonProperty("length")
    public Double getLength() {
        return length;
    }

    /**
     * Length
     * <p>
     * Lineage reference object : GORCMSR_LENGTH
     * 
     */
    @JsonProperty("length")
    public void setLength(Double length) {
        this.length = length;
    }

    public CommonMatchingSource100QapiPost withLength(Double length) {
        this.length = length;
        return this;
    }

    /**
     * Rule Set
     * <p>
     * Lineage reference object : GORCMSR_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public Double getPriorityNo() {
        return priorityNo;
    }

    /**
     * Rule Set
     * <p>
     * Lineage reference object : GORCMSR_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public void setPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
    }

    public CommonMatchingSource100QapiPost withPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORCMSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORCMSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CommonMatchingSource100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GORCMSR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GORCMSR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CommonMatchingSource100QapiPost withUserId(String userId) {
        this.userId = userId;
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

    public CommonMatchingSource100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommonMatchingSource100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("columnCode");
        sb.append('=');
        sb.append(((this.columnCode == null)?"<null>":this.columnCode));
        sb.append(',');
        sb.append("cmscCode");
        sb.append('=');
        sb.append(((this.cmscCode == null)?"<null>":this.cmscCode));
        sb.append(',');
        sb.append("dataReqInd");
        sb.append('=');
        sb.append(((this.dataReqInd == null)?"<null>":this.dataReqInd));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null)?"<null>":this.length));
        sb.append(',');
        sb.append("priorityNo");
        sb.append('=');
        sb.append(((this.priorityNo == null)?"<null>":this.priorityNo));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.priorityNo == null)? 0 :this.priorityNo.hashCode()));
        result = ((result* 31)+((this.length == null)? 0 :this.length.hashCode()));
        result = ((result* 31)+((this.columnCode == null)? 0 :this.columnCode.hashCode()));
        result = ((result* 31)+((this.cmscCode == null)? 0 :this.cmscCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.dataReqInd == null)? 0 :this.dataReqInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommonMatchingSource100QapiPost) == false) {
            return false;
        }
        CommonMatchingSource100QapiPost rhs = ((CommonMatchingSource100QapiPost) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.priorityNo == rhs.priorityNo)||((this.priorityNo!= null)&&this.priorityNo.equals(rhs.priorityNo))))&&((this.length == rhs.length)||((this.length!= null)&&this.length.equals(rhs.length))))&&((this.columnCode == rhs.columnCode)||((this.columnCode!= null)&&this.columnCode.equals(rhs.columnCode))))&&((this.cmscCode == rhs.cmscCode)||((this.cmscCode!= null)&&this.cmscCode.equals(rhs.cmscCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.dataReqInd == rhs.dataReqInd)||((this.dataReqInd!= null)&&this.dataReqInd.equals(rhs.dataReqInd))));
    }

}
