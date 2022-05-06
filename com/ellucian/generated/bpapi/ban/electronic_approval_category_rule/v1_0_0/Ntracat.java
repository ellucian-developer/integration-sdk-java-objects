
package com.ellucian.generated.bpapi.ban.electronic_approval_category_rule.v1_0_0;

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
    "activityDate",
    "aptyEntrySeqNo",
    "typeDesc",
    "aptyCode",
    "defaultOverrideInd",
    "userId"
})
@Generated("jsonschema2pojo")
public class Ntracat {

    /**
     * Lineage reference object : NTRACAT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NTRACAT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Approval Type Entry Sequence Number
     * <p>
     * Lineage reference object : NTRACAT_APTY_ENTRY_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("aptyEntrySeqNo")
    @JsonPropertyDescription("Lineage reference object : NTRACAT_APTY_ENTRY_SEQ_NO")
    private Double aptyEntrySeqNo;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("typeDesc")
    private String typeDesc;
    /**
     * Approval Type
     * <p>
     * Lineage reference object : NTRACAT_APTY_CODE, Lookup lineage reference object : ntvapty
     * (Required)
     * 
     */
    @JsonProperty("aptyCode")
    @JsonPropertyDescription("Lineage reference object : NTRACAT_APTY_CODE, Lookup lineage reference object : ntvapty")
    private String aptyCode;
    @JsonProperty("defaultOverrideInd")
    private String defaultOverrideInd;
    /**
     * Lineage reference object : NTRACAT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NTRACAT_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : NTRACAT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : NTRACAT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ntracat withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Approval Type Entry Sequence Number
     * <p>
     * Lineage reference object : NTRACAT_APTY_ENTRY_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("aptyEntrySeqNo")
    public Double getAptyEntrySeqNo() {
        return aptyEntrySeqNo;
    }

    /**
     * Approval Type Entry Sequence Number
     * <p>
     * Lineage reference object : NTRACAT_APTY_ENTRY_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("aptyEntrySeqNo")
    public void setAptyEntrySeqNo(Double aptyEntrySeqNo) {
        this.aptyEntrySeqNo = aptyEntrySeqNo;
    }

    public Ntracat withAptyEntrySeqNo(Double aptyEntrySeqNo) {
        this.aptyEntrySeqNo = aptyEntrySeqNo;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("typeDesc")
    public String getTypeDesc() {
        return typeDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("typeDesc")
    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Ntracat withTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
        return this;
    }

    /**
     * Approval Type
     * <p>
     * Lineage reference object : NTRACAT_APTY_CODE, Lookup lineage reference object : ntvapty
     * (Required)
     * 
     */
    @JsonProperty("aptyCode")
    public String getAptyCode() {
        return aptyCode;
    }

    /**
     * Approval Type
     * <p>
     * Lineage reference object : NTRACAT_APTY_CODE, Lookup lineage reference object : ntvapty
     * (Required)
     * 
     */
    @JsonProperty("aptyCode")
    public void setAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
    }

    public Ntracat withAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
        return this;
    }

    @JsonProperty("defaultOverrideInd")
    public String getDefaultOverrideInd() {
        return defaultOverrideInd;
    }

    @JsonProperty("defaultOverrideInd")
    public void setDefaultOverrideInd(String defaultOverrideInd) {
        this.defaultOverrideInd = defaultOverrideInd;
    }

    public Ntracat withDefaultOverrideInd(String defaultOverrideInd) {
        this.defaultOverrideInd = defaultOverrideInd;
        return this;
    }

    /**
     * Lineage reference object : NTRACAT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : NTRACAT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Ntracat withUserId(String userId) {
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

    public Ntracat withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ntracat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("aptyEntrySeqNo");
        sb.append('=');
        sb.append(((this.aptyEntrySeqNo == null)?"<null>":this.aptyEntrySeqNo));
        sb.append(',');
        sb.append("typeDesc");
        sb.append('=');
        sb.append(((this.typeDesc == null)?"<null>":this.typeDesc));
        sb.append(',');
        sb.append("aptyCode");
        sb.append('=');
        sb.append(((this.aptyCode == null)?"<null>":this.aptyCode));
        sb.append(',');
        sb.append("defaultOverrideInd");
        sb.append('=');
        sb.append(((this.defaultOverrideInd == null)?"<null>":this.defaultOverrideInd));
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
        result = ((result* 31)+((this.aptyEntrySeqNo == null)? 0 :this.aptyEntrySeqNo.hashCode()));
        result = ((result* 31)+((this.typeDesc == null)? 0 :this.typeDesc.hashCode()));
        result = ((result* 31)+((this.aptyCode == null)? 0 :this.aptyCode.hashCode()));
        result = ((result* 31)+((this.defaultOverrideInd == null)? 0 :this.defaultOverrideInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ntracat) == false) {
            return false;
        }
        Ntracat rhs = ((Ntracat) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.aptyEntrySeqNo == rhs.aptyEntrySeqNo)||((this.aptyEntrySeqNo!= null)&&this.aptyEntrySeqNo.equals(rhs.aptyEntrySeqNo))))&&((this.typeDesc == rhs.typeDesc)||((this.typeDesc!= null)&&this.typeDesc.equals(rhs.typeDesc))))&&((this.aptyCode == rhs.aptyCode)||((this.aptyCode!= null)&&this.aptyCode.equals(rhs.aptyCode))))&&((this.defaultOverrideInd == rhs.defaultOverrideInd)||((this.defaultOverrideInd!= null)&&this.defaultOverrideInd.equals(rhs.defaultOverrideInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
