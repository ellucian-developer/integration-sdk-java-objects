
package com.ellucian.generated.bpapi.ban.sevis_business_action_codes.v1_0_0;

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
    "displaySysReqInd",
    "activityDate",
    "code",
    "dbprocName",
    "desc",
    "endDate",
    "startDate",
    "userId"
})
@Generated("jsonschema2pojo")
public class SevisBusinessActionCodes100QapiPost {

    @JsonProperty("displaySysReqInd")
    private String displaySysReqInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVSVBA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVSVBA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : GTVSVBA_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVSVBA_CODE")
    private String code;
    /**
     * Package/Procedure
     * <p>
     * Lineage reference object : GTVSVBA_DBPROC_NAME
     * 
     */
    @JsonProperty("dbprocName")
    @JsonPropertyDescription("Lineage reference object : GTVSVBA_DBPROC_NAME")
    private String dbprocName;
    /**
     * Code Description
     * <p>
     * Lineage reference object : GTVSVBA_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVSVBA_DESC")
    private String desc;
    /**
     * End Date
     * <p>
     * Lineage reference object : GTVSVBA_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : GTVSVBA_END_DATE")
    private Date endDate;
    /**
     * Start Date
     * <p>
     * Lineage reference object : GTVSVBA_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : GTVSVBA_START_DATE")
    private Date startDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : GTVSVBA_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GTVSVBA_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displaySysReqInd")
    public String getDisplaySysReqInd() {
        return displaySysReqInd;
    }

    @JsonProperty("displaySysReqInd")
    public void setDisplaySysReqInd(String displaySysReqInd) {
        this.displaySysReqInd = displaySysReqInd;
    }

    public SevisBusinessActionCodes100QapiPost withDisplaySysReqInd(String displaySysReqInd) {
        this.displaySysReqInd = displaySysReqInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVSVBA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVSVBA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public SevisBusinessActionCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : GTVSVBA_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : GTVSVBA_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public SevisBusinessActionCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Package/Procedure
     * <p>
     * Lineage reference object : GTVSVBA_DBPROC_NAME
     * 
     */
    @JsonProperty("dbprocName")
    public String getDbprocName() {
        return dbprocName;
    }

    /**
     * Package/Procedure
     * <p>
     * Lineage reference object : GTVSVBA_DBPROC_NAME
     * 
     */
    @JsonProperty("dbprocName")
    public void setDbprocName(String dbprocName) {
        this.dbprocName = dbprocName;
    }

    public SevisBusinessActionCodes100QapiPost withDbprocName(String dbprocName) {
        this.dbprocName = dbprocName;
        return this;
    }

    /**
     * Code Description
     * <p>
     * Lineage reference object : GTVSVBA_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Code Description
     * <p>
     * Lineage reference object : GTVSVBA_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SevisBusinessActionCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : GTVSVBA_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : GTVSVBA_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public SevisBusinessActionCodes100QapiPost withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : GTVSVBA_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : GTVSVBA_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public SevisBusinessActionCodes100QapiPost withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GTVSVBA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GTVSVBA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SevisBusinessActionCodes100QapiPost withUserId(String userId) {
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

    public SevisBusinessActionCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SevisBusinessActionCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displaySysReqInd");
        sb.append('=');
        sb.append(((this.displaySysReqInd == null)?"<null>":this.displaySysReqInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("dbprocName");
        sb.append('=');
        sb.append(((this.dbprocName == null)?"<null>":this.dbprocName));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
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
        result = ((result* 31)+((this.dbprocName == null)? 0 :this.dbprocName.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.displaySysReqInd == null)? 0 :this.displaySysReqInd.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SevisBusinessActionCodes100QapiPost) == false) {
            return false;
        }
        SevisBusinessActionCodes100QapiPost rhs = ((SevisBusinessActionCodes100QapiPost) other);
        return ((((((((((this.dbprocName == rhs.dbprocName)||((this.dbprocName!= null)&&this.dbprocName.equals(rhs.dbprocName)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.displaySysReqInd == rhs.displaySysReqInd)||((this.displaySysReqInd!= null)&&this.displaySysReqInd.equals(rhs.displaySysReqInd))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
